// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.io;

import org.apache.http.HttpMessage;

public interface HttpMessageWriter
{

    public abstract void write(HttpMessage httpmessage);
}
