// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.qihoo.security.app.f;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo.security.opti.trashclear.ui.a;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo360.mobilesafe.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            FolderImageView

public class c extends a
{

    private final d c = com.qihoo.security.locale.d.a();
    private int d;

    public c(Context context, List list)
    {
        super(context, list);
    }

    static d a(c c1)
    {
        return c1.c;
    }

    private void a(View view, MaliciousInfo maliciousinfo)
    {
        ImageView imageview = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b022b);
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b022c);
        switch (maliciousinfo.shadeType)
        {
        default:
            return;

        case 0: // '\0'
            imageview.setVisibility(8);
            view.setVisibility(8);
            return;

        case 1: // '\001'
            imageview.setVisibility(0);
            view.setVisibility(8);
            return;

        case 2: // '\002'
            imageview.setVisibility(8);
            view.setVisibility(0);
            return;

        case 3: // '\003'
            imageview.setVisibility(0);
            break;
        }
        view.setVisibility(0);
    }

    private void b(i j, int k)
    {
        i l;
        for (j = j.b().iterator(); j.hasNext(); b(l, k))
        {
            l = (i)j.next();
            ((MaliciousInfo)l.c()).checkStatus = k;
        }

    }

    private void c(View view, i j)
    {
        LocaleTextView localetextview;
        LocaleTextView localetextview1;
        MaliciousInfo maliciousinfo;
        Object obj;
        obj = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b0049);
        localetextview = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b004a);
        localetextview1 = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b0142);
        maliciousinfo = (MaliciousInfo)j.c();
        maliciousinfo.isExpand;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 76
    //                   1 156
    //                   2 166;
           goto _L1 _L1 _L2 _L3
_L1:
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.values().length];
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_MALWARE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_FLAW.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_PROTECTION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_ADVERT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.qihoo.security.malware.vo.MaliciousInfo.GroupType.GROUP_TYPE_WARNING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.qihoo.security.ui.antivirus.list._cls2.a[maliciousinfo.groupType.ordinal()];
        JVM INSTR tableswitch 1 5: default 124
    //                   1 176
    //                   2 246
    //                   3 301
    //                   4 356
    //                   5 411;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        a(view, maliciousinfo.checkStatus);
        if (1 == maliciousinfo.isExpand)
        {
            maliciousinfo.lineType = 0;
        } else
        if (e(j) == getCount() - 1)
        {
            maliciousinfo.lineType = 1;
        } else
        {
            maliciousinfo.lineType = 2;
        }
        f(view, j);
        return;
_L2:
        ((ImageView) (obj)).setImageResource(0x7f0200b5);
          goto _L1
_L3:
        ((ImageView) (obj)).setImageResource(0x7f0200b4);
          goto _L1
_L5:
        d = j.b().size();
        localetextview.setLocalText((new StringBuilder()).append(c.a(0x7f0c00f9)).append(" ").append(j.b().size()).toString());
        localetextview1.setLocalText(0x7f0c0140);
          goto _L4
_L6:
        localetextview.setLocalText((new StringBuilder()).append(c.a(0x7f0c00fb)).append(" ").append(j.b().size()).toString());
        localetextview1.setLocalText(0x7f0c0142);
          goto _L4
_L7:
        localetextview.setLocalText((new StringBuilder()).append(c.a(0x7f0c00fd)).append(" ").append(j.b().size()).toString());
        localetextview1.setLocalText(0x7f0c0143);
          goto _L4
_L8:
        localetextview.setLocalText((new StringBuilder()).append(c.a(0x7f0c00fc)).append(" ").append(j.b().size()).toString());
        localetextview1.setLocalText(0x7f0c0141);
          goto _L4
_L9:
        obj = j.b();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = (i)((List) (obj)).get(0);
            localetextview.setLocalText((new StringBuilder()).append(c.a(0x7f0c00fa)).append(" ").append(((i) (obj)).b().size()).toString());
            localetextview1.setLocalText(0x7f0c0141);
        }
          goto _L4
    }

    private void d(View view, i j)
    {
        Object obj = (FolderImageView)com.qihoo.security.app.f.a(view, 0x7f0b022d);
        LocaleTextView localetextview = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b004a);
        LocaleTextView localetextview1 = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b0142);
        MaliciousInfo maliciousinfo = (MaliciousInfo)j.c();
        ((FolderImageView) (obj)).setFolderImageView(j.b());
        localetextview.setLocalText(0x7f0c0144);
        localetextview1.setLocalText(0x7f0c0145);
        obj = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b022e);
        if (2 == maliciousinfo.isExpand)
        {
            com.nineoldandroids.b.a.a(((View) (obj)), 1.0F);
        } else
        {
            com.nineoldandroids.b.a.a(((View) (obj)), 0.5F);
        }
        a(view, maliciousinfo.checkStatus);
        i(j.a());
        f(view, j);
        a(view, maliciousinfo);
    }

    private void e(View view, i j)
    {
        LocaleTextView localetextview;
        LocaleTextView localetextview1;
        MaliciousInfo maliciousinfo;
        Object obj;
        LocaleTextView localetextview2;
        obj = (RemoteImageView)com.qihoo.security.app.f.a(view, 0x7f0b0049);
        localetextview2 = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b004a);
        localetextview = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b0229);
        localetextview1 = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b0142);
        maliciousinfo = (MaliciousInfo)j.c();
        com.qihoo.security.ui.antivirus.list._cls2.a[maliciousinfo.groupType.ordinal()];
        JVM INSTR tableswitch 1 5: default 100
    //                   1 134
    //                   2 321
    //                   3 375
    //                   4 134
    //                   5 134;
           goto _L1 _L2 _L3 _L4 _L2 _L2
_L1:
        a(view, maliciousinfo.checkStatus);
        i(j.a());
        f(view, j);
        a(view, maliciousinfo);
        return;
_L2:
        if (com.qihoo360.mobilesafe.b.i.a(b, maliciousinfo.packageName))
        {
            ((RemoteImageView) (obj)).b(maliciousinfo.packageName, 0x7f020044);
        } else
        {
            ((RemoteImageView) (obj)).c(maliciousinfo.filePath, 0x7f020044);
        }
        localetextview2.setTag(maliciousinfo.packageName);
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(new com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(localetextview2, maliciousinfo) {

            final LocaleTextView a;
            final MaliciousInfo b;
            final c c;

            public void a(String s, String s1)
            {
label0:
                {
                    String s2 = (String)a.getTag();
                    if (!TextUtils.isEmpty(s2) && s2.equals(s1) && s != null)
                    {
                        if (!b.isInstalled)
                        {
                            break label0;
                        }
                        a.setLocalText(s);
                    }
                    return;
                }
                a.setLocalText((new StringBuilder()).append(com.qihoo.security.ui.antivirus.list.c.a(c).a(0x7f0c0102)).append(s).toString());
            }

            
            {
                c = c.this;
                a = localetextview;
                b = maliciousinfo;
                super();
            }
        }, "appLabel", maliciousinfo.packageName, maliciousinfo.filePath);
        localetextview.setVisibility(0);
        obj = (new StringBuilder()).append("[").append(maliciousinfo.getDisplaySubTitle(b)).append("]").toString();
        if (maliciousinfo.isSystem)
        {
            localetextview.setLocalText(n.a(b, 0x7f0c00e6, 0x7f080070, ((String) (obj))));
        } else
        {
            localetextview.setLocalText(n.a(b, ((String) (obj)), 0x7f080070));
        }
        localetextview1.setLocalText(maliciousinfo.getDescription(b));
        localetextview1.setMaxLines(1);
        continue; /* Loop/switch isn't completed */
_L3:
        ((RemoteImageView) (obj)).setImageDrawable(maliciousinfo.leakItem.d());
        localetextview2.setLocalText(maliciousinfo.leakItem.g());
        localetextview.setVisibility(8);
        localetextview1.setLocalText(maliciousinfo.leakItem.h());
        localetextview1.setMaxLines(2);
        continue; /* Loop/switch isn't completed */
_L4:
        ((RemoteImageView) (obj)).setImageResource(0x7f020151);
        localetextview2.setLocalText(0x7f0c00fe);
        localetextview.setVisibility(8);
        localetextview1.setLocalText(0x7f0c00ff);
        localetextview1.setMaxLines(2);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void f(View view, i j)
    {
        j = (MaliciousInfo)j.c();
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b022a);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        switch (((MaliciousInfo) (j)).lineType)
        {
        default:
            return;

        case 1: // '\001'
            view.setVisibility(0);
            layoutparams.leftMargin = com.qihoo360.mobilesafe.b.a.a(b, 0.0F);
            view.setLayoutParams(layoutparams);
            return;

        case 2: // '\002'
            view.setVisibility(0);
            layoutparams.leftMargin = com.qihoo360.mobilesafe.b.a.a(b, 72F);
            view.setLayoutParams(layoutparams);
            return;

        case 0: // '\0'
            view.setVisibility(8);
            return;
        }
    }

    private void i(i j)
    {
        j = j.b();
        int l = j.size();
        int k = 0;
        while (k < l) 
        {
            MaliciousInfo maliciousinfo = (MaliciousInfo)((i)j.get(k)).c();
            if (l == 1)
            {
                maliciousinfo.lineType = 0;
                if (1 == maliciousinfo.isExpand)
                {
                    maliciousinfo.shadeType = 1;
                } else
                {
                    maliciousinfo.shadeType = 3;
                }
            } else
            if (k == 0)
            {
                maliciousinfo.lineType = 2;
                maliciousinfo.shadeType = 1;
            } else
            if (k == l - 1)
            {
                maliciousinfo.lineType = 0;
                if (1 == maliciousinfo.isExpand)
                {
                    maliciousinfo.shadeType = 0;
                } else
                {
                    maliciousinfo.shadeType = 2;
                }
            } else
            {
                maliciousinfo.lineType = 2;
                maliciousinfo.shadeType = 0;
            }
            i((i)j.get(k));
            k++;
        }
    }

    public void a(View view, int j)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b0023);
        switch (j)
        {
        default:
            return;

        case 0: // '\0'
            view.setVisibility(0);
            view.setImageResource(0x7f020055);
            return;

        case 1: // '\001'
            view.setVisibility(0);
            view.setImageResource(0x7f020054);
            return;

        case 2: // '\002'
            view.setVisibility(4);
            view.setImageResource(0x7f020054);
            return;

        case 3: // '\003'
            view.setVisibility(0);
            view.setImageResource(0x7f020156);
            return;

        case 4: // '\004'
            view.setVisibility(0);
            break;
        }
        view.setImageResource(0x7f020056);
    }

    protected void a(View view, i j)
    {
        b(com.qihoo.security.app.f.a(view, 0x7f0b0023), j);
        switch (((MaliciousInfo)j.c()).level)
        {
        default:
            return;

        case 1: // '\001'
            c(view, j);
            return;

        case 2: // '\002'
            d(view, j);
            return;

        case 3: // '\003'
            e(view, j);
            break;
        }
    }

    public void a(i j, int k)
    {
        boolean flag;
        flag = false;
        j = j.a();
        if (j == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int l;
        int i1;
        obj = j.b();
        i1 = ((List) (obj)).size();
        obj = ((List) (obj)).iterator();
        l = 0;
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        MaliciousInfo maliciousinfo = (MaliciousInfo)((i)((Iterator) (obj)).next()).c();
        if (4 != maliciousinfo.checkStatus) goto _L6; else goto _L5
_L5:
        k = 4;
_L4:
        if (4 != k)
        {
            if (l == i1)
            {
                k = ((flag) ? 1 : 0);
            } else
            if (l == 0)
            {
                k = 1;
            } else
            if (l < i1)
            {
                k = 4;
            }
        }
        ((MaliciousInfo)j.c()).checkStatus = k;
        a(j, k);
_L2:
        return;
_L6:
        if (maliciousinfo.checkStatus == 0)
        {
            l++;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public int b()
    {
        return d;
    }

    protected void c(i j)
    {
        j = (MaliciousInfo)j.c();
        switch (((MaliciousInfo) (j)).isExpand)
        {
        default:
            return;

        case 2: // '\002'
            j.isExpand = 1;
            return;

        case 1: // '\001'
            j.isExpand = 2;
            return;

        case 0: // '\0'
            j.isExpand = 0;
            return;
        }
    }

    public void f(i j)
    {
        MaliciousInfo maliciousinfo;
        int k;
        int l;
        maliciousinfo = (MaliciousInfo)j.c();
        l = maliciousinfo.checkStatus;
        k = l;
        maliciousinfo.checkStatus;
        JVM INSTR tableswitch 0 4: default 56
    //                   0 81
    //                   1 86
    //                   2 59
    //                   3 59
    //                   4 81;
           goto _L1 _L2 _L3 _L4 _L4 _L2
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        k = l;
_L6:
        maliciousinfo.checkStatus = k;
        b(j, k);
        a(j, k);
        notifyDataSetChanged();
        return;
_L2:
        k = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        k = 0;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public List g(i j)
    {
        ArrayList arraylist = new ArrayList();
        j = j.b().iterator();
        do
        {
            if (!j.hasNext())
            {
                break;
            }
            i k = (i)j.next();
            if (((MaliciousInfo)k.c()).checkStatus == 0)
            {
                arraylist.add(k);
            }
        } while (true);
        return arraylist;
    }

    public List h(i j)
    {
        MaliciousInfo maliciousinfo = (MaliciousInfo)j.c();
        ArrayList arraylist = new ArrayList();
        if (maliciousinfo.checkStatus == 0)
        {
            arraylist.add(j);
        }
        if (1 == maliciousinfo.isExpand)
        {
            for (j = j.b().iterator(); j.hasNext(); arraylist.addAll(h((i)j.next()))) { }
        }
        return arraylist;
    }
}
