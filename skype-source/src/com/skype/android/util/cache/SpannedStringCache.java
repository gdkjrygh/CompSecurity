// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.cache;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.util.e;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.util.AccountLifetimeObject;

public class SpannedStringCache extends AccountLifetimeObject
{
    public static class OnCleared
    {

        public OnCleared()
        {
        }
    }

    static class a
    {

        long b;
        CharSequence c;
        int d;

        a(long l, CharSequence charsequence)
        {
            b = l;
            c = charsequence;
            d = 0;
        }
    }


    private e a;

    public SpannedStringCache(ActivityManager activitymanager)
    {
        a = new e((activitymanager.getMemoryClass() / 4) * 1024 * 1024) {

            final SpannedStringCache a;

            protected final int c(Object obj)
            {
                obj = (a)obj;
                int i = ((a) (obj)).c.length() * 2;
                int j = i;
                if (((a) (obj)).c instanceof SpannableStringBuilder)
                {
                    obj = (SpannableStringBuilder)((a) (obj)).c;
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

            
            {
                a = SpannedStringCache.this;
                super(i);
            }
        };
    }

    static int a(BitmapDrawable bitmapdrawable)
    {
        int i = 0;
        bitmapdrawable = bitmapdrawable.getBitmap();
        if (bitmapdrawable != null)
        {
            i = bitmapdrawable.getByteCount() + 0;
        }
        return i;
    }

    final a a(int i)
    {
        return (a)a.a(Integer.valueOf(i));
    }

    public final void a()
    {
        a.a();
        EventBusInstance.a().a(new OnCleared());
    }

    final void a(int i, long l, CharSequence charsequence)
    {
        long l1 = l;
        if (l < 0L)
        {
            l1 = 0L;
        }
        a.a(Integer.valueOf(i), new a(l1, charsequence));
    }

    final void a(int i, a a1)
    {
        a.a(Integer.valueOf(i), a1);
    }

    final void b(int i)
    {
        a.b(Integer.valueOf(i));
    }

    public void onLogin()
    {
    }

    public void onLogout()
    {
        a();
    }
}
