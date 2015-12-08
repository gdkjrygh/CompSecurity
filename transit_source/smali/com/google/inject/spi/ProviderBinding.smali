.class public interface abstract Lcom/google/inject/spi/ProviderBinding;
.super Ljava/lang/Object;
.source "ProviderBinding.java"

# interfaces
.implements Lcom/google/inject/Binding;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/google/inject/Provider",
        "<*>;>",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Binding",
        "<TT;>;"
    }
.end annotation


# virtual methods
.method public abstract getProvidedKey()Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<*>;"
        }
    .end annotation
.end method
