// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;

public class InvalidTokenException extends IOException
{

    private static final long serialVersionUID = 0x1b21452a1e1b139cL;

    public InvalidTokenException(int i, String s)
    {
        super((new StringBuilder("HTTP error:")).append(i).append(" (").append(s).append(")").toString());
    }
}
