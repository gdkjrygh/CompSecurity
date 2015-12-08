// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;


// Referenced classes of package org.chromium.ui.picker:
//            MultiFieldTimePickerDialog

private static class mFormat
    implements android.widget.rmatter
{

    private final String mFormat;

    public String format(int i)
    {
        return String.format(mFormat, new Object[] {
            Integer.valueOf(i)
        });
    }

    (String s)
    {
        mFormat = s;
    }
}
