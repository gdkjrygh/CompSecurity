// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;

// Referenced classes of package com.google.android.gms.games.ui:
//            DataBufferAdapter, GamesSettingsFragment

private final class this._cls0 extends DataBufferAdapter
{

    final GamesSettingsFragment this$0;

    public final volatile void bindView$675318ec(View view, Object obj)
    {
        obj = (GameFirstParty)obj;
        if (obj != null)
        {
            ((TextView)view.findViewById(0x7f0d01f7)).setText(((GameFirstParty) (obj)).getGame().getDisplayName());
            ((LoadingImageView)view.findViewById(0x7f0d01f6)).loadUri$3329f911(((GameFirstParty) (obj)).getGame().getIconImageUri(), 0x7f0200da, true);
        }
    }

    public final volatile View newView$6591d710(Context context, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(0x7f0400a0, viewgroup, false);
    }

    public (Context context)
    {
        this$0 = GamesSettingsFragment.this;
        super(context);
    }
}
