// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;

import com.soundcloud.propeller.schema.Column;
import java.util.List;

public interface Where
{

    public abstract String build();

    public abstract String[] getArguments();

    public abstract String getSelection();

    public transient abstract Where orWhere(String s, Object aobj[]);

    public abstract Where orWhereEq(Column column, Object obj);

    public abstract Where orWhereEq(String s, Object obj);

    public abstract Where orWhereGe(Column column, Object obj);

    public abstract Where orWhereGe(String s, Object obj);

    public abstract Where orWhereGt(Column column, Object obj);

    public abstract Where orWhereGt(String s, Object obj);

    public abstract Where orWhereIn(Column column, List list);

    public transient abstract Where orWhereIn(Column column, Object aobj[]);

    public abstract Where orWhereIn(String s, List list);

    public transient abstract Where orWhereIn(String s, Object aobj[]);

    public abstract Where orWhereLe(Column column, Object obj);

    public abstract Where orWhereLe(String s, Object obj);

    public abstract Where orWhereLt(Column column, Object obj);

    public abstract Where orWhereLt(String s, Object obj);

    public abstract Where orWhereNotEq(Column column, Object obj);

    public abstract Where orWhereNotEq(String s, Object obj);

    public abstract Where orWhereNotNull(Column column);

    public abstract Where orWhereNotNull(String s);

    public abstract Where orWhereNull(Column column);

    public abstract Where orWhereNull(String s);

    public transient abstract Where where(String s, Object aobj[]);

    public abstract Where whereEq(Column column, Object obj);

    public abstract Where whereEq(String s, Object obj);

    public abstract Where whereGe(Column column, Object obj);

    public abstract Where whereGe(String s, Object obj);

    public abstract Where whereGt(Column column, Object obj);

    public abstract Where whereGt(String s, Object obj);

    public abstract Where whereIn(Column column, List list);

    public transient abstract Where whereIn(Column column, Object aobj[]);

    public abstract Where whereIn(String s, List list);

    public transient abstract Where whereIn(String s, Object aobj[]);

    public abstract Where whereLe(Column column, Object obj);

    public abstract Where whereLe(String s, Object obj);

    public abstract Where whereLt(Column column, Object obj);

    public abstract Where whereLt(String s, Object obj);

    public abstract Where whereNotEq(Column column, Object obj);

    public abstract Where whereNotEq(String s, Object obj);

    public abstract Where whereNotNull(Column column);

    public abstract Where whereNotNull(String s);

    public abstract Where whereNull(Column column);

    public abstract Where whereNull(String s);
}
