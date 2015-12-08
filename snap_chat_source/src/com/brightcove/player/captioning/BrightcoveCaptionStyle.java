// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;


public abstract class BrightcoveCaptionStyle
{
    public static interface Builder
    {

        public abstract Builder backgroundColor(int i);

        public abstract Builder backgroundOpacity(int i);

        public abstract BrightcoveCaptionStyle build();

        public abstract Builder edgeColor(int i);

        public abstract Builder edgeType(int i);

        public abstract Builder fontSize(String s);

        public abstract Builder foregroundColor(int i);

        public abstract Builder foregroundOpacity(int i);

        public abstract Builder preset(int i);

        public abstract Builder typeface(String s);

        public abstract Builder windowColor(int i);

        public abstract Builder windowOpacity(int i);
    }


    public BrightcoveCaptionStyle()
    {
    }

    public static Builder builder()
    {
        return new ce.a();
    }

    public static BrightcoveCaptionStyle createCaptionStyle(String s, String s1, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        return builder().preset(-1).fontSize(s).typeface(s1).foregroundColor(i).foregroundOpacity(j).edgeType(k).edgeColor(l).backgroundColor(i1).backgroundOpacity(j1).windowColor(k1).windowOpacity(l1).build();
    }

    public static BrightcoveCaptionStyle createCaptionStyleFromPreset(String s, int i)
    {
        int k = -256;
        i;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 114
    //                   2 122
    //                   3 128;
           goto _L1 _L2 _L3 _L4
_L1:
        int j;
        j = 0xff000000;
        k = -1;
_L6:
        return builder().preset(i).fontSize(s).typeface("sans-serif").foregroundColor(k).foregroundOpacity(-1).edgeType(0).edgeColor(0xff000000).backgroundColor(j).backgroundOpacity(-1).windowColor(0).windowOpacity(0).build();
_L2:
        j = -1;
        k = 0xff000000;
        continue; /* Loop/switch isn't completed */
_L3:
        j = 0xff000000;
        continue; /* Loop/switch isn't completed */
_L4:
        j = 0xff0000ff;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static BrightcoveCaptionStyle updateStyleByPreferenceKey(BrightcoveCaptionStyle brightcovecaptionstyle, String s, Object obj)
    {
        String s1;
        String s2;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        s1 = brightcovecaptionstyle.typeface();
        s2 = brightcovecaptionstyle.fontSize();
        l1 = brightcovecaptionstyle.foregroundColor();
        k1 = brightcovecaptionstyle.foregroundOpacity();
        j1 = brightcovecaptionstyle.edgeType();
        i1 = brightcovecaptionstyle.edgeColor();
        l = brightcovecaptionstyle.backgroundColor();
        k = brightcovecaptionstyle.backgroundOpacity();
        j = brightcovecaptionstyle.windowColor();
        i2 = brightcovecaptionstyle.windowOpacity();
        i = -1;
        s.hashCode();
        JVM INSTR lookupswitch 10: default 156
    //                   -1236731529: 449
    //                   -1009808097: 465
    //                   -762839331: 433
    //                   -339562066: 327
    //                   -280051019: 417
    //                   75674378: 357
    //                   332759354: 342
    //                   1205119556: 402
    //                   1424864313: 387
    //                   1786850802: 372;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        i;
        JVM INSTR tableswitch 0 9: default 212
    //                   0 481
    //                   1 499
    //                   2 518
    //                   3 543
    //                   4 568
    //                   5 593
    //                   6 618
    //                   7 643
    //                   8 664
    //                   9 689;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L12:
        obj = s2;
        s = s1;
        i = k;
        k = i2;
_L23:
        if (l == 0)
        {
            i = 0;
        }
        if (j == 0)
        {
            k = 0;
        }
        return builder().preset(brightcovecaptionstyle.preset()).fontSize(((String) (obj))).typeface(s).foregroundColor(l1).foregroundOpacity(k1).edgeType(j1).edgeColor(i1).backgroundColor(l).backgroundOpacity(i).windowColor(j).windowOpacity(k).build();
_L5:
        if (s.equals("captioning_font_size"))
        {
            i = 0;
        }
          goto _L1
_L8:
        if (s.equals("captioning_typeface"))
        {
            i = 1;
        }
          goto _L1
_L7:
        if (s.equals("captioning_foreground_color"))
        {
            i = 2;
        }
          goto _L1
_L11:
        if (s.equals("captioning_foreground_opacity"))
        {
            i = 3;
        }
          goto _L1
_L10:
        if (s.equals("captioning_edge_type"))
        {
            i = 4;
        }
          goto _L1
_L9:
        if (s.equals("captioning_edge_color"))
        {
            i = 5;
        }
          goto _L1
_L6:
        if (s.equals("captioning_background_color"))
        {
            i = 6;
        }
          goto _L1
_L4:
        if (s.equals("captioning_background_opacity"))
        {
            i = 7;
        }
          goto _L1
_L2:
        if (s.equals("captioning_window_color"))
        {
            i = 8;
        }
          goto _L1
_L3:
        if (s.equals("captioning_window_opacity"))
        {
            i = 9;
        }
          goto _L1
_L13:
        obj = (String)obj;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L14:
        s = (String)obj;
        i = k;
        obj = s2;
        k = i2;
          goto _L23
_L15:
        l1 = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L16:
        k1 = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L17:
        j1 = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L18:
        i1 = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L19:
        l = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L20:
        i = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        k = i2;
          goto _L23
_L21:
        j = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = i2;
          goto _L23
_L22:
        int j2 = ((Integer)obj).intValue();
        obj = s2;
        s = s1;
        i = k;
        k = j2;
          goto _L23
    }

    public abstract int backgroundColor();

    public abstract int backgroundOpacity();

    public abstract int edgeColor();

    public abstract int edgeType();

    public abstract String fontSize();

    public abstract int foregroundColor();

    public abstract int foregroundOpacity();

    public abstract int preset();

    public abstract String typeface();

    public void validate()
    {
    }

    public abstract int windowColor();

    public abstract int windowOpacity();
}
