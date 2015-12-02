// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.LayoutInflater;
import com.facebook.orca.emoji.EmojiAttachmentPopup;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.orca.photos.picking.PickMediaParams;
import com.facebook.ui.media.attachments.a;
import java.util.List;

public interface aq
{

    public abstract void a(EmojiAttachmentPopup emojiattachmentpopup, LayoutInflater layoutinflater);

    public abstract void a(PickMediaOperation pickmediaoperation, PickMediaParams pickmediaparams);

    public abstract void a(PickMediaOperation pickmediaoperation, List list, a a1);

    public abstract void b(EmojiAttachmentPopup emojiattachmentpopup, LayoutInflater layoutinflater);
}
