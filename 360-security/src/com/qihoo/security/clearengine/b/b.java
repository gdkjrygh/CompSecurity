// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.b;

import android.os.RemoteException;
import android.text.TextUtils;
import com.qihoo.security.clearengine.a.a;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import com.qihoo360.mobilesafe.opti.i.whitelist.UserBWRecord;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class b
{

    private a a;
    private Set b;

    public b(a a1)
    {
        b = new HashSet();
        a = a1;
    }

    public void a()
    {
        int ai[];
        int i;
        int j;
        b.clear();
        ai = new int[4];
        ai;
        ai[0] = 4;
        ai[1] = 3;
        ai[2] = 1001;
        ai[3] = 2;
        j = ai.length;
        i = 0;
_L5:
        int k;
        if (i >= j)
        {
            return;
        }
        k = ai[i];
        Object obj = a.a(k);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj = ((List) (obj)).iterator();
_L2:
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_140;
        }
        Object obj1 = (UserBWRecord)((Iterator) (obj)).next();
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(((UserBWRecord) (obj1)).value)) goto _L2; else goto _L3
_L3:
        obj1 = ((UserBWRecord) (obj1)).value.toLowerCase();
        b.add(obj1);
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        remoteexception.printStackTrace();
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.add(s.toLowerCase());
            return;
        }
    }

    public boolean a(TrashInfo trashinfo)
    {
        if (com.qihoo.security.clearengine.d.a.a(trashinfo.type) && !TextUtils.isEmpty(trashinfo.path))
        {
            if (b.contains(trashinfo = trashinfo.path.toLowerCase()))
            {
                return true;
            }
        }
        return false;
    }

    public void b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.remove(s.toLowerCase());
            return;
        }
    }
}
