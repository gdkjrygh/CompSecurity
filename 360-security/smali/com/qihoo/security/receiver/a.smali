.class public Lcom/qihoo/security/receiver/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/receiver/a$1;,
        Lcom/qihoo/security/receiver/a$b;,
        Lcom/qihoo/security/receiver/a$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/qihoo/security/receiver/a$a;

.field private c:Lcom/qihoo/security/receiver/a$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/qihoo/security/receiver/a;->a:Landroid/content/Context;

    .line 16
    new-instance v0, Lcom/qihoo/security/receiver/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/receiver/a$a;-><init>(Lcom/qihoo/security/receiver/a;Lcom/qihoo/security/receiver/a$1;)V

    iput-object v0, p0, Lcom/qihoo/security/receiver/a;->b:Lcom/qihoo/security/receiver/a$a;

    .line 17
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/receiver/a;)Lcom/qihoo/security/receiver/a$b;
    .locals 1

    .prologue
    .line 9
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->a:Landroid/content/Context;

    const-string/jumbo v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 43
    invoke-virtual {v0}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    invoke-interface {v0}, Lcom/qihoo/security/receiver/a$b;->b()V

    .line 52
    :cond_0
    :goto_0
    return-void

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    invoke-interface {v0}, Lcom/qihoo/security/receiver/a$b;->c()V

    goto :goto_0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 59
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 60
    const-string/jumbo v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 61
    const-string/jumbo v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 62
    const-string/jumbo v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 63
    iget-object v1, p0, Lcom/qihoo/security/receiver/a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/receiver/a;->b:Lcom/qihoo/security/receiver/a$a;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 64
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/receiver/a$b;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/qihoo/security/receiver/a;->c:Lcom/qihoo/security/receiver/a$b;

    .line 37
    invoke-direct {p0}, Lcom/qihoo/security/receiver/a;->b()V

    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/receiver/a;->a()V

    .line 39
    return-void
.end method
