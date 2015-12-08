// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Account, NativeStringConvert

public static class 
{

    public int m_endtime[];
    public String m_name[];
    public int m_package_type[];
    public int m_service_type[];
    public int m_status[];

    public void init(byte abyte0[][], int ai[], int ai1[], int ai2[], int ai3[])
    {
        m_name = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_endtime = ai;
        m_status = ai1;
        m_package_type = ai2;
        m_service_type = ai3;
    }

    public ()
    {
    }
}
