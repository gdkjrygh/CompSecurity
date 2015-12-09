// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import android.os.AsyncTask;

// Referenced classes of package android.support.v4.d:
//            b

public class a
{

    public static transient AsyncTask a(AsyncTask asynctask, Object aobj[])
    {
        if (asynctask == null)
        {
            throw new IllegalArgumentException("task can not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            b.a(asynctask, aobj);
            return asynctask;
        } else
        {
            asynctask.execute(aobj);
            return asynctask;
        }
    }
}
