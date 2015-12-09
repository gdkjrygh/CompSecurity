// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.util.p;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ReplaceDeviceView, ReplaceMotionbitView, AddDeviceView

class ReplaceDeviceAdapter extends ArrayAdapter
{
    private static final class ViewType extends Enum
    {

        public static final ViewType a;
        public static final ViewType b;
        public static final ViewType c;
        private static final ViewType d[];

        static ViewType a(int i)
        {
            ViewType aviewtype[] = values();
            if (i < aviewtype.length)
            {
                return aviewtype[i];
            } else
            {
                return null;
            }
        }

        public static ViewType valueOf(String s)
        {
            return (ViewType)Enum.valueOf(com/fitbit/device/ui/setup/replace/ReplaceDeviceAdapter$ViewType, s);
        }

        public static ViewType[] values()
        {
            return (ViewType[])d.clone();
        }

        static 
        {
            a = new ViewType("DEVICE", 0);
            b = new ViewType("MOTIONBIT", 1);
            c = new ViewType("ADD_NEW", 2);
            d = (new ViewType[] {
                a, b, c
            });
        }

        private ViewType(String s, int i)
        {
            super(s, i);
        }
    }


    private final List a;

    public ReplaceDeviceAdapter(Context context, List list)
    {
        super(context, 0, p.d());
        a = list;
    }

    private static View a(Context context, ViewType viewtype)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ViewType.values().length];
                try
                {
                    a[ViewType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ViewType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ViewType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[viewtype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return ReplaceDeviceView.a(context);

        case 2: // '\002'
            return ReplaceMotionbitView.a(context);

        case 3: // '\003'
            return AddDeviceView.a(context);
        }
    }

    private TrackerType a(Device device)
    {
label0:
        {
            if (device == null || a == null)
            {
                break label0;
            }
            Iterator iterator = a.iterator();
            TrackerType trackertype;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                trackertype = (TrackerType)iterator.next();
            } while (!trackertype.a().equalsIgnoreCase(device.j()));
            return trackertype;
        }
        return null;
    }

    public int getCount()
    {
        return super.getCount() + 1;
    }

    public int getItemViewType(int i)
    {
        int j = getCount();
        if (i == j - 1)
        {
            return ViewType.c.ordinal();
        }
        if (i < j && ((Device)getItem(i)).h() == DeviceVersion.MOTIONBIT)
        {
            return ViewType.b.ordinal();
        } else
        {
            return ViewType.a.ordinal();
        }
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ViewType viewtype = ViewType.a(getItemViewType(i));
        if (view == null)
        {
            view = a(viewgroup.getContext(), viewtype);
        }
        if (viewtype == ViewType.a)
        {
            ((ReplaceDeviceView)view).a(a((Device)getItem(i)));
        } else
        if (viewtype == ViewType.b)
        {
            viewgroup = (Device)getItem(i);
            ((ReplaceMotionbitView)view).a(viewgroup);
            return view;
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return ViewType.values().length;
    }
}
