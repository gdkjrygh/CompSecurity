// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;

final class air
    implements ain
{

    private String a;

    public air(String s)
    {
        a = s;
    }

    public final void a(aio aio1)
    {
        String s;
        aio1 = aio1.c;
        s = a;
        if (ahp.b)
        {
            String s1 = String.valueOf(s);
            if (s1.length() == 0)
            {
                break MISSING_BLOCK_LABEL_45;
            }
            "Adding package ".concat(s1);
        }
_L1:
        ((ahp) (aio1)).a.add(s);
        return;
        try
        {
            new String("Adding package ");
        }
        // Misplaced declaration of an exception variable
        catch (aio aio1)
        {
            throw new RuntimeException(aio1.getMessage());
        }
          goto _L1
    }
}
