// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import com.thetransitapp.droid.model.viewmodel.ItineraryDirectionGroup;
import com.thetransitapp.droid.model.viewmodel.MergedItinerary;
import com.thetransitapp.droid.model.viewmodel.NearbyRouteViewModel;
import com.thetransitapp.droid.model.viewmodel.RouteViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.thetransitapp.droid.util:
//            FontUtility

public final class BitmapUtility
{

    private BitmapUtility()
    {
    }

    public static Bitmap getArrow(NearbyRouteViewModel nearbyrouteviewmodel, float f)
    {
        return getArrow(nearbyrouteviewmodel, f, false);
    }

    public static Bitmap getArrow(NearbyRouteViewModel nearbyrouteviewmodel, float f, boolean flag)
    {
        float f1;
        Map map;
        MergedItinerary mergeditinerary;
        Canvas canvas;
        Paint paint;
        Iterator iterator;
        boolean flag1;
        map = nearbyrouteviewmodel.getDirectionGroups();
        mergeditinerary = nearbyrouteviewmodel.getCurrentItinerary();
        double d = 0.0D;
        flag1 = false;
        Object obj = map.keySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                double d1 = d;
                if (flag1)
                {
                    d1 = d + (double)f * 0.25D * (double)map.keySet().size();
                }
                obj = Bitmap.createBitmap((int)d1, (int)f + 10, android.graphics.Bitmap.Config.ARGB_8888);
                canvas = new Canvas(((Bitmap) (obj)));
                paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStrokeWidth(5F);
                f1 = 0.0F;
                iterator = map.keySet().iterator();
                break MISSING_BLOCK_LABEL_139;
            }
            int i = ((ItineraryDirectionGroup)map.get((com.thetransitapp.droid.model.Itinerary.DirectionType)((Iterator) (obj)).next())).getItineraries().size();
            d += (double)((float)i * f) * 0.69999999999999996D;
            if (!flag1 && i <= 1)
            {
                flag1 = false;
            } else
            {
                flag1 = true;
            }
        } while (true);
_L2:
        float f2;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            return ((Bitmap) (obj));
        }
        iterator1 = ((ItineraryDirectionGroup)map.get((com.thetransitapp.droid.model.Itinerary.DirectionType)iterator.next())).getItineraries().iterator();
        f2 = f1;
_L3:
label0:
        {
            if (iterator1.hasNext())
            {
                break label0;
            }
            f1 = f2;
            if (flag1)
            {
                f1 = f2 + 0.25F * f;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        MergedItinerary mergeditinerary1 = (MergedItinerary)iterator1.next();
        Path path = new Path();
        path.moveTo(f2, 6F);
        path.lineTo(0.3F * f + f2, 6F);
        path.lineTo(0.6F * f + f2, f / 2.0F + 6F);
        path.lineTo(0.3F * f + f2, f + 6F);
        path.lineTo(f2, f + 6F);
        path.lineTo(0.3F * f + f2, f / 2.0F + 6F);
        path.lineTo(f2, 6F);
        if (mergeditinerary == mergeditinerary1)
        {
            int j;
            if (flag)
            {
                j = nearbyrouteviewmodel.getTextSelectedColor();
            } else
            {
                j = nearbyrouteviewmodel.getTextColor();
            }
            paint.setColor(j);
            paint.setShadowLayer(0.1F, 0.0F, nearbyrouteviewmodel.getTextShadowOffset(), nearbyrouteviewmodel.getShadowColor());
        } else
        {
            int k;
            if (flag)
            {
                k = nearbyrouteviewmodel.getArrowSelectedColor();
            } else
            {
                k = nearbyrouteviewmodel.getArrowColor();
            }
            paint.setColor(k);
            paint.setShadowLayer(0.1F, 0.0F, nearbyrouteviewmodel.getTextShadowOffset(), nearbyrouteviewmodel.getArrowShadowColor());
        }
        canvas.drawPath(path, paint);
        f2 += 0.6F * f;
          goto _L3
    }

    public static Bitmap getDirectionArrow(int i, float f, int j)
    {
        float f1 = (3.5F * (float)j) / 5F;
        float f2 = f1 / 3F;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        Bitmap bitmap = Bitmap.createBitmap(j * 6, j * 6, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        canvas.rotate(f, (float)j * 3F, (float)j * 3F);
        Path path = new Path();
        path.moveTo((float)j * 2.0F, (float)j * 3F);
        path.lineTo((float)j * 3F, (float)j * 2.0F);
        path.lineTo((float)j * 3F, (float)j * 5F);
        path.lineTo((float)j * 3F, (float)j * 2.0F);
        path.lineTo(4F * (float)j, (float)j * 3F);
        paint.setColor(-1);
        paint.setStrokeWidth(2.0F * f2 + f1);
        canvas.drawPath(path, paint);
        paint.setColor(i);
        paint.setStrokeWidth(f1);
        canvas.drawPath(path, paint);
        return bitmap;
    }

    public static Bitmap getPagination(int i, int j, int k)
    {
        int i1 = j + (j / 8) * 2;
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setTextSize(j);
        Bitmap bitmap = Bitmap.createBitmap((i1 + j) * i - j, i1 + 2, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        int l = 0;
        do
        {
            if (l >= i)
            {
                return bitmap;
            }
            int j1 = (i1 + j) * l;
            paint.setColor(0xff000000);
            canvas.drawRoundRect(new RectF(j1, 0.0F, j1 + i1, i1), 1.0F, 1.0F, paint);
            char ac[];
            float af[];
            int k1;
            int l1;
            if (l == k)
            {
                paint.setColor(-1);
            } else
            {
                paint.setColor(0xff898989);
            }
            canvas.drawRoundRect(new RectF(j1, 2.0F, j1 + i1, (float)i1 + 2.0F), 2.0F, 2.0F, paint);
            ac = new char[1];
            ac[0] = (char)(l + 65);
            paint.setColor(0xff000000);
            af = new float[2];
            paint.breakText(ac, 0, 1, i1, af);
            k1 = (int)(((float)i1 - af[0]) / 2.0F);
            l1 = (int)(((float)i1 - paint.descent() - paint.ascent()) / 2.0F);
            canvas.drawText(ac, 0, 1, k1 + j1, l1 + 3, paint);
            l++;
        } while (true);
    }

    public static Bitmap getPin(int i, int j, int k)
    {
        Bitmap bitmap = Bitmap.createBitmap(j, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        j /= 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        canvas.drawColor(0);
        canvas.drawCircle(j, j, j, paint);
        paint.setColor(i);
        canvas.drawCircle(j, j, k / 2, paint);
        return bitmap;
    }

    public static Bitmap getShield(Bitmap bitmap, RouteViewModel routeviewmodel, int i, Context context)
    {
        int j = Math.min(i, bitmap.getWidth());
        int k = (bitmap.getHeight() * j) / bitmap.getWidth();
        float f = (float)i / 5F;
        float f1 = f / 2.0F;
        float f2 = context.getResources().getDimension(0x7f08001f);
        context = new Paint();
        context.setAntiAlias(true);
        context.setDither(true);
        Bitmap bitmap1 = Bitmap.createBitmap((int)((float)j + 2.0F * (f + f1)), (int)((float)k + 2.0F * (f + f1)) + 2, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawColor(0);
        RectF rectf = new RectF(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
        context.setColor(0x55000000);
        canvas.drawRoundRect(rectf, f2, f2, context);
        rectf = new RectF(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight() - 2);
        context.setColor(-1);
        canvas.drawRoundRect(rectf, f2, f2, context);
        rectf = new RectF(f1, f1, (float)canvas.getWidth() - f1, (float)canvas.getHeight() - f1 - 2.0F);
        context.setColor(routeviewmodel.getColor());
        canvas.drawRoundRect(rectf, f2 / 2.0F, f2 / 2.0F, context);
        rectf = new RectF(f + f1, f + f1, (float)canvas.getWidth() - f1 - f, (float)canvas.getHeight() - f1 - f - 2.0F);
        context.setColorFilter(new PorterDuffColorFilter(routeviewmodel.getTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        context.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, null, rectf, context);
        return bitmap1;
    }

    public static Bitmap getShield(String s, RouteViewModel routeviewmodel, int i, Context context)
    {
        float af[] = new float[2];
        float f = (float)i / 5F;
        float f1 = f / 2.0F;
        float f2 = context.getResources().getDimension(0x7f08001f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(i);
        paint.setTypeface(FontUtility.getInterstateBold(context));
        paint.breakText(s, true, i * 10, af);
        context = Bitmap.createBitmap((int)(af[0] + 2.0F * (f + f1)), (int)((float)i + 2.0F * (f + f1)), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(context);
        canvas.drawColor(0);
        RectF rectf = new RectF(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
        paint.setColor(0x55000000);
        canvas.drawRoundRect(rectf, f2, f2, paint);
        rectf = new RectF(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight() - 2);
        paint.setColor(-1);
        canvas.drawRoundRect(rectf, f2, f2, paint);
        rectf = new RectF(f1, f1, (float)canvas.getWidth() - f1, (float)canvas.getHeight() - f1 - 2.0F);
        paint.setColor(routeviewmodel.getColor());
        canvas.drawRoundRect(rectf, f2 / 2.0F, f2 / 2.0F, paint);
        paint.setColor(routeviewmodel.getTextColor());
        i = (int)(((float)canvas.getWidth() - af[0]) / 2.0F);
        int j = (int)(((float)canvas.getHeight() - paint.descent() - paint.ascent()) / 2.0F);
        paint.setShadowLayer(0.1F, 0.0F, routeviewmodel.getTextShadowOffset(), routeviewmodel.getShadowColor());
        canvas.drawText(s, i, j, paint);
        return context;
    }

    public static Bitmap getStepIcon(int i, int j, int k)
    {
        int l = j / 2;
        int i1 = j / 4;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0);
        paint.setColor(0xff000000);
        canvas.drawRect(i1, l, j - i1, k - l, paint);
        paint.setColor(i);
        canvas.drawRect(i1 + 2, l, j - i1 - 2, k - l, paint);
        paint.setColor(0xff000000);
        canvas.drawCircle(l, l, l, paint);
        canvas.drawCircle(l, k - l, l, paint);
        paint.setColor(i);
        canvas.drawCircle(l, l, l - 2, paint);
        canvas.drawCircle(l, k - l, l - 2, paint);
        return bitmap;
    }
}
