// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.fitbit.e.b;

public class q extends Handler
{
    public static interface a
    {

        public abstract DialogFragment a();
    }


    protected final FragmentManager a;

    public q(FragmentManager fragmentmanager)
    {
        a = fragmentmanager;
    }

    public void a(DialogFragment dialogfragment, String s)
    {
        postDelayed(new Runnable(dialogfragment, s) {

            final DialogFragment a;
            final String b;
            final q c;

            public void run()
            {
                try
                {
                    if (!a.isAdded())
                    {
                        a.show(c.a, b);
                        c.a.executePendingTransactions();
                    }
                    return;
                }
                catch (IllegalStateException illegalstateexception)
                {
                    com.fitbit.e.a.e("DialogFragmentHelper", illegalstateexception);
                }
            }

            
            {
                c = q.this;
                a = dialogfragment;
                b = s;
                super();
            }
        }, 0L);
    }

    public void a(String s)
    {
        postDelayed(new Runnable(s) {

            final String a;
            final q b;

            public void run()
            {
                DialogFragment dialogfragment;
                try
                {
                    dialogfragment = (DialogFragment)b.a.findFragmentByTag(a);
                    com.fitbit.e.b.a("DialogFragmentHelper postDismiss", new Object[0]);
                }
                catch (IllegalStateException illegalstateexception)
                {
                    com.fitbit.e.a.e("DialogFragmentHelper", illegalstateexception);
                    return;
                }
                if (dialogfragment == null)
                {
                    break MISSING_BLOCK_LABEL_46;
                }
                dialogfragment.dismiss();
                b.a.executePendingTransactions();
            }

            
            {
                b = q.this;
                a = s;
                super();
            }
        }, 0L);
    }

    public void a(String s, a a1)
    {
        a(s, a1, null);
    }

    public void a(String s, a a1, Bundle bundle)
    {
        DialogFragment dialogfragment1 = b(s);
        DialogFragment dialogfragment = dialogfragment1;
        if (dialogfragment1 == null)
        {
            dialogfragment = a1.a();
        }
        if (bundle != null)
        {
            if (dialogfragment.getArguments() != null)
            {
                dialogfragment.getArguments().putAll(bundle);
            } else
            {
                dialogfragment.setArguments(bundle);
            }
        }
        a(dialogfragment, s);
    }

    public DialogFragment b(String s)
    {
        return (DialogFragment)a.findFragmentByTag(s);
    }
}
