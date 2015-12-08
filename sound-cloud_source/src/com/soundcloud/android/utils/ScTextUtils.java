// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.res.Resources;
import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.strings.Strings;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScTextUtils
{
    public static class ClickSpan extends ClickableSpan
    {

        private final OnClickListener listener;
        private final boolean underline;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onClick();
            }
        }

        public void updateDrawState(TextPaint textpaint)
        {
            super.updateDrawState(textpaint);
            textpaint.setUnderlineText(underline);
        }

        public ClickSpan(OnClickListener onclicklistener, boolean flag)
        {
            listener = onclicklistener;
            underline = flag;
        }
    }

    public static interface ClickSpan.OnClickListener
    {

        public abstract void onClick();
    }

    public static abstract class TextValidator
        implements TextWatcher
    {

        private final TextView textView;

        public final void afterTextChanged(Editable editable)
        {
            validate(textView, textView.getText().toString());
        }

        public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public abstract void validate(TextView textview, String s);

        public TextValidator(TextView textview)
        {
            textView = textview;
        }
    }


    private static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile("\\A([a-z0-9_\\-][a-z0-9_\\-\\+\\.]{0,62})?[a-z0-9_\\-]@(([a-z0-9]|[a-z0-9][a-z0-9\\-]*[a-z0-9])\\.)+[a-z]{2,}\\Z");
    public static final String EMPTY_STRING = "";
    public static final String SPACE_SEPARATOR = " ";

    private ScTextUtils()
    {
    }

    public static boolean clickify(TextView textview, String s, ClickSpan.OnClickListener onclicklistener, boolean flag, boolean flag1)
    {
        CharSequence charsequence;
        int i;
        int j;
        charsequence = textview.getText();
        String s1 = charsequence.toString();
        onclicklistener = new ClickSpan(onclicklistener, flag);
        j = s1.length();
        if (s != null)
        {
            int k = s1.indexOf(s);
            j = s.length() + k;
            i = k;
            if (k == -1)
            {
                return false;
            }
        } else
        {
            i = 0;
        }
        if (!(charsequence instanceof Spannable)) goto _L2; else goto _L1
_L1:
        ((Spannable)charsequence).setSpan(onclicklistener, i, j, 33);
_L4:
        if (!(textview.getMovementMethod() instanceof LinkMovementMethod))
        {
            textview.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (!flag1)
        {
            textview.setHighlightColor(0);
        }
        return true;
_L2:
        s = SpannableString.valueOf(charsequence);
        if (s != null)
        {
            s.setSpan(onclicklistener, i, j, 33);
            textview.setText(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String formatFollowersMessage(Resources resources, int i)
    {
        return resources.getQuantityString(0x7f090019, i, new Object[] {
            formatNumber(resources, i)
        });
    }

    public static String formatFollowingMessage(Resources resources, int i)
    {
        if (i == 0)
        {
            return resources.getString(0x7f070143);
        } else
        {
            return resources.getQuantityString(0x7f09001a, i, new Object[] {
                formatNumber(resources, i)
            });
        }
    }

    private static String formatNumber(Resources resources, long l)
    {
        return CondensedNumberFormatter.create(Locale.getDefault(), resources).format(l);
    }

    public static String formatSecondsOrMinutes(Resources resources, long l, TimeUnit timeunit)
    {
        int i = (int)timeunit.toSeconds(l);
        if (i < 60)
        {
            return String.format(resources.getString(0x7f070145), new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            return String.format(resources.getString(0x7f070144), new Object[] {
                Long.valueOf(timeunit.toMinutes(l))
            });
        }
    }

    public static String formatTimeElapsed(Resources resources, double d, boolean flag)
    {
        if (d < 60D)
        {
            int i;
            if (flag)
            {
                i = 0x7f090016;
            } else
            {
                i = 0x7f090015;
            }
            return resources.getQuantityString(i, (int)d, new Object[] {
                Integer.valueOf((int)d)
            });
        }
        if (d < 3600D)
        {
            int j;
            if (flag)
            {
                j = 0x7f090012;
            } else
            {
                j = 0x7f090011;
            }
            return resources.getQuantityString(j, (int)(d / 60D), new Object[] {
                Integer.valueOf((int)(d / 60D))
            });
        }
        if (d < 86400D)
        {
            int k;
            if (flag)
            {
                k = 0x7f090010;
            } else
            {
                k = 0x7f09000f;
            }
            return resources.getQuantityString(k, (int)(d / 3600D), new Object[] {
                Integer.valueOf((int)(d / 3600D))
            });
        }
        if (d < 2592000D)
        {
            int l;
            if (flag)
            {
                l = 0x7f09000e;
            } else
            {
                l = 0x7f09000d;
            }
            return resources.getQuantityString(l, (int)(d / 86400D), new Object[] {
                Integer.valueOf((int)(d / 86400D))
            });
        }
        if (d < 31536000D)
        {
            int i1;
            if (flag)
            {
                i1 = 0x7f090014;
            } else
            {
                i1 = 0x7f090013;
            }
            return resources.getQuantityString(i1, (int)(d / 2592000D), new Object[] {
                Integer.valueOf((int)(d / 2592000D))
            });
        }
        int j1;
        if (flag)
        {
            j1 = 0x7f090018;
        } else
        {
            j1 = 0x7f090017;
        }
        return resources.getQuantityString(j1, (int)(d / 31536000D), new Object[] {
            Integer.valueOf((int)(d / 31536000D))
        });
    }

    public static String formatTimeElapsed(Resources resources, long l)
    {
        return formatTimeElapsedSince(resources, l, false);
    }

    public static String formatTimeElapsedSince(Resources resources, long l, boolean flag)
    {
        return formatTimeElapsed(resources, Math.max(0L, (System.currentTimeMillis() - l) / 1000L), flag);
    }

    public static String formatTimestamp(long l, TimeUnit timeunit)
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l1 = timeunit.toHours(l);
        if (l1 > 0L)
        {
            stringbuilder.append(l1).append(':');
        }
        long l2 = timeunit.toMinutes(l) % 60L;
        if (l1 > 0L && l2 < 10L)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(l2).append(':');
        l = timeunit.toSeconds(l) % 60L;
        if (l < 10L)
        {
            stringbuilder.append('0');
        }
        return stringbuilder.append(l).toString();
    }

    public static Spanned fromHtml(String s)
    {
_L2:
        if (s == null || TextUtils.isEmpty(s))
        {
            return new SpannedString("");
        }
        s = s.replace(System.getProperty("line.separator"), "<br/>");
        Spanned spanned = Html.fromHtml(s);
        return spanned;
        RuntimeException runtimeexception;
        runtimeexception;
        if (runtimeexception.getCause() instanceof IOException)
        {
            s = s.substring(0, s.length() / 2);
        } else
        {
            throw runtimeexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String fromSnakeCaseToCamelCase(String s)
    {
        s = s.split("_");
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(toTitleCase(s[i]));
        }

        return stringbuilder.toString();
    }

    public static String getClippedString(String s, int i)
    {
        Preconditions.checkArgument(Strings.isNotBlank(s), "String must be non null/not empty");
        int j = i;
        if (s.length() < i)
        {
            j = s.length();
        }
        return s.substring(0, j);
    }

    public static String getLocation(String s, String s1)
    {
        String s2;
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            s2 = (new StringBuilder()).append(s).append(", ").append(s1).toString();
        } else
        {
            s2 = s;
            if (TextUtils.isEmpty(s))
            {
                if (!TextUtils.isEmpty(s1))
                {
                    return s1;
                } else
                {
                    return "";
                }
            }
        }
        return s2;
    }

    public static boolean isEmail(CharSequence charsequence)
    {
        return !TextUtils.isEmpty(charsequence) && EMAIL_ADDRESS_PATTERN.matcher(charsequence.toString().toLowerCase(Locale.US)).matches();
    }

    public static long safeParseLong(String s)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1L;
        }
        return l;
    }

    public static String toTitleCase(String s)
    {
        return (new StringBuilder()).append(s.substring(0, 1).toUpperCase(Locale.US)).append(s.substring(1).toLowerCase(Locale.US)).toString();
    }

    public static boolean usesSameTimeElapsedString(double d, double d1)
    {
        if (d >= 60D) goto _L2; else goto _L1
_L1:
        if ((int)d != (int)d1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (d >= 3600D)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((int)(d / 60D) != (int)(d1 / 60D))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (d >= 86400D)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((int)(d / 3600D) != (int)(d1 / 3600D))
        {
            return false;
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (d >= 2592000D)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((int)(d / 86400D) != (int)(d1 / 86400D))
        {
            return false;
        }
        if (true) goto _L3; else goto _L7
_L7:
        if (d >= 31536000D)
        {
            continue; /* Loop/switch isn't completed */
        }
        if ((int)(d / 2592000D) == (int)(d1 / 2592000D)) goto _L3; else goto _L8
_L8:
        return false;
        if ((int)(d / 31536000D) == (int)(d1 / 31536000D)) goto _L3; else goto _L9
_L9:
        return false;
    }

}
