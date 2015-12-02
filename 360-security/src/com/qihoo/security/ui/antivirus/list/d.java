// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.leak.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.a;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class d
{

    private final Context a = SecurityApplication.a();
    private final boolean b;
    private List c;
    private final Comparator d = new Comparator() {

        final d a;
        private final Collator b = Collator.getInstance();

        public int a(MaliciousInfo maliciousinfo, MaliciousInfo maliciousinfo1)
        {
            return b.compare(maliciousinfo.getLabel(com.qihoo.security.ui.antivirus.list.d.a(a)), maliciousinfo1.getLabel(com.qihoo.security.ui.antivirus.list.d.a(a)));
        }

        public int compare(Object obj, Object obj1)
        {
            return a((MaliciousInfo)obj, (MaliciousInfo)obj1);
        }

            
            {
                a = d.this;
                super();
            }
    };

    public d()
    {
        c = null;
        b = com.qihoo360.mobilesafe.support.a.c(a);
    }

    static Context a(d d1)
    {
        return d1.a;
    }

    private MaliciousInfo a(List list)
    {
        MaliciousInfo maliciousinfo = new MaliciousInfo();
        maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_WARNING;
        maliciousinfo.level = 2;
        maliciousinfo.childLevel = 3;
        maliciousinfo.isExpand = 2;
        maliciousinfo.checkStatus = 0;
        maliciousinfo.childData = list;
        list = new ArrayList();
        list.add(maliciousinfo);
        maliciousinfo = new MaliciousInfo();
        maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_WARNING;
        maliciousinfo.level = 1;
        maliciousinfo.childLevel = 2;
        maliciousinfo.isExpand = 2;
        maliciousinfo.checkStatus = 0;
        maliciousinfo.childData = list;
        return maliciousinfo;
    }

    private void a(List list, int j)
    {
        int k;
        int l;
        l = list.size();
        k = 0;
_L5:
        List list1;
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        list1 = ((MaliciousInfo)list.get(k)).childData;
        ((MaliciousInfo)list.get(k)).childLevel;
        JVM INSTR tableswitch 1 3: default 72
    //                   1 72
    //                   2 72
    //                   3 81;
           goto _L1 _L1 _L1 _L2
_L1:
        k++;
        break; /* Loop/switch isn't completed */
_L2:
        com.qihoo.security.ui.antivirus.list.e.a.a((i)((i)c.get(j)).b().get(k), list1, 0x7f0300ab);
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void b(List list)
    {
        int j;
        int k;
        c = com.qihoo.security.ui.antivirus.list.e.a.a(list, 0x7f0300ad);
        k = list.size();
        j = 0;
_L2:
        List list1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        list1 = ((MaliciousInfo)list.get(j)).childData;
        switch (((MaliciousInfo)list.get(j)).childLevel)
        {
        case 1: // '\001'
        default:
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break;
        }
        break MISSING_BLOCK_LABEL_115;
_L3:
        a(list1, j);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        com.qihoo.security.ui.antivirus.list.e.a.a((i)c.get(j), list1, 0x7f0300ac);
          goto _L3
        com.qihoo.security.ui.antivirus.list.e.a.a((i)c.get(j), list1, 0x7f0300ab);
          goto _L3
    }

    private MaliciousInfo c()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = com.qihoo.security.leak.d.a().c().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (!c1.c())
            {
                MaliciousInfo maliciousinfo1 = new MaliciousInfo();
                maliciousinfo1.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_FLAW;
                maliciousinfo1.level = 3;
                maliciousinfo1.checkStatus = 0;
                maliciousinfo1.leakItem = c1;
                arraylist.add(maliciousinfo1);
            }
        } while (true);
        if (!arraylist.isEmpty())
        {
            MaliciousInfo maliciousinfo = new MaliciousInfo();
            maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_FLAW;
            maliciousinfo.level = 1;
            maliciousinfo.childLevel = 3;
            maliciousinfo.isExpand = 2;
            maliciousinfo.checkStatus = 0;
            maliciousinfo.childData = arraylist;
            return maliciousinfo;
        } else
        {
            return null;
        }
    }

    private MaliciousInfo d()
    {
        if (SharedPref.b(a, "setting_auto_start", true))
        {
            return null;
        } else
        {
            ArrayList arraylist = new ArrayList();
            MaliciousInfo maliciousinfo = new MaliciousInfo();
            maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_PROTECTION;
            maliciousinfo.level = 3;
            maliciousinfo.checkStatus = 0;
            arraylist.add(maliciousinfo);
            maliciousinfo = new MaliciousInfo();
            maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_PROTECTION;
            maliciousinfo.level = 1;
            maliciousinfo.childLevel = 3;
            maliciousinfo.isExpand = 2;
            maliciousinfo.checkStatus = 0;
            maliciousinfo.childData = arraylist;
            return maliciousinfo;
        }
    }

    public List a()
    {
        if (c == null)
        {
            c = new ArrayList();
        }
        return c;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        Object obj2;
        Object obj3;
        obj = new ArrayList();
        obj2 = new ArrayList();
        obj1 = new ArrayList();
        arraylist = new ArrayList();
        obj3 = com.qihoo.security.malware.db.a.b(a);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        Collections.sort(((List) (obj3)), d);
        obj3 = ((List) (obj3)).iterator();
_L3:
        MaliciousInfo maliciousinfo2;
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_267;
        }
        maliciousinfo2 = (MaliciousInfo)((Iterator) (obj3)).next();
        if (!maliciousinfo2.isUninstall(a)) goto _L2; else goto _L1
_L1:
        ((Iterator) (obj3)).remove();
        com.qihoo.security.malware.db.a.a(a, maliciousinfo2._id);
          goto _L3
        obj;
        throw obj;
_L2:
        if (!maliciousinfo2.isHarmful() || maliciousinfo2.isSystem && com.qihoo360.mobilesafe.b.a.b(a, maliciousinfo2.packageName) && !b || !maliciousinfo2.isFileExist()) goto _L3; else goto _L4
_L4:
        if (!maliciousinfo2.isMalware()) goto _L6; else goto _L5
_L5:
        maliciousinfo2.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_MALWARE;
        maliciousinfo2.level = 3;
        maliciousinfo2.checkStatus = 0;
        ((List) (obj2)).add(maliciousinfo2);
          goto _L3
_L6:
        if (!maliciousinfo2.isWarning() || com.qihoo.security.malware.db.c.a(a, maliciousinfo2)) goto _L3; else goto _L7
_L7:
        maliciousinfo2.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_WARNING;
        maliciousinfo2.level = 3;
        maliciousinfo2.checkStatus = 0;
        arraylist.add(maliciousinfo2);
          goto _L3
        if (((List) (obj2)).size() > 0)
        {
            MaliciousInfo maliciousinfo1 = new MaliciousInfo();
            maliciousinfo1.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_MALWARE;
            maliciousinfo1.level = 1;
            maliciousinfo1.childLevel = 3;
            maliciousinfo1.isExpand = 2;
            maliciousinfo1.checkStatus = 0;
            maliciousinfo1.childData = ((List) (obj2));
            ((List) (obj)).add(maliciousinfo1);
        }
        obj2 = d();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        ((List) (obj)).add(obj2);
        obj2 = c();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_374;
        }
        ((List) (obj)).add(obj2);
        if (((List) (obj1)).size() > 0)
        {
            MaliciousInfo maliciousinfo = new MaliciousInfo();
            maliciousinfo.groupType = com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_ADVERT;
            maliciousinfo.level = 1;
            maliciousinfo.childLevel = 3;
            maliciousinfo.isExpand = 2;
            maliciousinfo.checkStatus = 0;
            maliciousinfo.childData = ((List) (obj1));
            ((List) (obj)).add(maliciousinfo);
        }
        if (arraylist.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        obj1 = a(arraylist);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        ((List) (obj)).add(obj1);
        b(((List) (obj)));
        this;
        JVM INSTR monitorexit ;
    }
}
