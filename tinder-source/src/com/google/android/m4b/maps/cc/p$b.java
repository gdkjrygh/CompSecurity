// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;


// Referenced classes of package com.google.android.m4b.maps.cc:
//            p

static final class 
{

    boolean a;
    boolean b;
    float c;
    int d;
    int e;
    int f;
    int g;

    public final String toString()
    {
        String s = String.valueOf("RoadAttributes{draw?=");
        boolean flag = a;
        boolean flag1 = b;
        float f1 = c;
        String s1 = String.valueOf(Integer.toHexString(d));
        String s2 = String.valueOf(Integer.toHexString(e));
        String s3 = String.valueOf(Integer.toHexString(f));
        String s4 = String.valueOf(Integer.toHexString(g));
        return (new StringBuilder(String.valueOf(s).length() + 97 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(flag).append(", renderAsLine?=").append(flag1).append(", width=").append(f1).append(", outline=").append(s1).append(", fill=").append(s2).append(", highlight=").append(s3).append(", dashedHighlight=").append(s4).append("}").toString();
    }

    ()
    {
    }
}
