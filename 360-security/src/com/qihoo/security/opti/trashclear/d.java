// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;


// Referenced classes of package com.qihoo.security.opti.trashclear:
//            c

public class d extends c
{

    public boolean c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public e.a j;
    public e.a k;
    public e.a l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    public d()
    {
        e = 0L;
        f = 0L;
        g = 0L;
        h = 0L;
        i = 0L;
        m = 0;
        n = 100;
        o = 0;
        p = 100;
        q = 0;
        r = 100;
        j = new e.a();
        k = new e.a();
        l = new e.a();
    }

    public Object clone()
    {
        return (d)super.clone();
    }

    public String toString()
    {
        return (new StringBuilder()).append("OptiTrashInfo [mCurTrashPath=").append(d).append(", mTotalScanTrashSize=").append(e).append(", mTotalClearTrashSize=").append(i).append(", mTrashSizeInfo=").append(j).append(", mCleanableSizeInfo=").append(k).append(", currentAppTrashProgress=").append(m).append(", totalAppTrashProgress=").append(n).append(", currentDiskTrashProgress=").append(o).append(", totalDiskTrashProgress=").append(p).append(", currentBigFileTrashProgress=").append(q).append(", totalBigFileTrashProgress=").append(r).append("]").toString();
    }
}
