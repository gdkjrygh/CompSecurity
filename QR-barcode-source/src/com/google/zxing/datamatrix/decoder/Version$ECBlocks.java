// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            Version

static final class <init>
{

    private final ecCodewords ecBlocks[];
    private final int ecCodewords;

    <init>[] getECBlocks()
    {
        return ecBlocks;
    }

    int getECCodewords()
    {
        return ecCodewords;
    }

    private (int i,  )
    {
        ecCodewords = i;
        ecBlocks = (new ecBlocks[] {
            
        });
    }

    ecBlocks(int i, ecBlocks ecblocks, ecBlocks ecblocks1)
    {
        this(i, ecblocks);
    }

    private <init>(int i, <init> <init>1, <init> <init>2)
    {
        ecCodewords = i;
        ecBlocks = (new ecBlocks[] {
            <init>1, <init>2
        });
    }

    ecBlocks(int i, ecBlocks ecblocks, ecBlocks ecblocks1, ecBlocks ecblocks2)
    {
        this(i, ecblocks, ecblocks1);
    }
}
