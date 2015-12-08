.class final Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 158
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 206
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 208
    :goto_1
    return-void

    .line 160
    :sswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.cleanmaster.sdk.cmloginsdk.data.APPLICATION_SID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    # setter for: Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->cm_sid:Ljava/lang/String;
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->access$002(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    .line 166
    :sswitch_1
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_PID"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 168
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->findName(I)Ljava/lang/String;
    invoke-static {v1, v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->access$100(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;I)Ljava/lang/String;

    move-result-object v3

    .line 170
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->findHash(Ljava/lang/String;)Ljava/lang/String;
    invoke-static {v0, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->access$200(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 173
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    .line 175
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSid()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/Settings;->getLoginSidSig()Ljava/lang/String;

    move-result-object v1

    # getter for: Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->cm_sid:Ljava/lang/String;
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->access$000()Ljava/lang/String;

    move-result-object v2

    const-string v5, ""

    const-string v6, ""

    new-instance v7, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;

    invoke-direct {v7, p0, v8}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/b;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;[Ljava/lang/String;)V

    invoke-static/range {v0 .. v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request;->newReauthRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cleanmaster/sdk/cmloginsdkjar/Request$CmProxyReauthCallback;)Lcom/cleanmaster/sdk/cmloginsdkjar/Request;

    .line 185
    aget-object v1, v8, v9

    .line 186
    const/4 v0, 0x1

    aget-object v0, v8, v0

    .line 193
    :goto_2
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 194
    const-string v3, "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID"

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const-string v1, "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID"

    invoke-virtual {v2, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const/4 v0, 0x0

    const v1, 0x10001

    const/4 v3, 0x0

    const/4 v4, 0x0

    :try_start_0
    invoke-static {v0, v1, v3, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 199
    invoke-virtual {v0, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 200
    iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    invoke-virtual {v1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 202
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0

    .line 188
    :cond_0
    const-string v1, ""

    .line 189
    const-string v0, ""

    goto :goto_2

    .line 158
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x10000 -> :sswitch_1
    .end sparse-switch
.end method
