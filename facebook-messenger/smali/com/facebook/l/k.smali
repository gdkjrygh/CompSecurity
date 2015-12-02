.class public Lcom/facebook/l/k;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Lcom/facebook/base/c;


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

.field private static final b:Lcom/facebook/prefs/shared/ae;


# instance fields
.field private final c:Lcom/facebook/push/mqtt/v;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/google/common/d/a/u;

.field private final h:Ljava/util/concurrent/Executor;

.field private final i:Lcom/facebook/prefs/shared/d;

.field private final j:Landroid/support/v4/a/e;

.field private final k:Lcom/facebook/prefs/shared/f;

.field private final l:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final m:Lcom/google/common/a/iw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/iw",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/l/u;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "ui thread"
    .end annotation
.end field

.field private final n:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/l/v;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/l/w;",
            ">;"
        }
    .end annotation
.end field

.field private volatile p:Z

.field private final q:Lcom/facebook/base/broadcast/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const-class v0, Lcom/facebook/l/k;

    sput-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    .line 77
    const-string v0, "messenger_user_presence_active_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    sput-object v0, Lcom/facebook/l/k;->b:Lcom/facebook/prefs/shared/ae;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/common/executors/a;Lcom/google/common/d/a/u;Ljava/util/concurrent/Executor;Lcom/facebook/prefs/shared/d;Landroid/support/v4/a/e;Ljavax/inject/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/push/mqtt/v;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/e;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/common/executors/a;",
            "Lcom/google/common/d/a/u;",
            "Ljava/util/concurrent/Executor;",
            "Lcom/facebook/prefs/shared/d;",
            "Landroid/support/v4/a/e;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    invoke-interface {p5}, Lcom/facebook/common/executors/a;->a()V

    .line 141
    iput-object p2, p0, Lcom/facebook/l/k;->c:Lcom/facebook/push/mqtt/v;

    .line 142
    iput-object p3, p0, Lcom/facebook/l/k;->d:Ljavax/inject/a;

    .line 143
    iput-object p4, p0, Lcom/facebook/l/k;->e:Ljavax/inject/a;

    .line 144
    iput-object p5, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    .line 145
    iput-object p6, p0, Lcom/facebook/l/k;->g:Lcom/google/common/d/a/u;

    .line 146
    iput-object p7, p0, Lcom/facebook/l/k;->h:Ljava/util/concurrent/Executor;

    .line 147
    iput-object p8, p0, Lcom/facebook/l/k;->i:Lcom/facebook/prefs/shared/d;

    .line 148
    iput-object p9, p0, Lcom/facebook/l/k;->j:Landroid/support/v4/a/e;

    .line 149
    iput-object p10, p0, Lcom/facebook/l/k;->l:Ljavax/inject/a;

    .line 151
    invoke-static {}, Lcom/google/common/a/ef;->m()Lcom/google/common/a/ef;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    .line 152
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/l/k;->n:Ljava/util/concurrent/ConcurrentMap;

    .line 153
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    .line 155
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 156
    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 157
    const-string v1, "com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 158
    const-string v1, "com.facebook.orca.contacts.CONTACTS_UPLOAD_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 160
    new-instance v1, Lcom/facebook/l/l;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/l/l;-><init>(Lcom/facebook/l/k;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/l/k;->q:Lcom/facebook/base/broadcast/q;

    .line 184
    new-instance v0, Lcom/facebook/l/m;

    invoke-direct {v0, p0}, Lcom/facebook/l/m;-><init>(Lcom/facebook/l/k;)V

    iput-object v0, p0, Lcom/facebook/l/k;->k:Lcom/facebook/prefs/shared/f;

    .line 194
    iget-object v0, p0, Lcom/facebook/l/k;->k:Lcom/facebook/prefs/shared/f;

    invoke-interface {p8, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 195
    return-void
.end method

.method static synthetic a(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/l/k;->l()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/l/k;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/l/k;->b(Lcom/facebook/messages/model/threads/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/l/k;Lcom/facebook/user/UserKey;I)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/l/k;Ljava/util/Map;Z)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/facebook/l/k;->b(Ljava/util/Map;Z)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/l/k;Z)Z
    .locals 0

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/facebook/l/k;->p:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/l/k;->k()V

    return-void
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 562
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    const-string v1, "Message received: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 564
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    .line 565
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 566
    if-eqz v0, :cond_0

    iget-boolean v2, v0, Lcom/facebook/l/w;->a:Z

    if-eqz v2, :cond_0

    .line 567
    iput-boolean v3, v0, Lcom/facebook/l/w;->a:Z

    .line 568
    invoke-direct {p0, v1}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    .line 570
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/user/UserKey;I)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 488
    sget-object v2, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    const-string v3, "User typing state changed: %d"

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    invoke-direct {p0, p1}, Lcom/facebook/l/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/l/w;

    move-result-object v2

    .line 490
    if-ne p2, v0, :cond_0

    :goto_0
    iput-boolean v0, v2, Lcom/facebook/l/w;->a:Z

    .line 491
    invoke-direct {p0, p1}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    .line 492
    return-void

    :cond_0
    move v0, v1

    .line 490
    goto :goto_0
.end method

.method private b(Ljava/util/Map;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 516
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    const-string v1, "Presence map received"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 517
    if-eqz p2, :cond_0

    .line 518
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 519
    iput-boolean v2, v0, Lcom/facebook/l/w;->c:Z

    goto :goto_0

    .line 522
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 523
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/UserKey;

    invoke-direct {p0, v1}, Lcom/facebook/l/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/l/w;

    move-result-object v4

    .line 524
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_1

    const/4 v1, 0x1

    :goto_2
    iput-boolean v1, v4, Lcom/facebook/l/w;->c:Z

    .line 525
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    invoke-direct {p0, v0}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    goto :goto_1

    :cond_1
    move v1, v2

    .line 524
    goto :goto_2

    .line 528
    :cond_2
    invoke-direct {p0, p2}, Lcom/facebook/l/k;->c(Z)V

    .line 529
    return-void
.end method

.method private b(Z)V
    .locals 4

    .prologue
    .line 300
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "sendMusicPresenceNotification: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 302
    iget-object v0, p0, Lcom/facebook/l/k;->l:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/l/k;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 315
    :cond_0
    :goto_0
    return-void

    .line 307
    :cond_1
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 308
    if-eqz p1, :cond_2

    .line 309
    const-string v1, "lm"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Z)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 313
    :goto_1
    iget-object v1, p0, Lcom/facebook/l/k;->c:Lcom/facebook/push/mqtt/v;

    const-string v2, "/rich_presence"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    .line 314
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    const-string v1, "music presence sent!!!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 311
    :cond_2
    const-string v1, "lm"

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->putNull(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    goto :goto_1
.end method

.method private c(Lcom/facebook/user/UserKey;)Lcom/facebook/l/w;
    .locals 2

    .prologue
    .line 360
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 361
    if-nez v0, :cond_0

    .line 362
    new-instance v1, Lcom/facebook/l/w;

    const/4 v0, 0x0

    invoke-direct {v1, v0}, Lcom/facebook/l/w;-><init>(Lcom/facebook/l/l;)V

    .line 363
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 364
    if-nez v0, :cond_0

    move-object v0, v1

    .line 368
    :cond_0
    return-object v0
.end method

.method static synthetic c(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/l/k;->n()V

    return-void
.end method

.method private c(Z)V
    .locals 2

    .prologue
    .line 532
    if-eqz p1, :cond_0

    .line 533
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->h()Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 534
    invoke-direct {p0, v0}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    goto :goto_0

    .line 537
    :cond_0
    iget-object v0, p0, Lcom/facebook/l/k;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/v;

    .line 538
    invoke-virtual {v0}, Lcom/facebook/l/v;->a()V

    goto :goto_1

    .line 540
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/l/k;->o()V

    return-void
.end method

.method private d(Lcom/facebook/user/UserKey;)V
    .locals 3

    .prologue
    .line 379
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 380
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0, p1}, Lcom/google/common/a/iw;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    invoke-virtual {p0, p1}, Lcom/facebook/l/k;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/l/x;

    move-result-object v1

    .line 382
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0, p1}, Lcom/google/common/a/iw;->c(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/u;

    .line 383
    invoke-virtual {v0, p1, v1}, Lcom/facebook/l/u;->a(Lcom/facebook/user/UserKey;Lcom/facebook/l/x;)V

    goto :goto_0

    .line 386
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/facebook/l/k;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Lcom/facebook/l/k;->p()V

    return-void
.end method

.method static synthetic i()Lcom/facebook/prefs/shared/ae;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/l/k;->b:Lcom/facebook/prefs/shared/ae;

    return-object v0
.end method

.method static synthetic j()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 63
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private k()V
    .locals 2

    .prologue
    .line 198
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.orca.presence.PRESENCE_MANAGER_SETTINGS_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 199
    iget-object v1, p0, Lcom/facebook/l/k;->j:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 200
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/l/k;->c(Z)V

    .line 201
    return-void
.end method

.method private l()V
    .locals 1

    .prologue
    .line 204
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/l/k;->p:Z

    .line 205
    invoke-direct {p0}, Lcom/facebook/l/k;->m()V

    .line 206
    return-void
.end method

.method private m()V
    .locals 3

    .prologue
    .line 318
    iget-boolean v0, p0, Lcom/facebook/l/k;->p:Z

    if-eqz v0, :cond_0

    .line 341
    :goto_0
    return-void

    .line 321
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/l/k;->p:Z

    .line 322
    iget-object v0, p0, Lcom/facebook/l/k;->g:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/l/n;

    invoke-direct {v1, p0}, Lcom/facebook/l/n;-><init>(Lcom/facebook/l/k;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 329
    new-instance v1, Lcom/facebook/l/o;

    invoke-direct {v1, p0}, Lcom/facebook/l/o;-><init>(Lcom/facebook/l/k;)V

    iget-object v2, p0, Lcom/facebook/l/k;->h:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method

.method private n()V
    .locals 4

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->b()V

    .line 345
    iget-object v0, p0, Lcom/facebook/l/k;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/e;

    .line 346
    invoke-interface {v0}, Lcom/facebook/user/e;->a()V

    .line 349
    :goto_0
    :try_start_0
    invoke-interface {v0}, Lcom/facebook/user/e;->c()Lcom/facebook/user/User;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 350
    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    .line 351
    invoke-direct {p0, v2}, Lcom/facebook/l/k;->c(Lcom/facebook/user/UserKey;)Lcom/facebook/l/w;

    move-result-object v2

    .line 352
    invoke-virtual {v1}, Lcom/facebook/user/User;->x()Lcom/facebook/common/w/q;

    move-result-object v1

    sget-object v3, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    :goto_1
    iput-boolean v1, v2, Lcom/facebook/l/w;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 355
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    throw v1

    .line 352
    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    .line 355
    :cond_1
    invoke-interface {v0}, Lcom/facebook/user/e;->d()V

    .line 357
    return-void
.end method

.method private o()V
    .locals 2

    .prologue
    .line 372
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 373
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 374
    invoke-direct {p0, v0}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    goto :goto_0

    .line 376
    :cond_0
    return-void
.end method

.method private p()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 589
    sget-object v0, Lcom/facebook/l/k;->a:Ljava/lang/Class;

    const-string v1, "MQTT disconnected"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 590
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 591
    iput-boolean v2, v0, Lcom/facebook/l/w;->c:Z

    .line 592
    iput-boolean v2, v0, Lcom/facebook/l/w;->a:Z

    goto :goto_0

    .line 594
    :cond_0
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0}, Lcom/google/common/a/iw;->h()Lcom/google/common/a/jf;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/common/a/jf;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 595
    invoke-direct {p0, v0}, Lcom/facebook/l/k;->d(Lcom/facebook/user/UserKey;)V

    goto :goto_1

    .line 597
    :cond_1
    return-void
.end method

.method private q()Z
    .locals 1

    .prologue
    .line 637
    invoke-virtual {p0}, Lcom/facebook/l/k;->h()Lcom/facebook/l/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/l/j;->shouldShowPresence()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/l/k;->q:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 211
    return-void
.end method

.method public a(Lcom/facebook/l/v;)V
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lcom/facebook/l/k;->n:Ljava/util/concurrent/ConcurrentMap;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    invoke-direct {p0}, Lcom/facebook/l/k;->m()V

    .line 254
    return-void
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 2

    .prologue
    .line 548
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/l/r;

    invoke-direct {v1, p0, p1}, Lcom/facebook/l/r;-><init>(Lcom/facebook/l/k;Lcom/facebook/messages/model/threads/Message;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 554
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;I)V
    .locals 2

    .prologue
    .line 473
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/l/p;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/l/p;-><init>(Lcom/facebook/l/k;Lcom/facebook/user/UserKey;I)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 479
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;Lcom/facebook/l/u;)V
    .locals 1

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 228
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0, p1, p2}, Lcom/google/common/a/iw;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    invoke-direct {p0}, Lcom/facebook/l/k;->m()V

    .line 230
    return-void
.end method

.method public a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    .line 284
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 285
    iget-object v0, p0, Lcom/facebook/l/k;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    :goto_0
    return-void

    .line 288
    :cond_0
    new-instance v0, Lcom/fasterxml/jackson/databind/node/ObjectNode;

    sget-object v1, Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;->instance:Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;-><init>(Lcom/fasterxml/jackson/databind/node/JsonNodeFactory;)V

    .line 289
    const-string v1, "to"

    invoke-virtual {v0, v1, p1}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 290
    const-string v1, "state"

    invoke-virtual {v0, v1, p2}, Lcom/fasterxml/jackson/databind/node/ObjectNode;->put(Ljava/lang/String;I)Lcom/fasterxml/jackson/databind/node/ObjectNode;

    .line 291
    iget-object v1, p0, Lcom/facebook/l/k;->c:Lcom/facebook/push/mqtt/v;

    const-string v2, "/typing"

    sget-object v3, Lcom/facebook/mqtt/x;->FIRE_AND_FORGET:Lcom/facebook/mqtt/x;

    invoke-virtual {v1, v2, v0, v3}, Lcom/facebook/push/mqtt/v;->a(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/facebook/mqtt/x;)I

    goto :goto_0
.end method

.method public a(Ljava/util/Map;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 501
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/l/q;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/l/q;-><init>(Lcom/facebook/l/k;Ljava/util/Map;Z)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 507
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 214
    invoke-direct {p0, p1}, Lcom/facebook/l/k;->b(Z)V

    .line 215
    return-void
.end method

.method public a(Lcom/facebook/user/UserKey;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 395
    invoke-direct {p0}, Lcom/facebook/l/k;->q()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 402
    :goto_0
    return v0

    .line 398
    :cond_0
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 399
    if-nez v0, :cond_1

    move v0, v1

    .line 400
    goto :goto_0

    .line 402
    :cond_1
    iget-boolean v0, v0, Lcom/facebook/l/w;->c:Z

    goto :goto_0
.end method

.method public b(Lcom/facebook/user/UserKey;)Lcom/facebook/l/x;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 412
    invoke-direct {p0}, Lcom/facebook/l/k;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    new-instance v0, Lcom/facebook/l/x;

    sget-object v1, Lcom/facebook/l/a;->NONE:Lcom/facebook/l/a;

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/l/x;-><init>(Lcom/facebook/l/a;ZZ)V

    .line 426
    :goto_0
    return-object v0

    .line 416
    :cond_0
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/w;

    .line 417
    if-nez v0, :cond_1

    .line 418
    new-instance v0, Lcom/facebook/l/x;

    sget-object v1, Lcom/facebook/l/a;->NONE:Lcom/facebook/l/a;

    invoke-direct {v0, v1, v2, v2}, Lcom/facebook/l/x;-><init>(Lcom/facebook/l/a;ZZ)V

    goto :goto_0

    .line 421
    :cond_1
    iget-boolean v1, v0, Lcom/facebook/l/w;->c:Z

    if-eqz v1, :cond_2

    .line 422
    sget-object v1, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    .line 426
    :goto_1
    new-instance v2, Lcom/facebook/l/x;

    iget-boolean v3, v0, Lcom/facebook/l/w;->b:Z

    iget-boolean v0, v0, Lcom/facebook/l/w;->a:Z

    invoke-direct {v2, v1, v3, v0}, Lcom/facebook/l/x;-><init>(Lcom/facebook/l/a;ZZ)V

    move-object v0, v2

    goto :goto_0

    .line 424
    :cond_2
    sget-object v1, Lcom/facebook/l/a;->NONE:Lcom/facebook/l/a;

    goto :goto_1
.end method

.method public b(Lcom/facebook/l/v;)V
    .locals 1

    .prologue
    .line 262
    iget-object v0, p0, Lcom/facebook/l/k;->n:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    return-void
.end method

.method public b(Lcom/facebook/user/UserKey;Lcom/facebook/l/u;)V
    .locals 1

    .prologue
    .line 242
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 243
    iget-object v0, p0, Lcom/facebook/l/k;->m:Lcom/google/common/a/iw;

    invoke-interface {v0, p1, p2}, Lcom/google/common/a/iw;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 271
    iget-object v0, p0, Lcom/facebook/l/k;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 272
    const/4 v0, 0x0

    .line 274
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/l/k;->c:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v0}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v0

    goto :goto_0
.end method

.method public c()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 435
    invoke-direct {p0}, Lcom/facebook/l/k;->q()Z

    move-result v0

    if-nez v0, :cond_0

    .line 436
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 444
    :goto_0
    return-object v0

    .line 438
    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 439
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 440
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/l/w;

    iget-boolean v1, v1, Lcom/facebook/l/w;->c:Z

    if-eqz v1, :cond_1

    .line 441
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 444
    goto :goto_0
.end method

.method public d()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation

    .prologue
    .line 453
    iget-object v0, p0, Lcom/facebook/l/k;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 454
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 463
    :goto_0
    return-object v0

    .line 457
    :cond_0
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v2

    .line 458
    iget-object v0, p0, Lcom/facebook/l/k;->o:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 459
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/l/w;

    iget-boolean v1, v1, Lcom/facebook/l/w;->b:Z

    if-eqz v1, :cond_1

    .line 460
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 463
    goto :goto_0
.end method

.method public e()V
    .locals 2

    .prologue
    .line 576
    iget-object v0, p0, Lcom/facebook/l/k;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/l/s;

    invoke-direct {v1, p0}, Lcom/facebook/l/s;-><init>(Lcom/facebook/l/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 582
    return-void
.end method

.method public f()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 605
    iget-object v0, p0, Lcom/facebook/l/k;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/l/k;->i:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/l/k;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public g()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 616
    invoke-virtual {p0}, Lcom/facebook/l/k;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/l/k;->i:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/push/b/a;->a:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()Lcom/facebook/l/j;
    .locals 1

    .prologue
    .line 629
    invoke-virtual {p0}, Lcom/facebook/l/k;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 630
    invoke-virtual {p0}, Lcom/facebook/l/k;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/l/j;->ENABLED:Lcom/facebook/l/j;

    .line 633
    :goto_0
    return-object v0

    .line 630
    :cond_0
    sget-object v0, Lcom/facebook/l/j;->DISABLED:Lcom/facebook/l/j;

    goto :goto_0

    .line 633
    :cond_1
    sget-object v0, Lcom/facebook/l/j;->OFF:Lcom/facebook/l/j;

    goto :goto_0
.end method
