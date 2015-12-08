// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_countryCodeList[];
    public String m_countryDialExampleList[];
    public String m_countryNameList[];
    public int m_countryPrefixList[];

    public void init(byte abyte0[][], byte abyte1[][], int ai[], byte abyte2[][])
    {
        m_countryCodeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_countryNameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_countryPrefixList = ai;
        m_countryDialExampleList = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
    }

    public ()
    {
    }
}
