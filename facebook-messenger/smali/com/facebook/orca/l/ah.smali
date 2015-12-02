.class Lcom/facebook/orca/l/ah;
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
        "Lcom/facebook/orca/server/FetchThreadResult;",
        "Lcom/facebook/orca/threads/ThreadSummary;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 889
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/l/x;)V
    .locals 0

    .prologue
    .line 889
    invoke-direct {p0}, Lcom/facebook/orca/l/ah;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 893
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 889
    check-cast p1, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/ah;->a(Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    return-object v0
.end method
