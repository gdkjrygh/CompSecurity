.class public Lcom/facebook/fbservice/a/b;
.super Ljava/lang/Object;
.source "RemoteStubHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 22
    new-instance v0, Lcom/facebook/fbservice/service/ad;

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/fbservice/service/OperationType;->c()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/ad;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)V

    .line 25
    invoke-interface {p2, v0}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
