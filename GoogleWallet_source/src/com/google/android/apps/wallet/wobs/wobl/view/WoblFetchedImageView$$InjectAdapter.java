// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.view;

import com.squareup.picasso.Picasso;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.view:
//            WoblFetchedImageView

public final class  extends Binding
    implements MembersInjector
{

    private Binding picasso;

    public final void attach(Linker linker)
    {
        picasso = linker.requestBinding("com.squareup.picasso.Picasso", com/google/android/apps/wallet/wobs/wobl/view/WoblFetchedImageView, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(picasso);
    }

    public final void injectMembers(WoblFetchedImageView woblfetchedimageview)
    {
        woblfetchedimageview.picasso = (Picasso)picasso.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WoblFetchedImageView)obj);
    }

    public ()
    {
        super(null, "members/com.google.android.apps.wallet.wobs.wobl.view.WoblFetchedImageView", false, com/google/android/apps/wallet/wobs/wobl/view/WoblFetchedImageView);
    }
}
