// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ma, iv, mc, lz, 
//            ly, me

public static final class iS extends ma
{

    private static volatile viewId Uz[];
    public String UA;
    public String UB;
    public int viewId;

    public static iS[] iR()
    {
        if (Uz == null)
        {
            synchronized (mc.ana)
            {
                if (Uz == null)
                {
                    Uz = new Uz[0];
                }
            }
        }
        return Uz;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(lz lz1)
        throws IOException
    {
        if (!UA.equals(""))
        {
            lz1.b(1, UA);
        }
        if (!UB.equals(""))
        {
            lz1.b(2, UB);
        }
        if (viewId != 0)
        {
            lz1.p(3, viewId);
        }
        super.a(lz1);
    }

    public me b(ly ly1)
        throws IOException
    {
        return o(ly1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!UA.equals(""))
        {
            i = j + lz.h(1, UA);
        }
        j = i;
        if (!UB.equals(""))
        {
            j = i + lz.h(2, UB);
        }
        i = j;
        if (viewId != 0)
        {
            i = j + lz.r(3, viewId);
        }
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof viewId)) goto _L4; else goto _L3
_L3:
        obj = (viewId)obj;
        if (UA != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((UA) (obj)).UA != null) goto _L4; else goto _L7
_L7:
        if (UB != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((UB) (obj)).UB != null) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (viewId != ((viewId) (obj)).viewId) goto _L4; else goto _L11
_L11:
        if (amX != null && !amX.isEmpty())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        if (((amX) (obj)).amX == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((amX) (obj)).amX.isEmpty()) goto _L4; else goto _L12
_L12:
        return true;
_L6:
        if (!UA.equals(((UA) (obj)).UA))
        {
            return false;
        }
          goto _L7
_L9:
        if (!UB.equals(((UB) (obj)).UB))
        {
            return false;
        }
          goto _L10
        return amX.equals(((amX) (obj)).amX);
          goto _L7
    }

    public int hashCode()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        int l;
        if (UA == null)
        {
            i = 0;
        } else
        {
            i = UA.hashCode();
        }
        if (UB == null)
        {
            j = 0;
        } else
        {
            j = UB.hashCode();
        }
        l = viewId;
        k = ((flag) ? 1 : 0);
        if (amX != null)
        {
            if (amX.isEmpty())
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = amX.hashCode();
            }
        }
        return ((j + (i + 527) * 31) * 31 + l) * 31 + k;
    }

    public amX iS()
    {
        UA = "";
        UB = "";
        viewId = 0;
        amX = null;
        anb = -1;
        return this;
    }

    public anb o(ly ly1)
        throws IOException
    {
        do
        {
            int i = ly1.nB();
            switch (i)
            {
            default:
                if (a(ly1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                UA = ly1.readString();
                break;

            case 18: // '\022'
                UB = ly1.readString();
                break;

            case 24: // '\030'
                viewId = ly1.nE();
                break;
            }
        } while (true);
    }

    public ()
    {
        iS();
    }
}
