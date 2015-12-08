// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.chat:
//            UrlPreviewTextMessageViewHolder

public abstract class SubtypeViewHolder
{

    private final boolean embedded;
    private View inlineContent;
    private View subView;
    private UrlPreviewTextMessageViewHolder urlPreviewTextMessageViewHolder;

    public SubtypeViewHolder(boolean flag)
    {
        embedded = flag;
    }

    private void setInlineContent(View view)
    {
        inlineContent = view;
    }

    void doRecycle()
    {
        recycle();
        setInlineContent(null);
    }

    public View getInlineContent()
    {
        return inlineContent;
    }

    public View getItemView()
    {
        return urlPreviewTextMessageViewHolder.itemView;
    }

    public int getLayoutPosition()
    {
        return urlPreviewTextMessageViewHolder.getLayoutPosition();
    }

    public View getSubView()
    {
        return subView;
    }

    public UrlPreviewTextMessageViewHolder getUrlPreviewTextMessageViewHolder()
    {
        return urlPreviewTextMessageViewHolder;
    }

    protected abstract View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag);

    void inflateSubview(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        setSubView(inflate(layoutinflater, viewgroup, flag));
    }

    public boolean isEmbedded()
    {
        return embedded;
    }

    public abstract void recycle();

    void setSubView(View view)
    {
        subView = view;
    }

    void setUrlPreviewTextMessageViewHolder(UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder)
    {
        urlPreviewTextMessageViewHolder = urlpreviewtextmessageviewholder;
        setInlineContent(urlpreviewtextmessageviewholder.getInlineContent());
    }
}
