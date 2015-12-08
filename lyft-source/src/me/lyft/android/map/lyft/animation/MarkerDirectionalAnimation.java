// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.animation.LinearInterpolator;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.map.core.markers.IMarker;

// Referenced classes of package me.lyft.android.map.lyft.animation:
//            LatLngInterpolator

public final class MarkerDirectionalAnimation
    implements android.animation.Animator.AnimatorListener, android.animation.ValueAnimator.AnimatorUpdateListener, Animatable
{

    static final long DEFAULT_DURATION = 1000L;
    static final TimeInterpolator INTERPOLATOR = new LinearInterpolator();
    static final LatLngInterpolator LAT_LNG_INTERPOLATOR;
    static final float STALE_TIMESTAMP_TOLERANCE;
    final ValueAnimator animator = new ValueAnimator();
    float bearing;
    float endBearing;
    Location endLocation;
    final IMarker marker;
    private long mostRecentTimeStamp;
    final ArrayDeque positionsDeque = new ArrayDeque();
    float startBearing;
    Location startLocation;

    public MarkerDirectionalAnimation(IMarker imarker)
    {
        mostRecentTimeStamp = -1L;
        marker = imarker;
        animator.setFloatValues(new float[] {
            0.0F, 1.0F
        });
        animator.setInterpolator(INTERPOLATOR);
        animator.setRepeatCount(-1);
        animator.addListener(this);
        animator.addUpdateListener(this);
        animator.setDuration(1000L);
    }

    private boolean next()
    {
        if (positionsDeque.size() <= 1)
        {
            return false;
        }
        startLocation = (Location)positionsDeque.pop();
        endLocation = (Location)positionsDeque.peek();
        startBearing = obtainBearingOrDefault(startLocation, -1F);
        endBearing = obtainBearingOrDefault(endLocation, -1F);
        if (startBearing != -1F && endBearing != -1F)
        {
            bearing = ((endLocation.getBearing().floatValue() - startLocation.getBearing().floatValue()) % 360F + 540F) % 360F - 180F;
        } else
        {
            bearing = (-1.0F / 0.0F);
        }
        return true;
    }

    private static float obtainBearingOrDefault(Location location, float f)
    {
        float f1 = f;
        if (location != null)
        {
            location = location.getBearing();
            f1 = f;
            if (location != null)
            {
                f1 = location.floatValue();
            }
        }
        return f1;
    }

    void addLocation(Location location)
    {
        Long long1 = location.getTime();
        if (long1 != null && long1.longValue() > mostRecentTimeStamp)
        {
            mostRecentTimeStamp = long1.longValue();
            positionsDeque.addLast(location);
        }
    }

    public void addLocations(List list)
    {
        if (!list.isEmpty())
        {
            if (isLocationStale((Location)list.get(0)))
            {
                forceUpdateLocation((Location)list.get(list.size() - 1));
                return;
            }
            list = list.iterator();
            while (list.hasNext()) 
            {
                addLocation((Location)list.next());
            }
        }
    }

    public void forceUpdateLocation(Location location)
    {
        stop();
        startLocation = null;
        endLocation = location;
        mostRecentTimeStamp = location.getTime().longValue();
        positionsDeque.clear();
        marker.setPosition(location.getLat().doubleValue(), location.getLng().doubleValue());
    }

    public boolean isLocationStale(Location location)
    {
        location = location.getTime();
        return mostRecentTimeStamp != -1L && location != null && (float)(location.longValue() - mostRecentTimeStamp) > STALE_TIMESTAMP_TOLERANCE;
    }

    public boolean isRunning()
    {
        return animator.isRunning();
    }

    public void onAnimationCancel(Animator animator1)
    {
    }

    public void onAnimationEnd(Animator animator1)
    {
    }

    public void onAnimationRepeat(Animator animator1)
    {
        if (!next())
        {
            stop();
        }
    }

    public void onAnimationStart(Animator animator1)
    {
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        if (valueanimator.isRunning())
        {
            float f = valueanimator.getAnimatedFraction();
            LAT_LNG_INTERPOLATOR.interpolate(marker, f, startLocation, endLocation);
            if (bearing != (-1.0F / 0.0F))
            {
                float f1 = startBearing;
                float f2 = bearing;
                marker.setRotation(f * f2 + f1);
            }
        }
    }

    public void setDuration(long l)
    {
        animator.setDuration(l);
    }

    public void start()
    {
label0:
        {
            if (!animator.isStarted() && positionsDeque.size() >= 2)
            {
                if (next())
                {
                    break label0;
                }
                stop();
            }
            return;
        }
        animator.start();
    }

    public void stop()
    {
        if (animator.isRunning())
        {
            animator.end();
        }
    }

    static 
    {
        STALE_TIMESTAMP_TOLERANCE = TimeUnit.SECONDS.toMillis(10L);
        LAT_LNG_INTERPOLATOR = LatLngInterpolator.SPHERICAL;
    }
}
