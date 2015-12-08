// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna.widget;

import yuku.ambilwarna.AmbilWarnaDialog;

// Referenced classes of package yuku.ambilwarna.widget:
//            AmbilWarnaPreference

class this._cls0
    implements yuku.ambilwarna.lWarnaListener
{

    final AmbilWarnaPreference this$0;

    public void onCancel(AmbilWarnaDialog ambilwarnadialog)
    {
    }

    public void onOk(AmbilWarnaDialog ambilwarnadialog, int i)
    {
        if (!AmbilWarnaPreference.access$0(AmbilWarnaPreference.this, Integer.valueOf(i)))
        {
            return;
        } else
        {
            value = i;
            AmbilWarnaPreference.access$1(AmbilWarnaPreference.this, value);
            AmbilWarnaPreference.access$2(AmbilWarnaPreference.this);
            return;
        }
    }

    istener()
    {
        this$0 = AmbilWarnaPreference.this;
        super();
    }
}
