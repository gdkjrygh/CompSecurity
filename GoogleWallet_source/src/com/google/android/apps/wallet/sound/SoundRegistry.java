// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.sound;

import android.content.Context;
import android.net.Uri;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;

public final class SoundRegistry
{

    private static final ImmutableMap SOUNDS;

    public static Uri getSound(Context context, int i)
    {
        Preconditions.checkArgument(SOUNDS.containsKey(Integer.valueOf(i)));
        return getSoundByResId(context, ((Integer)SOUNDS.get(Integer.valueOf(i))).intValue());
    }

    private static Uri getSoundByResId(Context context, int i)
    {
        context = getWalletSoundUriPrefix(context);
        return Uri.parse((new StringBuilder(String.valueOf(context).length() + 11)).append(context).append(i).toString());
    }

    public static Uri getSoundWithDefault(Context context, Integer integer, int i)
    {
        Preconditions.checkArgument(SOUNDS.containsKey(Integer.valueOf(i)));
        if (integer != null && SOUNDS.containsKey(integer))
        {
            return getSoundByResId(context, ((Integer)SOUNDS.get(integer)).intValue());
        } else
        {
            return getSoundByResId(context, ((Integer)SOUNDS.get(Integer.valueOf(i))).intValue());
        }
    }

    private static String getWalletSoundUriPrefix(Context context)
    {
        context = String.valueOf(context.getPackageName());
        return (new StringBuilder(String.valueOf(context).length() + 20)).append("android.resource://").append(context).append("/").toString();
    }

    static 
    {
        SOUNDS = ImmutableMap.builder().put(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.walletnfcrel.R.raw.payment_info_sent)).put(Integer.valueOf(2), Integer.valueOf(com.google.android.apps.walletnfcrel.R.raw.payment_fail)).put(Integer.valueOf(3), Integer.valueOf(com.google.android.apps.walletnfcrel.R.raw.save_offer)).put(Integer.valueOf(4), Integer.valueOf(com.google.android.apps.walletnfcrel.R.raw.offer_nearby)).build();
    }
}
