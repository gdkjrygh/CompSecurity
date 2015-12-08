// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bms
{

    int a;
    ByteArrayOutputStream b;
    private bmr c;

    public bms(bmr bmr1)
    {
        c = bmr1;
        super();
        b = new ByteArrayOutputStream();
    }

    public final boolean a(bmj bmj)
    {
        btl.a(bmj);
        if (a + 1 > bns.g())
        {
            return false;
        }
        String s = c.a(bmj, false);
        if (s == null)
        {
            ((bnc) (c)).f.a().a(bmj, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > bns.c())
        {
            ((bnc) (c)).f.a().a(bmj, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (b.size() > 0)
        {
            i = j + 1;
        }
        if (b.size() + i > ((Integer)bnz.t.a).intValue())
        {
            return false;
        }
        try
        {
            if (b.size() > 0)
            {
                b.write(bmr.c());
            }
            b.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (bmj bmj)
        {
            c.e("Failed to write payload when batching hits", bmj);
            return true;
        }
        a = a + 1;
        return true;
    }
}
