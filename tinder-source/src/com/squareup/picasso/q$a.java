// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.util.concurrent.FutureTask;

// Referenced classes of package com.squareup.picasso:
//            q, c

private static final class a extends FutureTask
    implements Comparable
{

    private final c a;

    public final int compareTo(Object obj)
    {
        obj = (sso.Priority)obj;
        sso.Priority priority = a.s;
        sso.Priority priority1 = ((a) (obj)).a.s;
        if (priority == priority1)
        {
            return a.a - ((a) (obj)).a.a;
        } else
        {
            return priority1.ordinal() - priority.ordinal();
        }
    }

    public sso.Priority(c c1)
    {
        super(c1, null);
        a = c1;
    }
}
