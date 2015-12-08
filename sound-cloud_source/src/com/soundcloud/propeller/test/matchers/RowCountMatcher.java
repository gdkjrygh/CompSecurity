// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.test.matchers;

import android.database.Cursor;
import org.hamcrest.Description;

// Referenced classes of package com.soundcloud.propeller.test.matchers:
//            QueryMatcher

public class RowCountMatcher extends QueryMatcher
{

    private int actualCount;
    private final int expectedCount;

    public RowCountMatcher(int i)
    {
        expectedCount = i;
    }

    public void describeTo(Description description)
    {
        description.appendText("Expected row count to be ").appendValue(Integer.valueOf(expectedCount)).appendText(" but was ").appendValue(Integer.valueOf(actualCount));
        super.describeTo(description);
    }

    protected boolean matchCursor(Cursor cursor)
    {
        actualCount = cursor.getCount();
        return actualCount == expectedCount;
    }
}
