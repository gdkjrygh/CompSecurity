// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import NT;
import PG;
import PI;
import android.animation.ValueAnimator;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.ViewPropertyAnimator;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.ui.CashSwiperView;
import com.squareup.otto.Bus;
import java.io.IOException;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements 
{

    final com.snapchat.android.ui.wipeActivationMethod a;
    final ChatFragment b;

    public final void a()
    {
        PG.a(new Runnable() {

            private ChatFragment._cls16 a;

            public final void run()
            {
                CashSwiperView cashswiperview;
                AnalyticsEvents.a(a.a);
                a.b.u();
                cashswiperview = (CashSwiperView)ChatFragment.f(a.b).a();
                cashswiperview.setAlpha(0.0F);
                cashswiperview.setEnabled(true);
                cashswiperview.setVisibility(0);
                cashswiperview.animate().alpha(1.0F).setListener(null).setDuration(500L).start();
                cashswiperview.f = false;
                if (cashswiperview.d == null) goto _L2; else goto _L1
_L1:
                cashswiperview.setUpFadeInAudio();
                cashswiperview.e.start();
                cashswiperview.d.start();
_L4:
                cashswiperview.a(5000);
                return;
_L2:
                Uri uri;
                cashswiperview.d = new MediaPlayer();
                cashswiperview.d.setLooping(true);
                uri = Uri.parse(CashSwiperView.a);
                cashswiperview.d.setAudioStreamType(3);
                cashswiperview.d.setDataSource(cashswiperview.getContext(), uri);
                cashswiperview.d.setOnPreparedListener(new com.snapchat.android.ui.CashSwiperView._cls2(cashswiperview));
                cashswiperview.d.prepareAsync();
                continue; /* Loop/switch isn't completed */
                IOException ioexception;
                ioexception;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = ChatFragment._cls16.this;
                super();
            }
        });
        ChatFragment.D();
        ChatFragment.F(b);
        ChatFragment.i(b).a(new NT(false));
    }

    public final void b()
    {
        ChatFragment.A(b);
        ChatFragment.G(b);
    }

    onMethod(ChatFragment chatfragment, com.snapchat.android.ui.wipeActivationMethod wipeactivationmethod)
    {
        b = chatfragment;
        a = wipeactivationmethod;
        super();
    }
}
