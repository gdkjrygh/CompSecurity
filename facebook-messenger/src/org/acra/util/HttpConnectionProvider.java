// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.util;

import java.net.HttpURLConnection;
import java.net.URL;

public interface HttpConnectionProvider
{

    public abstract HttpURLConnection getConnection(URL url);
}
