// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class jkx
{

    public static final int A = jno.c("mdia");
    public static final int B = jno.c("minf");
    public static final int C = jno.c("stbl");
    public static final int D = jno.c("avcC");
    public static final int E = jno.c("hvcC");
    public static final int F = jno.c("esds");
    public static final int G = jno.c("moof");
    public static final int H = jno.c("traf");
    public static final int I = jno.c("mvex");
    public static final int J = jno.c("tkhd");
    public static final int K = jno.c("mdhd");
    public static final int L = jno.c("hdlr");
    public static final int M = jno.c("stsd");
    public static final int N = jno.c("pssh");
    public static final int O = jno.c("sinf");
    public static final int P = jno.c("schm");
    public static final int Q = jno.c("schi");
    public static final int R = jno.c("tenc");
    public static final int S = jno.c("encv");
    public static final int T = jno.c("enca");
    public static final int U = jno.c("frma");
    public static final int V = jno.c("saiz");
    public static final int W = jno.c("saio");
    public static final int X = jno.c("uuid");
    public static final int Y = jno.c("senc");
    public static final int Z = jno.c("pasp");
    public static final int a = jno.c("ftyp");
    public static final int aa = jno.c("TTML");
    public static final int ab = jno.c("vmhd");
    public static final int ac = jno.c("smhd");
    public static final int ad = jno.c("mp4v");
    public static final int ae = jno.c("stts");
    public static final int af = jno.c("stss");
    public static final int ag = jno.c("ctts");
    public static final int ah = jno.c("stsc");
    public static final int ai = jno.c("stsz");
    public static final int aj = jno.c("stco");
    public static final int ak = jno.c("co64");
    public static final int al = jno.c("tx3g");
    public static final int am = jno.c("stpp");
    public static final int b = jno.c("avc1");
    public static final int c = jno.c("avc3");
    public static final int d = jno.c("hvc1");
    public static final int e = jno.c("hev1");
    public static final int f = jno.c("s263");
    public static final int g = jno.c("d263");
    public static final int h = jno.c("mdat");
    public static final int i = jno.c("mp4a");
    public static final int j = jno.c("ac-3");
    public static final int k = jno.c("dac3");
    public static final int l = jno.c("ec-3");
    public static final int m = jno.c("dec3");
    public static final int n = jno.c("dtsc");
    public static final int o = jno.c("dtsh");
    public static final int p = jno.c("dtsl");
    public static final int q = jno.c("dtse");
    public static final int r = jno.c("ddts");
    public static final int s = jno.c("tfdt");
    public static final int t = jno.c("tfhd");
    public static final int u = jno.c("trex");
    public static final int v = jno.c("trun");
    public static final int w = jno.c("sidx");
    public static final int x = jno.c("moov");
    public static final int y = jno.c("mvhd");
    public static final int z = jno.c("trak");
    public final int an;

    public jkx(int i1)
    {
        an = i1;
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
        char c1 = (char)(i1 >> 24);
        char c2 = (char)(i1 >> 16 & 0xff);
        char c3 = (char)(i1 >> 8 & 0xff);
        char c4 = (char)(i1 & 0xff);
        return (new StringBuilder(4)).append(c1).append(c2).append(c3).append(c4).toString();
    }

    public String toString()
    {
        return c(an);
    }

}
