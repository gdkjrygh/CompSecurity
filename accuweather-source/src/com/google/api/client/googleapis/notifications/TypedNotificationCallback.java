// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.notifications:
//            UnparsedNotificationCallback, TypedNotification, UnparsedNotification, StoredChannel

public abstract class TypedNotificationCallback
    implements UnparsedNotificationCallback
{

    private static final long serialVersionUID = 1L;

    public TypedNotificationCallback()
    {
    }

    protected abstract Class getDataClass()
        throws IOException;

    protected abstract ObjectParser getObjectParser()
        throws IOException;

    protected abstract void onNotification(StoredChannel storedchannel, TypedNotification typednotification)
        throws IOException;

    public final void onNotification(StoredChannel storedchannel, UnparsedNotification unparsednotification)
        throws IOException
    {
        TypedNotification typednotification = new TypedNotification(unparsednotification);
        Object obj = unparsednotification.getContentType();
        if (obj != null)
        {
            obj = (new HttpMediaType(((String) (obj)))).getCharsetParameter();
            Class class1 = (Class)Preconditions.checkNotNull(getDataClass());
            typednotification.setContent(getObjectParser().parseAndClose(unparsednotification.getContentStream(), ((java.nio.charset.Charset) (obj)), class1));
        }
        onNotification(storedchannel, typednotification);
    }
}
