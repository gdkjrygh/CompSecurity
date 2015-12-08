// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpHeaders;
import java.io.IOException;

public interface BatchCallback
{

    public abstract void onFailure(Object obj, HttpHeaders httpheaders)
        throws IOException;

    public abstract void onSuccess(Object obj, HttpHeaders httpheaders)
        throws IOException;
}
