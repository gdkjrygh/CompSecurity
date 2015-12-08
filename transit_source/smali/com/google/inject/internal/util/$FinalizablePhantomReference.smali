.class public abstract Lcom/google/inject/internal/util/$FinalizablePhantomReference;
.super Ljava/lang/ref/PhantomReference;
.source "FinalizablePhantomReference.java"

# interfaces
.implements Lcom/google/inject/internal/util/$FinalizableReference;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/ref/PhantomReference",
        "<TT;>;",
        "Lcom/google/inject/internal/util/$FinalizableReference;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Lcom/google/inject/internal/util/$FinalizableReferenceQueue;)V
    .locals 1
    .param p2, "queue"    # Lcom/google/inject/internal/util/$FinalizableReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/inject/internal/util/$FinalizableReferenceQueue;",
            ")V"
        }
    .end annotation

    .prologue
    .line 43
    .local p0, "this":Lcom/google/inject/internal/util/$FinalizablePhantomReference;, "Lcom/google/inject/internal/util/$FinalizablePhantomReference<TT;>;"
    .local p1, "referent":Ljava/lang/Object;, "TT;"
    iget-object v0, p2, Lcom/google/inject/internal/util/$FinalizableReferenceQueue;->queue:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p0, p1, v0}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 44
    invoke-virtual {p2}, Lcom/google/inject/internal/util/$FinalizableReferenceQueue;->cleanUp()V

    .line 45
    return-void
.end method
