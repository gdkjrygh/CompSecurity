// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ce, cl

final class bk extends ce
{

    private static final String a;
    private static final String b;

    public bk()
    {
        super(a);
    }

    protected final boolean a(String s, String s1, Map map)
    {
        byte byte0;
        boolean flag;
        if (cl.d((com.google.android.gms.internal.h.a)map.get(b)).booleanValue())
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
        a = e.Z.toString();
        b = f.bh.toString();
    }
}
