// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Size
    implements Serializable, Comparable
{

    public static final int LARGE = 4;
    public static final int LARGE_1600 = 13;
    public static final int LARGE_2048 = 14;
    public static final int LARGE_SQUARE = 6;
    public static final int MEDIUM = 3;
    public static final int MEDIUM_640 = 11;
    public static final int MEDIUM_800 = 12;
    public static final int MOBILE_MP4 = 9;
    public static final int ORIGINAL = 5;
    public static final int SITE_MP4 = 8;
    public static final int SMALL = 2;
    public static final int SMALL_320 = 10;
    public static final int SQUARE = 1;
    public static final int THUMB = 0;
    public static final int VIDEO_PLAYER = 7;
    public static final long serialVersionUID = 12L;
    private int height;
    private int label;
    private String source;
    private String url;
    private int width;

    public Size()
    {
    }

    public int compareTo(Size size)
    {
        return getLongestDimension() - size.getLongestDimension();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Size)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Method amethod[];
        int i;
        obj = (Size)obj;
        amethod = getClass().getMethods();
        i = 0;
_L6:
        if (i >= amethod.length)
        {
            return true;
        }
        if (!StringUtilities.getterPattern.matcher(amethod[i].getName()).find() || amethod[i].getName().equals("getClass"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        String s;
        obj1 = amethod[i].invoke(this, null);
        obj2 = amethod[i].invoke(obj, null);
        s = amethod[i].getReturnType().toString();
        if (s.indexOf("class") != 0) goto _L4; else goto _L3
_L3:
        if (obj1 == null || obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj1.equals(obj2)) goto _L1; else goto _L5
_L4:
        if (s.equals("int"))
        {
            if (!((Integer)obj1).equals((Integer)obj2))
            {
                return false;
            }
        } else
        {
            try
            {
                System.out.println((new StringBuilder(String.valueOf(amethod[i].getName()))).append("|").append(amethod[i].getReturnType().toString()).toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                System.out.println((new StringBuilder("Size equals ")).append(amethod[i].getName()).append(" ").append(illegalaccessexception).toString());
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("Size equals ")).append(amethod[i].getName()).append(" ").append(exception).toString());
            }
        }
_L5:
        i++;
          goto _L6
    }

    public int getHeight()
    {
        return height;
    }

    public int getLabel()
    {
        return label;
    }

    public int getLongestDimension()
    {
        if (label == 1)
        {
            return 75;
        }
        if (label == 0)
        {
            return 100;
        }
        if (label == 6)
        {
            return 150;
        }
        if (label == 2)
        {
            return 240;
        }
        if (label == 10)
        {
            return 320;
        }
        if (label == 3)
        {
            return 500;
        }
        if (label == 11)
        {
            return 640;
        }
        if (label == 12)
        {
            return 800;
        }
        if (label == 4)
        {
            return 1024;
        }
        if (label == 13)
        {
            return 1600;
        }
        if (label == 14)
        {
            return 2048;
        } else
        {
            return Math.max(getWidth(), getHeight());
        }
    }

    public String getSource()
    {
        return source;
    }

    public String getUrl()
    {
        return url;
    }

    public int getWidth()
    {
        return width;
    }

    public int hashCode()
    {
        int j = (new Integer(label)).hashCode() + 1 + (new Integer(width)).hashCode() + (new Integer(height)).hashCode();
        int i = j;
        if (source != null)
        {
            i = j + source.hashCode();
        }
        j = i;
        if (url != null)
        {
            j = i + url.hashCode();
        }
        return j;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setHeight(String s)
    {
        if (s != null)
        {
            setHeight(Integer.parseInt(s));
        }
    }

    public void setLabel(int i)
    {
        label = i;
    }

    public void setLabel(String s)
    {
        if (s.equals("Square"))
        {
            setLabel(1);
        } else
        {
            if (s.equals("Large Square"))
            {
                setLabel(6);
                return;
            }
            if (s.equals("Thumbnail"))
            {
                setLabel(0);
                return;
            }
            if (s.equals("Small"))
            {
                setLabel(2);
                return;
            }
            if (s.equals("Small 320"))
            {
                setLabel(10);
                return;
            }
            if (s.equals("Medium"))
            {
                setLabel(3);
                return;
            }
            if (s.equals("Medium 640"))
            {
                setLabel(11);
                return;
            }
            if (s.equals("Medium 800"))
            {
                setLabel(12);
                return;
            }
            if (s.equals("Large"))
            {
                setLabel(4);
                return;
            }
            if (s.equals("Large 1600"))
            {
                setLabel(13);
                return;
            }
            if (s.equals("Large 2048"))
            {
                setLabel(14);
                return;
            }
            if (s.equals("Original"))
            {
                setLabel(5);
                return;
            }
            if (s.equals("Video Player"))
            {
                setLabel(7);
                return;
            }
            if (s.equals("Site MP4"))
            {
                setLabel(8);
                return;
            }
            if (s.equals("Mobile MP4"))
            {
                setLabel(9);
                return;
            }
        }
    }

    public void setSource(String s)
    {
        source = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setWidth(int i)
    {
        width = i;
    }

    public void setWidth(String s)
    {
        if (s != null)
        {
            setWidth(Integer.parseInt(s));
        }
    }
}
