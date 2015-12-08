// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;


// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentSection

final class this._cls0
    implements Runnable
{

    final ExtendedAppContentSection this$0;

    public final void run()
    {
        if (ExtendedAppContentSection.access$000(ExtendedAppContentSection.this) != null)
        {
            com.google.android.gms.games.appcontent.AppContentSection appcontentsection = ExtendedAppContentSection.access$000(ExtendedAppContentSection.this);
            com.google.android.gms.games.appcontent.AppContentSection _tmp = ExtendedAppContentSection.access$002$50a1bd92(ExtendedAppContentSection.this);
            setSectionData(appcontentsection);
        }
    }

    ()
    {
        this$0 = ExtendedAppContentSection.this;
        super();
    }
}
