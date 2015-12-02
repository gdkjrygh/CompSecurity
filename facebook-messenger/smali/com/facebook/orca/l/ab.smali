.class final Lcom/facebook/orca/l/ab;
.super Ljava/lang/Object;
.source "MergingUtil.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/orca/threads/ThreadSummary;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/base/Function;


# direct methods
.method constructor <init>(Lcom/google/common/base/Function;)V
    .locals 0

    .prologue
    .line 580
    iput-object p1, p0, Lcom/facebook/orca/l/ab;->a:Lcom/google/common/base/Function;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 583
    iget-object v0, p0, Lcom/facebook/orca/l/ab;->a:Lcom/google/common/base/Function;

    invoke-interface {v0, p1}, Lcom/google/common/base/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 580
    check-cast p1, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/ab;->a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
