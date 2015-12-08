.class public interface abstract Lcom/google/inject/spi/LinkedKeyBinding;
.super Ljava/lang/Object;
.source "LinkedKeyBinding.java"

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
.method public abstract getLinkedKey()Lcom/google/inject/Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/inject/Key",
            "<+TT;>;"
        }
    .end annotation
.end method
