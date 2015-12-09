// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.style.SuperscriptSpan;
import android.text.style.TextAppearanceSpan;
import com.google.wallet.wobl.common.WoblStringUtil;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ProtoWoblRenderUtils

abstract class SpannableAppender
{

    private final int androidVersion;

    protected SpannableAppender(int i)
    {
        androidVersion = i;
    }

    private static transient void appendSpannedContent(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence, Object aobj[])
    {
        int j = spannablestringbuilder.length();
        spannablestringbuilder.append(charsequence);
        int k = spannablestringbuilder.length();
        int l = aobj.length;
        for (int i = 0; i < l; i++)
        {
            charsequence = ((CharSequence) (aobj[i]));
            if (charsequence != null)
            {
                spannablestringbuilder.setSpan(charsequence, j, k, 33);
            }
        }

    }

    private static String applyTextTransform(String s, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes atextstyleattributes[])
    {
        int i;
        int j;
        j = atextstyleattributes.length;
        i = 0;
_L8:
        Object obj = s;
        if (i >= j) goto _L2; else goto _L1
_L1:
        obj = atextstyleattributes[i];
        if (obj == null || ((com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes) (obj)).textTransform == null) goto _L4; else goto _L3
_L3:
        ((com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes) (obj)).textTransform.intValue();
        JVM INSTR tableswitch 1 3: default 64
    //                   1 71
    //                   2 78
    //                   3 83;
           goto _L4 _L5 _L6 _L7
_L4:
        i++;
          goto _L8
_L5:
        obj = WoblStringUtil.toTitleCase(s);
_L2:
        return ((String) (obj));
_L6:
        return s.toUpperCase();
_L7:
        return s.toLowerCase();
    }

    private static CharSequence fixServiceMark(String s)
    {
        if (!s.contains("\u2120"))
        {
            return s;
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        for (int i = s.indexOf("\u2120"); i >= 0; i = s.indexOf("\u2120"))
        {
            spannablestringbuilder.append(s.substring(0, i));
            appendSpannedContent(spannablestringbuilder, "SM", new Object[] {
                new SuperscriptSpan()
            });
            s = s.substring(i + 1);
        }

        spannablestringbuilder.append(s);
        return spannablestringbuilder;
    }

    private static ColorStateList getColor(com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes atextstyleattributes[])
    {
        int j = atextstyleattributes.length;
        for (int i = 0; i < j; i++)
        {
            com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes = atextstyleattributes[i];
            if (textstyleattributes != null && textstyleattributes.fontColor != null)
            {
                ColorStateList colorstatelist = ColorStateList.valueOf(ProtoWoblRenderUtils.toAndroidColor(textstyleattributes.fontColor));
                atextstyleattributes = colorstatelist;
                if (textstyleattributes.fontAlpha != null)
                {
                    atextstyleattributes = colorstatelist.withAlpha(Math.round(255F * textstyleattributes.fontAlpha.floatValue()));
                }
                return atextstyleattributes;
            }
        }

        return null;
    }

    private static String getFontFamily(int i, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes atextstyleattributes[])
    {
        int j;
        int k;
        k = atextstyleattributes.length;
        j = 0;
_L7:
        com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        textstyleattributes = atextstyleattributes[j];
        if (textstyleattributes == null || textstyleattributes.fontFamily == null) goto _L2; else goto _L1
_L1:
        textstyleattributes.fontFamily.intValue();
        JVM INSTR tableswitch 0 2: default 60
    //                   0 67
    //                   1 90
    //                   2 93;
           goto _L2 _L3 _L4 _L5
_L2:
        j++;
        continue; /* Loop/switch isn't completed */
_L3:
        if (i >= 16 && textstyleattributes.fontWeight.intValue() == 2)
        {
            return "sans-serif-light";
        } else
        {
            return "sans-serif";
        }
_L4:
        return "serif";
_L5:
        return "monospace";
        if (true) goto _L7; else goto _L6
_L6:
        return null;
    }

    private static int getFontStyleFlag(com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes atextstyleattributes[])
    {
        int i;
        boolean flag;
        boolean flag1;
        int l;
        int i1;
        flag = false;
        l = 0;
        flag1 = false;
        i1 = atextstyleattributes.length;
        i = 0;
_L5:
        int j = l;
        if (i >= i1) goto _L2; else goto _L1
_L1:
        com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes = atextstyleattributes[i];
        if (textstyleattributes == null || textstyleattributes.fontWeight == null) goto _L4; else goto _L3
_L3:
        j = textstyleattributes.fontWeight.intValue();
_L2:
        l = atextstyleattributes.length;
        i = ((flag) ? 1 : 0);
_L6:
        int k = ((flag1) ? 1 : 0);
        if (i < l)
        {
            com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes textstyleattributes1 = atextstyleattributes[i];
            if (textstyleattributes1 == null || textstyleattributes1.fontStyle == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            k = textstyleattributes1.fontStyle.intValue();
        }
        i = 0;
        if (j == 1)
        {
            i = 1;
        }
        j = i;
        if (k == 1)
        {
            j = i | 2;
        }
        return j;
_L4:
        i++;
          goto _L5
        i++;
          goto _L6
    }

    protected abstract void append(SpannableStringBuilder spannablestringbuilder);

    public final void appendStyledContent(SpannableStringBuilder spannablestringbuilder, String s, Object obj, com.google.wallet.proto.NanoCompiledWobl.TextStyleAttributes atextstyleattributes[])
    {
        ColorStateList colorstatelist = getColor(atextstyleattributes);
        String s1 = getFontFamily(androidVersion, atextstyleattributes);
        int i = getFontStyleFlag(atextstyleattributes);
        TextAppearanceSpan textappearancespan = null;
        if (colorstatelist != null || s1 != null || i != 0)
        {
            textappearancespan = new TextAppearanceSpan(s1, i, 0, colorstatelist, null);
        }
        appendSpannedContent(spannablestringbuilder, fixServiceMark(applyTextTransform(s, atextstyleattributes)), new Object[] {
            textappearancespan, obj
        });
    }
}
