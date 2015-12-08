// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;

import com.soundcloud.propeller.schema.Column;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller.query:
//            Where

public abstract class WhereDelegate
    implements Where
{

    protected final Where whereDelegate;

    protected WhereDelegate(Where where1)
    {
        whereDelegate = where1;
    }

    public String[] getArguments()
    {
        return whereDelegate.getArguments();
    }

    public String getSelection()
    {
        return whereDelegate.getSelection();
    }

    public volatile Where orWhere(String s, Object aobj[])
    {
        return orWhere(s, aobj);
    }

    public transient WhereDelegate orWhere(String s, Object aobj[])
    {
        whereDelegate.orWhere(s, aobj);
        return this;
    }

    public volatile Where orWhereEq(Column column, Object obj)
    {
        return orWhereEq(column, obj);
    }

    public volatile Where orWhereEq(String s, Object obj)
    {
        return orWhereEq(s, obj);
    }

    public WhereDelegate orWhereEq(Column column, Object obj)
    {
        whereDelegate.orWhereEq(column, obj);
        return this;
    }

    public WhereDelegate orWhereEq(String s, Object obj)
    {
        whereDelegate.orWhereEq(s, obj);
        return this;
    }

    public volatile Where orWhereGe(Column column, Object obj)
    {
        return orWhereGe(column, obj);
    }

    public volatile Where orWhereGe(String s, Object obj)
    {
        return orWhereGe(s, obj);
    }

    public WhereDelegate orWhereGe(Column column, Object obj)
    {
        whereDelegate.orWhereGe(column, obj);
        return this;
    }

    public WhereDelegate orWhereGe(String s, Object obj)
    {
        whereDelegate.orWhereGe(s, obj);
        return this;
    }

    public volatile Where orWhereGt(Column column, Object obj)
    {
        return orWhereGt(column, obj);
    }

    public volatile Where orWhereGt(String s, Object obj)
    {
        return orWhereGt(s, obj);
    }

    public WhereDelegate orWhereGt(Column column, Object obj)
    {
        whereDelegate.orWhereGt(column, obj);
        return this;
    }

    public WhereDelegate orWhereGt(String s, Object obj)
    {
        whereDelegate.orWhereGt(s, obj);
        return this;
    }

    public volatile Where orWhereIn(Column column, List list)
    {
        return orWhereIn(column, list);
    }

    public volatile Where orWhereIn(Column column, Object aobj[])
    {
        return orWhereIn(column, aobj);
    }

    public volatile Where orWhereIn(String s, List list)
    {
        return orWhereIn(s, list);
    }

    public volatile Where orWhereIn(String s, Object aobj[])
    {
        return orWhereIn(s, aobj);
    }

    public WhereDelegate orWhereIn(Column column, List list)
    {
        whereDelegate.orWhereIn(column, list);
        return this;
    }

    public transient WhereDelegate orWhereIn(Column column, Object aobj[])
    {
        whereDelegate.orWhereIn(column, aobj);
        return this;
    }

    public WhereDelegate orWhereIn(String s, List list)
    {
        whereDelegate.orWhereIn(s, list);
        return this;
    }

    public transient WhereDelegate orWhereIn(String s, Object aobj[])
    {
        whereDelegate.orWhereIn(s, aobj);
        return this;
    }

    public volatile Where orWhereLe(Column column, Object obj)
    {
        return orWhereLe(column, obj);
    }

    public volatile Where orWhereLe(String s, Object obj)
    {
        return orWhereLe(s, obj);
    }

    public WhereDelegate orWhereLe(Column column, Object obj)
    {
        whereDelegate.orWhereLe(column, obj);
        return this;
    }

    public WhereDelegate orWhereLe(String s, Object obj)
    {
        whereDelegate.orWhereLe(s, obj);
        return this;
    }

    public volatile Where orWhereLt(Column column, Object obj)
    {
        return orWhereLt(column, obj);
    }

    public volatile Where orWhereLt(String s, Object obj)
    {
        return orWhereLt(s, obj);
    }

    public WhereDelegate orWhereLt(Column column, Object obj)
    {
        whereDelegate.orWhereLt(column, obj);
        return this;
    }

    public WhereDelegate orWhereLt(String s, Object obj)
    {
        whereDelegate.orWhereLt(s, obj);
        return this;
    }

    public volatile Where orWhereNotEq(Column column, Object obj)
    {
        return orWhereNotEq(column, obj);
    }

    public volatile Where orWhereNotEq(String s, Object obj)
    {
        return orWhereNotEq(s, obj);
    }

    public WhereDelegate orWhereNotEq(Column column, Object obj)
    {
        whereDelegate.orWhereNotEq(column, obj);
        return this;
    }

    public WhereDelegate orWhereNotEq(String s, Object obj)
    {
        whereDelegate.orWhereNotEq(s, obj);
        return this;
    }

    public volatile Where orWhereNotNull(Column column)
    {
        return orWhereNotNull(column);
    }

    public volatile Where orWhereNotNull(String s)
    {
        return orWhereNotNull(s);
    }

    public WhereDelegate orWhereNotNull(Column column)
    {
        whereDelegate.orWhereNotNull(column);
        return this;
    }

    public WhereDelegate orWhereNotNull(String s)
    {
        whereDelegate.orWhereNotNull(s);
        return this;
    }

    public volatile Where orWhereNull(Column column)
    {
        return orWhereNull(column);
    }

    public volatile Where orWhereNull(String s)
    {
        return orWhereNull(s);
    }

    public WhereDelegate orWhereNull(Column column)
    {
        whereDelegate.orWhereNull(column);
        return this;
    }

    public WhereDelegate orWhereNull(String s)
    {
        whereDelegate.orWhereNull(s);
        return this;
    }

    public volatile Where where(String s, Object aobj[])
    {
        return where(s, aobj);
    }

    public transient WhereDelegate where(String s, Object aobj[])
    {
        whereDelegate.where(s, aobj);
        return this;
    }

    public volatile Where whereEq(Column column, Object obj)
    {
        return whereEq(column, obj);
    }

    public volatile Where whereEq(String s, Object obj)
    {
        return whereEq(s, obj);
    }

    public WhereDelegate whereEq(Column column, Object obj)
    {
        whereDelegate.whereEq(column, obj);
        return this;
    }

    public WhereDelegate whereEq(String s, Object obj)
    {
        whereDelegate.whereEq(s, obj);
        return this;
    }

    public volatile Where whereGe(Column column, Object obj)
    {
        return whereGe(column, obj);
    }

    public volatile Where whereGe(String s, Object obj)
    {
        return whereGe(s, obj);
    }

    public WhereDelegate whereGe(Column column, Object obj)
    {
        whereDelegate.whereGe(column, obj);
        return this;
    }

    public WhereDelegate whereGe(String s, Object obj)
    {
        whereDelegate.whereGe(s, obj);
        return this;
    }

    public volatile Where whereGt(Column column, Object obj)
    {
        return whereGt(column, obj);
    }

    public volatile Where whereGt(String s, Object obj)
    {
        return whereGt(s, obj);
    }

    public WhereDelegate whereGt(Column column, Object obj)
    {
        whereDelegate.whereGt(column, obj);
        return this;
    }

    public WhereDelegate whereGt(String s, Object obj)
    {
        whereDelegate.whereGt(s, obj);
        return this;
    }

    public volatile Where whereIn(Column column, List list)
    {
        return whereIn(column, list);
    }

    public volatile Where whereIn(Column column, Object aobj[])
    {
        return whereIn(column, aobj);
    }

    public volatile Where whereIn(String s, List list)
    {
        return whereIn(s, list);
    }

    public volatile Where whereIn(String s, Object aobj[])
    {
        return whereIn(s, aobj);
    }

    public WhereDelegate whereIn(Column column, List list)
    {
        whereDelegate.whereIn(column, list);
        return this;
    }

    public transient WhereDelegate whereIn(Column column, Object aobj[])
    {
        whereDelegate.whereIn(column, aobj);
        return this;
    }

    public WhereDelegate whereIn(String s, List list)
    {
        whereDelegate.whereIn(s, list);
        return this;
    }

    public transient WhereDelegate whereIn(String s, Object aobj[])
    {
        whereDelegate.whereIn(s, aobj);
        return this;
    }

    public volatile Where whereLe(Column column, Object obj)
    {
        return whereLe(column, obj);
    }

    public volatile Where whereLe(String s, Object obj)
    {
        return whereLe(s, obj);
    }

    public WhereDelegate whereLe(Column column, Object obj)
    {
        whereDelegate.whereLe(column, obj);
        return this;
    }

    public WhereDelegate whereLe(String s, Object obj)
    {
        whereDelegate.whereLe(s, obj);
        return this;
    }

    public volatile Where whereLt(Column column, Object obj)
    {
        return whereLt(column, obj);
    }

    public volatile Where whereLt(String s, Object obj)
    {
        return whereLt(s, obj);
    }

    public WhereDelegate whereLt(Column column, Object obj)
    {
        whereDelegate.whereLt(column, obj);
        return this;
    }

    public WhereDelegate whereLt(String s, Object obj)
    {
        whereDelegate.whereLt(s, obj);
        return this;
    }

    public volatile Where whereNotEq(Column column, Object obj)
    {
        return whereNotEq(column, obj);
    }

    public volatile Where whereNotEq(String s, Object obj)
    {
        return whereNotEq(s, obj);
    }

    public WhereDelegate whereNotEq(Column column, Object obj)
    {
        whereDelegate.whereNotEq(column, obj);
        return this;
    }

    public WhereDelegate whereNotEq(String s, Object obj)
    {
        whereDelegate.whereNotEq(s, obj);
        return this;
    }

    public volatile Where whereNotNull(Column column)
    {
        return whereNotNull(column);
    }

    public volatile Where whereNotNull(String s)
    {
        return whereNotNull(s);
    }

    public WhereDelegate whereNotNull(Column column)
    {
        whereDelegate.whereNotNull(column);
        return this;
    }

    public WhereDelegate whereNotNull(String s)
    {
        whereDelegate.whereNotNull(s);
        return this;
    }

    public volatile Where whereNull(Column column)
    {
        return whereNull(column);
    }

    public volatile Where whereNull(String s)
    {
        return whereNull(s);
    }

    public WhereDelegate whereNull(Column column)
    {
        whereDelegate.whereNull(column);
        return this;
    }

    public WhereDelegate whereNull(String s)
    {
        whereDelegate.whereNull(s);
        return this;
    }
}
