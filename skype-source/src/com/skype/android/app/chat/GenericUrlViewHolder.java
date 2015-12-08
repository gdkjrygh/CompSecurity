// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.chat:
//            SubtypeViewHolder

public class GenericUrlViewHolder extends SubtypeViewHolder
{

    ImageView favIcon;
    SymbolView playButton;
    ImageView thumbnail;
    RelativeLayout urlBubble;
    TextView urlDomain;
    TextView urlTitle;

    public GenericUrlViewHolder(boolean flag)
    {
        super(flag);
    }

    protected View inflate(LayoutInflater layoutinflater, ViewGroup viewgroup, boolean flag)
    {
        int i;
        if (isEmbedded())
        {
            i = 0x7f03012b;
        } else
        {
            i = 0x7f03012a;
        }
        layoutinflater = layoutinflater.inflate(i, viewgroup, flag);
        urlBubble = (RelativeLayout)ViewUtil.a(layoutinflater, 0x7f10057a);
        thumbnail = (ImageView)ViewUtil.a(layoutinflater, 0x7f10057d);
        favIcon = (ImageView)ViewUtil.a(layoutinflater, 0x7f100581);
        playButton = (SymbolView)ViewUtil.a(layoutinflater, 0x7f10057f);
        urlTitle = (TextView)ViewUtil.a(layoutinflater, 0x7f10057e);
        urlDomain = (TextView)ViewUtil.a(layoutinflater, 0x7f100580);
        return layoutinflater;
    }

    public void recycle()
    {
        thumbnail.setImageBitmap(null);
        favIcon.setImageBitmap(null);
    }
}
