// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo.a.a.a.c;
import com.qihoo360.mobilesafe.opti.i.appclear.IClearApp;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            c, b

public class a
    implements com.qihoo.security.opti.trashclear.service.c
{

    private static final String a = com/qihoo/security/opti/trashclear/service/a.getSimpleName();
    private List b;
    private b c;
    private String d;
    private final Context e;

    public a(Context context)
    {
        e = context;
    }

    public void a()
    {
        long l;
        l = 0L;
        if (d == null)
        {
            return;
        }
        IClearApp iclearapp = com.qihoo.a.a.a.c.e(e);
        ArrayList arraylist = new ArrayList();
        arraylist.add(d);
        b = iclearapp.scanUninstalledAppTrash(arraylist);
        if (b == null || b.size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int i;
        obj = "";
        Object obj2;
        long l1;
        long l2;
        try
        {
            i = b.size() - 1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        l1 = 0L;
_L15:
        if (i < 0) goto _L4; else goto _L3
_L3:
        obj2 = (TrashInfo)b.get(i);
        if (obj2 != null) goto _L6; else goto _L5
_L6:
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = ((TrashInfo) (obj2)).desc;
        }
        if (((TrashInfo) (obj2)).bundle == null) goto _L8; else goto _L7
_L7:
        obj1 = ((TrashInfo) (obj2)).bundle.getParcelableArrayList("subList");
_L12:
        if (obj1 == null) goto _L10; else goto _L9
_L9:
        if (((ArrayList) (obj1)).size() <= 0) goto _L10; else goto _L11
_L11:
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            obj2 = (TrashInfo)((Iterator) (obj1)).next();
            l1 += ((TrashInfo) (obj2)).size;
            l += ((TrashInfo) (obj2)).count;
        }

          goto _L5
_L10:
        l2 = ((TrashInfo) (obj2)).size;
        l = ((TrashInfo) (obj2)).count + l;
        l1 += l2;
          goto _L5
_L4:
        obj2 = new b();
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "";
        }
        obj2.a = ((String) (obj1));
        obj2.b = l1;
        obj2.c = l;
        obj = obj2;
_L13:
        c = ((b) (obj));
        return;
_L8:
        obj1 = null;
          goto _L12
_L2:
        obj = null;
          goto _L13
_L5:
        i--;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public void a(String s)
    {
        d = s;
    }

    public b b()
    {
        return c;
    }

    public void c()
    {
        com.qihoo.a.a.a.c.e(e).clearUninstalledAppTrash(b);
    }

}
