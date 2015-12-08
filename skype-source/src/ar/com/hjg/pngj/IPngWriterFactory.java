// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.io.OutputStream;

// Referenced classes of package ar.com.hjg.pngj:
//            m, t

public interface IPngWriterFactory
{

    public abstract t createPngWriter(OutputStream outputstream, m m);
}
