// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.google.android.apps.wallet.paymentcard.api.CardColor;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import dagger.Lazy;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            PaymentCards

public class CardDrawable extends Drawable
{
    static final class BackgroundSource extends Enum
    {

        private static final BackgroundSource $VALUES[];
        public static final BackgroundSource CARD_COLOR;
        public static final BackgroundSource RESOURCE_ID;
        public static final BackgroundSource URI;

        public static BackgroundSource valueOf(String s)
        {
            return (BackgroundSource)Enum.valueOf(com/google/android/apps/wallet/paymentcard/widgets/CardDrawable$BackgroundSource, s);
        }

        public static BackgroundSource[] values()
        {
            return (BackgroundSource[])$VALUES.clone();
        }

        static 
        {
            CARD_COLOR = new BackgroundSource("CARD_COLOR", 0);
            URI = new BackgroundSource("URI", 1);
            RESOURCE_ID = new BackgroundSource("RESOURCE_ID", 2);
            $VALUES = (new BackgroundSource[] {
                CARD_COLOR, URI, RESOURCE_ID
            });
        }

        private BackgroundSource(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int TEXT_SHADOW_COLOR = Color.argb(127, 0, 0, 0);
    private BackgroundSource backgroundSource;
    private CardColor backgroundSourceColor;
    private int backgroundSourceResourceId;
    private Uri backgroundSourceUri;
    private Drawable cachedBackground;
    private Rect cachedBounds;
    private int credentialNetwork;
    private boolean currentlyFetchingBackgroundImage;
    private String expiration;
    private String lastFour;
    private String name;
    private final Lazy picasso;
    private Target picassoTarget;
    private final Resources resources;
    private final Paint shadePaint = new Paint();
    private boolean showCredentialNetworkLogo;
    private final TextPaint textPaint = new TextPaint();

    CardDrawable(Resources resources1, Lazy lazy)
    {
        showCredentialNetworkLogo = true;
        resources = resources1;
        picasso = lazy;
        textPaint.setColor(-1);
        textPaint.setShadowLayer(1.0F, 0.0F, 1.0F, TEXT_SHADOW_COLOR);
        textPaint.setAntiAlias(true);
        shadePaint.setAlpha(64);
    }

    private void cancelImageFetch()
    {
        if (picassoTarget != null)
        {
            ((Picasso)picasso.get()).cancelRequest(picassoTarget);
            picassoTarget = null;
        }
    }

    private static void drawDrawable(Drawable drawable, Rect rect, Canvas canvas)
    {
        if (drawable != null)
        {
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    private void fetchFromResourceId(int i, Rect rect)
    {
        if (i <= 0)
        {
            fetchFromCardColor(null, rect);
            return;
        } else
        {
            cachedBackground = resources.getDrawable(i);
            return;
        }
    }

    private void fetchFromUri(Uri uri, final Rect bounds)
    {
        cachedBackground = PaymentCards.getLoadingBackground(getCornerRadius(bounds));
        picassoTarget = new Target() {

            final CardDrawable this$0;
            final Rect val$bounds;

            public final void onBitmapFailed(Drawable drawable)
            {
                currentlyFetchingBackgroundImage = false;
                fetchFromCardColor(backgroundSourceColor, bounds);
                invalidateSelf();
            }

            public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                currentlyFetchingBackgroundImage = false;
                cachedBackground = new BitmapDrawable(resources, bitmap);
                showCredentialNetworkLogo = false;
                invalidateSelf();
            }

            
            {
                this$0 = CardDrawable.this;
                bounds = rect;
                super();
            }
        };
        currentlyFetchingBackgroundImage = true;
        float f = resources.getDisplayMetrics().density;
        ((Picasso)picasso.get()).load(uri).resize((int)(294D * (double)f), (int)(187D * (double)f)).into(picassoTarget);
    }

    private Drawable getBackgroundDrawable(Rect rect)
    {
        if (rect.equals(cachedBounds) && cachedBackground != null)
        {
            return cachedBackground;
        }
        cachedBounds = rect;
        if (backgroundSource == BackgroundSource.RESOURCE_ID)
        {
            fetchFromResourceId(backgroundSourceResourceId, rect);
        } else
        if (backgroundSource == BackgroundSource.URI)
        {
            fetchFromUri(backgroundSourceUri, rect);
        } else
        {
            fetchFromCardColor(backgroundSourceColor, rect);
        }
        return cachedBackground;
    }

    private static float getCornerRadius(Rect rect)
    {
        return (float)(0.035034013605442178D * (double)rect.width());
    }

    private Rect getDigitRectFromIndex(int i)
    {
        double d;
        if (credentialNetwork == 3)
        {
            if (i < 4)
            {
                d = 0.0D;
            } else
            if (i < 10)
            {
                d = 1.0D;
            } else
            {
                d = 2D;
            }
        } else
        {
            d = i / 4;
        }
        return getRectFromRelativeWeights(24D + (double)i * 12D + 9D * d, 91D, 12D, 20D);
    }

    private static String getEllipsizedText(String s, Paint paint, Rect rect)
    {
        Rect rect1 = new Rect();
        paint.getTextBounds(s, 0, s.length(), rect1);
        if (rect1.width() <= rect.width())
        {
            return s;
        }
        String s1;
        for (int i = s.length() - 1; i > 0; i--)
        {
            s1 = String.valueOf(s.substring(0, i));
            String s2 = String.valueOf("\u2026");
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            paint.getTextBounds(s1, 0, s1.length(), rect1);
            if (rect1.width() <= rect.width())
            {
                return s1;
            }
        }

        return "";
    }

    private Rect getRectFromRelativeWeights(double d, double d1, double d2, double d3)
    {
        Rect rect = getBounds();
        double d7 = rect.width();
        double d6 = rect.height();
        double d4 = (d7 * d) / 294D;
        double d5 = (d6 * d1) / 187D;
        d = ((d + d2) * d7) / 294D;
        d1 = ((d1 + d3) * d6) / 187D;
        return new Rect((int)d4, (int)d5, (int)d, (int)d1);
    }

    private void reset()
    {
        backgroundSource = null;
        backgroundSourceColor = null;
        backgroundSourceUri = null;
        backgroundSourceResourceId = -1;
        cancelImageFetch();
        currentlyFetchingBackgroundImage = false;
        showCredentialNetworkLogo = true;
        cachedBounds = null;
        cachedBackground = null;
    }

    private static void setScaledTextSize(Rect rect, Paint paint)
    {
        android.graphics.Paint.FontMetrics fontmetrics = new android.graphics.Paint.FontMetrics();
        int i = rect.height();
        do
        {
            if (i <= 0)
            {
                break;
            }
            paint.setTextSize(i);
            paint.getFontMetrics(fontmetrics);
            if (fontmetrics.descent - fontmetrics.ascent <= (float)rect.height())
            {
                break;
            }
            i--;
        } while (true);
    }

    public void draw(Canvas canvas)
    {
        Object obj;
        Rect rect;
        Rect rect1;
        Rect rect2;
        obj = getRectFromRelativeWeights(0.0D, 0.0D, 294D, 185D);
        rect1 = getRectFromRelativeWeights(24D, 123D, 76D, 16D);
        rect2 = getRectFromRelativeWeights(24D, 153D, 184D, 16D);
        rect = getRectFromRelativeWeights(224D, 138D, 58D, 38D);
        if (!currentlyFetchingBackgroundImage) goto _L2; else goto _L1
_L1:
        drawDrawable(getBackgroundDrawable(((Rect) (obj))), ((Rect) (obj)), canvas);
_L4:
        return;
_L2:
        drawDrawable(getBackgroundDrawable(((Rect) (obj))), ((Rect) (obj)), canvas);
        if (lastFour != null)
        {
            byte byte0;
            if (credentialNetwork == 3)
            {
                byte0 = 15;
            } else
            {
                byte0 = 16;
            }
            setScaledTextSize(getDigitRectFromIndex(0), textPaint);
            for (int i = 0; i < byte0; i++)
            {
                String s = "\u2022";
                obj = s;
                if (i >= 11)
                {
                    obj = s;
                    if (credentialNetwork == 3)
                    {
                        obj = lastFour.substring(i - 11, i - 10);
                    }
                }
                s = ((String) (obj));
                if (i >= 12)
                {
                    s = ((String) (obj));
                    if (credentialNetwork != 3)
                    {
                        s = lastFour.substring(i - 12, i - 11);
                    }
                }
                obj = getDigitRectFromIndex(i);
                canvas.drawText(s, ((Rect) (obj)).left, ((Rect) (obj)).bottom, textPaint);
            }

        }
        if (name != null)
        {
            setScaledTextSize(rect2, textPaint);
            canvas.drawText(getEllipsizedText(name, textPaint, rect2), rect2.left, rect2.bottom, textPaint);
        }
        if (expiration != null)
        {
            setScaledTextSize(rect1, textPaint);
            canvas.drawText(expiration, rect1.left, rect1.bottom, textPaint);
        }
        if (!showCredentialNetworkLogo) goto _L4; else goto _L3
_L3:
        obj = null;
        if (credentialNetwork != 1) goto _L6; else goto _L5
_L5:
        obj = resources.getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_networkcard_visa);
_L8:
        drawDrawable(((Drawable) (obj)), rect, canvas);
        return;
_L6:
        if (credentialNetwork == 2)
        {
            obj = resources.getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_networkcard_mastercard);
        } else
        if (credentialNetwork == 3)
        {
            obj = resources.getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_networkcard_amex);
        } else
        if (credentialNetwork == 4)
        {
            obj = resources.getDrawable(com.google.android.apps.walletnfcrel.R.drawable.ic_networkcard_discover);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    final void fetchFromCardColor(CardColor cardcolor, Rect rect)
    {
        CardColor cardcolor1 = cardcolor;
        if (cardcolor == null)
        {
            cardcolor1 = CardColor.getDefaultColor();
        }
        cachedBackground = PaymentCards.getGradientBackground(cardcolor1, getCornerRadius(rect));
    }

    public int getIntrinsicHeight()
    {
        return 187;
    }

    public int getIntrinsicWidth()
    {
        return 294;
    }

    public int getOpacity()
    {
        return -2;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

    public final void setCredential(PaymentCard paymentcard)
    {
        reset();
        if (paymentcard == null)
        {
            return;
        }
        lastFour = paymentcard.getCardNumberLast4();
        credentialNetwork = paymentcard.getNetwork().intValue();
        String s = String.valueOf(paymentcard.getExpirationMonth());
        String s1 = String.valueOf(paymentcard.getTwoDigitExpirationYear());
        expiration = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("/").append(s1).toString();
        name = paymentcard.getCardHolderName().toUpperCase(Locale.ENGLISH);
        backgroundSourceColor = paymentcard.getCardColor();
        backgroundSourceUri = paymentcard.getCustomizedImageUri();
        if (backgroundSourceUri == null) goto _L2; else goto _L1
_L1:
        backgroundSource = BackgroundSource.URI;
_L4:
        invalidateSelf();
        return;
_L2:
        if (backgroundSourceColor != null)
        {
            backgroundSource = BackgroundSource.CARD_COLOR;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }



/*
    static boolean access$002(CardDrawable carddrawable, boolean flag)
    {
        carddrawable.currentlyFetchingBackgroundImage = flag;
        return flag;
    }

*/



/*
    static Drawable access$202(CardDrawable carddrawable, Drawable drawable)
    {
        carddrawable.cachedBackground = drawable;
        return drawable;
    }

*/



/*
    static boolean access$402(CardDrawable carddrawable, boolean flag)
    {
        carddrawable.showCredentialNetworkLogo = flag;
        return flag;
    }

*/
}
