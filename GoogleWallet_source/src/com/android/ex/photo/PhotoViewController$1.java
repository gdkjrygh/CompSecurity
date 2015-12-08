// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;


// Referenced classes of package com.android.ex.photo:
//            PhotoViewController

final class this._cls0
    implements android.view.ityChangeListener
{

    final PhotoViewController this$0;

    public final void onSystemUiVisibilityChange(int i)
    {
        if (android.os.troller >= 19 && i == 0 && PhotoViewController.access$000(PhotoViewController.this) == 3846)
        {
            setFullScreen(false, true);
        }
    }

    eListener()
    {
        this$0 = PhotoViewController.this;
        super();
    }
}
