// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

public abstract class eja
{

    public final String b;

    eja(String s)
    {
        b = s;
    }

    public final Intent a(Context context, Bundle bundle)
    {
        return gms.a(context, c()).a(bundle).a;
    }

    protected abstract String a();

    public final String c()
    {
        String s;
        if (TextUtils.isEmpty(a()))
        {
            s = "";
        } else
        {
            s = (new StringBuilder(":")).append(a()).toString();
        }
        return (new StringBuilder("spotify:artist:")).append(b).append(s).toString();
    }

    public String d()
    {
        return (new StringBuilder("hm://artist/v1/")).append(b).append("/android?format=json&release_window=true").toString();
    }

    public String toString()
    {
        return c();
    }
}
