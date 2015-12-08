// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import ar.com.hjg.pngj.chunks.b;

// Referenced classes of package ar.com.hjg.pngj:
//            d

static final class dError
{

    static final int a[];

    static 
    {
        a = new int[b.values().length];
        try
        {
            a[b.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[b.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
