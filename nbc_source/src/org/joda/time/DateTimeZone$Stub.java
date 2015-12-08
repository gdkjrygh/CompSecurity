// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

// Referenced classes of package org.joda.time:
//            DateTimeZone

private static final class iID
    implements Serializable
{

    private static final long serialVersionUID = 0xa62f019a7c321ae3L;
    private transient String iID;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException
    {
        iID = objectinputstream.readUTF();
    }

    private Object readResolve()
        throws ObjectStreamException
    {
        return DateTimeZone.forID(iID);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeUTF(iID);
    }

    (String s)
    {
        iID = s;
    }
}
