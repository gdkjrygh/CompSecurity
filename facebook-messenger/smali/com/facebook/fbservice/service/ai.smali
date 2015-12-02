.class public Lcom/facebook/fbservice/service/ai;
.super Ljava/lang/Object;
.source "TerminatingHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 1

    .prologue
    .line 9
    invoke-virtual {p0, p1}, Lcom/facebook/fbservice/service/ai;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/FutureOperationResult;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/FutureOperationResult;
    .locals 3

    .prologue
    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unhandled type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
