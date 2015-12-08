// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.exceptions;

import org.keyczar.i18n.Messages;

// Referenced classes of package org.keyczar.exceptions:
//            KeyczarException

public class ShortCiphertextException extends KeyczarException
{

    public ShortCiphertextException(int i)
    {
        super(Messages.getString("CiphertextTooShort", new Object[] {
            Integer.valueOf(i)
        }));
    }
}
