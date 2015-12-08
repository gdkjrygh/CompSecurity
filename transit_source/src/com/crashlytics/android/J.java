// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, ar, aq, E

final class J
    implements Runnable
{

    private File a;

    J(E e, File file)
    {
        a = file;
        super();
    }

    public final void run()
    {
        ab ab = Crashlytics.getInstance().s();
        if (ab != null)
        {
            (new ar(ab)).a(new aq(a, E.f()));
        }
    }
}
