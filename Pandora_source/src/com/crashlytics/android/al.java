// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.util.Log;
import com.crashlytics.android.internal.ba;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.cm;

// Referenced classes of package com.crashlytics.android:
//            f

final class al
{

    private String a;
    private boolean b;

    public al(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public final void a(String s, String s1)
    {
        if (ba.e(a) && b)
        {
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", ".     |  | ");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".   \\ |  | /");
            Log.e("Crashlytics", ".    \\    /");
            Log.e("Crashlytics", ".     \\  /");
            Log.e("Crashlytics", ".      \\/");
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", "This app relies on Crashlytics. Configure your build environment here: ");
            Log.e("Crashlytics", String.format("https://crashlytics.com/register/%s/android/%s", new Object[] {
                s, s1
            }));
            Log.e("Crashlytics", ".");
            Log.e("Crashlytics", ".      /\\");
            Log.e("Crashlytics", ".     /  \\");
            Log.e("Crashlytics", ".    /    \\");
            Log.e("Crashlytics", ".   / |  | \\");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".     |  |");
            Log.e("Crashlytics", ".");
            throw new f(s, s1);
        }
        if (!b)
        {
            cm.a().b().a("Crashlytics", "Configured not to require a build ID.");
        }
    }
}
