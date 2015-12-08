// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            Scanner, Function, Context

class Caller
{

    private final Function commit;
    private final Function complete;
    private final Context context;
    private final Function persist;
    private final Function replace;
    private final Function resolve;
    private final Function validate;

    public Caller(Scanner scanner, Context context1)
    {
        validate = scanner.getValidate();
        complete = scanner.getComplete();
        replace = scanner.getReplace();
        resolve = scanner.getResolve();
        persist = scanner.getPersist();
        commit = scanner.getCommit();
        context = context1;
    }

    public void commit(Object obj)
        throws Exception
    {
        if (commit != null)
        {
            commit.call(context, obj);
        }
    }

    public void complete(Object obj)
        throws Exception
    {
        if (complete != null)
        {
            complete.call(context, obj);
        }
    }

    public void persist(Object obj)
        throws Exception
    {
        if (persist != null)
        {
            persist.call(context, obj);
        }
    }

    public Object replace(Object obj)
        throws Exception
    {
        Object obj1 = obj;
        if (replace != null)
        {
            obj1 = replace.call(context, obj);
        }
        return obj1;
    }

    public Object resolve(Object obj)
        throws Exception
    {
        Object obj1 = obj;
        if (resolve != null)
        {
            obj1 = resolve.call(context, obj);
        }
        return obj1;
    }

    public void validate(Object obj)
        throws Exception
    {
        if (validate != null)
        {
            validate.call(context, obj);
        }
    }
}
