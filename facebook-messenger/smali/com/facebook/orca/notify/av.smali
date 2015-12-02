.class public Lcom/facebook/orca/notify/av;
.super Ljava/lang/Object;
.source "OrcaNotificationManager.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/orca/notify/as;

.field private final d:Lcom/facebook/common/v/a;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/notify/am;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/facebook/auth/b/b;

.field private final h:Landroid/os/Handler;

.field private final i:Ljava/lang/String;

.field private final j:Lcom/facebook/analytics/cn;

.field private final k:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final l:Lcom/facebook/push/c2dm/y;

.field private final m:Lcom/facebook/i/a/a/f;

.field private final n:Lcom/facebook/i/a/a/a;

.field private final o:Lcom/facebook/i/a/a/a;

.field private final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/orca/notify/c;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "itself"
    .end annotation
.end field

.field private volatile q:J

.field private volatile r:Lcom/facebook/orca/threads/FolderCounts;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/orca/notify/av;

    sput-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/notify/as;Lcom/facebook/common/v/a;Ljava/util/Set;Lcom/facebook/common/executors/a;Lcom/facebook/auth/b/b;Ljava/lang/String;Lcom/facebook/analytics/cn;Ljavax/inject/a;Lcom/facebook/push/c2dm/y;Lcom/facebook/i/a/a/f;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/orca/notify/as;",
            "Lcom/facebook/common/v/a;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/orca/notify/am;",
            ">;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/facebook/auth/b/b;",
            "Ljava/lang/String;",
            "Lcom/facebook/analytics/cn;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/push/c2dm/y;",
            "Lcom/facebook/i/a/a/f;",
            ")V"
        }
    .end annotation

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    .line 101
    iput-object p1, p0, Lcom/facebook/orca/notify/av;->b:Landroid/content/Context;

    .line 102
    iput-object p2, p0, Lcom/facebook/orca/notify/av;->c:Lcom/facebook/orca/notify/as;

    .line 103
    iput-object p3, p0, Lcom/facebook/orca/notify/av;->d:Lcom/facebook/common/v/a;

    .line 104
    iput-object p4, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    .line 105
    iput-object p5, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    .line 106
    iput-object p6, p0, Lcom/facebook/orca/notify/av;->g:Lcom/facebook/auth/b/b;

    .line 107
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/facebook/orca/notify/av;->h:Landroid/os/Handler;

    .line 108
    iput-object p7, p0, Lcom/facebook/orca/notify/av;->i:Ljava/lang/String;

    .line 109
    iput-object p8, p0, Lcom/facebook/orca/notify/av;->j:Lcom/facebook/analytics/cn;

    .line 110
    iput-object p9, p0, Lcom/facebook/orca/notify/av;->k:Ljavax/inject/a;

    .line 111
    iput-object p10, p0, Lcom/facebook/orca/notify/av;->l:Lcom/facebook/push/c2dm/y;

    .line 112
    iput-object p11, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    .line 113
    new-instance v0, Lcom/facebook/orca/notify/aw;

    invoke-direct {v0, p0}, Lcom/facebook/orca/notify/aw;-><init>(Lcom/facebook/orca/notify/av;)V

    iput-object v0, p0, Lcom/facebook/orca/notify/av;->n:Lcom/facebook/i/a/a/a;

    .line 124
    new-instance v0, Lcom/facebook/orca/notify/az;

    invoke-direct {v0, p0}, Lcom/facebook/orca/notify/az;-><init>(Lcom/facebook/orca/notify/av;)V

    iput-object v0, p0, Lcom/facebook/orca/notify/av;->o:Lcom/facebook/i/a/a/a;

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    const-string v1, "peer://msg_notification_unread_count/clear_thread"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/notify/av;->n:Lcom/facebook/i/a/a/a;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V

    .line 137
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->p:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/orca/notify/av;->o:Lcom/facebook/i/a/a/a;

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Lcom/facebook/i/a/a/a;)V

    .line 142
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 143
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 145
    new-instance v1, Lcom/facebook/orca/notify/ba;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/orca/notify/ba;-><init>(Lcom/facebook/orca/notify/av;Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 155
    invoke-virtual {v1}, Lcom/facebook/base/broadcast/q;->a()V

    .line 156
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/notify/bh;
    .locals 10

    .prologue
    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 426
    sget-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Checking other FB apps to see how they handle notifications for thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 433
    :try_start_0
    new-instance v3, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v0, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v3, v0}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 434
    const-string v0, "userId"

    invoke-virtual {v3, v0, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 435
    const-string v0, "threadId"

    invoke-virtual {v3, v0, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 436
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/notify/av;->i:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v3}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 442
    if-eqz v3, :cond_4

    move v1, v7

    move v0, v7

    .line 444
    :goto_0
    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 446
    const/4 v2, 0x0

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getInt(I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-lez v2, :cond_0

    move v2, v6

    :goto_1
    or-int/2addr v2, v0

    .line 450
    :try_start_2
    invoke-interface {v3}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    const/4 v4, 0x2

    if-lt v0, v4, :cond_3

    .line 451
    const/4 v0, 0x1

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-result v0

    if-lez v0, :cond_1

    move v0, v6

    :goto_2
    or-int/2addr v1, v0

    move v0, v2

    goto :goto_0

    :cond_0
    move v2, v7

    .line 446
    goto :goto_1

    :cond_1
    move v0, v7

    .line 451
    goto :goto_2

    .line 455
    :cond_2
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move v7, v1

    .line 465
    :goto_3
    new-instance v1, Lcom/facebook/orca/notify/bh;

    invoke-direct {v1, v0, v7, v8}, Lcom/facebook/orca/notify/bh;-><init>(ZZLcom/facebook/orca/notify/aw;)V

    return-object v1

    .line 455
    :catchall_0
    move-exception v2

    move-object v9, v2

    move v2, v0

    move-object v0, v9

    :goto_4
    :try_start_4
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 458
    :catch_0
    move-exception v0

    move v7, v1

    move v0, v2

    .line 460
    :goto_5
    sget-object v1, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    const-string v2, "Caught security exception checking orca pref"

    invoke-static {v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_3

    .line 461
    :catch_1
    move-exception v0

    move-object v1, v0

    move v0, v7

    .line 463
    :goto_6
    sget-object v2, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    const-string v3, "Caught exception checking orca pref"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 461
    :catch_2
    move-exception v2

    move v7, v1

    move-object v1, v2

    goto :goto_6

    :catch_3
    move-exception v0

    move v7, v1

    move-object v1, v0

    move v0, v2

    goto :goto_6

    .line 458
    :catch_4
    move-exception v0

    move v0, v7

    goto :goto_5

    :catch_5
    move-exception v2

    move v7, v1

    goto :goto_5

    .line 455
    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_3
    move v0, v2

    goto :goto_0

    :cond_4
    move v0, v7

    goto :goto_3
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/notify/c;
    .locals 4

    .prologue
    .line 469
    iget-object v1, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    monitor-enter v1

    .line 470
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/c;

    .line 471
    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 472
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/c;

    .line 474
    :cond_0
    if-nez v0, :cond_1

    .line 475
    new-instance v0, Lcom/facebook/orca/notify/c;

    invoke-direct {v0}, Lcom/facebook/orca/notify/c;-><init>()V

    .line 477
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 479
    iget-object v2, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/facebook/orca/notify/c;->a(J)V

    .line 484
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/notify/c;->a(Z)V

    .line 485
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/notify/c;->b(Z)V

    .line 487
    monitor-exit v1

    return-object v0

    .line 488
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 233
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->j:Lcom/facebook/analytics/cn;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/facebook/push/g;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p3}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    return-void
.end method

.method private a(Lcom/facebook/orca/notify/ai;)V
    .locals 3

    .prologue
    .line 610
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 611
    invoke-interface {v0, p1}, Lcom/facebook/orca/notify/am;->a(Lcom/facebook/orca/notify/ai;)V

    goto :goto_0

    .line 613
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 614
    invoke-virtual {p1}, Lcom/facebook/orca/notify/ai;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 619
    :cond_1
    return-void

    .line 617
    :cond_2
    invoke-interface {v0, p1}, Lcom/facebook/orca/notify/am;->b(Lcom/facebook/orca/notify/ai;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->d()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/ai;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/ao;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->b(Lcom/facebook/orca/notify/ao;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/bi;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->b(Lcom/facebook/orca/notify/bi;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/w;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->b(Lcom/facebook/orca/notify/w;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/push/a;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->b(Lcom/facebook/orca/push/a;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/notify/av;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/notify/av;->b(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    return-void
.end method

.method private a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/push/g;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messaging_push_notif_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 245
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->j:Lcom/facebook/analytics/cn;

    move-object v2, p2

    move-object v3, p3

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    return-void
.end method

.method private b(Lcom/facebook/orca/notify/ao;)V
    .locals 0

    .prologue
    .line 414
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    .line 415
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/notify/av;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->g()V

    return-void
.end method

.method private b(Lcom/facebook/orca/notify/bi;)V
    .locals 0

    .prologue
    .line 410
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    .line 411
    return-void
.end method

.method private b(Lcom/facebook/orca/notify/w;)V
    .locals 3

    .prologue
    .line 357
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    .line 358
    const-string v1, "type"

    const/16 v2, 0x2714

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->f()Z

    move-result v1

    if-nez v1, :cond_0

    .line 361
    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->d()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "notifications_disabled"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    .line 377
    :goto_0
    return-void

    .line 367
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    .line 368
    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 369
    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->d()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "user_alerted_"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 373
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/notify/w;->d()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "user_not_alerted_"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/push/a;)V
    .locals 3

    .prologue
    .line 380
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 381
    const-string v1, "type"

    const/16 v2, 0x2713

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    iget-object v1, p0, Lcom/facebook/orca/notify/av;->g:Lcom/facebook/auth/b/b;

    invoke-interface {v1}, Lcom/facebook/auth/b/b;->b()Z

    move-result v1

    if-nez v1, :cond_0

    .line 384
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->e()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "logged_out_user"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    .line 407
    :goto_0
    return-void

    .line 390
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->f()Z

    move-result v1

    if-nez v1, :cond_1

    .line 391
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->e()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "notifications_disabled"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 397
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    .line 398
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 399
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->e()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "user_alerted_"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0

    .line 403
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/orca/push/a;->e()Lcom/facebook/push/g;

    move-result-object v1

    const-string v2, "user_not_alerted_"

    invoke-direct {p0, v1, v2, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/push/g;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method

.method private declared-synchronized b(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V
    .locals 7

    .prologue
    .line 253
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->l:Lcom/facebook/push/c2dm/y;

    invoke-virtual {v0}, Lcom/facebook/push/c2dm/y;->j()Ljava/lang/String;

    move-result-object v1

    .line 254
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    const-string v0, "no_user"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 258
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->g:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-nez v0, :cond_2

    .line 259
    const-string v0, "logged_out_user"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    .line 263
    sget-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    const-string v1, "Received notification while user logged out."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 253
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 267
    :cond_2
    :try_start_2
    sget-object v0, Lcom/facebook/push/g;->SMS:Lcom/facebook/push/g;

    if-ne p3, v0, :cond_3

    iget-object v0, p0, Lcom/facebook/orca/notify/av;->k:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->f()Z

    move-result v0

    if-nez v0, :cond_4

    .line 272
    const-string v0, "notifications_disabled"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    goto :goto_0

    .line 278
    :cond_4
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/av;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 279
    const-string v0, "notifications_disabled_thread"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    goto :goto_0

    .line 286
    :cond_5
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/notify/av;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/orca/notify/bh;

    move-result-object v0

    .line 289
    invoke-virtual {v0}, Lcom/facebook/orca/notify/bh;->a()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 290
    const-string v0, "thread_in_fg_elsewhere"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    .line 294
    sget-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    const-string v1, "Thread is in FG elsewhere, eating notification"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 298
    :cond_6
    invoke-virtual {v0}, Lcom/facebook/orca/notify/bh;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 299
    const-string v0, "displays_in_app_notification_elsewhere"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    .line 303
    sget-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    const-string v1, "In App notification will display elsewhere, eating notification"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 307
    :cond_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/orca/notify/av;->q:J

    .line 310
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->d:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->b()Z

    move-result v0

    if-nez v0, :cond_9

    .line 311
    sget-object v3, Lcom/facebook/orca/notify/aq;->NOT_IN_APP:Lcom/facebook/orca/notify/aq;

    .line 320
    :goto_1
    invoke-direct {p0, p2}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/notify/c;

    move-result-object v5

    .line 321
    invoke-virtual {v5}, Lcom/facebook/orca/notify/c;->n()Z

    move-result v6

    .line 322
    if-nez v6, :cond_8

    .line 323
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    invoke-static {v0, v1, v2}, Lcom/facebook/messages/ipc/peer/e;->b(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/i/a/a/f;)V

    .line 326
    :cond_8
    new-instance v0, Lcom/facebook/orca/notify/ap;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/notify/ap;-><init>(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/notify/aq;Lcom/facebook/push/g;Lcom/facebook/orca/notify/c;)V

    .line 333
    invoke-direct {p0, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ai;)V

    .line 336
    invoke-virtual {v5}, Lcom/facebook/orca/notify/c;->n()Z

    move-result v0

    .line 337
    if-eqz v0, :cond_c

    if-nez v6, :cond_c

    .line 338
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "user_alerted_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/facebook/orca/notify/aq;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    .line 353
    :goto_2
    invoke-direct {p0}, Lcom/facebook/orca/notify/av;->e()V

    goto/16 :goto_0

    .line 312
    :cond_9
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->d:Lcom/facebook/common/v/a;

    const-wide/16 v1, 0x2710

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/v/a;->a(J)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 313
    sget-object v3, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_10S:Lcom/facebook/orca/notify/aq;

    goto :goto_1

    .line 314
    :cond_a
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->d:Lcom/facebook/common/v/a;

    const-wide/16 v1, 0x7530

    invoke-virtual {v0, v1, v2}, Lcom/facebook/common/v/a;->a(J)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 315
    sget-object v3, Lcom/facebook/orca/notify/aq;->IN_APP_ACTIVE_30S:Lcom/facebook/orca/notify/aq;

    goto :goto_1

    .line 317
    :cond_b
    sget-object v3, Lcom/facebook/orca/notify/aq;->IN_APP_IDLE:Lcom/facebook/orca/notify/aq;

    goto :goto_1

    .line 342
    :cond_c
    if-nez v6, :cond_d

    .line 343
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "user_not_alerted_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/facebook/orca/notify/aq;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V

    goto :goto_2

    .line 348
    :cond_d
    const-string v0, "has_recent_message"

    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2
.end method

.method static synthetic c()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 52
    sget-object v0, Lcom/facebook/orca/notify/av;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 513
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/notify/as;->a(Ljava/lang/String;)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 514
    iget-object v1, p0, Lcom/facebook/orca/notify/av;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/as;->a(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 160
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 161
    sget-object v2, Lcom/facebook/orca/notify/aj;->LOGGED_OUT:Lcom/facebook/orca/notify/aj;

    invoke-interface {v0, v2}, Lcom/facebook/orca/notify/am;->a(Lcom/facebook/orca/notify/aj;)V

    goto :goto_0

    .line 163
    :cond_0
    return-void
.end method

.method private e()V
    .locals 9

    .prologue
    .line 492
    iget-object v1, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    monitor-enter v1

    .line 493
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    const/16 v2, 0x64

    if-ge v0, v2, :cond_0

    .line 494
    monitor-exit v1

    .line 505
    :goto_0
    return-void

    .line 496
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 498
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 499
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/c;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/c;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 500
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long v5, v2, v5

    const-wide/32 v7, 0x36ee80

    cmp-long v0, v5, v7

    if-lez v0, :cond_1

    .line 501
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 504
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method private f()Z
    .locals 2

    .prologue
    .line 508
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/as;->a()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 509
    iget-object v1, p0, Lcom/facebook/orca/notify/av;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/as;->a(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v0

    return v0
.end method

.method private g()V
    .locals 6

    .prologue
    .line 533
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->r:Lcom/facebook/orca/threads/FolderCounts;

    .line 534
    if-nez v0, :cond_1

    .line 556
    :cond_0
    :goto_0
    return-void

    .line 539
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/threads/FolderCounts;->b()I

    move-result v0

    if-nez v0, :cond_0

    .line 544
    iget-wide v0, p0, Lcom/facebook/orca/notify/av;->q:J

    const-wide/32 v2, 0x1d4c0

    add-long/2addr v0, v2

    .line 545
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 546
    cmp-long v4, v0, v2

    if-gtz v4, :cond_2

    .line 547
    invoke-virtual {p0}, Lcom/facebook/orca/notify/av;->b()V

    goto :goto_0

    .line 549
    :cond_2
    iget-object v4, p0, Lcom/facebook/orca/notify/av;->h:Landroid/os/Handler;

    new-instance v5, Lcom/facebook/orca/notify/ay;

    invoke-direct {v5, p0}, Lcom/facebook/orca/notify/ay;-><init>(Lcom/facebook/orca/notify/av;)V

    sub-long/2addr v0, v2

    invoke-virtual {v4, v5, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 575
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 576
    sget-object v2, Lcom/facebook/orca/notify/aj;->NEW_BUILD:Lcom/facebook/orca/notify/aj;

    invoke-interface {v0, v2}, Lcom/facebook/orca/notify/am;->a(Lcom/facebook/orca/notify/aj;)V

    goto :goto_0

    .line 578
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/orca/notify/ao;)V
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/bg;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/notify/bg;-><init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/ao;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 227
    return-void
.end method

.method public a(Lcom/facebook/orca/notify/bi;)V
    .locals 2

    .prologue
    .line 212
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/bf;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/notify/bf;-><init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/bi;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 218
    return-void
.end method

.method public a(Lcom/facebook/orca/notify/w;)V
    .locals 2

    .prologue
    .line 194
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/bd;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/notify/bd;-><init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/notify/w;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 200
    return-void
.end method

.method public a(Lcom/facebook/orca/push/a;)V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/be;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/notify/be;-><init>(Lcom/facebook/orca/notify/av;Lcom/facebook/orca/push/a;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 209
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/FolderCounts;)V
    .locals 2

    .prologue
    .line 521
    iput-object p1, p0, Lcom/facebook/orca/notify/av;->r:Lcom/facebook/orca/threads/FolderCounts;

    .line 524
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->h:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/notify/ax;

    invoke-direct {v1, p0}, Lcom/facebook/orca/notify/ax;-><init>(Lcom/facebook/orca/notify/av;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 530
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/bc;

    invoke-direct {v1, p0, p1}, Lcom/facebook/orca/notify/bc;-><init>(Lcom/facebook/orca/notify/av;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 191
    return-void
.end method

.method public a(Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V
    .locals 2

    .prologue
    .line 176
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/orca/notify/bb;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/facebook/orca/notify/bb;-><init>(Lcom/facebook/orca/notify/av;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/push/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->a(Ljava/lang/Runnable;)V

    .line 182
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 584
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 585
    invoke-interface {v0}, Lcom/facebook/orca/notify/am;->a()V

    goto :goto_0

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    invoke-static {v0}, Lcom/facebook/messages/ipc/peer/e;->a(Lcom/facebook/i/a/a/f;)V

    .line 588
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 564
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/am;

    .line 565
    invoke-interface {v0, p1}, Lcom/facebook/orca/notify/am;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 567
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/notify/av;->m:Lcom/facebook/i/a/a/f;

    invoke-static {p1, v0}, Lcom/facebook/messages/ipc/peer/e;->a(Ljava/lang/String;Lcom/facebook/i/a/a/f;)V

    .line 569
    return-void
.end method
