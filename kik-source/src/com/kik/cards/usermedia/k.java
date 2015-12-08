// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.Intent;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.usermedia.c;
import com.kik.g.p;

// Referenced classes of package com.kik.cards.usermedia:
//            l, CustomGalleryActivity

public final class k
    implements c
{

    private CardsWebViewFragment a;

    public k(CardsWebViewFragment cardswebviewfragment)
    {
        a = cardswebviewfragment;
    }

    static CardsWebViewFragment a(k k1)
    {
        return k1.a;
    }

    public final p a(int i, int j, boolean flag)
    {
        flag = true;
        p p1 = new p();
        Intent intent;
        if (i == 1)
        {
            intent = new Intent("android.intent.action.GET_CONTENT", android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
        } else
        {
            flag = false;
            intent = new Intent(a.t(), com/kik/cards/usermedia/CustomGalleryActivity);
            intent.putExtra("extra.maxselections", i);
            intent.putExtra("extra.minselections", j);
        }
        a.a(intent).a(new l(this, flag, p1));
        return p1;
    }
}
