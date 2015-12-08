// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import CG;
import CH;
import Mf;
import NT;
import Ny;
import Oi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;

public class InAppPromptView extends RelativeLayout
{

    private Context a;
    private ImageView b;
    private TextView c;
    private CG d;

    public InAppPromptView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, new CH(), CG.a());
    }

    InAppPromptView(Context context, AttributeSet attributeset, CH ch, CG cg)
    {
        super(context, attributeset);
        a = context;
        d = cg;
    }

    static CG a(InAppPromptView inapppromptview)
    {
        return inapppromptview.d;
    }

    static Context b(InAppPromptView inapppromptview)
    {
        return inapppromptview.a;
    }

    public void onFinishInflate()
    {
        b = (ImageView)findViewById(0x7f0d0313);
        c = (TextView)findViewById(0x7f0d0318);
    }

    public void set(CG.a a1)
    {
        Object obj;
        com.snapchat.android.notification.AndroidNotificationManager.Type type;
        int i;
        i = 0x7f0c0064;
        obj = getResources();
        type = a1.c;
        static final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.snapchat.android.notification.AndroidNotificationManager.Type.values().length];
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.ADDFRIEND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.ADD_COLLABORATOR_TO_OWNER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT_SCREENSHOT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.TYPING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CHAT.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.CASH.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.SNAP.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.REPLAY.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.snapchat.android.notification.AndroidNotificationManager.Type.SCREENSHOT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 212
    //                   2 64
    //                   3 219
    //                   4 219
    //                   5 219
    //                   6 64;
           goto _L1 _L2 _L3 _L4 _L4 _L4 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        i = 0x7f0c0058;
_L12:
        setBackgroundColor(((Resources) (obj)).getColor(i));
        obj = b;
        type = a1.c;
        _cls2.a[type.ordinal()];
        JVM INSTR tableswitch 1 9: default 144
    //                   1 226
    //                   2 233
    //                   3 240
    //                   4 261
    //                   5 261
    //                   6 254
    //                   7 144
    //                   8 247
    //                   9 240;
           goto _L5 _L6 _L7 _L8 _L9 _L9 _L10 _L5 _L11 _L8
_L9:
        break MISSING_BLOCK_LABEL_261;
_L5:
        i = 0x7f020171;
_L13:
        ((ImageView) (obj)).setImageResource(i);
        if (a1.c == com.snapchat.android.notification.AndroidNotificationManager.Type.TYPING)
        {
            String s = getResources().getStringArray(0x7f09000e)[0];
            c.setText(String.format(s, new Object[] {
                a1.b
            }));
        } else
        if (a1.c == com.snapchat.android.notification.AndroidNotificationManager.Type.ADD_COLLABORATOR_TO_OWNER)
        {
            c.setText(0x7f0801af);
        } else
        {
            c.setText(a1.b);
        }
        setOnClickListener(new android.view.View.OnClickListener(a1) {

            private CG.a a;
            private InAppPromptView b;

            public final void onClick(View view)
            {
                com.snapchat.android.notification.AndroidNotificationManager.a a2 = null;
                InAppPromptView.a(b).b();
                if (a.d != null)
                {
                    view = new com.snapchat.android.notification.AndroidNotificationManager.b(a.a, a.d);
                } else
                {
                    a2 = new com.snapchat.android.notification.AndroidNotificationManager.a(a.a);
                    view = null;
                }
                if (a.c == com.snapchat.android.notification.AndroidNotificationManager.Type.ADD_COLLABORATOR_TO_OWNER)
                {
                    Mf.a().a(new Oi(LeftSwipeContentFragment.OFFICIAL_STORIES_FRAGMENT));
                    return;
                }
                view = CH.a(InAppPromptView.b(b), a.c, a2, view, false);
                if (a.c != com.snapchat.android.notification.AndroidNotificationManager.Type.ADDFRIEND)
                {
                    Mf.a().a(new NT(true));
                    Mf.a().a(new Ny(1));
                }
                InAppPromptView.b(b).startActivity(view);
            }

            
            {
                b = InAppPromptView.this;
                a = a1;
                super();
            }
        });
        return;
_L2:
        i = 0x7f0c0050;
          goto _L12
_L4:
        i = 0x7f0c000a;
          goto _L12
_L6:
        i = 0x7f02016c;
          goto _L13
_L7:
        i = 0x7f02016c;
          goto _L13
_L8:
        i = 0x7f020170;
          goto _L13
_L11:
        i = 0x7f02016f;
          goto _L13
_L10:
        i = 0x7f02016d;
          goto _L13
        i = 0x7f02016e;
          goto _L13
    }
}
