// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.util.MdxUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag

public final class MdxMenu
{

    private static final String TAG = "MdxMenu";
    private final NetflixActivity activity;
    private final ServiceManager manager;
    private final MenuItem mdxItem;

    private MdxMenu(MdxMiniPlayerFrag mdxminiplayerfrag, Menu menu, boolean flag)
    {
        mdxminiplayerfrag.attachMenuItem(this);
        activity = (NetflixActivity)mdxminiplayerfrag.getActivity();
        manager = activity.getServiceManager();
        mdxItem = menu.add(activity.getString(0x7f0c0183));
        mdxItem.setShowAsAction(1);
        mdxItem.setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            final MdxMenu this$0;

            public boolean onMenuItemClick(MenuItem menuitem)
            {
                menuitem = MdxUtils.createMdxTargetSelectionDialog(activity, activity.getMdxMiniPlayerFrag());
                activity.displayDialog(menuitem);
                return true;
            }

            
            {
                this$0 = MdxMenu.this;
                super();
            }
        });
        setEnabled(flag);
        update();
    }

    public static void addSelectPlayTarget(MdxMiniPlayerFrag mdxminiplayerfrag, Menu menu)
    {
        new MdxMenu(mdxminiplayerfrag, menu, mdxminiplayerfrag.isMdxMenuEnabled());
    }

    private int getIcon()
    {
        return !MdxUtils.isCurrentMdxTargetAvailable(manager) ? 0x7f0200c3 : 0x7f0200c4;
    }

    private boolean isAnyMdxTargetAvailable()
    {
        if (!manager.getMdx().isReady())
        {
            Log.d("MdxMenu", "MDX service is NOT ready");
            return false;
        }
        android.util.Pair apair[] = manager.getMdx().getTargetList();
        if (apair == null || apair.length < 1)
        {
            Log.d("MdxMenu", "No MDX remote targets found");
            return false;
        }
        if (Log.isLoggable("MdxMenu", 3))
        {
            Log.d("MdxMenu", (new StringBuilder()).append("MDX remote targets found: ").append(apair.length).toString());
        }
        return true;
    }

    private void updateAlpha()
    {
        Drawable drawable = mdxItem.getIcon();
        if (drawable != null)
        {
            char c;
            if (mdxItem.isEnabled())
            {
                c = '\377';
            } else
            {
                c = '\200';
            }
            drawable.setAlpha(c);
        }
    }

    void setEnabled(boolean flag)
    {
        Log.v("MdxMenu", (new StringBuilder()).append("Setting mdx menu item enabled: ").append(flag).toString());
        mdxItem.setEnabled(flag);
        updateAlpha();
    }

    void update()
    {
        if (!activity.shouldAddMdxToMenu())
        {
            Log.w("MdxMenu", "Service manager or mdx are null");
            mdxItem.setVisible(false);
            return;
        } else
        {
            mdxItem.setIcon(getIcon());
            mdxItem.setVisible(isAnyMdxTargetAvailable());
            updateAlpha();
            return;
        }
    }

}
