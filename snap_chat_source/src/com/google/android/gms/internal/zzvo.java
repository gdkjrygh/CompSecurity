// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbf;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzve

public class zzvo
{

    private String zzaya;

    public zzvo()
    {
        zzaya = "https://www.google-analytics.com";
    }

    private String zzdv(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            zzbf.zzZ((new StringBuilder("Cannot encode the string: ")).append(s).toString());
            return "";
        }
        return s1;
    }

    public void zzdx(String s)
    {
        zzaya = s;
        zzbf.zzaa((new StringBuilder("The Ctfe server endpoint was changed to: ")).append(s).toString());
    }

    public String zzv(List list)
    {
        return (new StringBuilder()).append(zzaya).append("/gtm/android?").append(zzw(list)).toString();
    }

    String zzw(List list)
    {
        boolean flag = true;
        if (list.size() > 1)
        {
            flag = false;
        }
        zzx.zzO(flag);
        if (list.isEmpty())
        {
            return "";
        }
        zzve zzve1 = (zzve)list.get(0);
        StringBuilder stringbuilder;
        if (!zzve1.zzul().trim().equals(""))
        {
            list = zzve1.zzul().trim();
        } else
        {
            list = "-1";
        }
        stringbuilder = new StringBuilder();
        if (zzve1.zzui() != null)
        {
            stringbuilder.append(zzve1.zzui());
        } else
        {
            stringbuilder.append("id");
        }
        stringbuilder.append("=").append(zzdv(zzve1.getContainerId())).append("&pv=").append(zzdv(list));
        if (zzve1.zzuk())
        {
            stringbuilder.append("&gtm_debug=x");
        }
        return stringbuilder.toString();
    }
}
