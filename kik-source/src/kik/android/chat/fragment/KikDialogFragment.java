// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;
import com.kik.g.p;
import java.util.Iterator;
import java.util.Vector;

public class KikDialogFragment extends DialogFragment
{
    public static class a
    {

        KikDialogFragment a;

        public final a a(int i1)
        {
            a.a(i1);
            return this;
        }

        public final a a(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.a(i1, onclicklistener);
            return this;
        }

        public final a a(android.content.DialogInterface.OnCancelListener oncancellistener)
        {
            a.a(oncancellistener);
            return this;
        }

        public final a a(View view)
        {
            a.a(view);
            return this;
        }

        public final a a(String s1)
        {
            a.a(s1);
            return this;
        }

        public final a a(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.a(s1, onclicklistener);
            return this;
        }

        public final a a(c c1)
        {
            a.a(c1);
            return this;
        }

        public final a a(boolean flag)
        {
            a.a(flag);
            return this;
        }

        public final a a(CharSequence acharsequence[], android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.a(acharsequence, onclicklistener);
            return this;
        }

        public final KikDialogFragment a()
        {
            return a;
        }

        public final a b(int i1)
        {
            a.b(i1);
            return this;
        }

        public final a b(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.b(i1, onclicklistener);
            return this;
        }

        public final a b(String s1)
        {
            a.b(s1);
            return this;
        }

        public final a b(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.b(s1, onclicklistener);
            return this;
        }

        public final a b(boolean flag)
        {
            a.setCancelable(flag);
            return this;
        }

        public final a c(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
        {
            a.c(i1, onclicklistener);
            return this;
        }

        public a()
        {
            this(null);
        }

        public a(Resources resources)
        {
            a = new KikDialogFragment();
            KikDialogFragment.a(a, resources);
        }
    }

    final class b
    {

        final KikDialogFragment a;
        private String b;
        private android.content.DialogInterface.OnClickListener c;

        public final String a()
        {
            return b;
        }

        public final void a(android.content.DialogInterface.OnClickListener onclicklistener)
        {
            c = onclicklistener;
        }

        public final void a(String s1)
        {
            b = s1;
        }

        public final android.content.DialogInterface.OnClickListener b()
        {
            return c;
        }

        b()
        {
            a = KikDialogFragment.this;
            super();
        }
    }

    public static abstract class c
    {

        public abstract void a();

        public c()
        {
        }
    }


    private static int f = 1;
    protected String a;
    protected String b;
    protected b c;
    protected b d;
    protected b e;
    private final int g;
    private final p h = new p();
    private Resources i;
    private Vector j;
    private c k;
    private View l;
    private CharSequence m[];
    private CharSequence n[];
    private int o;
    private android.content.DialogInterface.OnClickListener p;
    private android.content.DialogInterface.OnCancelListener q;
    private boolean r;
    private int s;
    private int t;
    private p u;

    public KikDialogFragment()
    {
        j = new Vector();
        k = null;
        s = -1;
        t = -1;
        r = true;
        int i1 = f;
        f = i1 + 1;
        g = i1;
        u = new p();
    }

    private static void a(TextView textview)
    {
        if (textview != null)
        {
            Linkify.addLinks(textview, 15);
            textview.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    static void a(KikDialogFragment kikdialogfragment, Resources resources)
    {
        kikdialogfragment.i = resources;
    }

    private void e()
    {
        if (k != null)
        {
            k.a();
        }
        k = null;
        h.a(null);
    }

    private void f()
    {
        if (u != null)
        {
            u.e();
            u = null;
        }
    }

    public final void a()
    {
        s = 0x7f0e00f1;
    }

    public final void a(int i1)
    {
        if (i == null)
        {
            throw new IllegalStateException("Please dialog must be initialized with resource to use resource identifiers");
        } else
        {
            a = i.getString(i1);
            return;
        }
    }

    public final void a(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (i == null)
        {
            throw new IllegalStateException("Please dialog must be initialized with resource to use resource identifiers");
        } else
        {
            a(i.getString(i1), onclicklistener);
            return;
        }
    }

    public void a(android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        q = oncancellistener;
    }

    public final void a(View view)
    {
        l = view;
    }

    public final void a(String s1)
    {
        a = s1;
    }

    public final void a(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        c = new b();
        c.a(onclicklistener);
        c.a(s1);
    }

    public final void a(c c1)
    {
        k = c1;
    }

    public final void a(boolean flag)
    {
        super.setCancelable(flag);
        r = flag;
    }

    public final void a(CharSequence acharsequence[], android.content.DialogInterface.OnClickListener onclicklistener)
    {
        m = acharsequence;
        p = onclicklistener;
    }

    public final void b()
    {
        t = 0x102000b;
    }

    public final void b(int i1)
    {
        if (i == null)
        {
            throw new IllegalStateException("Please dialog must be initialized with resource to use resource identifiers");
        } else
        {
            b = i.getString(i1);
            return;
        }
    }

    public final void b(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (i == null)
        {
            throw new IllegalStateException("Please dialog must be initialized with resource to use resource identifiers");
        } else
        {
            b(i.getString(i1), onclicklistener);
            return;
        }
    }

    public final void b(String s1)
    {
        b = s1;
    }

    public final void b(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        d = new b();
        d.a(onclicklistener);
        d.a(s1);
    }

    public final void b(CharSequence acharsequence[], android.content.DialogInterface.OnClickListener onclicklistener)
    {
        n = acharsequence;
        o = -1;
        p = onclicklistener;
    }

    public final int c()
    {
        return g;
    }

    public final void c(int i1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        if (i == null)
        {
            throw new IllegalStateException("Please dialog must be initialized with resource to use resource identifiers");
        } else
        {
            c(i.getString(i1), onclicklistener);
            return;
        }
    }

    public final void c(String s1, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        e = new b();
        e.a(onclicklistener);
        e.a(s1);
    }

    public final p d()
    {
        return h;
    }

    public void dismiss()
    {
        f();
        super.dismiss();
    }

    public void dismissAllowingStateLoss()
    {
        f();
        if (getFragmentManager() != null)
        {
            super.dismissAllowingStateLoss();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        h.a(null);
        if (q != null)
        {
            q.onCancel(dialoginterface);
        }
        super.onCancel(dialoginterface);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        if (a != null)
        {
            bundle.setTitle(a);
        }
        if (b != null)
        {
            bundle.setMessage(b);
        }
        if (l != null)
        {
            bundle.setView(l);
        }
        if (c != null)
        {
            bundle.setPositiveButton(c.a(), c.b());
        }
        if (d != null)
        {
            bundle.setNegativeButton(d.a(), d.b());
        }
        if (e != null)
        {
            bundle.setNeutralButton(e.a(), e.b());
        }
        if (m != null)
        {
            bundle.setItems(m, p);
        }
        if (n != null)
        {
            bundle.setSingleChoiceItems(n, o, p);
        }
        bundle.setCancelable(r);
        bundle = bundle.create();
        if (bundle != null)
        {
            bundle.setCanceledOnTouchOutside(r);
        }
        if (s != -1 && l != null)
        {
            a((TextView)l.findViewById(s));
        }
        return bundle;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (getDialog() == null)
        {
            e();
        }
        f();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        e();
        super.onDismiss(dialoginterface);
    }

    public void onResume()
    {
        super.onResume();
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        j.clear();
        if (h.g())
        {
            dismiss();
        }
    }

    public void onStart()
    {
        super.onStart();
        if (t != -1)
        {
            a((TextView)getDialog().findViewById(t));
        }
    }

}
