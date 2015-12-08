.class public interface abstract Lcom/google/inject/spi/ProviderKeyBinding;
.super Ljava/lang/Object;
.source "ProviderKeyBinding.java"

# interfaces
.implements Lcom/google/inject/Binding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Binding",
        "<TT;>;"
    }
.end annotation


# virtual methods
.method public abstract getProviderKey()Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<+",
            "Ljavax/inject/Provider",
            "<+TT;>;>;"
        }
    .end annotation
.end method
