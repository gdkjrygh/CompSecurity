.class public interface abstract Lcom/google/inject/spi/ExposedBinding;
.super Ljava/lang/Object;
.source "ExposedBinding.java"

# interfaces
.implements Lcom/google/inject/Binding;
.implements Lcom/google/inject/spi/HasDependencies;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Binding",
        "<TT;>;",
        "Lcom/google/inject/spi/HasDependencies;"
    }
.end annotation


# virtual methods
.method public abstract applyTo(Lcom/google/inject/Binder;)V
.end method

.method public abstract getPrivateElements()Lcom/google/inject/spi/PrivateElements;
.end method
