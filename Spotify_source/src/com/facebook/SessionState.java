// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


public final class SessionState extends Enum
{

    public static final SessionState a;
    public static final SessionState b;
    public static final SessionState c;
    public static final SessionState d;
    public static final SessionState e;
    public static final SessionState f;
    public static final SessionState g;
    private static final SessionState h[];
    private final Category category;

    private SessionState(String s, int i, Category category1)
    {
        super(s, i);
        category = category1;
    }

    public static SessionState valueOf(String s)
    {
        return (SessionState)Enum.valueOf(com/facebook/SessionState, s);
    }

    public static SessionState[] values()
    {
        return (SessionState[])h.clone();
    }

    public final boolean a()
    {
        return category == Category.b;
    }

    public final boolean b()
    {
        return category == Category.c;
    }

    static 
    {
        a = new SessionState("CREATED", 0, Category.a);
        b = new SessionState("CREATED_TOKEN_LOADED", 1, Category.a);
        c = new SessionState("OPENING", 2, Category.a);
        d = new SessionState("OPENED", 3, Category.b);
        e = new SessionState("OPENED_TOKEN_UPDATED", 4, Category.b);
        f = new SessionState("CLOSED_LOGIN_FAILED", 5, Category.c);
        g = new SessionState("CLOSED", 6, Category.c);
        h = (new SessionState[] {
            a, b, c, d, e, f, g
        });
    }

    private class Category extends Enum
    {

        public static final Category a;
        public static final Category b;
        public static final Category c;
        private static final Category d[];

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/facebook/SessionState$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])d.clone();
        }

        static 
        {
            a = new Category("CREATED_CATEGORY", 0);
            b = new Category("OPENED_CATEGORY", 1);
            c = new Category("CLOSED_CATEGORY", 2);
            d = (new Category[] {
                a, b, c
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }

}
