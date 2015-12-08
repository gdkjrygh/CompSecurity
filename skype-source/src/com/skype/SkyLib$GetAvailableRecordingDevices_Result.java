// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_handleList[];
    public String m_nameList[];
    public String m_productIdList[];
    public boolean m_return;

    public void init(byte abyte0[][], byte abyte1[][], byte abyte2[][], boolean flag)
    {
        m_handleList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_nameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_productIdList = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
        m_return = flag;
    }

    public ()
    {
    }
}
