// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import com.skype.android.app.media.ImageTransformer;
import com.skype.android.app.transfer.PathRetriever;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.chat:
//            ChangeGroupPictureDialog

final class val.uri
    implements Callable
{

    final ChangeGroupPictureDialog this$0;
    final Uri val$uri;

    public final Bitmap call()
        throws Exception
    {
        return ChangeGroupPictureDialog.access$000(ChangeGroupPictureDialog.this).transform(PathRetriever.getPath(getActivity().getBaseContext(), val$uri, false));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_changegrouppicturedialog;
        val$uri = Uri.this;
        super();
    }
}
