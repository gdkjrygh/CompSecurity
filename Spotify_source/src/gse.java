// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

class gse extends hcl
{

    private boolean a;

    public gse(hcv hcv)
    {
        super(hcv);
    }

    protected void a()
    {
    }

    public final void a_(hch hch1, long l)
    {
        if (a)
        {
            hch1.f(l);
            return;
        }
        try
        {
            super.a_(hch1, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (hch hch1)
        {
            a = true;
        }
        a();
    }

    public void close()
    {
        if (a)
        {
            return;
        }
        try
        {
            super.close();
            return;
        }
        catch (IOException ioexception)
        {
            a = true;
        }
        a();
    }

    public void flush()
    {
        if (a)
        {
            return;
        }
        try
        {
            super.flush();
            return;
        }
        catch (IOException ioexception)
        {
            a = true;
        }
        a();
    }
}
