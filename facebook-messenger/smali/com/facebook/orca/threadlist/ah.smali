.class Lcom/facebook/orca/threadlist/ah;
.super Ljava/lang/Object;
.source "ThreadListAdapter.java"

# interfaces
.implements Lcom/google/common/base/Predicate;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Predicate",
        "<",
        "Lcom/facebook/orca/threads/ThreadSummary;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadlist/af;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadlist/af;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lcom/facebook/orca/threadlist/ah;->a:Lcom/facebook/orca/threadlist/af;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Z
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/orca/threadlist/ah;->a:Lcom/facebook/orca/threadlist/af;

    invoke-static {v0}, Lcom/facebook/orca/threadlist/af;->b(Lcom/facebook/orca/threadlist/af;)Lcom/facebook/orca/f/x;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/x;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 182
    check-cast p1, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/threadlist/ah;->a(Lcom/facebook/orca/threads/ThreadSummary;)Z

    move-result v0

    return v0
.end method
