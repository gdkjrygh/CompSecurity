// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.cookie;

import java.util.Date;

public interface Cookie
{

    public abstract String getComment();

    public abstract String getCommentURL();

    public abstract String getDomain();

    public abstract Date getExpiryDate();

    public abstract String getName();

    public abstract String getPath();

    public abstract int[] getPorts();

    public abstract String getValue();

    public abstract int getVersion();

    public abstract boolean isExpired(Date date);

    public abstract boolean isPersistent();

    public abstract boolean isSecure();
}
