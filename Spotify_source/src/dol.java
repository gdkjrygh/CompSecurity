// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public interface dol
{

    public static final ctv a = new ctv() {

        public final Object a(Object obj)
        {
            obj = (dol)obj;
            if (obj != null)
            {
                return ((dol) (obj)).getPlayables();
            } else
            {
                return null;
            }
        }

    };

    public abstract String getId();

    public abstract Iterable getPlayables();

}
