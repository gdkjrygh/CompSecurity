// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import java.io.Serializable;
import java.net.HttpCookie;

public class SerializableCookie
    implements Serializable
{

    private transient HttpCookie a;

    public SerializableCookie(HttpCookie httpcookie)
    {
        a = null;
        a = httpcookie;
    }

    public final HttpCookie a()
    {
        return a;
    }
}
