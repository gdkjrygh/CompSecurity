// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.geo;

import java.util.ArrayList;
import java.util.List;
import me.lyft.android.common.INullable;
import me.lyft.android.common.Iterables;
import me.lyft.android.domain.location.Location;
import rx.functions.Func2;

public class Leg
    implements INullable
{

    private final List locations = new ArrayList();

    public Leg()
    {
    }

    public static Leg empty()
    {
        return NullLeg.getInstance();
    }

    public void addPosition(Location location)
    {
        locations.add(location);
    }

    public void addPositions(List list)
    {
        locations.addAll(list);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Leg))
        {
            return false;
        } else
        {
            obj = (Leg)obj;
            return Iterables.equals(locations, ((Leg) (obj)).locations, new Func2() {

                final Leg this$0;

                public Boolean call(Location location, Location location1)
                {
                    return Boolean.valueOf(location.hasSameCoordinates(location1));
                }

                public volatile Object call(Object obj1, Object obj2)
                {
                    return call((Location)obj1, (Location)obj2);
                }

            
            {
                this$0 = Leg.this;
                super();
            }
            });
        }
    }

    public List getLocations()
    {
        return locations;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullLeg extends Leg
    {

        private static final Leg INSTANCE = new NullLeg();

        public static Leg getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        NullLeg()
        {
        }
    }

}
