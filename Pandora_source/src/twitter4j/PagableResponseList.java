// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;


// Referenced classes of package twitter4j:
//            CursorSupport, ResponseList

public interface PagableResponseList
    extends CursorSupport, ResponseList
{

    public abstract long getNextCursor();

    public abstract long getPreviousCursor();

    public abstract boolean hasNext();

    public abstract boolean hasPrevious();
}
