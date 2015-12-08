// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ViewInfoStore

static class .ItemHolderInfo
{

    static final int FLAG_APPEAR = 2;
    static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
    static final int FLAG_APPEAR_PRE_AND_POST = 14;
    static final int FLAG_DISAPPEARED = 1;
    static final int FLAG_POST = 8;
    static final int FLAG_PRE = 4;
    static final int FLAG_PRE_AND_POST = 12;
    static android.support.v4.util.d.sPool sPool = new android.support.v4.util.d.sPool(20);
    int flags;
    .ItemHolderInfo postInfo;
    .ItemHolderInfo preInfo;

    static void drainCache()
    {
        while (sPool.sPool() != null) ;
    }

    static sPool obtain()
    {
        sPool spool1 = (sPool)sPool.sPool();
        sPool spool = spool1;
        if (spool1 == null)
        {
            spool = new <init>();
        }
        return spool;
    }

    static void recycle(<init> <init>1)
    {
        <init>1.flags = 0;
        <init>1.preInfo = null;
        <init>1.postInfo = null;
        sPool.sPool(<init>1);
    }


    private .ItemHolderInfo()
    {
    }
}
