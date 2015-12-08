// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.skype.Account;
import com.skype.Contact;
import com.skype.SkyLib;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ObjectInterfaceItem;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SeparatedColumnsAdapter;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment, ContactGroupLoader, ContactItem, ContactAdapter, 
//            ContactAdapterViewBuilder

public class ContactPickerFragment extends PickerFragment
{

    public static final String EXTRA_SUPPORTED_CONTACT_GROUP_TYPES = "supportedContactGroupTypes";
    AccessibilityUtil accessibility;
    protected Account account;
    ContactAdapter adapter;
    AsyncService async;
    private SeparatedColumnsAdapter columnsAdapter;
    ContactUtil contactUtil;
    EcsConfiguration ecsConfiguration;
    LayoutExperience layoutExperience;
    protected SkyLib lib;
    protected ObjectIdMap map;
    Navigation navigation;
    public EnumSet supportedTypes;
    TelemetryHelper telemetryHelper;
    ContactAdapterViewBuilder viewBuilder;

    public ContactPickerFragment()
    {
    }

    public ContactAdapter getContactAdapter()
    {
        return adapter;
    }

    protected Callable getLoader()
    {
        return new ContactGroupLoader(lib, map, account, supportedTypes, true, true, true, getActivity().getApplication(), ecsConfiguration);
    }

    protected int getObjectId(ContactItem contactitem)
    {
        return contactitem.getContactObjectId();
    }

    protected int getObjectId(ObjectInterfaceItem objectinterfaceitem)
    {
        return objectinterfaceitem.getObjectId();
    }

    protected Class getObjectInterfaceType()
    {
        return com/skype/Contact;
    }

    protected int getTitleId()
    {
        return 0;
    }

    protected boolean isInteractive(Object obj)
    {
        return obj instanceof ContactItem;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        setDataAdapter(adapter);
        bundle = getArguments();
        if (bundle != null && bundle.containsKey("supportedContactGroupTypes"))
        {
            supportedTypes = (EnumSet)bundle.getSerializable("supportedContactGroupTypes");
            return;
        } else
        {
            supportedTypes = EnumSet.of(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
            return;
        }
    }

    public void onDataLoaded(List list)
    {
        adapter.update(list);
        adapter.notifyDataSetChanged();
        if (isMultipleChoice())
        {
            updateSelectionCount(getSelectedCount(adapter.getCheckedState(0)));
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        adapter.setMultipleChoice(isMultipleChoice());
        columnsAdapter = new SeparatedColumnsAdapter(getActivity(), adapter);
        columnsAdapter.a(layoutExperience.isMultipane());
        getListView().setAdapter(columnsAdapter);
    }

    protected void setContentDescriptionForAccessibility(com.skype.android.app.data.DataAdapter.ItemViewHolder itemviewholder)
    {
        ContactAdapter.FullContactItemHolder fullcontactitemholder = (ContactAdapter.FullContactItemHolder)itemviewholder;
        if (!layoutExperience.isMultipane())
        {
            fullcontactitemholder.itemView.setContentDescription(viewBuilder.getLongDescription(fullcontactitemholder));
        }
        AccessibilityUtil.b(itemviewholder.itemView, viewBuilder.getShortDescription(fullcontactitemholder));
    }
}
