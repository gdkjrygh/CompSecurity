// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import android.content.Context;
import android.os.Parcelable;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.api.model.Feed;
import com.pinterest.kit.utils.PStringUtils;
import org.apache.commons.lang3.StringUtils;

public class SearchNagView extends LinearLayout
{

    private String _nagText;
    private TextView _titleTv;

    public SearchNagView(Context context)
    {
        this(context, null);
    }

    public SearchNagView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _nagText = "";
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f0301ea, this, true);
        _titleTv = (TextView)findViewById(0x7f0f0077);
        _titleTv.setMovementMethod(LinkMovementMethod.getInstance());
        setVisibility(8);
    }

    public static void showSearchNag(SearchNagView searchnagview, Feed feed)
    {
        if (searchnagview == null || feed == null)
        {
            return;
        } else
        {
            showSearchNag(searchnagview, feed.getNagMessage());
            return;
        }
    }

    public static void showSearchNag(SearchNagView searchnagview, String s)
    {
        if (searchnagview == null || s == null)
        {
            return;
        }
        searchnagview.setText(s);
        byte byte0;
        if (StringUtils.isBlank(s))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        searchnagview.setVisibility(byte0);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            setText(((SavedState) (parcelable)).text);
            super.onRestoreInstanceState(parcelable.getSuperState());
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.text = _nagText;
        return savedstate;
    }

    public void setText(String s)
    {
        _nagText = PStringUtils.getAbsoluteHtmlString(s);
        _titleTv.setText(Html.fromHtml(_nagText));
        setVisibility(0);
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public String text;

        public String toString()
        {
            return (new StringBuilder("SearchNagView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" text=").append(text).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(text);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            text = "";
            text = parcel.readString();
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
            text = "";
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

}
