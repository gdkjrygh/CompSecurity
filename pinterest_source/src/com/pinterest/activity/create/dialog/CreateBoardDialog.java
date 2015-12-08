// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckBox;
import butterknife.ButterKnife;
import com.pinterest.activity.task.activity.MainActivity;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.base.Application;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PEditText;

public class CreateBoardDialog extends BaseDialog
{

    private static final String KEY_PREFILLED_TITLE = "prefilledTitle";
    PEditText _boardDescriptionEt;
    PEditText _boardTitleEt;
    private String _category;
    private View _container;
    View _createBt;
    private boolean _isPlaceBoard;
    CheckBox _isPlaceBoardCb;
    private boolean _isSecretBoard;
    CheckBox _isSecretBoardCb;
    private boolean _isSuggestedBoard;
    View _learnMoreTv;
    View _moreOptionsBt;
    ViewStub _moreOptionsContainer;
    private String _prefilledTitle;
    private boolean _shouldNavigateToBoardOnCreate;

    public CreateBoardDialog()
    {
        _shouldNavigateToBoardOnCreate = true;
        _isSuggestedBoard = false;
    }

    private void displayMoreOptions()
    {
        _learnMoreTv.setVisibility(0);
        _moreOptionsBt.setVisibility(8);
        _moreOptionsContainer.inflate();
        _boardTitleEt.setImeOptions(5);
        initMoreOptionForm();
    }

    private void initMoreOptionForm()
    {
        ButterKnife.a(this, _container);
        _boardDescriptionEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        _isSecretBoardCb.setChecked(_isSecretBoard);
        _isPlaceBoardCb.setChecked(_isPlaceBoard);
        _boardDescriptionEt.setOnEditorActionListener(new _cls2());
    }

    private void initSimplifiedForm()
    {
        ButterKnife.a(this, _container);
        if (_prefilledTitle != null)
        {
            _boardTitleEt.setText(_prefilledTitle);
        }
        _boardTitleEt.setTypeface(com.pinterest.kit.utils.FontUtils.TypefaceId.LIGHT);
        _boardTitleEt.requestFocus();
        _boardTitleEt.setOnEditorActionListener(new _cls1());
        Device.showSoftKeyboard(getDialog());
    }

    public static CreateBoardDialog newInstance(String s)
    {
        CreateBoardDialog createboarddialog = new CreateBoardDialog();
        if (!TextUtils.isEmpty(s))
        {
            Bundle bundle = new Bundle();
            bundle.putString("prefilledTitle", s);
            createboarddialog.setArguments(bundle);
        }
        return createboarddialog;
    }

    private void submitBoard()
    {
        Object obj = getActivity();
        String s2 = _boardTitleEt.getText().toString();
        String s;
        if (_boardDescriptionEt != null)
        {
            s = _boardDescriptionEt.getText().toString();
        } else
        {
            s = null;
        }
        if (!Board.isNameValid(s2))
        {
            Application.showToast(0x7f07037c);
            return;
        }
        String s1;
        if (_isPlaceBoard)
        {
            s1 = "places";
        } else
        {
            s1 = "default";
        }
        obj = new _cls3(((Activity) (obj)));
        ((com.pinterest.activity.create.helper.CreateBoardHelper.BoardResponseHandler) (obj)).setShowLoadingDialog(true);
        BoardApi.a(s2, _category, s, Boolean.valueOf(_isSecretBoard), s1, ((com.pinterest.api.BaseApiResponseHandler) (obj)));
        Pinalytics.a(ElementType.BOARD_CREATE, ComponentType.MODAL_DIALOG);
        if (isSuggestedBoard() && Experiments.B())
        {
            Pinalytics.a(ElementType.REPIN_DIALOG_SUGGESTED_BOARD, ComponentType.MODAL_DIALOG);
        }
        dismiss();
    }

    public String getCategory()
    {
        return _category;
    }

    public boolean isPlaceBoard()
    {
        return _isPlaceBoard;
    }

    public boolean isSecretBoard()
    {
        return _isSecretBoard;
    }

    public boolean isSuggestedBoard()
    {
        return _isSuggestedBoard;
    }

    public void make(LayoutInflater layoutinflater)
    {
        _container = LayoutInflater.from(getActivity()).inflate(0x7f03006a, null);
        setContent(_container, 0);
        super.make(layoutinflater);
        initSimplifiedForm();
    }

    public void onActivityCreated(Bundle bundle)
    {
        int i;
        if (_isSecretBoard)
        {
            i = 0x7f0701a5;
        } else
        if (_isPlaceBoard)
        {
            i = 0x7f070444;
        } else
        {
            i = 0x7f07019e;
        }
        setTitle(i);
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null && bundle.getString("prefilledTitle") != null)
        {
            _prefilledTitle = bundle.getString("prefilledTitle");
        }
    }

    void onCreatedClicked()
    {
        submitBoard();
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        super.onDestroyView();
    }

    void onLearnMoreClicked()
    {
        Object obj = new Navigation(Location.BROWSER, Resources.string(0x7f07074c));
        ((Navigation) (obj)).putExtra("com.pinterest.EXTRA_WEB_TITLE", Resources.string(0x7f0704f4));
        Events.post(obj);
        obj = getActivity();
        if (!(obj instanceof MainActivity) && obj != null)
        {
            ((Activity) (obj)).finish();
        }
    }

    void onMoreOptionsClicked()
    {
        displayMoreOptions();
    }

    void onPlaceBoardCheckBoxClicked()
    {
        boolean flag;
        if (!_isPlaceBoard)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setIsPlaceBoard(flag);
        Device.hideSoftKeyboard(_container);
        _container.requestFocus();
    }

    void onSecretBoardCheckBoxClicked()
    {
        boolean flag;
        if (!_isSecretBoard)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setIsSecretBoard(flag);
        Device.hideSoftKeyboard(_container);
        _container.requestFocus();
    }

    public void setCategory(String s)
    {
        _category = s;
    }

    public void setIsPlaceBoard(boolean flag)
    {
        _isPlaceBoard = flag;
        if (_isPlaceBoardCb != null)
        {
            _isPlaceBoardCb.setChecked(_isPlaceBoard);
        }
    }

    public void setIsSecretBoard(boolean flag)
    {
        _isSecretBoard = flag;
        if (_isSecretBoardCb != null)
        {
            _isSecretBoardCb.setChecked(_isSecretBoard);
        }
    }

    public void setIsSuggestedBoard(boolean flag)
    {
        _isSuggestedBoard = flag;
    }

    public void setShouldNavigateToBoardOnCreate(boolean flag)
    {
        _shouldNavigateToBoardOnCreate = flag;
    }


    private class _cls2
        implements android.widget.TextView.OnEditorActionListener
    {

        final CreateBoardDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                submitBoard();
                return true;
            } else
            {
                return false;
            }
        }

        _cls2()
        {
            this$0 = CreateBoardDialog.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final CreateBoardDialog this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (i == 6)
            {
                submitBoard();
            } else
            if (i == 5)
            {
                if (_boardDescriptionEt != null)
                {
                    _boardDescriptionEt.requestFocus();
                    return true;
                }
            } else
            {
                return false;
            }
            return true;
        }

        _cls1()
        {
            this$0 = CreateBoardDialog.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.activity.create.helper.CreateBoardHelper.BoardResponseHandler
    {

        final CreateBoardDialog this$0;
        final Activity val$activity;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            throwable = CreateBoardDialog.newInstance(null);
            throwable.setShouldNavigateToBoardOnCreate(_shouldNavigateToBoardOnCreate);
            Events.post(new DialogEvent(throwable));
            if (apiresponse != null && ModelHelper.isValid(apiresponse.getMessageDetailIfExist()))
            {
                Application.showToast(apiresponse.getMessageDetailIfExist());
                return;
            } else
            {
                Application.showToast(0x7f0701a0);
                return;
            }
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = MyUser.get();
            if (apiresponse != null)
            {
                apiresponse.setBoardCount(Integer.valueOf(apiresponse.getBoardCountDisplay() + 1));
                Events.post(new com.pinterest.api.model.User.UpdateEvent(apiresponse));
            }
            if ((activity instanceof PinEditActivity) || (activity instanceof PinItActivity))
            {
                activity.onBackPressed();
            }
        }

        _cls3(Activity activity1)
        {
            this$0 = CreateBoardDialog.this;
            activity = activity1;
            super(final_boolean1);
        }
    }

}
