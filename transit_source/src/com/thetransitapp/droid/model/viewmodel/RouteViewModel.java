// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model.viewmodel;

import android.graphics.Color;
import com.thetransitapp.droid.model.Feed;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RouteImage;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class RouteViewModel
    implements Serializable
{

    private static final long serialVersionUID = 0x438c04e2265098a4L;
    private int annotationColor;
    private int arrowColor;
    private int arrowSelectedColor;
    private int arrowShadowColor;
    private int color;
    private Feed feed;
    private int glossColor;
    private String id;
    private String longName;
    private int pathColor;
    private Route route;
    private RouteImage routeImage;
    private int shadowColor;
    private String shortName;
    private int starColor;
    private int textColor;
    private int textSelectedColor;
    private float textShadowOffset;
    private int topGlossColor;
    private com.thetransitapp.droid.model.Route.RouteType type;

    public RouteViewModel()
    {
    }

    public RouteViewModel(Route route1)
    {
        route = route1;
        setType(route1.getType());
        id = route1.getId();
        setShortName(route1.getShortName());
        setLongName(route1.getLongName());
        setColor(route1.getColor());
        createColorsDerivedFromMainColors();
        setTextColor(route1.getTextColor());
        createColorsDerivedFromTextColors();
    }

    private int baseGlossColor()
    {
        int i = Color.red(color);
        int j = Color.green(color);
        int k = Color.blue(color);
        return Color.argb(255, componentAfterOverlay(i), componentAfterOverlay(j), componentAfterOverlay(k));
    }

    private int colorByInterpolatingColors(int i, int j, double d)
    {
        int j1 = Color.red(i);
        int l = Color.green(i);
        int k = Color.blue(i);
        i = Color.alpha(i);
        int l1 = Color.red(j);
        int k1 = Color.green(j);
        int i1 = Color.blue(j);
        j = Color.alpha(j);
        j1 = (int)((double)j1 + (double)(l1 - j1) * d);
        l = (int)((double)l + (double)(k1 - l) * d);
        k = (int)((double)k + (double)(i1 - k) * d);
        return Color.argb((int)((double)i + (double)(j - i) * d), j1, l, k);
    }

    private int componentAfterOverlay(int i)
    {
        if (i > 127)
        {
            return (255 - i) * 2 + (i - (255 - i));
        } else
        {
            return i * 2;
        }
    }

    private void createColorsDerivedFromMainColors()
    {
        int i = baseGlossColor();
        topGlossColor = colorByInterpolatingColors(i, color, 0.5D);
        glossColor = colorByInterpolatingColors(i, color, 0.75D);
        if (shouldUseWhiteForContrast(color))
        {
            starColor = colorByInterpolatingColors(color, 0xff000000, 0.40000000000000002D);
            return;
        } else
        {
            starColor = colorByInterpolatingColors(color, 0xff000000, 0.29999999999999999D);
            return;
        }
    }

    private void createColorsDerivedFromTextColors()
    {
        if (shouldUseWhiteForContrast(textColor))
        {
            shadowColor = topGlossColor;
            pathColor = 0xff000000;
            annotationColor = Color.rgb(38, 38, 38);
            textShadowOffset = 2.0F;
        } else
        {
            shadowColor = 0xff000000;
            pathColor = color;
            annotationColor = color;
            textShadowOffset = -2F;
        }
        arrowColor = colorByInterpolatingColors(textColor, color, 0.69999999999999996D);
        arrowShadowColor = colorByInterpolatingColors(shadowColor, color, 0.69999999999999996D);
        textSelectedColor = colorByInterpolatingColors(textColor, shadowColor, 0.29999999999999999D);
        arrowSelectedColor = colorByInterpolatingColors(arrowColor, shadowColor, 0.29999999999999999D);
    }

    private boolean shouldUseWhiteForContrast(int i)
    {
        int j = Color.red(i);
        int k = Color.green(i);
        i = Color.blue(i);
        return 127D >= 0.21260000000000001D * (double)j + 0.71519999999999995D * (double)k + 0.0722D * (double)i;
    }

    public int getAnnotationColor()
    {
        return annotationColor;
    }

    public int getArrowColor()
    {
        return arrowColor;
    }

    public int getArrowSelectedColor()
    {
        return arrowSelectedColor;
    }

    public int getArrowShadowColor()
    {
        return arrowShadowColor;
    }

    public int getColor()
    {
        return color;
    }

    public Feed getFeed()
    {
        return feed;
    }

    public int getGlossColor()
    {
        return glossColor;
    }

    public String getId()
    {
        return id;
    }

    public String getLongName()
    {
        return longName;
    }

    public int getPathColor()
    {
        return pathColor;
    }

    public Route getRoute()
    {
        return route;
    }

    public RouteImage getRouteImage()
    {
        if (routeImage != null || feed == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = feed.getRouteImages().iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return routeImage;
_L3:
        RouteImage routeimage = (RouteImage)iterator.next();
        if (routeimage.getRouteIds().contains(id))
        {
            return routeimage;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int getShadowColor()
    {
        return shadowColor;
    }

    public String getShortName()
    {
        return shortName;
    }

    public int getStarColor()
    {
        return starColor;
    }

    public int getTextColor()
    {
        return textColor;
    }

    public int getTextSelectedColor()
    {
        return textSelectedColor;
    }

    public float getTextShadowOffset()
    {
        return textShadowOffset;
    }

    public int getTopGlossColor()
    {
        return topGlossColor;
    }

    public com.thetransitapp.droid.model.Route.RouteType getType()
    {
        return type;
    }

    public void setAnnotationColor(int i)
    {
        annotationColor = i;
    }

    public void setArrowColor(int i)
    {
        arrowColor = i;
    }

    public void setArrowSelectedColor(int i)
    {
        arrowSelectedColor = i;
    }

    public void setArrowShadowColor(int i)
    {
        arrowShadowColor = i;
    }

    public void setColor(int i)
    {
        color = i;
    }

    public void setFeed(Feed feed1)
    {
        feed = feed1;
    }

    public void setGlossColor(int i)
    {
        glossColor = i;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLongName(String s)
    {
        longName = s;
    }

    public void setPathColor(int i)
    {
        pathColor = i;
    }

    public void setRoute(Route route1)
    {
        route = route1;
    }

    public void setRouteImage(RouteImage routeimage)
    {
        routeImage = routeimage;
    }

    public void setShadowColor(int i)
    {
        shadowColor = i;
    }

    public void setShortName(String s)
    {
        shortName = s;
    }

    public void setStarColor(int i)
    {
        starColor = i;
    }

    public void setTextColor(int i)
    {
        textColor = i;
    }

    public void setTextSelectedColor(int i)
    {
        textSelectedColor = i;
    }

    public void setTextShadowOffset(float f)
    {
        textShadowOffset = f;
    }

    public void setTopGlossColor(int i)
    {
        topGlossColor = i;
    }

    public void setType(com.thetransitapp.droid.model.Route.RouteType routetype)
    {
        type = routetype;
    }
}
