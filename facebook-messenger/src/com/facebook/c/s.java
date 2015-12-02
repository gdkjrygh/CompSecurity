// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.Fragment;
import com.facebook.common.e.h;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.c:
//            t, o

public class s
{

    private static final String a = com/facebook/c/s.getSimpleName();
    private static final String b = a.concat("_no_activities");
    private static final String c = a.concat("_multiple_activities");
    private static final String d = a.concat("_mismatched_resolve");
    private final String e;
    private final t f;
    private final h g;
    private final Set h;

    public s(String s1, t t1, h h1, Set set)
    {
        e = (String)Preconditions.checkNotNull(s1);
        f = (t)Preconditions.checkNotNull(t1);
        g = (h)Preconditions.checkNotNull(h1);
        h = (Set)Preconditions.checkNotNull(set);
    }

    private void a(String s1, String s2, Intent intent)
    {
        s2 = (new StringBuilder()).append(s2).append(" (intent:");
        if (intent.getAction() != null)
        {
            s2.append(" action=").append(intent.getAction());
        }
        if (intent.getComponent() != null)
        {
            s2.append(" component=").append(intent.getComponent());
        }
        s2.append(")");
        g.a(s1, s2.toString());
    }

    private boolean a(Intent intent)
    {
        if (intent.getComponent() != null && intent.getComponent().getPackageName().equals(e))
        {
            return true;
        }
        Object obj = f.a(intent);
        if (((List) (obj)).isEmpty())
        {
            a(b, "no activities registered", intent);
            return false;
        }
        if (((List) (obj)).size() > 1)
        {
            a(c, "multiple activities registered", intent);
            return false;
        }
        obj = (ActivityInfo)((List) (obj)).get(0);
        obj = new ComponentName(((ActivityInfo) (obj)).packageName, ((ActivityInfo) (obj)).name);
        if (intent.getComponent() == null)
        {
            intent.setComponent(((ComponentName) (obj)));
        } else
        if (!intent.getComponent().equals(obj))
        {
            a(d, (new StringBuilder()).append("mismatched resolve: ").append(obj).toString(), intent);
            return false;
        }
        return true;
    }

    private Intent b(Intent intent)
    {
        Iterator iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            o o1 = (o)iterator.next();
            if (intent.getData() != null)
            {
                intent.setData(o1.a(intent.getData()));
            }
        } while (true);
        return intent;
    }

    public void a(Intent intent, int i, Activity activity)
    {
        activity.startActivityForResult(b(intent), i);
    }

    public void a(Intent intent, int i, Fragment fragment)
    {
        fragment.a(b(intent), i);
    }

    public void a(Intent intent, Context context)
    {
        intent = b(intent);
        if (a(intent))
        {
            context.startActivity(intent);
        }
    }

    public void b(Intent intent, Context context)
    {
        context.startActivity(b(intent));
    }

}
