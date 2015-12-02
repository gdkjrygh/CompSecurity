.class public Lcom/qihoo/security/notify/NotificationService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# instance fields
.field private final c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 28
    new-instance v0, Lcom/qihoo/security/notify/NotificationService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/notify/NotificationService$1;-><init>(Lcom/qihoo/security/notify/NotificationService;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/NotificationService;->c:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 57
    new-instance v0, Lcom/qihoo/security/opti/a/b;

    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationService;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/a/b;-><init>(Landroid/content/Context;)V

    .line 58
    new-instance v1, Lcom/qihoo/security/notify/NotificationService$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/notify/NotificationService$2;-><init>(Lcom/qihoo/security/notify/NotificationService;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b$a;)V

    .line 72
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/b;->b()V

    .line 73
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/notify/NotificationService;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/qihoo/security/notify/NotificationService;->a()V

    return-void
.end method


# virtual methods
.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 43
    if-nez p1, :cond_1

    .line 53
    :cond_0
    :goto_0
    return v3

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 47
    const-string/jumbo v1, "com.qihoo.security.index.FUNCTION_NOTIFICATION"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    .line 48
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_BOOST"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/notify/NotificationService;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/notify/NotificationService;->c:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/notify/NotificationService;->b:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 51
    iget-object v0, p0, Lcom/qihoo/security/notify/NotificationService;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->g(Landroid/content/Context;)V

    goto :goto_0
.end method
