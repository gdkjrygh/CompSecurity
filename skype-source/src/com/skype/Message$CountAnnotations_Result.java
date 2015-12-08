// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Message, NativeStringConvert

public static class 
{

    public int m_counts[];
    public String m_keys[];

    public void init(byte abyte0[][], int ai[])
    {
        m_keys = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_counts = ai;
    }

    public ()
    {
    }
}
