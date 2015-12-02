.class Lcom/qihoo/antivirus/update/UpdateService$b;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/antivirus/update/UpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/antivirus/update/UpdateService;


# direct methods
.method private constructor <init>(Lcom/qihoo/antivirus/update/UpdateService;)V
    .locals 0

    .prologue
    .line 343
    iput-object p1, p0, Lcom/qihoo/antivirus/update/UpdateService$b;->a:Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/antivirus/update/UpdateService;Lcom/qihoo/antivirus/update/UpdateService$b;)V
    .locals 0

    .prologue
    .line 343
    invoke-direct {p0, p1}, Lcom/qihoo/antivirus/update/UpdateService$b;-><init>(Lcom/qihoo/antivirus/update/UpdateService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 346
    if-eqz p2, :cond_0

    .line 347
    const-string/jumbo v0, "com.qihoo.action.INTENT_EXTRA_PRODUCT"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 348
    const-string/jumbo v1, "com.qihoo.action.INTENT_EXTRA_UPDATE_STOP_TYPE"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 349
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 350
    const/4 v3, 0x2

    iput v3, v2, Landroid/os/Message;->what:I

    .line 351
    iput-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 352
    iput v1, v2, Landroid/os/Message;->arg1:I

    .line 353
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->g:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 355
    :cond_0
    return-void
.end method
