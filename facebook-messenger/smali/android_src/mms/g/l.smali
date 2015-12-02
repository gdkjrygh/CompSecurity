.class public Landroid_src/mms/g/l;
.super Ljava/lang/Object;
.source "RateController.java"


# static fields
.field private static a:Landroid_src/mms/g/l;

.field private static b:Z


# instance fields
.field private final c:Landroid/content/Context;

.field private d:I

.field private final e:Landroid/content/BroadcastReceiver;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Landroid_src/mms/g/m;

    invoke-direct {v0, p0}, Landroid_src/mms/g/m;-><init>(Landroid_src/mms/g/l;)V

    iput-object v0, p0, Landroid_src/mms/g/l;->e:Landroid/content/BroadcastReceiver;

    .line 73
    iput-object p1, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    .line 74
    return-void
.end method

.method static synthetic a(Landroid_src/mms/g/l;I)I
    .locals 0

    .prologue
    .line 31
    iput p1, p0, Landroid_src/mms/g/l;->d:I

    return p1
.end method

.method public static a()Landroid_src/mms/g/l;
    .locals 2

    .prologue
    .line 88
    sget-object v0, Landroid_src/mms/g/l;->a:Landroid_src/mms/g/l;

    if-nez v0, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Uninitialized."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    sget-object v0, Landroid_src/mms/g/l;->a:Landroid_src/mms/g/l;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 81
    sget-object v0, Landroid_src/mms/g/l;->a:Landroid_src/mms/g/l;

    if-eqz v0, :cond_0

    .line 82
    const-string v0, "RateController"

    const-string v1, "Already initialized."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :cond_0
    new-instance v0, Landroid_src/mms/g/l;

    invoke-direct {v0, p0}, Landroid_src/mms/g/l;-><init>(Landroid/content/Context;)V

    sput-object v0, Landroid_src/mms/g/l;->a:Landroid_src/mms/g/l;

    .line 85
    return-void
.end method

.method private declared-synchronized e()I
    .locals 3

    .prologue
    .line 147
    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget v1, p0, Landroid_src/mms/g/l;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    const/16 v1, 0x4e20

    if-ge v0, v1, :cond_0

    .line 152
    const-wide/16 v1, 0x3e8

    :try_start_1
    invoke-virtual {p0, v1, v2}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :goto_1
    add-int/lit16 v0, v0, 0x3e8

    goto :goto_0

    .line 157
    :cond_0
    :try_start_2
    iget v0, p0, Landroid_src/mms/g/l;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v0

    .line 153
    :catch_0
    move-exception v1

    goto :goto_1

    .line 147
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final b()V
    .locals 4

    .prologue
    .line 95
    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    .line 96
    const-string v1, "sent_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 97
    iget-object v1, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid_src/c/h;->a:Landroid/net/Uri;

    invoke-static {v1, v2, v3, v0}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 99
    return-void
.end method

.method public final c()Z
    .locals 11

    .prologue
    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x36ee80

    sub-long v9, v0, v2

    .line 103
    iget-object v0, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    iget-object v1, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/h;->a:Landroid/net/Uri;

    new-array v3, v7, [Ljava/lang/String;

    const-string v4, "COUNT(*) AS rate"

    aput-object v4, v3, v8

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sent_time>"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v6, v5

    invoke-static/range {v0 .. v6}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 106
    if-eqz v1, :cond_2

    .line 108
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    const/16 v2, 0x64

    if-lt v0, v2, :cond_0

    move v0, v7

    .line 112
    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 115
    :goto_1
    return v0

    :cond_0
    move v0, v8

    .line 109
    goto :goto_0

    .line 112
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    move v0, v8

    .line 115
    goto :goto_1

    .line 112
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public declared-synchronized d()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 119
    monitor-enter p0

    :goto_0
    :try_start_0
    sget-boolean v2, Landroid_src/mms/g/l;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v2, :cond_0

    .line 121
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    .line 122
    :catch_0
    move-exception v2

    goto :goto_0

    .line 126
    :cond_0
    const/4 v2, 0x1

    :try_start_2
    sput-boolean v2, Landroid_src/mms/g/l;->b:Z

    .line 128
    iget-object v2, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    iget-object v3, p0, Landroid_src/mms/g/l;->e:Landroid/content/BroadcastReceiver;

    new-instance v4, Landroid/content/IntentFilter;

    const-string v5, "com.android.mms.RATE_LIMIT_CONFIRMED"

    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 131
    const/4 v2, 0x0

    iput v2, p0, Landroid_src/mms/g/l;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.android.mms.RATE_LIMIT_SURPASSED"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 136
    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 137
    iget-object v3, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 138
    invoke-direct {p0}, Landroid_src/mms/g/l;->e()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v2

    if-ne v2, v0, :cond_1

    .line 140
    :goto_1
    :try_start_4
    iget-object v1, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/g/l;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 141
    const/4 v1, 0x0

    sput-boolean v1, Landroid_src/mms/g/l;->b:Z

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return v0

    :cond_1
    move v0, v1

    .line 138
    goto :goto_1

    .line 140
    :catchall_0
    move-exception v0

    :try_start_5
    iget-object v1, p0, Landroid_src/mms/g/l;->c:Landroid/content/Context;

    iget-object v2, p0, Landroid_src/mms/g/l;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 141
    const/4 v1, 0x0

    sput-boolean v1, Landroid_src/mms/g/l;->b:Z

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 119
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method
