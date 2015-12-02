.class Lcom/facebook/push/c2dm/t;
.super Ljava/lang/Object;
.source "FacebookPushServerRegistrar.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/fbservice/service/OperationResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/push/c2dm/v;

.field final synthetic b:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;


# direct methods
.method constructor <init>(Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;Lcom/facebook/push/c2dm/v;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lcom/facebook/push/c2dm/t;->b:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iput-object p2, p0, Lcom/facebook/push/c2dm/t;->a:Lcom/facebook/push/c2dm/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 141
    iget-object v0, p0, Lcom/facebook/push/c2dm/t;->b:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    iget-object v1, p0, Lcom/facebook/push/c2dm/t;->a:Lcom/facebook/push/c2dm/v;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/fbservice/service/OperationResult;Lcom/facebook/push/c2dm/v;)V

    .line 142
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 138
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/push/c2dm/t;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 4

    .prologue
    const/16 v3, 0x5f

    .line 146
    iget-object v0, p0, Lcom/facebook/push/c2dm/t;->b:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-static {v0}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;)V

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "failed"

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    instance-of v0, p1, Lcom/facebook/fbservice/service/ServiceException;

    if-eqz v0, :cond_1

    .line 149
    check-cast p1, Lcom/facebook/fbservice/service/ServiceException;

    .line 150
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->a()Lcom/facebook/fbservice/service/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/fbservice/service/t;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ServiceException;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/ApiErrorResult;

    .line 152
    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/http/protocol/ApiErrorResult;->a()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/push/c2dm/t;->b:Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/push/c2dm/FacebookPushServerRegistrar;->a(Ljava/lang/String;)V

    .line 159
    return-void

    .line 156
    :cond_1
    const-string v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "_"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method
