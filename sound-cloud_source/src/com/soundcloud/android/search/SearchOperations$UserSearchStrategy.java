// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.commands.StoreUsersCommand;
import com.soundcloud.java.reflect.TypeToken;
import rx.b;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations

private final class _cls1 extends _cls1
{

    final SearchOperations this$0;
    private final TypeToken typeToken = new _cls1();

    protected final b getSearchResultObservable(com.soundcloud.android.api.gy gy)
    {
        return SearchOperations.access$600(SearchOperations.this).mappedResponse(gy._mth0(), typeToken).subscribeOn(SearchOperations.access$500(SearchOperations.this)).doOnNext(SearchOperations.access$1000(SearchOperations.this).toAction()).map(SearchOperations.TO_SEARCH_RESULT).map(SearchOperations.access$900(SearchOperations.this));
    }

    protected _cls1.this._cls1()
    {
        this$0 = SearchOperations.this;
        super(SearchOperations.this, ApiEndpoints.SEARCH_USERS.path());
        class _cls1 extends TypeToken
        {

            final SearchOperations.UserSearchStrategy this$1;

            _cls1()
            {
                this$1 = SearchOperations.UserSearchStrategy.this;
                super();
            }
        }

    }
}
