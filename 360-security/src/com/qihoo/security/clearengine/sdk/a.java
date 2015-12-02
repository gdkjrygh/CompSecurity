// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.qihoo360.mobilesafe.opti.i.trashclear.TrashInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.clearengine.sdk:
//            c

public class a
{

    private static final String a = com/qihoo/security/clearengine/sdk/a.getSimpleName();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final Comparator d = new Comparator() {

        final a a;

        public int a(TrashInfo trashinfo, TrashInfo trashinfo1)
        {
            if (trashinfo.size > trashinfo1.size)
            {
                return -1;
            }
            return trashinfo.size >= trashinfo1.size ? 0 : 1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((TrashInfo)obj, (TrashInfo)obj1);
        }

            
            {
                a = a.this;
                super();
            }
    };

    public a()
    {
    }

    private void a()
    {
        try
        {
            Collections.sort(b, d);
        }
        catch (Exception exception) { }
        b();
    }

    private boolean a(TrashInfo trashinfo, TrashInfo trashinfo1)
    {
        if (!TextUtils.isEmpty(trashinfo.packageName) && !TextUtils.isEmpty(trashinfo1.packageName))
        {
            String s = trashinfo.bundle.getString("apkVersionName");
            int i = trashinfo.bundle.getInt("apkVersionCode");
            String s1 = trashinfo1.bundle.getString("apkVersionName");
            int j = trashinfo1.bundle.getInt("apkVersionCode");
            if (trashinfo.packageName.equals(trashinfo1.packageName) && i == j && s != null && s.equals(s1))
            {
                return true;
            }
        }
        return false;
    }

    private boolean a(String s)
    {
        boolean flag1 = false;
        s = new File(s);
        boolean flag = flag1;
        if (s.exists())
        {
            flag = flag1;
            if (Math.abs(System.currentTimeMillis() - s.lastModified()) <= 0xf731400L)
            {
                flag = true;
            }
        }
        return flag;
    }

    private void b()
    {
        int i;
        int k;
        k = b.size();
        if (k == 0)
        {
            return;
        }
        c.clear();
        i = 0;
_L2:
        if (i >= k)
        {
            b.clear();
            b.addAll(c);
            c.clear();
            return;
        }
        TrashInfo trashinfo = (TrashInfo)b.get(i);
        int j = c.size() - 1;
        do
        {
            if (j < 0)
            {
                j = 0;
            } else
            {
label0:
                {
                    if (!b(trashinfo, (TrashInfo)c.get(j)))
                    {
                        break label0;
                    }
                    c.add(j + 1, trashinfo);
                    j = 1;
                }
            }
            if (j == 0)
            {
                c.add(trashinfo);
            }
            i++;
            if (true)
            {
                continue;
            }
            j--;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void b(List list)
    {
        int j = list.size();
        if (j != 0)
        {
            int i = 0;
            while (i < j) 
            {
                TrashInfo trashinfo = (TrashInfo)list.get(i);
                if (trashinfo.dataType == 5 || trashinfo.dataType == 7)
                {
                    if (!TextUtils.isEmpty(trashinfo.path) && a(trashinfo.path))
                    {
                        trashinfo.dataType = 8;
                    } else
                    {
                        trashinfo.clearType = 2;
                    }
                }
                if (trashinfo.dataType == 8 || trashinfo.dataType == 6)
                {
                    trashinfo.clearType = 1;
                } else
                {
                    trashinfo.clearType = 2;
                }
                i++;
            }
        }
    }

    private boolean b(TrashInfo trashinfo, TrashInfo trashinfo1)
    {
        while (TextUtils.isEmpty(trashinfo.packageName) || TextUtils.isEmpty(trashinfo1.packageName) || !trashinfo.packageName.equals(trashinfo1.packageName)) 
        {
            return false;
        }
        return true;
    }

    private void c(List list)
    {
        int k = list.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L4:
        if (i >= k) goto _L1; else goto _L3
_L3:
        int j = i;
_L5:
label0:
        {
            if (j < k)
            {
                break label0;
            }
            i++;
        }
          goto _L4
          goto _L1
        if (i != j)
        {
            c((TrashInfo)list.get(i), (TrashInfo)list.get(j));
        }
        j++;
          goto _L5
    }

    private boolean c(TrashInfo trashinfo, TrashInfo trashinfo1)
    {
_L2:
        return false;
        if (TextUtils.isEmpty(trashinfo.packageName) || TextUtils.isEmpty(trashinfo1.packageName) || !trashinfo.packageName.equals(trashinfo1.packageName)) goto _L2; else goto _L1
_L1:
        String s;
        String s1;
        int i;
        int j;
        s1 = trashinfo.bundle.getString("apkVersionName");
        i = trashinfo.bundle.getInt("apkVersionCode");
        s = trashinfo1.bundle.getString("apkVersionName");
        j = trashinfo1.bundle.getInt("apkVersionCode");
        if (i >= j) goto _L4; else goto _L3
_L3:
        trashinfo1 = trashinfo;
_L15:
        if (trashinfo1 != null && trashinfo1.dataType != 4)
        {
            trashinfo1.dataType = 3;
            trashinfo1.clearType = 2;
            return false;
        }
          goto _L5
_L4:
        if (i <= j) goto _L7; else goto _L6
_L7:
        if (i != j || s1 == null || s == null || s1.equals(s)) goto _L9; else goto _L8
_L8:
        String as[];
        String as1[];
        as1 = s1.split("\\.");
        as = s.split("\\.");
        if (as1 == null || as == null) goto _L9; else goto _L10
_L10:
        i = as1.length;
        j = as.length;
        int k;
        int l;
        if (i > j)
        {
            i = j;
        }
        j = 0;
          goto _L11
_L13:
        k = Integer.valueOf(as1[j]).intValue();
        l = Integer.valueOf(as[j]).intValue();
        if (k > l)
        {
            trashinfo1 = null;
        } else
        {
            trashinfo1 = trashinfo;
            if (k >= l)
            {
                j++;
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L6
        trashinfo;
        trashinfo1 = null;
          goto _L6
_L9:
        trashinfo1 = null;
          goto _L6
_L11:
        if (j < i) goto _L13; else goto _L12
_L12:
        trashinfo1 = null;
_L6:
        if (true) goto _L15; else goto _L14
_L14:
_L5:
        if (true) goto _L2; else goto _L16
_L16:
    }

    private void d(List list)
    {
        int k = list.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L4:
        if (i >= k) goto _L1; else goto _L3
_L3:
        int j = i;
_L5:
label0:
        {
            if (j < k)
            {
                break label0;
            }
            i++;
        }
          goto _L4
          goto _L1
        if (i != j && a((TrashInfo)list.get(i), (TrashInfo)list.get(j)))
        {
            ((TrashInfo)list.get(j)).dataType = 1;
            ((TrashInfo)list.get(j)).clearType = 2;
        }
        j++;
          goto _L5
    }

    public ArrayList a(List list)
    {
        list = list.iterator();
_L3:
        if (list.hasNext()) goto _L2; else goto _L1
_L1:
        d(c);
        c(c);
        b.addAll(c);
        c.clear();
        b(b);
        a();
        list = b.iterator();
_L4:
        if (!list.hasNext())
        {
            return b;
        }
        break MISSING_BLOCK_LABEL_165;
_L2:
        TrashInfo trashinfo = (TrashInfo)list.next();
        if (trashinfo.clearType == 2 || 2 == trashinfo.dataType || 6 == trashinfo.dataType)
        {
            b.add(trashinfo);
        } else
        {
            if (trashinfo.dataType == 4 || trashinfo.dataType == 3)
            {
                trashinfo.clearType = 2;
            }
            c.add(trashinfo);
        }
          goto _L3
        com.qihoo.security.clearengine.sdk.c.a((TrashInfo)list.next());
          goto _L4
    }

}
