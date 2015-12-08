// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.eyesfree.braille.selfbraille;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public class WriteData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public WriteData createFromParcel(Parcel parcel)
        {
            return new WriteData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public WriteData[] newArray(int i)
        {
            return new WriteData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String PROP_SELECTION_END = "selectionEnd";
    private static final String PROP_SELECTION_START = "selectionStart";
    private AccessibilityNodeInfo mAccessibilityNodeInfo;
    private Bundle mProperties;
    private CharSequence mText;

    private WriteData()
    {
        mProperties = Bundle.EMPTY;
    }

    private WriteData(Parcel parcel)
    {
        mProperties = Bundle.EMPTY;
        mAccessibilityNodeInfo = (AccessibilityNodeInfo)AccessibilityNodeInfo.CREATOR.createFromParcel(parcel);
        mText = parcel.readString();
        mProperties = parcel.readBundle();
    }


    public static WriteData forView(View view)
    {
        view = AccessibilityNodeInfo.obtain(view);
        WriteData writedata = new WriteData();
        writedata.mAccessibilityNodeInfo = view;
        return writedata;
    }

    private Bundle writableProperties()
    {
        if (mProperties == Bundle.EMPTY)
        {
            mProperties = new Bundle();
        }
        return mProperties;
    }

    public int describeContents()
    {
        return 0;
    }

    public AccessibilityNodeInfo getAccessibilityNodeInfo()
    {
        return mAccessibilityNodeInfo;
    }

    public int getSelectionEnd()
    {
        return mProperties.getInt("selectionEnd", -1);
    }

    public int getSelectionStart()
    {
        return mProperties.getInt("selectionStart", -1);
    }

    public CharSequence getText()
    {
        return mText;
    }

    public WriteData setSelectionEnd(int i)
    {
        writableProperties().putInt("selectionEnd", i);
        return this;
    }

    public WriteData setSelectionStart(int i)
    {
        writableProperties().putInt("selectionStart", i);
        return this;
    }

    public WriteData setText(CharSequence charsequence)
    {
        mText = charsequence;
        return this;
    }

    public void validate()
        throws IllegalStateException
    {
        if (mAccessibilityNodeInfo == null)
        {
            throw new IllegalStateException("Accessibility node info can't be null");
        }
        int i = getSelectionStart();
        int j = getSelectionEnd();
        if (mText == null)
        {
            if (i > 0 || j > 0)
            {
                throw new IllegalStateException("Selection can't be set without text");
            }
        } else
        {
            if (i < 0 && j >= 0)
            {
                throw new IllegalStateException("Selection end without start");
            }
            int k = mText.length();
            if (i > k || j > k)
            {
                throw new IllegalStateException("Selection out of bounds");
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mAccessibilityNodeInfo.writeToParcel(parcel, i);
        mAccessibilityNodeInfo = null;
        parcel.writeString(mText.toString());
        parcel.writeBundle(mProperties);
    }

}
