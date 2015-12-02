// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.Util;

abstract class Atom
{

    public static final int A = Util.e("esds");
    public static final int B = Util.e("moof");
    public static final int C = Util.e("traf");
    public static final int D = Util.e("mvex");
    public static final int E = Util.e("tkhd");
    public static final int F = Util.e("mdhd");
    public static final int G = Util.e("hdlr");
    public static final int H = Util.e("stsd");
    public static final int I = Util.e("pssh");
    public static final int J = Util.e("sinf");
    public static final int K = Util.e("schm");
    public static final int L = Util.e("schi");
    public static final int M = Util.e("tenc");
    public static final int N = Util.e("encv");
    public static final int O = Util.e("enca");
    public static final int P = Util.e("frma");
    public static final int Q = Util.e("saiz");
    public static final int R = Util.e("uuid");
    public static final int S = Util.e("senc");
    public static final int T = Util.e("pasp");
    public static final int U = Util.e("TTML");
    public static final int V = Util.e("vmhd");
    public static final int W = Util.e("smhd");
    public static final int X = Util.e("mp4v");
    public static final int Y = Util.e("stts");
    public static final int Z = Util.e("stss");
    public static final int a = Util.e("ftyp");
    public static final int aa = Util.e("ctts");
    public static final int ab = Util.e("stsc");
    public static final int ac = Util.e("stsz");
    public static final int ad = Util.e("stco");
    public static final int ae = Util.e("co64");
    public static final int af = Util.e("tx3g");
    public static final int b = Util.e("avc1");
    public static final int c = Util.e("avc3");
    public static final int d = Util.e("hvc1");
    public static final int e = Util.e("hev1");
    public static final int f = Util.e("s263");
    public static final int g = Util.e("d263");
    public static final int h = Util.e("mdat");
    public static final int i = Util.e("mp4a");
    public static final int j = Util.e("ac-3");
    public static final int k = Util.e("dac3");
    public static final int l = Util.e("ec-3");
    public static final int m = Util.e("dec3");
    public static final int n = Util.e("tfdt");
    public static final int o = Util.e("tfhd");
    public static final int p = Util.e("trex");
    public static final int q = Util.e("trun");
    public static final int r = Util.e("sidx");
    public static final int s = Util.e("moov");
    public static final int t = Util.e("mvhd");
    public static final int u = Util.e("trak");
    public static final int v = Util.e("mdia");
    public static final int w = Util.e("minf");
    public static final int x = Util.e("stbl");
    public static final int y = Util.e("avcC");
    public static final int z = Util.e("hvcC");
    public final int ag;

    public Atom(int i1)
    {
        ag = i1;
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
        return c(ag);
    }

}
