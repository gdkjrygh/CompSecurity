// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import com.brightcove.player.mediacontroller.buttons.CaptionsButtonController;
import com.brightcove.player.mediacontroller.buttons.FullScreenButtonController;
import com.brightcove.player.mediacontroller.buttons.LiveButtonController;
import com.brightcove.player.mediacontroller.buttons.PlayButtonController;
import com.brightcove.player.mediacontroller.buttons.RewindButtonController;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            ShowHideController, BrightcoveMediaControlRegistryImpl, BrightcoveControlBar, d, 
//            BrightcoveMediaControlRegistry, BrightcoveShowHideController, BrightcoveSeekBar, BrightcoveSeekBarController, 
//            h, g, e, f, 
//            b, c, i

public class BrightcoveMediaController extends AbstractComponent
    implements ShowHideController
{

    public static final String CONTROL_BAR_CREATED = "controlBarCreated";
    public static final int DEFAULT_TIMEOUT = 3000;
    public static final String DURATION = "duration";
    public static final String MARKER_LIST = "markerList";
    public static final String PROGRESS = "progress";
    public static final String SEEK_BAR_MAX = "seekBarMax";
    public static final String SEEK_BAR_PROGRESS = "seekBarProgress";
    public static final String SET_MARKERS = "setMarkers";
    private static final String a = com/brightcove/player/mediacontroller/BrightcoveMediaController.getSimpleName();
    private BrightcoveMediaControlRegistry b;
    private BrightcoveControlBar c;
    private TextView d;
    private TextView e;
    private int f;
    private BaseVideoView g;
    private BrightcoveSeekBar h;
    private BrightcoveSeekBarController i;
    private BrightcoveShowHideController j;

    public BrightcoveMediaController(BaseVideoView basevideoview)
    {
        this(basevideoview, com.brightcove.player.R.layout.default_media_controller);
    }

    public BrightcoveMediaController(BaseVideoView basevideoview, int l)
    {
        super(basevideoview.getEventEmitter());
        g = basevideoview;
        f = l;
        b = new BrightcoveMediaControlRegistryImpl();
        c();
        a(((Bundle) (null)));
        basevideoview.setMediaController(this);
    }

    private TextView a(int l)
    {
        View view = c.findViewById(l);
        if (view != null && (view instanceof TextView))
        {
            return (TextView)view;
        } else
        {
            return null;
        }
    }

    private TextView a(int l, String s, Bundle bundle)
    {
        TextView textview = (TextView)c.findViewById(l);
        if (textview != null && bundle != null)
        {
            bundle.getString(s);
            if (s != null && bundle.containsKey(s))
            {
                s = bundle.getString(s);
            } else
            {
                s = "0:00";
            }
            textview.setText(s);
        }
        return textview;
    }

    static BrightcoveShowHideController a(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.j;
    }

    private d a(String s)
    {
        d d1 = d.a;
        d d2;
        try
        {
            d2 = com.brightcove.player.mediacontroller.d.valueOf(s.toUpperCase(Locale.US));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w(a, String.format("Invalid animation style: %s.", new Object[] {
                s
            }));
            return d1;
        }
        return d2;
    }

    static String a()
    {
        return a;
    }

    private void a(Bundle bundle)
    {
        Log.d(a, "Initializing the control bar...");
        b.clear();
        c = (BrightcoveControlBar)((LayoutInflater)g.getContext().getSystemService("layout_inflater")).inflate(f, g, false);
        b.register(c);
        j = new BrightcoveShowHideController(c, g);
        a(c, bundle);
        d = a(com.brightcove.player.R.id.current_time, "progress", bundle);
        e = a(com.brightcove.player.R.id.end_time, "duration", bundle);
        b(bundle);
        d();
        e();
        g.addView(c);
        F.emit("controlBarCreated");
    }

    private void a(Event event)
    {
        Log.d(a, "Saving control bar instance state...");
        Object obj = event.properties.get("instanceState");
        Boolean boolean1;
        if (obj != null && (obj instanceof Bundle))
        {
            obj = (Bundle)obj;
        } else
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putString("progress", b(com.brightcove.player.R.id.current_time));
        ((Bundle) (obj)).putString("duration", b(com.brightcove.player.R.id.end_time));
        if (c(com.brightcove.player.R.id.captions) == 0)
        {
            boolean1 = Boolean.TRUE;
        } else
        {
            boolean1 = Boolean.FALSE;
        }
        ((Bundle) (obj)).putBoolean("captionsState", boolean1.booleanValue());
        event.properties.put("instanceState", obj);
    }

    private void a(BrightcoveControlBar brightcovecontrolbar, Bundle bundle)
    {
        Context context = g.getContext();
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
        b.register(new PlayButtonController(context, g, brightcovecontrolbar, typeface));
        if (brightcovecontrolbar.getBooleanResource(com.brightcove.player.R.styleable.BrightcoveMediaController_closed_captions))
        {
            b.register(new CaptionsButtonController(context, g, brightcovecontrolbar, typeface, bundle));
        }
        if (brightcovecontrolbar.getBooleanResource(com.brightcove.player.R.styleable.BrightcoveMediaController_full_screen))
        {
            b.register(new FullScreenButtonController(context, g, brightcovecontrolbar, typeface));
        }
        if (brightcovecontrolbar.getBooleanResource(com.brightcove.player.R.styleable.BrightcoveMediaController_live))
        {
            b.register(new LiveButtonController(context, g, brightcovecontrolbar, null));
        }
        if (brightcovecontrolbar.getBooleanResource(com.brightcove.player.R.styleable.BrightcoveMediaController_rewind))
        {
            b.register(new RewindButtonController(context, g, brightcovecontrolbar, typeface));
        }
        brightcovecontrolbar = b.getView(com.brightcove.player.R.id.play);
        if (brightcovecontrolbar != null)
        {
            brightcovecontrolbar.requestFocus();
        }
    }

    static void a(BrightcoveMediaController brightcovemediacontroller, Bundle bundle)
    {
        brightcovemediacontroller.c(bundle);
    }

    static void a(BrightcoveMediaController brightcovemediacontroller, Event event)
    {
        brightcovemediacontroller.a(event);
    }

    private SparseArray b()
    {
        SparseArray sparsearray = new SparseArray();
        sparsearray.put(com.brightcove.player.R.id.play, "Play");
        sparsearray.put(com.brightcove.player.R.id.rewind, "Rewind");
        sparsearray.put(com.brightcove.player.R.id.current_time, "ProgressTime");
        sparsearray.put(com.brightcove.player.R.id.time_separator, "TimeSeparator");
        sparsearray.put(com.brightcove.player.R.id.end_time, "DurationTime");
        sparsearray.put(com.brightcove.player.R.id.seek_bar, "SeekBar");
        sparsearray.put(com.brightcove.player.R.id.one_line_spacer, "OneLineSpacer");
        sparsearray.put(com.brightcove.player.R.id.two_line_spacer, "TwoLineSpacer");
        sparsearray.put(com.brightcove.player.R.id.live, "Live");
        sparsearray.put(com.brightcove.player.R.id.captions, "Captions");
        sparsearray.put(com.brightcove.player.R.id.full_screen, "FullScreen");
        return sparsearray;
    }

    static BrightcoveSeekBarController b(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.i;
    }

    private String b(int l)
    {
        TextView textview = a(l);
        if (textview != null)
        {
            return textview.getText().toString();
        } else
        {
            return "";
        }
    }

    private void b(Bundle bundle)
    {
        Log.d(a, "Initializing the seek bar...");
        h = (BrightcoveSeekBar)c.findViewById(com.brightcove.player.R.id.seek_bar);
        i = new BrightcoveSeekBarController(h, g);
        c(bundle);
    }

    private void b(Event event)
    {
        Log.d(a, "Saving seek bar instance state...");
        Object obj = event.properties.get("instanceState");
        List list;
        int ai[];
        if (obj != null && (obj instanceof Bundle))
        {
            obj = (Bundle)obj;
        } else
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putInt("seekBarMax", h.getMax());
        ((Bundle) (obj)).putInt("seekBarProgress", h.getProgress());
        list = h.getMarkers();
        ai = new int[list.size()];
        for (int l = 0; l < list.size(); l++)
        {
            ai[l] = ((Integer)list.get(l)).intValue();
        }

        ((Bundle) (obj)).putIntArray("markerList", ai);
        event.properties.put("instanceState", obj);
    }

    static void b(BrightcoveMediaController brightcovemediacontroller, Bundle bundle)
    {
        brightcovemediacontroller.a(bundle);
    }

    static void b(BrightcoveMediaController brightcovemediacontroller, Event event)
    {
        brightcovemediacontroller.b(event);
    }

    private int c(int l)
    {
        ButtonController buttoncontroller = b.getButtonController(l);
        if (buttoncontroller != null)
        {
            return buttoncontroller.getVisibilityState();
        } else
        {
            return 8;
        }
    }

    static BrightcoveMediaControlRegistry c(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.b;
    }

    private void c()
    {
        Object obj = new h(this, null);
        g.setOnTouchListener(((android.view.View.OnTouchListener) (obj)));
        addListener("didSetVideo", new g(this, null));
        addListener("configurationChanged", new e(this, null));
        obj = new f(this, null);
        addListener("activityCreated", new b(this, null));
        addListener("activitySaveInstanceState", new c(this, null));
        addListener("videoDurationChanged", new i(this, null));
        addListener("progress", ((com.brightcove.player.event.EventListener) (obj)));
        addListener("adProgress", ((com.brightcove.player.event.EventListener) (obj)));
    }

    private void c(Bundle bundle)
    {
        int l = 0;
        if (bundle != null && bundle.size() > 0)
        {
            if (bundle.containsKey("seekBarMax"))
            {
                h.setMax(bundle.getInt("seekBarMax"));
            }
            if (bundle.containsKey("seekBarProgress"))
            {
                int i1 = bundle.getInt("seekBarProgress");
                Log.d(a, String.format("Setting seekbar progress to %s.", new Object[] {
                    Integer.valueOf(i1)
                }));
                h.setProgress(i1);
            }
            if (bundle.containsKey("markerList"))
            {
                bundle = bundle.getIntArray("markerList");
                for (int j1 = bundle.length; l < j1; l++)
                {
                    int k1 = bundle[l];
                    h.addMarker(k1);
                }

            }
        }
    }

    static BrightcoveControlBar d(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.c;
    }

    private void d()
    {
        String s = c.getStringResource(com.brightcove.player.R.styleable.BrightcoveMediaController_animation_style, "fade");
        j.setShowHideAnimationStyle(a(s));
        int l = c.getIntegerResource(com.brightcove.player.R.styleable.BrightcoveMediaController_timeout, 3000);
        j.setShowHideTimeout(l);
        h.setMarkerColor(c.getStringResource(com.brightcove.player.R.styleable.BrightcoveMediaController_marker_color, "white"));
        h.setMarkerWidth(c.getFloatResource(com.brightcove.player.R.styleable.BrightcoveMediaController_marker_width, 1.0F));
    }

    static BaseVideoView e(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.g;
    }

    private void e()
    {
        Log.d(a, "Setting the visibility on the player controls...");
        c.setVisibility(4);
        SparseArray sparsearray = b();
        boolean flag = g.getVideoDisplay().isLive();
        boolean flag1 = g.getVideoDisplay().hasDvr();
        String s = a;
        Object obj;
        int i1;
        if (flag)
        {
            obj = "is live";
        } else
        {
            obj = "is not live";
        }
        Log.d(s, String.format("The video %1$s.", new Object[] {
            obj
        }));
        s = a;
        if (flag1)
        {
            obj = "have";
        } else
        {
            obj = "not have";
        }
        Log.d(s, String.format("The video does %1$s DVR support.", new Object[] {
            obj
        }));
        i1 = 0;
        while (i1 < sparsearray.size()) 
        {
            int l = sparsearray.keyAt(i1);
            obj = c.findViewById(l);
            if (obj == null)
            {
                Log.w(a, String.format("Null %1$s view found with resource id: %2$x.  This is probably OK.", new Object[] {
                    sparsearray.get(l), Integer.valueOf(l)
                }));
            } else
            {
                if (l == com.brightcove.player.R.id.two_line_spacer)
                {
                    l = 0;
                } else
                if (obj instanceof Button)
                {
                    l = c(l);
                } else
                if (l == com.brightcove.player.R.id.one_line_spacer)
                {
                    if (flag && !flag1)
                    {
                        l = 0;
                    } else
                    {
                        l = 8;
                    }
                } else
                if (l == com.brightcove.player.R.id.time_separator || l == com.brightcove.player.R.id.end_time)
                {
                    if (!flag)
                    {
                        l = 0;
                    } else
                    {
                        l = 8;
                    }
                } else
                if (l == com.brightcove.player.R.id.current_time || l == com.brightcove.player.R.id.seek_bar)
                {
                    if (!flag || flag1)
                    {
                        l = 0;
                    } else
                    {
                        l = 8;
                    }
                } else
                {
                    Log.w(a, String.format("View %1$s has not been handled.  It will be visible.", new Object[] {
                        sparsearray.get(l)
                    }));
                    l = 0;
                }
                Log.d(a, String.format("Setting visibility on view: (%1$s) to %2$d.", new Object[] {
                    obj, Integer.valueOf(l)
                }));
                ((View) (obj)).setVisibility(l);
            }
            i1++;
        }
        c.invalidate();
        show();
    }

    static BrightcoveSeekBar f(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.h;
    }

    static TextView g(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.e;
    }

    static TextView h(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.d;
    }

    static void i(BrightcoveMediaController brightcovemediacontroller)
    {
        brightcovemediacontroller.e();
    }

    static EventEmitter j(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.F;
    }

    static EventEmitter k(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.F;
    }

    public BrightcoveControlBar getBrightcoveControlBar()
    {
        return c;
    }

    public BrightcoveSeekBar getBrightcoveSeekBar()
    {
        return h;
    }

    public BrightcoveMediaControlRegistry getMediaControlRegistry()
    {
        return b;
    }

    public void hide()
    {
        j.hide();
    }

    public boolean isDragging()
    {
        return i.isDragging();
    }

    public boolean isShowing()
    {
        return j.isShowing();
    }

    public void setShowHideAnimationStyle(d d1)
    {
        j.setShowHideAnimationStyle(d1);
    }

    public void setShowHideTimeout(int l)
    {
        j.setShowHideTimeout(l);
    }

    public void show()
    {
        j.show();
    }

}
