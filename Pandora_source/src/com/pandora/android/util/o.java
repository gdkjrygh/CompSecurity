// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.view.View;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.bv.a;
import p.cw.c;

public class o
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/android/util/o$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("CUSTOM_CONTENT_STATION_REPLAY", 0);
            b = new a("STATION_EXPIRED", 1);
            c = new a("TRACK_UNAVAILABLE", 2);
            d = new a("CUSTOM_MESSAGE", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private y a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;

    public o(View view)
    {
        a = null;
        b = view;
    }

    private View a(int i)
    {
        return b.findViewById(i);
    }

    static y a(o o1)
    {
        return o1.a;
    }

    private void a(a a1)
    {
        if (a == null)
        {
            return;
        }
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.pandora.android.util.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.pandora.android.util.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.util.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.util._cls2.a[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b.a.b().o().a("replay_message_shown", a.c());
            return;

        case 2: // '\002'
            b.a.b().o().a("expired_message_shown", a.c());
            break;
        }
    }

    private void a(String s)
    {
        ((TextView)a(0x7f1001ca)).setText(s);
    }

    private View b(a a1)
    {
        switch (com.pandora.android.util._cls2.a[a1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            if (c == null)
            {
                c = a(0x7f1001c5);
                c.findViewById(0x7f1001c6).setOnClickListener(new android.view.View.OnClickListener() {

                    final o a;

                    public void onClick(View view)
                    {
                        if (com.pandora.android.util.o.a(a) == null)
                        {
                            return;
                        } else
                        {
                            com.pandora.android.activity.a.a(com.pandora.android.util.o.a(a), null, true, false, p.cw.b.b.b, null);
                            b.a.b().o().a("replay_click", com.pandora.android.util.o.a(a).c());
                            return;
                        }
                    }

            
            {
                a = o.this;
                super();
            }
                });
            }
            return c;

        case 3: // '\003'
            if (e == null)
            {
                e = a(0x7f1001c7);
            }
            return e;

        case 2: // '\002'
            if (d == null)
            {
                d = a(0x7f1001c8);
            }
            return d;

        case 4: // '\004'
            break;
        }
        if (f == null)
        {
            f = a(0x7f1001c9);
        }
        return f;
    }

    public o a(y y1)
    {
        a = y1;
        return this;
    }

    public void a(a a1, boolean flag)
    {
        if (b == null)
        {
            return;
        }
        a aa[] = a.values();
        int j = aa.length;
        int i = 0;
        while (i < j) 
        {
            Object obj = aa[i];
            if (obj == a1)
            {
                continue;
            }
            obj = b(((a) (obj)));
            if (((View) (obj)).getVisibility() != 8)
            {
                if (flag)
                {
                    p.bv.a.a(((View) (obj)));
                } else
                {
                    ((View) (obj)).setVisibility(8);
                }
            }
            i++;
        }
        if (flag)
        {
            p.bv.a.b(b(a1));
        } else
        {
            b(a1).setVisibility(0);
        }
        a(a1);
    }

    public void a(String s, boolean flag)
    {
        a(s);
        a(a.d, flag);
    }

    public void a(boolean flag)
    {
        a aa[] = a.values();
        int j = aa.length;
        int i = 0;
        while (i < j) 
        {
            View view = b(aa[i]);
            if (view.getVisibility() != 8)
            {
                if (flag)
                {
                    p.bv.a.a(view);
                } else
                {
                    view.setVisibility(8);
                }
            }
            i++;
        }
    }
}
