.class Lcom/qihoo/antivirus/update/UpdateService$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/antivirus/update/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 306
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 309
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 334
    :goto_0
    return-void

    .line 311
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 312
    iget v1, p1, Landroid/os/Message;->arg1:I

    .line 313
    const/4 v2, 0x2

    invoke-static {v2, v0, v1}, Lcom/qihoo/antivirus/update/UpdateService;->a(ILjava/lang/String;I)V

    goto :goto_0

    .line 317
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-static {}, Lcom/qihoo/antivirus/update/UpdateService;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/qihoo/antivirus/update/UpdateService;->b()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/qihoo/antivirus/update/UpdateService;->a(ILjava/lang/String;I)V

    goto :goto_0

    .line 326
    :pswitch_2
    invoke-static {v2}, Lcom/qihoo/antivirus/update/UpdateService;->a(Lcom/qihoo/antivirus/update/d;)V

    .line 327
    invoke-static {v2}, Lcom/qihoo/antivirus/update/UpdateService;->a(Lcom/qihoo/antivirus/update/ai;)V

    .line 328
    sput v1, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    .line 329
    sput-boolean v1, Lcom/qihoo/antivirus/update/UpdateService;->a:Z

    .line 330
    invoke-static {}, Lcom/qihoo/antivirus/update/UpdateService;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 331
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    goto :goto_0

    .line 309
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
