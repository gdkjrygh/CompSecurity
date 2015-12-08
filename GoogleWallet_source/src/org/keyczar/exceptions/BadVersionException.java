// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.exceptions;

import org.keyczar.i18n.Messages;

// Referenced classes of package org.keyczar.exceptions:
//            KeyczarException

public class BadVersionException extends KeyczarException
{

    public BadVersionException(byte byte0)
    {
        super(Messages.getString("BadVersionNumber", new Object[] {
            Byte.valueOf(byte0)
        }));
    }
}
