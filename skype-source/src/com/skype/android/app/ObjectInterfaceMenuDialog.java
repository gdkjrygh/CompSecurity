// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.Menu;
import android.view.MenuItem;
import com.skype.ObjectInterface;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.skylib.ObjectIdMap;

// Referenced classes of package com.skype.android.app:
//            ListItemMenuDialog

public class ObjectInterfaceMenuDialog extends ListItemMenuDialog
{
    public static interface MenuCallback
    {

        public abstract boolean onContextItemSelected(MenuItem menuitem, ObjectInterface objectinterface, Bundle bundle);

        public abstract void onCreateContextMenu(Menu menu, ObjectInterface objectinterface, Bundle bundle);
    }


    public static final String EXTRA_BUNDLE = "extra_bundle";
    private Bundle extras;
    ObjectIdMap map;
    private ObjectInterface object;

    public ObjectInterfaceMenuDialog()
    {
        setArguments(new Bundle());
    }

    public static ObjectInterfaceMenuDialog create(MenuCallback menucallback, CharSequence charsequence, ObjectInterface objectinterface)
    {
        return create(menucallback, charsequence, objectinterface, null);
    }

    public static ObjectInterfaceMenuDialog create(MenuCallback menucallback, CharSequence charsequence, ObjectInterface objectinterface, Bundle bundle)
    {
        ObjectInterfaceMenuDialog objectinterfacemenudialog = new ObjectInterfaceMenuDialog();
        Bundle bundle1 = new Bundle();
        if (menucallback instanceof Fragment)
        {
            menucallback = (Fragment)menucallback;
            menucallback.getActivity().getSupportFragmentManager().a(bundle1, "context_fragment", menucallback);
        }
        bundle1.putInt("com.skype.objId", objectinterface.getObjectID());
        bundle1.putString("com.skype.objClass", objectinterface.getClass().getName());
        bundle1.putCharSequence("list_title", charsequence);
        bundle1.putBundle("extra_bundle", bundle);
        objectinterfacemenudialog.setArguments(bundle1);
        return objectinterfacemenudialog;
    }

    protected void createContextMenuItems()
    {
        int i = getArguments().getInt("com.skype.objId");
        extras = getArguments().getBundle("extra_bundle");
        Object obj;
        try
        {
            obj = Class.forName(getArguments().getString("com.skype.objClass"));
            object = map.a(i, ((Class) (obj)));
            obj = (MenuCallback)getCallback();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception.printStackTrace();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        ((MenuCallback) (obj)).onCreateContextMenu(getMenuBuilder(), object, extras);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    protected void onItemSelected(MenuItem menuitem)
    {
        MenuCallback menucallback = (MenuCallback)getCallback();
        if (menucallback != null)
        {
            menucallback.onContextItemSelected(menuitem, object, extras);
        }
    }
}
