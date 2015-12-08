// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.lyft.android.common.Strings;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;
import me.lyft.android.ui.invites.InviteItemView;
import me.lyft.android.ui.splitfare.SearchHelper;

public class ContactsAdapter extends BaseAdapter
    implements SectionIndexer
{

    private static final int ENGLISH_ALPHABET_LENGTH = 26;
    private final Set checkedContacts = new HashSet();
    private final List data = new ArrayList();
    private final Set disabledContacts = new HashSet();
    private boolean hasMaxInvitesBeenHit;
    private final LayoutInflater inflater;
    private boolean isCategoriesEnabled;
    private final Map sectionIndexMap = new LinkedHashMap(26);
    private String sections[];

    public ContactsAdapter(LayoutInflater layoutinflater)
    {
        isCategoriesEnabled = true;
        hasMaxInvitesBeenHit = false;
        inflater = layoutinflater;
    }

    private static String getCategory(UserContact usercontact)
    {
        if (!Strings.isNullOrEmpty(usercontact.getCategory()))
        {
            return usercontact.getCategory();
        } else
        {
            return getDefaultCategory(usercontact.getName());
        }
    }

    private static String getDefaultCategory(String s)
    {
        if (SearchHelper.isPhoneNumber(s) || SearchHelper.startsWithDigit(s))
        {
            return "#";
        } else
        {
            return String.valueOf(s.charAt(0)).toUpperCase();
        }
    }

    private void initAlphabetIndexer()
    {
        for (int i = 0; i < data.size(); i++)
        {
            String s = getCategory((UserContact)data.get(i));
            if (!sectionIndexMap.containsKey(s))
            {
                sectionIndexMap.put(s, Integer.valueOf(i));
            }
        }

        ArrayList arraylist = new ArrayList(sectionIndexMap.keySet());
        sections = new String[arraylist.size()];
        arraylist.toArray(sections);
    }

    private boolean isItemChecked(UserContact usercontact)
    {
        return checkedContacts.contains(usercontact);
    }

    private static List toList(Set set)
    {
        ArrayList arraylist = new ArrayList(set.size());
        for (set = set.iterator(); set.hasNext(); arraylist.add((UserContact)set.next())) { }
        return arraylist;
    }

    public void addCheckedContact(UserContact usercontact)
    {
        checkedContacts.add(usercontact);
    }

    public void addDisabledContact(UserContact usercontact)
    {
        disabledContacts.add(usercontact);
    }

    public ContactsAdapter disableCategories()
    {
        isCategoriesEnabled = false;
        return this;
    }

    public List getCheckedData()
    {
        return toList(checkedContacts);
    }

    public int getCheckedItemCount()
    {
        return checkedContacts.size();
    }

    public int getCount()
    {
        return data.size();
    }

    public List getData()
    {
        return data;
    }

    public List getDisabledData()
    {
        return toList(disabledContacts);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public UserContact getItem(int i)
    {
        return (UserContact)data.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getPositionForSection(int i)
    {
        if (i > 0 && i < sections.length)
        {
            return ((Integer)sectionIndexMap.get(sections[i])).intValue();
        } else
        {
            return 0;
        }
    }

    public int getSectionForPosition(int i)
    {
        if (data.size() > i)
        {
            String s = getCategory((UserContact)data.get(i));
            i = 0;
            while (i < sections.length) 
            {
                if (sections[i].equals(s))
                {
                    return i;
                }
                i++;
            }
        }
        return 0;
    }

    public volatile Object[] getSections()
    {
        return getSections();
    }

    public String[] getSections()
    {
        return sections;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        UserContact usercontact;
        boolean flag;
        boolean flag2;
label0:
        {
            boolean flag1 = false;
            if (view == null)
            {
                viewgroup = (InviteItemView)inflater.inflate(0x7f030043, viewgroup, false);
            } else
            {
                viewgroup = (InviteItemView)view;
            }
            usercontact = (UserContact)data.get(i);
            flag2 = isItemChecked(i);
            if (!isItemDisabled(i))
            {
                flag = flag1;
                if (flag2)
                {
                    break label0;
                }
                flag = flag1;
                if (!hasMaxInvitesBeenHit)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (!isCategoriesEnabled) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        i = getSectionForPosition(i);
        view = getSections()[i];
_L5:
        viewgroup.showWithCategories(usercontact, flag2, flag, view);
        return viewgroup;
_L4:
        int j = getSectionForPosition(i - 1);
        i = getSectionForPosition(i);
        String s1 = getSections()[j];
        String s = getSections()[i];
        view = s;
        if (s.equals(s1))
        {
            view = null;
        }
        if (true) goto _L5; else goto _L2
_L2:
        viewgroup.showWithoutCategories(usercontact, flag2, flag);
        return viewgroup;
    }

    public boolean isItemChecked(int i)
    {
        return isItemChecked(getItem(i));
    }

    public boolean isItemDisabled(int i)
    {
        return isItemDisabled(getItem(i));
    }

    public boolean isItemDisabled(UserContact usercontact)
    {
        boolean flag1 = false;
        ContactPhone contactphone = usercontact.getPhoneNumber();
        boolean flag;
        if (!Strings.isNullOrEmpty(usercontact.getEmail()) || contactphone != null && SearchHelper.isNumberValid(contactphone.getPhoneNumber()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (disabledContacts.contains(usercontact) || !flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public void setHasMaxInvitesBeenHit(boolean flag)
    {
        hasMaxInvitesBeenHit = flag;
        notifyDataSetChanged();
    }

    public void setItemDisabled(int i)
    {
        UserContact usercontact = getItem(i);
        if (disabledContacts.add(usercontact))
        {
            notifyDataSetChanged();
        }
    }

    public void swapData(List list)
    {
        data.clear();
        sectionIndexMap.clear();
        if (list != null)
        {
            data.addAll(list);
            initAlphabetIndexer();
        }
        notifyDataSetChanged();
    }

    public void toggleChecked(int i)
    {
        UserContact usercontact = getItem(i);
        if (checkedContacts.contains(usercontact))
        {
            checkedContacts.remove(usercontact);
        } else
        {
            checkedContacts.add(usercontact);
        }
        notifyDataSetChanged();
    }
}
