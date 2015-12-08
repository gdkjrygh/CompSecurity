// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Account, NativeStringConvert

public static class 
{

    public String m_id[];
    public String m_name[];
    public String m_type[];

    public void init(byte abyte0[][], byte abyte1[][], byte abyte2[][])
    {
        m_id = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_name = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_type = NativeStringConvert.ConvertFromNativeStringArray(abyte2);
    }

    public ()
    {
    }
}
