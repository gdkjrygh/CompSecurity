// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, NativeStringConvert

public static class 
{

    public String m_matchingSkypenames[];
    public boolean m_return;

    public void init(byte abyte0[][], boolean flag)
    {
        m_matchingSkypenames = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
        m_return = flag;
    }

    public ()
    {
    }
}
