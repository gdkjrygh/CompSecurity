.class public Lcom/facebook/fbservice/service/FutureOperationResult;
.super Lcom/facebook/fbservice/service/OperationResult;
.source "FutureOperationResult.java"


# instance fields
.field private final a:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/common/d/a/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/fbservice/service/OperationResult;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/facebook/fbservice/service/FutureOperationResult;->a:Lcom/google/common/d/a/s;

    .line 16
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/fbservice/service/OperationResult;",
            ">;"
        }
    .end annotation

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/fbservice/service/FutureOperationResult;->a:Lcom/google/common/d/a/s;

    return-object v0
.end method
