// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            FormatInformation, ErrorCorrectionLevel

public final class Version
{
    public static final class ECB
    {

        private final int count;
        private final int dataCodewords;

        public final int getCount()
        {
            return count;
        }

        public final int getDataCodewords()
        {
            return dataCodewords;
        }

        ECB(int i, int j)
        {
            count = i;
            dataCodewords = j;
        }
    }

    public static final class ECBlocks
    {

        private final ECB ecBlocks[];
        private final int ecCodewordsPerBlock;

        public final ECB[] getECBlocks()
        {
            return ecBlocks;
        }

        public final int getECCodewordsPerBlock()
        {
            return ecCodewordsPerBlock;
        }

        public final int getNumBlocks()
        {
            int j = 0;
            ECB aecb[] = ecBlocks;
            int k = aecb.length;
            for (int i = 0; i < k; i++)
            {
                j += aecb[i].getCount();
            }

            return j;
        }

        public final int getTotalECCodewords()
        {
            return ecCodewordsPerBlock * getNumBlocks();
        }

        transient ECBlocks(int i, ECB aecb[])
        {
            ecCodewordsPerBlock = i;
            ecBlocks = aecb;
        }
    }


    private static final Version VERSIONS[] = buildVersions();
    private static final int VERSION_DECODE_INFO[] = {
        31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
        0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
        0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
        0x2542e, 0x26a64, 0x27541, 0x28c69
    };
    private final int alignmentPatternCenters[];
    private final ECBlocks ecBlocks[];
    private final int totalCodewords;
    private final int versionNumber;

    private transient Version(int i, int ai[], ECBlocks aecblocks[])
    {
        versionNumber = i;
        alignmentPatternCenters = ai;
        ecBlocks = aecblocks;
        int j = 0;
        int k = aecblocks[0].getECCodewordsPerBlock();
        ai = aecblocks[0].getECBlocks();
        int l = ai.length;
        for (i = 0; i < l; i++)
        {
            aecblocks = ai[i];
            j += aecblocks.getCount() * (aecblocks.getDataCodewords() + k);
        }

        totalCodewords = j;
    }

    private static Version[] buildVersions()
    {
        Object obj = new ECBlocks(7, new ECB[] {
            new ECB(1, 19)
        });
        Object obj1 = new ECBlocks(10, new ECB[] {
            new ECB(1, 16)
        });
        Object obj2 = new ECBlocks(13, new ECB[] {
            new ECB(1, 13)
        });
        Object obj3 = new ECBlocks(17, new ECB[] {
            new ECB(1, 9)
        });
        obj = new Version(1, new int[0], new ECBlocks[] {
            obj, obj1, obj2, obj3
        });
        obj1 = new ECBlocks(10, new ECB[] {
            new ECB(1, 34)
        });
        obj2 = new ECBlocks(16, new ECB[] {
            new ECB(1, 28)
        });
        obj3 = new ECBlocks(22, new ECB[] {
            new ECB(1, 22)
        });
        Object obj4 = new ECBlocks(28, new ECB[] {
            new ECB(1, 16)
        });
        obj1 = new Version(2, new int[] {
            6, 18
        }, new ECBlocks[] {
            obj1, obj2, obj3, obj4
        });
        obj2 = new ECBlocks(15, new ECB[] {
            new ECB(1, 55)
        });
        obj3 = new ECBlocks(26, new ECB[] {
            new ECB(1, 44)
        });
        obj4 = new ECBlocks(18, new ECB[] {
            new ECB(2, 17)
        });
        Object obj5 = new ECBlocks(22, new ECB[] {
            new ECB(2, 13)
        });
        obj2 = new Version(3, new int[] {
            6, 22
        }, new ECBlocks[] {
            obj2, obj3, obj4, obj5
        });
        obj3 = new ECBlocks(20, new ECB[] {
            new ECB(1, 80)
        });
        obj4 = new ECBlocks(18, new ECB[] {
            new ECB(2, 32)
        });
        obj5 = new ECBlocks(26, new ECB[] {
            new ECB(2, 24)
        });
        Object obj6 = new ECBlocks(16, new ECB[] {
            new ECB(4, 9)
        });
        obj3 = new Version(4, new int[] {
            6, 26
        }, new ECBlocks[] {
            obj3, obj4, obj5, obj6
        });
        obj4 = new ECBlocks(26, new ECB[] {
            new ECB(1, 108)
        });
        obj5 = new ECBlocks(24, new ECB[] {
            new ECB(2, 43)
        });
        obj6 = new ECBlocks(18, new ECB[] {
            new ECB(2, 15), new ECB(2, 16)
        });
        Object obj7 = new ECBlocks(22, new ECB[] {
            new ECB(2, 11), new ECB(2, 12)
        });
        obj4 = new Version(5, new int[] {
            6, 30
        }, new ECBlocks[] {
            obj4, obj5, obj6, obj7
        });
        obj5 = new ECBlocks(18, new ECB[] {
            new ECB(2, 68)
        });
        obj6 = new ECBlocks(16, new ECB[] {
            new ECB(4, 27)
        });
        obj7 = new ECBlocks(24, new ECB[] {
            new ECB(4, 19)
        });
        Object obj8 = new ECBlocks(28, new ECB[] {
            new ECB(4, 15)
        });
        obj5 = new Version(6, new int[] {
            6, 34
        }, new ECBlocks[] {
            obj5, obj6, obj7, obj8
        });
        obj6 = new ECBlocks(20, new ECB[] {
            new ECB(2, 78)
        });
        obj7 = new ECBlocks(18, new ECB[] {
            new ECB(4, 31)
        });
        obj8 = new ECBlocks(18, new ECB[] {
            new ECB(2, 14), new ECB(4, 15)
        });
        Object obj9 = new ECBlocks(26, new ECB[] {
            new ECB(4, 13), new ECB(1, 14)
        });
        obj6 = new Version(7, new int[] {
            6, 22, 38
        }, new ECBlocks[] {
            obj6, obj7, obj8, obj9
        });
        obj7 = new ECBlocks(24, new ECB[] {
            new ECB(2, 97)
        });
        obj8 = new ECBlocks(22, new ECB[] {
            new ECB(2, 38), new ECB(2, 39)
        });
        obj9 = new ECBlocks(22, new ECB[] {
            new ECB(4, 18), new ECB(2, 19)
        });
        Object obj10 = new ECBlocks(26, new ECB[] {
            new ECB(4, 14), new ECB(2, 15)
        });
        obj7 = new Version(8, new int[] {
            6, 24, 42
        }, new ECBlocks[] {
            obj7, obj8, obj9, obj10
        });
        obj8 = new ECBlocks(30, new ECB[] {
            new ECB(2, 116)
        });
        obj9 = new ECBlocks(22, new ECB[] {
            new ECB(3, 36), new ECB(2, 37)
        });
        obj10 = new ECBlocks(20, new ECB[] {
            new ECB(4, 16), new ECB(4, 17)
        });
        Object obj11 = new ECBlocks(24, new ECB[] {
            new ECB(4, 12), new ECB(4, 13)
        });
        obj8 = new Version(9, new int[] {
            6, 26, 46
        }, new ECBlocks[] {
            obj8, obj9, obj10, obj11
        });
        obj9 = new ECBlocks(18, new ECB[] {
            new ECB(2, 68), new ECB(2, 69)
        });
        obj10 = new ECBlocks(26, new ECB[] {
            new ECB(4, 43), new ECB(1, 44)
        });
        obj11 = new ECBlocks(24, new ECB[] {
            new ECB(6, 19), new ECB(2, 20)
        });
        Object obj12 = new ECBlocks(28, new ECB[] {
            new ECB(6, 15), new ECB(2, 16)
        });
        obj9 = new Version(10, new int[] {
            6, 28, 50
        }, new ECBlocks[] {
            obj9, obj10, obj11, obj12
        });
        obj10 = new ECBlocks(20, new ECB[] {
            new ECB(4, 81)
        });
        obj11 = new ECBlocks(30, new ECB[] {
            new ECB(1, 50), new ECB(4, 51)
        });
        obj12 = new ECBlocks(28, new ECB[] {
            new ECB(4, 22), new ECB(4, 23)
        });
        Object obj13 = new ECBlocks(24, new ECB[] {
            new ECB(3, 12), new ECB(8, 13)
        });
        obj10 = new Version(11, new int[] {
            6, 30, 54
        }, new ECBlocks[] {
            obj10, obj11, obj12, obj13
        });
        obj11 = new ECBlocks(24, new ECB[] {
            new ECB(2, 92), new ECB(2, 93)
        });
        obj12 = new ECBlocks(22, new ECB[] {
            new ECB(6, 36), new ECB(2, 37)
        });
        obj13 = new ECBlocks(26, new ECB[] {
            new ECB(4, 20), new ECB(6, 21)
        });
        Object obj14 = new ECBlocks(28, new ECB[] {
            new ECB(7, 14), new ECB(4, 15)
        });
        obj11 = new Version(12, new int[] {
            6, 32, 58
        }, new ECBlocks[] {
            obj11, obj12, obj13, obj14
        });
        obj12 = new ECBlocks(26, new ECB[] {
            new ECB(4, 107)
        });
        obj13 = new ECBlocks(22, new ECB[] {
            new ECB(8, 37), new ECB(1, 38)
        });
        obj14 = new ECBlocks(24, new ECB[] {
            new ECB(8, 20), new ECB(4, 21)
        });
        Object obj15 = new ECBlocks(22, new ECB[] {
            new ECB(12, 11), new ECB(4, 12)
        });
        obj12 = new Version(13, new int[] {
            6, 34, 62
        }, new ECBlocks[] {
            obj12, obj13, obj14, obj15
        });
        obj13 = new ECBlocks(30, new ECB[] {
            new ECB(3, 115), new ECB(1, 116)
        });
        obj14 = new ECBlocks(24, new ECB[] {
            new ECB(4, 40), new ECB(5, 41)
        });
        obj15 = new ECBlocks(20, new ECB[] {
            new ECB(11, 16), new ECB(5, 17)
        });
        Object obj16 = new ECBlocks(24, new ECB[] {
            new ECB(11, 12), new ECB(5, 13)
        });
        obj13 = new Version(14, new int[] {
            6, 26, 46, 66
        }, new ECBlocks[] {
            obj13, obj14, obj15, obj16
        });
        obj14 = new ECBlocks(22, new ECB[] {
            new ECB(5, 87), new ECB(1, 88)
        });
        obj15 = new ECBlocks(24, new ECB[] {
            new ECB(5, 41), new ECB(5, 42)
        });
        obj16 = new ECBlocks(30, new ECB[] {
            new ECB(5, 24), new ECB(7, 25)
        });
        Object obj17 = new ECBlocks(24, new ECB[] {
            new ECB(11, 12), new ECB(7, 13)
        });
        obj14 = new Version(15, new int[] {
            6, 26, 48, 70
        }, new ECBlocks[] {
            obj14, obj15, obj16, obj17
        });
        obj15 = new ECBlocks(24, new ECB[] {
            new ECB(5, 98), new ECB(1, 99)
        });
        obj16 = new ECBlocks(28, new ECB[] {
            new ECB(7, 45), new ECB(3, 46)
        });
        obj17 = new ECBlocks(24, new ECB[] {
            new ECB(15, 19), new ECB(2, 20)
        });
        Object obj18 = new ECBlocks(30, new ECB[] {
            new ECB(3, 15), new ECB(13, 16)
        });
        obj15 = new Version(16, new int[] {
            6, 26, 50, 74
        }, new ECBlocks[] {
            obj15, obj16, obj17, obj18
        });
        obj16 = new ECBlocks(28, new ECB[] {
            new ECB(1, 107), new ECB(5, 108)
        });
        obj17 = new ECBlocks(28, new ECB[] {
            new ECB(10, 46), new ECB(1, 47)
        });
        obj18 = new ECBlocks(28, new ECB[] {
            new ECB(1, 22), new ECB(15, 23)
        });
        Object obj19 = new ECBlocks(28, new ECB[] {
            new ECB(2, 14), new ECB(17, 15)
        });
        obj16 = new Version(17, new int[] {
            6, 30, 54, 78
        }, new ECBlocks[] {
            obj16, obj17, obj18, obj19
        });
        obj17 = new ECBlocks(30, new ECB[] {
            new ECB(5, 120), new ECB(1, 121)
        });
        obj18 = new ECBlocks(26, new ECB[] {
            new ECB(9, 43), new ECB(4, 44)
        });
        obj19 = new ECBlocks(28, new ECB[] {
            new ECB(17, 22), new ECB(1, 23)
        });
        Object obj20 = new ECBlocks(28, new ECB[] {
            new ECB(2, 14), new ECB(19, 15)
        });
        obj17 = new Version(18, new int[] {
            6, 30, 56, 82
        }, new ECBlocks[] {
            obj17, obj18, obj19, obj20
        });
        obj18 = new ECBlocks(28, new ECB[] {
            new ECB(3, 113), new ECB(4, 114)
        });
        obj19 = new ECBlocks(26, new ECB[] {
            new ECB(3, 44), new ECB(11, 45)
        });
        obj20 = new ECBlocks(26, new ECB[] {
            new ECB(17, 21), new ECB(4, 22)
        });
        Object obj21 = new ECBlocks(26, new ECB[] {
            new ECB(9, 13), new ECB(16, 14)
        });
        obj18 = new Version(19, new int[] {
            6, 30, 58, 86
        }, new ECBlocks[] {
            obj18, obj19, obj20, obj21
        });
        obj19 = new ECBlocks(28, new ECB[] {
            new ECB(3, 107), new ECB(5, 108)
        });
        obj20 = new ECBlocks(26, new ECB[] {
            new ECB(3, 41), new ECB(13, 42)
        });
        obj21 = new ECBlocks(30, new ECB[] {
            new ECB(15, 24), new ECB(5, 25)
        });
        Object obj22 = new ECBlocks(28, new ECB[] {
            new ECB(15, 15), new ECB(10, 16)
        });
        obj19 = new Version(20, new int[] {
            6, 34, 62, 90
        }, new ECBlocks[] {
            obj19, obj20, obj21, obj22
        });
        obj20 = new ECBlocks(28, new ECB[] {
            new ECB(4, 116), new ECB(4, 117)
        });
        obj21 = new ECBlocks(26, new ECB[] {
            new ECB(17, 42)
        });
        obj22 = new ECBlocks(28, new ECB[] {
            new ECB(17, 22), new ECB(6, 23)
        });
        Object obj23 = new ECBlocks(30, new ECB[] {
            new ECB(19, 16), new ECB(6, 17)
        });
        obj20 = new Version(21, new int[] {
            6, 28, 50, 72, 94
        }, new ECBlocks[] {
            obj20, obj21, obj22, obj23
        });
        obj21 = new ECBlocks(28, new ECB[] {
            new ECB(2, 111), new ECB(7, 112)
        });
        obj22 = new ECBlocks(28, new ECB[] {
            new ECB(17, 46)
        });
        obj23 = new ECBlocks(30, new ECB[] {
            new ECB(7, 24), new ECB(16, 25)
        });
        Object obj24 = new ECBlocks(24, new ECB[] {
            new ECB(34, 13)
        });
        obj21 = new Version(22, new int[] {
            6, 26, 50, 74, 98
        }, new ECBlocks[] {
            obj21, obj22, obj23, obj24
        });
        obj22 = new ECBlocks(30, new ECB[] {
            new ECB(4, 121), new ECB(5, 122)
        });
        obj23 = new ECBlocks(28, new ECB[] {
            new ECB(4, 47), new ECB(14, 48)
        });
        obj24 = new ECBlocks(30, new ECB[] {
            new ECB(11, 24), new ECB(14, 25)
        });
        Object obj25 = new ECBlocks(30, new ECB[] {
            new ECB(16, 15), new ECB(14, 16)
        });
        obj22 = new Version(23, new int[] {
            6, 30, 54, 78, 102
        }, new ECBlocks[] {
            obj22, obj23, obj24, obj25
        });
        obj23 = new ECBlocks(30, new ECB[] {
            new ECB(6, 117), new ECB(4, 118)
        });
        obj24 = new ECBlocks(28, new ECB[] {
            new ECB(6, 45), new ECB(14, 46)
        });
        obj25 = new ECBlocks(30, new ECB[] {
            new ECB(11, 24), new ECB(16, 25)
        });
        Object obj26 = new ECBlocks(30, new ECB[] {
            new ECB(30, 16), new ECB(2, 17)
        });
        obj23 = new Version(24, new int[] {
            6, 28, 54, 80, 106
        }, new ECBlocks[] {
            obj23, obj24, obj25, obj26
        });
        obj24 = new ECBlocks(26, new ECB[] {
            new ECB(8, 106), new ECB(4, 107)
        });
        obj25 = new ECBlocks(28, new ECB[] {
            new ECB(8, 47), new ECB(13, 48)
        });
        obj26 = new ECBlocks(30, new ECB[] {
            new ECB(7, 24), new ECB(22, 25)
        });
        Object obj27 = new ECBlocks(30, new ECB[] {
            new ECB(22, 15), new ECB(13, 16)
        });
        obj24 = new Version(25, new int[] {
            6, 32, 58, 84, 110
        }, new ECBlocks[] {
            obj24, obj25, obj26, obj27
        });
        obj25 = new ECBlocks(28, new ECB[] {
            new ECB(10, 114), new ECB(2, 115)
        });
        obj26 = new ECBlocks(28, new ECB[] {
            new ECB(19, 46), new ECB(4, 47)
        });
        obj27 = new ECBlocks(28, new ECB[] {
            new ECB(28, 22), new ECB(6, 23)
        });
        Object obj28 = new ECBlocks(30, new ECB[] {
            new ECB(33, 16), new ECB(4, 17)
        });
        obj25 = new Version(26, new int[] {
            6, 30, 58, 86, 114
        }, new ECBlocks[] {
            obj25, obj26, obj27, obj28
        });
        obj26 = new ECBlocks(30, new ECB[] {
            new ECB(8, 122), new ECB(4, 123)
        });
        obj27 = new ECBlocks(28, new ECB[] {
            new ECB(22, 45), new ECB(3, 46)
        });
        obj28 = new ECBlocks(30, new ECB[] {
            new ECB(8, 23), new ECB(26, 24)
        });
        Object obj29 = new ECBlocks(30, new ECB[] {
            new ECB(12, 15), new ECB(28, 16)
        });
        obj26 = new Version(27, new int[] {
            6, 34, 62, 90, 118
        }, new ECBlocks[] {
            obj26, obj27, obj28, obj29
        });
        obj27 = new ECBlocks(30, new ECB[] {
            new ECB(3, 117), new ECB(10, 118)
        });
        obj28 = new ECBlocks(28, new ECB[] {
            new ECB(3, 45), new ECB(23, 46)
        });
        obj29 = new ECBlocks(30, new ECB[] {
            new ECB(4, 24), new ECB(31, 25)
        });
        Object obj30 = new ECBlocks(30, new ECB[] {
            new ECB(11, 15), new ECB(31, 16)
        });
        obj27 = new Version(28, new int[] {
            6, 26, 50, 74, 98, 122
        }, new ECBlocks[] {
            obj27, obj28, obj29, obj30
        });
        obj28 = new ECBlocks(30, new ECB[] {
            new ECB(7, 116), new ECB(7, 117)
        });
        obj29 = new ECBlocks(28, new ECB[] {
            new ECB(21, 45), new ECB(7, 46)
        });
        obj30 = new ECBlocks(30, new ECB[] {
            new ECB(1, 23), new ECB(37, 24)
        });
        Object obj31 = new ECBlocks(30, new ECB[] {
            new ECB(19, 15), new ECB(26, 16)
        });
        obj28 = new Version(29, new int[] {
            6, 30, 54, 78, 102, 126
        }, new ECBlocks[] {
            obj28, obj29, obj30, obj31
        });
        obj29 = new ECBlocks(30, new ECB[] {
            new ECB(5, 115), new ECB(10, 116)
        });
        obj30 = new ECBlocks(28, new ECB[] {
            new ECB(19, 47), new ECB(10, 48)
        });
        obj31 = new ECBlocks(30, new ECB[] {
            new ECB(15, 24), new ECB(25, 25)
        });
        Object obj32 = new ECBlocks(30, new ECB[] {
            new ECB(23, 15), new ECB(25, 16)
        });
        obj29 = new Version(30, new int[] {
            6, 26, 52, 78, 104, 130
        }, new ECBlocks[] {
            obj29, obj30, obj31, obj32
        });
        obj30 = new ECBlocks(30, new ECB[] {
            new ECB(13, 115), new ECB(3, 116)
        });
        obj31 = new ECBlocks(28, new ECB[] {
            new ECB(2, 46), new ECB(29, 47)
        });
        obj32 = new ECBlocks(30, new ECB[] {
            new ECB(42, 24), new ECB(1, 25)
        });
        Object obj33 = new ECBlocks(30, new ECB[] {
            new ECB(23, 15), new ECB(28, 16)
        });
        obj30 = new Version(31, new int[] {
            6, 30, 56, 82, 108, 134
        }, new ECBlocks[] {
            obj30, obj31, obj32, obj33
        });
        obj31 = new ECBlocks(30, new ECB[] {
            new ECB(17, 115)
        });
        obj32 = new ECBlocks(28, new ECB[] {
            new ECB(10, 46), new ECB(23, 47)
        });
        obj33 = new ECBlocks(30, new ECB[] {
            new ECB(10, 24), new ECB(35, 25)
        });
        Object obj34 = new ECBlocks(30, new ECB[] {
            new ECB(19, 15), new ECB(35, 16)
        });
        obj31 = new Version(32, new int[] {
            6, 34, 60, 86, 112, 138
        }, new ECBlocks[] {
            obj31, obj32, obj33, obj34
        });
        obj32 = new ECBlocks(30, new ECB[] {
            new ECB(17, 115), new ECB(1, 116)
        });
        obj33 = new ECBlocks(28, new ECB[] {
            new ECB(14, 46), new ECB(21, 47)
        });
        obj34 = new ECBlocks(30, new ECB[] {
            new ECB(29, 24), new ECB(19, 25)
        });
        Object obj35 = new ECBlocks(30, new ECB[] {
            new ECB(11, 15), new ECB(46, 16)
        });
        obj32 = new Version(33, new int[] {
            6, 30, 58, 86, 114, 142
        }, new ECBlocks[] {
            obj32, obj33, obj34, obj35
        });
        obj33 = new ECBlocks(30, new ECB[] {
            new ECB(13, 115), new ECB(6, 116)
        });
        obj34 = new ECBlocks(28, new ECB[] {
            new ECB(14, 46), new ECB(23, 47)
        });
        obj35 = new ECBlocks(30, new ECB[] {
            new ECB(44, 24), new ECB(7, 25)
        });
        Object obj36 = new ECBlocks(30, new ECB[] {
            new ECB(59, 16), new ECB(1, 17)
        });
        obj33 = new Version(34, new int[] {
            6, 34, 62, 90, 118, 146
        }, new ECBlocks[] {
            obj33, obj34, obj35, obj36
        });
        obj34 = new ECBlocks(30, new ECB[] {
            new ECB(12, 121), new ECB(7, 122)
        });
        obj35 = new ECBlocks(28, new ECB[] {
            new ECB(12, 47), new ECB(26, 48)
        });
        obj36 = new ECBlocks(30, new ECB[] {
            new ECB(39, 24), new ECB(14, 25)
        });
        Object obj37 = new ECBlocks(30, new ECB[] {
            new ECB(22, 15), new ECB(41, 16)
        });
        obj34 = new Version(35, new int[] {
            6, 30, 54, 78, 102, 126, 150
        }, new ECBlocks[] {
            obj34, obj35, obj36, obj37
        });
        obj35 = new ECBlocks(30, new ECB[] {
            new ECB(6, 121), new ECB(14, 122)
        });
        obj36 = new ECBlocks(28, new ECB[] {
            new ECB(6, 47), new ECB(34, 48)
        });
        obj37 = new ECBlocks(30, new ECB[] {
            new ECB(46, 24), new ECB(10, 25)
        });
        Object obj38 = new ECBlocks(30, new ECB[] {
            new ECB(2, 15), new ECB(64, 16)
        });
        obj35 = new Version(36, new int[] {
            6, 24, 50, 76, 102, 128, 154
        }, new ECBlocks[] {
            obj35, obj36, obj37, obj38
        });
        obj36 = new ECBlocks(30, new ECB[] {
            new ECB(17, 122), new ECB(4, 123)
        });
        obj37 = new ECBlocks(28, new ECB[] {
            new ECB(29, 46), new ECB(14, 47)
        });
        obj38 = new ECBlocks(30, new ECB[] {
            new ECB(49, 24), new ECB(10, 25)
        });
        ECBlocks ecblocks = new ECBlocks(30, new ECB[] {
            new ECB(24, 15), new ECB(46, 16)
        });
        obj36 = new Version(37, new int[] {
            6, 28, 54, 80, 106, 132, 158
        }, new ECBlocks[] {
            obj36, obj37, obj38, ecblocks
        });
        obj37 = new ECBlocks(30, new ECB[] {
            new ECB(4, 122), new ECB(18, 123)
        });
        obj38 = new ECBlocks(28, new ECB[] {
            new ECB(13, 46), new ECB(32, 47)
        });
        ecblocks = new ECBlocks(30, new ECB[] {
            new ECB(48, 24), new ECB(14, 25)
        });
        ECBlocks ecblocks1 = new ECBlocks(30, new ECB[] {
            new ECB(42, 15), new ECB(32, 16)
        });
        obj37 = new Version(38, new int[] {
            6, 32, 58, 84, 110, 136, 162
        }, new ECBlocks[] {
            obj37, obj38, ecblocks, ecblocks1
        });
        obj38 = new ECBlocks(30, new ECB[] {
            new ECB(20, 117), new ECB(4, 118)
        });
        ecblocks = new ECBlocks(28, new ECB[] {
            new ECB(40, 47), new ECB(7, 48)
        });
        ecblocks1 = new ECBlocks(30, new ECB[] {
            new ECB(43, 24), new ECB(22, 25)
        });
        ECBlocks ecblocks2 = new ECBlocks(30, new ECB[] {
            new ECB(10, 15), new ECB(67, 16)
        });
        obj38 = new Version(39, new int[] {
            6, 26, 54, 82, 110, 138, 166
        }, new ECBlocks[] {
            obj38, ecblocks, ecblocks1, ecblocks2
        });
        ecblocks = new ECBlocks(30, new ECB[] {
            new ECB(19, 118), new ECB(6, 119)
        });
        ecblocks1 = new ECBlocks(28, new ECB[] {
            new ECB(18, 47), new ECB(31, 48)
        });
        ecblocks2 = new ECBlocks(30, new ECB[] {
            new ECB(34, 24), new ECB(34, 25)
        });
        ECBlocks ecblocks3 = new ECBlocks(30, new ECB[] {
            new ECB(20, 15), new ECB(61, 16)
        });
        return (new Version[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
            obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
            obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new Version(40, new int[] {
                6, 30, 58, 86, 114, 142, 170
            }, new ECBlocks[] {
                ecblocks, ecblocks1, ecblocks2, ecblocks3
            })
        });
    }

    static Version decodeVersionInformation(int i)
    {
        int k = 0x7fffffff;
        int l = 0;
        for (int j = 0; j < VERSION_DECODE_INFO.length;)
        {
            int i1 = VERSION_DECODE_INFO[j];
            if (i1 == i)
            {
                return getVersionForNumber(j + 7);
            }
            int j1 = FormatInformation.numBitsDiffering(i, i1);
            i1 = k;
            if (j1 < k)
            {
                l = j + 7;
                i1 = j1;
            }
            j++;
            k = i1;
        }

        if (k <= 3)
        {
            return getVersionForNumber(l);
        } else
        {
            return null;
        }
    }

    public static Version getProvisionalVersionForDimension(int i)
        throws FormatException
    {
        if (i % 4 != 1)
        {
            throw FormatException.getFormatInstance();
        }
        Version version;
        try
        {
            version = getVersionForNumber(i - 17 >> 2);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw FormatException.getFormatInstance();
        }
        return version;
    }

    public static Version getVersionForNumber(int i)
    {
        if (i <= 0 || i > 40)
        {
            throw new IllegalArgumentException();
        } else
        {
            return VERSIONS[i - 1];
        }
    }

    final BitMatrix buildFunctionPattern()
    {
        int k = getDimensionForVersion();
        BitMatrix bitmatrix = new BitMatrix(k);
        bitmatrix.setRegion(0, 0, 9, 9);
        bitmatrix.setRegion(k - 8, 0, 8, 9);
        bitmatrix.setRegion(0, k - 8, 9, 8);
        int l = alignmentPatternCenters.length;
        for (int i = 0; i < l; i++)
        {
            int i1 = alignmentPatternCenters[i];
            for (int j = 0; j < l; j++)
            {
                if ((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0))
                {
                    bitmatrix.setRegion(alignmentPatternCenters[j] - 2, i1 - 2, 5, 5);
                }
            }

        }

        bitmatrix.setRegion(6, 9, 1, k - 17);
        bitmatrix.setRegion(9, 6, k - 17, 1);
        if (versionNumber > 6)
        {
            bitmatrix.setRegion(k - 11, 0, 3, 6);
            bitmatrix.setRegion(0, k - 11, 6, 3);
        }
        return bitmatrix;
    }

    public final int[] getAlignmentPatternCenters()
    {
        return alignmentPatternCenters;
    }

    public final int getDimensionForVersion()
    {
        return versionNumber * 4 + 17;
    }

    public final ECBlocks getECBlocksForLevel(ErrorCorrectionLevel errorcorrectionlevel)
    {
        return ecBlocks[errorcorrectionlevel.ordinal()];
    }

    public final int getTotalCodewords()
    {
        return totalCodewords;
    }

    public final int getVersionNumber()
    {
        return versionNumber;
    }

    public final String toString()
    {
        return String.valueOf(versionNumber);
    }

}
