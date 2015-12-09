// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.app.AlertDialog;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.IconFontTextView;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.mdx.MdxTarget;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.MdxUtils;
import com.netflix.mediaclient.util.TimeFormatterHelper;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerSection, PlayerActivity, PlayerWorkflowState, ResourceHelper, 
//            CurrentTime, LastTime

public final class BottomPanel extends PlayerSection
{

    private static final String TAG = "screen";
    protected View bottomPanel;
    protected CurrentTime currentTime;
    protected TextView durationLabel;
    protected TimeFormatterHelper formatter;
    protected LastTime lastTime;
    private boolean mZoomEnabled;
    protected String mdxSid;
    protected ImageButton mdxTarget;
    protected MdxTargetSelection mdxTargetSelector;
    protected ImageButton media;
    protected IconFontTextView skipBack;
    protected NetflixSeekBar timeline;
    protected int timelineWasPreviouslyRendered;
    protected ImageButton zoom;
    protected View zoomDivider;

    public BottomPanel(PlayerActivity playeractivity, PlayScreen.Listeners listeners)
    {
        super(playeractivity);
        mZoomEnabled = true;
        formatter = new TimeFormatterHelper();
        init(listeners);
    }

    private AlertDialog createMdxTargetSelectionDialog(final PlayerActivity controller)
    {
        Object obj = controller.getPlayer();
        int i;
        final boolean wasPlaying;
        if (obj != null)
        {
            wasPlaying = ((IPlayer) (obj)).isPlaying();
        } else
        {
            wasPlaying = false;
        }
        i = mdxTargetSelector.getLocalDevicePosition();
        mdxTargetSelector.setTarget(i);
        obj = new com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder(controller);
        ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).setCancelable(false);
        ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).setTitle(0x7f0c011e);
        ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).setAdapterData(mdxTargetSelector.getTargets(controller));
        ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).setSelection(i, String.format(controller.getString(0x7f0c017a), new Object[] {
            controller.getCurrentTitle()
        }));
        ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final BottomPanel this$0;
            final PlayerActivity val$controller;
            final boolean val$wasPlaying;

            public void onItemClick(AdapterView adapterview, View view, int j, long l)
            {
                Log.d("screen", (new StringBuilder()).append("Mdx target clicked: item with id ").append(l).append(", on position ").append(j).toString());
                controller.removeVisibleDialog();
                if (mdxTargetSelector == null) goto _L2; else goto _L1
_L1:
                mdxTargetSelector.setTarget(j);
                adapterview = mdxTargetSelector.getSelectedTarget();
                if (adapterview != null) goto _L4; else goto _L3
_L3:
                Log.e("screen", "Target is NULL, this should NOT happen!");
                if (wasPlaying)
                {
                    controller.doUnpause();
                }
_L2:
                return;
_L4:
                if (!adapterview.isLocal())
                {
                    break; /* Loop/switch isn't completed */
                }
                Log.d("screen", "Target is local, same as cancel. Do nothing");
                if (wasPlaying)
                {
                    controller.doUnpause();
                    return;
                }
                if (true) goto _L2; else goto _L5
_L5:
                if (Log.isLoggable("screen", 3))
                {
                    Log.d("screen", (new StringBuilder()).append("Remote target is selected ").append(adapterview).toString());
                }
                if (!MdxUtils.isMdxTargetAvailable(controller.getServiceManager(), adapterview.getUUID()))
                {
                    break; /* Loop/switch isn't completed */
                }
                Log.d("screen", "Remote target is available, start MDX playback, use local bookmark!");
                controller.getServiceManager().getMdx().setCurrentTarget(adapterview.getUUID());
                adapterview = controller.getCurrentAsset();
                adapterview.setPlaybackBookmark(controller.getPlayer().getCurrentPositionMs() / 1000);
                PlaybackLauncher.startPlaybackAfterPIN(controller, adapterview);
                if (PlaybackLauncher.shouldPlayOnRemoteTarget(controller.getServiceManager()))
                {
                    controller.finish();
                    return;
                }
                if (true) goto _L2; else goto _L6
_L6:
                Log.w("screen", "Remote target is NOT available anymore, continue local plaback");
                if (wasPlaying)
                {
                    controller.doUnpause();
                    return;
                }
                if (true) goto _L2; else goto _L7
_L7:
            }

            
            {
                this$0 = BottomPanel.this;
                controller = playeractivity;
                wasPlaying = flag;
                super();
            }
        });
        return ((com.netflix.mediaclient.ui.mdx.MdxTargetSelectionDialog.Builder) (obj)).create();
    }

    private int getThumbMiddleX()
    {
        Object obj = timeline;
        if (context.getState().getTimelineExitOnSnap())
        {
            if (((NetflixSeekBar) (obj)).getDentMiddleX() >= 0)
            {
                Log.d("screen", "Exit on snap, use x of middle of dent");
                return ((NetflixSeekBar) (obj)).getDentMiddleX();
            }
            Log.w("screen", "Exit on snap, but dent x is uknown! Use regular thumb position.");
        } else
        {
            Log.d("screen", "Regular x from thumb");
        }
        obj = ((NetflixSeekBar) (obj)).getNetflixThumb();
        if (obj == null)
        {
            Log.e("screen", "Thumb is null!");
            return 0;
        } else
        {
            return ((Drawable) (obj)).getBounds().centerX();
        }
    }

    private void init(PlayScreen.Listeners listeners)
    {
        durationLabel = (TextView)context.findViewById(0x7f07015f);
        bottomPanel = context.findViewById(0x7f07015b);
        if (bottomPanel == null)
        {
            Log.e("screen", "========>bottom null!");
        }
        timeline = (NetflixSeekBar)context.findViewById(0x7f07015e);
        if (timeline != null)
        {
            timeline.setOnSeekBarChangeListener(listeners.videoPositionListener);
            timeline.setDentVisible(false);
            android.graphics.Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), context.getUiResources().timelineDent);
            timeline.setScrubberDent(bitmap);
            timeline.setThumbOffset(AndroidUtils.dipToPixels(context, context.getUiResources().timelineThumbOffsetInDip));
            timeline.setProgressBarPadding(AndroidUtils.dipToPixels(context, context.getUiResources().timelineHeightPaddingInDip));
        }
        media = (ImageButton)context.findViewById(0x7f07015c);
        if (media != null)
        {
            media.setOnClickListener(listeners.playPauseListener);
            media.setBackgroundColor(transpColor);
        }
        skipBack = (IconFontTextView)context.findViewById(0x7f07015d);
        if (skipBack != null)
        {
            skipBack.setOnClickListener(listeners.skipBackListener);
            skipBack.setBackgroundColor(transpColor);
        }
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final BottomPanel this$0;

            public void onClick(View view)
            {
                view = context;
                if (view != null)
                {
                    view.extendTimeoutTimer();
                }
                displayMdxTargets();
            }

            
            {
                this$0 = BottomPanel.this;
                super();
            }
        };
        mdxTarget = (ImageButton)context.findViewById(0x7f070156);
        if (mdxTarget != null)
        {
            mdxTarget.setOnClickListener(onclicklistener);
            mdxTarget.setBackgroundColor(transpColor);
        }
        zoomDivider = context.findViewById(0x7f070160);
        zoom = (ImageButton)context.findViewById(0x7f070161);
        if (zoom != null)
        {
            zoom.setOnClickListener(listeners.zoomListener);
            zoom.setBackgroundColor(transpColor);
        }
        currentTime = CurrentTime.newInstance(context);
        lastTime = new LastTime(context);
    }

    private boolean isMdxTargetSelectionVisible()
    {
        return isMdxTargetSelectionVisible(mdxTargetSelector);
    }

    private boolean isMdxTargetSelectionVisible(MdxTargetSelection mdxtargetselection)
    {
        return mdxtargetselection != null && mdxtargetselection.getMdxTargets() != null && mdxtargetselection.getMdxTargets().length > 1;
    }

    private boolean isVisible()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (bottomPanel != null)
        {
            flag = flag1;
            if (bottomPanel.getVisibility() == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void changeActionState(boolean flag)
    {
        enableButtons(flag);
        if (timeline != null)
        {
            timeline.setEnabled(flag);
        }
    }

    public void destroy()
    {
        if (timeline != null)
        {
            timeline.setOnSeekBarChangeListener(null);
        }
        if (media != null)
        {
            media.setOnTouchListener(null);
        }
        if (skipBack != null)
        {
            skipBack.setOnTouchListener(null);
        }
        if (mdxTarget != null)
        {
            mdxTarget.setOnTouchListener(null);
        }
        if (zoom != null)
        {
            zoom.setOnTouchListener(null);
        }
    }

    protected void displayMdxTargets()
    {
        if (mdxTargetSelector == null || mdxTargetSelector.getMdxTargets() == null || mdxTargetSelector.getMdxTargets().length < 2)
        {
            Log.d("screen", "Non local targets are not available!");
        } else
        {
            PlayerActivity playeractivity = context;
            if (playeractivity != null)
            {
                Log.d("screen", "MDX target is reachable, display dialog");
                playeractivity.displayDialog(createMdxTargetSelectionDialog(playeractivity));
                return;
            }
        }
    }

    public void enableButtons(boolean flag)
    {
        enableButton(media, flag);
        enableButton(skipBack, flag);
        enableButton(mdxTarget, flag);
        enableButton(zoom, flag);
    }

    public CurrentTime getCurrentTime()
    {
        return currentTime;
    }

    public TimeFormatterHelper getFormatter()
    {
        return formatter;
    }

    public LastTime getLastTime()
    {
        return lastTime;
    }

    public MdxTargetSelection getMdxTargetSelector()
    {
        return mdxTargetSelector;
    }

    public ImageButton getMedia()
    {
        return media;
    }

    public int getTimeX(View view)
    {
        NetflixSeekBar netflixseekbar = timeline;
        int ai[] = new int[2];
        netflixseekbar.getLocationOnScreen(ai);
        int i = getThumbMiddleX();
        if (i <= 0)
        {
            return 0;
        } else
        {
            return (int)(float)((ai[0] + i + netflixseekbar.getPaddingLeft() / 2) - view.getWidth() / 2);
        }
    }

    public NetflixSeekBar getTimeline()
    {
        return timeline;
    }

    public ImageButton getZoom()
    {
        return zoom;
    }

    public void hide()
    {
        this;
        JVM INSTR monitorenter ;
        if (media != null)
        {
            media.setVisibility(8);
        }
        if (skipBack != null)
        {
            skipBack.setVisibility(8);
        }
        if (zoom != null)
        {
            zoom.setVisibility(8);
        }
        if (zoomDivider != null)
        {
            zoomDivider.setVisibility(8);
        }
        if (mdxTarget != null && isMdxTargetSelectionVisible())
        {
            mdxTarget.setVisibility(8);
        }
        if (currentTime != null)
        {
            currentTime.hide();
        }
        if (bottomPanel != null)
        {
            bottomPanel.setVisibility(8);
        }
        if (lastTime != null)
        {
            lastTime.setLastTimeState(false);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void initProgress(int i)
    {
        if (timeline != null)
        {
            timeline.setMax(i);
        }
    }

    public void setMdxTargetSelector(MdxTargetSelection mdxtargetselection)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        boolean flag1;
        mdxTargetSelector = mdxtargetselection;
        flag = isMdxTargetSelectionVisible();
        flag1 = isVisible();
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("Bottom panel is visible: ").append(flag1).toString());
            Log.d("screen", (new StringBuilder()).append("MDX target whould be visible: ").append(flag).toString());
        }
        if (!flag1) goto _L2; else goto _L1
_L1:
        if (context != null) goto _L4; else goto _L3
_L3:
        Log.w("screen", "Player activity was destroyed, do nothing");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (mdxTarget == null) goto _L2; else goto _L7
_L7:
        mdxTarget.setVisibility(0);
          goto _L2
        mdxtargetselection;
        throw mdxtargetselection;
_L6:
        if (mdxTarget == null) goto _L2; else goto _L8
_L8:
        mdxTarget.setVisibility(8);
          goto _L2
    }

    public int setProgress(int i, int j, boolean flag, boolean flag1)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("SetProgress: pos ").append(i).append(", duration ").append(j).append(", updateSeekBar ").append(flag).append(", forceUpdate ").append(flag1).toString());
        }
        if (!flag1 && (media == null || !media.isEnabled()))
        {
            Log.d("screen", "Ignoring setProgress");
            return 0;
        }
        if (timeline != null && flag)
        {
            timeline.setProgress(i);
        }
        if (durationLabel != null && j > 0)
        {
            durationLabel.setText(formatter.getStringForMs(j - i));
        }
        updateText("screen", currentTime.getCurrentTimeLabel(), "currentTimeLabel", formatter.getStringForMs(i));
        return i;
    }

    public void setZoomEnabled(boolean flag)
    {
        mZoomEnabled = flag;
    }

    public void show()
    {
        this;
        JVM INSTR monitorenter ;
        if (media != null)
        {
            media.setVisibility(0);
        }
        if (skipBack != null)
        {
            skipBack.setVisibility(0);
        }
        if (mdxTarget != null && isMdxTargetSelectionVisible())
        {
            mdxTarget.setVisibility(0);
        }
        if (bottomPanel != null)
        {
            bottomPanel.setVisibility(0);
        }
        if (zoom == null) goto _L2; else goto _L1
_L1:
        if (!mZoomEnabled) goto _L4; else goto _L3
_L3:
        zoom.setVisibility(0);
        if (zoomDivider != null)
        {
            zoomDivider.setVisibility(0);
        }
_L2:
        if (timelineWasPreviouslyRendered <= 0)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        Log.d("screen", "Timeline was visible before, its location is known, render current time now");
        currentTime.move(true, true);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        zoom.setVisibility(8);
        if (zoomDivider != null)
        {
            zoomDivider.setVisibility(8);
        }
          goto _L2
        Exception exception;
        exception;
        throw exception;
        Log.d("screen", "Timeline was NOT visible before, its location is NOT known, delay until is rendered first time");
        final NetflixSeekBar fTimeline = timeline;
        fTimeline.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final BottomPanel this$0;
            final SeekBar val$fTimeline;

            public void onGlobalLayout()
            {
                Log.d("screen", "Timeline is visible now, its location is known, render current time now!!! <==");
                if (timelineWasPreviouslyRendered > 1)
                {
                    ViewUtils.removeGlobalLayoutListener(fTimeline, this);
                }
                BottomPanel bottompanel = BottomPanel.this;
                bottompanel.timelineWasPreviouslyRendered = bottompanel.timelineWasPreviouslyRendered + 1;
                currentTime.move(true, true);
            }

            
            {
                this$0 = BottomPanel.this;
                fTimeline = seekbar;
                super();
            }
        });
          goto _L5
    }

    public void snapToPosition(int i, int j)
    {
        if (Log.isLoggable("screen", 3))
        {
            Log.d("screen", (new StringBuilder()).append("snapToPosition: pos ").append(i).toString());
        }
        if (timeline != null)
        {
            Log.d("screen", "snapToPosition: snap now!");
            timeline.snapToLastTime();
        } else
        {
            Log.e("screen", "snapToPosition: timeline null?!");
        }
        if (durationLabel != null && j > 0)
        {
            durationLabel.setText(formatter.getStringForMs(j - i));
        }
        updateText("screen", currentTime.getCurrentTimeLabel(), "currentTimeLabel", formatter.getStringForMs(i));
    }
}
