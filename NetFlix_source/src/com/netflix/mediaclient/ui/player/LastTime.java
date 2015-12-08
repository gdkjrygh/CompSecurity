// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.TimeFormatterHelper;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerSection, PlayerActivity, PlayerWorkflowState, PlayScreen, 
//            BottomPanel

public class LastTime extends PlayerSection
{

    private static final int CURRENT_TIME_BOTTOM_MARGIN_REGULAR_PHONE = 10;
    private static final int CURRENT_TIME_BOTTOM_MARGIN_TABLET_PRESSED = 40;
    protected static final String TAG = "screen";
    private static final int TIME_TEXT_PADDING = 18;
    protected LinearLayout lastTime;
    protected TextView lastTimeLabel;

    public LastTime(PlayerActivity playeractivity)
    {
        super(playeractivity);
        lastTime = (LinearLayout)playeractivity.findViewById(0x7f070164);
        lastTimeLabel = (TextView)playeractivity.findViewById(0x7f070165);
    }

    private float calculateAlpha(Rect rect, Rect rect1)
    {
        Rect rect2 = intersect(rect, rect1);
        float f;
        if (rect2 == null)
        {
            f = 1.0F;
        } else
        {
            f = rect2.width();
            float f1 = rect.width();
            boolean flag1 = context.getState().isSeekForward();
            boolean flag = intersectWithMiddle(rect, rect1, flag1);
            flag1 = intersectWithEdge(rect, rect1, flag1);
            f1 = 1.0F - (2.0F * f) / f1;
            f = f1;
            if (flag)
            {
                if (flag1)
                {
                    f = f1;
                } else
                {
                    f = 0.0F;
                }
            }
            f1 = f;
            if (f > 1.0F)
            {
                f1 = 1.0F;
            }
            f = f1;
            if (f1 < 0.0F)
            {
                return 0.0F;
            }
        }
        return f;
    }

    private float getAlphaForLastTime(View view)
    {
        float f = 1.0F;
        Rect rect = getRect(context, lastTimeLabel);
        view = getRect(context, view);
        if (Rect.intersects(rect, view))
        {
            f = calculateAlpha(rect, view);
        }
        return f;
    }

    private int getLastTimeBottomMargin()
    {
        PlayerActivity playeractivity = context;
        return playeractivity == null || !playeractivity.isTablet() ? 10 : 40;
    }

    private static Rect getRect(Context context, View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            int i = AndroidUtils.dipToPixels(context, 18);
            context = new int[2];
            view.getLocationOnScreen(context);
            int j = context[0];
            int k = context[0];
            int l = view.getWidth();
            return new Rect(j + i, context[1], (k + l) - i, context[1] + view.getHeight());
        }
    }

    private static Rect intersect(Rect rect, Rect rect1)
    {
        if (!Rect.intersects(rect, rect1))
        {
            return null;
        } else
        {
            return new Rect(Math.max(rect1.left, rect.left), Math.max(rect1.top, rect.top), Math.min(rect1.right, rect.right), Math.min(rect1.bottom, rect.bottom));
        }
    }

    private boolean intersectWithEdge(Rect rect, Rect rect1, boolean flag)
    {
        if (flag)
        {
            return rect1.right >= rect.right;
        }
        return rect1.left <= rect.left;
    }

    private boolean intersectWithMiddle(Rect rect, Rect rect1, boolean flag)
    {
        int i = rect.centerX();
        if (flag)
        {
            return rect1.right >= i;
        }
        return rect1.left <= i;
    }

    public void changeActionState(boolean flag)
    {
    }

    public void hide()
    {
    }

    public void setLastTimeState(boolean flag)
    {
        PlayerActivity playeractivity;
        if (flag)
        {
            Log.d("screen", "setLastTimeState:: Last time visible");
            playeractivity = context;
            if (playeractivity == null)
            {
                return;
            }
        } else
        {
            Log.d("screen", "setLastTimeState:: Last time gone!");
            lastTime.setVisibility(4);
            return;
        }
        BottomPanel bottompanel = context.getScreen().getBottomPanel();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)lastTime.getLayoutParams();
        int i = AndroidUtils.dipToPixels(playeractivity, getLastTimeBottomMargin());
        layoutparams.setMargins(bottompanel.getTimeX(lastTime), 0, 0, i);
        Log.d("screen", "setLastTimeState::Last time update!");
        if (lastTimeLabel != null)
        {
            String s = bottompanel.getFormatter().getStringForMs(bottompanel.getTimeline().getProgress());
            if (Log.isLoggable("screen", 3))
            {
                Log.d("screen", (new StringBuilder()).append("setLastTimeState::Sets Last time update to: ").append(s).toString());
            }
            lastTimeLabel.setText(s);
        }
        Log.d("screen", "setLastTimeState:: Last time move overlay");
        lastTime.setLayoutParams(layoutparams);
        lastTime.setAlpha(0.0F);
        lastTime.setVisibility(0);
    }

    public void show()
    {
    }

    void validateTimeOverlap(View view)
    {
        if (lastTime == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (lastTime.getVisibility() != 8) goto _L2; else goto _L1
_L1:
        float f;
        return;
_L2:
        if ((f = getAlphaForLastTime(view)) == lastTime.getAlpha()) goto _L1; else goto _L3
_L3:
        lastTime.setAlpha(f);
        return;
        Log.e("screen", "lastTime  null!!!");
        return;
    }
}
