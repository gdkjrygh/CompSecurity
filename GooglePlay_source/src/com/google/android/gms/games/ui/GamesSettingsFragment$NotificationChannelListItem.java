// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.games.internal.constants.NotificationChannel;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class mChannelType extends mChannelType
{

    private final int mChannelType;
    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        Object obj;
        Object obj1;
        obj = (TextView)view.findViewById(0x7f0d0075);
        obj1 = (TextView)view.findViewById(0x7f0d024a);
        mChannelType;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 79
    //                   1 177
    //                   2 162;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_177;
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown channel type ")).append(mChannelType).toString());
_L2:
        ((TextView) (obj)).setText(0x7f10016d);
        ((TextView) (obj1)).setText(0x7f10016e);
_L5:
        view.findViewById(0x7f0d0292).setVisibility(0);
        obj = (CheckBox)view.findViewById(0x7f0d00c3);
        view = view.findViewById(0x7f0d0073);
        if (GamesSettingsFragment.access$300(GamesSettingsFragment.this))
        {
            obj1 = NotificationChannel.fromInt(mChannelType);
            ((CheckBox) (obj)).setVisibility(0);
            ((CheckBox) (obj)).setChecked(GamesSettingsFragment.access$400(GamesSettingsFragment.this).getBoolean(((String) (obj1))));
            view.setVisibility(4);
            return;
        } else
        {
            ((CheckBox) (obj)).setVisibility(4);
            view.setVisibility(0);
            return;
        }
_L4:
        ((TextView) (obj)).setText(0x7f100175);
        ((TextView) (obj1)).setText(0x7f100176);
          goto _L5
        ((TextView) (obj)).setText(0x7f100179);
        ((TextView) (obj1)).setText(0x7f10017a);
          goto _L5
    }

    public (int i)
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, GamesSettingsFragment.getIdForChannel(i), 1, true);
        mChannelType = i;
    }
}
