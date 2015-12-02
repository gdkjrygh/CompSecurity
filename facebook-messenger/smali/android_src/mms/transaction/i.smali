.class public Landroid_src/mms/transaction/i;
.super Landroid/content/BroadcastReceiver;
.source "MmsSystemEventReceiver.java"


# static fields
.field private static a:Landroid_src/mms/transaction/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 85
    invoke-static {p0}, Landroid_src/mms/transaction/i;->b(Landroid/content/Context;)V

    .line 87
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 88
    const-string v1, "android.intent.action.ANY_DATA_STATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 89
    const/4 v1, 0x2

    invoke-static {v1}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    const-string v1, "fb-mms:MmsSystemEventReceiver"

    const-string v2, "registerForConnectionStateChanges"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_0
    sget-object v1, Landroid_src/mms/transaction/i;->a:Landroid_src/mms/transaction/i;

    if-nez v1, :cond_1

    .line 93
    new-instance v1, Landroid_src/mms/transaction/i;

    invoke-direct {v1}, Landroid_src/mms/transaction/i;-><init>()V

    sput-object v1, Landroid_src/mms/transaction/i;->a:Landroid_src/mms/transaction/i;

    .line 96
    :cond_1
    sget-object v1, Landroid_src/mms/transaction/i;->a:Landroid_src/mms/transaction/i;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 97
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 100
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    const-string v0, "fb-mms:MmsSystemEventReceiver"

    const-string v1, "unRegisterForConnectionStateChanges"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_0
    sget-object v0, Landroid_src/mms/transaction/i;->a:Landroid_src/mms/transaction/i;

    if-eqz v0, :cond_1

    .line 105
    :try_start_0
    sget-object v0, Landroid_src/mms/transaction/i;->a:Landroid_src/mms/transaction/i;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :cond_1
    :goto_0
    return-void

    .line 106
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 49
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    const-string v0, "fb-mms:MmsSystemEventReceiver"

    const-string v1, "wakeUpService: start transaction service ..."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroid_src/mms/transaction/TransactionService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 54
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 58
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    const-string v0, "fb-mms:MmsSystemEventReceiver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Intent received: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 63
    const-string v1, "android.intent.action.CONTENT_CHANGED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 64
    const-string v0, "deleted_contents"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 65
    invoke-static {}, Landroid_src/mms/g/j;->b()Landroid_src/mms/g/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid_src/mms/g/j;->a(Landroid/net/Uri;)Landroid_src/mms/g/k;

    .line 82
    :cond_1
    :goto_0
    return-void

    .line 66
    :cond_2
    const-string v1, "android.intent.action.ANY_DATA_STATE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 67
    const-string v0, "state"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-static {v4}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 70
    const-string v1, "fb-mms:MmsSystemEventReceiver"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ANY_DATA_STATE event received: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    :cond_3
    const-string v1, "CONNECTED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    invoke-static {p1}, Landroid_src/mms/transaction/i;->c(Landroid/content/Context;)V

    goto :goto_0

    .line 76
    :cond_4
    const-string v1, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    invoke-static {p1, v3, v3}, Landroid_src/mms/transaction/d;->a(Landroid/content/Context;ZZ)V

    goto :goto_0
.end method
