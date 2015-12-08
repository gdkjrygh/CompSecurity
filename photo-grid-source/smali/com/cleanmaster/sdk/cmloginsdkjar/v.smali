.class final Lcom/cleanmaster/sdk/cmloginsdkjar/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/Request$Callback;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/v;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V
    .locals 2

    .prologue
    .line 520
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/v;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;

    if-eqz v0, :cond_0

    .line 521
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/v;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;

    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-virtual {p1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/Response;->getGraphObjectAs(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;

    invoke-interface {v1, v0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;->onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V

    .line 523
    :cond_0
    return-void
.end method
