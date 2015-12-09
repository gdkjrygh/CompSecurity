// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.graphics.Point;
import android.util.Log;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.List;

public abstract class SizeSelectionStrategy extends Enum
{

    private static final SizeSelectionStrategy $VALUES[];
    public static final SizeSelectionStrategy LARGEST_POSSIBLE;
    public static final SizeSelectionStrategy MIN_WIDTH_THEN_RATIO;
    public static final SizeSelectionStrategy RATIO;
    public static final SizeSelectionStrategy RATIO_AND_HEIGHT;

    private SizeSelectionStrategy(String s, int i)
    {
        super(s, i);
    }


    protected static boolean isCloserToScreenSize(android.hardware.Camera.Size size, android.hardware.Camera.Size size1, Point point)
    {
        int i = Math.abs(point.x * point.y - size1.width * size1.height);
        return Math.abs(point.x * point.y - size.width * size.height) < i;
    }

    protected static boolean isCloserToTargetSize(android.hardware.Camera.Size size, android.hardware.Camera.Size size1, double d)
    {
        return d == 0.0D && size.width > size1.width;
    }

    public static SizeSelectionStrategy valueOf(String s)
    {
        return (SizeSelectionStrategy)Enum.valueOf(com/google/android/libraries/commerce/ocr/capture/SizeSelectionStrategy, s);
    }

    public static SizeSelectionStrategy[] values()
    {
        return (SizeSelectionStrategy[])$VALUES.clone();
    }

    public abstract android.hardware.Camera.Size getClosest(List list, Predicate predicate, Point point, Point point1);

    static 
    {
        RATIO_AND_HEIGHT = new SizeSelectionStrategy("RATIO_AND_HEIGHT", 0) {

            public final android.hardware.Camera.Size getClosest(List list, Predicate predicate, Point point, Point point1)
            {
                int i = point.x;
                int j = point.y;
                Log.v("SizeSelectionStrategy", (new StringBuilder(36)).append("screen size: ").append(i).append("*").append(j).toString());
                i = point1.x;
                j = point1.y;
                Log.v("SizeSelectionStrategy", (new StringBuilder(44)).append("target preview size: ").append(i).append("*").append(j).toString());
                float f2 = (float)Math.max(point.x, point.y) / (float)Math.min(point.x, point.y);
                point = null;
                float f = 3.402823E+38F;
                Iterator iterator = list.iterator();
                list = point;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    point = (android.hardware.Camera.Size)iterator.next();
                    if (predicate.apply(point))
                    {
                        float f1 = Math.abs((float)(((android.hardware.Camera.Size) (point)).height - point1.y) / (float)point1.y) + Math.abs(((float)((android.hardware.Camera.Size) (point)).width / (float)((android.hardware.Camera.Size) (point)).height - f2) / f2);
                        if (f1 < f)
                        {
                            f = f1;
                            list = point;
                        }
                    }
                } while (true);
                return list;
            }

        };
        RATIO = new SizeSelectionStrategy("RATIO", 1) {

            public final android.hardware.Camera.Size getClosest(List list, Predicate predicate, Point point, Point point1)
            {
                double d2 = (double)Math.max(point.x, point.y) / (double)Math.min(point.x, point.y);
                Log.d("SizeSelectionStrategy", String.format("Preview size to match: %s, ratio: %s", new Object[] {
                    point, Double.toString(d2)
                }));
                point = null;
                double d = 1.7976931348623157E+308D;
                point1 = list.iterator();
                list = point;
                do
                {
                    if (!point1.hasNext())
                    {
                        break;
                    }
                    point = (android.hardware.Camera.Size)point1.next();
                    if (predicate.apply(point))
                    {
                        double d1 = Math.abs((double)((android.hardware.Camera.Size) (point)).width / (double)((android.hardware.Camera.Size) (point)).height - d2);
                        boolean flag;
                        if (d1 < d)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag || isCloserToTargetSize(point, list, d1))
                        {
                            list = point;
                            d = d1;
                        }
                    }
                } while (true);
                return list;
            }

        };
        LARGEST_POSSIBLE = new SizeSelectionStrategy("LARGEST_POSSIBLE", 2) {

            public final android.hardware.Camera.Size getClosest(List list, Predicate predicate, Point point, Point point1)
            {
                if (!list.isEmpty()) goto _L2; else goto _L1
_L1:
                predicate = null;
_L4:
                return predicate;
_L2:
                predicate = (android.hardware.Camera.Size)list.get(0);
                point = list.iterator();
                list = predicate;
                do
                {
                    predicate = list;
                    if (!point.hasNext())
                    {
                        continue;
                    }
                    predicate = (android.hardware.Camera.Size)point.next();
                    if (((android.hardware.Camera.Size) (predicate)).width * ((android.hardware.Camera.Size) (predicate)).height > ((android.hardware.Camera.Size) (list)).width * ((android.hardware.Camera.Size) (list)).height)
                    {
                        list = predicate;
                    }
                } while (true);
                if (true) goto _L4; else goto _L3
_L3:
            }

        };
        MIN_WIDTH_THEN_RATIO = new SizeSelectionStrategy("MIN_WIDTH_THEN_RATIO", 3) {

            public final android.hardware.Camera.Size getClosest(List list, Predicate predicate, Point point, Point point1)
            {
                double d2 = point1.x / point1.y;
                android.hardware.Camera.Size size = null;
                double d = 1.7976931348623157E+308D;
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    android.hardware.Camera.Size size1 = (android.hardware.Camera.Size)iterator.next();
                    if (size1.width >= point1.x)
                    {
                        double d1 = Math.abs((double)size1.width / (double)size1.height - d2);
                        if (d1 < d || d1 == d && isCloserToScreenSize(size1, size, point))
                        {
                            size = size1;
                            d = d1;
                        }
                    }
                } while (true);
                android.hardware.Camera.Size size2 = size;
                if (size == null)
                {
                    size2 = LARGEST_POSSIBLE.getClosest(list, predicate, point, point1);
                }
                return size2;
            }

        };
        $VALUES = (new SizeSelectionStrategy[] {
            RATIO_AND_HEIGHT, RATIO, LARGEST_POSSIBLE, MIN_WIDTH_THEN_RATIO
        });
    }
}
