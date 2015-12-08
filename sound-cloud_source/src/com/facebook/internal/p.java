// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.s;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.internal:
//            Y, U, o, a

public abstract class p
{
    protected abstract class a
    {

        final p a;

        public Object a()
        {
            return p.a;
        }

        public abstract boolean a(Object obj);

        public abstract com.facebook.internal.a b(Object obj);

        public a()
        {
            a = p.this;
            super();
        }
    }


    protected static final Object a = new Object();
    public int b;
    private final Activity c;
    private final Fragment d;
    private List e;

    public p(Activity activity, int i)
    {
        Y.a(activity, "activity");
        c = activity;
        d = null;
        b = i;
    }

    public p(Fragment fragment, int i)
    {
        Y.a(fragment, "fragment");
        d = fragment;
        c = null;
        b = i;
        if (fragment.getActivity() == null)
        {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        } else
        {
            return;
        }
    }

    private com.facebook.internal.a a(Object obj, Object obj1)
    {
        Iterator iterator;
        a a1;
        boolean flag;
        if (obj1 == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == null)
        {
            e = b();
        }
        iterator = e.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a1 = (a)iterator.next();
        if (!flag && !U.a(a1.a(), obj1) || !a1.a(obj))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        try
        {
            obj = a1.b(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = c();
            o.a(((com.facebook.internal.a) (obj)), ((com.facebook.p) (obj1)));
        }
_L4:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = c();
            o.a(((com.facebook.internal.a) (obj1)), new com.facebook.p("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
        }
        return ((com.facebook.internal.a) (obj1));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Activity a()
    {
        if (c != null)
        {
            return c;
        }
        if (d != null)
        {
            return d.getActivity();
        } else
        {
            return null;
        }
    }

    public final void a(Object obj)
    {
        obj = a(obj, a);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (d == null) goto _L4; else goto _L3
_L3:
        d.startActivityForResult(((com.facebook.internal.a) (obj)).b, ((com.facebook.internal.a) (obj)).c);
        com.facebook.internal.a.a(((com.facebook.internal.a) (obj)));
_L6:
        return;
_L4:
        c.startActivityForResult(((com.facebook.internal.a) (obj)).b, ((com.facebook.internal.a) (obj)).c);
        com.facebook.internal.a.a(((com.facebook.internal.a) (obj)));
        return;
_L2:
        if (s.b())
        {
            throw new IllegalStateException("No code path should ever result in a null appCall");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public abstract List b();

    public abstract com.facebook.internal.a c();

}
