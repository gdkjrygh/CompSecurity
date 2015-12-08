// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import android.widget.ListView;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.sendshare:
//            ContactsSearchFragment

public class 
{

    public static void inject(butterknife.agment agment, ContactsSearchFragment contactssearchfragment, Object obj)
    {
        contactssearchfragment._searchEt = (SearchEditText)agment._searchEt(obj, 0x7f0f0127, "field '_searchEt'");
        contactssearchfragment._listView = (ListView)agment._listView(obj, 0x7f0f018f, "field '_listView'");
    }

    public static void reset(ContactsSearchFragment contactssearchfragment)
    {
        contactssearchfragment._searchEt = null;
        contactssearchfragment._listView = null;
    }

    public ()
    {
    }
}
