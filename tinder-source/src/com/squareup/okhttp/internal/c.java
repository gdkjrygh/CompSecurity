// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import okio.g;
import okio.q;

class c extends g
{

    private boolean a;

    public c(q q)
    {
        super(q);
    }

    protected void a()
    {
    }

    public final void a_(okio.c c1, long l)
        throws IOException
    {
        if (a)
        {
            c1.f(l);
            return;
        }
        try
        {
            super.a_(c1, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (okio.c c1)
        {
            a = true;
        }
        a();
    }

    public void close()
        throws IOException
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
        throws IOException
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
