// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import com.roidapp.imagelib.d;
import com.roidapp.imagelib.f;
import com.roidapp.imagelib.filter.filterinfo.LocalFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.LocalGroupInfo;
import com.roidapp.imagelib.j;

public final class bj
{

    public final LocalFilterInfo a[][];
    public final LocalGroupInfo b[];

    public bj()
    {
        LocalFilterInfo localfilterinfo = new LocalFilterInfo(0, f.aH, "Original", 1);
        LocalFilterInfo localfilterinfo1 = new LocalFilterInfo(37, f.aL, "S1", 2);
        LocalFilterInfo localfilterinfo2 = new LocalFilterInfo(29, f.aK, "S2", 3);
        LocalFilterInfo localfilterinfo3 = new LocalFilterInfo(38, f.am, "S3", 4);
        LocalFilterInfo localfilterinfo4 = new LocalFilterInfo(30, f.aU, "S4", 5);
        LocalFilterInfo localfilterinfo5 = new LocalFilterInfo(39, f.bo, "S5", 6);
        LocalFilterInfo localfilterinfo6 = new LocalFilterInfo(40, f.ac, "S6", 7);
        LocalFilterInfo localfilterinfo7 = new LocalFilterInfo(1, f.ah, "S7", 8);
        LocalFilterInfo localfilterinfo8 = new LocalFilterInfo(14, f.aD, "S8", 9);
        LocalFilterInfo localfilterinfo9 = new LocalFilterInfo(0, f.aH, "Original", 10);
        LocalFilterInfo localfilterinfo10 = new LocalFilterInfo(46, f.ba, "V1", 11);
        LocalFilterInfo localfilterinfo11 = new LocalFilterInfo(2, f.bl, "V2", 12);
        LocalFilterInfo localfilterinfo12 = new LocalFilterInfo(4, f.bk, "V3", 13);
        LocalFilterInfo localfilterinfo13 = new LocalFilterInfo(11, f.aV, "V4", 14);
        LocalFilterInfo localfilterinfo14 = new LocalFilterInfo(12, f.aG, "V5", 15);
        LocalFilterInfo localfilterinfo15 = new LocalFilterInfo(13, f.az, "V6", 16);
        LocalFilterInfo localfilterinfo16 = new LocalFilterInfo(17, f.ad, "V7", 17);
        LocalFilterInfo localfilterinfo17 = new LocalFilterInfo(18, f.aE, "V8", 18);
        LocalFilterInfo localfilterinfo18 = new LocalFilterInfo(0, f.aH, "Original", 19);
        LocalFilterInfo localfilterinfo19 = new LocalFilterInfo(41, f.aR, "SC1", 20);
        LocalFilterInfo localfilterinfo20 = new LocalFilterInfo(3, f.be, "SC2", 21);
        LocalFilterInfo localfilterinfo21 = new LocalFilterInfo(5, f.aC, "SC3", 22);
        LocalFilterInfo localfilterinfo22 = new LocalFilterInfo(6, f.af, "SC4", 23);
        LocalFilterInfo localfilterinfo23 = new LocalFilterInfo(7, f.aA, "SC5", 24);
        LocalFilterInfo localfilterinfo24 = new LocalFilterInfo(8, f.ai, "SC6", 25);
        LocalFilterInfo localfilterinfo25 = new LocalFilterInfo(15, f.ag, "SC7", 26);
        LocalFilterInfo localfilterinfo26 = new LocalFilterInfo(16, f.bc, "SC8", 27);
        LocalFilterInfo alocalfilterinfo[] = {
            new LocalFilterInfo(0, f.aH, "Original", 28), new LocalFilterInfo(22, f.aJ, "H1", 29), new LocalFilterInfo(26, f.ak, "H2", 30), new LocalFilterInfo(23, f.aT, "H3", 31), new LocalFilterInfo(42, f.k, "H4", 32), new LocalFilterInfo(25, f.j, "H5", 33), new LocalFilterInfo(27, f.aO, "H6", 34), new LocalFilterInfo(35, f.aQ, "H7", 35), new LocalFilterInfo(24, f.bn, "H8", 36)
        };
        LocalFilterInfo localfilterinfo27 = new LocalFilterInfo(0, f.aH, "Original", 37);
        LocalFilterInfo localfilterinfo28 = new LocalFilterInfo(10, f.s, "BW1", 38);
        LocalFilterInfo localfilterinfo29 = new LocalFilterInfo(9, f.aZ, "BW2", 39);
        LocalFilterInfo localfilterinfo30 = new LocalFilterInfo(28, f.g, "BW3", 40);
        LocalFilterInfo localfilterinfo31 = new LocalFilterInfo(36, f.h, "BW4", 41);
        LocalFilterInfo localfilterinfo32 = new LocalFilterInfo(44, f.bi, "BW5", 42);
        LocalFilterInfo localfilterinfo33 = new LocalFilterInfo(43, f.h, "BW6", 43);
        LocalFilterInfo localfilterinfo34 = new LocalFilterInfo(19, f.bb, "BW7", 44);
        LocalFilterInfo localfilterinfo35 = new LocalFilterInfo(45, f.aF, "BW8", 45);
        a = (new LocalFilterInfo[][] {
            new LocalFilterInfo[] {
                localfilterinfo, localfilterinfo1, localfilterinfo2, localfilterinfo3, localfilterinfo4, localfilterinfo5, localfilterinfo6, localfilterinfo7, localfilterinfo8
            }, new LocalFilterInfo[] {
                localfilterinfo9, localfilterinfo10, localfilterinfo11, localfilterinfo12, localfilterinfo13, localfilterinfo14, localfilterinfo15, localfilterinfo16, localfilterinfo17
            }, new LocalFilterInfo[] {
                localfilterinfo18, localfilterinfo19, localfilterinfo20, localfilterinfo21, localfilterinfo22, localfilterinfo23, localfilterinfo24, localfilterinfo25, localfilterinfo26
            }, alocalfilterinfo, new LocalFilterInfo[] {
                localfilterinfo27, localfilterinfo28, localfilterinfo29, localfilterinfo30, localfilterinfo31, localfilterinfo32, localfilterinfo33, localfilterinfo34, localfilterinfo35
            }
        });
        b = (new LocalGroupInfo[] {
            new LocalGroupInfo(j.l, f.aW, d.e, a[0], 1), new LocalGroupInfo(j.n, f.bj, d.h, a[1], 2), new LocalGroupInfo(j.g, f.aB, d.g, a[2], 3), new LocalGroupInfo(j.e, f.an, d.i, a[3], 4), new LocalGroupInfo(j.b, f.r, d.f, a[4], 5)
        });
    }
}
