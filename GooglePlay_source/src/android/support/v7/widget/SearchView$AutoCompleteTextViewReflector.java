// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.ResultReceiver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.widget:
//            SearchView

private static final class showSoftInputUnchecked
{

    Method doAfterTextChanged;
    Method doBeforeTextChanged;
    private Method ensureImeVisible;
    Method showSoftInputUnchecked;

    final void ensureImeVisible$3d4581ed(AutoCompleteTextView autocompletetextview)
    {
        if (ensureImeVisible == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ensureImeVisible.invoke(autocompletetextview, new Object[] {
            Boolean.valueOf(true)
        });
        return;
        autocompletetextview;
    }

    ()
    {
        try
        {
            doBeforeTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            doBeforeTextChanged.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception3) { }
        try
        {
            doAfterTextChanged = android/widget/AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            doAfterTextChanged.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception2) { }
        try
        {
            ensureImeVisible = android/widget/AutoCompleteTextView.getMethod("ensureImeVisible", new Class[] {
                Boolean.TYPE
            });
            ensureImeVisible.setAccessible(true);
        }
        catch (NoSuchMethodException nosuchmethodexception1) { }
        try
        {
            showSoftInputUnchecked = android/view/inputmethod/InputMethodManager.getMethod("showSoftInputUnchecked", new Class[] {
                Integer.TYPE, android/os/ResultReceiver
            });
            showSoftInputUnchecked.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return;
        }
    }
}
