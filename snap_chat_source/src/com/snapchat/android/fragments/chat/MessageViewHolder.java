// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import BC;
import BG;
import BH;
import BO;
import Cl;
import If;
import Ii;
import Jo;
import Ks;
import Kt;
import LY;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatFeedItem;
import com.snapchat.android.model.chat.ChatMedia;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.snapchat.android.ui.FixTouchConsumeTextView;
import com.snapchat.android.ui.chat.MediaCardListView;
import com.snapchat.android.util.NetworkError;
import com.snapchat.android.util.debug.FeatureFlagManager;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import sD;
import xs;

public abstract class MessageViewHolder extends android.support.v7.widget.RecyclerView.v
{
    public static final class ChatItemType extends Enum
    {

        private static final ChatItemType $VALUES[];
        public static final ChatItemType CASH;
        public static final ChatItemType CHAT_FOOTER;
        public static final ChatItemType CHAT_LOADING_HEADER;
        public static final ChatItemType CHAT_MEDIA;
        public static final ChatItemType CHAT_SCREENSHOT;
        public static final ChatItemType CHAT_STICKER;
        public static final ChatItemType CHAT_TEXT;
        public static final ChatItemType CHAT_UNKNOWN;
        public static final ChatItemType DATE_HEADER;
        public static final ChatItemType HEADER;
        public static final ChatItemType SHARED_DSNAP;
        public static final ChatItemType SNAP;
        public static final ChatItemType STORY_REPLY;

        public static ChatItemType valueOf(String s1)
        {
            return (ChatItemType)Enum.valueOf(com/snapchat/android/fragments/chat/MessageViewHolder$ChatItemType, s1);
        }

        public static ChatItemType[] values()
        {
            return (ChatItemType[])$VALUES.clone();
        }

        static 
        {
            CHAT_TEXT = new ChatItemType("CHAT_TEXT", 0);
            DATE_HEADER = new ChatItemType("DATE_HEADER", 1);
            HEADER = new ChatItemType("HEADER", 2);
            SNAP = new ChatItemType("SNAP", 3);
            CHAT_MEDIA = new ChatItemType("CHAT_MEDIA", 4);
            CHAT_SCREENSHOT = new ChatItemType("CHAT_SCREENSHOT", 5);
            CHAT_UNKNOWN = new ChatItemType("CHAT_UNKNOWN", 6);
            CASH = new ChatItemType("CASH", 7);
            SHARED_DSNAP = new ChatItemType("SHARED_DSNAP", 8);
            CHAT_FOOTER = new ChatItemType("CHAT_FOOTER", 9);
            CHAT_LOADING_HEADER = new ChatItemType("CHAT_LOADING_HEADER", 10);
            CHAT_STICKER = new ChatItemType("CHAT_STICKER", 11);
            STORY_REPLY = new ChatItemType("STORY_REPLY", 12);
            $VALUES = (new ChatItemType[] {
                CHAT_TEXT, DATE_HEADER, HEADER, SNAP, CHAT_MEDIA, CHAT_SCREENSHOT, CHAT_UNKNOWN, CASH, SHARED_DSNAP, CHAT_FOOTER, 
                CHAT_LOADING_HEADER, CHAT_STICKER, STORY_REPLY
            });
        }

        private ChatItemType(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static interface a
    {

        public abstract void a(View view, ChatMedia chatmedia);

        public abstract void a(CashFeedItem cashfeeditem);

        public abstract ChatConversation o();
    }


    public ChatFeedItem C;
    public View D;
    public FixTouchConsumeTextView E;
    public TextView F;
    public View G;
    public MediaCardListView H;
    public TextView I;
    public TextView J;
    public Context K;
    public a L;

    public MessageViewHolder(View view)
    {
        super(view);
        D = a.findViewById(0x7f0d017b);
        K = view.getContext();
    }

    public void a(float f)
    {
        if (D == null)
        {
            return;
        } else
        {
            D.setTranslationX(f);
            return;
        }
    }

    public final void a(ChatFeedItem chatfeeditem)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (chatfeeditem instanceof BH)
        {
            G.setBackgroundColor(K.getResources().getColor(0x7f0c0026));
        } else
        if (Ks.a(chatfeeditem))
        {
            if (!(chatfeeditem instanceof BC) && chatfeeditem.R())
            {
                G.setBackgroundColor(K.getResources().getColor(0x7f0c0022));
            } else
            {
                G.setBackgroundColor(K.getResources().getColor(0x7f0c0058));
            }
        } else
        {
            G.setBackgroundColor(K.getResources().getColor(0x7f0c000a));
        }
        layoutparams = (android.widget.RelativeLayout.LayoutParams)G.getLayoutParams();
        if ((chatfeeditem instanceof BO) && ((BO)chatfeeditem).g())
        {
            layoutparams.width = K.getResources().getDimensionPixelSize(0x7f0a0050);
            layoutparams.rightMargin = 0;
        } else
        {
            layoutparams.width = K.getResources().getDimensionPixelSize(0x7f0a005e);
            layoutparams.rightMargin = K.getResources().getDimensionPixelOffset(0x7f0a005d);
        }
        G.setLayoutParams(layoutparams);
    }

    public void a(ChatFeedItem chatfeeditem, TextView textview)
    {
        if ((chatfeeditem instanceof BO) && ((BO)chatfeeditem).f())
        {
            textview.setTextAppearance(K, 0x7f0b003b);
            return;
        } else
        {
            textview.setTextAppearance(K, 0x7f0b003c);
            return;
        }
    }

    public void a(ChatFeedItem chatfeeditem, ChatFeedItem chatfeeditem1, ChatFeedItem chatfeeditem2, a a1, boolean flag)
    {
        if (chatfeeditem2 == null)
        {
            a.setPadding(0, 0, 0, (int)Jo.a(K.getResources().getDimension(0x7f0a006f), K));
        }
        L = a1;
    }

    public final void a(ChatFeedItem chatfeeditem, FixTouchConsumeTextView fixtouchconsumetextview, boolean flag, Handler handler)
    {
        if (TextUtils.isEmpty(chatfeeditem.an()))
        {
            fixtouchconsumetextview.setVisibility(8);
            return;
        }
        if (flag)
        {
            FeatureFlagManager.a();
            if (FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2))
            {
                fixtouchconsumetextview.setText(chatfeeditem.ao());
            } else
            {
                fixtouchconsumetextview.setText(chatfeeditem.an());
            }
            fixtouchconsumetextview.setVisibility(0);
            FeatureFlagManager.a();
            if (!FeatureFlagManager.b(com.snapchat.android.util.debug.FeatureFlagManager.FeatureFlag.CHAT_V2))
            {
                if ((chatfeeditem instanceof BO) && If.a((BO)chatfeeditem, fixtouchconsumetextview))
                {
                    fixtouchconsumetextview.setMovementMethod(LinkMovementMethod.getInstance());
                } else
                if (handler != null)
                {
                    handler.removeCallbacksAndMessages(chatfeeditem.d());
                    handler.postAtTime(new Runnable(chatfeeditem, fixtouchconsumetextview) {

                        private ChatFeedItem a;
                        private FixTouchConsumeTextView b;

                        public final void run()
                        {
                            if ((a instanceof BO) && If.a(b))
                            {
                                b.setMovementMethod(LinkMovementMethod.getInstance());
                            }
                        }

            
            {
                a = chatfeeditem;
                b = fixtouchconsumetextview;
                super();
            }
                    }, chatfeeditem.d(), SystemClock.uptimeMillis());
                }
            }
        }
        b(chatfeeditem, fixtouchconsumetextview);
        if ((chatfeeditem instanceof BO) && ((BO)chatfeeditem).f())
        {
            LY.a(fixtouchconsumetextview, "sans-serif-light");
        }
        if (Kt.a() && Kt.a(fixtouchconsumetextview.getText().toString(), true))
        {
            fixtouchconsumetextview.setTextSize(0, K.getResources().getDimension(0x7f0a0030));
            return;
        } else
        {
            fixtouchconsumetextview.setTextSize(0, K.getResources().getDimension(0x7f0a004e));
            return;
        }
    }

    public void a(ChatFeedItem chatfeeditem, boolean flag)
    {
        a.setPadding(0, 0, 0, 0);
        if (D != null)
        {
            if (chatfeeditem instanceof BH)
            {
                if (flag)
                {
                    D.setBackgroundDrawable(K.getResources().getDrawable(0x7f0200dd));
                    return;
                }
            } else
            if ((chatfeeditem instanceof BO) && ((BO)chatfeeditem).f())
            {
                D.setBackgroundDrawable(K.getResources().getDrawable(0x7f0200da));
                return;
            } else
            {
                D.setBackgroundDrawable(null);
                return;
            }
        }
    }

    public final void b(ChatFeedItem chatfeeditem, TextView textview)
    {
        a(chatfeeditem, textview);
        if ((chatfeeditem instanceof StatefulChatFeedItem) && (chatfeeditem.Q() || chatfeeditem.R()))
        {
            textview.setTextColor(K.getResources().getColor(0x7f0c0022));
            return;
        } else
        {
            textview.setTextColor(0xff000000);
            return;
        }
    }

    public final boolean b(ChatFeedItem chatfeeditem, ChatFeedItem chatfeeditem1)
    {
        boolean flag = false;
        if (xs.a(chatfeeditem, chatfeeditem1))
        {
            I.setVisibility(0);
            chatfeeditem = Ii.a(chatfeeditem1.W()).toUpperCase(Locale.getDefault());
            I.setText(chatfeeditem);
            flag = true;
        }
        return flag;
    }

    public void s()
    {
        a(0.0F);
        if (E != null)
        {
            E.setLinkTextColor(0xff0000ff);
        }
    }

    public boolean t()
    {
        if (C == null || C.d() == null || (C instanceof BC) || L == null)
        {
            return true;
        }
        if (C.R() && C.T())
        {
            u();
            return true;
        } else
        {
            return false;
        }
    }

    public void u()
    {
        if (!(C instanceof Chat)) goto _L2; else goto _L1
_L1:
        ChatConversation chatconversation;
        sD sd;
        Object obj;
        chatconversation = L.o();
        sd = sD.a();
        obj = C;
        if (Cl.a().c()) goto _L4; else goto _L3
_L3:
        NetworkError.NO_INTERNET_CONNECTION.notifyInStatusBar();
_L2:
        return;
_L4:
        if (!(obj instanceof BG))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = chatconversation.c((Chat)obj).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            sd.a(chatconversation, (Chat)((Iterator) (obj)).next(), false, true);
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (!(obj instanceof Chat)) goto _L2; else goto _L6
_L6:
        sd.a(chatconversation, (Chat)obj, false, true);
        return;
    }

    public final View y()
    {
        return D;
    }
}
