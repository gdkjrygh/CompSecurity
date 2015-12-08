// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            Action, Image

public final class TappableImage extends GenericJson
{

    private Action action;
    private Image image;

    public TappableImage()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public TappableImage clone()
    {
        return (TappableImage)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Action getAction()
    {
        return action;
    }

    public Image getImage()
    {
        return image;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public TappableImage set(String s, Object obj)
    {
        return (TappableImage)super.set(s, obj);
    }

    public TappableImage setAction(Action action1)
    {
        action = action1;
        return this;
    }

    public TappableImage setImage(Image image1)
    {
        image = image1;
        return this;
    }
}
