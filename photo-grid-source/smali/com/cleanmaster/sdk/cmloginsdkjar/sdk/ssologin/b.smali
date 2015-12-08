.class final Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 177
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;->a:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompleted(Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;Lcom/cleanmaster/sdk/cmloginsdkjar/Response;)V
    .locals 4

    .prologue
    .line 180
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;->a:[Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v3, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;

    invoke-interface {v0, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;->getSid()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    .line 181
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;->a:[Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmRawObject;->getData()Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    const-class v3, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;

    invoke-interface {v0, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;->cast(Ljava/lang/Class;)Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmObject;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;

    invoke-interface {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/model/CmProxyReauth;->getSsoToken()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    .line 182
    return-void
.end method
