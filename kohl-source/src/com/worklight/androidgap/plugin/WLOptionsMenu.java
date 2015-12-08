// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
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

    private static Logger logger = Logger.getInstance("wl.optionsMenu");
    private boolean hasChanged;
    private boolean isEnabled;
    private boolean isInit;
    private boolean isVisible;
    private int itemIndexer;
    private Map items;
    private String skinName;

    public WLOptionsMenu()
    {
        isInit = false;
        isEnabled = false;
        isVisible = false;
        hasChanged = false;
        itemIndexer = 0;
        skinName = null;
        items = null;
    }

    private WLMenuItem getItemByJavaScriptId(String s)
    {
        Object obj = null;
        Iterator iterator = items.values().iterator();
        WLMenuItem wlmenuitem;
        do
        {
            wlmenuitem = obj;
            if (!iterator.hasNext())
            {
                break;
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
            logger.error((new StringBuilder()).append("WL.OptionMenu.addItem failed because an item with id ").append(s).append(" already exists. Use unique id-s.").toString());
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
            logger.error((new StringBuilder()).append("WL.OptionMenu.getItem failed because an item with id ").append(s).append(" does not exist.").toString());
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
        for (Iterator iterator = items.values().iterator(); iterator.hasNext();)
        {
            if (((WLMenuItem)iterator.next()).hasChanged())
            {
                return true;
            }
        }

        return false;
    }

    public void init()
    {
        skinName = WLConfig.getInstance().getSkinNamePref();
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
        for (Iterator iterator = items.values().iterator(); iterator.hasNext(); ((WLMenuItem)iterator.next()).unsetChanged()) { }
    }

}
