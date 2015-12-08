// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.a.a.a;
import com.a.a.c.g;
import com.kik.g.p;
import java.util.UUID;
import kik.android.chat.fragment.KikChatFragment;
import kik.android.chat.fragment.KikConversationsFragment;
import kik.android.chat.fragment.MissedConversationsFragment;
import kik.android.util.DeviceUtils;
import kik.android.util.av;

// Referenced classes of package kik.android.chat.activity:
//            k, ConversationsActivity, MissedConversationsActivity, ChatActivity, 
//            FragmentWrapperActivity

public static final class b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    private final Context a;
    private final Bundle b;
    private int c;
    private boolean d;
    private int e;
    private int f;

    private Intent a(boolean flag)
    {
        Intent intent;
        Object obj = b.getString("kik.android.util.FragmentBundle.FragmentClass");
        if (obj == null)
        {
            com.a.a.a.d().c.a((new StringBuilder("Null target for class : ")).append(b.getClass()).toString());
        }
        if (kik/android/chat/fragment/KikConversationsFragment.getCanonicalName().equals(obj))
        {
            obj = kik/android/chat/activity/ConversationsActivity;
        } else
        if (kik/android/chat/fragment/MissedConversationsFragment.getCanonicalName().equals(obj))
        {
            obj = kik/android/chat/activity/MissedConversationsActivity;
        } else
        if (kik/android/chat/fragment/KikChatFragment.getCanonicalName().equals(obj))
        {
            obj = kik/android/chat/activity/ChatActivity;
        } else
        {
            obj = kik/android/chat/activity/FragmentWrapperActivity;
        }
        intent = new Intent(a, ((Class) (obj)));
        if (c != a.b) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            if (kik.android.chat.activity.k.a(((Class) (obj)).getCanonicalName(), kik.android.chat.activity.k.g()))
            {
                intent.addFlags(0x4000000);
            } else
            {
                intent.putExtra("ActivityLaunchDescriptor.anim.override.enter", av.a(a, 0x10100bb));
                intent.putExtra("ActivityLaunchDescriptor.anim.override.exit", av.a(a, 0x10100ba));
                k.h();
                kik.android.chat.activity.k.a(UUID.randomUUID().toString());
            }
        } else
        {
            if (DeviceUtils.c())
            {
                throw new RuntimeException("You are attempting to use UP on an ActivityLaunchDescriptor that is not being immediately started by KActivityLauncher.This behavior is undefined and unsupported because the returned intent could be used for a later launch.If you want UP, please use startForResult. Otherwise you may be looking for treatAsRoot() which is the behavior this will fall back to on non-debug builds");
            }
            a(intent);
        }
        if (d)
        {
            intent.putExtra("com.kik.util.KActivityLauncher.no.refresh", true);
        }
_L4:
        if (f != -1)
        {
            intent.putExtra("ActivityLaunchDescriptor.anim.override.exit", f);
        }
        if (e != -1)
        {
            intent.putExtra("ActivityLaunchDescriptor.anim.override.enter", e);
        }
        b.putString("com.kik.util.KActivityLauncher.synthTaskId", kik.android.chat.activity.k.g());
        intent.putExtras(b);
        return intent;
_L2:
        if (c == a.c)
        {
            a(intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(Intent intent)
    {
        intent.putExtra("com.kik.util.KActivityLauncher.synthTaskId.treatAsRoot", true);
    }

    public final a a()
    {
        c = a.b;
        return this;
    }

    public final a.b b()
    {
        e = 0x7f040007;
        f = 0x7f040012;
        return this;
    }

    public final f c()
    {
        c = a.c;
        return this;
    }

    public final a.c d()
    {
        d = true;
        return this;
    }

    public final Intent e()
    {
        return a(false);
    }

    public final p f()
    {
        Intent intent = a(true);
        p p = kik.android.chat.activity.k.a(intent, a);
        if (a != null)
        {
            if (!(a instanceof Activity))
            {
                if (DeviceUtils.c())
                {
                    k.i();
                }
            } else
            {
                int i = intent.getIntExtra("ActivityLaunchDescriptor.anim.override.enter", -1);
                int j = intent.getIntExtra("ActivityLaunchDescriptor.anim.override.exit", -1);
                if (i != -1 && j != -1)
                {
                    ((Activity)a).overridePendingTransition(i, j);
                    return p;
                }
            }
        }
        return p;
    }

    protected a(Bundle bundle, Context context)
    {
        e = -1;
        f = -1;
        a = context;
        b = bundle;
    }
}
