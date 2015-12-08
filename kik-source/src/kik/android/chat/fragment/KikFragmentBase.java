// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.kik.g.f;
import com.kik.g.p;
import com.kik.ui.fragment.FragmentBase;
import java.util.Iterator;
import java.util.Vector;
import kik.android.chat.a;
import kik.android.chat.activity.k;
import kik.android.util.an;
import kik.android.util.bx;
import kik.android.util.cq;
import kik.android.util.cy;

public abstract class KikFragmentBase extends FragmentBase
{
    private final class a
        implements Runnable
    {

        final KikFragmentBase a;
        private final Runnable b;

        public final void run()
        {
            if (a.getActivity() != null)
            {
                b.run();
            }
        }

        public a(Runnable runnable)
        {
            a = KikFragmentBase.this;
            super();
            b = runnable;
        }
    }


    private Vector a;
    private f b;
    private f c;

    public KikFragmentBase()
    {
        a = new Vector();
        b = new f();
        c = new f();
    }

    protected final f U()
    {
        return c;
    }

    public final com.kik.e.a V()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            return ((kik.android.chat.a)fragmentactivity.getApplication()).a();
        } else
        {
            bx.a(new NullPointerException("Activity was null when fetching core component"));
            return null;
        }
    }

    protected final void W()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && fragmentactivity.getCurrentFocus() != null)
        {
            ((InputMethodManager)fragmentactivity.getSystemService("input_method")).hideSoftInputFromWindow(fragmentactivity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public final p a(an an)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            return k.a(an, fragmentactivity).f();
        } else
        {
            an = new p();
            an.a(new Exception("Unable to start fragment: no activity attached"));
            return an;
        }
    }

    protected void a(f f1)
    {
    }

    public final void a(Runnable runnable)
    {
        a.addElement(runnable);
    }

    protected abstract void a(String s, String s1);

    protected void b(f f1)
    {
    }

    public final void b(Runnable runnable)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.runOnUiThread(new a(runnable));
        }
    }

    protected final void d(int i)
    {
        a(cq.a(), cy.a(i));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b(c);
    }

    public void onDestroy()
    {
        super.onDestroy();
        c.a();
    }

    public void onPause()
    {
        super.onPause();
        b.a();
    }

    public void onResume()
    {
        super.onResume();
        a(b);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        a.clear();
    }
}
