// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;


// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            p, w

public final class n
{

    final p a;
    final double b;
    final w c;

    public n(p p1, double d, w w)
    {
        a = p1;
        b = d;
        c = w;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof n)) goto _L2; else goto _L1
_L1:
        obj = (n)obj;
        if (Math.abs(b - ((n) (obj)).b) <= 0.01D) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        if (a != null) goto _L5; else goto _L4
_L4:
        if (((n) (obj)).a != null) goto _L7; else goto _L6
_L6:
        if (c == null)
        {
            if (((n) (obj)).c == null)
            {
                return true;
            }
        } else
        {
            return c.equals(((n) (obj)).c);
        }
_L7:
        if (true) goto _L2; else goto _L5
_L5:
        if (!a.equals(((n) (obj)).a))
        {
            return false;
        }
          goto _L6
    }
}
