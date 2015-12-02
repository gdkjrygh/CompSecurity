.class Lcom/facebook/orca/l/b;
.super Ljava/lang/Object;
.source "MergeServiceHandler.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/orca/server/FetchThreadListResult;",
        "Lcom/facebook/orca/threads/ThreadsCollection;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/facebook/orca/l/b;->a:Lcom/facebook/orca/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadListResult;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 216
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->b()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 213
    check-cast p1, Lcom/facebook/orca/server/FetchThreadListResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/b;->a(Lcom/facebook/orca/server/FetchThreadListResult;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    return-object v0
.end method
