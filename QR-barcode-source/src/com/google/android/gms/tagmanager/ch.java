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
//            aj, di

class ch extends aj
{

    private static final String ID;
    private static final String aqn;
    private static final String aqo;
    private static final String aqp;
    private static final String aqq;

    public ch()
    {
        super(ID, new String[] {
            aqn, aqo
        });
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(aqn);
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(aqo);
        if (obj == null || obj == di.pK() || a1 == null || a1 == di.pK())
        {
            return di.pK();
        }
        byte byte0 = 64;
        if (di.n((com.google.android.gms.internal.d.a)map.get(aqp)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.d.a)map.get(aqq);
        int i;
        if (map != null)
        {
            map = di.l(map);
            if (map == di.pF())
            {
                return di.pK();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return di.pK();
            }
        } else
        {
            i = 1;
        }
        try
        {
            map = di.j(((com.google.android.gms.internal.d.a) (obj)));
            obj = di.j(a1);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return di.pK();
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
        return di.pK();
        map = di.u(map);
        return map;
    }

    public boolean nN()
    {
        return true;
    }

    static 
    {
        ID = a.ag.toString();
        aqn = b.bw.toString();
        aqo = b.bx.toString();
        aqp = b.dc.toString();
        aqq = b.cW.toString();
    }
}
