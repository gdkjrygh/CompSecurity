.class public interface abstract Lcom/google/inject/spi/InstanceBinding;
.super Ljava/lang/Object;
.source "InstanceBinding.java"

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
.method public abstract getInjectionPoints()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/spi/InjectionPoint;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getInstance()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method
