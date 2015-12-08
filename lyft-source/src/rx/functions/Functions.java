// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Action0, FuncN, Action1, Action2, 
//            Action3, Func0, Func1, Func2, 
//            Func3, Func4, Func5, Func6, 
//            Func7, Func8, Func9

public final class Functions
{

    private Functions()
    {
        throw new IllegalStateException("No instances!");
    }

    public static FuncN fromAction(final Action0 f)
    {
        return new FuncN() {

            final Action0 val$f;

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

            public transient Void call(Object aobj[])
            {
                if (aobj.length != 0)
                {
                    throw new RuntimeException("Action0 expecting 0 arguments.");
                } else
                {
                    f.call();
                    return null;
                }
            }

            
            {
                f = action0;
                super();
            }
        };
    }

    public static FuncN fromAction(final Action1 f)
    {
        return new FuncN() {

            final Action1 val$f;

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

            public transient Void call(Object aobj[])
            {
                if (aobj.length != 1)
                {
                    throw new RuntimeException("Action1 expecting 1 argument.");
                } else
                {
                    f.call(aobj[0]);
                    return null;
                }
            }

            
            {
                f = action1;
                super();
            }
        };
    }

    public static FuncN fromAction(final Action2 f)
    {
        return new FuncN() {

            final Action2 val$f;

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

            public transient Void call(Object aobj[])
            {
                if (aobj.length != 2)
                {
                    throw new RuntimeException("Action3 expecting 2 arguments.");
                } else
                {
                    f.call(aobj[0], aobj[1]);
                    return null;
                }
            }

            
            {
                f = action2;
                super();
            }
        };
    }

    public static FuncN fromAction(final Action3 f)
    {
        return new FuncN() {

            final Action3 val$f;

            public volatile Object call(Object aobj[])
            {
                return call(aobj);
            }

            public transient Void call(Object aobj[])
            {
                if (aobj.length != 3)
                {
                    throw new RuntimeException("Action3 expecting 3 arguments.");
                } else
                {
                    f.call(aobj[0], aobj[1], aobj[2]);
                    return null;
                }
            }

            
            {
                f = action3;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func0 f)
    {
        return new FuncN() {

            final Func0 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 0)
                {
                    throw new RuntimeException("Func0 expecting 0 arguments.");
                } else
                {
                    return f.call();
                }
            }

            
            {
                f = func0;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func1 f)
    {
        return new FuncN() {

            final Func1 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 1)
                {
                    throw new RuntimeException("Func1 expecting 1 argument.");
                } else
                {
                    return f.call(aobj[0]);
                }
            }

            
            {
                f = func1;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func2 f)
    {
        return new FuncN() {

            final Func2 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 2)
                {
                    throw new RuntimeException("Func2 expecting 2 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1]);
                }
            }

            
            {
                f = func2;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func3 f)
    {
        return new FuncN() {

            final Func3 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 3)
                {
                    throw new RuntimeException("Func3 expecting 3 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2]);
                }
            }

            
            {
                f = func3;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func4 f)
    {
        return new FuncN() {

            final Func4 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 4)
                {
                    throw new RuntimeException("Func4 expecting 4 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3]);
                }
            }

            
            {
                f = func4;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func5 f)
    {
        return new FuncN() {

            final Func5 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 5)
                {
                    throw new RuntimeException("Func5 expecting 5 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4]);
                }
            }

            
            {
                f = func5;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func6 f)
    {
        return new FuncN() {

            final Func6 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 6)
                {
                    throw new RuntimeException("Func6 expecting 6 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5]);
                }
            }

            
            {
                f = func6;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func7 f)
    {
        return new FuncN() {

            final Func7 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 7)
                {
                    throw new RuntimeException("Func7 expecting 7 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6]);
                }
            }

            
            {
                f = func7;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func8 f)
    {
        return new FuncN() {

            final Func8 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 8)
                {
                    throw new RuntimeException("Func8 expecting 8 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6], aobj[7]);
                }
            }

            
            {
                f = func8;
                super();
            }
        };
    }

    public static FuncN fromFunc(final Func9 f)
    {
        return new FuncN() {

            final Func9 val$f;

            public transient Object call(Object aobj[])
            {
                if (aobj.length != 9)
                {
                    throw new RuntimeException("Func9 expecting 9 arguments.");
                } else
                {
                    return f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6], aobj[7], aobj[8]);
                }
            }

            
            {
                f = func9;
                super();
            }
        };
    }
}
