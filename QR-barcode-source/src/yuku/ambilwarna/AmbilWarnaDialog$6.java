// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package yuku.ambilwarna;

import android.content.DialogInterface;

// Referenced classes of package yuku.ambilwarna:
//            AmbilWarnaDialog

class this._cls0
    implements android.content.ancelListener
{

    final AmbilWarnaDialog this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        if (listener != null)
        {
            listener.onCancel(AmbilWarnaDialog.this);
        }
    }

    AmbilWarnaListener()
    {
        this$0 = AmbilWarnaDialog.this;
        super();
    }
}
