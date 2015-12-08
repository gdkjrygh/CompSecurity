// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public long m_IDs[];
    public String m_numbers[];
    public boolean m_return;
    public int m_states[];
    public int m_types[];

    public void init(int ai[], byte abyte0[][], long al[], int ai1[], boolean flag)
    {
        m_types = ai;
        m_numbers = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_IDs = al;
        m_states = ai1;
        m_return = flag;
    }

    public ()
    {
    }
}
