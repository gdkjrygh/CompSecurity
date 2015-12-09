// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.WLDroidGap;
import com.worklight.common.WLUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLMenuItem

public class WLOptionsMenu
{

    private WLDroidGap activity;
    private boolean hasChanged;
    private boolean isEnabled;
    private boolean isInit;
    private boolean isVisible;
    private int itemIndexer;
    private Map items;
    private String skinName;

    public WLOptionsMenu(WLDroidGap wldroidgap)
    {
        isInit = false;
        isEnabled = false;
        isVisible = false;
        hasChanged = false;
        itemIndexer = 0;
        skinName = null;
        activity = null;
        items = null;
        activity = wldroidgap;
    }

    private WLMenuItem getItemByJavaScriptId(String s)
    {
        Iterator iterator = items.values().iterator();
        WLMenuItem wlmenuitem;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            wlmenuitem = (WLMenuItem)iterator.next();
        } while (!wlmenuitem.getJavaScriptId().equals(s));
        return wlmenuitem;
    }

    private void setChanged()
    {
        hasChanged = true;
    }

    public WLMenuItem addItem(String s, String s1, String s2, String s3, boolean flag)
    {
        if (getItemByJavaScriptId(s) != null)
        {
            WLUtils.error((new StringBuilder("Android menu item id '")).append(s).append("' already exists.").toString());
            return null;
        } else
        {
            int i = itemIndexer;
            itemIndexer = itemIndexer + 1;
            s = new WLMenuItem(i, s, s1, s2, s3, flag);
            items.put(Integer.valueOf(i), s);
            setChanged();
            return s;
        }
    }

    public WLMenuItem getItem(String s)
    {
        WLMenuItem wlmenuitem = getItemByJavaScriptId(s);
        if (wlmenuitem == null)
        {
            WLUtils.error((new StringBuilder("Android menu item id ")).append(s).append(" doesn't exist").toString());
        }
        return wlmenuitem;
    }

    public WLMenuItem getItemById(int i)
    {
        return (WLMenuItem)items.get(Integer.valueOf(i));
    }

    public List getItems()
    {
        ArrayList arraylist = new ArrayList(items.values());
        Collections.sort(arraylist, new Comparator() {

            final WLOptionsMenu this$0;

            public int compare(WLMenuItem wlmenuitem, WLMenuItem wlmenuitem1)
            {
                return wlmenuitem.getId() - wlmenuitem1.getId();
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((WLMenuItem)obj, (WLMenuItem)obj1);
            }

            
            {
                this$0 = WLOptionsMenu.this;
                super();
            }
        });
        return arraylist;
    }

    public String getSkinName()
    {
        return skinName;
    }

    public boolean hasChanged()
    {
        if (hasChanged)
        {
            return true;
        }
        Iterator iterator = items.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }
        } while (!((WLMenuItem)iterator.next()).hasChanged());
        return true;
    }

    public void init()
    {
        skinName = WLUtils.readWLPref(activity, "wlSkinName");
        isVisible = true;
        isEnabled = true;
        hasChanged = false;
        items = new HashMap();
        itemIndexer = 0;
        isInit = true;
    }

    public boolean isEnabled()
    {
        return isEnabled;
    }

    public boolean isInit()
    {
        return isInit;
    }

    public boolean isVisible()
    {
        return isVisible;
    }

    public void removeItem(String s)
    {
        s = getItem(s);
        if (s != null)
        {
            items.remove(Integer.valueOf(s.getId()));
            setChanged();
        }
    }

    public void removeItems()
    {
        items.clear();
        setChanged();
    }

    public void setEnabled(boolean flag)
    {
        isEnabled = flag;
        setChanged();
    }

    public void setVisible(boolean flag)
    {
        isVisible = flag;
        setChanged();
    }

    public void unsetChanged()
    {
        hasChanged = false;
        Iterator iterator = items.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            ((WLMenuItem)iterator.next()).unsetChanged();
        } while (true);
    }
}
