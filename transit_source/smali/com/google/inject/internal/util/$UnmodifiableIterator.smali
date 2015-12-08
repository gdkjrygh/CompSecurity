.class public abstract Lcom/google/inject/internal/util/$UnmodifiableIterator;
.super Ljava/lang/Object;
.source "UnmodifiableIterator.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    .local p0, "this":Lcom/google/inject/internal/util/$UnmodifiableIterator;, "Lcom/google/inject/internal/util/$UnmodifiableIterator<TE;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final remove()V
    .locals 1

    .prologue
    .line 34
    .local p0, "this":Lcom/google/inject/internal/util/$UnmodifiableIterator;, "Lcom/google/inject/internal/util/$UnmodifiableIterator<TE;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
