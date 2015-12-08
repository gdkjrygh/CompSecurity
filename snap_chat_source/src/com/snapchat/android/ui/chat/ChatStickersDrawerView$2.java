// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.snapchat.android.ui.chat:
//            ChatStickersDrawerView

final class a
    implements android.view.ersDrawerView._cls2
{

    private ChatStickersDrawerView a;

    public final void onClick(View view)
    {
        a.a.setCurrentItem(a.b.indexOfChild(view));
    }

    (ChatStickersDrawerView chatstickersdrawerview)
    {
        a = chatstickersdrawerview;
        super();
    }
}
