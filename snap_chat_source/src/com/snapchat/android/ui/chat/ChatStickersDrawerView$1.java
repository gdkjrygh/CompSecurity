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
    implements a
{

    final FP a;
    final ChatStickersDrawerView b;

    public final void a(Drawable drawable)
    {
        ChatStickersDrawerView.a(b).post(new Runnable(drawable) {

            private Drawable a;
            private ChatStickersDrawerView._cls1 b;

            public final void run()
            {
                int l = b.a.e;
                ChatStickersDrawerView chatstickersdrawerview = b.b;
                Drawable drawable1 = a;
                int i = chatstickersdrawerview.b.getChildCount();
                int j = (int)Jo.a(50F, chatstickersdrawerview.c);
                i = Math.max(Jo.a(chatstickersdrawerview.c) / (i + 1), j);
                ImageView imageview = new ImageView(chatstickersdrawerview.c);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i, -1);
                imageview.setImageDrawable(drawable1);
                imageview.setLayoutParams(layoutparams);
                imageview.setAlpha(0.98F);
                imageview.setTag(Integer.valueOf(l));
                imageview.setOnClickListener(new ChatStickersDrawerView._cls2(chatstickersdrawerview));
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
                    view.setLayoutParams(layoutparams);
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

            
            {
                b = ChatStickersDrawerView._cls1.this;
                a = drawable;
                super();
            }
        });
    }

    _cls1.a(ChatStickersDrawerView chatstickersdrawerview, FP fp)
    {
        b = chatstickersdrawerview;
        a = fp;
        super();
    }
}
