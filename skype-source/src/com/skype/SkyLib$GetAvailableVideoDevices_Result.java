// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_deviceNames[];
    public String m_devicePaths[];
    public int m_return;

    public void init(byte abyte0[][], byte abyte1[][], int i)
    {
        m_deviceNames = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_devicePaths = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_return = i;
    }

    public ()
    {
    }
}
