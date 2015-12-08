// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.brightcove.player.captioning.BrightcoveClosedCaption;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.management.BrightcoveClosedCaptioningManager;
import com.brightcove.player.model.Block;
import com.brightcove.player.model.Length;
import com.brightcove.player.model.Region;
import com.brightcove.player.model.Span;
import com.brightcove.player.model.StyledElement;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.model.WebVTTDocument;
import com.brightcove.player.util.StringUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView

public class BrightcoveClosedCaptioningView extends FrameLayout
    implements Component
{
    public static final class ClosedCaptioningMode extends Enum
    {

        public static final ClosedCaptioningMode OFF;
        public static final ClosedCaptioningMode ON;
        private static final ClosedCaptioningMode a[];

        public static ClosedCaptioningMode valueOf(String s)
        {
            return (ClosedCaptioningMode)Enum.valueOf(com/brightcove/player/view/BrightcoveClosedCaptioningView$ClosedCaptioningMode, s);
        }

        public static ClosedCaptioningMode[] values()
        {
            return (ClosedCaptioningMode[])a.clone();
        }

        static 
        {
            OFF = new ClosedCaptioningMode("OFF", 0);
            ON = new ClosedCaptioningMode("ON", 1);
            a = (new ClosedCaptioningMode[] {
                OFF, ON
            });
        }

        private ClosedCaptioningMode(String s, int i1)
        {
            super(s, i1);
        }
    }

    public class TimeMapEntry
    {

        public ViewGroup block;
        public BrightcoveClosedCaption closedCaption;

        public TimeMapEntry(BrightcoveClosedCaption brightcoveclosedcaption, ViewGroup viewgroup)
        {
            closedCaption = brightcoveclosedcaption;
            block = viewgroup;
        }
    }


    public static final int DEFAULT_HORIZONTAL_GRAVITY = 17;
    public static final int DEFAULT_VERTICAL_GRAVITY = 80;
    protected static final String a = com/brightcove/player/view/BrightcoveClosedCaptioningView.getSimpleName();
    protected TreeMap b;
    protected LinearLayout c;
    private EventEmitter d;
    private ClosedCaptioningMode e;
    private LayoutInflater f;
    private int g;
    private int h;
    private BaseVideoView i;
    private Span j;
    private String k;
    private EventListener l = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            if (a.isEnabled() && a.getMode() == ClosedCaptioningMode.ON)
            {
                if (a.c != null)
                {
                    a.c.setVisibility(8);
                }
                event = event.properties;
                if (event.containsKey("text"))
                {
                    event = new BrightcoveClosedCaption(((Integer)event.get("position")).intValue(), -1, (String)event.get("text"));
                    event = a.a(event);
                    if (event != null)
                    {
                        if (a.c != null)
                        {
                            a.c.setVisibility(8);
                        }
                        a.a(event);
                        a.addView(event);
                        event.setVisibility(0);
                        event.invalidate();
                    }
                    a.c = (LinearLayout)event;
                }
            }
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener m = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            int j1 = event.getIntegerProperty("originalPlayheadPosition");
            int i1 = j1;
            if (j1 == -1)
            {
                i1 = event.getIntegerProperty("playheadPosition");
            }
            BrightcoveClosedCaptioningView.a(a, i1);
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener n = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            TTMLDocument ttmldocument = (TTMLDocument)event.properties.get("ttmlDocument");
            if (ttmldocument != null)
            {
                a.prepareDFXPCaptions(ttmldocument);
                return;
            }
            event = (WebVTTDocument)event.properties.get("webvttDocument");
            if (event != null)
            {
                a.prepareWebVTTCaptions(event);
                return;
            } else
            {
                event = BrightcoveClosedCaptioningView.a;
                a.clear();
                return;
            }
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener o = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            a.refreshCaptions();
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener p = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            if (((Boolean)event.properties.get("boolean")).booleanValue())
            {
                a.setMode(ClosedCaptioningMode.ON);
                a.setVisibility(0);
                a.bringToFront();
                if (!a.b.isEmpty())
                {
                    a.a();
                }
                return;
            } else
            {
                a.setMode(ClosedCaptioningMode.OFF);
                a.setVisibility(8);
                a.b();
                return;
            }
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener q = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            int i1 = a.getSafeAreaMarginWidth();
            int j1 = a.getSafeAreaMarginHeight();
            int k1 = event.getIntegerProperty("controlsHeight");
            if (k1 != -1)
            {
                a.setPadding(i1, j1, i1, k1 + j1);
            }
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };
    private EventListener r = new EventListener() {

        private BrightcoveClosedCaptioningView a;

        public final void processEvent(Event event)
        {
            int i1 = a.getSafeAreaMarginWidth();
            int j1 = a.getSafeAreaMarginHeight();
            a.setPadding(i1, j1, i1, j1);
        }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
    };

    public BrightcoveClosedCaptioningView(Context context)
    {
        super(context);
        g = -1;
        h = 0;
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = -1;
        h = 0;
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = -1;
        h = 0;
    }

    private static android.widget.FrameLayout.LayoutParams a(View view)
    {
        view = view.getLayoutParams();
        if (view == null)
        {
            return new android.widget.FrameLayout.LayoutParams(-1, -2);
        } else
        {
            return new android.widget.FrameLayout.LayoutParams(view);
        }
    }

    private void a(int i1)
    {
label0:
        {
            if (isEnabled() && getMode() == ClosedCaptioningMode.ON)
            {
                h = i1;
                if (i1 != -1)
                {
                    break label0;
                }
            }
            return;
        }
        ViewGroup viewgroup = findCaptionForPosition(i1);
        if (c != null)
        {
            c.setVisibility(8);
        }
        if (viewgroup != null)
        {
            viewgroup.setVisibility(0);
            viewgroup.invalidate();
        }
        c = (LinearLayout)viewgroup;
    }

    static void a(BrightcoveClosedCaptioningView brightcoveclosedcaptioningview, int i1)
    {
        brightcoveclosedcaptioningview.a(i1);
    }

    private void a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("boolean", Boolean.valueOf(flag));
        d.emit("captionsAvailable", hashmap);
    }

    private static int b(BrightcoveClosedCaption brightcoveclosedcaption)
    {
        byte byte1 = 17;
        byte byte0 = byte1;
        if (brightcoveclosedcaption.getTextAlign() != null)
        {
            if (brightcoveclosedcaption.getTextAlign() == com.brightcove.player.model.StyledElement.TextAlign.LEFT)
            {
                byte0 = 3;
            } else
            {
                byte0 = byte1;
                if (brightcoveclosedcaption.getTextAlign() == com.brightcove.player.model.StyledElement.TextAlign.RIGHT)
                {
                    return 5;
                }
            }
        }
        return byte0;
    }

    protected final ViewGroup a(ViewGroup viewgroup)
    {
        com.brightcove.player.captioning.BrightcoveCaptionStyle brightcovecaptionstyle = BrightcoveClosedCaptioningManager.getInstance(getContext()).getStyle();
        for (int i1 = 0; i1 < viewgroup.getChildCount(); i1++)
        {
            View view = viewgroup.getChildAt(i1);
            if (view instanceof BrightcoveClosedCaptioningTextView)
            {
                ((BrightcoveClosedCaptioningTextView)view).setStyle(brightcovecaptionstyle);
            }
        }

        viewgroup.invalidate();
        viewgroup.requestLayout();
        return viewgroup;
    }

    protected final ViewGroup a(BrightcoveClosedCaption brightcoveclosedcaption)
    {
        LinearLayout linearlayout = (LinearLayout)f.inflate(com.brightcove.player.R.layout.caption_block, null);
        int i1 = b(brightcoveclosedcaption);
        Object obj = a(((View) (linearlayout)));
        obj.gravity = i1 | 0x50;
        linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        linearlayout.setVisibility(8);
        obj = (BrightcoveClosedCaptioningTextView)linearlayout.findViewById(com.brightcove.player.R.id.caption_text);
        ((BrightcoveClosedCaptioningTextView) (obj)).setText(Html.fromHtml(brightcoveclosedcaption.getCaption()));
        ((BrightcoveClosedCaptioningTextView) (obj)).setGravity(i1);
        return linearlayout;
    }

    protected final void a()
    {
        if (g == -1)
        {
            g = d.on("progress", m);
        }
    }

    protected final void b()
    {
        if (g != -1)
        {
            d.off("progress", g);
            g = -1;
        }
    }

    public void clear()
    {
        setMode(ClosedCaptioningMode.OFF);
        b();
        a(false);
        if (getChildCount() > 0)
        {
            removeAllViews();
        }
        if (b != null && b.size() > 0)
        {
            b.clear();
        }
    }

    public ViewGroup findCaptionForPosition(int i1)
    {
        java.util.Map.Entry entry = b.floorEntry(Integer.valueOf(i1));
        if (entry != null && entry.getValue() != null && ((TimeMapEntry)entry.getValue()).closedCaption.getEndTime() >= i1)
        {
            return a(((TimeMapEntry)entry.getValue()).block);
        } else
        {
            return null;
        }
    }

    public ClosedCaptioningMode getMode()
    {
        return e;
    }

    public int getSafeAreaMarginHeight()
    {
        int k1 = 0;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        int i1;
        int j1;
        if (layoutparams != null)
        {
            i1 = layoutparams.height;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (i1 <= 0)
        {
            j1 = i.getMeasuredVideoHeight();
            k1 = (getHeight() - j1) / 2;
        }
        return k1 + Math.round((float)j1 * 0.05F);
    }

    public int getSafeAreaMarginWidth()
    {
        int k1 = 0;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        int i1;
        int j1;
        if (layoutparams != null)
        {
            i1 = layoutparams.width;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (i1 <= 0)
        {
            j1 = i.getMeasuredVideoWidth();
            k1 = (getWidth() - j1) / 2;
        }
        return k1 + Math.round((float)j1 * 0.05F);
    }

    public void initialize(EventEmitter eventemitter)
    {
        initialize(eventemitter, null);
    }

    public void initialize(EventEmitter eventemitter, BaseVideoView basevideoview)
    {
        d = RegisteringEventEmitter.build(eventemitter, getClass());
        f = (LayoutInflater)getContext().getSystemService("layout_inflater");
        b = new TreeMap();
        d.on("didLoadClosedCaptions", n);
        d.on("setCaptionsState", o);
        d.on("toggleClosedCaptions", p);
        d.on("didShowMediaControls", q);
        d.on("didHideMediaControls", r);
        d.on("caption", l);
        d.on("completed", new EventListener() {

            private BrightcoveClosedCaptioningView a;

            public final void processEvent(Event event)
            {
                if (a.c != null)
                {
                    a.c.setVisibility(8);
                }
            }

            
            {
                a = BrightcoveClosedCaptioningView.this;
                super();
            }
        });
        i = basevideoview;
        if (i.getClosedCaptioningController().isCaptioningEnabled())
        {
            e = ClosedCaptioningMode.ON;
            return;
        } else
        {
            e = ClosedCaptioningMode.OFF;
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    public void prepareDFXPCaptions(TTMLDocument ttmldocument)
    {
        List list;
        Iterator iterator2;
label0:
        {
            prepareLayout();
            Iterator iterator = ttmldocument.getStyles().entrySet().iterator();
            if (iterator != null && iterator.hasNext())
            {
                j = new Span((StyledElement)((java.util.Map.Entry)iterator.next()).getValue());
                k = j.getID();
            }
            list = ttmldocument.getCaptions();
            if (list != null && list.size() > 0)
            {
                if (i.getClosedCaptioningController().isCaptioningEnabled())
                {
                    setMode(ClosedCaptioningMode.ON);
                    a();
                }
                a(true);
                if (b.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator1 = b.keySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    int i1 = ((Integer)iterator1.next()).intValue();
                    TimeMapEntry timemapentry = (TimeMapEntry)b.get(Integer.valueOf(i1));
                    if (timemapentry != null && timemapentry.block != null)
                    {
                        removeView(timemapentry.block);
                    }
                } while (true);
            } else
            {
                a(false);
                return;
            }
            b.clear();
        }
        iterator2 = list.iterator();
_L15:
        if (!iterator2.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj;
        BrightcoveClosedCaption brightcoveclosedcaption;
        LinearLayout linearlayout;
        BrightcoveClosedCaptioningTextView brightcoveclosedcaptioningtextview;
        SpannableStringBuilder spannablestringbuilder;
        Span span;
        int j1;
        int k1;
        brightcoveclosedcaption = (BrightcoveClosedCaption)iterator2.next();
        linearlayout = (LinearLayout)f.inflate(com.brightcove.player.R.layout.caption_block, null);
        k1 = b(brightcoveclosedcaption);
        Object obj1 = brightcoveclosedcaption.getRegion();
        obj = ttmldocument.getRegions();
        List list1;
        if (!StringUtil.isEmpty(((String) (obj1))) && ((Map) (obj)).containsKey(obj1))
        {
            obj = (Region)((Map) (obj)).get(obj1);
        } else
        {
label1:
            {
                if (ttmldocument.getBody() == null)
                {
                    break label1;
                }
                String s = ttmldocument.getBody().getRegion();
                if (StringUtil.isEmpty(s) || !((Map) (obj)).containsKey(s))
                {
                    break label1;
                }
                obj = (Region)((Map) (obj)).get(s);
            }
        }
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1118;
        }
        obj = ((Region) (obj)).getDisplayAlign();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1118;
        }
        if (obj == com.brightcove.player.model.Region.DisplayAlign.BEFORE)
        {
            j1 = 48;
        } else
        {
            if (obj != com.brightcove.player.model.Region.DisplayAlign.AFTER)
            {
                break MISSING_BLOCK_LABEL_1118;
            }
            j1 = 80;
        }
_L16:
        obj = a(linearlayout);
        obj.gravity = j1 | k1;
        linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        linearlayout.setVisibility(8);
        obj1 = brightcoveclosedcaption.getLines().iterator();
_L14:
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_1038;
            }
            list1 = (List)((Iterator) (obj1)).next();
        } while (list1.size() == 0);
        brightcoveclosedcaptioningtextview = (BrightcoveClosedCaptioningTextView)linearlayout.findViewById(com.brightcove.player.R.id.caption_text);
        spannablestringbuilder = new SpannableStringBuilder();
        j1 = 0;
_L4:
        if (j1 >= list1.size())
        {
            break MISSING_BLOCK_LABEL_962;
        }
        span = (Span)list1.get(j1);
        if (brightcoveclosedcaption.getStyleName() == null || brightcoveclosedcaption.getStyleName().equals(k))
        {
            span.setFontSize(j.getFontSize());
            span.setFontStyle(j.getFontStyle());
            span.setColor(j.getColor());
            span.setBackgroundColor(j.getBackgroundColor());
        }
        if (!StringUtil.isEmpty(span.getText()))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = "";
_L12:
        spannablestringbuilder.append(((CharSequence) (obj)));
        j1++;
        if (true) goto _L4; else goto _L3
        obj = null;
          goto _L5
_L3:
        int l1;
        obj = new SpannableString(span.getText());
        l1 = span.getText().length();
        if (span.getFontStyle() == null) goto _L7; else goto _L6
_L6:
        static final class _cls9
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[com.brightcove.player.model.StyledElement.TextDecoration.values().length];
                try
                {
                    c[com.brightcove.player.model.StyledElement.TextDecoration.UNDERLINE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                b = new int[com.brightcove.player.model.StyledElement.FontWeight.values().length];
                try
                {
                    b[com.brightcove.player.model.StyledElement.FontWeight.BOLD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                a = new int[com.brightcove.player.model.StyledElement.FontStyle.values().length];
                try
                {
                    a[com.brightcove.player.model.StyledElement.FontStyle.ITALIC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls9.a[span.getFontStyle().ordinal()];
        JVM INSTR tableswitch 1 1: default 696
    //                   1 899;
           goto _L7 _L8
_L7:
        if (span.getFontWeight() == null) goto _L10; else goto _L9
_L9:
        _cls9.b[span.getFontWeight().ordinal()];
        JVM INSTR tableswitch 1 1: default 736
    //                   1 921;
           goto _L10 _L11
_L10:
        if (span.getTextDecoration() != null)
        {
            switch (_cls9.c[span.getTextDecoration().ordinal()])
            {
            case 1: // '\001'
                break MISSING_BLOCK_LABEL_943;
            }
        }
_L13:
        if (!StringUtil.isEmpty(span.getColor()))
        {
            ((SpannableString) (obj)).setSpan(new ForegroundColorSpan(Color.parseColor(span.getColor())), 0, l1, 33);
        }
        if (!StringUtil.isEmpty(span.getBackgroundColor()))
        {
            ((SpannableString) (obj)).setSpan(new BackgroundColorSpan(Color.parseColor(span.getBackgroundColor())), 0, l1, 33);
        }
        if (span.getFontSize() != null)
        {
            ((SpannableString) (obj)).setSpan(new AbsoluteSizeSpan((int)span.getFontSize().getValue()), 0, l1, 33);
        }
        ((SpannableString) (obj)).setSpan(new RelativeSizeSpan(1.0F), 0, l1, 33);
          goto _L12
_L8:
        ((SpannableString) (obj)).setSpan(new StyleSpan(com.brightcove.player.R.style.caption_text_italic), 0, l1, 33);
          goto _L7
_L11:
        ((SpannableString) (obj)).setSpan(new StyleSpan(com.brightcove.player.R.style.caption_text_bold), 0, l1, 33);
          goto _L10
        ((SpannableString) (obj)).setSpan(new UnderlineSpan(), 0, l1, 33);
          goto _L13
        brightcoveclosedcaptioningtextview.setText(StringUtil.replaceAll(spannablestringbuilder, new String[] {
            "\n", "\r", "\t", "  "
        }, new CharSequence[] {
            " ", " ", " ", " "
        }));
        brightcoveclosedcaptioningtextview.setGravity(k1);
          goto _L14
        if (linearlayout.getChildCount() > 0)
        {
            addView(linearlayout);
            b.put(Integer.valueOf(brightcoveclosedcaption.getBeginTime()), new TimeMapEntry(brightcoveclosedcaption, linearlayout));
        }
          goto _L15
_L2:
        ttmldocument = (BrightcoveClosedCaption)list.get(list.size() - 1);
        b.put(Integer.valueOf(ttmldocument.getEndTime()), null);
        return;
        j1 = 80;
          goto _L16
    }

    public void prepareLayout()
    {
        LayoutInflater layoutinflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
        new android.widget.LinearLayout.LayoutParams(-1, -2);
        c = (LinearLayout)layoutinflater.inflate(com.brightcove.player.R.layout.caption_block, null);
        c.setVisibility(8);
    }

    public void prepareWebVTTCaptions(WebVTTDocument webvttdocument)
    {
label0:
        {
            prepareLayout();
            webvttdocument = webvttdocument.getCaptions();
            if (webvttdocument != null && webvttdocument.size() > 0)
            {
                if (i.getClosedCaptioningController().isCaptioningEnabled())
                {
                    setMode(ClosedCaptioningMode.ON);
                    a();
                }
                a(true);
                if (b.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator = b.keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    int i1 = ((Integer)iterator.next()).intValue();
                    TimeMapEntry timemapentry = (TimeMapEntry)b.get(Integer.valueOf(i1));
                    if (timemapentry != null && timemapentry.block != null)
                    {
                        removeView(timemapentry.block);
                    }
                } while (true);
            } else
            {
                a(false);
                return;
            }
            b.clear();
        }
        Iterator iterator1 = webvttdocument.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            BrightcoveClosedCaption brightcoveclosedcaption = (BrightcoveClosedCaption)iterator1.next();
            ViewGroup viewgroup = a(brightcoveclosedcaption);
            if (viewgroup.getChildCount() > 0)
            {
                addView(viewgroup);
                b.put(Integer.valueOf(brightcoveclosedcaption.getBeginTime()), new TimeMapEntry(brightcoveclosedcaption, viewgroup));
            }
        } while (true);
        webvttdocument = (BrightcoveClosedCaption)webvttdocument.get(webvttdocument.size() - 1);
        b.put(Integer.valueOf(webvttdocument.getEndTime()), null);
    }

    public void refreshCaptions()
    {
        if (h != -1)
        {
            a(h);
        }
    }

    public void refreshCaptions(int i1)
    {
        if (i1 != -1)
        {
            a(i1);
        }
    }

    public void setMode(ClosedCaptioningMode closedcaptioningmode)
    {
        e = closedcaptioningmode;
    }

}
