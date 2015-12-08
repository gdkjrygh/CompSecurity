// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.TextView;
import com.skype.android.SkypeApplication;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfo;
import com.skype.android.widget.ViewPagerIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIControllerComponent, SearchWeightedMediaContent, MediaPickerContentSearchModel, DaggerPickerMediaSearchUIControllerComponent, 
//            MediaPickerSearchResultsViewPagerAdapter

public class PickerMediaSearchUIController
{
    public static final class ContentType extends Enum
    {

        private static final ContentType $VALUES[];
        public static final ContentType EMOTICON;
        public static final ContentType MOJI;
        final com.skype.MediaDocument.DOCUMENT_TYPE documentType;
        final int titleText;
        final int titleTextWithCount;

        public static ContentType valueOf(String s)
        {
            return (ContentType)Enum.valueOf(com/skype/android/app/chat/picker/Search/PickerMediaSearchUIController$ContentType, s);
        }

        public static ContentType[] values()
        {
            return (ContentType[])$VALUES.clone();
        }

        static 
        {
            EMOTICON = new ContentType("EMOTICON", 0, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON, 0x7f08035a, 0x7f08035b);
            MOJI = new ContentType("MOJI", 1, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK, 0x7f08035c, 0x7f08035d);
            $VALUES = (new ContentType[] {
                EMOTICON, MOJI
            });
        }

        private ContentType(String s, int i, com.skype.MediaDocument.DOCUMENT_TYPE document_type, int j, int k)
        {
            super(s, i);
            documentType = document_type;
            titleText = j;
            titleTextWithCount = k;
        }
    }


    AsyncService async;
    private PickerMediaSearchUIControllerComponent component;
    private final ContentType contentType;
    protected Context context;
    protected Set currentMediaSearchResult;
    private MediaContentRoster mediaContentRoster;
    private MediaPickerContentSearchModel mediaPickerContentSearchModel;
    private com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaPreviewCallback mediaPreviewCallback;
    private com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback mediaSendCallback;
    private TextView mediaTypeTitleText;
    private TextView noResultsFoundTextView;
    private volatile Set originalMediaList;
    private Future searchAsyncTask;
    private String searchQuery;
    AsyncCallback searchResultCallback;
    private ViewPager searchResultsViewPager;
    private ViewPagerIndicator viewPagerIndicator;

    protected PickerMediaSearchUIController(ContentType contenttype, Context context1, ViewPager viewpager, TextView textview, TextView textview1, MediaContentRoster mediacontentroster, com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaSendCallback mediasendcallback, 
            com.skype.android.app.chat.picker.PickerItemInteractionManager.MediaPreviewCallback mediapreviewcallback, ViewPagerIndicator viewpagerindicator)
    {
        searchResultCallback = new AsyncCallback() {

            final PickerMediaSearchUIController this$0;

            public final void done(AsyncResult asyncresult)
            {
                setMediaSearchResultView((Set)asyncresult.a());
            }

            
            {
                this$0 = PickerMediaSearchUIController.this;
                super();
            }
        };
        contentType = contenttype;
        context = context1;
        searchResultsViewPager = viewpager;
        noResultsFoundTextView = textview;
        viewPagerIndicator = viewpagerindicator;
        mediaTypeTitleText = textview1;
        mediaContentRoster = mediacontentroster;
        mediaSendCallback = mediasendcallback;
        mediaPreviewCallback = mediapreviewcallback;
        getComponent().inject(this);
        originalMediaList = new TreeSet(SearchWeightedMediaContent.SEARCH_WEIGHTED_MEDIA_CONTENT_COMPARATOR);
        currentMediaSearchResult = new TreeSet(SearchWeightedMediaContent.SEARCH_WEIGHTED_MEDIA_CONTENT_COMPARATOR);
        searchResultsViewPager.setOffscreenPageLimit(3);
        mediaPickerContentSearchModel = new MediaPickerContentSearchModel();
    }

    private PickerMediaSearchUIControllerComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerPickerMediaSearchUIControllerComponent.builder().skypeApplicationComponent(((SkypeApplication)context.getApplicationContext()).a()).build();
        }
        return component;
    }

    private Future searchForStringInMediaItemsAsync(final Set mediaSetToSearch, final String searchString, AsyncCallback asynccallback)
    {
        mediaSetToSearch = new Callable() {

            final PickerMediaSearchUIController this$0;
            final Set val$mediaSetToSearch;
            final String val$searchString;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final Set call()
                throws Exception
            {
                return mediaPickerContentSearchModel.searchForString(mediaSetToSearch, searchString);
            }

            
            {
                this$0 = PickerMediaSearchUIController.this;
                mediaSetToSearch = set;
                searchString = s;
                super();
            }
        };
        return async.a(mediaSetToSearch, asynccallback);
    }

    private void setMediaSearchResultView(Set set)
    {
        if (set != null && !set.isEmpty())
        {
            currentMediaSearchResult = set;
            MediaPickerSearchResultsViewPagerAdapter mediapickersearchresultsviewpageradapter = new MediaPickerSearchResultsViewPagerAdapter(context, set, mediaContentRoster, mediaSendCallback, mediaPreviewCallback, getSupportedMediaType());
            searchResultsViewPager.setAdapter(mediapickersearchresultsviewpageradapter);
            int i = mediapickersearchresultsviewpageradapter.getTotalPages();
            if (i <= 1)
            {
                viewPagerIndicator.setVisibility(4);
            } else
            {
                viewPagerIndicator.setTotalPages(i);
                viewPagerIndicator.setVisibility(0);
                viewPagerIndicator.requestLayout();
            }
            searchResultsViewPager.setVisibility(0);
            noResultsFoundTextView.setVisibility(8);
            i = set.size();
            mediaTypeTitleText.setText(context.getString(contentType.titleTextWithCount, new Object[] {
                Integer.valueOf(i)
            }));
            return;
        } else
        {
            currentMediaSearchResult.clear();
            searchResultsViewPager.setVisibility(8);
            noResultsFoundTextView.setVisibility(0);
            mediaTypeTitleText.setText(context.getString(contentType.titleText));
            viewPagerIndicator.setVisibility(8);
            return;
        }
    }

    public int getSearchResultsCount()
    {
        return currentMediaSearchResult.size();
    }

    public com.skype.MediaDocument.DOCUMENT_TYPE getSupportedMediaType()
    {
        return contentType.documentType;
    }

    public void initializeOriginalList(ArrayList arraylist)
    {
        TreeSet treeset = new TreeSet(SearchWeightedMediaContent.SEARCH_WEIGHTED_MEDIA_CONTENT_COMPARATOR);
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            Object obj = (PackInfo)arraylist.next();
            if (getSupportedMediaType() == ((PackInfo) (obj)).e())
            {
                obj = ((PackInfo) (obj)).c.iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    treeset.add(new SearchWeightedMediaContent(0, (MediaContent)((Iterator) (obj)).next()));
                }
            }
        } while (true);
        originalMediaList.clear();
        originalMediaList.addAll(treeset);
        if (searchQuery != null && !searchQuery.isEmpty())
        {
            searchAsync(searchQuery, true);
        }
    }

    public void searchAsync(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (searchAsyncTask != null)
        {
            flag1 = flag;
            if (!searchAsyncTask.isDone())
            {
                searchAsyncTask.cancel(true);
                flag1 = true;
            }
        }
        if (flag1 || currentMediaSearchResult.isEmpty())
        {
            searchAsyncTask = searchForStringInMediaItemsAsync(originalMediaList, s, searchResultCallback);
            return;
        } else
        {
            searchAsyncTask = searchForStringInMediaItemsAsync(currentMediaSearchResult, s, searchResultCallback);
            return;
        }
    }

    public void voidResults()
    {
        searchQuery = "";
        currentMediaSearchResult.clear();
        searchResultsViewPager.removeAllViews();
    }


}
