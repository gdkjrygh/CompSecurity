// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller;

import android.content.ContentValues;
import com.soundcloud.propeller.schema.Table;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller:
//            PropellerDatabase

class ansaction extends ansaction
{

    final PropellerDatabase this$0;
    final int val$conflictStrategy;
    final List val$contentValuesList;
    final Table val$table;

    public void steps(PropellerDatabase propellerdatabase)
    {
        propellerdatabase = val$contentValuesList.iterator();
        do
        {
            if (!propellerdatabase.hasNext())
            {
                break;
            }
            ContentValues contentvalues = (ContentValues)propellerdatabase.next();
            step(insert(val$table, contentvalues, val$conflictStrategy));
        } while (success());
    }

    ansaction()
    {
        this$0 = final_propellerdatabase;
        val$contentValuesList = list;
        val$table = table1;
        val$conflictStrategy = I.this;
        super();
    }
}
