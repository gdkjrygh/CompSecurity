// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import kik.a.d.k;

public final class ak
{

    private static k a;
    private static kik.android.chat.fragment.KikChatFragment.b b;

    public static kik.android.chat.fragment.KikChatFragment.b a(k k1)
    {
        if (k1 != null && k1.equals(a))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public static void a(kik.android.chat.fragment.KikChatFragment.b b1, k k1)
    {
        b = b1;
        a = k1;
    }
}
