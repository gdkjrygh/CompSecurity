// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.graphics.Point;
import android.location.Location;
import com.fitbit.maps.CircleOptions;
import com.fitbit.maps.LatLng;
import com.fitbit.maps.PolylineOptions;
import com.fitbit.maps.f;
import com.fitbit.maps.q;
import com.fitbit.maps.s;
import com.fitbit.runtrack.data.ExerciseEvent;
import com.fitbit.runtrack.data.ExerciseSegment;
import com.fitbit.runtrack.data.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class h
{

    private static final float a = 0.5F;
    private static final float b = 1F;
    private com.fitbit.maps.h c;
    private q d;
    private f e;
    private final int f;
    private final int g;
    private final int h;
    private Location i;

    public h(int j, int k, int l)
    {
        f = j;
        g = k;
        h = l;
    }

    private List a(b b1, ExerciseSegment exercisesegment, List list)
    {
        List list1 = list;
        if (list.isEmpty())
        {
            list1 = b1.b(exercisesegment);
        }
        return list1;
    }

    private void a(ExerciseEvent exerciseevent, ExerciseSegment exercisesegment)
    {
        if (e == null)
        {
            e = b(exerciseevent);
            return;
        }
        if (d == null)
        {
            d = d(Collections.singletonList(exerciseevent));
            return;
        } else
        {
            b(Collections.singletonList(exerciseevent));
            return;
        }
    }

    private f b(ExerciseEvent exerciseevent)
    {
        if (c == null)
        {
            return null;
        } else
        {
            exerciseevent = exerciseevent.location;
            return c.a((new CircleOptions()).a(new LatLng(exerciseevent.getLatitude(), exerciseevent.getLongitude())).a((int)(0.75F * (float)g)).a(f).a(h).b(-1).b(1.0F));
        }
    }

    private void b(List list)
    {
        list = c(list);
        List list1 = d.c();
        list1.addAll(list);
        d.a(list1);
    }

    private static ArrayList c(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (ExerciseEvent)list.next();
            if (((ExerciseEvent) (obj)).type == com.fitbit.runtrack.data.ExerciseEvent.Type.b)
            {
                obj = ((ExerciseEvent) (obj)).location;
                arraylist.add(new LatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude()));
            }
        } while (true);
        return arraylist;
    }

    private q d(List list)
    {
        if (c != null)
        {
            PolylineOptions polylineoptions = (new PolylineOptions()).a(f).a(g).b(true).b(0.5F);
            list = c(list);
            if (list.size() != 0)
            {
                polylineoptions.a(list);
                return c.a(polylineoptions);
            }
        }
        return null;
    }

    public void a()
    {
        if (c != null && e != null)
        {
            Object obj = c.n().a(e.d());
            obj.x = ((Point) (obj)).x + g;
            obj = c.n().a(((Point) (obj)));
            if (obj != null)
            {
                float af[] = new float[1];
                Location.distanceBetween(((LatLng) (obj)).a, ((LatLng) (obj)).b, e.d().a, e.d().b, af);
                if (af[0] > 0.0F)
                {
                    e.a(af[0]);
                    return;
                }
            }
        }
    }

    public void a(com.fitbit.maps.h h1)
    {
        c = h1;
    }

    public void a(ExerciseEvent exerciseevent)
    {
        if (e == null)
        {
            e = b(exerciseevent);
            return;
        }
        if (d == null)
        {
            d = d(Collections.singletonList(exerciseevent));
            return;
        } else
        {
            b(Collections.singletonList(exerciseevent));
            return;
        }
    }

    public void a(b b1, ExerciseEvent exerciseevent, List list)
    {
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ExerciseSegment exercisesegment = (ExerciseSegment)iterator.next();
            a(b1, exercisesegment);
            if (!exercisesegment.a())
            {
                list = exercisesegment;
            }
        } while (true);
        if (list != null)
        {
            a(exerciseevent, ((ExerciseSegment) (list)));
            i = exerciseevent.location;
        }
    }

    public void a(b b1, ExerciseSegment exercisesegment)
    {
        Object obj;
        List list;
        list = Collections.emptyList();
        obj = list;
        if (e != null) goto _L2; else goto _L1
_L1:
        list = a(b1, exercisesegment, list);
        if (list.isEmpty()) goto _L4; else goto _L3
_L3:
        Iterator iterator = list.iterator();
_L7:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = (ExerciseEvent)iterator.next();
        if (Double.isNaN(((ExerciseEvent) (obj)).location.getLatitude()) || Double.isNaN(((ExerciseEvent) (obj)).location.getLongitude())) goto _L6; else goto _L5
_L5:
        if (obj != null)
        {
            e = b(((ExerciseEvent) (obj)));
        }
_L4:
        obj = list;
_L2:
        if (d == null)
        {
            b1 = a(b1, exercisesegment, ((List) (obj)));
            if (!b1.isEmpty())
            {
                d = d(b1);
            }
        }
        return;
_L6:
        i = ((ExerciseEvent) (obj)).location;
          goto _L7
        obj = null;
          goto _L5
    }

    public void a(List list)
    {
        if (e == null)
        {
            e = b((ExerciseEvent)list.get(0));
        }
        if (d == null)
        {
            d = d(list);
            return;
        } else
        {
            b(list);
            return;
        }
    }

    public Location b()
    {
        return i;
    }
}
