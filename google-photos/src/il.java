// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.ConnectivityManager;

final class il
    implements ii
{

    il()
    {
    }

    public final boolean a(ConnectivityManager connectivitymanager)
    {
        return connectivitymanager.isActiveNetworkMetered();
    }
}
