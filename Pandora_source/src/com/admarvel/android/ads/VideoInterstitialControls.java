// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.admarvel.android.util.Logging;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.jar.JarFile;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelXMLReader, AdMarvelXMLElement, AdMarvelInternalWebView, AdMarvelVideoActivity, 
//            Utils, Version, AdMarvelInterstitialAds, AdMarvelActivity, 
//            AdMarvelInterstitialAdListenerImpl, AdMarvelVideoView

class VideoInterstitialControls extends LinearLayout
{
    public static final class ButtonType extends Enum
    {

        private static final ButtonType ENUM$VALUES[];
        public static final ButtonType Image;
        public static final ButtonType SystemItem;
        public static final ButtonType Title;

        public static ButtonType valueOf(String s)
        {
            return (ButtonType)Enum.valueOf(com/admarvel/android/ads/VideoInterstitialControls$ButtonType, s);
        }

        public static ButtonType[] values()
        {
            ButtonType abuttontype[] = ENUM$VALUES;
            int i = abuttontype.length;
            ButtonType abuttontype1[] = new ButtonType[i];
            System.arraycopy(abuttontype, 0, abuttontype1, 0, i);
            return abuttontype1;
        }

        static 
        {
            SystemItem = new ButtonType("SystemItem", 0);
            Title = new ButtonType("Title", 1);
            Image = new ButtonType("Image", 2);
            ENUM$VALUES = (new ButtonType[] {
                SystemItem, Title, Image
            });
        }

        private ButtonType(String s, int i)
        {
            super(s, i);
        }
    }

    private class DownloadImageTask extends AsyncTask
    {

        ImageView imageView;
        final VideoInterstitialControls this$0;

        protected transient Bitmap doInBackground(String as[])
        {
            as = as[0];
            try
            {
                as = BitmapFactory.decodeStream((new URL(as)).openStream());
            }
            // Misplaced declaration of an exception variable
            catch (String as[])
            {
                Logging.log(Log.getStackTraceString(as));
                return null;
            }
            return as;
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Bitmap bitmap)
        {
            imageView.setImageBitmap(bitmap);
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        public DownloadImageTask(ImageView imageview)
        {
            this$0 = VideoInterstitialControls.this;
            super();
            imageView = imageview;
        }
    }

    private class DownloadImageTaskPostAPI11
        implements Runnable
    {

        private String imageUrl;
        private final WeakReference imageViewReference;
        final VideoInterstitialControls this$0;

        public void run()
        {
            if (imageViewReference.get() != null)
            {
                (new DownloadImageTask((ImageView)imageViewReference.get())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                    imageUrl
                });
            }
        }

        public DownloadImageTaskPostAPI11(ImageView imageview, String s)
        {
            this$0 = VideoInterstitialControls.this;
            super();
            imageViewReference = new WeakReference(imageview);
            imageUrl = s;
        }
    }

    public static final class ExitVideoScreenBehavior extends Enum
    {

        public static final ExitVideoScreenBehavior CloseVideo;
        private static final ExitVideoScreenBehavior ENUM$VALUES[];
        public static final ExitVideoScreenBehavior PauseVideo;
        public static final ExitVideoScreenBehavior StopVideo;

        public static ExitVideoScreenBehavior valueOf(String s)
        {
            return (ExitVideoScreenBehavior)Enum.valueOf(com/admarvel/android/ads/VideoInterstitialControls$ExitVideoScreenBehavior, s);
        }

        public static ExitVideoScreenBehavior[] values()
        {
            ExitVideoScreenBehavior aexitvideoscreenbehavior[] = ENUM$VALUES;
            int i = aexitvideoscreenbehavior.length;
            ExitVideoScreenBehavior aexitvideoscreenbehavior1[] = new ExitVideoScreenBehavior[i];
            System.arraycopy(aexitvideoscreenbehavior, 0, aexitvideoscreenbehavior1, 0, i);
            return aexitvideoscreenbehavior1;
        }

        static 
        {
            PauseVideo = new ExitVideoScreenBehavior("PauseVideo", 0);
            StopVideo = new ExitVideoScreenBehavior("StopVideo", 1);
            CloseVideo = new ExitVideoScreenBehavior("CloseVideo", 2);
            ENUM$VALUES = (new ExitVideoScreenBehavior[] {
                PauseVideo, StopVideo, CloseVideo
            });
        }

        private ExitVideoScreenBehavior(String s, int i)
        {
            super(s, i);
        }
    }

    class ToolbarButtonLayout extends RelativeLayout
    {

        public List eventTrackers;
        public String eventType;
        public ExitVideoScreenBehavior openUrlBehavior;
        public String redirectUrl;
        final VideoInterstitialControls this$0;
        public String videoUrl;


        public ToolbarButtonLayout(Context context, AdMarvelXMLElement admarvelxmlelement, android.widget.LinearLayout.LayoutParams layoutparams)
        {
            int i;
            this$0 = VideoInterstitialControls.this;
            super(context);
            redirectUrl = null;
            videoUrl = null;
            eventType = null;
            openUrlBehavior = ExitVideoScreenBehavior.PauseVideo;
            if (admarvelxmlelement.getChildren().get("action") != null)
            {
                context = (AdMarvelXMLElement)((ArrayList)admarvelxmlelement.getChildren().get("action")).get(0);
            } else
            {
                context = null;
            }
            if (context != null)
            {
                String s = (String)context.getAttributes().get("type");
                eventType = s;
                if ("open_url".equalsIgnoreCase(s))
                {
                    redirectUrl = context.getData();
                    videointerstitialcontrols = (String)context.getAttributes().get("videoOpenUrlBehavior");
                    if (VideoInterstitialControls.this != null)
                    {
                        if (equalsIgnoreCase("pauseVideo"))
                        {
                            openUrlBehavior = ExitVideoScreenBehavior.PauseVideo;
                        } else
                        if (equalsIgnoreCase("stopVideo"))
                        {
                            openUrlBehavior = ExitVideoScreenBehavior.StopVideo;
                        } else
                        if (equalsIgnoreCase("closeVideo"))
                        {
                            openUrlBehavior = ExitVideoScreenBehavior.CloseVideo;
                        }
                    }
                } else
                if ("done".equalsIgnoreCase(s))
                {
                    isCloseEnabled = true;
                } else
                if ("play_movie".equalsIgnoreCase(s))
                {
                    videoUrl = context.getData();
                }
            }
            if (admarvelxmlelement.getChildren().get("clickTracking") != null)
            {
                videointerstitialcontrols = (AdMarvelXMLElement)((ArrayList)admarvelxmlelement.getChildren().get("clickTracking")).get(0);
            } else
            {
                videointerstitialcontrols = null;
            }
            if (VideoInterstitialControls.this == null) goto _L2; else goto _L1
_L1:
            videointerstitialcontrols = (AdMarvelXMLElement)((ArrayList)getChildren().get("pixels")).get(0);
            if (VideoInterstitialControls.this == null || !getChildren().containsKey("pixel")) goto _L2; else goto _L3
_L3:
            videointerstitialcontrols = (ArrayList)getChildren().get("pixel");
            eventTrackers = new ArrayList();
            eventTrackers.clear();
            i = 0;
_L6:
            if (i < size()) goto _L4; else goto _L2
_L2:
            setLayoutParams(layoutparams);
            setClickable(true);
            addStatesFromChildren();
            setGravity(17);
            setOnClickListener(new _cls1());
            return;
_L4:
            context = (AdMarvelXMLElement)get(i);
            eventTrackers.add(context.getData());
            i++;
            if (true) goto _L6; else goto _L5
_L5:
        }
    }


    static int VIEW_ID = 0x186a1;
    final String GUID;
    private final WeakReference activityReference;
    AdMarvelXMLElement adXMLElement;
    public boolean enableItemAutoToggle;
    private boolean isCloseEnabled;
    private final WeakReference videoviewReference;
    AdMarvelXMLReader xmlReader;

    VideoInterstitialControls(AdMarvelVideoView admarvelvideoview, AdMarvelVideoActivity admarvelvideoactivity, Context context, String s, String s1)
        throws ParserConfigurationException, SAXException, IOException
    {
        float f2;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        android.widget.RelativeLayout.LayoutParams layoutparams1;
        Object obj;
        super(context);
        enableItemAutoToggle = false;
        activityReference = new WeakReference(admarvelvideoactivity);
        videoviewReference = new WeakReference(admarvelvideoview);
        isCloseEnabled = false;
        GUID = s1;
        setId(VIEW_ID);
        admarvelvideoview = new android.widget.LinearLayout.LayoutParams(-1, -1);
        admarvelvideoview.gravity = 17;
        setLayoutParams(admarvelvideoview);
        setGravity(17);
        f2 = TypedValue.applyDimension(1, 40F, getResources().getDisplayMetrics());
        obj = new ShapeDrawable(new RectShape());
        s1 = new android.widget.LinearLayout.LayoutParams(-2, -1);
        s1.weight = 1.0F;
        s1.gravity = 17;
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 32F, getResources().getDisplayMetrics()));
        layoutparams.addRule(13);
        layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 36F, getResources().getDisplayMetrics()));
        int i = (int)TypedValue.applyDimension(1, -3F, getResources().getDisplayMetrics());
        layoutparams1.addRule(13);
        layoutparams1.setMargins(0, 0, 0, i);
        xmlReader = new AdMarvelXMLReader();
        xmlReader.parseXMLString(s);
        adXMLElement = xmlReader.getParsedXMLData();
        if (adXMLElement == null || !adXMLElement.getChildren().containsKey("toolbar")) goto _L2; else goto _L1
_L1:
        int j;
        s = (AdMarvelXMLElement)((ArrayList)adXMLElement.getChildren().get("toolbar")).get(0);
        if (s == null)
        {
            admarvelvideoview = null;
        } else
        {
            admarvelvideoview = (String)s.getAttributes().get("background");
        }
        if (admarvelvideoview != null)
        {
            ((ShapeDrawable) (obj)).getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f2, Color.parseColor(admarvelvideoview), Color.parseColor(admarvelvideoview), android.graphics.Shader.TileMode.REPEAT));
        } else
        {
            ((ShapeDrawable) (obj)).getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f2, Color.parseColor("#3E3E3E"), Color.parseColor("#000000"), android.graphics.Shader.TileMode.REPEAT));
        }
        if (s == null)
        {
            admarvelvideoview = null;
        } else
        {
            admarvelvideoview = (String)s.getAttributes().get("alpha");
        }
        if (admarvelvideoview != null)
        {
            j = Integer.parseInt(admarvelvideoview);
        } else
        {
            j = 175;
        }
        ((ShapeDrawable) (obj)).setAlpha(j);
        setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        if (s == null || !s.getChildren().containsKey("item")) goto _L2; else goto _L3
_L3:
        admarvelvideoview = (ArrayList)s.getChildren().get("item");
        j = 0;
_L6:
        if (j < admarvelvideoview.size()) goto _L4; else goto _L2
_L2:
        admarvelvideoview = new android.widget.RelativeLayout.LayoutParams(-1, (int)f2);
        admarvelvideoview.addRule(12);
        admarvelvideoview.addRule(3, AdMarvelInternalWebView.VIEW_ID);
        setLayoutParams(admarvelvideoview);
        return;
_L4:
        s = (AdMarvelXMLElement)admarvelvideoview.get(j);
        obj = (String)s.getAttributes().get("type");
        String s2 = (String)s.getAttributes().get("subtype");
        if (!"SystemItem".equalsIgnoreCase(((String) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        if ("UIBarButtonSystemItemFlexibleSpace".equalsIgnoreCase(s2))
        {
            float f = TypedValue.applyDimension(1, 32F, getResources().getDisplayMetrics());
            s = new android.widget.LinearLayout.LayoutParams((int)f, (int)f);
            s1.weight = 1.0F;
            s1.gravity = 17;
            addEmptyButton(context, s);
        } else
        if ("UIBarButtonSystemItemFixedSpace".equalsIgnoreCase(s2))
        {
            s = (String)s.getAttributes().get("width");
            float f3 = TypedValue.applyDimension(1, 32F, getResources().getDisplayMetrics());
            float f1 = TypedValue.applyDimension(1, 32F, getResources().getDisplayMetrics());
            if (s != null)
            {
                f1 = TypedValue.applyDimension(1, Integer.parseInt(s), getResources().getDisplayMetrics());
            }
            s = new android.widget.LinearLayout.LayoutParams((int)f1, (int)f3);
            s1.weight = 1.0F;
            s1.gravity = 17;
            addEmptyButton(context, s);
        } else
        {
            addSystemIcon(context, layoutparams, s1, s, this);
        }
_L7:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        if ("Title".equalsIgnoreCase(((String) (obj))))
        {
            addCustomTextButton(context, layoutparams1, s1, s, this);
        } else
        if ("Image".equalsIgnoreCase(((String) (obj))))
        {
            addImageIcon(context, layoutparams, s1, s, this);
        } else
        if ("Timer".equalsIgnoreCase(((String) (obj))) && admarvelvideoactivity.videoDuration > 0)
        {
            addTimerButton(context, layoutparams1, s1);
        } else
        if ("Toggle".equalsIgnoreCase(((String) (obj))))
        {
            addToggleButton(context, layoutparams1, layoutparams, s1, s, this);
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    private void addCustomTextButton(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1, AdMarvelXMLElement admarvelxmlelement, ViewGroup viewgroup)
    {
        Object obj = new ShapeDrawable(new RectShape());
        ((ShapeDrawable) (obj)).getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, dipValue(40F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), android.graphics.Shader.TileMode.REPEAT));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, ((android.graphics.drawable.Drawable) (obj)));
        layoutparams1 = new ToolbarButtonLayout(context, admarvelxmlelement, layoutparams1);
        if (((ToolbarButtonLayout) (layoutparams1)).eventType == null)
        {
            return;
        }
        admarvelxmlelement = (String)admarvelxmlelement.getAttributes().get("title");
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, 36F, Color.parseColor("#ffffbb33"), Color.parseColor("#ffffbb33"), android.graphics.Shader.TileMode.REPEAT));
        ShapeDrawable shapedrawable1 = new ShapeDrawable(new RectShape());
        shapedrawable1.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, 36F, Color.parseColor("#55dcdcdc"), Color.parseColor("#55dcdcdc"), android.graphics.Shader.TileMode.REPEAT));
        ShapeDrawable shapedrawable2 = new ShapeDrawable(new RectShape());
        shapedrawable2.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, 36F, Color.parseColor("#ffc8c8c8"), Color.parseColor("#ffc8c8c8"), android.graphics.Shader.TileMode.REPEAT));
        obj = new StateListDrawable();
        ((StateListDrawable) (obj)).addState(new int[] {
            0x10100a7
        }, shapedrawable);
        ((StateListDrawable) (obj)).addState(new int[] {
            0xfefeff62
        }, shapedrawable1);
        ((StateListDrawable) (obj)).addState(new int[] {
            0x101009e
        }, shapedrawable2);
        context = new Button(context);
        context.setLayoutParams(layoutparams);
        context.setDuplicateParentStateEnabled(true);
        context.setClickable(false);
        if (admarvelxmlelement != null && admarvelxmlelement.length() > 0)
        {
            context.setText(admarvelxmlelement);
        }
        context.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        layoutparams1.setBackgroundDrawable(statelistdrawable);
        layoutparams1.addView(context);
        viewgroup.addView(layoutparams1);
    }

    private void addEmptyButton(Context context, android.widget.LinearLayout.LayoutParams layoutparams)
    {
        context = new View(context);
        context.setTag((new StringBuilder(String.valueOf(GUID))).append("EMPTY_BUTTON_LAYOUT").toString());
        context.setLayoutParams(layoutparams);
        addView(context);
    }

    private void addImageIcon(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1, AdMarvelXMLElement admarvelxmlelement, ViewGroup viewgroup)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, dipValue(40F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), android.graphics.Shader.TileMode.REPEAT));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, shapedrawable);
        ToolbarButtonLayout toolbarbuttonlayout = new ToolbarButtonLayout(context, admarvelxmlelement, layoutparams1);
        if (toolbarbuttonlayout.eventType != null)
        {
            String s = (String)admarvelxmlelement.getAttributes().get("image");
            String s1 = (String)admarvelxmlelement.getAttributes().get("image_high");
            admarvelxmlelement = (String)admarvelxmlelement.getAttributes().get("image_retina");
            AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
            if (admarvelvideoactivity != null)
            {
                float f = Utils.getDeviceDensity(admarvelvideoactivity);
                if (f <= 1.0F)
                {
                    layoutparams1 = s;
                } else
                if (f > 1.0F && f < 2.0F)
                {
                    layoutparams1 = s;
                    if (s1 != null)
                    {
                        layoutparams1 = s;
                        if (s1.length() > 0)
                        {
                            layoutparams1 = s1;
                        }
                    }
                } else
                {
                    layoutparams1 = s;
                    if (admarvelxmlelement != null)
                    {
                        layoutparams1 = s;
                        if (admarvelxmlelement.length() > 0)
                        {
                            layoutparams1 = admarvelxmlelement;
                        }
                    }
                }
                context = new ImageView(context);
                context.setLayoutParams(layoutparams);
                if (Version.getAndroidSDKVersion() >= 11)
                {
                    admarvelvideoactivity.getHandler().post(new DownloadImageTaskPostAPI11(context, layoutparams1));
                } else
                {
                    (new DownloadImageTask(context)).execute(new String[] {
                        layoutparams1
                    });
                }
                toolbarbuttonlayout.setBackgroundDrawable(statelistdrawable);
                toolbarbuttonlayout.addView(context);
                viewgroup.addView(toolbarbuttonlayout);
                return;
            }
        }
    }

    private void addSystemIcon(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1, AdMarvelXMLElement admarvelxmlelement, ViewGroup viewgroup)
    {
        ShapeDrawable shapedrawable = new ShapeDrawable(new RectShape());
        shapedrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, dipValue(40F), Color.parseColor("#AAFFFFFF"), Color.parseColor("#AA3E3E3E"), android.graphics.Shader.TileMode.REPEAT));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, shapedrawable);
        layoutparams1 = new ToolbarButtonLayout(context, admarvelxmlelement, layoutparams1);
        if (((ToolbarButtonLayout) (layoutparams1)).eventType == null)
        {
            return;
        } else
        {
            admarvelxmlelement = new BitmapDrawable(bitmapFromJar((new StringBuilder(String.valueOf(((ToolbarButtonLayout) (layoutparams1)).eventType))).append(".png").toString()));
            context = new ImageView(context);
            context.setLayoutParams(layoutparams);
            context.setImageDrawable(admarvelxmlelement);
            layoutparams1.setBackgroundDrawable(statelistdrawable);
            layoutparams1.addView(context);
            viewgroup.addView(layoutparams1);
            return;
        }
    }

    private void addTimerButton(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.LinearLayout.LayoutParams layoutparams1)
    {
        RelativeLayout relativelayout = new RelativeLayout(context);
        relativelayout.setLayoutParams(layoutparams1);
        relativelayout.setTag((new StringBuilder(String.valueOf(GUID))).append("TIMER_BUTTON_LAYOUT").toString());
        relativelayout.setClickable(false);
        relativelayout.addStatesFromChildren();
        relativelayout.setGravity(17);
        context = new TextView(context);
        context.setLayoutParams(layoutparams);
        context.setGravity(17);
        context.setTypeface(Typeface.DEFAULT_BOLD);
        context.setSingleLine(true);
        relativelayout.addView(context);
        addView(relativelayout);
    }

    private void addToggleButton(Context context, android.widget.RelativeLayout.LayoutParams layoutparams, android.widget.RelativeLayout.LayoutParams layoutparams1, android.widget.LinearLayout.LayoutParams layoutparams2, AdMarvelXMLElement admarvelxmlelement, ViewGroup viewgroup)
    {
        ViewSwitcher viewswitcher;
        viewswitcher = new ViewSwitcher(context);
        viewswitcher.setLayoutParams(layoutparams2);
        viewswitcher.addStatesFromChildren();
        if (admarvelxmlelement == null || !admarvelxmlelement.getChildren().containsKey("subitem")) goto _L2; else goto _L1
_L1:
        int i;
        enableItemAutoToggle = true;
        admarvelxmlelement = (ArrayList)admarvelxmlelement.getChildren().get("subitem");
        i = 0;
_L5:
        if (i < admarvelxmlelement.size()) goto _L3; else goto _L2
_L2:
        if (viewswitcher.getChildCount() == 2)
        {
            viewgroup.addView(viewswitcher);
        }
        return;
_L3:
        AdMarvelXMLElement admarvelxmlelement1;
        String s;
        admarvelxmlelement1 = (AdMarvelXMLElement)admarvelxmlelement.get(i);
        s = (String)admarvelxmlelement1.getAttributes().get("type");
        if (!"SystemItem".equalsIgnoreCase(s))
        {
            break; /* Loop/switch isn't completed */
        }
        addSystemIcon(context, layoutparams1, layoutparams2, admarvelxmlelement1, viewswitcher);
_L6:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if ("Title".equalsIgnoreCase(s))
        {
            addCustomTextButton(context, layoutparams, layoutparams2, admarvelxmlelement1, viewswitcher);
        } else
        if ("Image".equalsIgnoreCase(s))
        {
            addImageIcon(context, layoutparams1, layoutparams2, admarvelxmlelement1, viewswitcher);
        }
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    private float dipValue(float f)
    {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    private void launchInBrowser(ToolbarButtonLayout toolbarbuttonlayout)
    {
        if (toolbarbuttonlayout != null) goto _L2; else goto _L1
_L1:
        AdMarvelVideoActivity admarvelvideoactivity;
        return;
_L2:
        if ((admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (toolbarbuttonlayout.openUrlBehavior != ExitVideoScreenBehavior.PauseVideo)
        {
            break; /* Loop/switch isn't completed */
        }
        pauseVideo(false);
_L4:
        if (toolbarbuttonlayout.redirectUrl != null && toolbarbuttonlayout.redirectUrl.length() > 0)
        {
            if (AdMarvelInterstitialAds.getEnableClickRedirect())
            {
                admarvelvideoactivity.launchingInAppBrowser = true;
                Intent intent = new Intent(admarvelvideoactivity, com/admarvel/android/ads/AdMarvelActivity);
                intent.addFlags(0x10000000);
                intent.putExtra("url", toolbarbuttonlayout.redirectUrl);
                intent.putExtra("isInterstitial", false);
                intent.putExtra("isInterstitialClick", false);
                intent.putExtra("GUID", GUID);
                admarvelvideoactivity.startActivity(intent);
            }
            AdMarvelInterstitialAds.getListener().onClickInterstitialAd(admarvelvideoactivity, toolbarbuttonlayout.redirectUrl, "", 0, null, "");
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (toolbarbuttonlayout.openUrlBehavior == ExitVideoScreenBehavior.StopVideo)
        {
            stopPlay();
        } else
        if (toolbarbuttonlayout.openUrlBehavior == ExitVideoScreenBehavior.CloseVideo)
        {
            admarvelvideoactivity.closeVideoInterstitial();
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void muteVideo()
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)videoviewReference.get();
        if (admarvelvideoview != null)
        {
            admarvelvideoview.mute();
        }
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.videoVolumeState = AdMarvelVideoActivity.VideoVolumeState.Mute;
        }
    }

    private void onToolbarItemClick(View view)
    {
_L2:
        return;
        if (view == null || !(view instanceof ToolbarButtonLayout)) goto _L2; else goto _L1
_L1:
        ToolbarButtonLayout toolbarbuttonlayout;
        AdMarvelVideoActivity admarvelvideoactivity;
        toolbarbuttonlayout = (ToolbarButtonLayout)view;
        admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.onUserInteraction();
            if (toolbarbuttonlayout.eventTrackers != null)
            {
                admarvelvideoactivity.manageTrackingUrl(toolbarbuttonlayout.eventTrackers);
            }
        }
        if (view.getParent() instanceof ViewSwitcher)
        {
            view = (ViewSwitcher)view.getParent();
            if (view != null)
            {
                if (view.getDisplayedChild() == 0)
                {
                    view.showNext();
                } else
                {
                    view.showPrevious();
                }
            }
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("open_url"))
        {
            launchInBrowser(toolbarbuttonlayout);
            return;
        }
        if (toolbarbuttonlayout.eventType == null || !toolbarbuttonlayout.eventType.equalsIgnoreCase("play_movie"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (toolbarbuttonlayout.videoUrl != null)
        {
            playNext(toolbarbuttonlayout.videoUrl);
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
        if (toolbarbuttonlayout.eventType == null || !toolbarbuttonlayout.eventType.equalsIgnoreCase("done"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.closeVideoInterstitial();
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("stop"))
        {
            stopPlay();
            return;
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("replay"))
        {
            replay();
            return;
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("pause"))
        {
            pauseVideo(true);
            return;
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("resume"))
        {
            resumeVideo();
            return;
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("mute"))
        {
            muteVideo();
            return;
        }
        if (toolbarbuttonlayout.eventType != null && toolbarbuttonlayout.eventType.equalsIgnoreCase("unmute"))
        {
            unmuteVideo();
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void pauseVideo(boolean flag)
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.pauseVideo(flag);
        }
    }

    private void playNext(String s)
    {
        AdMarvelVideoActivity admarvelvideoactivity;
        if (s != null)
        {
            if ((admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get()) != null)
            {
                admarvelvideoactivity.playNextVideo(s);
                return;
            }
        }
    }

    private void replay()
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.replayVideo();
        }
    }

    private void resumeVideo()
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.resumeVideo();
        }
    }

    private void stopPlay()
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.stopVideo();
        }
    }

    private void unmuteVideo()
    {
        AdMarvelVideoActivity admarvelvideoactivity = (AdMarvelVideoActivity)activityReference.get();
        AdMarvelVideoView admarvelvideoview = (AdMarvelVideoView)videoviewReference.get();
        if (admarvelvideoview != null)
        {
            admarvelvideoview.unmute();
        }
        if (admarvelvideoactivity != null)
        {
            admarvelvideoactivity.videoVolumeState = AdMarvelVideoActivity.VideoVolumeState.UnMute;
        }
    }

    public Bitmap bitmapFromJar(String s)
    {
        Object obj2 = null;
        Object obj = (AdMarvelVideoActivity)activityReference.get();
        Exception exception1;
label0:
        {
            {
                if (obj != null)
                {
                    break label0;
                }
                float f;
                Object obj1;
                int i;
                if (false)
                {
                    try
                    {
                        throw new NullPointerException();
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s) { }
                }
                obj1 = null;
            }
            return ((Bitmap) (obj1));
        }
        f = Utils.getDeviceDensity(((Context) (obj)));
        if (f > 1.0F) goto _L2; else goto _L1
_L1:
        s = (new StringBuilder(String.valueOf("admarvel_bitmaps/mdpi/"))).append(s).toString();
_L3:
        obj1 = ((AdMarvelVideoActivity) (obj)).getClassLoader().getResource(s).getFile();
        obj = obj1;
        if (((String) (obj1)).startsWith("file:"))
        {
            obj = ((String) (obj1)).substring(5);
        }
        i = ((String) (obj)).indexOf("!");
        obj1 = obj;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj1 = ((String) (obj)).substring(0, i);
        obj = new JarFile(((String) (obj1)));
        s = ((JarFile) (obj)).getInputStream(((JarFile) (obj)).getJarEntry(s));
        obj = s;
        obj1 = BitmapFactory.decodeStream(s);
        obj = obj1;
        obj1 = obj;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((Bitmap) (obj));
            }
            return ((Bitmap) (obj));
        }
        break MISSING_BLOCK_LABEL_33;
_L2:
        if (f <= 1.0F || f >= 2.0F)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        s = (new StringBuilder(String.valueOf("admarvel_bitmaps/hdpi/"))).append(s).toString();
          goto _L3
        s = (new StringBuilder(String.valueOf("admarvel_bitmaps/xhdpi/"))).append(s).toString();
          goto _L3
        exception1;
        s = null;
_L7:
        obj = s;
        exception1.printStackTrace();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        obj = obj2;
_L5:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (Exception exception) { }
        }
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        exception1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isCloseEnabled()
    {
        return isCloseEnabled;
    }




    // Unreferenced inner class com/admarvel/android/ads/VideoInterstitialControls$ToolbarButtonLayout$1

/* anonymous class */
    class ToolbarButtonLayout._cls1
        implements android.view.View.OnClickListener
    {

        final ToolbarButtonLayout this$1;

        public void onClick(View view)
        {
            onToolbarItemClick(view);
        }

            
            {
                this$1 = ToolbarButtonLayout.this;
                super();
            }
    }

}
