// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

private final class this._cls0 extends this._cls0
{

    final GamesSettingsFragment this$0;

    public final void onBindView(View view)
    {
        ((TextView)view.findViewById(0x7f0d0075)).setText(0x7f100171);
        TextView textview = (TextView)view.findViewById(0x7f0d024a);
        if (GamesSettingsFragment.access$300(GamesSettingsFragment.this))
        {
            if (GamesSettingsFragment.access$500(GamesSettingsFragment.this) == null)
            {
                textview.setText("");
            } else
            if (GamesSettingsFragment.access$500(GamesSettingsFragment.this).size() == 0)
            {
                textview.setText(0x7f100028);
            } else
            {
                int j = GamesSettingsFragment.access$500(GamesSettingsFragment.this).size();
                String as[] = new String[j];
                for (int i = 0; i < j; i++)
                {
                    as[i] = ((AudienceMember)GamesSettingsFragment.access$500(GamesSettingsFragment.this).get(i)).mDisplayName;
                }

                textview.setText(TextUtils.join(", ", as));
            }
            view.findViewById(0x7f0d0292).setVisibility(8);
            return;
        } else
        {
            view.findViewById(0x7f0d0292).setVisibility(0);
            view.findViewById(0x7f0d00c3).setVisibility(4);
            view.findViewById(0x7f0d0073).setVisibility(0);
            return;
        }
    }

    public ()
    {
        this$0 = GamesSettingsFragment.this;
        super(GamesSettingsFragment.this, 4, 1, true);
    }
}
