// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.qihoo.security.app.f;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.opti.trashclear.ui.TrashItemInfo;
import com.qihoo.security.opti.trashclear.ui.a;
import com.qihoo.security.opti.trashclear.ui.e;
import com.qihoo.security.opti.trashclear.ui.i;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import com.qihoo360.mobilesafe.b.r;
import com.qihoo360.mobilesafe.b.s;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage.opti:
//            a

public class b extends a
{

    private final d c = com.qihoo.security.locale.d.a();
    private int d;

    public b(Context context, List list)
    {
        super(context, list);
        d = e.a;
    }

    private void a(View view, TrashItemInfo trashiteminfo)
    {
        view = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b00e6);
        int j;
        if (b())
        {
            view.setVisibility(8);
        } else
        {
            view.setVisibility(0);
        }
        j = trashiteminfo.keepCount;
        if (j != -1)
        {
            if (j > 0)
            {
                view.setLocalText(b.getResources().getQuantityString(0x7f0f0001, j, new Object[] {
                    Integer.valueOf(j)
                }));
                view.setTextColor(b.getResources().getColor(0x7f080014));
                return;
            } else
            {
                view.setLocalText(trashiteminfo.desc);
                view.setTextColor(b.getResources().getColor(0x7f08005c));
                return;
            }
        } else
        {
            view.setLocalText(trashiteminfo.desc);
            view.setTextColor(b.getResources().getColor(0x7f08005c));
            return;
        }
    }

    private void a(View view, CharSequence charsequence)
    {
        ((LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b00e5)).setLocalText(charsequence);
    }

    private void a(View view, String s1, String s2)
    {
        view = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b00e5);
        view.setTag(s1);
        com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a().a(new a.a(view) {

            final LocaleTextView a;
            final b b;

            public void a(String s3, String s4)
            {
label0:
                {
                    String s5 = (String)a.getTag();
                    if (!TextUtils.isEmpty(s5) && s5.equals(s4))
                    {
                        if (!TextUtils.isEmpty(s3))
                        {
                            break label0;
                        }
                        a.setLocalText(s4);
                    }
                    return;
                }
                a.setLocalText(s3);
            }

            
            {
                b = b.this;
                a = localetextview;
                super();
            }
        }, "appLabel", s1, s2);
    }

    private void b(View view, TrashItemInfo trashiteminfo)
    {
        view = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b00e4);
        trashiteminfo = Long.valueOf(trashiteminfo.size);
        if (trashiteminfo instanceof Integer)
        {
            view.setLocalText("");
        } else
        if (trashiteminfo instanceof Long)
        {
            view.setLocalText(s.a(((Long)trashiteminfo).longValue()));
            return;
        }
    }

    private boolean b()
    {
        return d == 0;
    }

    private void c(View view, TrashItemInfo trashiteminfo)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e2);
        switch (trashiteminfo.isExpand)
        {
        default:
            return;

        case 1: // '\001'
            view.setImageResource(0x7f0200b5);
            return;

        case 2: // '\002'
            view.setImageResource(0x7f0200b4);
            break;
        }
    }

    private void c(View view, i j)
    {
        j = (TrashItemInfo)j.c();
        c(view, ((TrashItemInfo) (j)));
        if (c.a(0x7f0c0216).equals(((TrashItemInfo) (j)).name))
        {
            String s1 = (new StringBuilder()).append(c.a(0x7f0c0216)).append(c.a(0x7f0c01f2)).toString();
            a(view, r.a(b, s1, 0x7f08005d, c.a(0x7f0c01f2)));
        } else
        {
            a(view, ((TrashItemInfo) (j)).name);
        }
        a(view, j);
        b(view, j);
        if (b())
        {
            j.checkStatus = 2;
        }
        a(view, ((TrashItemInfo) (j)).checkStatus);
    }

    private void d(View view, TrashItemInfo trashiteminfo)
    {
        view = (RemoteImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e2);
        if (trashiteminfo.iconId > 0)
        {
            view.setImageResource(trashiteminfo.iconId);
            return;
        }
        switch (trashiteminfo.TrashType)
        {
        case 2: // '\002'
        default:
            view.setImageResource(0x7f020044);
            return;

        case 1: // '\001'
            view.b(trashiteminfo.pkgName, 0x7f020044);
            return;

        case 3: // '\003'
            view.setImageResource(0x7f020147);
            return;

        case 0: // '\0'
            view.c(trashiteminfo.path, 0x7f020044);
            return;
        }
    }

    private void d(View view, i j)
    {
        TrashItemInfo trashiteminfo = (TrashItemInfo)j.c();
        d(view, trashiteminfo);
        a(view, trashiteminfo.name);
        f(view, j);
        b(view, trashiteminfo);
        if (b() && trashiteminfo.isExpand != 0)
        {
            trashiteminfo.checkStatus = 2;
        }
        a(view, trashiteminfo.checkStatus);
        e(view, trashiteminfo);
        f(view, trashiteminfo);
        g(view, trashiteminfo);
        h(view, trashiteminfo);
    }

    private void e(View view, TrashItemInfo trashiteminfo)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00f5);
        switch (trashiteminfo.isExpand)
        {
        default:
            return;

        case 1: // '\001'
            view.setVisibility(4);
            view.setImageResource(0x7f0200b3);
            return;

        case 2: // '\002'
            view.setVisibility(0);
            view.setImageResource(0x7f0200b3);
            return;

        case 0: // '\0'
            view.setVisibility(4);
            return;
        }
    }

    private void e(View view, i j)
    {
        TrashItemInfo trashiteminfo = (TrashItemInfo)j.c();
        d(view, trashiteminfo);
        j = ((TrashItemInfo)j.a().c()).name;
        if (c.a(0x7f0c020d).equals(j))
        {
            a(view, trashiteminfo.name, trashiteminfo.path);
        } else
        {
            a(view, trashiteminfo.name);
        }
        com.qihoo.security.app.f.a(view, 0x7f0b00e6).setVisibility(8);
        b(view, trashiteminfo);
        if (trashiteminfo.TrashType == 0 && c.a(0x7f0c020d).equals(j) && !com.qihoo360.mobilesafe.support.a.c(b))
        {
            trashiteminfo.checkStatus = 2;
        }
        a(view, trashiteminfo.checkStatus);
        f(view, trashiteminfo);
    }

    private void f(View view, TrashItemInfo trashiteminfo)
    {
        ImageView imageview = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e8);
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e7);
        switch (trashiteminfo.lineType)
        {
        default:
            imageview.setVisibility(8);
            view.setVisibility(8);
            return;

        case 1: // '\001'
            imageview.setVisibility(0);
            view.setVisibility(8);
            return;

        case 2: // '\002'
            imageview.setVisibility(8);
            break;
        }
        view.setVisibility(0);
    }

    private void f(View view, i j)
    {
        TrashItemInfo trashiteminfo;
        trashiteminfo = (TrashItemInfo)j.c();
        view = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b00e6);
        trashiteminfo.TrashType;
        JVM INSTR tableswitch 1 3: default 52
    //                   1 86
    //                   2 52
    //                   3 59;
           goto _L1 _L2 _L1 _L3
_L1:
        view.setVisibility(8);
        return;
_L3:
        if (!"bigfile_default".equals(trashiteminfo.pkgName))
        {
            view.setLocalText(trashiteminfo.desc);
            view.setVisibility(0);
            return;
        }
_L2:
        if (d != 1 || c.a(0x7f0c0248).equals(((TrashItemInfo)j.a().c()).name)) goto _L1; else goto _L4
_L4:
        view.setLocalText(trashiteminfo.desc);
        view.setVisibility(0);
        return;
    }

    private void g(View view, TrashItemInfo trashiteminfo)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e1);
        switch (trashiteminfo.upShadowType)
        {
        default:
            view.setVisibility(8);
            return;

        case 1: // '\001'
            view.setVisibility(8);
            return;

        case 0: // '\0'
            view.setVisibility(0);
            return;
        }
    }

    private void h(View view, TrashItemInfo trashiteminfo)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e9);
        switch (trashiteminfo.downShadowType)
        {
        default:
            view.setVisibility(8);
            return;

        case 1: // '\001'
            view.setVisibility(8);
            return;

        case 0: // '\0'
            view.setVisibility(0);
            return;
        }
    }

    public void a(View view, int j)
    {
        view = (ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e3);
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

    public void a(View view, i j)
    {
        b((ImageView)com.qihoo.security.app.f.a(view, 0x7f0b00e3), j);
        switch (((TrashItemInfo)j.c()).level)
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

    public void b(int j)
    {
        d = j;
    }

    protected void c(i j)
    {
        TrashItemInfo trashiteminfo;
        int k;
        k = 0;
        trashiteminfo = (TrashItemInfo)j.c();
        trashiteminfo.isExpand;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 313
    //                   2 41;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        trashiteminfo.isExpand = 1;
        if (trashiteminfo.level == 1)
        {
            if (j.b().size() > 0)
            {
                ((TrashItemInfo)((i)j.b().get(0)).c()).upShadowType = 0;
                ((TrashItemInfo)((i)j.b().get(j.b().size() - 1)).c()).downShadowType = 0;
            }
        } else
        if (trashiteminfo.level == 2 && j.b().size() > 0)
        {
            trashiteminfo.downShadowType = 1;
            k = j.a().b().size();
            if (((i)j.a().b().get(k - 1)).equals(j))
            {
                ((TrashItemInfo)((i)j.b().get(j.b().size() - 1)).c()).downShadowType = 0;
            }
        }
        if (trashiteminfo.level != 1)
        {
            trashiteminfo.lineType = 1;
        }
        k = j.b().size();
        if (k > 0)
        {
            ((TrashItemInfo)((i)j.b().get(k - 1)).c()).lineType = 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        trashiteminfo.isExpand = 2;
        if (trashiteminfo.level == 1)
        {
            for (int l = j.b().size(); k < l; k++)
            {
                if (((TrashItemInfo)((i)j.b().get(k)).c()).isExpand != 0)
                {
                    ((TrashItemInfo)((i)j.b().get(k)).c()).isExpand = 2;
                }
            }

        } else
        if (trashiteminfo.level == 2)
        {
            List list = j.a().b();
            if (list.size() > 0 && list.get(list.size() - 1) == j)
            {
                trashiteminfo.downShadowType = 0;
            }
            if (j.b().size() > 0)
            {
                ((TrashItemInfo)((i)j.b().get(j.b().size() - 1)).c()).downShadowType = 1;
            }
        }
        if (j.a() != null && j.a().b().size() > 0 && j.a().b().indexOf(j) == j.a().b().size() - 1)
        {
            trashiteminfo.lineType = 1;
        } else
        if (trashiteminfo.level != 1)
        {
            trashiteminfo.lineType = 2;
        }
        k = j.b().size();
        if (k > 0)
        {
            ((TrashItemInfo)((i)j.b().get(k - 1)).c()).lineType = 2;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
