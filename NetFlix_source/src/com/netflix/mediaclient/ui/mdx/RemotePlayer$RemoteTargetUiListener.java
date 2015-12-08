// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.media.Language;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            RemotePlayer, RemoteDialog, MdxTargetCapabilities

public static interface 
{

    public abstract void cancelDialog();

    public abstract void endOfPlayback();

    public abstract void error(int i, String s);

    public abstract void mdxStateChanged(boolean flag);

    public abstract void showDialog(RemoteDialog remotedialog);

    public abstract void targetListChanged();

    public abstract void updateDuration(int i);

    public abstract void updateLanguage(Language language);

    public abstract void updateTargetCapabilities(MdxTargetCapabilities mdxtargetcapabilities);

    public abstract void updateUi( );

    public abstract void updateVideoMetadata();
}
