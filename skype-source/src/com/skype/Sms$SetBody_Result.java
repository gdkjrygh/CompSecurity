// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Sms, NativeStringConvert

public static class 
{

    public int m_charsUntilNextChunk;
    public String m_chunks[];
    public m_return m_return;

    public void init(byte abyte0[][], int i,  )
    {
        m_chunks = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_charsUntilNextChunk = i;
        m_return = ;
    }

    public ()
    {
    }
}
