// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class fom
{

    public String a;
    private Fragment b;
    private foo c;
    private View d;
    private View e;
    private String f;

    public fom(Fragment fragment, foo foo1, View view)
    {
        b = fragment;
        c = foo1;
        d = view;
    }

    public final void a(Bundle bundle)
    {
label0:
        {
            String s = null;
            if (a())
            {
                ViewGroup viewgroup = (ViewGroup)d.findViewById(0x7f110402);
                View view = new View(b.k());
                view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(dft.a(1.0F, b.k().getResources()), -1));
                TypedArray typedarray = b.k().obtainStyledAttributes(new int[] {
                    0x7f0101cf
                });
                int i = typedarray.getResourceId(0, 0);
                typedarray.recycle();
                view.setBackgroundResource(i);
                viewgroup.addView(view);
                e = new FrameLayout(b.k());
                e.setId(0x7f110050);
                i = b.l().getInteger(0x7f0e0006);
                e.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, i));
                viewgroup.addView(e);
            }
            Object obj = b.g();
            if (obj != null)
            {
                s = ((Bundle) (obj)).getString("sub_fragment_uri");
                obj = ((Bundle) (obj)).getString("sub_fragment_name");
            } else
            {
                obj = null;
            }
            if (bundle != null)
            {
                obj = bundle.getString("sub_fragment_uri");
                s = bundle.getString("sub_fragment_name");
                bundle = ((Bundle) (obj));
                obj = s;
            } else
            {
                bundle = s;
            }
            if (bundle != null)
            {
                boolean flag;
                if (b.n().a("sub_fragment") != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                f = bundle;
                a = ((String) (obj));
            }
            return;
        }
        a(((String) (bundle)), ((String) (obj)), false);
    }

    public final void a(Menu menu)
    {
        Fragment fragment;
        if (a())
        {
            if ((fragment = b.n().a("sub_fragment")) instanceof fon)
            {
                ((fon)fragment).b(menu);
                return;
            }
        }
    }

    public final void a(String s, String s1, boolean flag)
    {
label0:
        {
label1:
            {
                if (!TextUtils.equals(f, s))
                {
                    f = s;
                    a = s1;
                    if (a())
                    {
                        c.a(s);
                        if (f != null)
                        {
                            s = c.a(f, a);
                            if (s == null)
                            {
                                break label0;
                            }
                            s1 = b.n().a();
                            s1.b(0x7f110050, s, "sub_fragment");
                            if (!flag)
                            {
                                break label1;
                            }
                            s1.d();
                        }
                    }
                }
                return;
            }
            s1.c();
            return;
        }
        s = b.n().a("sub_fragment");
        s1 = b.n().a();
        s1.a(s);
        if (flag)
        {
            s1.d();
            return;
        } else
        {
            s1.c();
            return;
        }
    }

    public final void a(boolean flag)
    {
        if (e != null)
        {
            View view = e;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final boolean a()
    {
        u u1 = b.k();
        return ggi.c(u1) && ggi.b(u1);
    }

    public final void b(Bundle bundle)
    {
        bundle.putString("sub_fragment_uri", f);
        bundle.putString("sub_fragment_name", a);
    }

    public final boolean b()
    {
        return a() && f == null;
    }
}
