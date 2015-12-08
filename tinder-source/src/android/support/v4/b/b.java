// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;

public final class android.support.v4.b.b
{
    static interface a
    {

        public abstract Intent a(ComponentName componentname);
    }

    static class b
        implements a
    {

        public Intent a(ComponentName componentname)
        {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentname);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }

        b()
        {
        }
    }

    static class c extends b
    {

        public final Intent a(ComponentName componentname)
        {
            return Intent.makeMainActivity(componentname);
        }

        c()
        {
        }
    }

    static final class d extends c
    {

        d()
        {
        }
    }


    private static final a a;

    public static Intent a(ComponentName componentname)
    {
        return a.a(componentname);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 15)
        {
            a = new d();
        } else
        if (i >= 11)
        {
            a = new c();
        } else
        {
            a = new b();
        }
    }
}
