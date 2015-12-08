// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime.content;


public interface ContentDescriptor
{

    public abstract String getCharset();

    public abstract long getContentLength();

    public abstract String getMediaType();

    public abstract String getMimeType();

    public abstract String getSubType();

    public abstract String getTransferEncoding();
}
