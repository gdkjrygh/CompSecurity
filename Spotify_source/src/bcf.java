// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class bcf
{

    public static final int A = bej.d("moof");
    public static final int B = bej.d("traf");
    public static final int C = bej.d("mvex");
    public static final int D = bej.d("tkhd");
    public static final int E = bej.d("mdhd");
    public static final int F = bej.d("hdlr");
    public static final int G = bej.d("stsd");
    public static final int H = bej.d("pssh");
    public static final int I = bej.d("sinf");
    public static final int J = bej.d("schm");
    public static final int K = bej.d("schi");
    public static final int L = bej.d("tenc");
    public static final int M = bej.d("encv");
    public static final int N = bej.d("enca");
    public static final int O = bej.d("frma");
    public static final int P = bej.d("saiz");
    public static final int Q = bej.d("uuid");
    public static final int R = bej.d("senc");
    public static final int S = bej.d("pasp");
    public static final int T = bej.d("TTML");
    public static final int U = bej.d("mp4v");
    public static final int V = bej.d("tx3g");
    public static final int a = bej.d("avc1");
    public static final int b = bej.d("avc3");
    public static final int c = bej.d("hvc1");
    public static final int d = bej.d("hev1");
    public static final int e = bej.d("s263");
    public static final int f = bej.d("d263");
    public static final int g = bej.d("mdat");
    public static final int h = bej.d("mp4a");
    public static final int i = bej.d("ac-3");
    public static final int j = bej.d("dac3");
    public static final int k = bej.d("ec-3");
    public static final int l = bej.d("dec3");
    public static final int m = bej.d("tfdt");
    public static final int n = bej.d("tfhd");
    public static final int o = bej.d("trex");
    public static final int p = bej.d("trun");
    public static final int q = bej.d("sidx");
    public static final int r = bej.d("moov");
    public static final int s = bej.d("mvhd");
    public static final int t = bej.d("trak");
    public static final int u = bej.d("mdia");
    public static final int v = bej.d("minf");
    public static final int w = bej.d("stbl");
    public static final int x = bej.d("avcC");
    public static final int y = bej.d("hvcC");
    public static final int z = bej.d("esds");
    public final int W;

    public bcf(int i1)
    {
        W = i1;
    }

    public static int a(int i1)
    {
        return i1 >> 24 & 0xff;
    }

    public static int b(int i1)
    {
        return 0xffffff & i1;
    }

    public static String c(int i1)
    {
        return (new StringBuilder()).append((char)(i1 >> 24)).append((char)(i1 >> 16 & 0xff)).append((char)(i1 >> 8 & 0xff)).append((char)(i1 & 0xff)).toString();
    }

    public String toString()
    {
        return c(W);
    }

    static 
    {
        bej.d("ftyp");
        bej.d("vmhd");
        bej.d("smhd");
        bej.d("stts");
        bej.d("stss");
        bej.d("ctts");
        bej.d("stsc");
        bej.d("stsz");
        bej.d("stco");
        bej.d("co64");
    }
}
