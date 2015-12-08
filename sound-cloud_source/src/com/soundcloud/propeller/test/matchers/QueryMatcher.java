// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test.matchers;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.soundcloud.propeller.query.Query;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

// Referenced classes of package com.soundcloud.propeller.test.matchers:
//            QueryBinding

public abstract class QueryMatcher extends BaseMatcher
{

    private QueryBinding queryBinding;

    public QueryMatcher()
    {
    }

    public void describeTo(Description description)
    {
        description.appendText("\n\nQuery was: ").appendValue(queryBinding.query);
        description.appendText("\n\n");
    }

    protected abstract boolean matchCursor(Cursor cursor);

    public boolean matches(Object obj)
    {
        queryBinding = (QueryBinding)obj;
        return matchCursor(queryBinding.database.rawQuery(queryBinding.query.build(), queryBinding.query.getArguments()));
    }
}
