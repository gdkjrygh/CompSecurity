// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.model;

import com.pinterest.network.json.PinterestJsonObject;
import java.io.Serializable;

public class RelatedQueryItem
    implements Serializable, Comparable
{

    private String display;
    private String dominantColor;
    private String imageUri;
    private int position;
    private String term;

    public RelatedQueryItem()
    {
    }

    public int compareTo(Object obj)
    {
        if (obj instanceof RelatedQueryItem)
        {
            obj = (RelatedQueryItem)obj;
            if (getTerm() != null && ((RelatedQueryItem) (obj)).getTerm() != null)
            {
                return getTerm().compareTo(((RelatedQueryItem) (obj)).getTerm());
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof RelatedQueryItem))
            {
                return false;
            }
            obj = (RelatedQueryItem)obj;
            if (position != ((RelatedQueryItem) (obj)).getPosition())
            {
                return false;
            }
            if (display == null ? ((RelatedQueryItem) (obj)).display != null : !display.equals(((RelatedQueryItem) (obj)).display))
            {
                return false;
            }
            if (imageUri == null ? ((RelatedQueryItem) (obj)).imageUri != null : !imageUri.equals(((RelatedQueryItem) (obj)).imageUri))
            {
                return false;
            }
            if (term == null ? ((RelatedQueryItem) (obj)).term != null : !term.equals(((RelatedQueryItem) (obj)).term))
            {
                return false;
            }
            if (dominantColor == null ? ((RelatedQueryItem) (obj)).dominantColor != null : !dominantColor.equals(((RelatedQueryItem) (obj)).dominantColor))
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplay()
    {
        return display;
    }

    public String getDominantColor()
    {
        return dominantColor;
    }

    public String getImageUri()
    {
        return imageUri;
    }

    public int getPosition()
    {
        return position;
    }

    public String getTerm()
    {
        return term;
    }

    public int hashCode()
    {
        int l = 0;
        int i1 = position;
        int i;
        int j;
        int k;
        if (display != null)
        {
            i = display.hashCode();
        } else
        {
            i = 0;
        }
        if (imageUri != null)
        {
            j = imageUri.hashCode();
        } else
        {
            j = 0;
        }
        if (term != null)
        {
            k = term.hashCode();
        } else
        {
            k = 0;
        }
        if (dominantColor != null)
        {
            l = dominantColor.hashCode();
        }
        return (k + (j + (i + i1 * 31) * 31) * 31) * 31 + l;
    }

    public void setDisplay(String s)
    {
        display = s;
    }

    public void setDominantColor(String s)
    {
        dominantColor = s;
    }

    public void setImageUri(String s)
    {
        imageUri = s;
    }

    public void setItem(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setTerm(pinterestjsonobject.a("term", ""));
            setDisplay(pinterestjsonobject.a("display", ""));
            setPosition(pinterestjsonobject.a("position", 1));
            setImageUri(pinterestjsonobject.a("android_phone_blurred_url", ""));
            setDominantColor(pinterestjsonobject.a("dominant_color", ""));
            return;
        }
    }

    public void setPosition(int i)
    {
        position = i;
    }

    public void setTerm(String s)
    {
        term = s;
    }

    public String toString()
    {
        return term;
    }
}
