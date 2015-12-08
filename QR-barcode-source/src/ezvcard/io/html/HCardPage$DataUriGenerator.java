// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.html;

import ezvcard.util.DataUri;

// Referenced classes of package ezvcard.io.html:
//            HCardPage

public static class 
{

    public String generate(String s, byte abyte0[])
    {
        return (new DataUri(s, abyte0)).toString();
    }

    public ()
    {
    }
}
