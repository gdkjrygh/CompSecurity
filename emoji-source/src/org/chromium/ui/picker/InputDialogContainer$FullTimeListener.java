// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;


// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer

private class mDialogType
    implements dTimeSetListener
{

    private final int mDialogType;
    final InputDialogContainer this$0;

    public void onTimeSet(int i, int j, int k, int l)
    {
        setFieldDateTimeValue(mDialogType, 0, 0, 0, i, j, k, l, 0);
    }

    dTimeSetListener(int i)
    {
        this$0 = InputDialogContainer.this;
        super();
        mDialogType = i;
    }
}
