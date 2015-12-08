.class public interface abstract Lcom/google/inject/binder/LinkedBindingBuilder;
.super Ljava/lang/Object;
.source "LinkedBindingBuilder.java"

# interfaces
.implements Lcom/google/inject/binder/ScopedBindingBuilder;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/binder/ScopedBindingBuilder;"
    }
.end annotation


# virtual methods
.method public abstract to(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<+TT;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract to(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<+TT;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract to(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+TT;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toConstructor(Ljava/lang/reflect/Constructor;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>(",
            "Ljava/lang/reflect/Constructor",
            "<TS;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toConstructor(Ljava/lang/reflect/Constructor;Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>(",
            "Ljava/lang/reflect/Constructor",
            "<TS;>;",
            "Lcom/google/inject/TypeLiteral",
            "<+TS;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toInstance(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract toProvider(Lcom/google/inject/Key;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toProvider(Lcom/google/inject/Provider;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<+TT;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toProvider(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method

.method public abstract toProvider(Ljava/lang/Class;)Lcom/google/inject/binder/ScopedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;)",
            "Lcom/google/inject/binder/ScopedBindingBuilder;"
        }
    .end annotation
.end method
