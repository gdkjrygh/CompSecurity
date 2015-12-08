// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import com.brightcove.player.mediacontroller.buttons.CaptionsButtonController;
import com.brightcove.player.mediacontroller.buttons.FullScreenButtonController;
import com.brightcove.player.mediacontroller.buttons.LiveButtonController;
import com.brightcove.player.mediacontroller.buttons.PlayButtonController;
import com.brightcove.player.mediacontroller.buttons.RewindButtonController;
import com.brightcove.player.util.StringUtil;
import com.brightcove.player.view.BaseVideoView;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            ShowHideController, BrightcoveMediaControlRegistryImpl, BrightcoveControlBar, BrightcoveMediaControlRegistry, 
//            BrightcoveShowHideController, BrightcoveSeekBar, BrightcoveSeekBarController

public class BrightcoveMediaController extends AbstractComponent
    implements ShowHideController
{
    final class a
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            BrightcoveMediaController.a();
            event = ((Event) (event.properties.get("instanceState")));
            if (event != null && (event instanceof Bundle) && ((Bundle)event).size() > 0)
            {
                event = (Bundle)event;
                BrightcoveMediaController.a(a, event);
            }
        }

        private a()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            BrightcoveMediaController.a(a, event);
            BrightcoveMediaController.b(a, event);
        }

        private b()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/brightcove/player/mediacontroller/BrightcoveMediaController$c, s);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("FADE", 0);
            b = new c("SLIDE", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s, int i1)
        {
            super(s, i1);
        }
    }

    final class d
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            int i1 = event.getIntegerProperty("percentComplete");
            if (i1 != -1)
            {
                BrightcoveMediaController.f(a).setSecondaryProgress((i1 * BrightcoveMediaController.f(a).getMax()) / 100);
            }
        }

        private d()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    final class e
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            BrightcoveMediaController.a();
            String.format("Processing a %s event...", new Object[] {
                event.getType()
            });
            BrightcoveMediaController.a(a).removeListeners();
            BrightcoveMediaController.b(a).removeListeners();
            for (Iterator iterator = BrightcoveMediaController.c(a).getButtonControllers().iterator(); iterator.hasNext(); ((ButtonController)iterator.next()).removeListeners()) { }
            BrightcoveMediaController.a(a, event);
            BrightcoveMediaController.b(a, event);
            BrightcoveMediaController.e(a).removeView(BrightcoveMediaController.d(a));
            event = ((Event) (event.properties.get("instanceState")));
            if (event != null && (event instanceof Bundle))
            {
                event = (Bundle)event;
            } else
            {
                event = null;
            }
            BrightcoveMediaController.b(a, event);
        }

        private e()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }

    final class f
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            if (!a.isDragging())
            {
                int k1 = event.getIntegerProperty("duration");
                int l1 = event.getIntegerProperty("maxPosition");
                int i2 = event.getIntegerProperty("minPosition");
                int j1 = Math.max(k1, l1);
                int i1 = j1;
                if (j1 < 0)
                {
                    i1 = 0;
                }
                j1 = BrightcoveMediaController.f(a).getMax();
                BrightcoveMediaController.a();
                String.format("ProgressHandler: videoDuration = %1$d, maxPosition = %2$d, minDuration = %3$d, currentMax = %4$d.", new Object[] {
                    Integer.valueOf(k1), Integer.valueOf(l1), Integer.valueOf(i2), Integer.valueOf(j1)
                });
                if (i1 > j1)
                {
                    BrightcoveMediaController.a();
                    BrightcoveMediaController.f(a).setMax(i1);
                    BrightcoveMediaController.g(a).setText(StringUtil.stringForTime(i1));
                }
                i1 = event.getIntegerProperty("playheadPosition");
                BrightcoveMediaController.a();
                String.format("position: %1$d.", new Object[] {
                    Integer.valueOf(i1)
                });
                BrightcoveMediaController.f(a).setProgress(i1);
                BrightcoveMediaController.h(a).setText(StringUtil.stringForTime(i1));
                return;
            } else
            {
                BrightcoveMediaController.a();
                return;
            }
        }

        private f()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    final class g
        implements EventListener
    {

        final BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            BrightcoveMediaController.a();
            String.format("Processing event: %1$s...", new Object[] {
                event.getType()
            });
            BrightcoveMediaController.i(a);
            BrightcoveMediaController.j(a).once("bufferedUpdate", new EventListener(this) {

                private g a;

                public final void processEvent(Event event)
                {
                    BrightcoveMediaController.i(a.a);
                }

            
            {
                a = g1;
                super();
            }
            });
        }

        private g()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }

    final class h
        implements android.view.View.OnTouchListener
    {

        private BrightcoveMediaController a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
label0:
            {
                BrightcoveMediaController.a();
                String.format("Processing onTouch for view: %s, with event: %s.", new Object[] {
                    view, motionevent
                });
                if (motionevent.getAction() == 0)
                {
                    if (!a.isShowing())
                    {
                        break label0;
                    }
                    BrightcoveMediaController.a();
                    BrightcoveMediaController.k(a).emit("hideMediaControls");
                }
                return false;
            }
            BrightcoveMediaController.a();
            BrightcoveMediaController.l(a).emit("showMediaControls");
            return false;
        }

        private h()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        h(byte byte0)
        {
            this();
        }
    }

    final class i
        implements EventListener
    {

        private BrightcoveMediaController a;

        public final void processEvent(Event event)
        {
            int i1 = event.getIntegerProperty("duration");
            if (i1 >= 0)
            {
                BrightcoveMediaController.a();
                String.format("Setting seekbar max to %s from event: %s.", new Object[] {
                    Integer.valueOf(i1), event.getType()
                });
                BrightcoveMediaController.f(a).setMax(i1);
                BrightcoveMediaController.g(a).setText(StringUtil.stringForTime(i1));
            }
        }

        private i()
        {
            a = BrightcoveMediaController.this;
            super();
        }

        i(byte byte0)
        {
            this();
        }
    }


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

    public BrightcoveMediaController(BaseVideoView basevideoview, int i1)
    {
        super(basevideoview.getEventEmitter());
        g = basevideoview;
        f = i1;
        b = new BrightcoveMediaControlRegistryImpl();
        Object obj = new h((byte)0);
        g.setOnTouchListener(((android.view.View.OnTouchListener) (obj)));
        addListener("didSetVideo", new g((byte)0));
        addListener("configurationChanged", new e((byte)0));
        addListener("activityCreated", new a((byte)0));
        addListener("activitySaveInstanceState", new b((byte)0));
        addListener("videoDurationChanged", new i((byte)0));
        obj = new f((byte)0);
        addListener("progress", ((EventListener) (obj)));
        addListener("adProgress", ((EventListener) (obj)));
        addListener("bufferedUpdate", new d((byte)0));
        a(((Bundle) (null)));
        basevideoview.setMediaController(this);
    }

    private TextView a(int i1, String s, Bundle bundle)
    {
        TextView textview = (TextView)c.findViewById(i1);
        if (textview != null && bundle != null)
        {
            bundle.getString(s);
            if (bundle.containsKey(s))
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

    private static c a(String s)
    {
        c c1 = c.a;
        c c2;
        try
        {
            c2 = c.valueOf(s.toUpperCase(Locale.US));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            String.format("Invalid animation style: %s.", new Object[] {
                s
            });
            return c1;
        }
        return c2;
    }

    static BrightcoveShowHideController a(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.j;
    }

    static String a()
    {
        return a;
    }

    private String a(int i1)
    {
        Object obj = c.findViewById(i1);
        if (obj != null && (obj instanceof TextView))
        {
            obj = (TextView)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            return ((TextView) (obj)).getText().toString();
        } else
        {
            return "";
        }
    }

    private void a(Bundle bundle)
    {
        Object obj1 = null;
        b.clear();
        c = (BrightcoveControlBar)((LayoutInflater)g.getContext().getSystemService("layout_inflater")).inflate(f, g, false);
        b.register(c);
        j = new BrightcoveShowHideController(c, g);
        BrightcoveControlBar brightcovecontrolbar = c;
        Context context = g.getContext();
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
        Object obj;
        int i1;
        if (c(BrightcoveControlBar.PLAY))
        {
            obj = new PlayButtonController(context, g, brightcovecontrolbar, typeface);
        } else
        {
            obj = null;
        }
        a(((ButtonController) (obj)));
        if (c(BrightcoveControlBar.CLOSED_CAPTIONS))
        {
            obj = new CaptionsButtonController(context, g, brightcovecontrolbar, typeface, bundle);
        } else
        {
            obj = null;
        }
        a(((ButtonController) (obj)));
        if (c(BrightcoveControlBar.FULL_SCREEN))
        {
            obj = new FullScreenButtonController(context, g, brightcovecontrolbar, typeface);
        } else
        {
            obj = null;
        }
        a(((ButtonController) (obj)));
        if (c(BrightcoveControlBar.LIVE))
        {
            obj = new LiveButtonController(context, g, brightcovecontrolbar, typeface);
        } else
        {
            obj = null;
        }
        a(((ButtonController) (obj)));
        obj = obj1;
        if (c(BrightcoveControlBar.REWIND))
        {
            obj = new RewindButtonController(context, g, brightcovecontrolbar, typeface);
        }
        a(((ButtonController) (obj)));
        obj = b.getView(com.brightcove.player.R.id.play);
        if (obj != null)
        {
            ((View) (obj)).requestFocus();
        }
        d = a(com.brightcove.player.R.id.current_time, "progress", bundle);
        e = a(com.brightcove.player.R.id.end_time, "duration", bundle);
        h = (BrightcoveSeekBar)c.findViewById(com.brightcove.player.R.id.seek_bar);
        i = new BrightcoveSeekBarController(h, g);
        b(bundle);
        bundle = c.getStringResource(com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_animation_style, "fade");
        j.setShowHideAnimationStyle(a(((String) (bundle))));
        i1 = c.getIntegerResource(com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_timeout, 3000);
        j.setShowHideTimeout(i1);
        h.setMarkerColor(c.getColorResource(com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_marker_color, -1));
        h.setMarkerWidth(c.getFloatResource(com.brightcove.player.R.styleable.BrightcoveMediaController_brightcove_marker_width, 5F));
        b();
        g.addView(c);
        eventEmitter.emit("controlBarCreated");
    }

    static void a(BrightcoveMediaController brightcovemediacontroller, Bundle bundle)
    {
        brightcovemediacontroller.b(bundle);
    }

    static void a(BrightcoveMediaController brightcovemediacontroller, Event event)
    {
        Object obj = event.properties.get("instanceState");
        if (obj != null && (obj instanceof Bundle))
        {
            obj = (Bundle)obj;
        } else
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putString("progress", brightcovemediacontroller.a(com.brightcove.player.R.id.current_time));
        ((Bundle) (obj)).putString("duration", brightcovemediacontroller.a(com.brightcove.player.R.id.end_time));
        if (brightcovemediacontroller.b(com.brightcove.player.R.id.captions) == 0)
        {
            brightcovemediacontroller = Boolean.TRUE;
        } else
        {
            brightcovemediacontroller = Boolean.FALSE;
        }
        ((Bundle) (obj)).putBoolean("captionsState", brightcovemediacontroller.booleanValue());
        event.properties.put("instanceState", obj);
    }

    private void a(ButtonController buttoncontroller)
    {
        if (buttoncontroller != null)
        {
            b.register(buttoncontroller);
        }
    }

    private int b(int i1)
    {
        ButtonController buttoncontroller = b.getButtonController(i1);
        String s;
        if (buttoncontroller == null)
        {
            s = "null";
        } else
        {
            s = "is not null";
        }
        String.format("The controller with id: %x is %s.\n", new Object[] {
            Integer.valueOf(i1), s
        });
        if (buttoncontroller != null)
        {
            return buttoncontroller.getVisibilityState();
        } else
        {
            return 8;
        }
    }

    static BrightcoveSeekBarController b(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.i;
    }

    private void b()
    {
        c.setVisibility(4);
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
        boolean flag = g.getVideoDisplay().isLive();
        boolean flag1 = g.getVideoDisplay().hasDvr();
        Object obj;
        int j1;
        if (flag)
        {
            obj = "live";
        } else
        {
            obj = "not live";
        }
        String.format("The video is %1$s.", new Object[] {
            obj
        });
        if (flag1)
        {
            obj = "have";
        } else
        {
            obj = "not have";
        }
        String.format("The video does %1$s DVR support.", new Object[] {
            obj
        });
        j1 = 0;
        while (j1 < sparsearray.size()) 
        {
            int i1 = sparsearray.keyAt(j1);
            obj = c.findViewById(i1);
            if (obj == null)
            {
                String.format("Null %1$s view found with resource id: %2$x.  This is probably OK.", new Object[] {
                    sparsearray.get(i1), Integer.valueOf(i1)
                });
            } else
            {
                if (i1 == com.brightcove.player.R.id.two_line_spacer)
                {
                    i1 = 0;
                } else
                if (obj instanceof Button)
                {
                    i1 = b(i1);
                } else
                if (i1 == com.brightcove.player.R.id.one_line_spacer)
                {
                    if (flag && !flag1)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                } else
                if (i1 == com.brightcove.player.R.id.time_separator || i1 == com.brightcove.player.R.id.end_time)
                {
                    if (!flag)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                } else
                if (i1 == com.brightcove.player.R.id.current_time || i1 == com.brightcove.player.R.id.seek_bar)
                {
                    if (!flag || flag1)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                } else
                {
                    String.format("View %1$s has not been handled.  It will be visible.", new Object[] {
                        sparsearray.get(i1)
                    });
                    i1 = 0;
                }
                String.format("Setting visibility on view: (%1$s) to %2$d.", new Object[] {
                    obj, Integer.valueOf(i1)
                });
                ((View) (obj)).setVisibility(i1);
            }
            j1++;
        }
        c.invalidate();
        show();
    }

    private void b(Bundle bundle)
    {
        int i1 = 0;
        if (bundle != null && bundle.size() > 0)
        {
            if (bundle.containsKey("seekBarMax"))
            {
                h.setMax(bundle.getInt("seekBarMax"));
            }
            if (bundle.containsKey("seekBarProgress"))
            {
                int j1 = bundle.getInt("seekBarProgress");
                String.format("Setting seekbar progress to %s.", new Object[] {
                    Integer.valueOf(j1)
                });
                h.setProgress(j1);
            }
            if (bundle.containsKey("markerList"))
            {
                bundle = bundle.getIntArray("markerList");
                for (int k1 = bundle.length; i1 < k1; i1++)
                {
                    int l1 = bundle[i1];
                    h.addMarker(l1);
                }

            }
        }
    }

    static void b(BrightcoveMediaController brightcovemediacontroller, Bundle bundle)
    {
        brightcovemediacontroller.a(bundle);
    }

    static void b(BrightcoveMediaController brightcovemediacontroller, Event event)
    {
        Object obj = event.properties.get("instanceState");
        int ai[];
        if (obj != null && (obj instanceof Bundle))
        {
            obj = (Bundle)obj;
        } else
        {
            obj = new Bundle();
        }
        ((Bundle) (obj)).putInt("seekBarMax", brightcovemediacontroller.h.getMax());
        ((Bundle) (obj)).putInt("seekBarProgress", brightcovemediacontroller.h.getProgress());
        brightcovemediacontroller = brightcovemediacontroller.h.getMarkers();
        ai = new int[brightcovemediacontroller.size()];
        for (int i1 = 0; i1 < brightcovemediacontroller.size(); i1++)
        {
            ai[i1] = ((Integer)brightcovemediacontroller.get(i1)).intValue();
        }

        ((Bundle) (obj)).putIntArray("markerList", ai);
        event.properties.put("instanceState", obj);
    }

    static BrightcoveMediaControlRegistry c(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.b;
    }

    private boolean c(int i1)
    {
        return c.getBooleanResource(i1);
    }

    static BrightcoveControlBar d(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.c;
    }

    static BaseVideoView e(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.g;
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
        brightcovemediacontroller.b();
    }

    static EventEmitter j(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.eventEmitter;
    }

    static EventEmitter k(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.eventEmitter;
    }

    static EventEmitter l(BrightcoveMediaController brightcovemediacontroller)
    {
        return brightcovemediacontroller.eventEmitter;
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

    public void setShowHideAnimationStyle(c c1)
    {
        j.setShowHideAnimationStyle(c1);
    }

    public void setShowHideTimeout(int i1)
    {
        j.setShowHideTimeout(i1);
    }

    public void show()
    {
        j.show();
    }

}
