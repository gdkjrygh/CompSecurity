.class Lcom/qihoo/security/h/c$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/h/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/h/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/h/c;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/qihoo/security/h/c$1;->a:Lcom/qihoo/security/h/c;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    .line 71
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 81
    :goto_0
    return-void

    .line 73
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/h/c$1;->a:Lcom/qihoo/security/h/c;

    invoke-static {v0}, Lcom/qihoo/security/h/c;->a(Lcom/qihoo/security/h/c;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/h/c$1;->a:Lcom/qihoo/security/h/c;

    invoke-static {v2}, Lcom/qihoo/security/h/c;->a(Lcom/qihoo/security/h/c;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/qihoo/security/service/LoadingPermissionDataService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string/jumbo v2, "com.qihoo360.mobilesafe.shield.loading"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 78
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/h/c$1;->a:Lcom/qihoo/security/h/c;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/qihoo/security/h/c;->a(Lcom/qihoo/security/h/c;I)V

    goto :goto_0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
