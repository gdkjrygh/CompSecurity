// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class lve extends Thread
{

    final ContentResolver a;

    lve(String s, ContentResolver contentresolver)
    {
        a = contentresolver;
        super(s);
    }

    public final void run()
    {
        Looper.prepare();
        a.registerContentObserver(lvd.a, true, new lvf(this, new Handler(Looper.myLooper())));
        Looper.loop();
    }
}
