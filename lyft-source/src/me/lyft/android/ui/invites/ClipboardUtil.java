// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class ClipboardUtil
{

    public static final String CLIPBOARD_LABEL_REFERRAL_CODE = "LyftReferralCode";

    public ClipboardUtil()
    {
    }

    public static void copyToClipboard(Context context, String s)
    {
        s = ClipData.newPlainText("LyftReferralCode", s);
        ((ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(s);
    }
}
