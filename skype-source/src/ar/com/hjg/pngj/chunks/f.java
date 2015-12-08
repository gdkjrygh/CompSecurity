// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import java.util.List;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            e

public final class f extends e
{

    private final List d;

    public final String toString()
    {
        return (new StringBuilder("ChunkList: written: ")).append(super.a.size()).append(" queue: ").append(d.size()).toString();
    }
}
