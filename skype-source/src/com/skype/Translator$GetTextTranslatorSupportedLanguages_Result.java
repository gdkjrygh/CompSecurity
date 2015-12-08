// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Translator, NativeStringConvert

public static class 
{

    public String m_codeList[];
    public String m_namesList[];
    public boolean m_return;

    public void init(byte abyte0[][], byte abyte1[][], boolean flag)
    {
        m_codeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_namesList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
        m_return = flag;
    }

    public ()
    {
    }
}
