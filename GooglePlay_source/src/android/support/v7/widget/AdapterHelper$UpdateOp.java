// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            AdapterHelper

static final class itemCount
{

    int cmd;
    int itemCount;
    int positionStart;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (itemCount)obj;
            if (cmd != ((cmd) (obj)).cmd)
            {
                return false;
            }
            if (cmd != 3 || Math.abs(itemCount - positionStart) != 1 || itemCount != ((itemCount) (obj)).positionStart || positionStart != ((positionStart) (obj)).itemCount)
            {
                if (itemCount != ((itemCount) (obj)).itemCount)
                {
                    return false;
                }
                if (positionStart != ((positionStart) (obj)).positionStart)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (cmd * 31 + positionStart) * 31 + itemCount;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("[");
        cmd;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 85
    //                   1 91
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s = "??";
_L7:
        return stringbuilder.append(s).append(",s:").append(positionStart).append("c:").append(itemCount).append("]").toString();
_L2:
        s = "add";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "rm";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "up";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "mv";
        if (true) goto _L7; else goto _L6
_L6:
    }

    (int i, int j, int k)
    {
        cmd = i;
        positionStart = j;
        itemCount = k;
    }
}
