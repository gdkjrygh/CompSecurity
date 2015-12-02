.class final Lcom/mobvista/sdk/m/a/d/a/g;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/d/a/j;


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/d/a/d;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/d/a/d;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/g;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 257
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/g;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->b(Lcom/mobvista/sdk/m/a/d/a/d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 258
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->what:I

    .line 259
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 260
    const-string/jumbo v2, "message_key"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 262
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/g;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/d/a/d;->b(Lcom/mobvista/sdk/m/a/d/a/d;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 263
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 246
    iget-object v0, p0, Lcom/mobvista/sdk/m/a/d/a/g;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v0}, Lcom/mobvista/sdk/m/a/d/a/d;->b(Lcom/mobvista/sdk/m/a/d/a/d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 247
    const/4 v1, 0x1

    iput v1, v0, Landroid/os/Message;->what:I

    .line 248
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 249
    const-string/jumbo v2, "message_key"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    const-string/jumbo v2, "message_bitmap"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 252
    iget-object v1, p0, Lcom/mobvista/sdk/m/a/d/a/g;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-static {v1}, Lcom/mobvista/sdk/m/a/d/a/d;->b(Lcom/mobvista/sdk/m/a/d/a/d;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 253
    return-void
.end method
