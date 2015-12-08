// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.zzbg;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public class zzmt
{

    private String zzaCO;

    public zzmt()
    {
        zzaCO = "https://www.google-analytics.com";
    }

    private String zzei(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbg.zzak((new StringBuilder()).append("Cannot encode the string: ").append(s).toString());
            return "";
        }
        return s1;
    }

    public void zzem(String s)
    {
        zzaCO = s;
        zzbg.zzal((new StringBuilder()).append("The Ctfe server endpoint was changed to: ").append(s).toString());
    }

    public String zzu(List list)
    {
        return (new StringBuilder()).append(zzaCO).append("/gtm/android?").append(zzv(list)).toString();
    }

    String zzv(List list)
    {
        boolean flag = true;
        if (list.size() > 1)
        {
            flag = false;
        }
        com.google.android.gms.common.internal.zzv.zzQ(flag);
        if (list.isEmpty())
        {
            return "";
        }
        zzmj zzmj1 = (zzmj)list.get(0);
        StringBuilder stringbuilder;
        if (!zzmj1.zzyj().trim().equals(""))
        {
            list = zzmj1.zzyj().trim();
        } else
        {
            list = "-1";
        }
        stringbuilder = new StringBuilder();
        if (zzmj1.zzyg() != null)
        {
            stringbuilder.append(zzmj1.zzyg());
        } else
        {
            stringbuilder.append("id");
        }
        stringbuilder.append("=").append(zzei(zzmj1.getContainerId())).append("&").append("pv").append("=").append(zzei(list));
        if (zzmj1.zzyi())
        {
            stringbuilder.append("&gtm_debug=x");
        }
        return stringbuilder.toString();
    }
}
