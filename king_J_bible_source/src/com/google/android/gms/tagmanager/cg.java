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
//            aj, dh

class cg extends aj
{

    private static final String ID;
    private static final String YZ;
    private static final String Za;
    private static final String Zb;
    private static final String Zc;

    public cg()
    {
        super(ID, new String[] {
            YZ, Za
        });
    }

    public boolean jX()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(YZ);
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(Za);
        if (obj == null || obj == dh.lT() || a1 == null || a1 == dh.lT())
        {
            return dh.lT();
        }
        byte byte0 = 64;
        if (dh.n((com.google.android.gms.internal.d.a)map.get(Zb)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.d.a)map.get(Zc);
        int i;
        if (map != null)
        {
            map = dh.l(map);
            if (map == dh.lO())
            {
                return dh.lT();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return dh.lT();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = dh.j(((com.google.android.gms.internal.d.a) (obj)));
            obj = dh.j(a1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return dh.lT();
        }
        a1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = a1;
        if (!((Matcher) (obj)).find())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        map = a1;
        if (((Matcher) (obj)).groupCount() >= i)
        {
            map = ((Matcher) (obj)).group(i);
        }
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        return dh.lT();
        map = dh.r(map);
        return map;
    }

    static 
    {
        ID = a.ae.toString();
        YZ = b.bi.toString();
        Za = b.bj.toString();
        Zb = b.cF.toString();
        Zc = b.cz.toString();
    }
}
