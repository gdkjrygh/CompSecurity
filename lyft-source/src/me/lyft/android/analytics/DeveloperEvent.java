// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;


// Referenced classes of package me.lyft.android.analytics:
//            Event, GoogleTrackerExtra

public class DeveloperEvent extends Event
{

    GoogleTrackerExtra extra;

    public DeveloperEvent(String s)
    {
        super(s);
        extra = new GoogleTrackerExtra("developer");
        addTracker(extra);
    }

    public DeveloperEvent setLabel(String s)
    {
        extra.setLabel(s);
        return this;
    }
}
