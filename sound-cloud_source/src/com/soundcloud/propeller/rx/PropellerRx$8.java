// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.rx;

import android.content.ContentValues;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.schema.Table;
import rx.b;
import rx.b.e;

// Referenced classes of package com.soundcloud.propeller.rx:
//            PropellerRx

class val.contentValues
    implements e
{

    final PropellerRx this$0;
    final ContentValues val$contentValues;
    final Table val$table;

    public volatile Object call()
    {
        return call();
    }

    public b call()
    {
        return PropellerRx.access$200(PropellerRx.access$000(PropellerRx.this).upsert(val$table, val$contentValues));
    }

    ()
    {
        this$0 = final_propellerrx;
        val$table = table1;
        val$contentValues = ContentValues.this;
        super();
    }
}
