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
    private static final String agE;
    private static final String agF;
    private static final String agG;
    private static final String agH;

    public cg()
    {
        super(ID, new String[] {
            agE, agF
        });
    }

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(agE);
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(agF);
        if (obj == null || obj == dh.mY() || a1 == null || a1 == dh.mY())
        {
            return dh.mY();
        }
        byte byte0 = 64;
        if (dh.n((com.google.android.gms.internal.d.a)map.get(agG)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.d.a)map.get(agH);
        int i;
        if (map != null)
        {
            map = dh.l(map);
            if (map == dh.mT())
            {
                return dh.mY();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return dh.mY();
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
            return dh.mY();
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
        return dh.mY();
        map = dh.r(map);
        return map;
    }

    static 
    {
        ID = a.ae.toString();
        agE = b.bi.toString();
        agF = b.bj.toString();
        agG = b.cF.toString();
        agH = b.cz.toString();
    }
}
