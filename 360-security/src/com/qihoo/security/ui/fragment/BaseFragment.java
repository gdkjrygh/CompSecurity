// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import com.qihoo.security.locale.d;
import com.qihoo.security.ui.fragment.utils.FragmentAction;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

public abstract class BaseFragment extends Fragment
{
    protected static final class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            if (a != null && a.get() != null && message != null)
            {
                ((BaseFragment)a.get()).a(message);
            }
        }

        public a(BaseFragment basefragment)
        {
            a = new WeakReference(basefragment);
        }
    }

    public static interface b
    {

        public abstract void a(FragmentAction fragmentaction, Bundle bundle);
    }


    protected Context d;
    protected b e;
    protected d f;
    protected Object g;
    protected a h;
    protected boolean i;

    public BaseFragment()
    {
        i = false;
    }

    protected void a(Message message)
    {
    }

    protected void a(f f1)
    {
        try
        {
            f1.getClass().getMethod("noteStateNotSaved", new Class[0]).invoke(f1, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            return;
        }
    }

    protected boolean e()
    {
        return getActivity() != null && !getActivity().isFinishing();
    }

    protected boolean f()
    {
        return e() && i;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            e = (b)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement onFragmentChangedListener").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            g = bundle.getSerializable("ms_fragment_data");
        }
        d = getActivity().getApplicationContext();
        f = com.qihoo.security.locale.d.a();
        h = new a(this);
    }

    public void onDestroy()
    {
        h.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void onStart()
    {
        super.onStart();
        i = true;
    }

    public void onStop()
    {
        super.onStop();
        i = false;
    }
}
