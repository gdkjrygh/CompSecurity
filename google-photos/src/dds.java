// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;

public class dds
{

    public final ConnectivityManager a;

    dds(Context context)
    {
        a = (ConnectivityManager)context.getSystemService("connectivity");
    }
}
