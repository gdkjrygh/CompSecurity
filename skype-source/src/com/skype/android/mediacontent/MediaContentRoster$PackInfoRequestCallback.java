// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;


// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster, PackInfo, MediaContent

public static interface _cls1
{

    public static final _cls1 a = new MediaContentRoster.PackInfoRequestCallback() {

        public final void onAllPacksReady()
        {
        }

        public final void onContent(PackInfo packinfo, MediaContent mediacontent)
        {
        }

        public final void onPackReady(PackInfo packinfo)
        {
        }

        public final void onPackStart(PackInfo packinfo)
        {
        }

    };

    public abstract void onAllPacksReady();

    public abstract void onContent(PackInfo packinfo, MediaContent mediacontent);

    public abstract void onPackReady(PackInfo packinfo);

    public abstract void onPackStart(PackInfo packinfo);

}
