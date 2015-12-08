// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ViewInfoStore

static interface HolderInfo
{

    public abstract void processAppeared(HolderInfo holderinfo, HolderInfo holderinfo1, HolderInfo holderinfo2);

    public abstract void processDisappeared(HolderInfo holderinfo, HolderInfo holderinfo1, HolderInfo holderinfo2);

    public abstract void processPersistent(HolderInfo holderinfo, HolderInfo holderinfo1, HolderInfo holderinfo2);

    public abstract void unused(HolderInfo holderinfo);
}
