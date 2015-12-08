// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            MediaEntityJSONImpl

static class resize
    implements twitter4j.JSONImpl.Size
{

    private static final long serialVersionUID = 0x787c23aefe30ba2dL;
    int height;
    int resize;
    int width;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof resize))
            {
                return false;
            }
            obj = (resize)obj;
            if (height != ((height) (obj)).height)
            {
                return false;
            }
            if (resize != ((resize) (obj)).resize)
            {
                return false;
            }
            if (width != ((width) (obj)).width)
            {
                return false;
            }
        }
        return true;
    }

    public int getHeight()
    {
        return height;
    }

    public int getResize()
    {
        return resize;
    }

    public int getWidth()
    {
        return width;
    }

    public int hashCode()
    {
        return (width * 31 + height) * 31 + resize;
    }

    public String toString()
    {
        return "Size{width=" + width + ", height=" + height + ", resize=" + resize + '}';
    }

    (JSONObject jsonobject)
        throws JSONException
    {
        width = jsonobject.getInt("w");
        height = jsonobject.getInt("h");
        int i;
        if ("fit".equals(jsonobject.getString("resize")))
        {
            i = 100;
        } else
        {
            i = 101;
        }
        resize = i;
    }
}
