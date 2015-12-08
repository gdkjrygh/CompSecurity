// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.g.s;
import java.util.concurrent.Callable;
import kik.a.e.f;
import kik.a.f.f.y;
import kik.a.f.f.z;
import kik.a.f.j;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, lw, ma, mb, 
//            ProgressDialogFragment, lz

public abstract class KikIqFragmentBase extends KikScopedDialogFragment
    implements j
{

    private static final b c = org.c.c.a("KikIqFragmentBase");
    protected String P;
    protected String Q;
    protected int R;
    protected f S;
    private y a;
    private Resources b;

    public KikIqFragmentBase()
    {
        a = null;
        P = "";
        Q = "";
    }

    protected final void X()
    {
        if (a != null)
        {
            a = null;
        }
    }

    protected final p a(Callable callable, String s1)
    {
        try
        {
            callable = (p)callable.call();
            callable.a(new lw(this));
            b(s1, true);
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            return s.a(callable);
        }
        return callable;
    }

    protected void a(int i, String s1)
    {
        a(P, Q);
    }

    protected void a(String s1, String s2)
    {
        a((new KikDialogFragment.a()).a(s1).b(s2).a(true).a(b.getString(0x7f090193), null).a);
    }

    protected final void a(y y)
    {
        a = y;
        S.a(y);
    }

    protected final void a(y y, String s1, boolean flag)
    {
        a = y;
        b(s1, flag);
        S.a(y);
    }

    protected void a(z z)
    {
    }

    public final void a(z z, int i)
    {
        if (z.equals(a))
        {
            android.support.v4.app.FragmentActivity fragmentactivity1;
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            default:
                return;

            case 2: // '\002'
                android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
                if (fragmentactivity != null)
                {
                    fragmentactivity.runOnUiThread(new ma(this));
                }
                a(z);
                a = null;
                return;

            case 3: // '\003'
                fragmentactivity1 = getActivity();
                break;
            }
            if (b(z) && fragmentactivity1 != null)
            {
                fragmentactivity1.runOnUiThread(new mb(this, z));
                return;
            } else
            {
                w();
                return;
            }
        } else
        {
            (new StringBuilder("Dropping unexpected iq: ")).append(z);
            return;
        }
    }

    protected void b(String s1, boolean flag)
    {
        s1 = new ProgressDialogFragment(s1, flag);
        s1.a(new lz(this));
        a(s1);
    }

    protected boolean b(z z)
    {
        return true;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        b = activity.getResources();
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        P = getString(0x7f0902ba);
        Q = getString(0x7f090383);
    }

    protected void w()
    {
        a(((KikDialogFragment) (null)));
    }

}
