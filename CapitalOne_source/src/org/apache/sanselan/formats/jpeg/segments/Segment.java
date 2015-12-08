// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.jpeg.segments;

import org.apache.sanselan.common.BinaryFileParser;

public abstract class Segment extends BinaryFileParser
{

    public final int t_;
    public final int u_;

    public Segment(int i, int j)
    {
        t_ = i;
        u_ = j;
    }

    public abstract String d();

    public final String e()
    {
        switch (t_)
        {
        default:
            if (t_ >= 65282 && t_ <= 65471)
            {
                return "Reserved";
            }
            break;

        case 65472: 
            return "Start Of Frame, Baseline DCT, Huffman coding";

        case 65473: 
            return "Start Of Frame, Extended sequential DCT, Huffman coding";

        case 65474: 
            return "Start Of Frame, Progressive DCT, Huffman coding";

        case 65475: 
            return "Start Of Frame, Lossless (sequential), Huffman coding";

        case 65477: 
            return "Start Of Frame, Differential sequential DCT, Huffman coding";

        case 65478: 
            return "Start Of Frame, Differential progressive DCT, Huffman coding";

        case 65479: 
            return "Start Of Frame, Differential lossless (sequential), Huffman coding";

        case 65480: 
            return "Start Of Frame, Reserved for JPEG extensions, arithmetic coding";

        case 65481: 
            return "Start Of Frame, Extended sequential DCT, arithmetic coding";

        case 65482: 
            return "Start Of Frame, Progressive DCT, arithmetic coding";

        case 65483: 
            return "Start Of Frame, Lossless (sequential), arithmetic coding";

        case 65485: 
            return "Start Of Frame, Differential sequential DCT, arithmetic coding";

        case 65486: 
            return "Start Of Frame, Differential progressive DCT, arithmetic coding";

        case 65487: 
            return "Start Of Frame, Differential lossless (sequential), arithmetic coding";

        case 65476: 
            return "Define Huffman table(s)";

        case 65484: 
            return "Define arithmetic coding conditioning(s)";

        case 65488: 
            return "Restart with modulo 8 count 0";

        case 65489: 
            return "Restart with modulo 8 count 1";

        case 65490: 
            return "Restart with modulo 8 count 2";

        case 65491: 
            return "Restart with modulo 8 count 3";

        case 65492: 
            return "Restart with modulo 8 count 4";

        case 65493: 
            return "Restart with modulo 8 count 5";

        case 65494: 
            return "Restart with modulo 8 count 6";

        case 65495: 
            return "Restart with modulo 8 count 7";

        case 65496: 
            return "Start of image";

        case 65497: 
            return "End of image";

        case 65498: 
            return "Start of scan";

        case 65499: 
            return "Define quantization table(s)";

        case 65500: 
            return "Define number of lines";

        case 65501: 
            return "Define restart interval";

        case 65502: 
            return "Define hierarchical progression";

        case 65503: 
            return "Expand reference component(s)";

        case 65534: 
            return "Comment";

        case 65281: 
            return "For temporary private use in arithmetic coding";
        }
        if (t_ >= 65504 && t_ <= 65519)
        {
            return (new StringBuilder("APP")).append(t_ - 65504).toString();
        }
        if (t_ >= 65520 && t_ <= 65533)
        {
            return (new StringBuilder("JPG")).append(t_ - 65504).toString();
        } else
        {
            return "Unknown";
        }
    }

    public String toString()
    {
        return (new StringBuilder("[Segment: ")).append(d()).append("]").toString();
    }
}
