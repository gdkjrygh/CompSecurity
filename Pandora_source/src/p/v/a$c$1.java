// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

import android.util.Log;

// Referenced classes of package p.v:
//            a

static final class String extends String
{

    protected void a(Throwable throwable)
    {
        if (Log.isLoggable("PriorityExecutor", 6))
        {
            Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
        }
    }

    String(String s, int i)
    {
        super(s, i, null);
    }
}
