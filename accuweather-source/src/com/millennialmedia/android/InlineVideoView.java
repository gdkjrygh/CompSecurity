// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMLayout, MMAdImplController, MMLog, VideoAd, 
//            AdViewOverlayView, Utils

class InlineVideoView extends VideoView
    implements Serializable
{
    static class InlineParams
    {

        public static final String autoPlayKey = "autoPlay";
        public static final String bodyHeightKey = "bodyHeight";
        public static final String bodyWidthKey = "bodyWidth";
        public static final String cachedVideoIDKey = "cachedVideoID";
        public static final String cachedVideoURIKey = "cachedVideoURI";
        public static final String currentPositionKey = "currentPosition";
        public static final String expandedKey = "expanded";
        public static final String heightKey = "height";
        public static final String playerStateKey = "playerState";
        public static final String scaleFactorKey = "scaleFactor";
        public static final String showControlsKey = "showControls";
        public static final String streamVideoURIKey = "streamVideoURI";
        public static final String touchCallBackKey = "touchCallBack";
        public static final String videoStateKey = "videoState";
        public static final String widthKey = "width";
        public static final String xKey = "x";
        public static final String yKey = "y";
        boolean autoPlay;
        int bodyHeight;
        int bodyWidth;
        String cachedVideoID;
        String cachedVideoURI;
        int currentPosition;
        boolean expanded;
        int height;
        PlayerState playerState;
        float scaleFactor;
        boolean showControls;
        String streamVideoURI;
        String touchCallBack;
        VideoState videoState;
        int width;
        int x;
        int y;

        public String toJsonString()
        {
            Object obj;
            try
            {
                obj = new JSONObject();
                ((JSONObject) (obj)).put("x", x);
                ((JSONObject) (obj)).put("expanded", expanded);
                ((JSONObject) (obj)).put("y", y);
                ((JSONObject) (obj)).put("bodyWidth", bodyWidth);
                ((JSONObject) (obj)).put("bodyHeight", bodyHeight);
                ((JSONObject) (obj)).put("width", width);
                ((JSONObject) (obj)).put("height", height);
                ((JSONObject) (obj)).put("currentPosition", currentPosition);
                ((JSONObject) (obj)).put("playerState", playerState.ordinal());
                ((JSONObject) (obj)).put("videoState", videoState.ordinal());
                ((JSONObject) (obj)).put("streamVideoURI", streamVideoURI);
                ((JSONObject) (obj)).put("cachedVideoURI", cachedVideoURI);
                ((JSONObject) (obj)).put("cachedVideoID", cachedVideoID);
                ((JSONObject) (obj)).put("touchCallBack", touchCallBack);
                ((JSONObject) (obj)).put("autoPlay", autoPlay);
                ((JSONObject) (obj)).put("showControls", showControls);
                ((JSONObject) (obj)).put("scaleFactor", scaleFactor);
                obj = ((JSONObject) (obj)).toString();
            }
            catch (JSONException jsonexception)
            {
                MMLog.e("InlineVideoView", "Error converting InlineParams to json string", jsonexception);
                return null;
            }
            return ((String) (obj));
        }

        public String toString()
        {
            return String.format(Locale.ENGLISH, "cached video id: %s, x: %d, y: %d, body width: %d, body height: %d, current position: %d, auto play: %b, player state: %d, video state: %d", new Object[] {
                cachedVideoID, Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(bodyWidth), Integer.valueOf(bodyHeight), Integer.valueOf(currentPosition), Boolean.valueOf(autoPlay), Integer.valueOf(playerState.ordinal()), Integer.valueOf(videoState.ordinal())
            });
        }

        public InlineParams(String s)
        {
            playerState = PlayerState.DEFAULT;
            videoState = VideoState.DEFAULT;
            try
            {
                s = new JSONObject(s);
                x = Utils.getJSONInt(s, "x", 0);
                y = Utils.getJSONInt(s, "y", 0);
                bodyWidth = Utils.getJSONInt(s, "bodyWidth", 0);
                bodyHeight = Utils.getJSONInt(s, "bodyHeight", 0);
                width = Utils.getJSONInt(s, "width", 0);
                height = Utils.getJSONInt(s, "height", 0);
                expanded = Utils.getJSONBoolean(s, "expanded", false);
                currentPosition = Utils.getJSONInt(s, "currentPosition", 0);
                int i = Utils.getJSONInt(s, "playerState", 0);
                playerState = PlayerState.values()[i];
                i = Utils.getJSONInt(s, "videoState", 0);
                videoState = VideoState.values()[i];
                streamVideoURI = Utils.getJSONString(s, "streamVideoURI", "");
                cachedVideoURI = Utils.getJSONString(s, "cachedVideoURI", "");
                cachedVideoID = Utils.getJSONString(s, "cachedVideoID", "");
                touchCallBack = Utils.getJSONString(s, "touchCallBack", "");
                autoPlay = Utils.getJSONBoolean(s, "autoPlay", false);
                showControls = Utils.getJSONBoolean(s, "showControls", false);
                scaleFactor = (float)Utils.getJSONDouble(s, "scaleFactor", 0.0D);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                MMLog.e("InlineVideoView", "Error creating inline param object", s);
            }
        }

        InlineParams(Map map, Context context)
        {
            playerState = PlayerState.DEFAULT;
            videoState = VideoState.DEFAULT;
            if (map.get("x") != null)
            {
                x = (int)Float.parseFloat((String)map.get("x"));
            }
            if (map.get("y") != null)
            {
                y = (int)Float.parseFloat((String)map.get("y"));
            }
            if (map.get("width") != null)
            {
                width = (int)Float.parseFloat((String)map.get("width"));
            }
            if (map.get("height") != null)
            {
                height = (int)Float.parseFloat((String)map.get("height"));
            }
            streamVideoURI = (String)map.get("streamVideoURI");
            cachedVideoURI = (String)map.get("cachedVideoURI");
            cachedVideoID = (String)map.get("cachedVideoID");
            if (map.get("autoPlay") != null)
            {
                autoPlay = Boolean.parseBoolean((String)map.get("autoPlay"));
            }
            if (map.get("showControls") != null)
            {
                showControls = Boolean.parseBoolean((String)map.get("showControls"));
            }
            if (map.get("bodyWidth") != null)
            {
                bodyWidth = (int)Float.parseFloat((String)map.get("bodyWidth"));
            }
            if (map.get("bodyHeight") != null)
            {
                bodyHeight = (int)Float.parseFloat((String)map.get("bodyHeight"));
            }
            touchCallBack = (String)map.get("touchCallback");
            scaleFactor = context.getResources().getDisplayMetrics().density;
        }
    }

    static final class InlineParams.PlayerState extends Enum
    {

        private static final InlineParams.PlayerState $VALUES[];
        public static final InlineParams.PlayerState DEFAULT;
        public static final InlineParams.PlayerState PAUSE;
        public static final InlineParams.PlayerState PLAY;
        public static final InlineParams.PlayerState RESUME;
        public static final InlineParams.PlayerState STOP;

        public static InlineParams.PlayerState valueOf(String s)
        {
            return (InlineParams.PlayerState)Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$PlayerState, s);
        }

        public static InlineParams.PlayerState[] values()
        {
            return (InlineParams.PlayerState[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new InlineParams.PlayerState("DEFAULT", 0);
            STOP = new InlineParams.PlayerState("STOP", 1);
            PLAY = new InlineParams.PlayerState("PLAY", 2);
            PAUSE = new InlineParams.PlayerState("PAUSE", 3);
            RESUME = new InlineParams.PlayerState("RESUME", 4);
            $VALUES = (new InlineParams.PlayerState[] {
                DEFAULT, STOP, PLAY, PAUSE, RESUME
            });
        }

        private InlineParams.PlayerState(String s, int i)
        {
            super(s, i);
        }
    }

    static final class InlineParams.VideoState extends Enum
    {

        private static final InlineParams.VideoState $VALUES[];
        public static final InlineParams.VideoState DEFAULT;
        public static final InlineParams.VideoState PREPARED;
        public static final InlineParams.VideoState PREPARING;

        public static InlineParams.VideoState valueOf(String s)
        {
            return (InlineParams.VideoState)Enum.valueOf(com/millennialmedia/android/InlineVideoView$InlineParams$VideoState, s);
        }

        public static InlineParams.VideoState[] values()
        {
            return (InlineParams.VideoState[])$VALUES.clone();
        }

        static 
        {
            DEFAULT = new InlineParams.VideoState("DEFAULT", 0);
            PREPARING = new InlineParams.VideoState("PREPARING", 1);
            PREPARED = new InlineParams.VideoState("PREPARED", 2);
            $VALUES = (new InlineParams.VideoState[] {
                DEFAULT, PREPARING, PREPARED
            });
        }

        private InlineParams.VideoState(String s, int i)
        {
            super(s, i);
        }
    }

    private static class MediaController extends android.widget.MediaController
    {

        private static final String COLLAPSE_PNG = "iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABOpJREFUeNrUmmtIY0cUgCfJ3VBXUXxR0dp2Ya0aBSFi6yOtFPGF1d1WavrAXy1YwVcLLaQpttsH+lcbirYq0a3Ptd0WpKi1P1SMaAitJNptalcQIwV/iI+o2ST39kx6I9cY3STcuSYHhjuTzD33fJk5M+fciWh9fR0tLCwgrhwfH6OcnBwkl8ur9vb2DIODg5aIiAjkq1itViQWi1FYWBgiKYmJiQhptdpzX6SlpSGz2fwRwzDHR0dH83V1dYn+KK6oqLjR19enQISluLgYof7+/jMfZmRkIIvFcoc5K783NTU95YvSsrKyFLvd/s/a2pqRNEBJSclZAJlMhra2tjyNP4Vobm5OukxhaWlpysnJyQPceXl5WS8SicgDDAwMuBrp6enY+M+Zy2UFIJ72pqy8vDwFfOcvd0ebzWYoLCwkD9DR0YFSU1Ox8W2Mb7IKEM+4lWBnHRoaSnM6nX97jhhAkQfQ6/XXNjY27jD+iamhoeFZiqLQyMhIOrQfeuljhCklJg4AD7rFBCA0Tf+h0+luQ9V80UgBAEUaQAzrvB7qk/7eDA6alZeXdx+qKRd0wb++hPRKJIZNaru+vv4NqP/Gs25sPEUcIDw8HHV1de2BY1bzDCFmC1kA91rd2dmJIV6D6nRIjQC3ARD7LMQvPOmWCArAQlhbWlqUPEBIrgQAC2xuh42NjUoI5O5BkwmpEXCLRqM5XFlZ+Qaq9qB2Yq9jL5HgHRaW+bzvoSkNZic+9wA2tnmxpqbmB2jGB7sPUB67KzZeAcb/CM24kHBi9z6Ar8PDwy8plcr7PBgvnBND9uSa82D8y2D8TzwZLxgAhRN4yF+zwfhfeX7gdSjXiANgp11cXDyCjOxr1ick7MojYQ2g2Cu3fvpZcnKyOCEhQcL5xd1XK+QLu8QB2GDuTyjvB6IgKSkJZWZmejouLrTBYLAJvoz6KxaLxVVYcbLljOTm5oqioqLwlHJw+jB4+s7NzQX8bIfDQX6jwdLb2/upTCZ7kzWcZouTHSUnZHd2tv2IvdrZ4vC4uuv09va2eXx8XCMIgNVqxXPsOW/fZWdnB6TTZrNp8egJAgByyKey/f19LeTD7+IFSCwQgINH47+rrKx8Z2lpyRkZGSkYwCM+lBwcHHwLxtfB1ME+hN+ohM4IsMa/B8YzPuUDwQSwu7urAePrZ2dnGd73AdJTCGK1n2traxvBeP8ysmAZAQhHXlCpVK/Ex8dfKUCgaSkO8xMKCgpGJycnb3uDCBUnvi6Xy4cA4lZcXFxIAmAJA4iRqamp12NjY0+TsJDaB0CeAIjB6enpmujo6P8PE0NtJ8Y5CEDcnZiYUOJQngpBACzS/Pz8u1lZWfSVr0I7OzufrK6uqgMZCUjG3qauEgDCgy+qqqq+woftsFGJIGf40g+dD+fn51XnzolJCCQtb3meP21ubn7GPcXE89lkMql9POFab21tTYVMDwkCMDMzo+Q+fXR0VI1DYW/5tdFoVD3G+AdtbW2uY62ioiJhAKqrq1/lGo9PNy8S/P8HgPjwEuNvuvueO6knDTA2NvbxZcY/BmKtvb39JrefC6Cnp4c4AMQyT3Z3d5f6cw9+3aPT6T7AlkNEalKr1Tc8+ygUCiSC7B7BMkYUgKZpnIQjqVTqeo3pYxjtGglY65+H+ib40b949Lj/v4iJiUH/CTAAFI2ZNCJ5irUAAAAASUVORK5CYII=";
        private static final String EXPAND_PNG = "iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABEZJREFUeNrUml9IU1Ecx8+2uwnCrBlaGD2YEKiVla2ypAj8X+l8KYpkLxUFoT0VBT1YUYYP6ktQCGUQgQr+w0o3sgdDEv+AaBH9odicEq4XY25u7vY9dhe3m9N5d+8Z/uDHvRzPn+/nnN/5d6eG5/mNhJCjcAPcD18QngHhPSDxBVE+cfo/aXa7/afL5eKJipaSkkI4QfwzuBZOGwwKQoKS90jTqOvm5uZqrFbrYzUB8vPzFwEMgnhqGtq44LLN4/F8bmxsfEdUNo1GswjgF3peo0SlED9hsVhKbTbbV8LAtELMBhUSP1ZeXn6clXgxwEK0FSHmqfgTvb293whD45QAEMQfh3gHYWxa0eohy2ZmZt4i5o/19PQwFx8CmI9mBLq6umrQ804SI4t6BCoqKh5UVVWZYwVAsBMfhrv56GwKEPtYay8oKFgEyIH/4KO36crKyoOxADDTxnll7AcgDrEG2A2f5JUzCpHLEmAn3MEraxTiCCuAdPj3ZcR4ZEK4MbH3qw2w7FFidna2t6mpiU7M1zLqT8QSu43FMroV/vm/bvd47Dhvm2ge9OQGJL1ZTfc7nc77WVlZOhYhtAX+USLeVlhYaBJnXg0ExN/LyMhgNolT4B9CjeNg9hLiE5YqAAgTsthWEp+ens50Gd0If08b93q9r8KJF0GsR1Z7GPG3WfS8FCCBzgGfz/e6qKgoIZKCWCLXS0dicnKyOjMzk/1Roq+vj+AsfyA7OzthNYUBYYTuF/BALMT/BcDlW3YFubm58Qi5vampqTE5iFIATq/Xy66gv7/fg8eQ3PJ5eXmbdTrduqGhofdut1vOHZwQbFQx6b2GhoZMhN8n+K/h4eHypKSkiMvGxcXRsN9XXV29KSYA9fX1GRD+RbQGeAFxMhIIKr6zs/M0yvjh55gDQPx2ifiQ+QBxKjk5eSXxZwTx1C4xBYB4evL9tsw+6B0ZGVkSwmAwkI6ODip+XpT/MjOAurq6HSucev+OBCAqxBCCeKtEPLUrqgPQxtHzeyIUH7L50dHRs4mJiYt1tLe3W0VhI7arqgMUFxfHSw+LEZpvcHDwZHd39+kw4qnd4NQOnfHxcf/ExMQAdurV3g0MZrP5ufDROdyHZ71WbQCHw+HHjnkRIE9lfrda7qs5p2UxgV0ulxeXo3OAeKJw1TotqyV0enqajsR5hSEMzACoTU1NBXD4oxCNClXJMQUQwolCXMDEfqRAdXrmAAIETyf22NjYQ/Ln5621MwJiCIvFcjEQCAysuREI7dC1tbVVuA/simYEuFiJb2lpuVZaWlqz5iYxvQE2NzcrIZ59CHEYcPT89bKyshql+oMZAGKdtLa23oT4u0r2CRMAk8mkb2truwPxt5SeTpzf71cdIC0tzVhSUpKP1++hARFcu8RzqbSwBzoN1mOCXVFVgGAwSHJycuKMRmM8+fcfSqQg0jQuzN90Qj3O3wIMAN8Np0JgnxtnAAAAAElFTkSuQmCC";
        private BitmapDrawable collapseDrawable;
        private BitmapDrawable expandDrawable;
        private WeakReference videoRef;

        public void setAnchorView(View view)
        {
            super.setAnchorView(view);
            if (collapseDrawable != null && expandDrawable != null) goto _L2; else goto _L1
_L1:
            MMLog.e("InlineVideoView", "Not adding collapse / expand button to media controls overlay, no drawables available");
_L4:
            return;
_L2:
            InlineVideoView inlinevideoview;
            view = new Button(getContext());
            inlinevideoview = (InlineVideoView)videoRef.get();
            if (inlinevideoview == null) goto _L4; else goto _L3
_L3:
            if (!inlinevideoview.inlineParams.expanded || collapseDrawable == null) goto _L6; else goto _L5
_L5:
            view.setBackgroundDrawable(collapseDrawable);
_L8:
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final MediaController this$0;

                public void onClick(View view)
                {
                    view = (InlineVideoView)videoRef.get();
                    if (view == null)
                    {
                        return;
                    }
                    InlineParams inlineparams = ((InlineVideoView) (view)).inlineParams;
                    boolean flag;
                    if (!((InlineVideoView) (view)).inlineParams.expanded)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    inlineparams.expanded = flag;
                    view.resizeVideo();
                }

            
            {
                this$0 = MediaController.this;
                super();
            }
            });
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2, 5);
            layoutparams.setMargins(0, 20, 10, 0);
            addView(view, layoutparams);
            return;
_L6:
            if (expandDrawable != null)
            {
                view.setBackgroundDrawable(expandDrawable);
            }
            if (true) goto _L8; else goto _L7
_L7:
        }


        public MediaController(InlineVideoView inlinevideoview)
        {
            super(inlinevideoview.getContext());
            videoRef = new WeakReference(inlinevideoview);
            try
            {
                expandDrawable = Utils.loadEncodedBitmapDrawable(inlinevideoview.getContext(), "iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABEZJREFUeNrUml9IU1Ecx8+2uwnCrBlaGD2YEKiVla2ypAj8X+l8KYpkLxUFoT0VBT1YUYYP6ktQCGUQgQr+w0o3sgdDEv+AaBH9odicEq4XY25u7vY9dhe3m9N5d+8Z/uDHvRzPn+/nnN/5d6eG5/mNhJCjcAPcD18QngHhPSDxBVE+cfo/aXa7/afL5eKJipaSkkI4QfwzuBZOGwwKQoKS90jTqOvm5uZqrFbrYzUB8vPzFwEMgnhqGtq44LLN4/F8bmxsfEdUNo1GswjgF3peo0SlED9hsVhKbTbbV8LAtELMBhUSP1ZeXn6clXgxwEK0FSHmqfgTvb293whD45QAEMQfh3gHYWxa0eohy2ZmZt4i5o/19PQwFx8CmI9mBLq6umrQ804SI4t6BCoqKh5UVVWZYwVAsBMfhrv56GwKEPtYay8oKFgEyIH/4KO36crKyoOxADDTxnll7AcgDrEG2A2f5JUzCpHLEmAn3MEraxTiCCuAdPj3ZcR4ZEK4MbH3qw2w7FFidna2t6mpiU7M1zLqT8QSu43FMroV/vm/bvd47Dhvm2ge9OQGJL1ZTfc7nc77WVlZOhYhtAX+USLeVlhYaBJnXg0ExN/LyMhgNolT4B9CjeNg9hLiE5YqAAgTsthWEp+ens50Gd0If08b93q9r8KJF0GsR1Z7GPG3WfS8FCCBzgGfz/e6qKgoIZKCWCLXS0dicnKyOjMzk/1Roq+vj+AsfyA7OzthNYUBYYTuF/BALMT/BcDlW3YFubm58Qi5vampqTE5iFIATq/Xy66gv7/fg8eQ3PJ5eXmbdTrduqGhofdut1vOHZwQbFQx6b2GhoZMhN8n+K/h4eHypKSkiMvGxcXRsN9XXV29KSYA9fX1GRD+RbQGeAFxMhIIKr6zs/M0yvjh55gDQPx2ifiQ+QBxKjk5eSXxZwTx1C4xBYB4evL9tsw+6B0ZGVkSwmAwkI6ODip+XpT/MjOAurq6HSucev+OBCAqxBCCeKtEPLUrqgPQxtHzeyIUH7L50dHRs4mJiYt1tLe3W0VhI7arqgMUFxfHSw+LEZpvcHDwZHd39+kw4qnd4NQOnfHxcf/ExMQAdurV3g0MZrP5ufDROdyHZ71WbQCHw+HHjnkRIE9lfrda7qs5p2UxgV0ulxeXo3OAeKJw1TotqyV0enqajsR5hSEMzACoTU1NBXD4oxCNClXJMQUQwolCXMDEfqRAdXrmAAIETyf22NjYQ/Ln5621MwJiCIvFcjEQCAysuREI7dC1tbVVuA/simYEuFiJb2lpuVZaWlqz5iYxvQE2NzcrIZ59CHEYcPT89bKyshql+oMZAGKdtLa23oT4u0r2CRMAk8mkb2truwPxt5SeTpzf71cdIC0tzVhSUpKP1++hARFcu8RzqbSwBzoN1mOCXVFVgGAwSHJycuKMRmM8+fcfSqQg0jQuzN90Qj3O3wIMAN8Np0JgnxtnAAAAAElFTkSuQmCC");
                collapseDrawable = Utils.loadEncodedBitmapDrawable(inlinevideoview.getContext(), "iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAABOpJREFUeNrUmmtIY0cUgCfJ3VBXUXxR0dp2Ya0aBSFi6yOtFPGF1d1WavrAXy1YwVcLLaQpttsH+lcbirYq0a3Ptd0WpKi1P1SMaAitJNptalcQIwV/iI+o2ST39kx6I9cY3STcuSYHhjuTzD33fJk5M+fciWh9fR0tLCwgrhwfH6OcnBwkl8ur9vb2DIODg5aIiAjkq1itViQWi1FYWBgiKYmJiQhptdpzX6SlpSGz2fwRwzDHR0dH83V1dYn+KK6oqLjR19enQISluLgYof7+/jMfZmRkIIvFcoc5K783NTU95YvSsrKyFLvd/s/a2pqRNEBJSclZAJlMhra2tjyNP4Vobm5OukxhaWlpysnJyQPceXl5WS8SicgDDAwMuBrp6enY+M+Zy2UFIJ72pqy8vDwFfOcvd0ebzWYoLCwkD9DR0YFSU1Ox8W2Mb7IKEM+4lWBnHRoaSnM6nX97jhhAkQfQ6/XXNjY27jD+iamhoeFZiqLQyMhIOrQfeuljhCklJg4AD7rFBCA0Tf+h0+luQ9V80UgBAEUaQAzrvB7qk/7eDA6alZeXdx+qKRd0wb++hPRKJIZNaru+vv4NqP/Gs25sPEUcIDw8HHV1de2BY1bzDCFmC1kA91rd2dmJIV6D6nRIjQC3ARD7LMQvPOmWCArAQlhbWlqUPEBIrgQAC2xuh42NjUoI5O5BkwmpEXCLRqM5XFlZ+Qaq9qB2Yq9jL5HgHRaW+bzvoSkNZic+9wA2tnmxpqbmB2jGB7sPUB67KzZeAcb/CM24kHBi9z6Ar8PDwy8plcr7PBgvnBND9uSa82D8y2D8TzwZLxgAhRN4yF+zwfhfeX7gdSjXiANgp11cXDyCjOxr1ick7MojYQ2g2Cu3fvpZcnKyOCEhQcL5xd1XK+QLu8QB2GDuTyjvB6IgKSkJZWZmejouLrTBYLAJvoz6KxaLxVVYcbLljOTm5oqioqLwlHJw+jB4+s7NzQX8bIfDQX6jwdLb2/upTCZ7kzWcZouTHSUnZHd2tv2IvdrZ4vC4uuv09va2eXx8XCMIgNVqxXPsOW/fZWdnB6TTZrNp8egJAgByyKey/f19LeTD7+IFSCwQgINH47+rrKx8Z2lpyRkZGSkYwCM+lBwcHHwLxtfB1ME+hN+ohM4IsMa/B8YzPuUDwQSwu7urAePrZ2dnGd73AdJTCGK1n2traxvBeP8ysmAZAQhHXlCpVK/Ex8dfKUCgaSkO8xMKCgpGJycnb3uDCBUnvi6Xy4cA4lZcXFxIAmAJA4iRqamp12NjY0+TsJDaB0CeAIjB6enpmujo6P8PE0NtJ8Y5CEDcnZiYUOJQngpBACzS/Pz8u1lZWfSVr0I7OzufrK6uqgMZCUjG3qauEgDCgy+qqqq+woftsFGJIGf40g+dD+fn51XnzolJCCQtb3meP21ubn7GPcXE89lkMql9POFab21tTYVMDwkCMDMzo+Q+fXR0VI1DYW/5tdFoVD3G+AdtbW2uY62ioiJhAKqrq1/lGo9PNy8S/P8HgPjwEuNvuvueO6knDTA2NvbxZcY/BmKtvb39JrefC6Cnp4c4AMQyT3Z3d5f6cw9+3aPT6T7AlkNEalKr1Tc8+ygUCiSC7B7BMkYUgKZpnIQjqVTqeo3pYxjtGglY65+H+ib40b949Lj/v4iJiUH/CTAAFI2ZNCJ5irUAAAAASUVORK5CYII=");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InlineVideoView inlinevideoview)
            {
                MMLog.e("InlineVideoView", "Unable to load collaps and expand drawables for media controls overlay", inlinevideoview);
            }
        }
    }

    private static class SeekReportingRunnable
        implements Runnable
    {

        WeakReference inlineVideoViewRef;
        Double lastTimeInSeconds;
        boolean reportingActive;

        public void run()
        {
            Object obj;
            InlineVideoView inlinevideoview;
            if (!reportingActive)
            {
                MMLog.d("InlineVideoView", (new StringBuilder()).append("Reporting disabled, shutting down seek reporting runnable <").append(this).append(">").toString());
                return;
            }
            inlinevideoview = (InlineVideoView)inlineVideoViewRef.get();
            if (inlinevideoview == null)
            {
                MMLog.e("InlineVideoView", (new StringBuilder()).append("Video view instance is null, shutting down seek reporting runnable <").append(this).append(">").toString());
                return;
            }
            obj = null;
            if (!inlinevideoview.isPlaying()) goto _L2; else goto _L1
_L1:
            double d = Math.floor((float)inlinevideoview.getCurrentPosition() / 1000F);
            obj = Double.valueOf(d);
_L4:
            if (obj == null)
            {
                MMLog.d("InlineVideoView", (new StringBuilder()).append("No valid seek time found, shutting down seek reporting runnable <").append(this).append(">").toString());
                return;
            }
            break MISSING_BLOCK_LABEL_208;
_L2:
            if (!inlinevideoview.isCompleted) goto _L4; else goto _L3
_L3:
            d = Math.ceil((float)inlinevideoview.duration / 1000F);
            obj = Double.valueOf(d);
              goto _L4
            obj;
            MMLog.e("InlineVideoView", (new StringBuilder()).append("Illegal exception encountered when trying to get play state, shutting down seek reporting runnable <").append(this).append(">").toString());
            return;
            if (!inlinevideoview.videoVisible)
            {
                if (inlinevideoview.supportsRenderingStartEvent && inlinevideoview.renderingStartEventReceived)
                {
                    inlinevideoview.showVideo();
                } else
                if (!inlinevideoview.supportsRenderingStartEvent)
                {
                    inlinevideoview.showVideo();
                }
            }
            if (lastTimeInSeconds == null || Double.compare(((Double) (obj)).doubleValue(), lastTimeInSeconds.doubleValue()) != 0)
            {
                MMLayout mmlayout = (MMLayout)inlinevideoview.mmLayoutRef.get();
                if (mmlayout == null)
                {
                    MMLog.e("InlineVideoView", (new StringBuilder()).append("Unable to send video seek time, no valid layout.  Shutting down seek reporting runnable <").append(this).append(">").toString());
                    return;
                }
                mmlayout.loadUrl((new StringBuilder()).append("javascript:MMJS.inlineVideo.updateVideoSeekTime(").append(obj).append(");").toString());
                lastTimeInSeconds = ((Double) (obj));
            }
            inlinevideoview.uiHandler.postDelayed(this, 1000L);
            return;
        }

        SeekReportingRunnable(InlineVideoView inlinevideoview)
        {
            lastTimeInSeconds = null;
            reportingActive = true;
            if (inlinevideoview == null)
            {
                MMLog.e("InlineVideoView", "Created seek reporting runnable with a null video view instance");
            }
            inlineVideoViewRef = new WeakReference(inlinevideoview);
        }
    }


    private static final int BACKGROUND_COLOR = 0xff000000;
    private static final int REPORT_SEEK_TIME_DELAY = 1000;
    private static final String TAG = "InlineVideoView";
    private static WeakReference seekReportingRunnableRef = new WeakReference(null);
    boolean activityPaused;
    int duration;
    private InlineParams inlineParams;
    boolean isCompleted;
    boolean isPlayingStreaming;
    ProgressBar loadingSpinner;
    private MediaController mediaController;
    private WeakReference mmLayoutRef;
    private boolean renderingStartEventReceived;
    private boolean supportsRenderingStartEvent;
    private Handler uiHandler;
    RelativeLayout videoContainer;
    boolean videoVisible;

    public InlineVideoView(MMLayout mmlayout, InlineParams inlineparams)
    {
        super(mmlayout.getContext());
        supportsRenderingStartEvent = false;
        renderingStartEventReceived = false;
        videoContainer = null;
        isCompleted = false;
        activityPaused = false;
        videoVisible = false;
        MMAdImplController.destroyOtherInlineVideo(mmlayout.getContext());
        mmLayoutRef = new WeakReference(mmlayout);
        inlineParams = inlineparams;
        uiHandler = new Handler(Looper.getMainLooper());
        setId(0x86c5ad);
        setFocusable(true);
        setClickable(true);
        if (inlineParams.showControls)
        {
            mediaController = new MediaController(this);
            setMediaController(mediaController);
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            supportsRenderingStartEvent = true;
        }
        setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final InlineVideoView this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                if (supportsRenderingStartEvent)
                {
                    mediaplayer.setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() {

                        final _cls1 this$1;

                        public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
                        {
                            if (i == 3)
                            {
                                renderingStartEventReceived = true;
                            }
                            return false;
                        }

            
            {
                this$1 = _cls1.this;
                super();
            }
                    });
                }
                inlineParams.videoState = InlineParams.VideoState.PREPARED;
                if (inlineParams.autoPlay && inlineParams.playerState == InlineParams.PlayerState.DEFAULT)
                {
                    inlineParams.playerState = InlineParams.PlayerState.PLAY;
                }
                loadingSpinner.setVisibility(8);
                duration = getDuration();
                seekTo(inlineParams.currentPosition);
                startInternal();
            }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
        });
        setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final InlineVideoView this$0;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                pause();
                seekTo(0);
                isCompleted = true;
            }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
        });
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final InlineVideoView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1)
                {
                    view = (MMLayout)mmLayoutRef.get();
                    if (view == null)
                    {
                        MMLog.e("InlineVideoView", "Unable to handle touch event, MMLayout weak reference broken");
                        return false;
                    }
                    if (!TextUtils.isEmpty(inlineParams.touchCallBack))
                    {
                        view.loadUrl(String.format((new StringBuilder()).append("javascript:").append(inlineParams.touchCallBack).append("(%f,%f)").toString(), new Object[] {
                            Float.valueOf(motionevent.getX()), Float.valueOf(motionevent.getY())
                        }));
                    }
                    if (mediaController != null && !mediaController.isShowing())
                    {
                        mediaController.show();
                        return true;
                    }
                }
                return true;
            }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
        });
        setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() {

            final InlineVideoView this$0;

            public boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                mediaplayer = (MMLayout)mmLayoutRef.get();
                if (mediaplayer == null)
                {
                    MMLog.e("InlineVideoView", "Unable to handle error, MMLayout weak reference broken");
                    return true;
                } else
                {
                    mediaplayer.loadUrl((new StringBuilder()).append("javascript:MMJS.setError(").append(String.format("Error while playing, %d - %d", new Object[] {
                        Integer.valueOf(i), Integer.valueOf(j)
                    })).append(");").toString());
                    return true;
                }
            }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
        });
        videoContainer = new RelativeLayout(getContext());
        videoContainer.setBackgroundColor(0xff000000);
        videoContainer.setOnTouchListener(new android.view.View.OnTouchListener() {

            final InlineVideoView this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                return true;
            }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
        });
        mmlayout = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        mmlayout.addRule(13, -1);
        videoContainer.addView(this, mmlayout);
        loadingSpinner = new ProgressBar(((MMLayout)mmLayoutRef.get()).getContext());
        loadingSpinner.setIndeterminate(true);
        loadingSpinner.setVisibility(8);
        mmlayout = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        mmlayout.addRule(13, -1);
        videoContainer.addView(loadingSpinner, mmlayout);
        setVideoSource();
    }

    private void hideVideo()
    {
        setBackgroundColor(0xff000000);
        videoVisible = false;
    }

    private void pauseInternal()
    {
        if (!isPlaying())
        {
            MMLog.w("InlineVideoView", "Unable to pause, video is not playing");
            return;
        } else
        {
            super.pause();
            return;
        }
    }

    private void resizeVideo()
    {
        pauseInternal();
        videoContainer.setLayoutParams(getCustomLayoutParams());
        startInternal();
    }

    private void setVideoSource()
    {
        if (!TextUtils.isEmpty(inlineParams.cachedVideoURI))
        {
            Utils.ThreadUtils.execute(new Runnable() {

                final InlineVideoView this$0;

                public void run()
                {
                    VideoAd.downloadVideoFile(getContext(), inlineParams.cachedVideoURI, inlineParams.cachedVideoID);
                }

            
            {
                this$0 = InlineVideoView.this;
                super();
            }
            });
        }
        Uri uri;
        boolean flag;
        if (!TextUtils.isEmpty(inlineParams.cachedVideoID) && VideoAd.hasVideoFile(getContext(), inlineParams.cachedVideoID))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            isPlayingStreaming = false;
            uri = VideoAd.getVideoUri(getContext(), inlineParams.cachedVideoID);
        } else
        if (!TextUtils.isEmpty(inlineParams.streamVideoURI))
        {
            isPlayingStreaming = true;
            uri = Uri.parse(inlineParams.streamVideoURI);
        } else
        {
            MMLog.e("InlineVideoView", "Unable to set video source, no valid video source found");
            return;
        }
        hideVideo();
        loadingSpinner.setVisibility(0);
        inlineParams.videoState = InlineParams.VideoState.PREPARING;
        setVideoURI(uri);
    }

    private void showVideo()
    {
        setBackgroundColor(0);
        videoVisible = true;
    }

    private void startInternal()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isPlaying()) goto _L2; else goto _L1
_L1:
        MMLog.w("InlineVideoView", "Unable to start, already playing");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!activityPaused)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        MMLog.w("InlineVideoView", "Unable to start, activity is not in a resumed state");
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (inlineParams.videoState != InlineParams.VideoState.PREPARED) goto _L5; else goto _L4
_L4:
        if (inlineParams.playerState == InlineParams.PlayerState.PLAY)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        MMLog.w("InlineVideoView", "Unable to start, player not in a play state");
          goto _L3
        isCompleted = false;
        startReportingSeekTime();
        super.start();
          goto _L3
_L5:
        if (inlineParams.videoState != InlineParams.VideoState.DEFAULT) goto _L3; else goto _L6
_L6:
        setVideoSource();
          goto _L3
    }

    private void startReportingSeekTime()
    {
        stopReportingSeekTime();
        SeekReportingRunnable seekreportingrunnable = new SeekReportingRunnable(this);
        seekReportingRunnableRef = new WeakReference(seekreportingrunnable);
        uiHandler.postDelayed(seekreportingrunnable, 1000L);
    }

    private void stopInternal()
    {
        super.stopPlayback();
        hideVideo();
        inlineParams.videoState = InlineParams.VideoState.DEFAULT;
        stopReportingSeekTime();
        if (supportsRenderingStartEvent)
        {
            renderingStartEventReceived = false;
        }
    }

    private void stopReportingSeekTime()
    {
        SeekReportingRunnable seekreportingrunnable = (SeekReportingRunnable)seekReportingRunnableRef.get();
        if (seekreportingrunnable != null)
        {
            seekreportingrunnable.reportingActive = false;
        }
    }

    void attachVideo(ViewGroup viewgroup)
    {
        viewgroup.addView(videoContainer, getCustomLayoutParams());
        viewgroup = (MMLayout)mmLayoutRef.get();
        if (!(viewgroup instanceof AdViewOverlayView))
        {
            MMLog.w("InlineVideoView", "Unable to bring close button to front as associated layout is not an overlay view");
            return;
        } else
        {
            ((AdViewOverlayView)viewgroup).bringMraidCloseToFront();
            return;
        }
    }

    android.widget.RelativeLayout.LayoutParams getCustomLayoutParams()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (inlineParams.expanded)
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        } else
        {
            layoutparams = new android.widget.RelativeLayout.LayoutParams((int)(inlineParams.scaleFactor * (float)inlineParams.width), (int)(inlineParams.scaleFactor * (float)inlineParams.height));
            layoutparams.topMargin = (int)(inlineParams.scaleFactor * (float)inlineParams.y);
            layoutparams.leftMargin = (int)(inlineParams.scaleFactor * (float)inlineParams.x);
        }
        MMLog.d("InlineVideoView", (new StringBuilder()).append("Layout params for video view: ").append(layoutparams.toString()).toString());
        return layoutparams;
    }

    String getJsonState()
    {
        return inlineParams.toJsonString();
    }

    boolean isPlayingStreaming()
    {
        return inlineParams != null && isPlayingStreaming;
    }

    void onPause()
    {
        inlineParams.currentPosition = getCurrentPosition();
        stopInternal();
    }

    void onResume()
    {
        startInternal();
    }

    public void pause()
    {
        inlineParams.playerState = InlineParams.PlayerState.PAUSE;
        pauseInternal();
    }

    void removeVideo()
    {
        if (videoContainer == null)
        {
            MMLog.w("InlineVideoView", "Unable to remove, video container is null");
            return;
        }
        android.view.ViewParent viewparent = videoContainer.getParent();
        if (viewparent == null || !(viewparent instanceof ViewGroup))
        {
            MMLog.w("InlineVideoView", "Unable to remove, no valid parent view found");
            return;
        } else
        {
            stopPlayback();
            ((ViewGroup)viewparent).removeView(videoContainer);
            return;
        }
    }

    void resumeVideo()
    {
        if (inlineParams.playerState != InlineParams.PlayerState.PAUSE)
        {
            MMLog.w("InlineVideoView", "Unable to resume the video, not in a pause state");
            return;
        } else
        {
            start();
            return;
        }
    }

    void setStreamingVideoSource(String s)
    {
        if (isPlaying())
        {
            stopInternal();
        }
        inlineParams.cachedVideoID = "";
        inlineParams.cachedVideoURI = "";
        inlineParams.streamVideoURI = s;
        inlineParams.currentPosition = 0;
        setVideoSource();
    }

    void setVideoDimensions(InlineParams inlineparams)
    {
        this;
        JVM INSTR monitorenter ;
        inlineParams.x = inlineparams.x;
        inlineParams.y = inlineparams.y;
        inlineParams.width = inlineparams.width;
        inlineParams.height = inlineparams.height;
        if (videoContainer != null) goto _L2; else goto _L1
_L1:
        MMLog.w("InlineVideoView", "Not setting video dimensions, video container is null");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        resizeVideo();
        if (true) goto _L4; else goto _L3
_L3:
        inlineparams;
        throw inlineparams;
    }

    public void start()
    {
        inlineParams.playerState = InlineParams.PlayerState.PLAY;
        startInternal();
    }

    public void stopPlayback()
    {
        inlineParams.playerState = InlineParams.PlayerState.STOP;
        inlineParams.currentPosition = 0;
        stopInternal();
    }







/*
    static boolean access$402(InlineVideoView inlinevideoview, boolean flag)
    {
        inlinevideoview.renderingStartEventReceived = flag;
        return flag;
    }

*/





}
