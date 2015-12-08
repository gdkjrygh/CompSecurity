// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.res.Resources;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

class this._cls0
    implements Action1
{

    final CapturedPersonalInsuranceView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        unit = new me.lyft.android.ui.ceView._cls7("unsaved_changes_dialog");
        unit._mth7(getResources().getString(0x7f0702a7)).getResources(getResources().getString(0x7f0702a6)).ientation(Integer.valueOf(1)).utton(getResources().getString(0x7f0703a3), 0x7f030058).utton(getResources().getString(0x7f07020f)).ntClass(me/lyft/android/ui/settings/CapturedPersonalInsuranceView$UnsavedChangesDialogResultEvent);
        dialogFlow.show(unit);
    }

    savedChangesDialogResultEvent()
    {
        this$0 = CapturedPersonalInsuranceView.this;
        super();
    }
}
