// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import dft;
import dfz;
import dhu;
import dhv;
import dib;
import erl;
import erm;
import ern;
import erq;
import gcg;
import gci;
import ggi;
import java.util.ArrayList;
import java.util.List;

public final class DeviceAdapterMk2 extends BaseAdapter
{

    public List a;
    public boolean b;
    public ConnectDevice c;
    public boolean d;
    private final Context e;
    private final erq f;
    private final ern g;
    private erm h;

    public DeviceAdapterMk2(Context context)
    {
        a = new ArrayList(0);
        h = new erm() {

            private DeviceAdapterMk2 a;

            public final void a()
            {
                DeviceAdapterMk2.a(a);
            }

            
            {
                a = DeviceAdapterMk2.this;
                super();
            }
        };
        e = context;
        f = new erq(e, dft.a(e.getResources()), 0x7f0f018c);
        g = new ern(context);
    }

    private String a()
    {
        Context context = e;
        int i;
        if (ggi.c(e))
        {
            i = 0x7f0801ed;
        } else
        {
            i = 0x7f0801e1;
        }
        return context.getString(i);
    }

    private static boolean a(ConnectDevice connectdevice)
    {
        return Tech.a(connectdevice) == Tech.b;
    }

    static boolean a(DeviceAdapterMk2 deviceadaptermk2)
    {
        deviceadaptermk2.d = true;
        return true;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((ConnectDevice)a.get(i)).b.hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        ConnectDevice connectdevice;
        Context context;
        Object obj1;
        TextView textview;
        view = (erl)view;
        obj = view;
        if (view == null)
        {
            obj = new erl(viewgroup.getContext());
            view = dhv.e(viewgroup.getContext(), null);
            view.e(true);
            ((dib)view.u()).b().setTextColor(gcg.c(e, 0x7f0f018c));
            if (((erl) (obj)).a != null)
            {
                ((erl) (obj)).removeView(((erl) (obj)).a.v());
            }
            obj.a = view;
            ((erl) (obj)).addView(view.v());
        }
        connectdevice = (ConnectDevice)a.get(i);
        context = e;
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[SubtitleIconType.values().length];
                try
                {
                    a[SubtitleIconType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[SubtitleIconType.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[SubtitleIconType.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[SubtitleIconType.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[SubtitleIconType.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (connectdevice.equals(c) && !d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        view = ((erl) (obj)).a;
        obj1 = (dib)view.u();
        ((erl) (obj)).setTag(connectdevice);
        view.b(connectdevice.g);
        view.c(connectdevice.e);
        if (connectdevice.e)
        {
            view = e.getString(0x7f0801bf);
        } else
        if (connectdevice.f)
        {
            view = a();
        } else
        {
            view = connectdevice.d;
        }
        ((dib) (obj1)).a(view);
        if (connectdevice.f && !connectdevice.e)
        {
            ((dib) (obj1)).b().setVisibility(8);
        } else
        {
            ((dib) (obj1)).b().setVisibility(0);
        }
        view = connectdevice.o;
        if (view == com.spotify.mobile.android.service.ConnectDevice.DeviceState.a)
        {
            view = e.getString(0x7f0801bb);
        } else
        if (view == com.spotify.mobile.android.service.ConnectDevice.DeviceState.c)
        {
            view = e.getString(0x7f0801c3);
        } else
        if (view == com.spotify.mobile.android.service.ConnectDevice.DeviceState.e)
        {
            view = e.getString(0x7f0801c0);
        } else
        if (view == com.spotify.mobile.android.service.ConnectDevice.DeviceState.b)
        {
            view = e.getString(0x7f0801bd);
        } else
        if (view == com.spotify.mobile.android.service.ConnectDevice.DeviceState.f)
        {
            view = e.getString(0x7f0801c5);
        } else
        {
            view = a();
            if (!connectdevice.f)
            {
                if (connectdevice.e)
                {
                    view = connectdevice.d;
                } else
                {
                    int j;
                    if (a(connectdevice))
                    {
                        j = 0x7f0801c1;
                    } else
                    {
                        j = 0x7f0801c2;
                    }
                    view = e.getString(j);
                }
            }
        }
        ((dib) (obj1)).b(view);
        textview = ((dib) (obj1)).b();
        if (connectdevice.f || connectdevice.o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.c || connectdevice.o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.e || connectdevice.o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.b || connectdevice.o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.f)
        {
            view = SubtitleIconType.a;
        } else
        if (a(connectdevice))
        {
            boolean flag;
            if (connectdevice.o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = SubtitleIconType.e;
            } else
            if (connectdevice.e)
            {
                view = SubtitleIconType.d;
            } else
            {
                view = SubtitleIconType.c;
            }
        } else
        {
            view = SubtitleIconType.b;
        }
        if (view.equals((SubtitleIconType)textview.getTag(0x7f110025))) goto _L2; else goto _L1
_L1:
        _cls2.a[view.ordinal()];
        JVM INSTR tableswitch 1 5: default 392
    //                   1 677
    //                   2 855
    //                   3 868
    //                   4 879
    //                   5 890;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        throw new IllegalArgumentException((new StringBuilder("Unknown icon type: ")).append(view).toString());
_L4:
        viewgroup = null;
_L10:
        textview.setCompoundDrawablesWithIntrinsicBounds(viewgroup, null, null, null);
        textview.setTag(0x7f110025, view);
_L2:
        int k = (int)TypedValue.applyDimension(1, 12F, e.getResources().getDisplayMetrics());
        ((dib) (obj1)).d().setPadding(k, k, k, k);
        view = ((dib) (obj1)).d();
        viewgroup = g;
        obj1 = connectdevice.r;
        obj1 = new dfz(((ern) (viewgroup)).a, ((com.spotify.android.paste.graphics.SpotifyIcon) (obj1)));
        ((dfz) (obj1)).a(gcg.c(((ern) (viewgroup)).a, 0x7f0f0185));
        view.setImageDrawable(((android.graphics.drawable.Drawable) (obj1)));
        if (i != 0)
        {
            ((erl) (obj)).a(String.format(context.getString(0x7f0801e0), new Object[] {
                context.getString(gci.a(connectdevice.l))
            }));
        } else
        {
            ((erl) (obj)).a(null);
        }
        obj.b = h;
        if (b)
        {
            ((erl) (obj)).setEnabled(false);
        }
        return ((View) (obj));
_L5:
        viewgroup = f.a(textview);
        continue; /* Loop/switch isn't completed */
_L6:
        viewgroup = f.c();
        continue; /* Loop/switch isn't completed */
_L7:
        viewgroup = f.b();
        continue; /* Loop/switch isn't completed */
_L8:
        viewgroup = f.a();
        if (true) goto _L10; else goto _L9
_L9:
    }

    private class SubtitleIconType extends Enum
    {

        public static final SubtitleIconType a;
        public static final SubtitleIconType b;
        public static final SubtitleIconType c;
        public static final SubtitleIconType d;
        public static final SubtitleIconType e;
        private static final SubtitleIconType f[];

        public static SubtitleIconType valueOf(String s)
        {
            return (SubtitleIconType)Enum.valueOf(com/spotify/mobile/android/spotlets/connect/view/DeviceAdapterMk2$SubtitleIconType, s);
        }

        public static SubtitleIconType[] values()
        {
            return (SubtitleIconType[])f.clone();
        }

        static 
        {
            a = new SubtitleIconType("NONE", 0);
            b = new SubtitleIconType("CONNECT", 1);
            c = new SubtitleIconType("CAST_DISCONNECTED", 2);
            d = new SubtitleIconType("CAST_CONNECTED", 3);
            e = new SubtitleIconType("CAST_CONNECTING", 4);
            f = (new SubtitleIconType[] {
                a, b, c, d, e
            });
        }

        private SubtitleIconType(String s, int i)
        {
            super(s, i);
        }
    }

}
