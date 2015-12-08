// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsSeekBar;
import android.widget.RatingBar;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.VideoDetailsProvider;
import com.netflix.mediaclient.util.LogUtils;
import java.lang.reflect.Field;

public class NetflixRatingBar extends RatingBar
    implements android.widget.RatingBar.OnRatingBarChangeListener
{
    private class SetVideoRatingCallback extends LoggingManagerCallback
    {

        private final int rating;
        final NetflixRatingBar this$0;

        public void onVideoRatingSet(int i)
        {
            super.onVideoRatingSet(i);
            if (provider == null || provider.destroyed())
            {
                Log.v("NetflixRatingBar", "Activity destroyed - ignoring ratings update callback");
                return;
            }
            setEnabled(true);
            if (i != 0)
            {
                Log.w("NetflixRatingBar", "Invalid status code");
                Toast.makeText(getContext(), 0x7f0c0150, 1).show();
                setRating(currRating);
                return;
            }
            Log.v("NetflixRatingBar", "Rating has been updated");
            Toast.makeText(getContext(), 0x7f0c0151, 1).show();
            currRating = rating;
            com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs;
            if (details != null)
            {
                details.setUserRating(rating);
            } else
            {
                Log.e("NetflixRatingBar", "Failed to update rating, details missing!");
            }
            updateRatingDrawable();
            setRating(currRating);
            Log.d("NetflixRatingBar", "Report rate action ended");
            logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
            LogUtils.reportRateActionEnded(getContext(), logreporterrorargs.getReason(), logreporterrorargs.getError(), null, Integer.valueOf(currRating));
        }

        public SetVideoRatingCallback(int i)
        {
            this$0 = NetflixRatingBar.this;
            super("NetflixRatingBar");
            rating = i;
        }
    }


    private static final String TAG = "NetflixRatingBar";
    private int currRating;
    private VideoDetails details;
    private boolean dispatchedCallback;
    private Drawable netflixStars;
    private VideoDetailsProvider provider;
    private Drawable userStars;

    public NetflixRatingBar(Context context)
    {
        super(context);
        init();
    }

    public NetflixRatingBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public NetflixRatingBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private Shape getDrawableShape()
    {
        return new RoundRectShape(new float[] {
            5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
        }, null, null);
    }

    private float getProgressPerStar()
    {
        float f = 1.0F;
        if (getNumStars() > 0)
        {
            f = (1.0F * (float)getMax()) / (float)getNumStars();
        }
        return f;
    }

    private int getUserRating()
    {
        if (details == null)
        {
            return 0;
        } else
        {
            return (int)details.getUserRating();
        }
    }

    private void handleUserUpate(int i)
    {
        setEnabled(false);
        if (provider == null)
        {
            Log.w("NetflixRatingBar", "Can't set rating because provider is null");
            return;
        }
        ServiceManager servicemanager = provider.getServiceManager();
        if (servicemanager == null)
        {
            Log.w("NetflixRatingBar", "Can't set rating because service man is null");
            return;
        }
        if (Log.isLoggable("NetflixRatingBar", 2))
        {
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Video ID: ").append(provider.getVideoId()).toString());
        }
        String s = provider.getVideoId();
        int j;
        if (provider.getPlayContext() != null)
        {
            j = provider.getPlayContext().getTrackId();
        } else
        {
            j = -1;
        }
        servicemanager.setVideoRating(s, i, j, new SetVideoRatingCallback(i));
    }

    private void init()
    {
        netflixStars = tileify(getResources().getDrawable(0x7f020171), true);
        userStars = tileify(getResources().getDrawable(0x7f020172), true);
        setOnRatingBarChangeListener(this);
        Context context = getContext();
        if (context instanceof VideoDetailsProvider)
        {
            Log.d("NetflixRatingBar", "Owner activity is provider");
            provider = (VideoDetailsProvider)context;
        } else
        {
            Log.d("NetflixRatingBar", (new StringBuilder()).append("Owner activity is NOT provider ").append(context).toString());
        }
        setFocusable(false);
    }

    private boolean isDragging()
    {
        Log.v("NetflixRatingBar", "Getting isDragging field");
        boolean flag;
        Field field = android/widget/AbsSeekBar.getDeclaredField("mIsDragging");
        field.setAccessible(true);
        flag = field.getBoolean(this);
        return flag;
        Object obj;
        obj;
        logDraggingFieldWarning();
_L2:
        return false;
        obj;
        logDraggingFieldWarning();
        continue; /* Loop/switch isn't completed */
        obj;
        logDraggingFieldWarning();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void logDraggingFieldWarning()
    {
        Log.w("NetflixRatingBar", "Could not read mIsDragging field");
    }

    private Drawable tileify(Drawable drawable, boolean flag)
    {
label0:
        {
            if (drawable instanceof LayerDrawable)
            {
                LayerDrawable layerdrawable1 = (LayerDrawable)drawable;
                int k = layerdrawable1.getNumberOfLayers();
                drawable = new Drawable[k];
                int i = 0;
                while (i < k) 
                {
                    int l = layerdrawable1.getId(i);
                    Drawable drawable1 = layerdrawable1.getDrawable(i);
                    if (l == 0x102000d || l == 0x102000f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    drawable[i] = tileify(drawable1, flag);
                    i++;
                }
                LayerDrawable layerdrawable = new LayerDrawable(drawable);
                i = 0;
                do
                {
                    drawable = layerdrawable;
                    if (i >= k)
                    {
                        break;
                    }
                    layerdrawable.setId(i, layerdrawable1.getId(i));
                    i++;
                } while (true);
            } else
            {
                if (!(drawable instanceof StateListDrawable))
                {
                    break label0;
                }
                StateListDrawable statelistdrawable1 = (StateListDrawable)drawable;
                StateListDrawable statelistdrawable = new StateListDrawable();
                int j = 0 + 1;
                statelistdrawable1.setLevel(0);
                for (drawable = statelistdrawable1.getCurrent(); drawable != null;)
                {
                    statelistdrawable.addState(statelistdrawable1.getState(), tileify(drawable, flag));
                    statelistdrawable1.setLevel(j);
                    drawable = statelistdrawable1.getCurrent();
                    j++;
                }

                drawable = statelistdrawable;
            }
            return drawable;
        }
        if (drawable instanceof BitmapDrawable)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
            ShapeDrawable shapedrawable = new ShapeDrawable(getDrawableShape());
            drawable = new BitmapShader(drawable, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
            shapedrawable.getPaint().setShader(drawable);
            drawable = shapedrawable;
            if (flag)
            {
                drawable = new ClipDrawable(shapedrawable, 3, 1);
            }
            return drawable;
        } else
        {
            return drawable;
        }
    }

    private void updateRatingDrawable()
    {
        if (Log.isLoggable("NetflixRatingBar", 2))
        {
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Updating rating drawable, progress: ").append(getProgress()).append(", user rating: ").append(getUserRating()).toString());
        }
        if (getUserRating() > 0)
        {
            setProgressDrawable(userStars);
            setStepSize(1.0F);
        } else
        {
            setProgressDrawable(netflixStars);
        }
        updateSecondaryProgress();
    }

    private void updateSecondaryProgress()
    {
        float f = getProgressPerStar();
        if (f > 0.0F)
        {
            int i = (int)(((float)getProgress() / f) * f + 0.5F);
            if (Log.isLoggable("NetflixRatingBar", 2))
            {
                Log.v("NetflixRatingBar", (new StringBuilder()).append("Setting secondary progress: ").append(i).toString());
            }
            setSecondaryProgress(i);
        }
    }

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        dispatchedCallback = true;
        int i = (int)Math.ceil(f);
        if (Log.isLoggable("NetflixRatingBar", 2))
        {
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Rating changed: ").append(i).append(", from user: ").append(flag).toString());
        }
        setContentDescription(String.format(getResources().getString(0x7f0c0148), new Object[] {
            Integer.valueOf(i)
        }));
        if (flag && getUserRating() != i)
        {
            int j = (int)((float)i * getProgressPerStar());
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Setting progress: ").append(j).toString());
            setProgress(j);
            handleUserUpate(i);
            if (provider != null)
            {
                provider.onActionExecuted();
            } else
            {
                Log.e("NetflixRatingBar", "Provider is NULL!");
            }
        } else
        {
            currRating = i;
        }
        updateRatingDrawable();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag = isDragging();
        Log.v("NetflixRatingBar", (new StringBuilder()).append("isDragging: ").append(flag).toString());
        dispatchedCallback = false;
        flag1 = super.onTouchEvent(motionevent);
        if (dispatchedCallback) goto _L2; else goto _L1
_L1:
        NetflixActivity netflixactivity = (NetflixActivity)getContext();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 92
    //                   0 95
    //                   1 116
    //                   2 92
    //                   3 129;
           goto _L2 _L3 _L4 _L2 _L5
_L2:
        return flag1;
_L3:
        Log.d("NetflixRatingBar", "Report rate action started");
        LogUtils.reportRateActionStarted(netflixactivity, null, netflixactivity.getUiScreen());
        return flag1;
_L4:
        onRatingChanged(this, getRating(), true);
        return flag1;
_L5:
        if (flag)
        {
            onRatingChanged(this, getRating(), true);
            return flag1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void setDetails(VideoDetails videodetails)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("setting details: ");
        String s;
        if (videodetails == null)
        {
            s = "n/a";
        } else
        {
            s = videodetails.getTitle();
        }
        Log.v("NetflixRatingBar", stringbuilder.append(s).toString());
        if (videodetails == null)
        {
            return;
        }
        details = videodetails;
        float f;
        if (videodetails.getUserRating() > 0.0F)
        {
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Using user rating: ").append(videodetails.getUserRating()).toString());
            f = videodetails.getUserRating();
        } else
        {
            Log.v("NetflixRatingBar", (new StringBuilder()).append("Using predicted rating: ").append(videodetails.getPredictedRating()).toString());
            f = videodetails.getPredictedRating();
        }
        setRating(f);
    }




/*
    static int access$102(NetflixRatingBar netflixratingbar, int i)
    {
        netflixratingbar.currRating = i;
        return i;
    }

*/


}
