// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui.sync;


public final class SyncUICase extends Enum
{

    public static final SyncUICase a;
    public static final SyncUICase b;
    public static final SyncUICase c;
    public static final SyncUICase d;
    public static final SyncUICase e;
    public static final SyncUICase f;
    public static final SyncUICase g;
    public static final SyncUICase h;
    public static final SyncUICase i;
    public static final SyncUICase j;
    public static final SyncUICase k;
    public static final SyncUICase l;
    public static final SyncUICase m;
    public static final SyncUICase n;
    public static final SyncUICase o;
    public static final SyncUICase p;
    public static final SyncUICase q;
    public static final SyncUICase r;
    public static final SyncUICase s;
    public static final SyncUICase t;
    public static final SyncUICase u;
    private static final SyncUICase v[];

    private SyncUICase(String s1, int i1)
    {
        super(s1, i1);
    }

    public static SyncUICase valueOf(String s1)
    {
        return (SyncUICase)Enum.valueOf(com/fitbit/galileo/ui/sync/SyncUICase, s1);
    }

    public static SyncUICase[] values()
    {
        return (SyncUICase[])v.clone();
    }

    static 
    {
        a = new SyncUICase("SYNC_IN_PROGRESS", 0);
        b = new SyncUICase("LIVE_DATA_IS_ESTABLISHING", 1);
        c = new SyncUICase("TRACKER_SYNCING", 2);
        d = new SyncUICase("RESTRICTION_UPDATE_REQ", 3);
        e = new SyncUICase("NETWORK_OFFLINE", 4);
        f = new SyncUICase("NETWORK_TIMEOUT", 5);
        g = new SyncUICase("RESTRICTION_BACKOFF_GENERAL", 6);
        h = new SyncUICase("BLE_STATUS_SUPPORTED", 7);
        i = new SyncUICase("BLUETOOTH_OFF", 8);
        j = new SyncUICase("GALILEO_BACK_OF_ALL", 9);
        k = new SyncUICase("GALILEO_BACK_OF_SYNC", 10);
        l = new SyncUICase("APP_BACK_OFF", 11);
        m = new SyncUICase("SYNC_WITH_SITE_FAILED", 12);
        n = new SyncUICase("TRACKER_NOT_FOUND", 13);
        o = new SyncUICase("INCORRECT_TRACKER_FIRMWARE", 14);
        p = new SyncUICase("MOBILE_TRACK_SYNC_BACKOFF", 15);
        q = new SyncUICase("BLE_STATUS_UNKNOWN", 16);
        r = new SyncUICase("BLE_STATUS_NOT_SUPPORTED", 17);
        s = new SyncUICase("BLE_STATUS_PARTIALLY_SUPPORTED", 18);
        t = new SyncUICase("IDLE", 19);
        u = new SyncUICase("UNKNOWN", 20);
        v = (new SyncUICase[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u
        });
    }
}
