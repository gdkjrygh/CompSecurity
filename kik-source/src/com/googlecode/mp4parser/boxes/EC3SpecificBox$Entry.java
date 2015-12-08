// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;


// Referenced classes of package com.googlecode.mp4parser.boxes:
//            EC3SpecificBox

public static class _cls9
{

    public int acmod;
    public int bsid;
    public int bsmod;
    public int chan_loc;
    public int fscod;
    public int lfeon;
    public int num_dep_sub;
    public int reserved;
    public int reserved2;

    public String toString()
    {
        return (new StringBuilder("Entry{fscod=")).append(fscod).append(", bsid=").append(bsid).append(", bsmod=").append(bsmod).append(", acmod=").append(acmod).append(", lfeon=").append(lfeon).append(", reserved=").append(reserved).append(", num_dep_sub=").append(num_dep_sub).append(", chan_loc=").append(chan_loc).append(", reserved2=").append(reserved2).append('}').toString();
    }

    public _cls9()
    {
    }
}
