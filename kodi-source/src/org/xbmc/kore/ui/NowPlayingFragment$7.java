// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.text.TextUtils;
import android.view.MenuItem;
import java.util.List;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment, GenericSelectDialog

class this._cls0
    implements android.widget.lickListener
{

    final NowPlayingFragment this$0;

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        int i;
        boolean flag1;
        flag1 = true;
        i = -1;
        menuitem.getItemId();
        JVM INSTR tableswitch 2131624182 2131624183: default 36
    //                   2131624182 42
    //                   2131624183 265;
           goto _L1 _L2 _L3
_L1:
        flag1 = false;
_L5:
        return flag1;
_L2:
        String as[];
        int j;
        boolean flag;
        if (NowPlayingFragment.access$400(NowPlayingFragment.this) != null)
        {
            j = NowPlayingFragment.access$400(NowPlayingFragment.this).size() + 1;
        } else
        {
            j = 1;
        }
        as = new String[j];
        as[0] = getString(0x7f0700cf);
        if (NowPlayingFragment.access$400(NowPlayingFragment.this) == null) goto _L5; else goto _L4
_L4:
        flag = false;
        j = i;
        i = ((flag) ? 1 : 0);
        while (i < NowPlayingFragment.access$400(NowPlayingFragment.this).size()) 
        {
            org.xbmc.kore.jsonrpc.type.m m = (org.xbmc.kore.jsonrpc.type.m)NowPlayingFragment.access$400(NowPlayingFragment.this).get(i);
            if (TextUtils.isEmpty(m.language))
            {
                menuitem = m.name;
            } else
            {
                menuitem = (new StringBuilder()).append(m.language).append(" | ").append(m.name).toString();
            }
            as[i + 1] = menuitem;
            if (m.index == NowPlayingFragment.access$500(NowPlayingFragment.this))
            {
                j = i + 1;
            }
            i++;
        }
        GenericSelectDialog.newInstance(NowPlayingFragment.this, 0, getString(0x7f070020), as, j).show(getFragmentManager(), null);
        return true;
_L3:
        String as1[];
        int k;
        int l;
        if (NowPlayingFragment.access$600(NowPlayingFragment.this) != null)
        {
            k = NowPlayingFragment.access$600(NowPlayingFragment.this).size() + 3;
        } else
        {
            k = 3;
        }
        as1 = new String[k];
        as1[0] = getString(0x7f070037);
        as1[1] = getString(0x7f0700df);
        as1[2] = getString(0x7f070069);
        l = i;
        if (NowPlayingFragment.access$600(NowPlayingFragment.this) != null)
        {
            k = 0;
            do
            {
                l = i;
                if (k >= NowPlayingFragment.access$600(NowPlayingFragment.this).size())
                {
                    break;
                }
                org.xbmc.kore.jsonrpc.type.ctDialogListener ctdialoglistener = (org.xbmc.kore.jsonrpc.type.anager)NowPlayingFragment.access$600(NowPlayingFragment.this).get(k);
                if (TextUtils.isEmpty(ctdialoglistener.anguage))
                {
                    menuitem = ctdialoglistener.ame;
                } else
                {
                    menuitem = (new StringBuilder()).append(ctdialoglistener.anguage).append(" | ").append(ctdialoglistener.ame).toString();
                }
                as1[k + 3] = menuitem;
                if (ctdialoglistener.ndex == NowPlayingFragment.access$700(NowPlayingFragment.this))
                {
                    i = k + 3;
                }
                k++;
            } while (true);
        }
        GenericSelectDialog.newInstance(NowPlayingFragment.this, 1, getString(0x7f070091), as1, l).show(getFragmentManager(), null);
        return true;
    }

    Subtitle()
    {
        this$0 = NowPlayingFragment.this;
        super();
    }
}
