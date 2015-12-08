.class final Lcom/cleanmaster/sdk/cmloginsdkjar/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;)V
    .locals 0

    .prologue
    .line 579
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/x;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V
    .locals 2

    .prologue
    .line 582
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/x;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;

    if-eqz v0, :cond_0

    .line 583
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/x;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;

    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-virtual {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-interface {v1, v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyUpAvatarCallback;->onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V

    .line 585
    :cond_0
    return-void
.end method
