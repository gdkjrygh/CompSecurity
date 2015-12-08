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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.brightcove.player.captioning.BrightcoveClosedCaption;
import com.brightcove.player.captioning.BrightcoveClosedCaptioningTextView;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.event.Component;
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
//            w, x, y, z, 
//            aa, ab, ac, BaseVideoView

public class BrightcoveClosedCaptioningView extends FrameLayout
    implements Component
{

    public static final int DEFAULT_HORIZONTAL_GRAVITY = 17;
    public static final int DEFAULT_VERTICAL_GRAVITY = 80;
    protected static final String a = com/brightcove/player/view/BrightcoveClosedCaptioningView.getSimpleName();
    protected EventEmitter b;
    protected ClosedCaptioningMode c;
    protected LayoutInflater d;
    protected TreeMap e;
    protected LinearLayout f;
    protected android.widget.LinearLayout.LayoutParams g;
    protected int h;
    protected int i;
    protected BaseVideoView j;
    protected Span k;
    protected String l;
    protected EventListener m;
    protected EventListener n;
    protected EventListener o;
    protected EventListener p;
    private EventListener q;
    private EventListener r;

    public BrightcoveClosedCaptioningView(Context context)
    {
        super(context);
        h = -1;
        i = 0;
        m = new w(this);
        n = new x(this);
        o = new y(this);
        p = new z(this);
        q = new aa(this);
        r = new ab(this);
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = -1;
        i = 0;
        m = new w(this);
        n = new x(this);
        o = new y(this);
        p = new z(this);
        q = new aa(this);
        r = new ab(this);
    }

    public BrightcoveClosedCaptioningView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        h = -1;
        i = 0;
        m = new w(this);
        n = new x(this);
        o = new y(this);
        p = new z(this);
        q = new aa(this);
        r = new ab(this);
    }

    protected int a(BrightcoveClosedCaption brightcoveclosedcaption)
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

    protected int a(BrightcoveClosedCaption brightcoveclosedcaption, TTMLDocument ttmldocument)
    {
        byte byte1 = 80;
        brightcoveclosedcaption = a(((Block) (brightcoveclosedcaption)), ttmldocument);
        byte byte0 = byte1;
        if (brightcoveclosedcaption != null)
        {
            brightcoveclosedcaption = brightcoveclosedcaption.getDisplayAlign();
            byte0 = byte1;
            if (brightcoveclosedcaption != null)
            {
                if (brightcoveclosedcaption == com.brightcove.player.model.Region.DisplayAlign.BEFORE)
                {
                    byte0 = 48;
                } else
                {
                    byte0 = byte1;
                    if (brightcoveclosedcaption == com.brightcove.player.model.Region.DisplayAlign.AFTER)
                    {
                        return 80;
                    }
                }
            }
        }
        return byte0;
    }

    protected int a(BrightcoveClosedCaption brightcoveclosedcaption, WebVTTDocument webvttdocument)
    {
        return 80;
    }

    protected ViewGroup a(ViewGroup viewgroup)
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

    protected ViewGroup a(TTMLDocument ttmldocument, BrightcoveClosedCaption brightcoveclosedcaption)
    {
        LinearLayout linearlayout = (LinearLayout)d.inflate(com.brightcove.player.R.layout.caption_block, null);
        int j1 = a(brightcoveclosedcaption);
        a(linearlayout, ttmldocument, brightcoveclosedcaption, j1);
        linearlayout.setVisibility(8);
        ttmldocument = brightcoveclosedcaption.getLines().iterator();
        do
        {
            if (!ttmldocument.hasNext())
            {
                break;
            }
            List list = (List)ttmldocument.next();
            if (list.size() != 0)
            {
                BrightcoveClosedCaptioningTextView brightcoveclosedcaptioningtextview = (BrightcoveClosedCaptioningTextView)linearlayout.findViewById(com.brightcove.player.R.id.caption_text);
                SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
                for (int i1 = 0; i1 < list.size(); i1++)
                {
                    Span span = (Span)list.get(i1);
                    if (brightcoveclosedcaption.getStyleName() == null || brightcoveclosedcaption.getStyleName().equals(l))
                    {
                        span.setFontSize(k.getFontSize());
                        span.setFontStyle(k.getFontStyle());
                        span.setColor(k.getColor());
                        span.setBackgroundColor(k.getBackgroundColor());
                    }
                    spannablestringbuilder.append(a(span));
                }

                brightcoveclosedcaptioningtextview.setText(a(((CharSequence) (spannablestringbuilder))));
                brightcoveclosedcaptioningtextview.setGravity(j1);
            }
        } while (true);
        return linearlayout;
    }

    protected ViewGroup a(WebVTTDocument webvttdocument, BrightcoveClosedCaption brightcoveclosedcaption)
    {
        LinearLayout linearlayout = (LinearLayout)d.inflate(com.brightcove.player.R.layout.caption_block, null);
        int i1 = a(brightcoveclosedcaption);
        a(linearlayout, webvttdocument, brightcoveclosedcaption, i1);
        linearlayout.setVisibility(8);
        webvttdocument = (BrightcoveClosedCaptioningTextView)linearlayout.findViewById(com.brightcove.player.R.id.caption_text);
        webvttdocument.setText(Html.fromHtml(brightcoveclosedcaption.getCaption()));
        webvttdocument.setGravity(i1);
        return linearlayout;
    }

    protected android.widget.FrameLayout.LayoutParams a(View view)
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

    protected Region a(Block block, TTMLDocument ttmldocument)
    {
        String s = block.getRegion();
        block = ttmldocument.getRegions();
        if (!StringUtil.isEmpty(s) && block.containsKey(s))
        {
            return (Region)block.get(s);
        }
        if (ttmldocument.getBody() != null)
        {
            ttmldocument = ttmldocument.getBody().getRegion();
            if (!StringUtil.isEmpty(ttmldocument) && block.containsKey(ttmldocument))
            {
                return (Region)block.get(ttmldocument);
            }
        }
        return null;
    }

    protected CharSequence a(Span span)
    {
        SpannableString spannablestring;
        int i1;
        if (StringUtil.isEmpty(span.getText()))
        {
            return "";
        }
        spannablestring = new SpannableString(span.getText());
        i1 = span.getText().length();
        if (span.getFontStyle() == null) goto _L2; else goto _L1
_L1:
        ac.a[span.getFontStyle().ordinal()];
        JVM INSTR tableswitch 1 1: default 72
    //                   1 256;
           goto _L2 _L3
_L2:
        if (span.getFontWeight() == null) goto _L5; else goto _L4
_L4:
        ac.b[span.getFontWeight().ordinal()];
        JVM INSTR tableswitch 1 1: default 108
    //                   1 277;
           goto _L5 _L6
_L5:
        if (span.getTextDecoration() != null)
        {
            switch (ac.c[span.getTextDecoration().ordinal()])
            {
            case 1: // '\001'
                break MISSING_BLOCK_LABEL_298;
            }
        }
_L7:
        if (!StringUtil.isEmpty(span.getColor()))
        {
            spannablestring.setSpan(new ForegroundColorSpan(Color.parseColor(span.getColor())), 0, i1, 33);
        }
        if (!StringUtil.isEmpty(span.getBackgroundColor()))
        {
            spannablestring.setSpan(new BackgroundColorSpan(Color.parseColor(span.getBackgroundColor())), 0, i1, 33);
        }
        if (span.getFontSize() != null)
        {
            spannablestring.setSpan(new AbsoluteSizeSpan((int)span.getFontSize().getValue()), 0, i1, 33);
        }
        spannablestring.setSpan(new RelativeSizeSpan(1.0F), 0, i1, 33);
        return spannablestring;
_L3:
        spannablestring.setSpan(new StyleSpan(com.brightcove.player.R.style.caption_text_italic), 0, i1, 33);
          goto _L2
_L6:
        spannablestring.setSpan(new StyleSpan(com.brightcove.player.R.style.caption_text_bold), 0, i1, 33);
          goto _L5
        spannablestring.setSpan(new UnderlineSpan(), 0, i1, 33);
          goto _L7
    }

    protected CharSequence a(CharSequence charsequence)
    {
        return StringUtil.replaceAll(charsequence, new String[] {
            "\n", "\r", "\t", "  "
        }, new CharSequence[] {
            " ", " ", " ", " "
        });
    }

    protected void a()
    {
        if (h == -1)
        {
            h = b.on("progress", m);
        }
    }

    void a(int i1)
    {
label0:
        {
            if (isEnabled() && getMode() == ClosedCaptioningMode.ON)
            {
                i = i1;
                if (i1 != -1)
                {
                    break label0;
                }
            }
            return;
        }
        ViewGroup viewgroup = findCaptionForPosition(i1);
        if (f != null)
        {
            f.setVisibility(8);
        }
        if (viewgroup != null)
        {
            viewgroup.setVisibility(0);
            viewgroup.invalidate();
        }
        f = (LinearLayout)viewgroup;
    }

    protected void a(LinearLayout linearlayout, TTMLDocument ttmldocument, BrightcoveClosedCaption brightcoveclosedcaption, int i1)
    {
        int j1 = a(brightcoveclosedcaption, ttmldocument);
        ttmldocument = a(((View) (linearlayout)));
        ttmldocument.gravity = j1 | i1;
        linearlayout.setLayoutParams(ttmldocument);
    }

    protected void a(LinearLayout linearlayout, WebVTTDocument webvttdocument, BrightcoveClosedCaption brightcoveclosedcaption, int i1)
    {
        int j1 = a(brightcoveclosedcaption, webvttdocument);
        webvttdocument = a(((View) (linearlayout)));
        webvttdocument.gravity = j1 | i1;
        linearlayout.setLayoutParams(webvttdocument);
    }

    protected void a(boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("boolean", Boolean.valueOf(flag));
        b.emit("captionsAvailable", hashmap);
    }

    protected void b()
    {
        if (h != -1)
        {
            b.off("progress", h);
            h = -1;
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
        if (e != null && e.size() > 0)
        {
            e.clear();
        }
    }

    public ViewGroup findCaptionForPosition(int i1)
    {
        java.util.Map.Entry entry = e.floorEntry(Integer.valueOf(i1));
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
        return c;
    }

    public int getSafeAreaMarginHeight()
    {
        int i1 = 0;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams != null)
        {
            i1 = layoutparams.height;
        }
        int j1 = i1;
        if (i1 <= 0)
        {
            j1 = getHeight();
        }
        return Math.round((float)j1 * 0.1F);
    }

    public int getSafeAreaMarginWidth()
    {
        int i1 = 0;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams != null)
        {
            i1 = layoutparams.width;
        }
        int j1 = i1;
        if (i1 <= 0)
        {
            j1 = getWidth();
        }
        return Math.round((float)j1 * 0.1F);
    }

    public void initialize(EventEmitter eventemitter)
    {
        initialize(eventemitter, null);
    }

    public void initialize(EventEmitter eventemitter, BaseVideoView basevideoview)
    {
        b = RegisteringEventEmitter.build(eventemitter, getClass());
        d = (LayoutInflater)getContext().getSystemService("layout_inflater");
        e = new TreeMap();
        b.on("didLoadClosedCaptions", n);
        b.on("setCaptionsState", o);
        b.on("toggleClosedCaptions", p);
        b.on("didShowMediaControls", q);
        b.on("didHideMediaControls", r);
        j = basevideoview;
        if (j.getClosedCaptioningController().isCaptioningEnabled())
        {
            c = ClosedCaptioningMode.ON;
            return;
        } else
        {
            c = ClosedCaptioningMode.OFF;
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
    }

    public void prepareDFXPCaptions(TTMLDocument ttmldocument)
    {
        Object obj;
label0:
        {
            prepareLayout();
            obj = ttmldocument.getStyles().entrySet().iterator();
            if (obj != null && ((Iterator) (obj)).hasNext())
            {
                k = new Span((StyledElement)((java.util.Map.Entry)((Iterator) (obj)).next()).getValue());
                l = k.getID();
            }
            obj = ttmldocument.getCaptions();
            if (obj != null && ((List) (obj)).size() > 0)
            {
                if (j.getClosedCaptioningController().isCaptioningEnabled())
                {
                    setMode(ClosedCaptioningMode.ON);
                    a();
                }
                a(true);
                if (e.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator = e.keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    int i1 = ((Integer)iterator.next()).intValue();
                    TimeMapEntry timemapentry = (TimeMapEntry)e.get(Integer.valueOf(i1));
                    if (timemapentry != null && timemapentry.block != null)
                    {
                        removeView(timemapentry.block);
                    }
                } while (true);
            } else
            {
                Log.w(a, "No captions found, cannot prepare captions for this video");
                a(false);
                return;
            }
            e.clear();
        }
        Iterator iterator1 = ((List) (obj)).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            BrightcoveClosedCaption brightcoveclosedcaption = (BrightcoveClosedCaption)iterator1.next();
            ViewGroup viewgroup = a(ttmldocument, brightcoveclosedcaption);
            if (viewgroup.getChildCount() > 0)
            {
                addView(viewgroup);
                e.put(Integer.valueOf(brightcoveclosedcaption.getBeginTime()), new TimeMapEntry(brightcoveclosedcaption, viewgroup));
            }
        } while (true);
        ttmldocument = (BrightcoveClosedCaption)((List) (obj)).get(((List) (obj)).size() - 1);
        e.put(Integer.valueOf(ttmldocument.getEndTime()), null);
    }

    public void prepareLayout()
    {
        LayoutInflater layoutinflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
        g = new android.widget.LinearLayout.LayoutParams(-1, -2);
        f = (LinearLayout)layoutinflater.inflate(com.brightcove.player.R.layout.caption_block, null);
        f.setVisibility(8);
    }

    public void prepareWebVTTCaptions(WebVTTDocument webvttdocument)
    {
        List list;
label0:
        {
            prepareLayout();
            list = webvttdocument.getCaptions();
            if (list != null && list.size() > 0)
            {
                if (j.getClosedCaptioningController().isCaptioningEnabled())
                {
                    setMode(ClosedCaptioningMode.ON);
                    a();
                }
                a(true);
                if (e.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator = e.keySet().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    int i1 = ((Integer)iterator.next()).intValue();
                    TimeMapEntry timemapentry = (TimeMapEntry)e.get(Integer.valueOf(i1));
                    if (timemapentry != null && timemapentry.block != null)
                    {
                        removeView(timemapentry.block);
                    }
                } while (true);
            } else
            {
                Log.w(a, "No captions found, cannot prepare captions for this video");
                a(false);
                return;
            }
            e.clear();
        }
        Iterator iterator1 = list.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            BrightcoveClosedCaption brightcoveclosedcaption = (BrightcoveClosedCaption)iterator1.next();
            ViewGroup viewgroup = a(webvttdocument, brightcoveclosedcaption);
            if (viewgroup.getChildCount() > 0)
            {
                addView(viewgroup);
                e.put(Integer.valueOf(brightcoveclosedcaption.getBeginTime()), new TimeMapEntry(brightcoveclosedcaption, viewgroup));
            }
        } while (true);
        webvttdocument = (BrightcoveClosedCaption)list.get(list.size() - 1);
        e.put(Integer.valueOf(webvttdocument.getEndTime()), null);
    }

    public void refreshCaptions()
    {
        if (i != -1)
        {
            a(i);
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
        c = closedcaptioningmode;
    }


    private class ClosedCaptioningMode extends Enum
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


    private class TimeMapEntry
    {

        final BrightcoveClosedCaptioningView a;
        public ViewGroup block;
        public BrightcoveClosedCaption closedCaption;

        public TimeMapEntry(BrightcoveClosedCaption brightcoveclosedcaption, ViewGroup viewgroup)
        {
            a = BrightcoveClosedCaptioningView.this;
            super();
            closedCaption = brightcoveclosedcaption;
            block = viewgroup;
        }
    }

}
