// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.os.Bundle;
import com.pinterest.adapter.CategoryListAdapter;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.remote.CategoryApi;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardBaseDialog

public class BoardEditCategoryDialog extends BoardBaseDialog
{

    private static List _categories;
    private CategoryListAdapter _adapter;
    private String _newCategory;
    private ApiResponseHandler onBoardCategoryEdit;
    private android.widget.AdapterView.OnItemClickListener onCategoryClicked;

    public BoardEditCategoryDialog()
    {
        onCategoryClicked = new _cls1();
        onBoardCategoryEdit = new _cls2(true);
    }

    private void loadCategories()
    {
        CategoryApi.a(new _cls3(false, false), null);
    }

    private void setListView()
    {
        _adapter = new CategoryListAdapter(getActivity(), _board);
        String s = Preferences.user().getString("PREF_CATEGORIES_LOCALE", null);
        if (s == null || !s.equals(Locale.getDefault().toString()) || _categories == null)
        {
            loadCategories();
        } else
        {
            _adapter.setDataSource(_categories);
        }
        setListViewOptions(_adapter, onCategoryClicked);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setTitle(0x7f070082);
        setSubTitle(0x7f070081);
        setListView();
    }



/*
    static String access$102(BoardEditCategoryDialog boardeditcategorydialog, String s)
    {
        boardeditcategorydialog._newCategory = s;
        return s;
    }

*/




/*
    static List access$302(List list)
    {
        _categories = list;
        return list;
    }

*/

    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final BoardEditCategoryDialog this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            Pinalytics.a(ElementType.BOARD_CATEGORY, ComponentType.MODAL_DIALOG, _board.getUid());
            adapterview = _adapter.getItem(i).getKey();
            view = _adapter.getItem(i).getName();
            _board.setCategory(adapterview);
            _newCategory = view;
            ModelHelper.updateBoard(_board, null, adapterview, null, null, null, onBoardCategoryEdit, null);
            dismiss();
        }

        _cls1()
        {
            this$0 = BoardEditCategoryDialog.this;
            super();
        }
    }


    private class _cls2 extends ApiResponseHandler
    {

        final BoardEditCategoryDialog this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToastShort(0x7f070080);
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            Application.showToastShort(Resources.string(0x7f070092));
            Pinalytics.a(EventType.BOARD_EDIT, _board.getUid());
        }

        _cls2(boolean flag)
        {
            this$0 = BoardEditCategoryDialog.this;
            super(flag);
        }
    }


    private class _cls3 extends com.pinterest.api.remote.CategoryApi.CategoriesFeedApiResponse
    {

        final BoardEditCategoryDialog this$0;

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            BoardEditCategoryDialog._categories = new ArrayList(feed.getItems());
            _adapter.setDataSource(BoardEditCategoryDialog._categories);
        }

        _cls3(boolean flag, boolean flag1)
        {
            this$0 = BoardEditCategoryDialog.this;
            super(flag, flag1);
        }
    }

}
