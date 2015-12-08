// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.HashMap;

// Referenced classes of package com.amazon.device.associates:
//            bj

class i extends bj
{

    public static String a = "AsinURL";
    public static String b = "HomePage";
    public static String c = "Parameter";
    public static String d = "SearchCategory";
    public static String e = "PreviewPage";
    public static String f = "UdpDetailPage";
    public static String g = "UdpMP3AlbumDetailPage";
    public static String h = "UdpMP3TrackDetailPage";
    private HashMap l;

    i()
    {
        l = new HashMap();
    }

    public HashMap a()
    {
        return l;
    }

    public void a(String s, String s1)
    {
        l.put(s, s1);
    }

}
