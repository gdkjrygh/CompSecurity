// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.os.Bundle;
import com.facebook.AccessTokenSource;
import com.facebook.TokenCachingStrategy;

// Referenced classes of package com.facebook.android:
//            Facebook

private class <init> extends TokenCachingStrategy
{

    final Facebook this$0;

    public void clear()
    {
        Facebook.access$6(Facebook.this, null);
    }

    public Bundle load()
    {
        Bundle bundle = new Bundle();
        if (Facebook.access$0(Facebook.this) != null)
        {
            TokenCachingStrategy.putToken(bundle, Facebook.access$0(Facebook.this));
            TokenCachingStrategy.putExpirationMilliseconds(bundle, Facebook.access$2(Facebook.this));
            TokenCachingStrategy.putPermissions(bundle, Facebook.access$4(Facebook.access$3(Facebook.this)));
            TokenCachingStrategy.putSource(bundle, AccessTokenSource.WEB_VIEW);
            TokenCachingStrategy.putLastRefreshMilliseconds(bundle, Facebook.access$5(Facebook.this));
        }
        return bundle;
    }

    public void save(Bundle bundle)
    {
        Facebook.access$6(Facebook.this, TokenCachingStrategy.getToken(bundle));
        Facebook.access$7(Facebook.this, TokenCachingStrategy.getExpirationMilliseconds(bundle));
        Facebook.access$9(Facebook.this, Facebook.access$8(TokenCachingStrategy.getPermissions(bundle)));
        Facebook.access$10(Facebook.this, TokenCachingStrategy.getLastRefreshMilliseconds(bundle));
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
