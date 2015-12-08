// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;

final class efk
    implements ca
{

    private efd a;

    efk(efd efd1)
    {
        a = efd1;
        super();
    }

    public final ei a(int i, Bundle bundle)
    {
        return new efo(efd.l(a));
    }

    public final void a(ei ei, Object obj)
    {
        Object obj1;
        efd efd1;
        obj1 = (k)obj;
        efd1 = a;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ei = new efa();
_L12:
        obj = efb.a;
        obj1 = ei;
        ei = ((ei) (obj));
_L13:
        obj1.a = ei;
        efd1.a(((efa) (obj1)).a());
        return;
_L2:
        ei = ((k) (obj1)).d();
        obj = new efa();
        obj.d = null;
        obj.e = null;
        obj.c = ((k) (obj1)).c();
        int i;
        if (ei == null)
        {
            i = 0;
        } else
        {
            i = (int)(ei.f() * 100F);
        }
        obj.b = i;
        if (ei == null)
        {
            ei = null;
        } else
        {
            ei = ei.e().toString();
        }
        obj.d = ei;
        efn.a[((k) (obj1)).b() - 1];
        JVM INSTR tableswitch 1 8: default 164
    //                   1 197
    //                   2 206
    //                   3 215
    //                   4 224
    //                   5 233
    //                   6 242
    //                   7 251
    //                   8 260;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        ei = ((ei) (obj));
          goto _L12
_L4:
        ei = efb.a;
        obj1 = obj;
          goto _L13
_L5:
        ei = efb.b;
        obj1 = obj;
          goto _L13
_L6:
        ei = efb.e;
        obj1 = obj;
          goto _L13
_L7:
        ei = efb.d;
        obj1 = obj;
          goto _L13
_L8:
        ei = efb.c;
        obj1 = obj;
          goto _L13
_L9:
        ei = efb.g;
        obj1 = obj;
          goto _L13
_L10:
        ei = efb.h;
        obj1 = obj;
          goto _L13
_L11:
        ei = efb.i;
        obj1 = obj;
          goto _L13
    }
}
