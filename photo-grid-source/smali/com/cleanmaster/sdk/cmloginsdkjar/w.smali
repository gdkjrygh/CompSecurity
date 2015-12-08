.class final Lcom/cleanmaster/sdk/cmloginsdkjar/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;)V
    .locals 0

    .prologue
    .line 549
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/w;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V
    .locals 2

    .prologue
    .line 552
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/w;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;

    if-eqz v0, :cond_0

    .line 553
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/w;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;

    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-virtual {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-interface {v1, v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyRevokeCallback;->onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V

    .line 555
    :cond_0
    return-void
.end method
