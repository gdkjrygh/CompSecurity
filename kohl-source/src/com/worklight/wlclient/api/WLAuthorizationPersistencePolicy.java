// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


public final class WLAuthorizationPersistencePolicy extends Enum
{

    private static final WLAuthorizationPersistencePolicy $VALUES[];
    public static final WLAuthorizationPersistencePolicy ALWAYS;
    public static final WLAuthorizationPersistencePolicy NEVER;

    private WLAuthorizationPersistencePolicy(String s, int i)
    {
        super(s, i);
    }

    public static WLAuthorizationPersistencePolicy valueOf(String s)
    {
        return (WLAuthorizationPersistencePolicy)Enum.valueOf(com/worklight/wlclient/api/WLAuthorizationPersistencePolicy, s);
    }

    public static WLAuthorizationPersistencePolicy[] values()
    {
        return (WLAuthorizationPersistencePolicy[])$VALUES.clone();
    }

    static 
    {
        ALWAYS = new WLAuthorizationPersistencePolicy("ALWAYS", 0);
        NEVER = new WLAuthorizationPersistencePolicy("NEVER", 1);
        $VALUES = (new WLAuthorizationPersistencePolicy[] {
            ALWAYS, NEVER
        });
    }
}
