// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.pin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.view.View;
import android.webkit.URLUtil;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.grid.CachableRoundedBitmap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.grid.pin:
//            PinCellDrawable

public class PinIconTextDrawable extends PinCellDrawable
{

    public static final Bitmap FEEDBACK_ICON = ((BitmapDrawable)Resources.drawable(0x7f02018f)).getBitmap();
    private boolean centeredVertical;
    private Bitmap icon;
    private int iconSize;
    private CachableRoundedBitmap image;
    private int imagePadding;
    private View parent;
    private boolean renderfeedbackIcon;
    private boolean reverseOrder;
    private String subTitle;
    private String title;
    private int titleTopOffset;

    public PinIconTextDrawable(View view)
    {
        title = "";
        subTitle = "";
        reverseOrder = false;
        renderfeedbackIcon = false;
        centeredVertical = false;
        imagePadding = PADDING_IMAGE;
        parent = view;
        image = new CachableRoundedBitmap(view);
        iconSize = ICON_IMAGE_SIZE;
        titleTopOffset = (int)(nameSize + (float)DP3);
    }

    public void centerTextVertically()
    {
        centeredVertical = true;
    }

    public void draw(Canvas canvas)
    {
        if (pressed)
        {
            canvas.drawRect(getBounds(), touchPaint);
        }
        int k1 = y + padding.top;
        int j1 = k1 + titleTopOffset;
        int i = (int)((float)k1 + nameSize * 2.0F + (float)DP4);
        int j;
        int k;
        int i1;
        int l1;
        int i2;
        int j2;
        if (image.bitmap != null)
        {
            k = iconSize;
        } else
        {
            k = 0;
        }
        if (image.bitmap != null)
        {
            j = imagePadding;
        } else
        {
            j = 0;
        }
        l1 = (k + j + padding.left) - DP1;
        i2 = width;
        if (renderfeedbackIcon && icon != null)
        {
            k = ICON_SIZE;
            int l = padding.right;
            k = DP2 + (k + l);
        } else
        {
            k = 0;
        }
        j2 = width;
        if (reverseOrder)
        {
            i1 = j1 - DP2;
        } else
        {
            i1 = i;
            i = j1;
        }
        if (image.bitmap != null)
        {
            if (isOval())
            {
                image.draw(canvas, padding.left - DP2, k1 - DP2, iconSize + DP2, iconSize + DP2);
            } else
            {
                image.draw(canvas, padding.left, k1, iconSize, iconSize);
            }
        }
        if (centeredVertical)
        {
            i = y + (height + padding.top) / 2;
        }
        canvas.drawText(ellipsize(title, paintBold, i2 - j - l1), l1, i, paintBold);
        canvas.drawText(ellipsize(subTitle, paintLight, j2 - j - l1 - k), l1, i1, paintLight);
        if (renderfeedbackIcon && icon != null)
        {
            canvas.drawBitmap(icon, width - k, (y + height) - padding.right - ICON_SIZE - 1, blankPaint);
        }
    }

    public Rect getIconBounds()
    {
        if (renderfeedbackIcon)
        {
            return new Rect(width - ICON_SIZE - padding.right - DP8, getBounds().top, getBounds().right, getBounds().bottom);
        } else
        {
            return new Rect();
        }
    }

    public boolean isOval()
    {
        return image.isOval();
    }

    public void loadImage(String s)
    {
        if (image.bitmap == null || !image.getUrl().equals(s))
        {
            if (URLUtil.isValidUrl(s))
            {
                ImageCache.loadImage(image, s);
            } else
            if (StringUtils.isNumeric(s))
            {
                image.setBitmap(BitmapFactory.decodeResource(parent.getResources(), Integer.parseInt(s)), false);
                return;
            }
        }
    }

    public void measure()
    {
        setHeight(padding.top + iconSize + DIVIDER_HEIGHT + padding.bottom);
    }

    public void prepareForReuse()
    {
        super.prepareForReuse();
        reverseOrder = false;
        image.bitmap = null;
        renderfeedbackIcon = false;
    }

    public void setIcon(Bitmap bitmap)
    {
        icon = bitmap;
    }

    public void setIconRightPadding(int i)
    {
        imagePadding = i;
    }

    public void setIconSize(int i)
    {
        iconSize = i;
    }

    public void setOval(boolean flag)
    {
        image.setOval(flag);
    }

    public void setReverseOrder(boolean flag)
    {
        reverseOrder = flag;
    }

    public void setSubTitle(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        subTitle = s1;
    }

    public void setTitle(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        title = s1;
    }

    public void setTitleTextSize(float f)
    {
        paintBold.setTextSize(f);
    }

    public void setTitleTopOffset(int i)
    {
        titleTopOffset = i;
    }

    public void showFeedbackIcon(boolean flag)
    {
        renderfeedbackIcon = flag;
    }

}
