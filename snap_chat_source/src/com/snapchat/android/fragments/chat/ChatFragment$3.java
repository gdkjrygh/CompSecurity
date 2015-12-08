// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Kt;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.ui.ChatCameraButton;
import com.snapchat.android.ui.CursorCallbackEditText;
import com.snapchat.android.ui.here.HereTooltip;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class c
    implements TextWatcher
{

    private boolean a;
    private boolean b;
    private ChatFragment c;

    public final void afterTextChanged(Editable editable)
    {
        if (!b)
        {
            if (a)
            {
                int i = Selection.getSelectionStart(editable);
                int j = Selection.getSelectionEnd(editable);
                if (i == j && ChatFragment.p(c))
                {
                    ImageSpan aimagespan[] = (ImageSpan[])editable.getSpans(i, j, android/text/style/ImageSpan);
                    if (aimagespan.length > 0)
                    {
                        b = true;
                        editable.replace(editable.getSpanStart(aimagespan[0]), editable.getSpanEnd(aimagespan[0]), "");
                        editable.removeSpan(aimagespan[0]);
                        b = false;
                        if (!ChatFragment.p(c))
                        {
                            ChatFragment.a(c, null);
                        }
                    }
                }
            }
            boolean flag2 = ChatFragment.a(c);
            ChatFragment.a(c, true);
            Object obj = ChatFragment.q(c).getLayout();
            boolean flag;
            boolean flag1;
            if (obj != null)
            {
                if (ChatFragment.r(c) == 0x80000000)
                {
                    ChatFragment.a(c, ChatFragment.o(c).getLeft());
                }
                float f = ChatFragment.s(c);
                float f1 = ((Layout) (obj)).getLineWidth(0);
                ChatConversation chatconversation;
                if (((Layout) (obj)).getLineCount() > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag || f + f1 >= (float)ChatFragment.r(c))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            } else
            {
                flag1 = false;
            }
            if (ChatFragment.t(c) != flag1)
            {
                ChatFragment.b(c, flag1);
                if (flag1)
                {
                    ChatFragment.o(c).setVisibility(8);
                    ChatFragment.q(c).setPadding(ChatFragment.s(c), ChatFragment.q(c).getPaddingTop(), c.getResources().getDimensionPixelOffset(0x7f0a0065), ChatFragment.q(c).getPaddingBottom());
                } else
                {
                    ChatFragment.o(c).setVisibility(0);
                    ChatFragment.q(c).setPadding(ChatFragment.s(c), ChatFragment.q(c).getPaddingTop(), c.getResources().getDimensionPixelOffset(0x7f0a0028), ChatFragment.q(c).getPaddingBottom());
                }
            }
            if (ChatFragment.n(c) != null)
            {
                obj = ChatFragment.u(c);
                chatconversation = ChatFragment.n(c);
                if (!flag1 && !flag2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((HereTooltip) (obj)).a(chatconversation, flag1);
            }
            if (ChatFragment.n(c) != null)
            {
                if (ChatFragment.n(c).mMessagingAuthToken != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    if (editable.length() == 0)
                    {
                        ChatFragment.n(c).e(false);
                        ChatFragment.o(c).setIsTyping(false);
                        return;
                    } else
                    {
                        ChatFragment.n(c).e(true);
                        return;
                    }
                }
            }
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        boolean flag = false;
        if (k <= 2)
        {
            charsequence = charsequence.subSequence(i, i + k).toString();
            ChatFragment.o(c).setIsEmoji(Kt.a(charsequence, false));
        } else
        {
            ChatFragment.o(c).setIsEmoji(false);
        }
        if (k < j)
        {
            flag = true;
        }
        a = flag;
        ChatFragment.o(c).setIsTyping(true);
    }

    (ChatFragment chatfragment)
    {
        c = chatfragment;
        super();
    }
}
