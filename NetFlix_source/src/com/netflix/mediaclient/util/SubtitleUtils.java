// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.player.subtitles.ColorMapping;
import com.netflix.mediaclient.service.player.subtitles.DoubleLength;
import com.netflix.mediaclient.service.player.subtitles.FontFamilyMapping;
import com.netflix.mediaclient.service.player.subtitles.HorizontalAlignment;
import com.netflix.mediaclient.service.player.subtitles.Outline;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.player.subtitles.VerticalAlignment;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.netflix.mediaclient.util:
//            ViewUtils, StringUtils

public final class SubtitleUtils
{
    public static class Margins
    {

        public int bottom;
        public int left;
        public int right;
        public int top;

        public Margins()
        {
        }
    }


    private static final Pattern CELL_PATTERN = Pattern.compile("^[0-9]{1,2}c$");
    private static final int MILLISECONDS_PER_SECOND = 1000;
    private static final Pattern PERCENT_PATTERN = Pattern.compile("^[0-9]*[.]?[0-9]*%$");
    private static final String TAG = "nf_subtitles_render";
    private static final Pattern TICK_MS_PATTERN = Pattern.compile("^([0-9.]+)ms$");
    private static final Pattern TICK_SEC_PATTERN = Pattern.compile("^([0-9.]+)s$");
    private static final Pattern TICK_TIME_PATTERN = Pattern.compile("^([0-9]+):([0-9]+):([0-9.]+)$");
    private static final Pattern TICK_T_PATTERN = Pattern.compile("^([0-9.]+)t$");

    private SubtitleUtils()
    {
    }

    public static int adjustIfIntersectByMovingFirstUp(LinearLayout linearlayout, LinearLayout linearlayout1)
    {
        Rect rect = ViewUtils.getRect(linearlayout, true);
        linearlayout1 = ViewUtils.getRect(linearlayout1, true);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Block 1  left: ").append(rect.left).append(", top: ").append(rect.top).append(", right: ").append(rect.right).append(", bottom: ").append(rect.bottom).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Block 2  left: ").append(((Rect) (linearlayout1)).left).append(", top: ").append(((Rect) (linearlayout1)).top).append(", right: ").append(((Rect) (linearlayout1)).right).append(", bottom: ").append(((Rect) (linearlayout1)).bottom).toString());
        }
        linearlayout1 = getOverlap(rect, linearlayout1);
        if (linearlayout1 == null)
        {
            Log.d("nf_subtitles_render", "===> No intersection found");
            return 0;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("===> intersection found, move by: ").append(linearlayout1).toString());
        }
        byte byte0 = 1;
        int j = ((Point) (linearlayout1)).y;
        int k = rect.top - j;
        int i = j;
        if (k < 0)
        {
            Log.w("nf_subtitles_render", "We hit top. Set top to 0");
            i = j + k;
            byte0 = -1;
        }
        rect.top = rect.top - i;
        rect.bottom = rect.bottom - i;
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("After move: Block 1 left: ").append(rect.left).append(", top: ").append(rect.top).append(", right: ").append(rect.right).append(", bottom: ").append(rect.bottom).toString());
        }
        linearlayout1 = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
        linearlayout1.setMargins(rect.left, rect.top, 0, 0);
        linearlayout.setLayoutParams(linearlayout1);
        return byte0;
    }

    public static boolean adjustIfIntersectByMovingSecondDown(LinearLayout linearlayout, LinearLayout linearlayout1, int i)
    {
        Object obj = ViewUtils.getRect(linearlayout, true);
        linearlayout = ViewUtils.getRect(linearlayout1, true);
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Block 1  left: ").append(((Rect) (obj)).left).append(", top: ").append(((Rect) (obj)).top).append(", right: ").append(((Rect) (obj)).right).append(", bottom: ").append(((Rect) (obj)).bottom).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Block 2  left: ").append(((Rect) (linearlayout)).left).append(", top: ").append(((Rect) (linearlayout)).top).append(", right: ").append(((Rect) (linearlayout)).right).append(", bottom: ").append(((Rect) (linearlayout)).bottom).toString());
        }
        obj = getOverlap(((Rect) (obj)), linearlayout);
        if (obj == null)
        {
            Log.d("nf_subtitles_render", "===> No intersection found");
            return false;
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("===> intersection found, move by: ").append(obj).toString());
        }
        int k = ((Point) (obj)).y;
        int l = ((Rect) (linearlayout)).bottom + k;
        int j = k;
        if (l > i)
        {
            Log.w("nf_subtitles_render", (new StringBuilder()).append("We hit bottom. Set bottom to ").append(i).toString());
            j = (k - l) + i;
        }
        linearlayout.top = ((Rect) (linearlayout)).top + j;
        linearlayout.bottom = ((Rect) (linearlayout)).bottom + j;
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("After move: Block 2 left: ").append(((Rect) (linearlayout)).left).append(", top: ").append(((Rect) (linearlayout)).top).append(", right: ").append(((Rect) (linearlayout)).right).append(", bottom: ").append(((Rect) (linearlayout)).bottom).toString());
        }
        obj = (android.widget.RelativeLayout.LayoutParams)linearlayout1.getLayoutParams();
        ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(((Rect) (linearlayout)).left, ((Rect) (linearlayout)).top, 0, 0);
        linearlayout1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        return true;
    }

    public static Rect createRegionForRectangle(View view, DoubleLength doublelength, DoubleLength doublelength1)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("Display area can not be null");
        }
        int j = 0;
        int i = 0;
        Rect rect = new Rect();
        if (doublelength != null)
        {
            j = (int)((float)view.getWidth() * doublelength.getFirstLength());
            i = (int)((float)view.getHeight() * doublelength.getSecondLength());
        } else
        {
            Log.w("nf_subtitles_render", "Extent is null!");
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Display area: w ").append(view.getWidth()).append(", h ").append(view.getHeight()).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Region w/h ").append(j).append("/").append(i).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Extent ").append(doublelength).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Origin ").append(doublelength1).toString());
        }
        if (doublelength1 != null)
        {
            rect.left = (int)((float)view.getWidth() * doublelength1.getFirstLength());
            rect.top = (int)((float)view.getHeight() * doublelength1.getSecondLength());
            rect.right = rect.left + j;
            rect.bottom = rect.top + i;
        } else
        {
            Log.w("nf_subtitles_render", "Origin is null!");
        }
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Rectangle, left: ").append(rect.left).append(", top: ").append(rect.top).append(", right: ").append(rect.right).append(", bottom: ").append(rect.bottom).toString());
        }
        return rect;
    }

    public static Integer getBackgroundColor(TextStyle textstyle, TextStyle textstyle1)
    {
        if (textstyle1 == null)
        {
            return ColorMapping.resolveColor(textstyle.getBackgroundOpacity(), textstyle.getBackgroundColor());
        } else
        {
            return ColorMapping.resolveColor(textstyle1.getBackgroundOpacity(), textstyle1.getBackgroundColor());
        }
    }

    public static Integer getEdgeColor(Outline outline, TextStyle textstyle)
    {
        Object obj = null;
        if (textstyle == null || textstyle.getOutline() == null)
        {
            textstyle = obj;
            if (outline != null)
            {
                textstyle = ColorMapping.resolveColor(null, outline.getEdgeColor());
            }
            return textstyle;
        } else
        {
            return ColorMapping.resolveColor(null, textstyle.getOutline().getEdgeColor());
        }
    }

    public static float getFontSizeMultiplier(TextStyle textstyle, TextStyle textstyle1)
    {
        float f;
        float f1;
        if (textstyle1 == null)
        {
            if (textstyle.getFontSize() != null)
            {
                f = (float)textstyle.getFontSize().intValue() / 100F;
            } else
            {
                f = 1.0F;
            }
        } else
        if (textstyle1.getFontSize() != null)
        {
            f = (float)textstyle1.getFontSize().intValue() / 100F;
        } else
        {
            f = 1.0F;
        }
        f1 = f;
        if (f <= 0.0F)
        {
            f1 = 1.0F;
        }
        return f1;
    }

    public static Margins getMarginsForRectangle(View view, DoubleLength doublelength, DoubleLength doublelength1)
    {
        if (view == null)
        {
            throw new IllegalArgumentException("Display area can not be null");
        }
        int j = 0;
        int i = 0;
        Margins margins = new Margins();
        if (doublelength != null)
        {
            j = (int)((float)view.getWidth() * doublelength.getFirstLength());
            i = (int)((float)view.getHeight() * doublelength.getSecondLength());
        } else
        {
            Log.w("nf_subtitles_render", "Extent is null!");
        }
        if (Log.isLoggable("nf_subtitles_render", 3))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Display area: w ").append(view.getWidth()).append(", h ").append(view.getHeight()).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Region w/h ").append(j).append("/").append(i).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Extent ").append(doublelength).toString());
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Origin ").append(doublelength1).toString());
        }
        if (doublelength1 != null)
        {
            margins.left = (int)((float)view.getWidth() * doublelength1.getFirstLength());
            margins.top = (int)((float)view.getHeight() * doublelength1.getSecondLength());
            margins.right = view.getWidth() - margins.left - j;
            margins.bottom = view.getHeight() - margins.top - i;
        } else
        {
            Log.w("nf_subtitles_render", "Origin is null!");
        }
        if (Log.isLoggable("nf_subtitles_render", 2))
        {
            Log.d("nf_subtitles_render", (new StringBuilder()).append("Margins, left: ").append(margins.left).append(", top: ").append(margins.top).append(", right: ").append(margins.right).append(", bottom: ").append(margins.bottom).toString());
        }
        return margins;
    }

    public static Point getOverlap(Rect rect, Rect rect1)
    {
        if (!Rect.intersects(rect, rect1))
        {
            return null;
        } else
        {
            rect = intersection(rect, rect1);
            rect1 = new Point();
            rect1.x = 0;
            rect1.y = rect.height();
            return rect1;
        }
    }

    public static Integer getTextColor(TextStyle textstyle, TextStyle textstyle1)
    {
        if (textstyle1 != null)
        {
            textstyle1 = ColorMapping.resolveColor(textstyle1.getOpacity(), textstyle1.getColor());
            if (textstyle1 != null)
            {
                return textstyle1;
            }
            Log.e("nf_subtitles_render", "User override exist, but color is null! Use node text color.");
        }
        return ColorMapping.resolveColor(textstyle.getOpacity(), textstyle.getColor());
    }

    public static Integer getWindowColor(TextStyle textstyle, TextStyle textstyle1)
    {
        if (textstyle1 == null)
        {
            return ColorMapping.resolveColor(textstyle.getWindowOpacity(), textstyle.getWindowColor());
        } else
        {
            return ColorMapping.resolveColor(textstyle1.getWindowOpacity(), textstyle1.getWindowColor());
        }
    }

    public static Rect intersection(Rect rect, Rect rect1)
    {
        return new Rect(Math.max(rect.left, rect1.left), Math.max(rect.top, rect1.top), Math.min(rect.right, rect1.right), Math.min(rect.bottom, rect1.bottom));
    }

    public static boolean isStrokeTextViewRequired(TextStyle textstyle, TextStyle textstyle1)
    {
        if (textstyle1 != null) goto _L2; else goto _L1
_L1:
        if (textstyle == null || textstyle.getOutline() == null || !textstyle.getOutline().isStrokeTextRequired()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (textstyle1.getOutline() == null || !textstyle1.getOutline().isStrokeTextRequired())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static Float parseMargin(String s, int i)
    {
        if (!StringUtils.isEmpty(s))
        {
            Matcher matcher = PERCENT_PATTERN.matcher(s);
            if (matcher.find())
            {
                return Float.valueOf(Float.valueOf(matcher.group().replaceAll("%", "")).floatValue() / 100F);
            }
            s = CELL_PATTERN.matcher(s.toLowerCase(Locale.US));
            if (s.find())
            {
                return Float.valueOf(Float.valueOf(s.group().replaceAll("c", "")).floatValue() / (float)i);
            }
        }
        return null;
    }

    public static long parseTime(String s, double d)
    {
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        long l;
        Log.e("nf_subtitles_render", "dfxp-badtime: Time string us empty! Invalid time");
        l = -1L;
_L4:
        return l;
_L2:
        Matcher matcher = TICK_T_PATTERN.matcher(s);
        if (!matcher.find())
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = safeParseLong(matcher.group().replaceAll("t", ""));
        l = l1;
        if (l1 != -1L)
        {
            return (long)((double)l1 * d);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Matcher matcher1 = TICK_MS_PATTERN.matcher(s);
        if (matcher1.find())
        {
            return safeParseLong(matcher1.group().replaceAll("ms", ""));
        }
        matcher1 = TICK_SEC_PATTERN.matcher(s);
        if (matcher1.find())
        {
            long l2 = safeParseLong(matcher1.group().replaceAll("s", ""));
            l = l2;
            if (l2 != -1L)
            {
                return (long)((double)l2 * d);
            }
        } else
        {
            Matcher matcher2 = TICK_TIME_PATTERN.matcher(s);
            if (matcher2.find())
            {
                String as[] = StringUtils.safeSplit(matcher2.group(), ":");
                if (as.length < 3)
                {
                    if (Log.isLoggable("nf_subtitles_render", 6))
                    {
                        Log.e("nf_subtitles_render", (new StringBuilder()).append("dfxp-badtime: Tick time pattern matched, but we do not have 3 groups! This should NOT happen! ").append(s).toString());
                    }
                    return -1L;
                } else
                {
                    return (3600L * safeParseLong(as[0]) + 60L * safeParseLong(as[1]) + safeParseLong(as[2])) * 1000L;
                }
            }
            if (Log.isLoggable("nf_subtitles_render", 6))
            {
                Log.e("nf_subtitles_render", (new StringBuilder()).append("dfxp-badtime: Unknown format ").append(s).toString());
            }
            return -1L;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static long safeParseLong(String s)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_subtitles_render", "Parsing failed", s);
            return -1L;
        }
        return l;
    }

    public static int toGravity(HorizontalAlignment horizontalalignment, VerticalAlignment verticalalignment)
    {
        int i;
        if (horizontalalignment == null && verticalalignment == null)
        {
            Log.d("nf_subtitles_render", "toGravity default CENTER");
            i = 17;
        } else
        {
            if (horizontalalignment == null)
            {
                if (Log.isLoggable("nf_subtitles_render", 3))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("toGravity vert ").append(verticalalignment.getValue()).toString());
                }
                return verticalalignment.getGravity();
            }
            if (verticalalignment == null)
            {
                if (Log.isLoggable("nf_subtitles_render", 3))
                {
                    Log.d("nf_subtitles_render", (new StringBuilder()).append("toGravity hor ").append(horizontalalignment.getValue()).toString());
                }
                return horizontalalignment.getGravity();
            }
            int k = horizontalalignment.getGravity();
            int l = verticalalignment.getGravity();
            int j = horizontalalignment.getGravity() | verticalalignment.getGravity();
            i = j;
            if (Log.isLoggable("nf_subtitles_render", 3))
            {
                Log.d("nf_subtitles_render", (new StringBuilder()).append("toGravity ").append(j).append(", hor ").append(horizontalalignment.getValue()).append(", vert ").append(verticalalignment.getValue()).append(", plus ").append(k + l).toString());
                return j;
            }
        }
        return i;
    }

    public static Typeface toTypeFace(TextStyle textstyle, TextStyle textstyle1)
    {
        Typeface typeface;
        if (textstyle == null && textstyle1 == null)
        {
            return Typeface.SANS_SERIF;
        }
        typeface = Typeface.SANS_SERIF;
        if (textstyle1 != null) goto _L2; else goto _L1
_L1:
        if (textstyle.getFontFamily() != null)
        {
            typeface = textstyle.getFontFamily().getTypeface();
        }
_L4:
        return Typeface.create(typeface, toTypeFaceStyle(textstyle));
_L2:
        if (textstyle1.getFontFamily() != null)
        {
            typeface = textstyle1.getFontFamily().getTypeface();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int toTypeFaceStyle(TextStyle textstyle)
    {
        if (textstyle != null)
        {
            if (Boolean.TRUE.equals(textstyle.getItalic()))
            {
                return !Boolean.TRUE.equals(textstyle.getBold()) ? 2 : 3;
            }
            if (Boolean.TRUE.equals(textstyle.getBold()))
            {
                return 1;
            }
        }
        return 0;
    }

}
