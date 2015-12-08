// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.userfeedback.android.api:
//            i, p, n, ah, 
//            z, y, c, FeedbackConnectivityReceiver, 
//            ad, ae, UserFeedbackActivity, o

public final class m
{

    static m c;
    static boolean h;
    ah a;
    String b;
    boolean d;
    boolean e;
    public ad f;
    z g;
    private AsyncTask i;
    private boolean j;

    public m()
    {
        c = this;
        h = false;
        j = false;
    }

    private AlertDialog a(Activity activity, boolean flag, boolean flag1, String s, String s1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setMessage(s1).setCancelable(false).setPositiveButton(activity.getString(i.gf_yes), new p(this, flag, flag1, s, activity)).setNegativeButton(activity.getString(i.gf_no), new n(this));
        return builder.create();
    }

    protected static void a(Activity activity)
    {
        a(activity.getWindow().peekDecorView());
    }

    private static void a(View view)
    {
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            for (int k = 0; k < view.getChildCount(); k++)
            {
                a(view.getChildAt(k));
            }

        } else
        if (view instanceof ImageView)
        {
            ((ImageView)view).setImageDrawable(null);
        }
    }

    protected final Dialog a(Activity activity, boolean flag, boolean flag1, String s)
    {
        if (s.trim().length() == 0)
        {
            if (a.l)
            {
                return a(activity, flag, flag1, s, activity.getString(i.gf_should_submit_on_empty_description));
            }
        } else
        if (g.E == "" && a.k)
        {
            return a(activity, flag, flag1, s, activity.getString(i.gf_should_submit_anonymously));
        }
        return null;
    }

    public final void a(ah ah1)
    {
        if (ah1.b != null)
        {
            Object obj = new ah(ah1.b, ah1.a, ah1.c, ah1.d, ah1.e, ah1.n, ah1.g);
            obj.h = ah1.h;
            obj.m = ah1.m;
            obj.o = ah1.o;
            if (ah1.k)
            {
                obj.k = true;
            }
            if (ah1.l)
            {
                obj.l = true;
            }
            obj.p = ah1.p;
            if (ah1.m != null)
            {
                obj.m = new y(ah1.m);
            }
            obj.j = ah1.j;
            obj.i = ah1.i;
            if (ah1.a() != null)
            {
                ((ah) (obj)).a(Bitmap.createBitmap(ah1.a()));
                if (ah1.c != null)
                {
                    ah1.c.destroyDrawingCache();
                }
            }
            String s;
            String s1;
            byte abyte0[];
            for (Iterator iterator = ah1.f.iterator(); iterator.hasNext(); ((ah) (obj)).f.add(new c(s, s1, abyte0)))
            {
                c c1 = (c)iterator.next();
                s = c1.c;
                s1 = c1.a;
                abyte0 = c1.b;
            }

            a = ((ah) (obj));
            FeedbackConnectivityReceiver.a(ah1.a);
            f = new ad(a);
            g = new z();
            i = (new ae(f, g)).execute(new Void[0]);
            obj = new Intent(ah1.b, com/google/userfeedback/android/api/UserFeedbackActivity);
            ah1.b.startActivityForResult(((Intent) (obj)), 0);
        }
    }

    protected final void a(boolean flag, boolean flag1, String s)
    {
        b(flag, flag1, s);
        g.b(true);
        (new o(this)).execute(new Void[0]);
    }

    protected final boolean a()
    {
        while (j || i.getStatus() == android.os.AsyncTask.Status.FINISHED) 
        {
            return true;
        }
        return false;
    }

    protected final void b()
    {
        try
        {
            i.get();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.getMessage();
            return;
        }
        catch (ExecutionException executionexception)
        {
            executionexception.getMessage();
        }
    }

    protected final void b(boolean flag, boolean flag1, String s)
    {
        b = s;
        if (a())
        {
            try
            {
                g.a = s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        d = flag;
        e = flag1;
    }
}
