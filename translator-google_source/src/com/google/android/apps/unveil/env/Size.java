// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Size
    implements Serializable, Comparable
{

    public static final long serialVersionUID = 0x6ab7b04cf27fbe29L;
    public final int height;
    public final int width;

    public Size(int i, int j)
    {
        width = i;
        height = j;
    }

    public Size(Bitmap bitmap)
    {
        width = bitmap.getWidth();
        height = bitmap.getHeight();
    }

    public Size(android.hardware.Camera.Size size)
    {
        width = size.width;
        height = size.height;
    }

    public static final String dimensionsAsString(int i, int j)
    {
        return (new StringBuilder(23)).append(i).append("x").append(j).toString();
    }

    public static Size getRotatedSize(Size size, int i)
    {
        Size size1 = size;
        if (i % 180 != 0)
        {
            size1 = new Size(size.height, size.width);
        }
        return size1;
    }

    public static Size parseFromString(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = s.trim().split("x")).length == 2)
            {
                try
                {
                    s = new Size(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
                return s;
            }
        }
        return null;
    }

    public static String sizeListToString(List list)
    {
        String s = "";
        String s2 = s;
        if (list != null)
        {
            s2 = s;
            if (list.size() > 0)
            {
                String s1 = ((Size)list.get(0)).toString();
                int i = 1;
                do
                {
                    s2 = s1;
                    if (i >= list.size())
                    {
                        break;
                    }
                    s1 = String.valueOf(s1);
                    s2 = ((Size)list.get(i)).toString();
                    s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s2).length())).append(s1).append(",").append(s2).toString();
                    i++;
                } while (true);
            }
        }
        return s2;
    }

    public static List sizeStringToList(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            s = s.split(",");
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                Size size = parseFromString(s[i]);
                if (size != null)
                {
                    arraylist.add(size);
                }
            }

        }
        return arraylist;
    }

    public final float aspectRatio()
    {
        return (float)width / (float)height;
    }

    public int compareTo(Size size)
    {
        return width * height - size.width * size.height;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Size)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Size))
        {
            obj = (Size)obj;
            if (width == ((Size) (obj)).width && height == ((Size) (obj)).height)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return width * 32713 + height;
    }

    public String toString()
    {
        return dimensionsAsString(width, height);
    }
}
