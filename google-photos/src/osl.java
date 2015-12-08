// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Set;

public final class osl extends bas
{

    public static final osl a = new osl();
    private static final Set b;
    private static final Set c;
    private static final Set d;

    public osl()
    {
    }

    public final baz a(String s)
    {
        if ("moov".equals(s))
        {
            return new bbt();
        }
        if ("mvhd".equals(s))
        {
            return new bbu();
        }
        if ("ftyp".equals(s))
        {
            return new bbl();
        }
        if ("mdat".equals(s))
        {
            return new bcz();
        }
        if ("moov".equals(s))
        {
            return new bbt();
        }
        if ("mvhd".equals(s))
        {
            return new bbu();
        }
        if ("trak".equals(s))
        {
            return new bcm();
        }
        if ("tkhd".equals(s))
        {
            return new bcn();
        }
        if ("edts".equals(s))
        {
            return new bbi();
        }
        if ("elst".equals(s))
        {
            return new bbj();
        }
        if ("mdia".equals(s))
        {
            return new bbq();
        }
        if ("mdhd".equals(s))
        {
            return new bbr();
        }
        if ("vmhd".equals(s))
        {
            return new bcq();
        }
        if ("smhd".equals(s))
        {
            return new bcd();
        }
        if ("sthd".equals(s))
        {
            return new bci();
        }
        if ("hmhd".equals(s))
        {
            return new bbp();
        }
        if ("hdlr".equals(s))
        {
            return new bbo();
        }
        if ("minf".equals(s))
        {
            return new bbs();
        }
        if ("dinf".equals(s))
        {
            return new bbg();
        }
        if ("dref".equals(s))
        {
            return new bbh();
        }
        if ("url ".equals(s))
        {
            return new bbf();
        }
        if ("stbl".equals(s))
        {
            return new bca();
        }
        if ("ctts".equals(s))
        {
            return new bbc();
        }
        if ("stsd".equals(s))
        {
            return new bby();
        }
        if ("stts".equals(s))
        {
            return new bck();
        }
        if ("stss".equals(s))
        {
            return new bcj();
        }
        if ("stsc".equals(s))
        {
            return new bcb();
        }
        if ("stsz".equals(s))
        {
            return new bbz();
        }
        if ("stco".equals(s))
        {
            return new bce();
        }
        if ("co64".equals(s))
        {
            return new bba();
        }
        if ("skip".equals(s))
        {
            return new bbn();
        }
        if ("free".equals(s))
        {
            return new bbm();
        }
        if ("sdtp".equals(s))
        {
            return new bbw();
        }
        if (b.contains(s))
        {
            return new bdc(s);
        }
        if (c.contains(s))
        {
            return new bdi(s);
        }
        if (d.contains(s))
        {
            return new bdf(s);
        }
        if ("stsd-stpp".equals(s))
        {
            return new qvk();
        }
        if ("stsd-mp4s".equals(s))
        {
            return new bde(s);
        }
        if ("udta".equals(s))
        {
            return new bcp();
        }
        if ("\251xyz".equals(s))
        {
            return new otj();
        } else
        {
            return new bco(s);
        }
    }

    static 
    {
        HashSet hashset = new HashSet();
        b = hashset;
        hashset.add("stsd-samr");
        b.add("stsd-sawb");
        b.add("stsd-mp4a");
        b.add("stsd-drms");
        b.add("stsd-alac");
        b.add("stsd-owma");
        b.add("stsd-ac-3");
        b.add("stsd-ec-3");
        b.add("stsd-lpcm");
        b.add("stsd-dtsc");
        b.add("stsd-dtsh");
        b.add("stsd-dtsl");
        b.add("stsd-dtse");
        b.add("stsd-mlpa");
        b.add("stsd-enca");
        hashset = new HashSet();
        c = hashset;
        hashset.add("stsd-encv");
        c.add("stsd-mp4v");
        c.add("stsd-s263");
        c.add("stsd-avc1");
        hashset = new HashSet();
        d = hashset;
        hashset.add("stsd-tx3g");
        d.add("stsd-enct");
    }
}
