// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.util.e;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;

// Referenced classes of package com.skype.android.util.cache:
//            SpannedStringCache

final class a extends e
{

    final SpannedStringCache a;

    protected final int c(Object obj)
    {
        obj = (a)obj;
        int i = ((a) (obj)).c.length() * 2;
        int j = i;
        if (((c) (obj)).c instanceof SpannableStringBuilder)
        {
            obj = (SpannableStringBuilder)((c) (obj)).c;
            obj = (ImageSpan[])((SpannableStringBuilder) (obj)).getSpans(0, ((SpannableStringBuilder) (obj)).length(), android/text/style/ImageSpan);
            int i1 = obj.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= i1)
                {
                    break;
                }
                Object obj1 = obj[k].getDrawable();
                if (obj1 instanceof AnimationDrawable)
                {
                    obj1 = (AnimationDrawable)obj1;
                    int l = 0;
                    j = i;
                    do
                    {
                        i = j;
                        if (l >= ((AnimationDrawable) (obj1)).getNumberOfFrames())
                        {
                            break;
                        }
                        android.graphics.drawable.Drawable drawable = ((AnimationDrawable) (obj1)).getFrame(l);
                        i = j;
                        if (drawable instanceof BitmapDrawable)
                        {
                            i = j + SpannedStringCache.a((BitmapDrawable)drawable);
                        }
                        l++;
                        j = i;
                    } while (true);
                } else
                if (obj1 instanceof BitmapDrawable)
                {
                    i += SpannedStringCache.a((BitmapDrawable)obj1);
                }
                k++;
            } while (true);
        }
        return j;
    }

    (SpannedStringCache spannedstringcache, int i)
    {
        a = spannedstringcache;
        super(i);
    }
}
