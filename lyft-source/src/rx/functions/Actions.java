// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Action0, Func0, Action1, Func1, 
//            Action2, Func2, Action3, Func3, 
//            Action4, Func4, Action5, Func5, 
//            Action6, Func6, Action7, Func7, 
//            Action8, Func8, Action9, Func9, 
//            ActionN, FuncN

public final class Actions
{

    private static final EmptyAction EMPTY_ACTION = new EmptyAction();

    private Actions()
    {
        throw new IllegalStateException("No instances!");
    }

    public static EmptyAction empty()
    {
        return EMPTY_ACTION;
    }

    public static Func0 toFunc(Action0 action0)
    {
        return toFunc(action0, (Void)null);
    }

    public static Func0 toFunc(final Action0 action, final Object result)
    {
        return new Func0() {

            final Action0 val$action;
            final Object val$result;

            public Object call()
            {
                action.call();
                return result;
            }

            
            {
                action = action0;
                result = obj;
                super();
            }
        };
    }

    public static Func1 toFunc(Action1 action1)
    {
        return toFunc(action1, (Void)null);
    }

    public static Func1 toFunc(final Action1 action, final Object result)
    {
        return new Func1() {

            final Action1 val$action;
            final Object val$result;

            public Object call(Object obj)
            {
                action.call(obj);
                return result;
            }

            
            {
                action = action1;
                result = obj;
                super();
            }
        };
    }

    public static Func2 toFunc(Action2 action2)
    {
        return toFunc(action2, (Void)null);
    }

    public static Func2 toFunc(final Action2 action, final Object result)
    {
        return new Func2() {

            final Action2 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1)
            {
                action.call(obj, obj1);
                return result;
            }

            
            {
                action = action2;
                result = obj;
                super();
            }
        };
    }

    public static Func3 toFunc(Action3 action3)
    {
        return toFunc(action3, (Void)null);
    }

    public static Func3 toFunc(final Action3 action, final Object result)
    {
        return new Func3() {

            final Action3 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2)
            {
                action.call(obj, obj1, obj2);
                return result;
            }

            
            {
                action = action3;
                result = obj;
                super();
            }
        };
    }

    public static Func4 toFunc(Action4 action4)
    {
        return toFunc(action4, (Void)null);
    }

    public static Func4 toFunc(final Action4 action, final Object result)
    {
        return new Func4() {

            final Action4 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3)
            {
                action.call(obj, obj1, obj2, obj3);
                return result;
            }

            
            {
                action = action4;
                result = obj;
                super();
            }
        };
    }

    public static Func5 toFunc(Action5 action5)
    {
        return toFunc(action5, (Void)null);
    }

    public static Func5 toFunc(final Action5 action, final Object result)
    {
        return new Func5() {

            final Action5 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
            {
                action.call(obj, obj1, obj2, obj3, obj4);
                return result;
            }

            
            {
                action = action5;
                result = obj;
                super();
            }
        };
    }

    public static Func6 toFunc(Action6 action6)
    {
        return toFunc(action6, (Void)null);
    }

    public static Func6 toFunc(final Action6 action, final Object result)
    {
        return new Func6() {

            final Action6 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
            {
                action.call(obj, obj1, obj2, obj3, obj4, obj5);
                return result;
            }

            
            {
                action = action6;
                result = obj;
                super();
            }
        };
    }

    public static Func7 toFunc(Action7 action7)
    {
        return toFunc(action7, (Void)null);
    }

    public static Func7 toFunc(final Action7 action, final Object result)
    {
        return new Func7() {

            final Action7 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
            {
                action.call(obj, obj1, obj2, obj3, obj4, obj5, obj6);
                return result;
            }

            
            {
                action = action7;
                result = obj;
                super();
            }
        };
    }

    public static Func8 toFunc(Action8 action8)
    {
        return toFunc(action8, (Void)null);
    }

    public static Func8 toFunc(final Action8 action, final Object result)
    {
        return new Func8() {

            final Action8 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                    Object obj7)
            {
                action.call(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7);
                return result;
            }

            
            {
                action = action8;
                result = obj;
                super();
            }
        };
    }

    public static Func9 toFunc(Action9 action9)
    {
        return toFunc(action9, (Void)null);
    }

    public static Func9 toFunc(final Action9 action, final Object result)
    {
        return new Func9() {

            final Action9 val$action;
            final Object val$result;

            public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                    Object obj7, Object obj8)
            {
                action.call(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
                return result;
            }

            
            {
                action = action9;
                result = obj;
                super();
            }
        };
    }

    public static FuncN toFunc(ActionN actionn)
    {
        return toFunc(actionn, (Void)null);
    }

    public static FuncN toFunc(final ActionN action, final Object result)
    {
        return new FuncN() {

            final ActionN val$action;
            final Object val$result;

            public transient Object call(Object aobj[])
            {
                action.call(aobj);
                return result;
            }

            
            {
                action = actionn;
                result = obj;
                super();
            }
        };
    }


    private class EmptyAction
        implements Action0, Action1, Action2, Action3, Action4, Action5, Action6, Action7, Action8, Action9, ActionN
    {

        public void call()
        {
        }

        public void call(Object obj)
        {
        }

        public void call(Object obj, Object obj1)
        {
        }

        public void call(Object obj, Object obj1, Object obj2)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                Object obj7)
        {
        }

        public void call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
                Object obj7, Object obj8)
        {
        }

        public transient void call(Object aobj[])
        {
        }

        private EmptyAction()
        {
        }

    }

}
