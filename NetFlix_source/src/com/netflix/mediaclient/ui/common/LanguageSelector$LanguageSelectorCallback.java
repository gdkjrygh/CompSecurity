// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.Dialog;
import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            LanguageSelector

public static interface Q
{

    public abstract void languageChanged(Language language, boolean flag);

    public abstract void updateDialog(Dialog dialog);

    public abstract void userCanceled();

    public abstract boolean wasPlaying();
}
