.class public final Lcom/kik/cards/web/bb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Z

.field private c:Z

.field private d:Landroid/content/IntentFilter;

.field private e:Landroid/content/BroadcastReceiver;

.field private final f:Lcom/kik/g/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/bb;->f:Lcom/kik/g/k;

    .line 29
    iput-object p1, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    .line 30
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/bb;Z)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/kik/cards/web/bb;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 83
    iget-boolean v0, p0, Lcom/kik/cards/web/bb;->b:Z

    if-ne p1, v0, :cond_0

    .line 90
    :goto_0
    return-void

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/bb;->f:Lcom/kik/g/k;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 89
    iput-boolean p1, p0, Lcom/kik/cards/web/bb;->b:Z

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/kik/cards/web/bb;->f:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/kik/cards/web/bb;->b:Z

    return v0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 39
    iget-object v0, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 71
    :goto_0
    return-void

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 45
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    iput-boolean v0, p0, Lcom/kik/cards/web/bb;->b:Z

    .line 50
    :cond_1
    iget-boolean v0, p0, Lcom/kik/cards/web/bb;->b:Z

    invoke-direct {p0, v0}, Lcom/kik/cards/web/bb;->a(Z)V

    .line 52
    iget-object v0, p0, Lcom/kik/cards/web/bb;->d:Landroid/content/IntentFilter;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/kik/cards/web/bb;->e:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_3

    .line 53
    :cond_2
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/bb;->d:Landroid/content/IntentFilter;

    .line 54
    iget-object v0, p0, Lcom/kik/cards/web/bb;->d:Landroid/content/IntentFilter;

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 55
    new-instance v0, Lcom/kik/cards/web/bc;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/bc;-><init>(Lcom/kik/cards/web/bb;)V

    iput-object v0, p0, Lcom/kik/cards/web/bb;->e:Landroid/content/BroadcastReceiver;

    .line 68
    :cond_3
    iget-object v0, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/kik/cards/web/bb;->e:Landroid/content/BroadcastReceiver;

    iget-object v2, p0, Lcom/kik/cards/web/bb;->d:Landroid/content/IntentFilter;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/cards/web/bb;->c:Z

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 75
    iget-boolean v0, p0, Lcom/kik/cards/web/bb;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/bb;->e:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/kik/cards/web/bb;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/kik/cards/web/bb;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/bb;->c:Z

    .line 79
    :cond_0
    return-void
.end method
