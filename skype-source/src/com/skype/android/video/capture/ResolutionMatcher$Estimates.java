// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.capture;


// Referenced classes of package com.skype.android.video.capture:
//            ResolutionMatcher

private static class crop
{

    public final float crop;
    public final float zoom;

    public String toString()
    {
        return (new StringBuilder("zoom=")).append((int)(zoom * 100F)).append("%, crop=").append((int)(crop * 100F)).append("%").toString();
    }

    public A(float f, float f1)
    {
        zoom = f;
        crop = f1;
    }
}
