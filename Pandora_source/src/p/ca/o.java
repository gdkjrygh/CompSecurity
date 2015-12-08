// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.activity.ModalPresenterActivity;

// Referenced classes of package p.ca:
//            l

public abstract class o extends l
{
    static interface a
    {

        public abstract android.content.DialogInterface.OnShowListener a();

        public abstract void a(int i);

        public abstract android.content.DialogInterface.OnDismissListener b();
    }

    class b
        implements a
    {

        final o a;
        private boolean b;
        private boolean c;
        private int d;

        static boolean a(b b1)
        {
            return b1.b;
        }

        static boolean a(b b1, boolean flag)
        {
            b1.c = flag;
            return flag;
        }

        static int b(b b1)
        {
            return b1.d;
        }

        public android.content.DialogInterface.OnShowListener a()
        {
            return new android.content.DialogInterface.OnShowListener(this) {

                final b a;

                public void onShow(DialogInterface dialoginterface)
                {
                    b.a(a, true);
                }

            
            {
                a = b1;
                super();
            }
            };
        }

        public void a(int i)
        {
            b = true;
            d = i;
            if (c)
            {
                return;
            } else
            {
                a.a(i);
                return;
            }
        }

        public android.content.DialogInterface.OnDismissListener b()
        {
            return new android.content.DialogInterface.OnDismissListener(this) {

                final b a;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    if (b.a(a))
                    {
                        a.a.a(b.b(a));
                    }
                    b.a(a, false);
                }

            
            {
                a = b1;
                super();
            }
            };
        }

        b()
        {
            a = o.this;
            super();
        }
    }


    protected View j;
    protected a k;

    public o()
    {
    }

    public void a(int i)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.setResult(i);
            fragmentactivity.finish();
        }
    }

    public void a(View view)
    {
    }

    public boolean a()
    {
        return false;
    }

    protected View b(int i)
    {
        if (j != null)
        {
            return j.findViewById(i);
        } else
        {
            return null;
        }
    }

    public boolean e_()
    {
        return true;
    }

    public boolean f_()
    {
        return true;
    }

    public ViewGroup j()
    {
        return null;
    }

    public int k()
    {
        return 0;
    }

    public ViewGroup l()
    {
        View view;
        if (getView() == null)
        {
            view = null;
        } else
        {
            view = getView().findViewById(k());
        }
        return (ViewGroup)(ViewGroup)view;
    }

    public int l_()
    {
        return -1;
    }

    public String m()
    {
        return null;
    }

    public boolean n()
    {
        return true;
    }

    public boolean o()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = new b();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (getActivity() instanceof ModalPresenterActivity)
        {
            ((ModalPresenterActivity)getActivity()).r();
        }
    }
}
