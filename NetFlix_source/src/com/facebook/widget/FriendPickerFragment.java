// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.facebook.FacebookException;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphUser;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.widget:
//            PickerFragment, GraphObjectAdapter, GraphObjectPagingLoader, SimpleGraphObjectCursor

public class FriendPickerFragment extends PickerFragment
{
    private class ImmediateLoadingStrategy extends PickerFragment.LoadingStrategy
    {

        final FriendPickerFragment this$0;

        private void followNextLink()
        {
            displayActivityCircle();
            loader.followNextLink();
        }

        protected void onLoadFinished(GraphObjectPagingLoader graphobjectpagingloader, SimpleGraphObjectCursor simplegraphobjectcursor)
        {
            super.onLoadFinished(graphobjectpagingloader, simplegraphobjectcursor);
            if (simplegraphobjectcursor != null && !graphobjectpagingloader.isLoading())
            {
                if (simplegraphobjectcursor.areMoreObjectsAvailable())
                {
                    followNextLink();
                    return;
                }
                hideActivityCircle();
                if (simplegraphobjectcursor.isFromCache())
                {
                    long l;
                    if (simplegraphobjectcursor.getCount() == 0)
                    {
                        l = 2000L;
                    } else
                    {
                        l = 0L;
                    }
                    graphobjectpagingloader.refreshOriginalRequest(l);
                    return;
                }
            }
        }

        private ImmediateLoadingStrategy()
        {
            this$0 = FriendPickerFragment.this;
            super(FriendPickerFragment.this);
        }

    }


    private static final String ID = "id";
    public static final String MULTI_SELECT_BUNDLE_KEY = "com.facebook.widget.FriendPickerFragment.MultiSelect";
    private static final String NAME = "name";
    public static final String USER_ID_BUNDLE_KEY = "com.facebook.widget.FriendPickerFragment.UserId";
    private boolean multiSelect;
    private String userId;

    public FriendPickerFragment()
    {
        this(null);
    }

    public FriendPickerFragment(Bundle bundle)
    {
        super(com/facebook/model/GraphUser, com.facebook.android.R.layout.com_facebook_friendpickerfragment, bundle);
        multiSelect = true;
        setFriendPickerSettingsFromBundle(bundle);
    }

    private Request createRequest(String s, Set set, Session session)
    {
        s = Request.newGraphPathRequest(session, (new StringBuilder()).append(s).append("/friends").toString(), null);
        set = new HashSet(set);
        set.addAll(Arrays.asList(new String[] {
            "id", "name"
        }));
        session = adapter.getPictureFieldSpecifier();
        if (session != null)
        {
            set.add(session);
        }
        session = s.getParameters();
        session.putString("fields", TextUtils.join(",", set));
        s.setParameters(session);
        return s;
    }

    private void setFriendPickerSettingsFromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("com.facebook.widget.FriendPickerFragment.UserId"))
            {
                setUserId(bundle.getString("com.facebook.widget.FriendPickerFragment.UserId"));
            }
            setMultiSelect(bundle.getBoolean("com.facebook.widget.FriendPickerFragment.MultiSelect", multiSelect));
        }
    }

    PickerFragment.PickerFragmentAdapter createAdapter()
    {
        PickerFragment.PickerFragmentAdapter pickerfragmentadapter = new PickerFragment.PickerFragmentAdapter(getActivity()) {

            final FriendPickerFragment this$0;

            protected int getDefaultPicture()
            {
                return com.facebook.android.R.drawable.com_facebook_profile_default_icon;
            }

            protected volatile int getGraphObjectRowLayoutId(GraphObject graphobject)
            {
                return getGraphObjectRowLayoutId((GraphUser)graphobject);
            }

            protected int getGraphObjectRowLayoutId(GraphUser graphuser)
            {
                return com.facebook.android.R.layout.com_facebook_picker_list_row;
            }

            
            {
                this$0 = FriendPickerFragment.this;
                super(FriendPickerFragment.this, context);
            }
        };
        pickerfragmentadapter.setShowCheckbox(true);
        pickerfragmentadapter.setShowPicture(getShowPictures());
        pickerfragmentadapter.setSortFields(Arrays.asList(new String[] {
            "name"
        }));
        pickerfragmentadapter.setGroupByField("name");
        return pickerfragmentadapter;
    }

    PickerFragment.LoadingStrategy createLoadingStrategy()
    {
        return new ImmediateLoadingStrategy();
    }

    PickerFragment.SelectionStrategy createSelectionStrategy()
    {
        if (multiSelect)
        {
            return new PickerFragment.MultiSelectionStrategy(this);
        } else
        {
            return new PickerFragment.SingleSelectionStrategy(this);
        }
    }

    String getDefaultTitleText()
    {
        return getString(com.facebook.android.R.string.com_facebook_choose_friends);
    }

    public boolean getMultiSelect()
    {
        return multiSelect;
    }

    Request getRequestForLoadData(Session session)
    {
        if (adapter == null)
        {
            throw new FacebookException("Can't issue requests until Fragment has been created.");
        }
        String s;
        if (userId != null)
        {
            s = userId;
        } else
        {
            s = "me";
        }
        return createRequest(s, extraFields, session);
    }

    public List getSelection()
    {
        return getSelectedGraphObjects();
    }

    public String getUserId()
    {
        return userId;
    }

    public void onInflate(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        super.onInflate(activity, attributeset, bundle);
        activity = activity.obtainStyledAttributes(attributeset, com.facebook.android.R.styleable.com_facebook_friend_picker_fragment);
        setMultiSelect(activity.getBoolean(0, multiSelect));
        activity.recycle();
    }

    void saveSettingsToBundle(Bundle bundle)
    {
        super.saveSettingsToBundle(bundle);
        bundle.putString("com.facebook.widget.FriendPickerFragment.UserId", userId);
        bundle.putBoolean("com.facebook.widget.FriendPickerFragment.MultiSelect", multiSelect);
    }

    public void setMultiSelect(boolean flag)
    {
        if (multiSelect != flag)
        {
            multiSelect = flag;
            setSelectionStrategy(createSelectionStrategy());
        }
    }

    public void setSettingsFromBundle(Bundle bundle)
    {
        super.setSettingsFromBundle(bundle);
        setFriendPickerSettingsFromBundle(bundle);
    }

    public void setUserId(String s)
    {
        userId = s;
    }
}
