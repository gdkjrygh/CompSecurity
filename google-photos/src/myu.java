// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class myu
    implements nya
{

    private static myv a = new myv();

    myu()
    {
    }

    public final nxx a(Context context, nxx nxx1)
    {
        String s;
        boolean flag1;
        flag1 = false;
        s = nxx1.h.a;
        if (((myf)olm.a(context, myf)).a(myh.a, s)) goto _L2; else goto _L1
_L1:
        return nxx1;
_L2:
        if (nxx1 instanceof nyv) goto _L4; else goto _L3
_L3:
        if (!nxx1.c("oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native") || (nxx1 instanceof myx)) goto _L1; else goto _L5
_L5:
        nyv nyv1;
        nyv1 = nzd.a(context, nxx1.h);
        nyv1.a(nxx1);
_L14:
        this;
        JVM INSTR monitorenter ;
        if (!a.a(context, s))
        {
            break MISSING_BLOCK_LABEL_345;
        }
        nxx1 = nxx1.h;
        if (!((nyg) (nxx1)).e) goto _L7; else goto _L6
_L6:
        Object obj;
        List list;
        ArrayList arraylist;
        int j;
        obj = a;
        list = ((myf)olm.a(context, myf)).b();
        j = list.size();
        arraylist = new ArrayList(j);
        int i = ((flag1) ? 1 : 0);
_L9:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(((myc)list.get(i)).d);
        i++;
        if (true) goto _L9; else goto _L8
_L4:
        nyv1 = (nyv)nxx1;
        obj = ((nyp) (nyv1)).a.iterator();
_L13:
        if (!((Iterator) (obj)).hasNext()) goto _L11; else goto _L10
_L10:
        if (!((nxx)((Iterator) (obj)).next() instanceof myw)) goto _L13; else goto _L12
_L12:
        boolean flag = true;
_L15:
        if (flag) goto _L1; else goto _L14
_L11:
        flag = false;
          goto _L15
_L7:
        obj = new nyh();
        obj.a = ((nyg) (nxx1)).a;
        obj.b = ((nyg) (nxx1)).b;
        obj.c = ((nyg) (nxx1)).c;
        obj.e = ((nyg) (nxx1)).e;
        obj.f = ((nyg) (nxx1)).f;
        obj.d = ((nyg) (nxx1)).d;
        obj.e = true;
        nxx1 = ((nyh) (obj)).a();
          goto _L6
_L8:
        nyv1.a(new myw(context, nxx1, arraylist, ((myv) (obj))));
        a.a(s);
        this;
        JVM INSTR monitorexit ;
        return nyv1;
        this;
        JVM INSTR monitorexit ;
        return nxx1;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

}
