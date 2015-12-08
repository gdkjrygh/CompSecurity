// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import java.util.List;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class val.query
    implements Func1
{

    final ContactsSearchDialogView this$0;
    final String val$query;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public archResult call(List list)
    {
        return new archResult(list, val$query, null);
    }

    archResult()
    {
        this$0 = final_contactssearchdialogview;
        val$query = String.this;
        super();
    }
}
