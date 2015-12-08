// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.app.Dialog;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag, RemotePlayer

class this._cls0
    implements com.netflix.mediaclient.ui.common.guageSelectorCallback
{

    final MdxMiniPlayerFrag this$0;

    public void languageChanged(Language language, boolean flag)
    {
        Log.v("MdxMiniPlayerFrag", (new StringBuilder()).append("Language changed via dialog: ").append(language).toString());
        if (MdxMiniPlayerFrag.access$1200(MdxMiniPlayerFrag.this) != null)
        {
            MdxMiniPlayerFrag.access$1200(MdxMiniPlayerFrag.this).changeLanguage(language);
            MdxMiniPlayerFrag.access$1200(MdxMiniPlayerFrag.this).requestAudioAndSubtitleData();
        }
        MdxMiniPlayerFrag.access$1300(MdxMiniPlayerFrag.this);
    }

    public void updateDialog(Dialog dialog)
    {
        MdxMiniPlayerFrag.access$400(MdxMiniPlayerFrag.this, "Updating dialog");
        MdxMiniPlayerFrag.access$200(MdxMiniPlayerFrag.this).updateVisibleDialog(dialog);
    }

    public void userCanceled()
    {
        MdxMiniPlayerFrag.access$400(MdxMiniPlayerFrag.this, "User canceled selection");
    }

    public boolean wasPlaying()
    {
        return false;
    }

    ivity()
    {
        this$0 = MdxMiniPlayerFrag.this;
        super();
    }
}
