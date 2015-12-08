// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;


// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer

private class mDialogType
    implements er
{

    private final int mDialogType;
    final InputDialogContainer this$0;

    public void onValueSet(int i, int j)
    {
        if (mDialogType == InputDialogContainer.access$400())
        {
            setFieldDateTimeValue(mDialogType, i, j, 0, 0, 0, 0, 0, 0);
            return;
        } else
        {
            setFieldDateTimeValue(mDialogType, i, 0, 0, 0, 0, 0, 0, j);
            return;
        }
    }

    er(int i)
    {
        this$0 = InputDialogContainer.this;
        super();
        mDialogType = i;
    }
}
