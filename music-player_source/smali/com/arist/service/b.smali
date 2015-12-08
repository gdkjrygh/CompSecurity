.class public final Lcom/arist/service/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/arist/service/c;

.field private b:Lcom/arist/service/MusicPlayService;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/arist/service/b;)Lcom/arist/service/MusicPlayService;
    .locals 1

    iget-object v0, p0, Lcom/arist/service/b;->b:Lcom/arist/service/MusicPlayService;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lcom/arist/service/b;->a:Lcom/arist/service/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/service/b;->b:Lcom/arist/service/MusicPlayService;

    iget-object v0, p0, Lcom/arist/service/b;->a:Lcom/arist/service/c;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/arist/service/MusicPlayService;)V
    .locals 2

    iput-object p1, p0, Lcom/arist/service/b;->b:Lcom/arist/service/MusicPlayService;

    new-instance v0, Lcom/arist/service/c;

    invoke-direct {v0, p0}, Lcom/arist/service/c;-><init>(Lcom/arist/service/b;)V

    iput-object v0, p0, Lcom/arist/service/b;->a:Lcom/arist/service/c;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.HEADSET_PLUG"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/service/b;->a:Lcom/arist/service/c;

    invoke-virtual {p1, v1, v0}, Lcom/arist/service/MusicPlayService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method
