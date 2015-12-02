.class Lcom/facebook/orca/l/r;
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
        "Ljava/util/Collection",
        "<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/l/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/l/a;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/facebook/orca/l/r;->a:Lcom/facebook/orca/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/FetchThreadListResult;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/server/FetchThreadListResult;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 261
    invoke-virtual {p1}, Lcom/facebook/orca/server/FetchThreadListResult;->g()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 258
    check-cast p1, Lcom/facebook/orca/server/FetchThreadListResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/l/r;->a(Lcom/facebook/orca/server/FetchThreadListResult;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
