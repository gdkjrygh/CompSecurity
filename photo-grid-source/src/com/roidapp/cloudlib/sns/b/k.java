// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.sns.basepost.PostCommentsTextView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

// Referenced classes of package com.roidapp.cloudlib.sns.b:
//            j, m, l

public final class k
    implements s, Runnable
{

    private WeakReference a;
    private WeakReference b;
    private String c;
    private String d;
    private WeakReference e;

    private k(PostCommentsTextView postcommentstextview)
    {
        a = new WeakReference(postcommentstextview);
    }

    public static void a()
    {
        j.a().b();
    }

    public static void a(PostCommentsTextView postcommentstextview, String s1, m m1)
    {
        if (postcommentstextview == null || s1 == null)
        {
            return;
        }
        Object obj = j.a().a(s1);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            m1.a(postcommentstextview, ((String) (obj)));
            return;
        }
        m1.a(postcommentstextview, null);
        obj = new k(postcommentstextview);
        if (postcommentstextview.getTag(ar.cq) instanceof k)
        {
            Object obj1 = (k)postcommentstextview.getTag(ar.cq);
            if (((k) (obj1)).b != null)
            {
                obj1 = (r)((k) (obj1)).b.get();
                if (obj1 != null)
                {
                    ((r) (obj1)).f();
                }
            }
        }
        postcommentstextview.setTag(ar.cq, obj);
        obj.d = s1;
        obj.e = new WeakReference(m1);
        postcommentstextview = new l(((k) (obj)), s1, ((s) (obj)));
        obj.b = new WeakReference(postcommentstextview);
        c.SERIAL_EXECUTOR.execute(postcommentstextview);
    }

    public final void a(int i, Exception exception)
    {
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        if (d != null)
        {
            j.a().a(d, ((String) (obj)));
        }
        if (obj != null && a != null)
        {
            Object obj1 = (PostCommentsTextView)a.get();
            if (obj1 != null)
            {
                obj1 = ((PostCommentsTextView) (obj1)).getContext();
                if (obj1 != null)
                {
                    c = ((String) (obj));
                    (new Handler(((Context) (obj1)).getMainLooper())).post(this);
                }
            }
        }
    }

    public final void run()
    {
        if (c != null && a != null)
        {
            PostCommentsTextView postcommentstextview = (PostCommentsTextView)a.get();
            if (postcommentstextview != null && postcommentstextview.getTag(ar.cq) == this)
            {
                if (e != null)
                {
                    m m1 = (m)e.get();
                    if (m1 != null)
                    {
                        m1.a(postcommentstextview, c);
                    }
                }
                c = null;
            }
        }
    }
}
