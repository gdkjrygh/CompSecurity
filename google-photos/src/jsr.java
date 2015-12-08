// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class jsr
{

    int a;
    ByteArrayOutputStream b;
    private jsq c;

    public jsr(jsq jsq1)
    {
        c = jsq1;
        super();
        b = new ByteArrayOutputStream();
    }

    public final boolean a(jsn jsn)
    {
        b.d(jsn);
        if (a + 1 > jsh.g())
        {
            return false;
        }
        String s = c.a(jsn, false);
        if (s == null)
        {
            ((jrj) (c)).d.a().a(jsn, "Error formatting hit");
            return true;
        }
        byte abyte0[] = s.getBytes();
        int j = abyte0.length;
        if (j > jsh.c())
        {
            ((jrj) (c)).d.a().a(jsn, "Hit size exceeds the maximum size limit");
            return true;
        }
        int i = j;
        if (b.size() > 0)
        {
            i = j + 1;
        }
        if (b.size() + i > ((Integer)jsl.t.a()).intValue())
        {
            return false;
        }
        try
        {
            if (b.size() > 0)
            {
                b.write(jsq.c());
            }
            b.write(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (jsn jsn)
        {
            c.e("Failed to write payload when batching hits", jsn);
            return true;
        }
        a = a + 1;
        return true;
    }
}
