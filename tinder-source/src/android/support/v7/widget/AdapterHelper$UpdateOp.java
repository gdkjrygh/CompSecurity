// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            AdapterHelper

static class payload
{

    static final int ADD = 0;
    static final int MOVE = 3;
    static final int POOL_SIZE = 30;
    static final int REMOVE = 1;
    static final int UPDATE = 2;
    int cmd;
    int itemCount;
    Object payload;
    int positionStart;

    String cmdToString()
    {
        switch (cmd)
        {
        default:
            return "??";

        case 0: // '\0'
            return "add";

        case 1: // '\001'
            return "rm";

        case 2: // '\002'
            return "up";

        case 3: // '\003'
            return "mv";
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (cmd)obj;
        if (cmd != ((cmd) (obj)).cmd)
        {
            return false;
        }
        if (cmd == 3 && Math.abs(itemCount - positionStart) == 1 && itemCount == ((itemCount) (obj)).positionStart && positionStart == ((positionStart) (obj)).itemCount) goto _L1; else goto _L3
_L3:
        if (itemCount != ((itemCount) (obj)).itemCount)
        {
            return false;
        }
        if (positionStart != ((positionStart) (obj)).positionStart)
        {
            return false;
        }
        if (payload == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (payload.equals(((payload) (obj)).payload)) goto _L1; else goto _L4
_L4:
        return false;
        if (((payload) (obj)).payload == null) goto _L1; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return (cmd * 31 + positionStart) * 31 + itemCount;
    }

    public String toString()
    {
        return (new StringBuilder()).append(Integer.toHexString(System.identityHashCode(this))).append("[").append(cmdToString()).append(",s:").append(positionStart).append("c:").append(itemCount).append(",p:").append(payload).append("]").toString();
    }

    (int i, int j, int k, Object obj)
    {
        cmd = i;
        positionStart = j;
        itemCount = k;
        payload = obj;
    }
}
