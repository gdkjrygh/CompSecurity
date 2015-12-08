.class public interface abstract Lcom/google/inject/util/Modules$OverriddenModuleBuilder;
.super Ljava/lang/Object;
.source "Modules.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/util/Modules;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OverriddenModuleBuilder"
.end annotation


# virtual methods
.method public abstract with(Ljava/lang/Iterable;)Lcom/google/inject/Module;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/Module;"
        }
    .end annotation
.end method

.method public varargs abstract with([Lcom/google/inject/Module;)Lcom/google/inject/Module;
.end method
