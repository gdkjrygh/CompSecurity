// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.video.VideoSurfacePriority;
import com.spotify.mobile.android.video.VideoSurfaceView;
import java.util.Comparator;

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (VideoSurfaceView)obj;
        return ((VideoSurfaceView)obj1).e.compareTo(((VideoSurfaceView) (obj)).e);
    }

    ()
    {
    }
}
