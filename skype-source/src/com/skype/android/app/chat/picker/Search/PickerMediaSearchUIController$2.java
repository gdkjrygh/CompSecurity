// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import java.util.Set;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.chat.picker.Search:
//            PickerMediaSearchUIController, MediaPickerContentSearchModel

final class val.searchString
    implements Callable
{

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
        return PickerMediaSearchUIController.access$100(PickerMediaSearchUIController.this).searchForString(val$mediaSetToSearch, val$searchString);
    }

    ()
    {
        this$0 = final_pickermediasearchuicontroller;
        val$mediaSetToSearch = set;
        val$searchString = String.this;
        super();
    }
}
