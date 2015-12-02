// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.text.eia608;

import com.google.android.exoplayer.util.ParsableBitArray;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.ArrayList;

public final class Eia608Parser
{

    private static final int a[] = {
        32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 
        225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 
        52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 
        62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 
        72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
        82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 
        233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 
        102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 
        112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 
        122, 231, 247, 209, 241, 9632
    };
    private static final int b[] = {
        174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 
        232, 226, 234, 238, 244, 251
    };
    private static final int c[] = {
        193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 
        8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 
        202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 
        171, 187
    };
    private static final int d[] = {
        195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 
        125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 
        223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 
        9492, 9496
    };
    private final ParsableBitArray e = new ParsableBitArray();
    private final StringBuilder f = new StringBuilder();
    private final ArrayList g = new ArrayList();

    Eia608Parser()
    {
    }

    public static boolean a(int i, int j, ParsableByteArray parsablebytearray)
    {
        if (i == 4 && j >= 8)
        {
            i = parsablebytearray.d();
            j = parsablebytearray.f();
            int k = parsablebytearray.g();
            int l = parsablebytearray.j();
            int i1 = parsablebytearray.f();
            parsablebytearray.b(i);
            if (j == 181 && k == 49 && l == 0x47413934 && i1 == 3)
            {
                return true;
            }
        }
        return false;
    }

}
