// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public int m_receivedSizes[];
    public boolean m_return;
    public String m_streams[];

    public void init(byte abyte0[][], int ai[], boolean flag)
    {
        m_streams = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_receivedSizes = ai;
        m_return = flag;
    }

    public ()
    {
    }
}
