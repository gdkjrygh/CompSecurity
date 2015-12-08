// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.File;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.crashlytics.android.internal:
//            y, m, bw, bx, 
//            cm, ba, ck, bu

final class g extends y
    implements m
{

    public g(String s, String s1, bu bu)
    {
        super(s, s1, bu, bw.b);
    }

    public final boolean a(String s, List list)
    {
        boolean flag = false;
        s = b().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", cm.a().f()).a("X-CRASHLYTICS-API-KEY", s);
        Iterator iterator = list.iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            File file = (File)iterator.next();
            ba.c((new StringBuilder("Adding analytics session file ")).append(file.getName()).append(" to multipart POST").toString());
            s.a((new StringBuilder("session_analytics_file_")).append(i).toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
        }

        ba.c((new StringBuilder("Sending ")).append(list.size()).append(" analytics files to ").append(a()).toString());
        int j = s.b();
        ba.c((new StringBuilder("Response code for analytics file send is ")).append(j).toString());
        if (ck.a(j) == 0)
        {
            flag = true;
        }
        return flag;
    }
}
