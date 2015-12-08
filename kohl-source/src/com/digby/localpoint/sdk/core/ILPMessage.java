// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core;

import java.util.Date;
import java.util.Map;

// Referenced classes of package com.digby.localpoint.sdk.core:
//            ILPID

public interface ILPMessage
{

    public abstract String getBody();

    public abstract Date getExpirationDate();

    public abstract ILPID getID();

    public abstract Map getMetadata();

    public abstract String getMetadataValue(String s);

    public abstract String getTitle();

    public abstract boolean isRead();
}
