// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, ra, qp, qo, 
//            qw

public static final class sb extends qq
{

    public int azu;
    public String azv;
    public String version;

    public void a(qp qp1)
        throws IOException
    {
        if (azu != 0)
        {
            qp1.t(1, azu);
        }
        if (!azv.equals(""))
        {
            qp1.b(2, azv);
        }
        if (!version.equals(""))
        {
            qp1.b(3, version);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return z(qo1);
    }

    protected int c()
    {
        int j = super.c();
        int i = j;
        if (azu != 0)
        {
            i = j + qp.v(1, azu);
        }
        j = i;
        if (!azv.equals(""))
        {
            j = i + qp.j(2, azv);
        }
        i = j;
        if (!version.equals(""))
        {
            i = j + qp.j(3, version);
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
        if (!(obj instanceof version)) goto _L4; else goto _L3
_L3:
        obj = (version)obj;
        flag = flag1;
        if (azu != ((azu) (obj)).azu) goto _L4; else goto _L5
_L5:
        if (azv != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((azv) (obj)).azv != null) goto _L4; else goto _L8
_L8:
        if (version != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((version) (obj)).version != null) goto _L4; else goto _L9
_L9:
        return a(((qq) (obj)));
_L7:
        if (!azv.equals(((azv) (obj)).azv))
        {
            return false;
        }
          goto _L8
        if (!version.equals(((version) (obj)).version))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = azu;
        int i;
        if (azv == null)
        {
            i = 0;
        } else
        {
            i = azv.hashCode();
        }
        if (version != null)
        {
            j = version.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + rQ();
    }

    public rQ sb()
    {
        azu = 0;
        azv = "";
        version = "";
        ayW = null;
        azh = -1;
        return this;
    }

    public azh z(qo qo1)
        throws IOException
    {
_L6:
        int i = qo1.rz();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 183
    //                   26: 194;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(qo1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = qo1.rC();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            azu = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        azv = qo1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        version = qo1.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public ()
    {
        sb();
    }
}
