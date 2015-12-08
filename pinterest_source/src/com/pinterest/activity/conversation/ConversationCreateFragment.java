// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.conversation.view.PeopleFacetSearchBar;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.ui.text.PButton;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.conversation:
//            ConversationCreateAdapter

public class ConversationCreateFragment extends BaseFragment
{

    private String _lastSearchTerm;
    private TextWatcher _onSearchEtChanged;
    private android.view.View.OnKeyListener _onSearchKeyListener;
    PeopleFacetSearchBar _peopleFacetSearchBar;
    private ConversationCreateAdapter _peopleListAdapter;
    ListView _peopleListView;
    private android.view.View.OnClickListener onConversationCreateClick;
    private ApiResponseHandler onConversationCreatedHandler;
    private android.widget.AdapterView.OnItemClickListener onItemClickListener;
    private android.widget.AbsListView.OnScrollListener onScrollListener;
    private Set peopleSelected;
    android.view.View.OnTouchListener touchListener;

    public ConversationCreateFragment()
    {
        peopleSelected = new HashSet();
        touchListener = new _cls2();
        onItemClickListener = new _cls3();
        onScrollListener = new _cls4();
        _onSearchEtChanged = new _cls5();
        _onSearchKeyListener = new _cls6();
        onConversationCreateClick = new _cls7();
        onConversationCreatedHandler = new _cls8(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300b7;
        _menuId = 0;
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        Device.hideSoftKeyboard(_peopleFacetSearchBar);
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f07038e);
        bundle = (PButton)LayoutInflater.from(view.getContext()).inflate(0x7f0301c1, _actionBar, false);
        bundle.setText(0x7f070397);
        bundle.setStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
        bundle.setOnClickListener(onConversationCreateClick);
        _actionBar.addView(bundle);
        bundle = (android.support.v7.widget.Toolbar.LayoutParams)bundle.getLayoutParams();
        bundle.gravity = 5;
        bundle.setMargins(Constants.MARGIN, 0, Constants.MARGIN, 0);
        _peopleFacetSearchBar.addTextChangedListener(_onSearchEtChanged);
        _peopleFacetSearchBar.setSearchEtKeyListener(_onSearchKeyListener);
        _peopleFacetSearchBar.setOnTouchListener(touchListener);
        _peopleListAdapter = new ConversationCreateAdapter(view.getContext());
        _peopleListView.setAdapter(_peopleListAdapter);
        _peopleListView.setOnItemClickListener(onItemClickListener);
        _peopleListView.setOnScrollListener(onScrollListener);
        _peopleFacetSearchBar.postDelayed(new _cls1(), 400L);
    }




/*
    static String access$102(ConversationCreateFragment conversationcreatefragment, String s)
    {
        conversationcreatefragment._lastSearchTerm = s;
        return s;
    }

*/



    private class _cls2
        implements android.view.View.OnTouchListener
    {

        final ConversationCreateFragment this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            _peopleFacetSearchBar.getFocus();
            return false;
        }

        _cls2()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ConversationCreateFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            Object obj1;
            _peopleFacetSearchBar.getFocus();
            obj1 = (TypeAheadItem)_peopleListAdapter.getItem(i);
            if (((TypeAheadItem) (obj1)).getItemType() != com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            obj1 = _lastSearchTerm;
            if (!SignupFormUtils.isEmailValid(((String) (obj1)))) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = new TypeAheadItem();
            ((TypeAheadItem) (obj)).setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT);
            ((TypeAheadItem) (obj)).setIdentifier(((String) (obj1)));
_L3:
            if (peopleSelected.add(obj))
            {
                _peopleFacetSearchBar.onPersonSelected(((TypeAheadItem) (obj)));
                _peopleListAdapter.onPersonSelected(((TypeAheadItem) (obj)));
            } else
            {
                peopleSelected.remove(obj);
                _peopleFacetSearchBar.onPersonUnselected(((TypeAheadItem) (obj)));
                _peopleListAdapter.onPersonUnselected(((TypeAheadItem) (obj)));
            }
            _peopleListAdapter.getView(i, view, adapterview);
            return;
_L2:
            Application.showToast(0x7f0702fa);
            return;
            obj = obj1;
            if (((TypeAheadItem) (obj1)).getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONNECT_FB_PLACEHOLDER)
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
                return;
            }
              goto _L3
        }

        _cls3()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.widget.AbsListView.OnScrollListener
    {

        final ConversationCreateFragment this$0;

        public void onScroll(AbsListView abslistview, int i, int j, int k)
        {
        }

        public void onScrollStateChanged(AbsListView abslistview, int i)
        {
            if (i != 0)
            {
                Device.hideSoftKeyboard(abslistview);
            }
        }

        _cls4()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls5
        implements TextWatcher
    {

        final ConversationCreateFragment this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            _lastSearchTerm = StringUtils.trimToEmpty(charsequence.toString());
            _peopleListAdapter.onSearchQueryChanged(_lastSearchTerm);
        }

        _cls5()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnKeyListener
    {

        final ConversationCreateFragment this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (keyevent.getAction() == 0 && i == 67 && StringUtils.isEmpty(_lastSearchTerm))
            {
                view = _peopleFacetSearchBar.removeLastFacet();
                if (view != null)
                {
                    _peopleListAdapter.onPersonUnselected(view);
                    peopleSelected.remove(view);
                    _peopleListView.invalidateViews();
                }
            }
            return false;
        }

        _cls6()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final ConversationCreateFragment this$0;

        public void onClick(View view)
        {
            if (peopleSelected != null && !peopleSelected.isEmpty())
            {
                ConversationApi.a(peopleSelected, onConversationCreatedHandler, getApiTag());
                return;
            } else
            {
                Application.showToast(0x7f07019a);
                return;
            }
        }

        _cls7()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }


    private class _cls8 extends ApiResponseHandler
    {

        final ConversationCreateFragment this$0;

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (apiresponse instanceof PinterestJsonObject)
            {
                apiresponse = Conversation.make((PinterestJsonObject)apiresponse);
                if (apiresponse != null)
                {
                    Events.post(new com.pinterest.activity.task.model.Navigation.Remove(getNavigation()));
                    Events.post(new Navigation(Location.CONVERSATION, apiresponse.getUid()));
                }
            }
        }

        _cls8(boolean flag)
        {
            this$0 = ConversationCreateFragment.this;
            super(flag);
        }
    }


    private class _cls1
        implements Runnable
    {

        final ConversationCreateFragment this$0;

        public void run()
        {
            if (_peopleFacetSearchBar != null)
            {
                _peopleFacetSearchBar.getFocus();
            }
        }

        _cls1()
        {
            this$0 = ConversationCreateFragment.this;
            super();
        }
    }

}
