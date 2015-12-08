// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//            MessageLite

public final class UninitializedMessageException extends RuntimeException
{

    private final List missingFields = null;

    public UninitializedMessageException(MessageLite messagelite)
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
