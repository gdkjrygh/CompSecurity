.class public Lcom/facebook/http/protocol/x;
.super Lcom/facebook/http/protocol/e;
.source "BatchMethodNotExecutedException.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 12
    new-instance v0, Lcom/facebook/http/protocol/ApiErrorResult;

    const/4 v1, -0x1

    const-string v2, "Batch method not executed"

    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/http/protocol/ApiErrorResult;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/facebook/http/protocol/e;-><init>(Lcom/facebook/http/protocol/ApiErrorResult;)V

    .line 13
    return-void
.end method
