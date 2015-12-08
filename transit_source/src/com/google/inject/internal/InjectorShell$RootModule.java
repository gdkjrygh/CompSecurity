// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.Stage;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$SourceProvider;

// Referenced classes of package com.google.inject.internal:
//            InjectorShell

private static class <init>
    implements Module
{

    final Stage stage;

    public void configure(Binder binder)
    {
        binder = binder.withSource($SourceProvider.UNKNOWN_SOURCE);
        binder.bind(com/google/inject/Stage).toInstance(stage);
        binder.bindScope(com/google/inject/Singleton, Scopes.SINGLETON);
        binder.bindScope(javax/inject/Singleton, Scopes.SINGLETON);
    }

    private _cls9(Stage stage1)
    {
        stage = (Stage)$Preconditions.checkNotNull(stage1, "stage");
    }

    NotNull(Stage stage1, NotNull notnull)
    {
        this(stage1);
    }
}
