// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dc, dh

class ch extends dc
{

    private static final String ID;
    private static final String agJ;

    public ch()
    {
        super(ID);
    }

    protected boolean a(String s, String s1, Map map)
    {
        byte byte0;
        boolean flag;
        if (dh.n((com.google.android.gms.internal.d.a)map.get(agJ)).booleanValue())
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
        ID = a.ag.toString();
        agJ = b.cF.toString();
    }
}
