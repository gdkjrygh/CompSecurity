// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


// Referenced classes of package com.crashlytics.android:
//            D, au, am, Crashlytics

final class s
    implements D
{

    private Crashlytics a;

    s(Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
    }

    public final Object a(au au1)
    {
        boolean flag = false;
        if (au1.d().a())
        {
            au1 = a;
            if (!Crashlytics.n())
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}
