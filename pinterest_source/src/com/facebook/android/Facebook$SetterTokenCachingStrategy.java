// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.TokenCachingStrategy;

// Referenced classes of package com.facebook.android:
//            Facebook

class <init> extends TokenCachingStrategy
{

    final Facebook this$0;

    public void clear()
    {
        Facebook.access$102(Facebook.this, null);
    }

    public Bundle load()
    {
        Bundle bundle = new Bundle();
        if (Facebook.access$100(Facebook.this) != null)
        {
            TokenCachingStrategy.putToken(bundle, Facebook.access$100(Facebook.this));
            TokenCachingStrategy.putExpirationMilliseconds(bundle, Facebook.access$400(Facebook.this));
            TokenCachingStrategy.putPermissions(bundle, Facebook.access$600(Facebook.access$500(Facebook.this)));
            TokenCachingStrategy.putSource(bundle, AccessTokenSource.WEB_VIEW);
            TokenCachingStrategy.putLastRefreshMilliseconds(bundle, Facebook.access$700(Facebook.this));
        }
        return bundle;
    }

    public void save(Bundle bundle)
    {
        Facebook.access$102(Facebook.this, TokenCachingStrategy.getToken(bundle));
        Facebook.access$402(Facebook.this, TokenCachingStrategy.getExpirationMilliseconds(bundle));
        Facebook.access$502(Facebook.this, Facebook.access$800(TokenCachingStrategy.getPermissions(bundle)));
        Facebook.access$702(Facebook.this, TokenCachingStrategy.getLastRefreshMilliseconds(bundle));
    }

    private ()
    {
        this$0 = Facebook.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
