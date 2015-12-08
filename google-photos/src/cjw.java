// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cjw
{

    public static final int a = a("moov");
    public static final int b = a("mvhd");
    public static final int c = a("trak");
    public static final int d = a("tkhd");
    public static final int e = a("mdia");
    public static final int f = a("mdhd");
    public static final int g = a("hdlr");
    public static final int h = a("minf");
    public static final int i = a("vmhd");
    public static final int j = a("smhd");
    public static final int k = a("stbl");
    public static final int l = a("stsd");
    public static final int m = a("avc1");
    public static final int n = a("avcC");
    public static final int o = a("mp4v");
    public static final int p = a("mp4a");
    public static final int q = a("esds");
    public static final int r = a("stts");
    public static final int s = a("stss");
    public static final int t = a("stsc");
    public static final int u = a("stsz");
    public static final int v = a("stco");
    public static final int w = a("co64");

    private static int a(String s1)
    {
        int i1 = 0;
        b.a(s1.length(), "typeName.length()", 4, null);
        int j1 = 0;
        for (; i1 < 4; i1++)
        {
            j1 = j1 << 8 | s1.charAt(i1);
        }

        return j1;
    }

    static 
    {
        a("mdat");
    }
}
