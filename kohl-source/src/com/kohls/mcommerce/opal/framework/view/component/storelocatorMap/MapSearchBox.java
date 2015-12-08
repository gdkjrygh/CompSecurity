// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.component.storelocatorMap;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.HandlerThread;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.listener.PopupSearchListener;
import com.kohls.mcommerce.opal.framework.listener.SuggestionItemListener;
import com.kohls.mcommerce.opal.helper.db.custom.DBSearchPlacesHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.component.storelocatorMap:
//            IMEAutoCompleteTextView

public class MapSearchBox extends RelativeLayout
{
    public static interface IGPSSearchListener
    {

        public abstract void onGPSDrawableClick();
    }


    private final String HANDLER_THREAD_NAME = "GEOCODE_TASK";
    private Activity act;
    private GeoCoderHandler geoCodeHandler;
    private HandlerThread geoCoderAsyncTask;
    private InputMethodManager imm;
    private boolean immHidden;
    private boolean isTextUpdatedOnSuggestClick;
    private TextView mCancelSuggestionBtn;
    protected String mClientID;
    private IGPSSearchListener mGPSClickListener;
    public String mHintMessage;
    private PopupSearchListener mKeyListener;
    private IMEAutoCompleteTextView mName;
    private ArrayList mSavedAddresses;
    private ImageView mSelfLocation;
    private TextWatcher mTextWatcher;
    private boolean onClickSearch;
    private Drawable spaceRight;
    private SuggestionItemListener suggestListener;

    public MapSearchBox(Activity activity, Integer integer, SuggestionItemListener suggestionitemlistener, IGPSSearchListener igpssearchlistener, PopupSearchListener popupsearchlistener)
    {
        super(activity);
        immHidden = true;
        mClientID = "gme-kohlsdepartmentstores";
        init(activity, suggestionitemlistener, igpssearchlistener, integer, popupsearchlistener);
    }

    private void cancelGeoCodetask()
    {
        if (geoCodeHandler == null);
    }

    private int getMaxLengthofEditText()
    {
        if (mName == null)
        {
            return 0;
        } else
        {
            return act.getResources().getInteger(0x7f0e000c);
        }
    }

    private void handleSearchBox()
    {
        mName = (IMEAutoCompleteTextView)findViewById(0x7f0d038a);
        mName.addTextChangedListener(mTextWatcher);
        mName.setListener(new _cls3());
        mSavedAddresses = (new DBSearchPlacesHelper()).getAll();
        mName.setOnEditorActionListener(new _cls4());
        _cls5 _lcls5 = new _cls5();
        mCancelSuggestionBtn = (TextView)findViewById(0x7f0d038c);
        mCancelSuggestionBtn.setOnClickListener(_lcls5);
        mSelfLocation = (ImageView)findViewById(0x7f0d0388);
        mSelfLocation.setOnClickListener(new _cls6());
        mName.setOnTouchListener(new _cls7());
    }

    private void init(Activity activity, SuggestionItemListener suggestionitemlistener, IGPSSearchListener igpssearchlistener, Integer integer, PopupSearchListener popupsearchlistener)
    {
        act = activity;
        suggestListener = suggestionitemlistener;
        mGPSClickListener = igpssearchlistener;
        mKeyListener = popupsearchlistener;
        mHintMessage = act.getResources().getString(0x7f080120);
    /* block-local class not found */
    class GeoCoderHandler {}

        if (integer != null)
        {
            activity.getLayoutInflater().inflate(integer.intValue(), this);
        } else
        {
            activity.getLayoutInflater().inflate(0x7f030096, this);
        }
        geoCoderAsyncTask = new HandlerThread("GEOCODE_TASK");
        geoCoderAsyncTask.start();
        geoCodeHandler = new GeoCoderHandler(geoCoderAsyncTask.getLooper());
        mTextWatcher = new _cls1(suggestionitemlistener);
        imm = (InputMethodManager)activity.getSystemService("input_method");
        handleSearchBox();
        refreshButton();
    }

    private void refreshButton()
    {
        mName.setCompoundDrawablesWithIntrinsicBounds(null, null, spaceRight, null);
        String s = getKeyWord();
        if (s == null || s.length() == 0)
        {
            mName.setCompoundDrawablePadding(0);
            return;
        } else
        {
            mName.setCompoundDrawablePadding(55);
            return;
        }
    }

    private void setCancelSuggestionBtn(boolean flag)
    {
        TextView textview = mCancelSuggestionBtn;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    private void updateAdapter(boolean flag, List list)
    {
        act.runOnUiThread(new _cls2(list, flag));
    }

    protected boolean checkWhetherSearchShouldStart()
    {
        if (!isTextUpdatedOnSuggestClick && getKeyWord().length() != 0)
        {
            if (Pattern.matches("^\\d{5}(-\\d{4})?$", getKeyWord()))
            {
                return true;
            }
            if (!getKeyWord().matches(".*\\d.*"))
            {
                return true;
            }
        }
        return false;
    }

    public void clearText()
    {
        if (mName != null && !TextUtils.isEmpty(mName.getText()))
        {
            mName.setText("");
        }
    }

    public String getKeyWord()
    {
        return mName.getText().toString().trim();
    }

    public void hideSoftKeyboard()
    {
        if (imm == null)
        {
            return;
        } else
        {
            immHidden = imm.hideSoftInputFromWindow(mName.getWindowToken(), 2);
            return;
        }
    }

    public void performCancelClick()
    {
        cancelGeoCodetask();
        imm.showSoftInput(mName, 0);
        mName.setText("");
        isTextUpdatedOnSuggestClick = false;
        if (suggestListener != null)
        {
            suggestListener.hideSuggestionItems(false);
        }
        if (mKeyListener != null)
        {
            mKeyListener.hideSearchItems();
        }
    }

    protected void performSuggestSearch(CharSequence charsequence)
    {
        if (geoCodeHandler.hasMessages(1001))
        {
            geoCodeHandler.removeMessages(1001);
        }
        if (charsequence != null)
        {
            charsequence = charsequence.toString();
            Message.obtain(geoCodeHandler, 1001, charsequence).sendToTarget();
        }
    }

    public void updateKeyWord(CharSequence charsequence)
    {
        isTextUpdatedOnSuggestClick = true;
        mName.setText(UtilityMethods.truncateMaxLength(charsequence, mName.getPaint(), getMaxLengthofEditText()));
        mName.setSelection(mName.getText().length());
    }





/*
    static boolean access$1102(MapSearchBox mapsearchbox, boolean flag)
    {
        mapsearchbox.isTextUpdatedOnSuggestClick = flag;
        return flag;
    }

*/





/*
    static ArrayList access$202(MapSearchBox mapsearchbox, ArrayList arraylist)
    {
        mapsearchbox.mSavedAddresses = arraylist;
        return arraylist;
    }

*/




/*
    static boolean access$402(MapSearchBox mapsearchbox, boolean flag)
    {
        mapsearchbox.onClickSearch = flag;
        return flag;
    }

*/






/*
    static boolean access$802(MapSearchBox mapsearchbox, boolean flag)
    {
        mapsearchbox.immHidden = flag;
        return flag;
    }

*/


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
