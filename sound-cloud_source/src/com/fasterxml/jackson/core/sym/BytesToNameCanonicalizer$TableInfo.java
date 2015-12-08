// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


// Referenced classes of package com.fasterxml.jackson.core.sym:
//            BytesToNameCanonicalizer, Name

private static final class llisionList
{

    public final int collCount;
    public final int collEnd;
    public final llisionList collList[];
    public final int count;
    public final int longestCollisionList;
    public final int mainHash[];
    public final int mainHashMask;
    public final Name mainNames[];

    public (int i, int j, int ai[], Name aname[],  a[], int k, int l, 
            int i1)
    {
        count = i;
        mainHashMask = j;
        mainHash = ai;
        mainNames = aname;
        collList = a;
        collCount = k;
        collEnd = l;
        longestCollisionList = i1;
    }

    public longestCollisionList(BytesToNameCanonicalizer bytestonamecanonicalizer)
    {
        count = bytestonamecanonicalizer._count;
        mainHashMask = bytestonamecanonicalizer._mainHashMask;
        mainHash = bytestonamecanonicalizer._mainHash;
        mainNames = bytestonamecanonicalizer._mainNames;
        collList = bytestonamecanonicalizer._collList;
        collCount = bytestonamecanonicalizer._collCount;
        collEnd = bytestonamecanonicalizer._collEnd;
        longestCollisionList = bytestonamecanonicalizer._longestCollisionList;
    }
}
