// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.achievements;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import java.text.NumberFormat;

// Referenced classes of package com.google.android.gms.games.ui.common.achievements:
//            AchievementProgressView

public abstract class AchievementDescriptionActivity extends FragmentActivity
    implements android.view.View.OnClickListener
{

    public AchievementDescriptionActivity()
    {
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d0105)
        {
            view = getIntent().getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
            String s = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
            Intent intent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
            intent.setPackage(getPackageName());
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", view);
            intent.putExtra("com.google.android.gms.games.EXTRA_DISABLE_SETTINGS", true);
            intent.addFlags(0x4000000);
            startActivityForResult(GamesIntents.prepForClient(intent, ClientLibraryUtils.getClientVersion(this, view), s), 1234);
            finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        String s;
        Object obj1;
        String s1;
        Object obj2;
        View view;
        final View imageContainerView;
        final TextView nameView;
        final TextView descriptionView;
        final TextView xpView;
        final TextView dateLastUpdatedView;
        Resources resources;
        int l;
        super.onCreate(bundle);
        setContentView(0x7f040045);
        obj2 = (Achievement)getIntent().getParcelableExtra("com.google.android.gms.games.ACHIEVEMENT");
        if (obj2 == null)
        {
            GamesLog.e("AchieveDescrActivity", "Required achievement is missing.");
            finish();
            return;
        }
        view = findViewById(0x7f0d010e);
        imageContainerView = findViewById(0x7f0d0070);
        nameView = (TextView)findViewById(0x7f0d0075);
        descriptionView = (TextView)findViewById(0x7f0d0074);
        xpView = (TextView)findViewById(0x7f0d0112);
        dateLastUpdatedView = (TextView)findViewById(0x7f0d0113);
        bundle = (LoadingImageView)findViewById(0x7f0d0110);
        obj1 = (AchievementProgressView)findViewById(0x7f0d0111);
        obj = findViewById(0x7f0d0105);
        l = ((Achievement) (obj2)).getState();
        int i = ((Achievement) (obj2)).getType();
        resources = getResources();
        boolean flag;
        if (i == 1 && l == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (getIntent().getBooleanExtra("com.google.android.gms.games.SHOW_SEE_MORE", false))
        {
            ((View) (obj)).setVisibility(0);
            ((View) (obj)).setOnClickListener(this);
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        s1 = ((Achievement) (obj2)).getDescription();
        s = "";
        obj = "";
        if (flag)
        {
            break MISSING_BLOCK_LABEL_679;
        }
        l;
        JVM INSTR tableswitch 0 2: default 240
    //                   0 280
    //                   1 597
    //                   2 621;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown achievement state ")).append(l).toString());
_L2:
        bundle.loadUri$3329f911(((Achievement) (obj2)).getUnlockedImageUri(), 0x7f0200ee, true);
        dateLastUpdatedView.setVisibility(0);
        obj = DateUtils.formatDateTime(this, ((Achievement) (obj2)).getLastUpdatedTimestamp(), 0x80000);
        dateLastUpdatedView.setText(((CharSequence) (obj)));
        dateLastUpdatedView.setTextColor(resources.getColor(0x7f0b007d));
_L5:
        String s2;
        int j;
        long l1;
        if (l == 0)
        {
            j = 255;
        } else
        {
            j = Color.alpha(resources.getColor(0x7f0b0228));
        }
        if (PlatformVersion.checkVersion(16))
        {
            bundle.setImageAlpha(j);
        } else
        {
            bundle.setAlpha(j);
        }
        ((AchievementProgressView) (obj1)).setVisibility(8);
        bundle.setVisibility(0);
        if (l == 0)
        {
            bundle = resources.getString(0x7f100295);
            obj1 = obj;
        } else
        {
            bundle = resources.getString(0x7f100294);
            obj1 = obj;
        }
_L6:
        if (((Achievement) (obj2)).getState() != 2)
        {
            nameView.setText(((Achievement) (obj2)).getName());
            descriptionView.setText(s1);
            l1 = ((Achievement) (obj2)).getXpValue();
            int k;
            int i1;
            int j1;
            if (l1 > 0L)
            {
                obj = resources.getString(0x7f10009b, new Object[] {
                    NumberFormat.getInstance().format(l1)
                });
                xpView.setText(((CharSequence) (obj)));
                xpView.setVisibility(0);
            } else
            {
                xpView.setVisibility(8);
                obj = s;
            }
            s2 = ((Achievement) (obj2)).getName();
            s = s1;
            obj2 = obj;
            s1 = s2;
            obj = s;
        } else
        {
            nameView.setText(resources.getString(0x7f100090));
            descriptionView.setText(resources.getString(0x7f10008f));
            xpView.setVisibility(8);
            s1 = resources.getString(0x7f100090);
            obj = resources.getString(0x7f10008f);
            obj2 = s;
        }
        nameView.setTextColor(resources.getColor(0x7f0b007e));
        xpView.setTextColor(resources.getColor(0x7f0b007c));
        descriptionView.setTextColor(resources.getColor(0x7f0b007d));
        view.setContentDescription(resources.getString(0x7f100293, new Object[] {
            s1, obj, bundle, obj2, obj1
        }));
        setTitle(view.getContentDescription());
        descriptionView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final AchievementDescriptionActivity this$0;
            final TextView val$dateLastUpdatedView;
            final TextView val$descriptionView;
            final View val$imageContainerView;
            final TextView val$nameView;
            final TextView val$xpView;

            public final void onGlobalLayout()
            {
                android.widget.RelativeLayout.LayoutParams layoutparams;
                android.widget.RelativeLayout.LayoutParams layoutparams1;
                int k1;
                int i2;
                int j2;
                int k2;
                if (PlatformVersion.checkVersion(16))
                {
                    descriptionView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else
                {
                    descriptionView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                k1 = imageContainerView.getMeasuredHeight();
                i2 = nameView.getMeasuredHeight();
                j2 = descriptionView.getMeasuredHeight();
                k2 = xpView.getMeasuredHeight();
                layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                if (i2 + j2 + k2 <= k1)
                {
                    layoutparams.addRule(8, 0x7f0d0070);
                    layoutparams1.addRule(8, 0x7f0d0070);
                } else
                {
                    layoutparams.addRule(3, 0x7f0d0074);
                    layoutparams1.addRule(3, 0x7f0d0074);
                }
                layoutparams.addRule(1, 0x7f0d0070);
                layoutparams1.addRule(11);
                xpView.setLayoutParams(layoutparams);
                dateLastUpdatedView.setLayoutParams(layoutparams1);
            }

            
            {
                this$0 = AchievementDescriptionActivity.this;
                descriptionView = textview;
                imageContainerView = view;
                nameView = textview1;
                xpView = textview2;
                dateLastUpdatedView = textview3;
                super();
            }
        });
        return;
_L3:
        bundle.loadUri$3329f911(((Achievement) (obj2)).getRevealedImageUri(), 0x7f0200ec, true);
        dateLastUpdatedView.setVisibility(4);
          goto _L5
_L4:
        bundle.loadUri$3329f911(null, 0x7f0200eb, true);
        dateLastUpdatedView.setVisibility(4);
          goto _L5
        j1 = ((Achievement) (obj2)).getCurrentSteps();
        i1 = ((Achievement) (obj2)).getTotalSteps();
        k = i1;
        if (i1 <= 0)
        {
            GamesLog.w("AchieveDescrActivity", (new StringBuilder("Inconsistent achievement ")).append(obj2).append(": TYPE_INCREMENTAL, but totalSteps = ").append(i1).toString());
            k = 1;
        }
        i1 = j1;
        if (j1 >= k)
        {
            GamesLog.w("AchieveDescrActivity", (new StringBuilder("Inconsistent achievement ")).append(obj2).append(": STATE_REVEALED, but steps = ").append(j1).append(" / ").append(k).toString());
            i1 = k;
        }
        dateLastUpdatedView.setVisibility(4);
        ((AchievementProgressView) (obj1)).setSteps(i1, k);
        bundle.setVisibility(8);
        ((AchievementProgressView) (obj1)).setVisibility(0);
        k = (i1 * 100) / k;
        bundle = getResources().getString(0x7f100212, new Object[] {
            Integer.valueOf(k)
        });
        obj1 = obj;
          goto _L6
    }
}
