// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.Executor;

public class dfb
{

    Executor a;

    public dfb(Executor executor)
    {
        a = executor;
    }

    public transient void a(AsyncTask asynctask, Object aobj[])
    {
        asynctask.executeOnExecutor(a, aobj);
    }
}
