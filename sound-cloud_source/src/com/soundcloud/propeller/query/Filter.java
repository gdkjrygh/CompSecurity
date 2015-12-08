// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.propeller.query;

import android.text.TextUtils;
import com.soundcloud.propeller.schema.Column;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.soundcloud.propeller.query:
//            Where, QueryHelper

public final class Filter
    implements Where
{

    private static final String AND = "AND";
    private static final String EXPR_EQ = " = ?";
    private static final String EXPR_GE = " >= ?";
    private static final String EXPR_GT = " > ?";
    private static final String EXPR_IS_NULL = " IS NULL";
    private static final String EXPR_LE = " <= ?";
    private static final String EXPR_LT = " < ?";
    private static final String EXPR_NE = " != ?";
    private static final String EXPR_NOT_NULL = " IS NOT NULL";
    private static final String OR = "OR";
    private Object selectionArgs[];
    private final StringBuilder selectionBuilder = new StringBuilder(64);

    private Filter()
    {
    }

    private transient Where buildWhere(String s, String s1, Object aobj[])
    {
        concatenateWhere(s1, s);
        appendArguments(aobj);
        return this;
    }

    private String buildWhereInClause(String s, Object aobj[])
    {
        StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 2 + 5);
        stringbuilder.append(s).append(" IN (");
        stringbuilder.append(TextUtils.join(",", Collections.nCopies(aobj.length, "?")));
        stringbuilder.append(')');
        return stringbuilder.toString();
    }

    private void concatenateWhere(String s, String s1)
    {
        if (selectionBuilder.length() == 0)
        {
            selectionBuilder.append(s);
            return;
        } else
        {
            selectionBuilder.insert(0, '(').append(')').append(' ').append(s1).append(' ').append('(').append(s).append(')');
            return;
        }
    }

    public static Filter filter()
    {
        return new Filter();
    }

    private Object[] normalizeValues(Object aobj[])
    {
        int i = 0;
        while (i < aobj.length) 
        {
            if (aobj[i] instanceof Boolean)
            {
                int j;
                if (Boolean.TRUE.equals(aobj[i]))
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                aobj[i] = Integer.valueOf(j);
            }
            i++;
        }
        return aobj;
    }

    final void appendArguments(Object aobj[])
    {
        aobj = normalizeValues(aobj);
        if (selectionArgs == null || selectionArgs.length == 0)
        {
            selectionArgs = aobj;
            return;
        } else
        {
            Object aobj1[] = new Object[selectionArgs.length + aobj.length];
            System.arraycopy(((Object) (selectionArgs)), 0, ((Object) (aobj1)), 0, selectionArgs.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), selectionArgs.length, aobj.length);
            selectionArgs = aobj1;
            return;
        }
    }

    public final String build()
    {
        return selectionBuilder.toString();
    }

    public final String[] getArguments()
    {
        if (selectionArgs == null)
        {
            return null;
        } else
        {
            return QueryHelper.toStringArgs(selectionArgs);
        }
    }

    public final String getSelection()
    {
        return selectionBuilder.toString();
    }

    public final transient Where orWhere(String s, Object aobj[])
    {
        return buildWhere("OR", s, aobj);
    }

    public final Where orWhereEq(Column column, Object obj)
    {
        return orWhereEq(column.qualifiedName(), obj);
    }

    public final Where orWhereEq(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" = ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereGe(Column column, Object obj)
    {
        return orWhereGe(column.qualifiedName(), obj);
    }

    public final Where orWhereGe(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" >= ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereGt(Column column, Object obj)
    {
        return orWhereGt(column.qualifiedName(), obj);
    }

    public final Where orWhereGt(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" > ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereIn(Column column, List list)
    {
        return orWhereIn(column, list.toArray());
    }

    public final transient Where orWhereIn(Column column, Object aobj[])
    {
        return orWhereIn(column.qualifiedName(), aobj);
    }

    public final Where orWhereIn(String s, List list)
    {
        return orWhereIn(s, list.toArray());
    }

    public final transient Where orWhereIn(String s, Object aobj[])
    {
        return orWhere(buildWhereInClause(s, aobj), aobj);
    }

    public final Where orWhereLe(Column column, Object obj)
    {
        return orWhereLe(column.qualifiedName(), obj);
    }

    public final Where orWhereLe(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" <= ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereLt(Column column, Object obj)
    {
        return orWhereLt(column.qualifiedName(), obj);
    }

    public final Where orWhereLt(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" < ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereNotEq(Column column, Object obj)
    {
        return orWhereNotEq(column.qualifiedName(), obj);
    }

    public final Where orWhereNotEq(String s, Object obj)
    {
        return orWhere((new StringBuilder()).append(s).append(" != ?").toString(), new Object[] {
            obj
        });
    }

    public final Where orWhereNotNull(Column column)
    {
        return orWhereNotNull(column.qualifiedName());
    }

    public final Where orWhereNotNull(String s)
    {
        return orWhere((new StringBuilder()).append(s).append(" IS NOT NULL").toString(), new Object[0]);
    }

    public final Where orWhereNull(Column column)
    {
        return orWhereNull(column.qualifiedName());
    }

    public final Where orWhereNull(String s)
    {
        return orWhere((new StringBuilder()).append(s).append(" IS NULL").toString(), new Object[0]);
    }

    public final transient Where where(String s, Object aobj[])
    {
        return buildWhere("AND", s, aobj);
    }

    public final Where whereEq(Column column, Object obj)
    {
        return whereEq(column.qualifiedName(), obj);
    }

    public final Where whereEq(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" = ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereGe(Column column, Object obj)
    {
        return whereGe(column.qualifiedName(), obj);
    }

    public final Where whereGe(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" >= ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereGt(Column column, Object obj)
    {
        return whereGt(column.qualifiedName(), obj);
    }

    public final Where whereGt(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" > ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereIn(Column column, List list)
    {
        return whereIn(column, list.toArray());
    }

    public final transient Where whereIn(Column column, Object aobj[])
    {
        return whereIn(column.qualifiedName(), aobj);
    }

    public final Where whereIn(String s, List list)
    {
        return whereIn(s, list.toArray());
    }

    public final transient Where whereIn(String s, Object aobj[])
    {
        return where(buildWhereInClause(s, aobj), aobj);
    }

    public final Where whereLe(Column column, Object obj)
    {
        return whereLe(column.qualifiedName(), obj);
    }

    public final Where whereLe(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" <= ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereLt(Column column, Object obj)
    {
        return whereLt(column.qualifiedName(), obj);
    }

    public final Where whereLt(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" < ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereNotEq(Column column, Object obj)
    {
        return whereNotEq(column.qualifiedName(), obj);
    }

    public final Where whereNotEq(String s, Object obj)
    {
        return where((new StringBuilder()).append(s).append(" != ?").toString(), new Object[] {
            obj
        });
    }

    public final Where whereNotNull(Column column)
    {
        return where((new StringBuilder()).append(column).append(" IS NOT NULL").toString(), new Object[0]);
    }

    public final Where whereNotNull(String s)
    {
        return where((new StringBuilder()).append(s).append(" IS NOT NULL").toString(), new Object[0]);
    }

    public final Where whereNull(Column column)
    {
        return whereNull(column.qualifiedName());
    }

    public final Where whereNull(String s)
    {
        return where((new StringBuilder()).append(s).append(" IS NULL").toString(), new Object[0]);
    }
}
