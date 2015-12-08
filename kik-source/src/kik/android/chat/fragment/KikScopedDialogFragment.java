// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.SparseArray;
import android.view.View;
import com.kik.e.a;
import com.kik.g.p;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.activity.FragmentWrapperActivity;
import kik.android.widget.ce;

// Referenced classes of package kik.android.chat.fragment:
//            KikFragmentBase, KikDialogFragment, pi, ph

public class KikScopedDialogFragment extends KikFragmentBase
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(kik/android/chat/fragment/KikScopedDialogFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("DialogScopeApplicationModal", 0);
            b = new a("DialogScopeFragmentModal", 1);
            c = new a("DialogScopeFragmentAttached", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class b
    {

        public KikDialogFragment a;
        public a b;

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }


    protected v T;
    private boolean a;
    private KikDialogFragment b;
    private boolean c;
    private KikDialogFragment d;
    private boolean e;
    private boolean f;
    private SparseArray g;

    public KikScopedDialogFragment()
    {
        b = null;
        c = false;
        d = null;
        e = false;
        f = false;
        g = new SparseArray();
    }

    static SparseArray a(KikScopedDialogFragment kikscopeddialogfragment)
    {
        return kikscopeddialogfragment.g;
    }

    private void c()
    {
        int j = g.size();
        for (int i = 0; i < j; i++)
        {
            ((b)g.valueAt(i)).a.dismissAllowingStateLoss();
        }

        g.clear();
    }

    protected void a(String s, String s1)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.runOnUiThread(new pi(this, fragmentactivity, s1, s));
        }
    }

    public final void a(KikDialogFragment kikdialogfragment)
    {
        KikDialogFragment kikdialogfragment1 = b;
        if (ac())
        {
            b = null;
        }
        if (kikdialogfragment1 != null)
        {
            if (kikdialogfragment1.isAdded())
            {
                if (!ac())
                {
                    c = true;
                } else
                {
                    kikdialogfragment1.dismiss();
                    kikdialogfragment1.d().a(new Exception("replace dialog"));
                }
            } else
            {
                kikdialogfragment1.d().e();
            }
        }
        if (!ac())
        {
            if (d != null)
            {
                d.d().e();
            }
            d = kikdialogfragment;
        } else
        if (kikdialogfragment != null)
        {
            b = kikdialogfragment;
            a(kikdialogfragment, a.b, "dialog");
            return;
        }
    }

    public final void a(KikDialogFragment kikdialogfragment, a a1, String s)
    {
        FragmentManager fragmentmanager = getFragmentManager();
        if (fragmentmanager == null || !ac())
        {
            return;
        }
        if (a1.equals(a.b) || a1.equals(a.c))
        {
            kikdialogfragment.d().a(new ph(this, kikdialogfragment));
            b b1 = new b((byte)0);
            b1.a = kikdialogfragment;
            b1.b = a1;
            g.append(kikdialogfragment.c(), b1);
        }
        if (kikdialogfragment.isAdded())
        {
            throw new IllegalStateException("Cannot show an already shown dialog fragment.");
        }
        if (a1.equals(a.c))
        {
            fragmentmanager.beginTransaction().add(0x7f0e00f7, kikdialogfragment, s).addToBackStack(kikdialogfragment.getClass().getCanonicalName()).commit();
            return;
        } else
        {
            kikdialogfragment.show(fragmentmanager, s);
            return;
        }
    }

    public final void ab()
    {
        a = true;
        c();
    }

    public final boolean ac()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            return false;
        }
        if (fragmentactivity instanceof FragmentWrapperActivity)
        {
            return ((FragmentWrapperActivity)fragmentactivity).d();
        } else
        {
            return e;
        }
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        super.onDestroy();
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        boolean flag;
        if (fragmentactivity == null || fragmentactivity.isFinishing())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || a)
        {
            return;
        } else
        {
            c();
            return;
        }
    }

    public void onDestroyView()
    {
        if (!a)
        {
            int k = g.size();
            SparseArray sparsearray = new SparseArray(k);
            for (int i = 0; i < k; i++)
            {
                sparsearray.put(g.keyAt(i), g.valueAt(i));
            }

            SparseArray sparsearray1 = new SparseArray();
            int j = 0;
            while (j < k) 
            {
                b b1 = (b)sparsearray.valueAt(j);
                if (a.b.equals(b1.b))
                {
                    if (ac())
                    {
                        b1.a.dismiss();
                    }
                } else
                if (a.c.equals(b1.b))
                {
                    sparsearray1.append(sparsearray.keyAt(j), b1);
                    getFragmentManager().beginTransaction().hide(b1.a).commit();
                }
                j++;
            }
            g.clear();
            g = sparsearray1;
        }
        d = null;
        c = false;
        super.onDestroyView();
    }

    public void onResume()
    {
        e = true;
        if (!c) goto _L2; else goto _L1
_L1:
        a(d);
        d = null;
        c = false;
_L4:
        super.onResume();
        if (z.a(T))
        {
            ce.a(getActivity(), this);
        }
        return;
_L2:
        if (d != null)
        {
            a(d);
            d = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        e = false;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        int j = g.size();
        for (int i = 0; i < j; i++)
        {
            view = (b)g.valueAt(i);
            if (a.c.equals(((b) (view)).b))
            {
                getFragmentManager().beginTransaction().show(((b) (view)).a).commit();
            }
        }

    }
}
