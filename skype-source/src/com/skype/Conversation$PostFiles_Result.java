// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Conversation, NativeStringConvert

public static class 
{

    public  m_error_code;
    public String m_error_file;
    public int m_return;

    public void init( , byte abyte0[], int i)
    {
        m_error_code = ;
        m_error_file = NativeStringConvert.ConvertFromNativeBytes(abyte0);
        m_return = i;
    }

    public ()
    {
    }
}
