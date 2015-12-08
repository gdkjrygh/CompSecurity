// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j.helpers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.slf4j.Marker;

public class BasicMarker
    implements Marker
{

    private static String CLOSE = " ]";
    private static String OPEN = "[ ";
    private static String SEP = ", ";
    private static final long serialVersionUID = 0x1908ed5291b507e7L;
    private final String name;
    private List refereceList;

    BasicMarker(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("A merker name cannot be null");
        } else
        {
            name = s;
            return;
        }
    }

    public void add(Marker marker)
    {
        this;
        JVM INSTR monitorenter ;
        if (marker != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("A null value cannot be added to a Marker as reference.");
        marker;
        this;
        JVM INSTR monitorexit ;
        throw marker;
        boolean flag = contains(marker);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (marker.contains(this)) goto _L1; else goto _L3
_L3:
        if (refereceList == null)
        {
            refereceList = new Vector();
        }
        refereceList.add(marker);
          goto _L1
    }

    public boolean contains(String s)
    {
        boolean flag1;
        flag1 = false;
        if (s == null)
        {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (!name.equals(s)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!hasReferences())
        {
            continue;
        }
        int i = 0;
        do
        {
            flag = flag1;
            if (i >= refereceList.size())
            {
                continue;
            }
            if (((Marker)refereceList.get(i)).contains(s))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean contains(Marker marker)
    {
        boolean flag1;
        flag1 = false;
        if (marker == null)
        {
            throw new IllegalArgumentException("Other cannot be null");
        }
        if (!equals(marker)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!hasReferences())
        {
            continue;
        }
        int i = 0;
        do
        {
            flag = flag1;
            if (i >= refereceList.size())
            {
                continue;
            }
            if (((Marker)refereceList.get(i)).contains(marker))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof Marker)
                {
                    obj = (Marker)obj;
                    return name.equals(((Marker) (obj)).getName());
                }
            }
        }
        return flag;
    }

    public String getName()
    {
        return name;
    }

    public boolean hasChildren()
    {
        return hasReferences();
    }

    public boolean hasReferences()
    {
        this;
        JVM INSTR monitorenter ;
        if (refereceList == null) goto _L2; else goto _L1
_L1:
        int i = refereceList.size();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

    public Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        if (refereceList == null) goto _L2; else goto _L1
_L1:
        Iterator iterator1 = refereceList.iterator();
_L4:
        this;
        JVM INSTR monitorexit ;
        return iterator1;
_L2:
        iterator1 = Collections.EMPTY_LIST.iterator();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean remove(Marker marker)
    {
        this;
        JVM INSTR monitorenter ;
        List list = refereceList;
        if (list != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int j = refereceList.size();
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!marker.equals((Marker)refereceList.get(i)))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        refereceList.remove(i);
        flag = true;
        continue; /* Loop/switch isn't completed */
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        marker;
        throw marker;
    }

    public String toString()
    {
        if (!hasReferences())
        {
            return getName();
        }
        Iterator iterator1 = iterator();
        StringBuffer stringbuffer = new StringBuffer(getName());
        stringbuffer.append(' ').append(OPEN);
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            stringbuffer.append(((Marker)iterator1.next()).getName());
            if (iterator1.hasNext())
            {
                stringbuffer.append(SEP);
            }
        } while (true);
        stringbuffer.append(CLOSE);
        return stringbuffer.toString();
    }

}
