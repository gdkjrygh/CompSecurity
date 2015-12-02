.class final Lcom/google/common/d/a/k;
.super Ljava/lang/Object;
.source "Futures.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<TI;",
        "Lcom/google/common/d/a/s",
        "<TO;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/base/Function;


# direct methods
.method constructor <init>(Lcom/google/common/base/Function;)V
    .locals 0

    .prologue
    .line 475
    iput-object p1, p0, Lcom/google/common/d/a/k;->a:Lcom/google/common/base/Function;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/common/d/a/s",
            "<TO;>;"
        }
    .end annotation

    .prologue
    .line 477
    iget-object v0, p0, Lcom/google/common/d/a/k;->a:Lcom/google/common/base/Function;

    invoke-interface {v0, p1}, Lcom/google/common/base/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 478
    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 475
    invoke-virtual {p0, p1}, Lcom/google/common/d/a/k;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method
