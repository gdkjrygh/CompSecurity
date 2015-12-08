// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcz, zzdf

class zzcf extends zzcz
{

    private static final String ID;
    private static final String zzaMQ;

    public zzcf()
    {
        super(ID);
    }

    protected boolean zza(String s, String s1, Map map)
    {
        byte byte0;
        boolean flag;
        if (zzdf.zzk((com.google.android.gms.internal.zzag.zza)map.get(zzaMQ)).booleanValue())
        {
            byte0 = 66;
        } else
        {
            byte0 = 64;
        }
        try
        {
            flag = Pattern.compile(s1, byte0).matcher(s).find();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return flag;
    }

    static 
    {
        ID = zzad.zzcb.toString();
        zzaMQ = zzae.zzfo.toString();
    }
}
