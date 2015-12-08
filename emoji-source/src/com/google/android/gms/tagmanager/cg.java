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
    private static final String agH;
    private static final String agI;
    private static final String agJ;
    private static final String agK;

    public cg()
    {
        super(ID, new String[] {
            agH, agI
        });
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(agH);
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(agI);
        if (obj == null || obj == dh.nd() || a1 == null || a1 == dh.nd())
        {
            return dh.nd();
        }
        byte byte0 = 64;
        if (dh.n((com.google.android.gms.internal.d.a)map.get(agJ)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.d.a)map.get(agK);
        int i;
        if (map != null)
        {
            map = dh.l(map);
            if (map == dh.mY())
            {
                return dh.nd();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return dh.nd();
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
            return dh.nd();
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
        return dh.nd();
        map = dh.r(map);
        return map;
    }

    static 
    {
        ID = a.ae.toString();
        agH = b.bi.toString();
        agI = b.bj.toString();
        agJ = b.cF.toString();
        agK = b.cz.toString();
    }
}
