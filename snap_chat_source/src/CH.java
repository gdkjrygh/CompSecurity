// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.snapchat.android.LandingPageActivity;

public final class CH
{

    public CH()
    {
    }

    public static Intent a(Context context, com.snapchat.android.notification.AndroidNotificationManager.Type type, com.snapchat.android.notification.AndroidNotificationManager.a a1, com.snapchat.android.notification.AndroidNotificationManager.b b, boolean flag)
    {
        context = new Intent(context, com/snapchat/android/LandingPageActivity);
        context.putExtra("fromNotification", true);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.notification.AndroidNotificationManager.Type.values().length];
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.FAILED_SNAP_AND_CHAT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.ADDFRIEND.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.STORIES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.SNAP.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.REPLAY.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.TYPING.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.SCREENSHOT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT_SCREENSHOT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.HERE_SCREENSHOT.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CASH.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CASH_MESSAGE.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[type.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 224
    //                   2 235
    //                   3 256;
           goto _L1 _L2 _L3 _L4
_L1:
        if (a1 != null)
        {
            context.putExtra("goToFragmentNum", 0);
            context.putExtra("friendUsername", a1.a);
            context.putExtra("seq_num", a1.c);
        } else
        {
            if (b != null)
            {
                context.putExtra("friendUsername", b.a);
                context.putExtra("snap_id", b.b);
            }
            context.putExtra("goToFragmentNum", 1);
        }
        if (flag)
        {
            context.putExtra("makeSyncRequest", true);
        }
        _cls1.a[type.ordinal()];
        JVM INSTR tableswitch 2 12: default 164
    //                   2 304
    //                   3 304
    //                   4 304
    //                   5 304
    //                   6 304
    //                   7 304
    //                   8 304
    //                   9 304
    //                   10 304
    //                   11 304
    //                   12 304;
           goto _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L6
_L5:
        if (com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT.equals(type) || com.snapchat.android.notification.AndroidNotificationManager.Type.CASH.equals(type) || com.snapchat.android.notification.AndroidNotificationManager.Type.CASH_MESSAGE.equals(type))
        {
            context.putExtra("chatOrCashFromServerNotification", true);
        }
        if (type != null)
        {
            context.setAction(type.getTypeNotificationAction());
        }
        context.setFlags(0x24000000);
        return context;
_L2:
        context.putExtra("goToFragmentNum", 1);
        break MISSING_BLOCK_LABEL_86;
_L3:
        context.putExtra("goToFragmentNum", 2);
        context.putExtra("destinationPage", com.snapchat.android.notification.AndroidNotificationManager.Destination.ADD_FRIENDS);
        break MISSING_BLOCK_LABEL_86;
_L4:
        context.putExtra("goToFragmentNum", 3);
        break MISSING_BLOCK_LABEL_86;
_L6:
        context.putExtra("fromServerNotification", true);
        context.putExtra("type", type.name());
        if (true) goto _L5; else goto _L7
_L7:
    }
}
