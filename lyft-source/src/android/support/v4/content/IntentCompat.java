// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ComponentName;
import android.content.Intent;

public class IntentCompat
{

    private static final IntentCompatImpl a;

    public static Intent a(ComponentName componentname)
    {
        return a.a(componentname);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 15)
        {
            a = new IntentCompatImplIcsMr1();
        } else
        if (i >= 11)
        {
            a = new IntentCompatImplHC();
        } else
        {
            a = new IntentCompatImplBase();
        }
    }

    private class IntentCompatImpl
    {

        public abstract Intent a(ComponentName componentname);
    }


    private class IntentCompatImplIcsMr1 extends IntentCompatImplHC
    {
        private class IntentCompatImplHC extends IntentCompatImplBase
        {
            private class IntentCompatImplBase
                implements IntentCompatImpl
            {

                public Intent a(ComponentName componentname)
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


            public Intent a(ComponentName componentname)
            {
                return IntentCompatHoneycomb.a(componentname);
            }

            IntentCompatImplHC()
            {
            }
        }


        IntentCompatImplIcsMr1()
        {
        }
    }

}
