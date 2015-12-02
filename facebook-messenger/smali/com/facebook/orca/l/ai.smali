.class Lcom/facebook/orca/l/ai;
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 869
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/l/x;)V
    .locals 0

    .prologue
    .line 869
    invoke-direct {p0}, Lcom/facebook/orca/l/ai;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 872
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->u()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 869
    check-cast p1, Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/ai;->a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
