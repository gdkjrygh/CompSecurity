// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import FP;
import Jo;
import aU;
import android.database.DataSetObservable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.snapchat.android.ui.chat:
//            ChatStickersDrawerView

final class a
    implements Runnable
{

    private Drawable a;
    private b b;

    public final void run()
    {
        int l = b.b.e;
        ChatStickersDrawerView chatstickersdrawerview = b.b;
        Drawable drawable = a;
        int i = chatstickersdrawerview.b.getChildCount();
        int j = (int)Jo.a(50F, chatstickersdrawerview.c);
        i = Math.max(Jo.a(chatstickersdrawerview.c) / (i + 1), j);
        ImageView imageview = new ImageView(chatstickersdrawerview.c);
        android.widget.rawerView rawerview = new android.widget.init>(i, -1);
        imageview.setImageDrawable(drawable);
        imageview.setLayoutParams(rawerview);
        imageview.setAlpha(0.98F);
        imageview.setTag(Integer.valueOf(l));
        imageview.setOnClickListener(new nit>(chatstickersdrawerview));
        i = 0;
        int k;
        for (j = -1; i < chatstickersdrawerview.b.getChildCount(); j = k)
        {
            View view = chatstickersdrawerview.b.getChildAt(i);
            k = j;
            if (j == -1)
            {
                k = j;
                if (((Integer)view.getTag()).intValue() > l)
                {
                    k = i;
                }
            }
            view.setLayoutParams(rawerview);
            i++;
        }

        if (l == 0)
        {
            imageview.setSelected(true);
            chatstickersdrawerview.f = imageview;
        }
        chatstickersdrawerview.b.addView(imageview, j);
        b.b.a.mAdapter.mObservable.notifyChanged();
    }

    ( , Drawable drawable)
    {
        b = ;
        a = drawable;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/chat/ChatStickersDrawerView$1

/* anonymous class */
    final class ChatStickersDrawerView._cls1
        implements ChatStickersDrawerView.c
    {

        final FP a;
        final ChatStickersDrawerView b;

        public final void a(Drawable drawable)
        {
            ChatStickersDrawerView.a(b).post(new ChatStickersDrawerView._cls1._cls1(this, drawable));
        }

            
            {
                b = chatstickersdrawerview;
                a = fp;
                super();
            }
    }

}
