.class Lcom/facebook/orca/l/af;
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
        "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
        "Lcom/facebook/orca/threads/MessagesCollection;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 922
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/l/x;)V
    .locals 0

    .prologue
    .line 922
    invoke-direct {p0}, Lcom/facebook/orca/l/af;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchMoreMessagesResult;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 926
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 922
    check-cast p1, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/af;->a(Lcom/facebook/orca/server/FetchMoreMessagesResult;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method
