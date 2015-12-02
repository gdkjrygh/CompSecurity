// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import java.net.URL;

public interface bfk
{

    public abstract HttpURLConnection a();

    public abstract long c();

    public abstract int d();

    public abstract long getIfModifiedSince();

    public abstract URL getURL();

    public abstract boolean getUseCaches();

    public abstract boolean usingProxy();
}
