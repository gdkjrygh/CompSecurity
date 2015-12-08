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
    private static final String asw;
    private static final String asx;
    private static final String asy;
    private static final String asz;

    public ch()
    {
        super(ID, new String[] {
            asw, asx
        });
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(asw);
        com.google.android.gms.internal.d.a a1 = (com.google.android.gms.internal.d.a)map.get(asx);
        if (obj == null || obj == di.rb() || a1 == null || a1 == di.rb())
        {
            return di.rb();
        }
        byte byte0 = 64;
        if (di.n((com.google.android.gms.internal.d.a)map.get(asy)).booleanValue())
        {
            byte0 = 66;
        }
        map = (com.google.android.gms.internal.d.a)map.get(asz);
        int i;
        if (map != null)
        {
            map = di.l(map);
            if (map == di.qW())
            {
                return di.rb();
            }
            int j = map.intValue();
            i = j;
            if (j < 0)
            {
                return di.rb();
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
            return di.rb();
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
        return di.rb();
        map = di.u(map);
        return map;
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.ag.toString();
        asw = b.bw.toString();
        asx = b.bx.toString();
        asy = b.dc.toString();
        asz = b.cW.toString();
    }
}
