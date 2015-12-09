// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp;

import android.support.v4.f.a;
import com.jcp.settings.model.JCPSettings;
import com.jcp.util.aa;
import com.jcp.util.ae;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.jcp:
//            JCP

public class b
    implements Runnable
{

    private static final String a = com/jcp/b.getName();

    public b()
    {
    }

    private JCPSettings a()
    {
        return a(b());
    }

    private JCPSettings a(String s)
    {
        return (JCPSettings)aa.a(s, com/jcp/settings/model/JCPSettings);
    }

    private String b()
    {
        return b(com.jcp.b.b.ac());
    }

    private String b(String s)
    {
        OkHttpClient okhttpclient = JCP.k();
        a a1 = new a();
        a1.put("Content-type", "application/json");
        s = com.jcp.http.b.a(s, a1);
        try
        {
            s = okhttpclient.newCall(s).execute();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ae.a(a, "Error calling settings or storePickupSetting api", s);
            s = null;
        }
        return com.jcp.http.b.a(s);
    }

    public void run()
    {
        JCPSettings jcpsettings = a();
        if (jcpsettings != null)
        {
            com.jcp.JCP.a(jcpsettings);
            return;
        } else
        {
            com.jcp.JCP.a(new JCPSettings());
            return;
        }
    }

}
