.class public interface abstract Lcom/google/inject/binder/ScopedBindingBuilder;
.super Ljava/lang/Object;
.source "ScopedBindingBuilder.java"


# virtual methods
.method public abstract asEagerSingleton()V
.end method

.method public abstract in(Lcom/google/inject/Scope;)V
.end method

.method public abstract in(Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation
.end method
