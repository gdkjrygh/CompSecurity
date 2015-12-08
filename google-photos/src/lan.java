// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.concurrent.Executor;

public class lan
{

    final Executor a;

    public lan(Handler handler)
    {
        a = new kuo(this, handler);
    }

    public void a(kyw kyw1, laa laa1)
    {
        a(kyw1, laa1, null);
    }

    public void a(kyw kyw1, laa laa1, Runnable runnable)
    {
        kyw1.h = true;
        kyw1.a("post-response");
        a.execute(new kup(this, kyw1, laa1, runnable));
    }

    public void a(kyw kyw1, lev lev)
    {
        kyw1.a("post-error");
        lev = new laa(lev);
        a.execute(new kup(this, kyw1, lev, null));
    }
}
