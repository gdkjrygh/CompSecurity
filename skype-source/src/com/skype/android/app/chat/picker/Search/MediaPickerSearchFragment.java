// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.g;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.skype.MediaDocument;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogEvent;
import com.skype.android.app.chat.picker.MRUManager;
import com.skype.android.app.chat.picker.MojiPreviewContentView;
import com.skype.android.app.media.MediaDocumentFileProvider;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.MojiContent;
import com.skype.android.mediacontent.OnPackInfoReady;
import com.skype.android.mediacontent.OnVideoReady;
import com.skype.android.mediacontent.PackInfo;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.widget.AccessibleEditText;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.ViewPagerIndicator;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIController, SearchTelemetryEvent, MediaPickerSearchSuggestionsAdapter, MediaPickerSearchSuggestionItemSpacing

public class MediaPickerSearchFragment extends SkypeFragment
    implements TextWatcher, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaPreviewCallback, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback, com.skype.android.app.chat.picker.PickerItemViewBuilder.MediaPendingRequestCallback, MediaPickerSearchSuggestionsAdapter.SuggestionClickListener
{
    public static final class SearchStringSource extends Enum
    {

        private static final SearchStringSource $VALUES[];
        public static final SearchStringSource SUGGESTION_SELECTED;
        public static final SearchStringSource TYPED;

        public static SearchStringSource valueOf(String s)
        {
            return (SearchStringSource)Enum.valueOf(com/skype/android/app/chat/picker/Search/MediaPickerSearchFragment$SearchStringSource, s);
        }

        public static SearchStringSource[] values()
        {
            return (SearchStringSource[])$VALUES.clone();
        }

        static 
        {
            TYPED = new SearchStringSource("TYPED", 0);
            SUGGESTION_SELECTED = new SearchStringSource("SUGGESTION_SELECTED", 1);
            $VALUES = (new SearchStringSource[] {
                TYPED, SUGGESTION_SELECTED
            });
        }

        private SearchStringSource(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ACTION_TYPE_CANCEL_BUTTON_PRESSED = "cancelButtonPressed";
    private static final String ACTION_TYPE_EMOTICON_SELECTED = "emoticonSelected";
    private static final String ACTION_TYPE_MOJI_SENT = "mojiSent";
    private static final String KEY_EMOTICONS_ONLY = "emoticonsOnly";
    private static final String KEY_SEARCH_STRING = "SearchString";
    private static final int MAX_CHAR_LENGTH_PERSONAL_EXPRESSION_SEARCH_TEXT = 32;
    private String actionType;
    Analytics analytics;
    SymbolView clearSearchTextButton;
    private boolean displayEmoticonsOnly;
    ViewPagerIndicator emoticonPagerIndicator;
    private PickerMediaSearchUIController emoticonSearchResultController;
    TextView emoticonTitleText;
    ViewPager emoticonsViewPager;
    private InputMethodManager imm;
    ObjectIdMap map;
    MediaContentRoster mediaContentRoster;
    private MediaPickerSearchSuggestionsAdapter mediaPickerSearchSuggestionsAdapter;
    ViewPagerIndicator mojiPagerIndicator;
    private MojiPreviewContentView mojiPreview;
    RelativeLayout mojiPreviewContainer;
    private PickerMediaSearchUIController mojiSearchResultController;
    private MojiContent mojiSelected;
    TextView mojiTitleText;
    ViewPager mojisViewPager;
    MRUManager mruManager;
    TextView noEmoticonFoundTextView;
    TextView noMojiFoundTextView;
    private int numberOfPreviews;
    private ArrayList packInfoList;
    View previewLineSeperator;
    private String previousSearchedString;
    AccessibleEditText searchQueryEditText;
    ScrollView searchResultScrollView;
    RecyclerView suggestionsRecyclerView;
    TextView suggestionsTitle;

    public MediaPickerSearchFragment()
    {
        packInfoList = new ArrayList();
        numberOfPreviews = 0;
    }

    private void hideSuggestionsView()
    {
        previewLineSeperator.setVisibility(8);
        mojiPreviewContainer.setVisibility(8);
        suggestionsTitle.setVisibility(8);
        suggestionsRecyclerView.setVisibility(8);
    }

    private void initSearchInputToMaxLength()
    {
        searchQueryEditText.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(32)
        });
        searchQueryEditText.addTextChangedListener(this);
    }

    private void initializeMediaListToBeSearched()
    {
        emoticonSearchResultController.initializeOriginalList(packInfoList);
        mojiSearchResultController.initializeOriginalList(packInfoList);
    }

    private void resetToSuggestionsView()
    {
        searchQueryEditText.setText("");
        mojiPreviewContainer.setVisibility(8);
        previewLineSeperator.setVisibility(8);
        suggestionsTitle.setVisibility(0);
        suggestionsRecyclerView.setVisibility(0);
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public SearchStringSource getSearchStringSource()
    {
        return SearchStringSource.TYPED;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        boolean flag;
        if (getArguments() != null && getArguments().getBoolean("emoticonsOnly"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displayEmoticonsOnly = flag;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300ab, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        analytics.a(new SearchTelemetryEvent(LogEvent.M, actionType, numberOfPreviews));
    }

    public void onEmoticonSelected(EmoticonContent emoticoncontent)
    {
        Intent intent = new Intent();
        intent.putExtra("MEDIA_TYPE", "MEDIA_EMOTICON");
        intent.putExtra("MEDIA_ID", emoticoncontent.e());
        FragmentActivity fragmentactivity = getActivity();
        getActivity();
        fragmentactivity.setResult(-1, intent);
        actionType = "emoticonSelected";
        analytics.a(new SearchTelemetryEvent(LogEvent.L, searchQueryEditText.getText().toString(), getSearchStringSource(), com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON, emoticoncontent.m(), mojiSearchResultController.getSearchResultsCount(), emoticonSearchResultController.getSearchResultsCount()));
        getActivity().finish();
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkProgress onmedialinkprogress)
    {
        int i = onmedialinkprogress.getSender().getObjectID();
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkprogress.getProfile());
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$android$app$media$MediaLinkProfile[];

            static 
            {
                $SwitchMap$com$skype$android$app$media$MediaLinkProfile = new int[MediaLinkProfile.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$media$MediaLinkProfile[MediaLinkProfile.DEFAULT_PROFILE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls2..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mojiPreview.updateDownloadProgress(i, onmedialinkprogress.getTotalSize(), onmedialinkprogress.getSizeDownloaded());
            break;
        }
    }

    public void onEvent(com.skype.android.gen.MediaDocumentListener.OnMediaLinkStatusChange onmedialinkstatuschange)
    {
        int i = onmedialinkstatuschange.getSender().getObjectID();
        MediaLinkProfile medialinkprofile = MediaLinkProfile.fromString(onmedialinkstatuschange.getProfile());
        switch (_cls2..SwitchMap.com.skype.android.app.media.MediaLinkProfile[medialinkprofile.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mojiPreview.updateMediaLink(i, onmedialinkstatuschange.getStatus());
            break;
        }
    }

    public void onEvent(OnPackInfoReady onpackinfoready)
    {
        onpackinfoready = onpackinfoready.a();
        if (!onpackinfoready.f() && (onpackinfoready.e() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON || !displayEmoticonsOnly))
        {
            if (packInfoList.contains(onpackinfoready))
            {
                packInfoList.remove(onpackinfoready);
            }
            packInfoList.add(onpackinfoready);
            initializeMediaListToBeSearched();
        }
    }

    public void onEvent(OnVideoReady onvideoready)
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null && onvideoready.b() == mojiSelected.k())
        {
            onvideoready = MediaDocumentFileProvider.getUriForFile(fragmentactivity, new File(onvideoready.a()));
            mojiPreview.setVideoURI(onvideoready);
        }
    }

    public void onMojiPreviewDismissed()
    {
        mojiPreviewContainer.setVisibility(8);
    }

    public void onMojiSelected(MojiContent mojicontent)
    {
        mojiSelected = mojicontent;
        int i = numberOfPreviews;
        numberOfPreviews = i + 1;
        numberOfPreviews = i;
        searchQueryEditText.clearFocus();
        imm.hideSoftInputFromWindow(searchQueryEditText.getWindowToken(), 2);
        previewLineSeperator.setVisibility(0);
        mojiPreviewContainer.setVisibility(0);
        mojiPreview.showMoji(mojicontent);
        analytics.a(new SearchTelemetryEvent(LogEvent.K, searchQueryEditText.getText().toString(), getSearchStringSource(), mojicontent.m(), mojiSearchResultController.getSearchResultsCount(), emoticonSearchResultController.getSearchResultsCount(), mojicontent.k()));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("SearchString", searchQueryEditText.getText().toString());
        super.onSaveInstanceState(bundle);
    }

    public void onSendMoji(MojiContent mojicontent)
    {
        mruManager.onMojisPosted(mojicontent);
        actionType = "mojiSent";
        Intent intent = new Intent();
        intent.putExtra("MEDIA_TYPE", "MEDIA_FLIK");
        intent.putExtra("MOJI_CONTENT_ID", mojicontent.k());
        FragmentActivity fragmentactivity = getActivity();
        getActivity();
        fragmentactivity.setResult(-1, intent);
        analytics.a(new SearchTelemetryEvent(LogEvent.J, searchQueryEditText.getText().toString(), getSearchStringSource(), mojicontent.m(), mojiSearchResultController.getSearchResultsCount(), emoticonSearchResultController.getSearchResultsCount(), mojicontent.k()));
        getActivity().finish();
    }

    public void onSuggestionClicked(String s)
    {
        searchQueryEditText.setText(s);
        searchQueryEditText.setSelection(searchQueryEditText.getText().length());
    }

    protected void onSupportNavigateUp()
    {
        super.onSupportNavigateUp();
        actionType = "cancelButtonPressed";
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        hideSuggestionsView();
        if (charsequence.length() > 0)
        {
            clearSearchTextButton.setVisibility(0);
            boolean flag;
            if (previousSearchedString.isEmpty() || !charsequence.toString().contains(previousSearchedString))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mojiSearchResultController.searchAsync(charsequence.toString(), flag);
            emoticonSearchResultController.searchAsync(charsequence.toString(), flag);
            previousSearchedString = charsequence.toString();
            searchResultScrollView.setVisibility(0);
            return;
        } else
        {
            clearSearchTextButton.setVisibility(8);
            searchResultScrollView.setVisibility(8);
            suggestionsTitle.setVisibility(0);
            suggestionsRecyclerView.setVisibility(0);
            emoticonSearchResultController.voidResults();
            mojiSearchResultController.voidResults();
            previousSearchedString = "";
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        int i = getContext().getResources().getInteger(0x7f0e0036);
        g g1 = new g(getContext(), i, 1);
        mediaPickerSearchSuggestionsAdapter = new MediaPickerSearchSuggestionsAdapter(getContext(), this);
        suggestionsRecyclerView.setLayoutManager(g1);
        i = getResources().getDimensionPixelSize(0x7f0c01e8);
        suggestionsRecyclerView.addItemDecoration(new MediaPickerSearchSuggestionItemSpacing(i));
        suggestionsRecyclerView.setAdapter(mediaPickerSearchSuggestionsAdapter);
        searchResultScrollView.setVisibility(8);
        initSearchInputToMaxLength();
        previousSearchedString = "";
        clearSearchTextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final MediaPickerSearchFragment this$0;

            public final void onClick(View view1)
            {
                resetToSuggestionsView();
            }

            
            {
                this$0 = MediaPickerSearchFragment.this;
                super();
            }
        });
        mediaContentRoster.d();
        if (bundle != null && bundle.containsKey("SearchString") && !TextUtils.isEmpty(bundle.getString("SearchString")))
        {
            searchQueryEditText.setText(bundle.getString("SearchString"));
        }
        mojiSearchResultController = new PickerMediaSearchUIController(PickerMediaSearchUIController.ContentType.MOJI, getContext(), mojisViewPager, noMojiFoundTextView, mojiTitleText, mediaContentRoster, this, this, mojiPagerIndicator);
        emoticonSearchResultController = new PickerMediaSearchUIController(PickerMediaSearchUIController.ContentType.EMOTICON, getContext(), emoticonsViewPager, noEmoticonFoundTextView, emoticonTitleText, mediaContentRoster, this, this, emoticonPagerIndicator);
        emoticonsViewPager.setOnPageChangeListener(emoticonPagerIndicator);
        mojisViewPager.setOnPageChangeListener(mojiPagerIndicator);
        initializeMediaListToBeSearched();
        mojiPreviewContainer.setVisibility(8);
        mojiPreview = new MojiPreviewContentView(mediaContentRoster, map, this, null, null);
        mojiPreview.initializeContentView(view, getResources());
        imm = (InputMethodManager)getContext().getSystemService("input_method");
    }

    public void putInPendingQueue(int i, int j)
    {
    }

    public void requestThumbnail(int i)
    {
        mediaContentRoster.b(i);
    }

}
