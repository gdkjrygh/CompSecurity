// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class bcg
{

    public long a;
    public List b;

    public bcg()
    {
        b = new ArrayList();
    }

    public final String toString()
    {
        String s = String.valueOf("SampleEntry{sampleDelta=");
        long l = a;
        int i = b.size();
        String s1 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 68 + String.valueOf(s1).length())).append(s).append(l).append(", subsampleCount=").append(i).append(", subsampleEntries=").append(s1).append("}").toString();
    }
}
