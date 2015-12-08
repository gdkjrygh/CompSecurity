// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class asv
{

    public byte a;
    public boolean b;
    public ata c;
    public atc d;
    public byte e;
    public byte f;
    public int g;
    int h;

    public asv()
    {
        a = 1;
        b = false;
        c = ata.a;
        d = atc.b;
        e = 0;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("").append("version ").append(a).append(", ");
        String s;
        if (b)
        {
            s = "compressed";
        } else
        {
            s = "uncompressed";
        }
        s = stringbuilder.append(s).append("\n").toString();
        s = (new StringBuilder()).append(s).append("frameType ").append(c).append(", serviceType ").append(d).toString();
        s = (new StringBuilder()).append(s).append("\nframeData ").append(e).toString();
        s = (new StringBuilder()).append(s).append(", sessionID ").append(f).toString();
        s = (new StringBuilder()).append(s).append(", dataSize ").append(g).toString();
        return (new StringBuilder()).append(s).append(", messageID ").append(h).toString();
    }
}
