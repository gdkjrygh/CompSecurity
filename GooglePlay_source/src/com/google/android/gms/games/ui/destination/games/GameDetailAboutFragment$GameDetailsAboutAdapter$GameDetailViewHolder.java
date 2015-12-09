// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment, GameDetailActivity

private final class this._cls1 extends com.google.android.gms.games.ui.eDetailViewHolder
{

    final updateBadgeView this$1;

    private void setBadgeUiVisible(boolean flag)
    {
        UiUtils.setVisible(flag, 8, new View[] {
            this._mth1(this._cls1.this), GameDetailAboutFragment.access$600(_fld1)
        });
    }

    private void updateBadgeView(View view, GameBadge gamebadge)
    {
        Asserts.checkNotNull(view);
        Asserts.checkNotNull(gamebadge);
        TextView textview = (TextView)view.findViewById(0x7f0d0117);
        Asserts.checkNotNull(textview);
        textview.setText(gamebadge.getTitle());
        view = (ImageView)view.findViewById(0x7f0d0164);
        if (view != null)
        {
            gamebadge = gamebadge.getIconImageUri();
            GameDetailAboutFragment.access$1300(_fld1).loadImage(new com.google.android.gms.common.images.ilViewHolder(view, gamebadge));
        }
    }

    public final void populateViews(GamesRecyclerAdapter gamesrecycleradapter, int i)
    {
        GameDetailAboutFragment.access$702(_fld1, GameDetailAboutFragment.access$800(_fld1).mCurrentGame);
        if (GameDetailAboutFragment.access$700(_fld1) != null)
        {
            TextView textview = this._mth1(this._cls1.this);
            gamesrecycleradapter = GameDetailAboutFragment.access$700(_fld1);
            if (gamesrecycleradapter == null)
            {
                gamesrecycleradapter = null;
            } else
            {
                gamesrecycleradapter = gamesrecycleradapter.getDescription();
                if (gamesrecycleradapter == null)
                {
                    gamesrecycleradapter = null;
                } else
                {
                    gamesrecycleradapter = Html.fromHtml(gamesrecycleradapter.replace("\n", "<br />"));
                }
            }
            textview.setText(gamesrecycleradapter);
            if (GameDetailAboutFragment.access$700(_fld1).getInstancePackageName() == null)
            {
                this._mth1(this._cls1.this).setVisibility(8);
                this._mth1(this._cls1.this).setVisibility(8);
            }
        }
        gamesrecycleradapter = GameDetailAboutFragment.access$800(_fld1).mStateManager._fld1;
        if (gamesrecycleradapter == null)
        {
            setBadgeUiVisible(false);
        } else
        {
            gamesrecycleradapter = gamesrecycleradapter.getBadges();
            Asserts.checkNotNull(gamesrecycleradapter);
            if (gamesrecycleradapter.size() == 0)
            {
                setBadgeUiVisible(false);
                return;
            }
            setBadgeUiVisible(true);
            GameDetailAboutFragment.access$900(this._cls1.this.setBadgeUiVisible, gamesrecycleradapter);
            Object obj;
            int j;
            int l;
            int i1;
            if (GameDetailAboutFragment.access$1000(_fld1) != null)
            {
                updateBadgeView(updateBadgeView(this._cls1.this), GameDetailAboutFragment.access$1000(_fld1));
            } else
            {
                this._mth1(this._cls1.this).setVisibility(8);
            }
            l = getResources().getInteger(0x7f0e0008);
            GameDetailAboutFragment.access$600(_fld1).removeAllViews();
            i1 = GameDetailAboutFragment.access$1100(_fld1).size();
            j = 0;
            i = 0;
            obj = null;
            while (j < i1) 
            {
                GameBadge gamebadge = (GameBadge)GameDetailAboutFragment.access$1100(_fld1).get(j);
                gamesrecycleradapter = ((GamesRecyclerAdapter) (obj));
                if (obj == null)
                {
                    gamesrecycleradapter = new LinearLayout(GameDetailAboutFragment.access$800(_fld1));
                    gamesrecycleradapter.setOrientation(0);
                    gamesrecycleradapter.setClickable(false);
                    gamesrecycleradapter.setFocusable(false);
                    gamesrecycleradapter.setLayoutParams(new android.widget.sAboutAdapter.this._cls0(-1, -2, 0.0F));
                    GameDetailAboutFragment.access$600(_fld1).addView(gamesrecycleradapter);
                }
                obj = this._mth1(this._cls1.this).inflate(0x7f04005b, gamesrecycleradapter, false);
                updateBadgeView(((View) (obj)), gamebadge);
                gamesrecycleradapter.addView(((View) (obj)));
                int k = i + 1;
                i = k;
                if (k >= l)
                {
                    i = 0;
                    gamesrecycleradapter = null;
                }
                j++;
                obj = gamesrecycleradapter;
            }
        }
    }

    public (View view)
    {
        this$1 = this._cls1.this;
        super(view);
        this._mth1(this._cls1.this, (TextView)view.findViewById(0x7f0d0152));
        this._mth1(this._cls1.this, view.findViewById(0x7f0d014b));
        this._mth1(this._cls1.this).setOnClickListener(_fld1);
        this._mth1(this._cls1.this, view.findViewById(0x7f0d014d));
        this._mth1(this._cls1.this, view.findViewById(0x7f0d014c));
        this._mth1(this._cls1.this).setOnClickListener(_fld1);
        this._mth1(this._cls1.this, view.findViewById(0x7f0d014e));
        this._mth1(this._cls1.this, view.findViewById(0x7f0d014f));
        GameDetailAboutFragment.access$602(_fld1, (LinearLayout)view.findViewById(0x7f0d0150));
        this._mth1(this._cls1.this).setOnClickListener(_fld1);
    }
}
