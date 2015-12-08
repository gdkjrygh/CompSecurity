// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfx extends Handler
{

    private PlayerScreenFragment a;

    public cfx(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1000 && !PlayerScreenFragment.a(a))
        {
            PlayerScreenFragment.b(a, false);
        }
    }
}
