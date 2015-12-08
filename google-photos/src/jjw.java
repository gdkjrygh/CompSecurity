// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjw extends Exception
{

    public jjw(int i, int j, int k, int l)
    {
        super((new StringBuilder(82)).append("AudioTrack init failed: ").append(i).append(", Config(").append(j).append(", ").append(k).append(", ").append(l).append(")").toString());
    }
}
