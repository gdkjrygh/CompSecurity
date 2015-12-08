// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.List;

public interface _cls1
{

    public static final _cls1 NULL = new Linker.ErrorHandler() {

        public void handleErrors(List list)
        {
        }

    };

    public abstract void handleErrors(List list);

}
