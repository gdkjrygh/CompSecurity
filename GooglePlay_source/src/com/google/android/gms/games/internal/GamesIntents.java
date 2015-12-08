// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;

public final class GamesIntents
{

    public static final void addObfuscatedAccount(Bundle bundle, String s)
    {
        bundle.putString("com.google.android.gms.games.ACCOUNT_KEY", Integer.toHexString(s.hashCode()));
    }

    public static final boolean checkObfuscatedAccount(Bundle bundle, String s)
    {
        return Objects.equal(Integer.toHexString(s.hashCode()), bundle.getString("com.google.android.gms.games.ACCOUNT_KEY"));
    }

    public static final int getClientVersion(Intent intent)
    {
        intent = intent.getData();
        if (intent == null)
        {
            intent = null;
        } else
        {
            intent = intent.getSchemeSpecificPart();
        }
        if (intent == null)
        {
            return -1;
        } else
        {
            return Integer.parseInt(intent);
        }
    }

    public static final Intent prepForClient(Intent intent, int i, String s)
    {
        intent.setData(Uri.fromParts("version", Integer.toString(i), null));
        if (TextUtils.isEmpty(s))
        {
            return intent;
        } else
        {
            Bundle bundle = new Bundle();
            addObfuscatedAccount(bundle, s);
            return intent.putExtras(bundle);
        }
    }
}
