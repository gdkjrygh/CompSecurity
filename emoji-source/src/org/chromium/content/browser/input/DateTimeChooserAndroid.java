// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.content.Context;
import org.chromium.content.browser.ContentViewCore;
import org.chromium.ui.picker.DateTimeSuggestion;
import org.chromium.ui.picker.InputDialogContainer;

class DateTimeChooserAndroid
{

    private final InputDialogContainer mInputDialogContainer;
    private final long mNativeDateTimeChooserAndroid;

    private DateTimeChooserAndroid(Context context, long l)
    {
        mNativeDateTimeChooserAndroid = l;
        mInputDialogContainer = new InputDialogContainer(context, new org.chromium.ui.picker.InputDialogContainer.InputActionDelegate() {

            final DateTimeChooserAndroid this$0;

            public void cancelDateTimeDialog()
            {
                nativeCancelDialog(mNativeDateTimeChooserAndroid);
            }

            public void replaceDateTime(double d)
            {
                nativeReplaceDateTime(mNativeDateTimeChooserAndroid, d);
            }

            
            {
                this$0 = DateTimeChooserAndroid.this;
                super();
            }
        });
    }

    private static DateTimeChooserAndroid createDateTimeChooser(ContentViewCore contentviewcore, long l, int i, double d, double d1, 
            double d2, double d3, DateTimeSuggestion adatetimesuggestion[])
    {
        contentviewcore = new DateTimeChooserAndroid(contentviewcore.getContext(), l);
        contentviewcore.showDialog(i, d, d1, d2, d3, adatetimesuggestion);
        return contentviewcore;
    }

    private static DateTimeSuggestion[] createSuggestionsArray(int i)
    {
        return new DateTimeSuggestion[i];
    }

    private static void initializeDateInputTypes(int i, int j, int k, int l, int i1, int j1)
    {
        InputDialogContainer.initializeInputTypes(i, j, k, l, i1, j1);
    }

    private native void nativeCancelDialog(long l);

    private native void nativeReplaceDateTime(long l, double d);

    private static void setDateTimeSuggestionAt(DateTimeSuggestion adatetimesuggestion[], int i, double d, String s, String s1)
    {
        adatetimesuggestion[i] = new DateTimeSuggestion(d, s, s1);
    }

    private void showDialog(int i, double d, double d1, double d2, 
            double d3, DateTimeSuggestion adatetimesuggestion[])
    {
        mInputDialogContainer.showDialog(i, d, d1, d2, d3, adatetimesuggestion);
    }



}
