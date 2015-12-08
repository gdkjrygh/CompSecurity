// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.status;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.status:
//            Status

public abstract class StatusBase
    implements Status
{

    private static final List EMPTY_LIST = new ArrayList(0);
    List childrenList;
    long date;
    int level;
    final String message;
    final Object origin;
    Throwable throwable;

    StatusBase(int i, String s, Object obj)
    {
        this(i, s, obj, null);
    }

    StatusBase(int i, String s, Object obj, Throwable throwable1)
    {
        level = i;
        message = s;
        origin = obj;
        throwable = throwable1;
        date = System.currentTimeMillis();
    }

    public void add(Status status)
    {
        this;
        JVM INSTR monitorenter ;
        if (status != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("Null values are not valid Status.");
        status;
        this;
        JVM INSTR monitorexit ;
        throw status;
        if (childrenList == null)
        {
            childrenList = new ArrayList();
        }
        childrenList.add(status);
        this;
        JVM INSTR monitorexit ;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (StatusBase)obj;
        if (level != ((StatusBase) (obj)).level)
        {
            return false;
        }
        if (message != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((StatusBase) (obj)).message == null) goto _L1; else goto _L3
_L3:
        return false;
        if (message.equals(((StatusBase) (obj)).message)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Long getDate()
    {
        return Long.valueOf(date);
    }

    public int getEffectiveLevel()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator1;
        int i;
        i = level;
        iterator1 = iterator();
_L1:
        int j;
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        j = ((Status)iterator1.next()).getEffectiveLevel();
        if (j > i)
        {
            i = j;
        }
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int getLevel()
    {
        return level;
    }

    public String getMessage()
    {
        return message;
    }

    public Throwable getThrowable()
    {
        return throwable;
    }

    public boolean hasChildren()
    {
        this;
        JVM INSTR monitorenter ;
        if (childrenList == null) goto _L2; else goto _L1
_L1:
        int i = childrenList.size();
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
        int j = level;
        int i;
        if (message == null)
        {
            i = 0;
        } else
        {
            i = message.hashCode();
        }
        return i + (j + 31) * 31;
    }

    public Iterator iterator()
    {
        this;
        JVM INSTR monitorenter ;
        if (childrenList == null) goto _L2; else goto _L1
_L1:
        Iterator iterator1 = childrenList.iterator();
_L4:
        this;
        JVM INSTR monitorexit ;
        return iterator1;
_L2:
        iterator1 = EMPTY_LIST.iterator();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        getEffectiveLevel();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 114
    //                   1 124
    //                   2 134;
           goto _L1 _L2 _L3 _L4
_L1:
        if (origin != null)
        {
            stringbuffer.append(" in ");
            stringbuffer.append(origin);
            stringbuffer.append(" -");
        }
        stringbuffer.append(" ");
        stringbuffer.append(message);
        if (throwable != null)
        {
            stringbuffer.append(" ");
            stringbuffer.append(throwable);
        }
        return stringbuffer.toString();
_L2:
        stringbuffer.append("INFO");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuffer.append("WARN");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuffer.append("ERROR");
        if (true) goto _L1; else goto _L5
_L5:
    }

}
