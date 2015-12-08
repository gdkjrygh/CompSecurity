// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Translator, NativeStringConvert

public static class 
{

    public boolean m_return;
    public String m_speakerVoice;

    public void init(byte abyte0[], boolean flag)
    {
        m_speakerVoice = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        m_return = flag;
    }

    public ()
    {
    }
}
