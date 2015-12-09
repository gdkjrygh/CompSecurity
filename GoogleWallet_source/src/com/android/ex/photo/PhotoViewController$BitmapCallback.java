// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.os.Bundle;
import android.support.v4.content.Loader;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewController, ActionBarInterface

final class <init>
    implements android.support.v4.app.nit>
{

    final PhotoViewController this$0;

    private void onLoadFinished(Loader loader, com.android.ex.photo.loaders.sult sult)
    {
        sult = sult.getDrawable(PhotoViewController.access$400(PhotoViewController.this).getResources());
        ActionBarInterface actionbarinterface = PhotoViewController.access$400(PhotoViewController.this).getActionBarInterface();
        switch (loader.getId())
        {
        default:
            return;

        case 2: // '\002'
            PhotoViewController.access$500(PhotoViewController.this, sult);
            return;

        case 1: // '\001'
            break;
        }
        if (sult == null)
        {
            actionbarinterface.setLogo(null);
            return;
        } else
        {
            actionbarinterface.setLogo(sult);
            return;
        }
    }

    public final Loader onCreateLoader(int i, Bundle bundle)
    {
        String s = bundle.getString("image_uri");
        switch (i)
        {
        default:
            return null;

        case 2: // '\002'
            return onCreateBitmapLoader(2, bundle, s);

        case 1: // '\001'
            return onCreateBitmapLoader(1, bundle, s);
        }
    }

    public final volatile void onLoadFinished(Loader loader, Object obj)
    {
        onLoadFinished(loader, (com.android.ex.photo.loaders.sult)obj);
    }

    public final void onLoaderReset(Loader loader)
    {
    }

    private BitmapResult()
    {
        this$0 = PhotoViewController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
