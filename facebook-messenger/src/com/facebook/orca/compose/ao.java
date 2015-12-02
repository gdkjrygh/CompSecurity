// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.facebook.c.s;
import com.facebook.orca.emoji.EmojiAttachmentPopup;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.orca.photos.picking.PickMediaParams;
import com.facebook.orca.photos.picking.b;
import com.facebook.ui.media.attachments.a;
import java.util.List;

// Referenced classes of package com.facebook.orca.compose:
//            aq

public class ao
    implements aq
{

    private Context a;
    private s b;

    public ao(Context context, s s1)
    {
        a = context;
        b = s1;
    }

    public void a(EmojiAttachmentPopup emojiattachmentpopup, LayoutInflater layoutinflater)
    {
        emojiattachmentpopup.a(layoutinflater);
    }

    public void a(PickMediaOperation pickmediaoperation, PickMediaParams pickmediaparams)
    {
        pickmediaparams = new Intent("android.intent.action.GET_CONTENT");
        pickmediaparams.setType("image/*");
        b.a(pickmediaparams, 1, pickmediaoperation);
    }

    public void a(PickMediaOperation pickmediaoperation, List list, a a1)
    {
    }

    public void b(EmojiAttachmentPopup emojiattachmentpopup, LayoutInflater layoutinflater)
    {
        emojiattachmentpopup.a(layoutinflater, b.GALLERY);
    }
}
