// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.model;

import com.brightcove.player.util.ErrorUtil;
import java.util.Map;

// Referenced classes of package com.brightcove.player.model:
//            MetadataObject

public class CuePoint extends MetadataObject
    implements Comparable
{

    private PositionType b;
    private int c;
    private String d;

    public CuePoint(int i, String s, Map map)
    {
        super(map);
        b = PositionType.POINT_IN_TIME;
        c = i;
        d = s;
    }

    public CuePoint(PositionType positiontype, String s, Map map)
    {
        super(map);
        if (positiontype == PositionType.POINT_IN_TIME)
        {
            throw new IllegalArgumentException(ErrorUtil.getMessage("otherConstructor"));
        } else
        {
            b = positiontype;
            d = s;
            return;
        }
    }

    public int compareTo(CuePoint cuepoint)
    {
        if (b != PositionType.BEFORE || cuepoint.b == PositionType.BEFORE) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        if (b == PositionType.AFTER && cuepoint.b != PositionType.AFTER)
        {
            return 1;
        }
        if (b != PositionType.POINT_IN_TIME)
        {
            break; /* Loop/switch isn't completed */
        }
        if (cuepoint.b == PositionType.BEFORE)
        {
            return 1;
        }
        if (cuepoint.b == PositionType.AFTER || c < cuepoint.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (c > cuepoint.c)
        {
            return 1;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((CuePoint)obj);
    }

    public int getPosition()
    {
        if (b != PositionType.POINT_IN_TIME)
        {
            throw new IllegalStateException(String.format(ErrorUtil.getMessage("invalidPointInTime"), new Object[] {
                b.toString()
            }));
        } else
        {
            return c;
        }
    }

    public PositionType getPositionType()
    {
        return b;
    }

    public String getType()
    {
        return d;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("CuePoint {");
        stringbuilder.append("position:");
        stringbuilder.append(c);
        stringbuilder.append(" positionType:");
        Object obj;
        if (b == null)
        {
            obj = "null";
        } else
        {
            obj = b;
        }
        stringbuilder.append(obj);
        stringbuilder.append(" type:");
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = d;
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    private class PositionType extends Enum
    {

        public static final PositionType AFTER;
        public static final PositionType BEFORE;
        public static final PositionType POINT_IN_TIME;
        private static final PositionType a[];

        public static PositionType valueOf(String s)
        {
            return (PositionType)Enum.valueOf(com/brightcove/player/model/CuePoint$PositionType, s);
        }

        public static PositionType[] values()
        {
            return (PositionType[])a.clone();
        }

        static 
        {
            BEFORE = new PositionType("BEFORE", 0);
            POINT_IN_TIME = new PositionType("POINT_IN_TIME", 1);
            AFTER = new PositionType("AFTER", 2);
            a = (new PositionType[] {
                BEFORE, POINT_IN_TIME, AFTER
            });
        }

        private PositionType(String s, int i)
        {
            super(s, i);
        }
    }

}
