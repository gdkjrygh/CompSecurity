// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.session;

import java.io.Serializable;

// Referenced classes of package com.dropbox.client2.session:
//            TokenPair

public class AccessTokenPair extends TokenPair
    implements Serializable
{

    private static final long serialVersionUID = 0xb34deabbd94861bdL;

    public AccessTokenPair(String s, String s1)
    {
        super(s, s1);
    }
}
