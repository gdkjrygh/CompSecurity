// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;


public abstract class Request
{

    private boolean isNotification;
    private boolean isWearable;
    private boolean isWidget;

    public Request()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Request)obj;
            if (isNotification != ((Request) (obj)).isNotification)
            {
                return false;
            }
            if (isWidget != ((Request) (obj)).isWidget)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        char c1 = '\u04CF';
        char c;
        if (isNotification)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!isWidget)
        {
            c1 = '\u04D5';
        }
        return (c + 31) * 31 + c1;
    }

    public boolean isNotification()
    {
        return isNotification;
    }

    public boolean isWearable()
    {
        return isWearable;
    }

    public boolean isWidget()
    {
        return isWidget;
    }

    public void setNotification(boolean flag)
    {
        isNotification = flag;
    }

    public void setWearable(boolean flag)
    {
        isWearable = flag;
    }

    public void setWidget(boolean flag)
    {
        isWidget = flag;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Request [isNotification=").append(isNotification).append(", isWidget=").append(isWidget).append("]").toString();
    }
}
