// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.appcontent.AppContentSectionBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AppContentsImpl

private static abstract class <init> extends com.google.android.gms.games.pl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult() {

            final AppContentsImpl.LoadsImpl this$0;
            final Status val$status;

            public final AppContentSectionBuffer getSections()
            {
                boolean flag = true;
                ArrayList arraylist = new ArrayList();
                DataHolder dataholder = DataHolder.empty(14);
                arraylist.add(0, dataholder);
                arraylist.add(1, dataholder);
                arraylist.add(2, dataholder);
                arraylist.add(3, dataholder);
                arraylist.add(4, dataholder);
                if (arraylist.size() != 6)
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "The number of data holders here should match the number created by the app content agent");
                return new AppContentSectionBuffer(arraylist);
            }

            public final Status getStatus()
            {
                return status;
            }

            public final void release()
            {
            }

            
            {
                this$0 = AppContentsImpl.LoadsImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.val.status(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
