// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package android.support.v4.content:
//            IntentCompatHoneycomb

public class IntentCompat
{
    static interface IntentCompatImpl
    {

        public abstract Intent makeMainActivity(ComponentName componentname);
    }

    static class IntentCompatImplBase
        implements IntentCompatImpl
    {

        public Intent makeMainActivity(ComponentName componentname)
        {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentname);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }

        IntentCompatImplBase()
        {
        }
    }

    static class IntentCompatImplHC extends IntentCompatImplBase
    {

        public Intent makeMainActivity(ComponentName componentname)
        {
            return IntentCompatHoneycomb.makeMainActivity(componentname);
        }

        IntentCompatImplHC()
        {
        }
    }

    static class IntentCompatImplIcsMr1 extends IntentCompatImplHC
    {

        IntentCompatImplIcsMr1()
        {
        }
    }


    private static final IntentCompatImpl IMPL;

    public static Intent makeMainActivity(ComponentName componentname)
    {
        return IMPL.makeMainActivity(componentname);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 15)
        {
            IMPL = new IntentCompatImplIcsMr1();
        } else
        if (i >= 11)
        {
            IMPL = new IntentCompatImplHC();
        } else
        {
            IMPL = new IntentCompatImplBase();
        }
    }
}
