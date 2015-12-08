// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_languageCodeList[];
    public String m_languageNameList[];

    public void init(byte abyte0[][], byte abyte1[][])
    {
        m_languageCodeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_languageNameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
    }

    public ()
    {
    }
}
