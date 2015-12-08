// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.fitbit.data.domain.device.TrackerType;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            TrackerListItem, NoTrackerListItem

class TrackerListAdapter extends ArrayAdapter
{
    private static final class ViewType extends Enum
    {

        public static final ViewType a;
        public static final ViewType b;
        private static final ViewType c[];

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
            return (ViewType)Enum.valueOf(com/fitbit/device/ui/setup/choose/TrackerListAdapter$ViewType, s);
        }

        public static ViewType[] values()
        {
            return (ViewType[])c.clone();
        }

        static 
        {
            a = new ViewType("DEVICE", 0);
            b = new ViewType("SIGNUP", 1);
            c = (new ViewType[] {
                a, b
            });
        }

        private ViewType(String s, int i)
        {
            super(s, i);
        }
    }


    private final boolean a;

    public TrackerListAdapter(Context context, List list, boolean flag)
    {
        super(context, 0, list);
        a = flag;
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
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ViewType.b.ordinal()] = 2;
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
            return TrackerListItem.a(context);

        case 2: // '\002'
            return NoTrackerListItem.a(context);
        }
    }

    public int getCount()
    {
        int j = super.getCount();
        int i;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public int getItemViewType(int i)
    {
        if (i == getCount() - 1 && a)
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
            viewgroup = (TrackerType)getItem(i);
            ((TrackerListItem)view).a(viewgroup);
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return ViewType.values().length;
    }
}
