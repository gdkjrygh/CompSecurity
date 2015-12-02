.class Lcom/facebook/orca/l/t;
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;)V
    .locals 0

    .prologue
    .line 276
    iput-object p1, p0, Lcom/facebook/orca/l/t;->a:Lcom/facebook/orca/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadListResult;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    .line 279
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->j()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 276
    check-cast p1, Lcom/facebook/orca/server/FetchThreadListResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/t;->a(Lcom/facebook/orca/server/FetchThreadListResult;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
