.class Lcom/facebook/orca/l/ag;
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
        "Lcom/facebook/orca/threads/MessagesCollection;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 900
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/l/x;)V
    .locals 0

    .prologue
    .line 900
    invoke-direct {p0}, Lcom/facebook/orca/l/ag;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 904
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadResult;->b()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 900
    check-cast p1, Lcom/facebook/orca/server/FetchThreadResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/ag;->a(Lcom/facebook/orca/server/FetchThreadResult;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method
