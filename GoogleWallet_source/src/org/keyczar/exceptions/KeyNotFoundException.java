// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar.exceptions;

import org.keyczar.i18n.Messages;

// Referenced classes of package org.keyczar.exceptions:
//            KeyczarException

public class KeyNotFoundException extends KeyczarException
{

    KeyNotFoundException(String s)
    {
        super(s);
    }

    public KeyNotFoundException(byte abyte0[])
    {
        super(Messages.getString("KeyWithHashIdentifier", new Object[] {
            Integer.toHexString((abyte0[0] & 0xff) << 24 | (abyte0[1] & 0xff) << 16 | (abyte0[2] & 0xff) << 8 | abyte0[3] & 0xff)
        }));
    }
}
