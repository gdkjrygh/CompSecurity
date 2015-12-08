// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import java.util.Map;

public interface Router
{

    public abstract int resolve(String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver);

    public abstract int subscribe(String s, String s1, Map map, byte abyte0[], Resolver.CallbackReceiver callbackreceiver);

    public abstract void unsubscribe(int i);
}
