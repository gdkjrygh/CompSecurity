// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.taplytics:
//            ci, gs

public final class cr
{

    private static cr a;
    private static int b = 0;
    private static HashMap c = new HashMap();
    private static HashMap d = new HashMap();
    private static HashSet e = new HashSet();
    private static final List f = Arrays.asList(new String[] {
        "AnalogClock", "ImageView", "KeyboardView", "MediaRouteButton", "ProgressBar", "Space", "SurfaceView", "TextView", "TextureView", "ViewGroup", 
        "ViewStub", "AbsListView", "AbsSeekBar", "AbsSpinner", "AbsoluteLayout", "AdapterView", "AdapterViewAnimator", "AdapterViewFlipper", "AppWidgetHostView", "AutoCompleteTextView", 
        "Button", "CalendarView", "CheckBox", "CheckedTextView", "Chronometer", "CompoundButton", "ContentLoadingProgressBar", "DatePicker", "DialerFilter", "DigitalClock", 
        "DrawerLayout", "EditText", "ExpandableListView", "ExtractEditText", "FragmentBreadCrumbs", "FragmentTabHost", "FrameLayout", "GLSurfaceView", "Gallery", "GestureOverlayView", 
        "GridLayout", "GridView", "HorizontalScrollView", "ImageButton", "ImageSwitcher", "LinearLayout", "ListView", "MediaController", "MultiAutoCompleteTextView", "NumberPicker", 
        "PagerTabStrip", "PagerTitleStrip", "QuickContactBadge", "RadioButton", "RadioGroup", "RatingBar", "RelativeLayout", "ScrollView", "SearchView", "SeekBar", 
        "SlidingDrawer", "SlidingPaneLayout", "Spinner", "StackView", "SwipeRefreshLayout", "Switch", "TabHost", "TabWidget", "TableLayout", "TableRow", 
        "TextClock", "TimePicker", "ToggleButton", "TwoLineListItem", "VideoView", "ViewAnimator", "ViewFlipper", "ViewFlipper", "ViewPager", "WebView", 
        "ZoomButton", "ZoomControls", "View"
    });
    private static final HashSet g = new HashSet(Arrays.asList(new String[] {
        "setAlpha", "setHapticFeedbackEnabled", "setVisibility", "setPadding", "setWidth", "setHeight", "setBackgroundColor", "setBackgroundDrawable"
    }));
    private static final HashSet h = new HashSet(Arrays.asList(new String[] {
        "getAlpha", "isHapticFeedbackEnabled", "getVisibility", "getWidth", "getHeight", "getPaddingLeft", "getPaddingTop", "getPaddingRight", "getPaddingBottom", "getBackground"
    }));
    private static final HashSet i = new HashSet(Arrays.asList(new String[] {
        "setText", "setHint", "setLineSpacing", "setMaxLines", "setTextSize", "setGravity"
    }));
    private static final HashSet j = new HashSet(Arrays.asList(new String[] {
        "getText", "getHint", "getLineSpacingExtra", "getMaxLines", "getTextSize", "getGravity"
    }));
    private static final HashSet k = new HashSet(Arrays.asList(new String[] {
        "setImageAlpha", "setScaleType", "setImageDrawable"
    }));
    private static final HashSet l = new HashSet(Arrays.asList(new String[] {
        "getImageAlpha", "getScaleType", "getDrawable"
    }));

    private cr()
    {
        try
        {
            String s = ci.b().u.getPackageName();
            b = ci.b().u.getPackageManager().getApplicationInfo(s, 128).icon;
        }
        catch (Exception exception)
        {
            gs.c("error setting ");
        }
        e = new HashSet(f);
        c.put("View", g);
        d.put("View", h);
        i.addAll(g);
        c.put("TextView", i);
        j.addAll(h);
        d.put("TextView", j);
        k.addAll(g);
        c.put("ImageView", k);
        l.addAll(h);
        d.put("ImageView", l);
    }

    public static cr a()
    {
        if (a != null)
        {
            return a;
        } else
        {
            cr cr1 = new cr();
            a = cr1;
            return cr1;
        }
    }

    public static HashMap b()
    {
        return c;
    }

    public static HashMap c()
    {
        return d;
    }

    public static HashSet d()
    {
        return e;
    }

}
