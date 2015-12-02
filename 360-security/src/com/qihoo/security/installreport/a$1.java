// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.installreport;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.service.d;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.qihoo.security.installreport:
//            a

static final class f
    implements com.qihoo.security.adv.ataManager.c
{

    final Context a;
    final JSONArray b;
    final com.qihoo.security.adv.ataManager.AdvReportType c;
    final List d;
    final boolean e;
    final String f;

    public void a(Long long1, Long long2)
    {
    }

    public void a(Long long1, Long long2, int i)
    {
        if (f != null && !f.equals(a.getPackageName()))
        {
            com.qihoo.security.service.d.b(com.qihoo.security.installreport.a.b(), Integer.valueOf(b.hashCode()));
        }
        com.qihoo.security.installreport.a.a(c, false);
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Long)obj, (Long)obj1);
    }

    public volatile void a(Object obj, Object obj1, int i)
    {
        a((Long)obj, (Long)obj1, i);
    }

    public volatile void a(Object obj, Object obj1, Object obj2)
    {
        a((String)obj, (Long)obj1, (Long)obj2);
    }

    public void a(String s, Long long1, Long long2)
    {
        s = SecurityApplication.c();
        if (s != null && !s.equals(a.getPackageName()))
        {
            com.qihoo.security.service.d.b(com.qihoo.security.installreport.a.b(), Integer.valueOf(b.hashCode()));
        }
        (new Thread(new Runnable() {

            final a._cls1 a;

            public void run()
            {
                if (a.c == com.qihoo.security.adv.AdvDataManager.AdvReportType.LaunchApp)
                {
                    com.qihoo.security.installreport.a.b(a.a, a.d);
                } else
                if (!a.e)
                {
                    com.qihoo.security.installreport.a.a(a.a);
                } else
                {
                    com.qihoo.security.installreport.a.b(a.a, a.d);
                }
                com.qihoo.security.installreport.a.a(a.c, false);
            }

            
            {
                a = a._cls1.this;
                super();
            }
        })).start();
    }

    ReportType(Context context, JSONArray jsonarray, com.qihoo.security.adv.ataManager.AdvReportType advreporttype, List list, boolean flag, String s)
    {
        a = context;
        b = jsonarray;
        c = advreporttype;
        d = list;
        e = flag;
        f = s;
        super();
    }
}
