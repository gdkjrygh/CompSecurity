// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, mv, qu, qp, 
//            qo, qw

public static final class mY extends qq
{

    private static volatile viewId afv[];
    public String afw;
    public String afx;
    public int viewId;

    public static mY[] mX()
    {
        if (afv == null)
        {
            synchronized (qu.azg)
            {
                if (afv == null)
                {
                    afv = new afv[0];
                }
            }
        }
        return afv;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
        throws IOException
    {
        if (!afw.equals(""))
        {
            qp1.b(1, afw);
        }
        if (!afx.equals(""))
        {
            qp1.b(2, afx);
        }
        if (viewId != 0)
        {
            qp1.t(3, viewId);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return o(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (!afw.equals(""))
        {
            i = j + qp.j(1, afw);
        }
        j = i;
        if (!afx.equals(""))
        {
            j = i + qp.j(2, afx);
        }
        i = j;
        if (viewId != 0)
        {
            i = j + qp.v(3, viewId);
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
        if (afw != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((afw) (obj)).afw != null) goto _L4; else goto _L7
_L7:
        if (afx != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((afx) (obj)).afx != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (viewId == ((viewId) (obj)).viewId)
        {
            return a(((qq) (obj)));
        }
          goto _L4
_L6:
        if (!afw.equals(((afw) (obj)).afw))
        {
            return false;
        }
          goto _L7
        if (!afx.equals(((afx) (obj)).afx))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (afw == null)
        {
            i = 0;
        } else
        {
            i = afw.hashCode();
        }
        if (afx != null)
        {
            j = afx.hashCode();
        }
        return (((i + 527) * 31 + j) * 31 + viewId) * 31 + rQ();
    }

    public rQ mY()
    {
        afw = "";
        afx = "";
        viewId = 0;
        ayW = null;
        azh = -1;
        return this;
    }

    public azh o(qo qo1)
        throws IOException
    {
        do
        {
            int i = qo1.rz();
            switch (i)
            {
            default:
                if (a(qo1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                afw = qo1.readString();
                break;

            case 18: // '\022'
                afx = qo1.readString();
                break;

            case 24: // '\030'
                viewId = qo1.rC();
                break;
            }
        } while (true);
    }

    public ()
    {
        mY();
    }
}
