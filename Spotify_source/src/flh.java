// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class flh
{

    public final String a;
    public final int b;
    public final String c;

    public flh(String s, int i, String s1)
    {
        a = s;
        b = i;
        c = s1;
    }

    public final String toString()
    {
        return (new StringBuilder("Video{mUrl='")).append(a).append('\'').append(", mBitrate=").append(b).append(", mMimetype='").append(c).append('\'').append('}').toString();
    }
}
