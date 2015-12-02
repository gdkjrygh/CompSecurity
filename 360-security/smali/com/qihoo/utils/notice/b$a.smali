.class Lcom/qihoo/utils/notice/b$a;
.super Lcom/qihoo/security/base/BaseBroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/utils/notice/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lcom/qihoo/utils/notice/b;


# direct methods
.method private constructor <init>(Lcom/qihoo/utils/notice/b;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/qihoo/utils/notice/b$a;->b:Lcom/qihoo/utils/notice/b;

    invoke-direct {p0}, Lcom/qihoo/security/base/BaseBroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/utils/notice/b;Lcom/qihoo/utils/notice/b$1;)V
    .locals 0

    .prologue
    .line 297
    invoke-direct {p0, p1}, Lcom/qihoo/utils/notice/b$a;-><init>(Lcom/qihoo/utils/notice/b;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 325
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 326
    const-string/jumbo v1, "android.intent.action.BATTERY_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 327
    const-string/jumbo v1, "android.intent.action.ACTION_POWER_CONNECTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 328
    const-string/jumbo v1, "android.intent.action.ACTION_POWER_DISCONNECTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 329
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 335
    :goto_0
    return-void

    .line 330
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method protected a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 304
    const-string/jumbo v2, "android.intent.action.BATTERY_CHANGED"

    iget-object v3, p0, Lcom/qihoo/utils/notice/b$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 306
    const-string/jumbo v2, "level"

    invoke-virtual {p2, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 308
    const-string/jumbo v3, "scale"

    const/16 v4, 0x64

    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    .line 309
    iget-object v4, p0, Lcom/qihoo/utils/notice/b$a;->b:Lcom/qihoo/utils/notice/b;

    mul-int/lit8 v2, v2, 0x64

    div-int/2addr v2, v3

    invoke-static {v4, v2}, Lcom/qihoo/utils/notice/b;->c(Lcom/qihoo/utils/notice/b;I)I

    .line 311
    const-string/jumbo v2, "status"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 312
    iget-object v3, p0, Lcom/qihoo/utils/notice/b$a;->b:Lcom/qihoo/utils/notice/b;

    const/4 v4, 0x2

    if-ne v4, v2, :cond_1

    :goto_0
    invoke-static {v3, v0}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Z)Z

    .line 321
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 312
    goto :goto_0

    .line 316
    :cond_2
    const-string/jumbo v2, "android.intent.action.ACTION_POWER_CONNECTED"

    iget-object v3, p0, Lcom/qihoo/utils/notice/b$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 317
    iget-object v1, p0, Lcom/qihoo/utils/notice/b$a;->b:Lcom/qihoo/utils/notice/b;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Z)Z

    goto :goto_1

    .line 318
    :cond_3
    const-string/jumbo v0, "android.intent.action.ACTION_POWER_DISCONNECTED"

    iget-object v2, p0, Lcom/qihoo/utils/notice/b$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/qihoo/utils/notice/b$a;->b:Lcom/qihoo/utils/notice/b;

    invoke-static {v0, v1}, Lcom/qihoo/utils/notice/b;->a(Lcom/qihoo/utils/notice/b;Z)Z

    goto :goto_1
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 339
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 345
    :goto_0
    return-void

    .line 340
    :catch_0
    move-exception v0

    goto :goto_0
.end method
