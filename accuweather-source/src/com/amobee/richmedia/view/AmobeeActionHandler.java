// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.amobee.richmedia.controller.util.OrmmaPlayer;
import com.amobee.richmedia.controller.util.OrmmaPlayerListener;
import com.amobee.richmedia.controller.util.OrmmaUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AmobeeActionHandler extends Activity
{

    private static int $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION[];
    private HashMap actionData;
    private RelativeLayout layout;

    static int[] $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION()
    {
        int ai[] = $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[AmobeeView.ACTION.values().length];
        try
        {
            ai[AmobeeView.ACTION.PLAY_AUDIO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[AmobeeView.ACTION.PLAY_VIDEO.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION = ai;
        return ai;
    }

    public AmobeeActionHandler()
    {
        actionData = new HashMap();
    }

    private void doAction(Bundle bundle)
    {
        Object obj = bundle.getString("action");
        if (obj == null)
        {
            return;
        }
        obj = AmobeeView.ACTION.valueOf(((String) (obj)));
        switch ($SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION()[((AmobeeView.ACTION) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            initPlayer(bundle, ((AmobeeView.ACTION) (obj))).playAudio();
            return;

        case 2: // '\002'
            initPlayer(bundle, ((AmobeeView.ACTION) (obj))).playVideo();
            break;
        }
    }

    private void setPlayerListener(OrmmaPlayer ormmaplayer)
    {
        ormmaplayer.setListener(new OrmmaPlayerListener() {

            final AmobeeActionHandler this$0;

            public void onComplete()
            {
                finish();
            }

            public void onError()
            {
                finish();
            }

            public void onPrepared()
            {
            }

            
            {
                this$0 = AmobeeActionHandler.this;
                super();
            }
        });
    }

    OrmmaPlayer initPlayer(Bundle bundle, AmobeeView.ACTION action)
    {
        com.amobee.richmedia.controller.OrmmaController.PlayerProperties playerproperties = (com.amobee.richmedia.controller.OrmmaController.PlayerProperties)bundle.getParcelable("player_properties");
        com.amobee.richmedia.controller.OrmmaController.Dimensions dimensions = (com.amobee.richmedia.controller.OrmmaController.Dimensions)bundle.getParcelable("expand_dimensions");
        OrmmaPlayer ormmaplayer = new OrmmaPlayer(this);
        ormmaplayer.setPlayData(playerproperties, OrmmaUtils.getData("expand_url", bundle));
        if (dimensions == null)
        {
            bundle = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            bundle.addRule(13);
        } else
        {
            bundle = new android.widget.RelativeLayout.LayoutParams(dimensions.width, dimensions.height);
            bundle.topMargin = dimensions.y;
            bundle.leftMargin = dimensions.x;
        }
        ormmaplayer.setLayoutParams(bundle);
        layout.addView(ormmaplayer);
        actionData.put(action, ormmaplayer);
        setPlayerListener(ormmaplayer);
        return ormmaplayer;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getExtras();
        layout = new RelativeLayout(this);
        layout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(layout);
        doAction(bundle);
    }

    protected void onStop()
    {
        Iterator iterator = actionData.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                super.onStop();
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            switch ($SWITCH_TABLE$com$amobee$richmedia$view$AmobeeView$ACTION()[((AmobeeView.ACTION)entry.getKey()).ordinal()])
            {
            case 1: // '\001'
            case 2: // '\002'
                ((OrmmaPlayer)entry.getValue()).releasePlayer();
                break;
            }
        } while (true);
    }
}
