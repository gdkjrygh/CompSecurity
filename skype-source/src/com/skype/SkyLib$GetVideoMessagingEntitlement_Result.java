// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_ids[];
    public boolean m_isEntitled;
    public String m_planName;
    public int m_values[];

    public void init(boolean flag, byte abyte0[], byte abyte1[][], int ai[])
    {
        m_isEntitled = flag;
        m_planName = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        m_ids = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_values = ai;
    }

    public ()
    {
    }
}
