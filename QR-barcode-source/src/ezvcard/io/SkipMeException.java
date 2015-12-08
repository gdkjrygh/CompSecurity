// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io;

import ezvcard.VCardException;

public class SkipMeException extends VCardException
{

    public SkipMeException()
    {
    }

    public SkipMeException(String s)
    {
        super(s);
    }
}
