// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.bu;
import com.crashlytics.android.internal.bw;
import com.crashlytics.android.internal.bx;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cm;
import com.crashlytics.android.internal.y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android:
//            z, y, d, ad

final class aa extends y
    implements z
{

    public aa(String s, String s1, bu bu)
    {
        super(s, s1, bu, bw.b);
    }

    public final boolean a(com.crashlytics.android.y y1)
    {
        bx bx1 = b().a("X-CRASHLYTICS-API-KEY", y1.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", d.a().f());
        for (Iterator iterator = y1.b.e().entrySet().iterator(); iterator.hasNext();)
        {
            bx1 = bx1.a((java.util.Map.Entry)iterator.next());
        }

        y1 = y1.b;
        y1 = bx1.a("report[file]", y1.b(), "application/octet-stream", y1.d()).b("report[identifier]", y1.c());
        cm.a().b().a("Crashlytics", (new StringBuilder("Sending report to: ")).append(a()).toString());
        int i = y1.b();
        cm.a().b().a("Crashlytics", (new StringBuilder("Create report request ID: ")).append(y1.a("X-REQUEST-ID")).toString());
        cm.a().b().a("Crashlytics", (new StringBuilder("Result was: ")).append(i).toString());
        return ck.a(i) == 0;
    }
}
