.class public Lcom/facebook/orca/sms/u;
.super Ljava/lang/Object;
.source "MmsSendMessageHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/orca/sms/r;

.field private final e:Landroid/net/ConnectivityManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/orca/sms/u;

    sput-object v0, Lcom/facebook/orca/sms/u;->a:Ljava/lang/Class;

    .line 40
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/sms/u;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/sms/r;Landroid/net/ConnectivityManager;)V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/facebook/orca/sms/u;->c:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/facebook/orca/sms/u;->d:Lcom/facebook/orca/sms/r;

    .line 52
    iput-object p3, p0, Lcom/facebook/orca/sms/u;->e:Landroid/net/ConnectivityManager;

    .line 53
    return-void
.end method

.method private a(J)V
    .locals 1

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/sms/u;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/sms/r;->b(J)V

    .line 127
    return-void
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/orca/sms/u;->e:Landroid/net/ConnectivityManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 132
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)Lcom/facebook/messages/model/threads/Message;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    const/4 v9, 0x0

    const/4 v8, 0x0

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/sms/u;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/orca/sms/r;->a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)J

    move-result-wide v2

    .line 64
    new-instance v5, Ljava/util/concurrent/Semaphore;

    invoke-direct {v5, v8}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 65
    new-instance v4, Lcom/facebook/orca/sms/w;

    invoke-direct {v4, v9}, Lcom/facebook/orca/sms/w;-><init>(Lcom/facebook/orca/sms/v;)V

    .line 66
    new-instance v0, Lcom/facebook/orca/sms/v;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/sms/v;-><init>(Lcom/facebook/orca/sms/u;JLcom/facebook/orca/sms/w;Ljava/util/concurrent/Semaphore;)V

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/sms/u;->c:Landroid/content/Context;

    new-instance v6, Landroid/content/IntentFilter;

    const-string v7, "android.intent.action.TRANSACTION_COMPLETED_ACTION"

    invoke-direct {v6, v7}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 82
    sget-object v0, Landroid_src/c/g;->a:Landroid/net/Uri;

    invoke-static {v0, v2, v3}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 83
    new-instance v1, Landroid/content/Intent;

    iget-object v6, p0, Lcom/facebook/orca/sms/u;->c:Landroid/content/Context;

    const-class v7, Landroid_src/mms/transaction/TransactionService;

    invoke-direct {v1, v6, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    const-string v6, "uri"

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v6, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 85
    const-string v0, "type"

    const/4 v6, 0x2

    invoke-virtual {v1, v0, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 87
    invoke-direct {p0}, Lcom/facebook/orca/sms/u;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/sms/u;->a(J)V

    .line 89
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Network isn\'t availible to send Mms"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/u;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 94
    const-wide/16 v0, 0x78

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v0, v1, v6}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 95
    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/sms/u;->a(J)V

    .line 96
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Semaphore could not acquire requested permits"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 97
    sget-object v1, Lcom/facebook/orca/sms/u;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/sms/u;->a:Ljava/lang/Class;

    const-string v3, "Send message timed out"

    invoke-static {v1, v2, v3, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    throw v0

    .line 100
    :cond_1
    invoke-static {v4}, Lcom/facebook/orca/sms/w;->a(Lcom/facebook/orca/sms/w;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 101
    invoke-direct {p0, v2, v3}, Lcom/facebook/orca/sms/u;->a(J)V

    .line 102
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Mms send failed"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 105
    :cond_2
    invoke-static {v2, v3}, Lcom/facebook/orca/threads/m;->c(J)Ljava/lang/String;

    move-result-object v1

    .line 106
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/sms/u;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Landroid_src/c/m;->a(Landroid/content/Context;Ljava/util/Set;)J

    move-result-wide v2

    .line 109
    invoke-static {v2, v3}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 111
    :cond_3
    new-instance v2, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v2}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v2, p1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    const-string v3, "mms"

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v8}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/messages/model/threads/e;->d(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 122
    return-object v0
.end method
