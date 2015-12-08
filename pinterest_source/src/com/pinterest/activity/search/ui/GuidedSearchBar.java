// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.search.event.SearchSuggestionEvent;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Colors;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchTokenView

public class GuidedSearchBar extends RelativeLayout
{

    private static final int BAR_PADDING_LEFT_WITHOUT_ICON = (int)Resources.dimension(0x7f0a01c8);
    private static final int BAR_PADDING_LEFT_WITH_ICON = (int)Resources.dimension(0x7f0a01c2);
    private static final int BAR_PADDING_RIGHT = (int)Resources.dimension(0x7f0a01c4);
    private static final Set CONJUNCTIONS = new HashSet(Arrays.asList(Resources.stringArray(0x7f08003d)));
    private static final int QUERY_TEXT_PADDING = (int)Resources.dimension(0x7f0a0162);
    private List _actionFilterList;
    private String _apiTag;
    private Drawable _crossIcon;
    private int _firstTokenColor;
    View _focusView;
    private final LayoutInflater _inflater;
    private QueryMetaData _lastQueryData;
    private com.pinterest.activity.search.model.QueryMetaData.FilterState _lastQueryState;
    private int _lastTokenColor;
    private List _queryMetaList;
    EditText _queryText;
    LinearLayout _searchEt;
    private String _searchHint;
    private Drawable _searchIcon;
    ImageView _searchRightIcon;
    private SearchScope _searchScope;
    private com.pinterest.activity.search.event.GuidedSearchEvent.SearchType _searchType;
    HorizontalScrollView _tokenScrollable;
    GrayWebImageView _userIcon;
    private String prevQuery;
    private TextWatcher searchTextWatcher;
    private android.view.View.OnTouchListener touchListener;

    public GuidedSearchBar(Context context)
    {
        this(context, null);
    }

    public GuidedSearchBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GuidedSearchBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _searchScope = SearchScope.GLOBAL_SEARCH;
        _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
        _lastTokenColor = 0;
        _firstTokenColor = 0;
        _queryMetaList = new ArrayList();
        _actionFilterList = new ArrayList();
        touchListener = new _cls5();
        prevQuery = "";
        searchTextWatcher = new _cls6();
        _inflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
        init();
    }

    private boolean addToken(String s, String s1, boolean flag, boolean flag1, SearchFilter searchfilter)
    {
        int i = _searchEt.getChildCount();
        if (flag1)
        {
            i = 0;
        } else
        {
            i--;
        }
        _searchEt.addView(getTokenViewForString(s, s1, flag, searchfilter), i);
        _queryText.setHint("");
        if (flag)
        {
            _tokenScrollable.scrollTo(_searchEt.getChildAt(0).getWidth(), 0);
        } else
        {
            postDelayed(new _cls7(), 100L);
        }
        setSearchBarRightDrawable(false);
        alignUserIcon(false);
        return true;
    }

    private int getTokenColor(String s, String s1, SearchFilter searchfilter)
    {
        if (searchfilter != null && StringUtils.isNotEmpty(s1) && (com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equals(searchfilter.getType()) || com.pinterest.api.model.SearchFilter.FilterType.SALIENT_COLOR.getValue().equals(searchfilter.getType())))
        {
            _firstTokenColor = Color.parseColor(s1);
            return _firstTokenColor;
        }
        if (_lastTokenColor != 0)
        {
            _lastTokenColor = Colors.getSimilarColor(_lastTokenColor, s);
            return _lastTokenColor;
        } else
        {
            _lastTokenColor = Colors.getRandomColorFromSeed(s);
            _firstTokenColor = _lastTokenColor;
            return _lastTokenColor;
        }
    }

    private View getTokenViewForString(final String query, String s, boolean flag, final SearchFilter searchFilter)
    {
        final GuidedSearchTokenView tokenView = (GuidedSearchTokenView)_inflater.inflate(0x7f030192, this, false);
        tokenView.setQuery(query);
        tokenView.setDominantColor(getTokenColor(query, s, searchFilter));
        tokenView.setFront(flag);
        tokenView.setSearchFilter(searchFilter);
        tokenView.updateUI();
        tokenView.getRemoveToken().setOnClickListener(new _cls9());
        tokenView.getTokenNameWrapper().setOnClickListener(new _cls10());
        return tokenView;
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03001a, this, true);
        ButterKnife.a(this);
        _queryText.addTextChangedListener(searchTextWatcher);
        _queryText.setOnEditorActionListener(new _cls1());
        _queryText.setOnTouchListener(touchListener);
        _queryText.setOnFocusChangeListener(new _cls2());
        _queryText.setOnKeyListener(new _cls3());
        _searchIcon = Resources.drawable(0x7f0201ec);
        _searchIcon.setBounds(0, 0, _searchIcon.getIntrinsicWidth(), _searchIcon.getIntrinsicHeight());
        _crossIcon = Resources.drawable(0x7f020168);
        _crossIcon.setBounds(0, 0, _crossIcon.getIntrinsicWidth(), _crossIcon.getIntrinsicHeight());
        _searchRightIcon.setOnClickListener(new _cls4());
        SearchApi.a(_apiTag);
    }

    private void removeMetaData(String s)
    {
        int i;
        _lastQueryState = com.pinterest.activity.search.model.QueryMetaData.FilterState.REMOVED;
        i = 0;
_L3:
        if (i >= _queryMetaList.size())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (!((QueryMetaData)_queryMetaList.get(i)).getQuery().equals(s)) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            _lastQueryData = (QueryMetaData)_queryMetaList.get(i);
            _queryMetaList.remove(i);
        } else
        {
            i = 0;
            while (i < _queryMetaList.size()) 
            {
                QueryMetaData querymetadata = (QueryMetaData)_queryMetaList.get(i);
                String as[] = StringUtils.split(querymetadata.getQuery());
                StringBuilder stringbuilder = new StringBuilder();
                int k = as.length;
                int j = 0;
                while (j < k) 
                {
                    Object obj = as[j];
                    if (((String) (obj)).equals(s))
                    {
                        obj = new QueryMetaData();
                        ((QueryMetaData) (obj)).setQuery(s);
                        ((QueryMetaData) (obj)).setPosition(querymetadata.getPosition());
                        ((QueryMetaData) (obj)).setType(querymetadata.getType());
                        _lastQueryData = ((QueryMetaData) (obj));
                    } else
                    {
                        stringbuilder.append(((String) (obj))).append(" ");
                    }
                    j++;
                }
                querymetadata.setQuery(StringUtils.trimToEmpty(stringbuilder.toString()));
                i++;
            }
        }
        return;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public void addQueryList(String s)
    {
        int i;
        int j;
        if (StringUtils.isEmpty(s))
        {
            return;
        }
        String as[] = s.split("\\s+");
        j = _searchEt.getChildCount() - 1;
        i = 0;
        do
        {
            if (i >= as.length)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            boolean flag;
            if (CONJUNCTIONS.contains(as[i].toLowerCase()))
            {
                i = 0;
                break MISSING_BLOCK_LABEL_54;
            }
            i++;
        } while (true);
_L2:
        if (i != 0)
        {
            flag = false;
            i = j;
            for (j = ((flag) ? 1 : 0); j < as.length;)
            {
                s = as[j];
                _searchEt.addView(getTokenViewForString(s, null, false, null), i);
                j++;
                i++;
            }

        } else
        {
            _searchEt.addView(getTokenViewForString(s, null, false, null), j);
        }
        _queryText.setHint("");
        postDelayed(new _cls8(), 100L);
        setSearchBarRightDrawable(false);
        alignUserIcon(false);
        return;
        i = 1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void addQueryMetaData(QueryMetaData querymetadata)
    {
        _queryMetaList.add(querymetadata);
    }

    public boolean addSearchFilter(SearchFilter searchfilter, String s, boolean flag, boolean flag1)
    {
        int j = _actionFilterList.size();
        for (int i = 0; i < j - 1; i++)
        {
            SearchFilter searchfilter1 = (SearchFilter)_actionFilterList.get(i);
            if (searchfilter1.getType().equalsIgnoreCase(searchfilter.getType()) && (com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equalsIgnoreCase(searchfilter1.getType()) || searchfilter1.getTypeValue().equalsIgnoreCase(searchfilter.getTypeValue())))
            {
                return false;
            }
        }

        _actionFilterList.add(searchfilter);
        return addToken(searchfilter.getDisplayName(), s, flag, flag1, searchfilter);
    }

    public boolean addTokenFilter(String s, String s1, boolean flag, boolean flag1)
    {
        int j = _searchEt.getChildCount();
        for (int i = 0; i < j - 1; i++)
        {
            if (((GuidedSearchTokenView)_searchEt.getChildAt(i)).getQuery().equalsIgnoreCase(s))
            {
                return false;
            }
        }

        return addToken(s, s1, flag, flag1, null);
    }

    public void alignUserIcon(boolean flag)
    {
        if (_searchScope == SearchScope.GLOBAL_SEARCH)
        {
            return;
        }
        if (flag)
        {
            _tokenScrollable.setPadding(BAR_PADDING_LEFT_WITH_ICON, 0, BAR_PADDING_RIGHT, 0);
            _userIcon.setVisibility(0);
            return;
        } else
        {
            _tokenScrollable.setPadding(BAR_PADDING_LEFT_WITHOUT_ICON, 0, BAR_PADDING_RIGHT, 0);
            _userIcon.setVisibility(8);
            return;
        }
    }

    public void clearAllQueryTokens()
    {
        Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.SEARCH_BOX);
        _queryText.setText("");
        _queryText.setHint(_searchHint);
        setSearchBarRightDrawable(true);
        alignUserIcon(true);
        for (int i = _searchEt.getChildCount(); i > 1; i--)
        {
            _searchEt.removeViewAt(0);
        }

        _queryMetaList.clear();
        _actionFilterList.clear();
        if (_lastQueryData != null)
        {
            _lastQueryData.setFilters(null);
        }
        Events.post(new SearchSuggestionEvent("", com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY));
        _queryText.requestFocus();
        Device.showSoftKeyboard(_queryText);
    }

    public void clearQueryText()
    {
        _queryText.setText("");
    }

    public void clearTokens(boolean flag)
    {
        int i = _searchEt.getChildCount();
        GuidedSearchTokenView guidedsearchtokenview = null;
        for (; i > 1; i--)
        {
            GuidedSearchTokenView guidedsearchtokenview1 = (GuidedSearchTokenView)_searchEt.getChildAt(0);
            if (guidedsearchtokenview1.getSearchFilter() != null && guidedsearchtokenview1.getSearchFilter().getType().equals(com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue()))
            {
                guidedsearchtokenview = guidedsearchtokenview1;
            }
            _searchEt.removeViewAt(0);
        }

        _queryMetaList.clear();
        _actionFilterList.clear();
        if (flag && guidedsearchtokenview != null)
        {
            addSearchFilter(guidedsearchtokenview.getSearchFilter(), "#bd081c", true, true);
        }
    }

    public List getActionFilterList()
    {
        return _actionFilterList;
    }

    public String getCurrentTokenQuery(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = _searchEt.getChildCount();
        int i = 0;
        while (i < j - 1) 
        {
            Object obj = _searchEt.getChildAt(i);
            if (!(obj instanceof GuidedSearchTokenView))
            {
                continue;
            }
            obj = (GuidedSearchTokenView)obj;
            SearchFilter searchfilter = ((GuidedSearchTokenView) (obj)).getSearchFilter();
            if (searchfilter == null || flag && !com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equals(searchfilter.getType()))
            {
                if (((GuidedSearchTokenView) (obj)).isFront())
                {
                    stringbuilder.insert(0, " ").insert(0, ((GuidedSearchTokenView) (obj)).getQuery());
                } else
                {
                    stringbuilder.append(((GuidedSearchTokenView) (obj)).getQuery()).append(" ");
                }
            }
            i++;
        }
        return StringUtils.trimToEmpty(stringbuilder.toString());
    }

    public int getFirstTokenColor()
    {
        return _firstTokenColor;
    }

    public void getFocus()
    {
        if (_searchEt != null)
        {
            _searchEt.requestFocus();
            if (StringUtils.isEmpty(_queryText.getText().toString()))
            {
                _queryText.setText("");
            }
            Device.showSoftKeyboard(_queryText);
        }
    }

    public QueryMetaData getLastQueryDataWithFilters()
    {
        if (_lastQueryData != null)
        {
            _lastQueryData.setFilters(_actionFilterList);
        }
        return _lastQueryData;
    }

    public com.pinterest.activity.search.model.QueryMetaData.FilterState getLastQueryState()
    {
        return _lastQueryState;
    }

    public List getQueryMetaDataList()
    {
        return _queryMetaList;
    }

    public String getQueryText()
    {
        return _queryText.getText().toString();
    }

    public com.pinterest.activity.search.event.GuidedSearchEvent.SearchType getSearchType()
    {
        return _searchType;
    }

    public void loseFocus()
    {
        _focusView.requestFocus();
    }

    public boolean searchHintEnabled()
    {
        return _searchEt.getChildCount() <= 1;
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setLastQueryData(QueryMetaData querymetadata)
    {
        _lastQueryData = querymetadata;
    }

    public void setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState filterstate)
    {
        _lastQueryState = filterstate;
    }

    public void setSearchBarRightDrawable(boolean flag)
    {
        ImageView imageview = _searchRightIcon;
        Drawable drawable;
        if (flag)
        {
            drawable = _searchIcon;
        } else
        {
            drawable = _crossIcon;
        }
        imageview.setImageDrawable(drawable);
    }

    public void setSearchHint(String s)
    {
        _searchHint = s;
        _queryText.setHint(_searchHint);
    }

    public void setSearchType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        _searchType = searchtype;
    }

    public void setUser(User user)
    {
        if (user != null)
        {
            _tokenScrollable.setPadding(BAR_PADDING_LEFT_WITH_ICON, 0, BAR_PADDING_RIGHT, 0);
            _queryText.setPadding(0, 0, QUERY_TEXT_PADDING, 0);
            if (ModelHelper.isValid(user.getImageMediumUrl()))
            {
                ViewHelper.setVisibility(_userIcon, 0);
                _userIcon.setOval(true);
                _userIcon.loadUrl(user.getImageMediumUrl());
            } else
            {
                ViewHelper.setVisibility(_userIcon, 8);
            }
            _searchHint = Resources.string(0x7f0704f1);
            _searchScope = SearchScope.LOCAL_SEARCH;
        } else
        {
            _tokenScrollable.setPadding(BAR_PADDING_LEFT_WITHOUT_ICON, 0, BAR_PADDING_RIGHT, 0);
            _queryText.setPadding(QUERY_TEXT_PADDING, 0, QUERY_TEXT_PADDING, 0);
            ViewHelper.setVisibility(_userIcon, 8);
            if (Experiments.s())
            {
                _searchHint = Resources.string(0x7f0704c8);
            } else
            {
                _searchHint = Resources.string(0x7f0704dc);
            }
            _searchScope = SearchScope.GLOBAL_SEARCH;
        }
        _queryText.setHint(_searchHint);
    }

    public void useLibraryStyle()
    {
        _tokenScrollable.setBackgroundResource(0);
        _queryText.setTextColor(getResources().getColor(0x7f0e007b));
        _queryText.setTextSize(0, getResources().getDimensionPixelSize(0x7f0a0153));
        setSearchHint("");
    }




/*
    static QueryMetaData access$102(GuidedSearchBar guidedsearchbar, QueryMetaData querymetadata)
    {
        guidedsearchbar._lastQueryData = querymetadata;
        return querymetadata;
    }

*/


/*
    static com.pinterest.activity.search.model.QueryMetaData.FilterState access$202(GuidedSearchBar guidedsearchbar, com.pinterest.activity.search.model.QueryMetaData.FilterState filterstate)
    {
        guidedsearchbar._lastQueryState = filterstate;
        return filterstate;
    }

*/





/*
    static String access$502(GuidedSearchBar guidedsearchbar, String s)
    {
        guidedsearchbar.prevQuery = s;
        return s;
    }

*/



/*
    static int access$702(GuidedSearchBar guidedsearchbar, int i)
    {
        guidedsearchbar._lastTokenColor = i;
        return i;
    }

*/



/*
    static List access$802(GuidedSearchBar guidedsearchbar, List list)
    {
        guidedsearchbar._actionFilterList = list;
        return list;
    }

*/

    private class SearchScope extends Enum
    {

        private static final SearchScope $VALUES[];
        public static final SearchScope GLOBAL_SEARCH;
        public static final SearchScope LOCAL_SEARCH;

        public static SearchScope valueOf(String s)
        {
            return (SearchScope)Enum.valueOf(com/pinterest/activity/search/ui/GuidedSearchBar$SearchScope, s);
        }

        public static SearchScope[] values()
        {
            return (SearchScope[])$VALUES.clone();
        }

        static 
        {
            GLOBAL_SEARCH = new SearchScope("GLOBAL_SEARCH", 0);
            LOCAL_SEARCH = new SearchScope("LOCAL_SEARCH", 1);
            $VALUES = (new SearchScope[] {
                GLOBAL_SEARCH, LOCAL_SEARCH
            });
        }

        private SearchScope(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls5
        implements android.view.View.OnTouchListener
    {

        final GuidedSearchBar this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            EditText edittext = (EditText)view;
            if (!view.isFocused())
            {
                requestFocusFromTouch();
                Device.showSoftKeyboard(edittext);
                motionevent = getCurrentTokenQuery(true);
                if (_searchEt.getChildCount() > 1 && StringUtils.isNotEmpty(motionevent))
                {
                    clearTokens(true);
                    edittext.setText(motionevent);
                    if (motionevent.isEmpty())
                    {
                        view = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY;
                    } else
                    {
                        view = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.AUTO_COMPLETE;
                    }
                    Events.post(new SearchSuggestionEvent(motionevent, view));
                } else
                {
                    edittext.setText(edittext.getText());
                }
            }
            return false;
        }

        _cls5()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls6
        implements TextWatcher
    {

        final GuidedSearchBar this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (searchHintEnabled())
            {
                if (charsequence.length() == 0)
                {
                    _queryText.setHint(_searchHint);
                }
                String s = StringUtils.trimToEmpty(charsequence.toString());
                setSearchBarRightDrawable(s.isEmpty());
                alignUserIcon(true);
                if (!StringUtils.isNotEmpty(s) || !s.equals(prevQuery))
                {
                    prevQuery = s;
                    if (s.isEmpty())
                    {
                        charsequence = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY;
                    } else
                    {
                        charsequence = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.AUTO_COMPLETE;
                    }
                    Events.post(new SearchSuggestionEvent(s, charsequence));
                    return;
                }
            }
        }

        _cls6()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls7
        implements Runnable
    {

        final GuidedSearchBar this$0;

        public void run()
        {
            _tokenScrollable.fullScroll(66);
            loseFocus();
        }

        _cls7()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final GuidedSearchBar this$0;
        final SearchFilter val$searchFilter;
        final GuidedSearchTokenView val$tokenView;

        public void onClick(View view)
        {
            view = new HashMap();
            view.put("label", tokenView.getQuery());
            if (searchFilter != null)
            {
                view.put("filter_type", searchFilter.getType());
            }
            Pinalytics.a(ElementType.SEARCH_TOKEN, ComponentType.SEARCH_BOX, view);
            _searchEt.removeView(tokenView);
            removeMetaData(tokenView.getQuery());
            view = tokenView.getSearchFilter();
            if (searchHintEnabled())
            {
                _lastTokenColor = 0;
                if (view != null)
                {
                    _actionFilterList.clear();
                    if (_queryText.getText().toString().isEmpty())
                    {
                        clearAllQueryTokens();
                    }
                    return;
                } else
                {
                    setSearchBarRightDrawable(true);
                    alignUserIcon(true);
                    Events.post(new SearchSuggestionEvent(getCurrentTokenQuery(false), com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY));
                    _queryText.setHint(_searchHint);
                    _queryText.requestFocus();
                    Device.showSoftKeyboard(_queryText);
                    return;
                }
            }
            if (view != null)
            {
                if (view.getType().equals(com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue()))
                {
                    view = new GuidedSearchEvent(getCurrentTokenQuery(true), _searchType);
                    _actionFilterList = new ArrayList();
                    for (int i = 0; i < _searchEt.getChildCount() - 1; i++)
                    {
                        ((GuidedSearchTokenView)_searchEt.getChildAt(i)).setSearchFilter(null);
                    }

                } else
                {
                    view = new GuidedSearchEvent(null, _searchType);
                    _actionFilterList.remove(tokenView.getSearchFilter());
                }
                view.setForceRefresh(true);
                if (_searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
                {
                    StopWatch.get().start("search_ttrfp");
                }
                Events.post(view);
                return;
            }
            view = new GuidedSearchEvent(getCurrentTokenQuery(false), _searchType);
            if (_actionFilterList.size() > 0)
            {
                view.setForceRefresh(true);
            }
            if (_searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
            {
                StopWatch.get().start("search_ttrfp");
            }
            Events.post(view);
        }

        _cls9()
        {
            this$0 = GuidedSearchBar.this;
            tokenView = guidedsearchtokenview;
            searchFilter = searchfilter;
            super();
        }
    }


    private class _cls10
        implements android.view.View.OnClickListener
    {

        final GuidedSearchBar this$0;
        final String val$query;
        final SearchFilter val$searchFilter;

        public void onClick(View view)
        {
            if (searchFilter != null && com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equals(searchFilter.getType()))
            {
                return;
            }
            String s = getCurrentTokenQuery(true);
            clearTokens(true);
            alignUserIcon(true);
            _queryText.setText(s);
            int i = s.indexOf(query) + query.length();
            if (i < s.length() && i >= 0)
            {
                _queryText.setSelection(i);
            }
            _queryText.requestFocus();
            if (s.isEmpty())
            {
                view = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY;
            } else
            {
                view = com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.AUTO_COMPLETE;
            }
            Events.post(new SearchSuggestionEvent(s, view));
            Device.showSoftKeyboard(_queryText);
        }

        _cls10()
        {
            this$0 = GuidedSearchBar.this;
            searchFilter = searchfilter;
            query = s;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final GuidedSearchBar this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 3 || i == 6 || keyevent == null || keyevent.getKeyCode() == 66)
            {
                textview = StringUtils.trimToEmpty(textview.getText().toString());
                if (textview.isEmpty())
                {
                    return true;
                }
                keyevent = new HashMap();
                keyevent.put("entered_query", textview);
                Pinalytics.a(EventType.TAP, ElementType.SEARCH_BOX_TEXT_INPUT, ComponentType.SEARCH_BOX, null, keyevent, null);
                keyevent = new QueryMetaData(textview, com.pinterest.activity.search.model.QueryMetaData.ContextType.TYPED);
                _queryMetaList.add(keyevent);
                _lastQueryData = keyevent;
                _lastQueryState = com.pinterest.activity.search.model.QueryMetaData.FilterState.ADDED;
                addQueryList(textview);
                _queryText.setText("");
                _queryText.setHint("");
                if (_searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
                {
                    StopWatch.get().start("search_ttrfp");
                }
                Events.post(new GuidedSearchEvent(getCurrentTokenQuery(false), _searchType));
                return true;
            } else
            {
                return false;
            }
        }

        _cls1()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnFocusChangeListener
    {

        final GuidedSearchBar this$0;

        public void onFocusChange(View view, boolean flag)
        {
            if (!flag)
            {
                Device.hideSoftKeyboard(view);
            }
        }

        _cls2()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnKeyListener
    {

        final GuidedSearchBar this$0;

        public boolean onKey(View view, int i, KeyEvent keyevent)
        {
            if (i == 4 && _queryText.hasFocus())
            {
                loseFocus();
            }
            return false;
        }

        _cls3()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final GuidedSearchBar this$0;

        public void onClick(View view)
        {
            clearAllQueryTokens();
        }

        _cls4()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final GuidedSearchBar this$0;

        public void run()
        {
            _tokenScrollable.fullScroll(66);
            loseFocus();
        }

        _cls8()
        {
            this$0 = GuidedSearchBar.this;
            super();
        }
    }

}
