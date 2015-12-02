.class public Lcom/facebook/orca/fbwebrtc/ag;
.super Ljava/lang/Object;
.source "WebrtcManager.java"

# interfaces
.implements Lcom/facebook/base/c;


# annotations
.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
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
.field private final b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/orca/fbwebrtc/f;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
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

.field private final f:Landroid/telephony/TelephonyManager;

.field private final g:Landroid/support/v4/a/e;

.field private final h:Ljava/util/concurrent/ScheduledExecutorService;

.field private final i:Lcom/facebook/breakpad/BreakpadManager;

.field private final j:Lcom/facebook/push/mqtt/v;

.field private final k:Lcom/facebook/orca/fbwebrtc/az;

.field private final l:Lcom/facebook/orca/fbwebrtc/bb;

.field private final m:Lcom/facebook/orca/fbwebrtc/n;

.field private final n:Lcom/facebook/orca/fbwebrtc/ae;

.field private final o:Lcom/facebook/e/c;

.field private final p:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private volatile q:Lcom/facebook/webrtc/WebrtcEngine;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const-class v0, Lcom/facebook/orca/fbwebrtc/ag;

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/telephony/TelephonyManager;Landroid/support/v4/a/e;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/breakpad/BreakpadManager;Lcom/facebook/push/mqtt/v;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/fbwebrtc/az;Lcom/facebook/orca/fbwebrtc/bb;Lcom/facebook/orca/fbwebrtc/n;Lcom/facebook/orca/fbwebrtc/ae;Lcom/facebook/e/c;Lcom/fasterxml/jackson/databind/ObjectMapper;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/telephony/TelephonyManager;",
            "Landroid/support/v4/a/e;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Lcom/facebook/breakpad/BreakpadManager;",
            "Lcom/facebook/push/mqtt/v;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/orca/fbwebrtc/az;",
            "Lcom/facebook/orca/fbwebrtc/bb;",
            "Lcom/facebook/orca/fbwebrtc/n;",
            "Lcom/facebook/orca/fbwebrtc/ae;",
            "Lcom/facebook/e/c;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            ")V"
        }
    .end annotation

    .prologue
    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/ag;->f:Landroid/telephony/TelephonyManager;

    .line 168
    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/ag;->g:Landroid/support/v4/a/e;

    .line 169
    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/ag;->h:Ljava/util/concurrent/ScheduledExecutorService;

    .line 170
    iput-object p4, p0, Lcom/facebook/orca/fbwebrtc/ag;->i:Lcom/facebook/breakpad/BreakpadManager;

    .line 171
    iput-object p5, p0, Lcom/facebook/orca/fbwebrtc/ag;->j:Lcom/facebook/push/mqtt/v;

    .line 172
    iput-object p6, p0, Lcom/facebook/orca/fbwebrtc/ag;->d:Ljavax/inject/a;

    .line 173
    iput-object p7, p0, Lcom/facebook/orca/fbwebrtc/ag;->e:Ljavax/inject/a;

    .line 174
    iput-object p8, p0, Lcom/facebook/orca/fbwebrtc/ag;->k:Lcom/facebook/orca/fbwebrtc/az;

    .line 175
    iput-object p9, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    .line 176
    iput-object p10, p0, Lcom/facebook/orca/fbwebrtc/ag;->m:Lcom/facebook/orca/fbwebrtc/n;

    .line 177
    iput-object p11, p0, Lcom/facebook/orca/fbwebrtc/ag;->n:Lcom/facebook/orca/fbwebrtc/ae;

    .line 178
    iput-object p12, p0, Lcom/facebook/orca/fbwebrtc/ag;->o:Lcom/facebook/e/c;

    .line 179
    iput-object p13, p0, Lcom/facebook/orca/fbwebrtc/ag;->p:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 181
    invoke-static {}, Lcom/google/common/a/hq;->b()Ljava/util/LinkedList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    .line 182
    new-instance v0, Lcom/facebook/orca/fbwebrtc/f;

    invoke-direct {v0}, Lcom/facebook/orca/fbwebrtc/f;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->c:Lcom/facebook/orca/fbwebrtc/f;

    .line 184
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->k:Lcom/facebook/orca/fbwebrtc/az;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/fbwebrtc/az;->a(Lcom/facebook/orca/fbwebrtc/ag;)V

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/fbwebrtc/bb;->a(Lcom/facebook/orca/fbwebrtc/ag;)V

    .line 186
    return-void
.end method

.method private a(JLjava/lang/String;Z)V
    .locals 18

    .prologue
    .line 286
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v2

    if-nez v2, :cond_0

    .line 360
    :goto_0
    return-void

    .line 292
    :cond_0
    :try_start_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/fbwebrtc/ag;->p:Lcom/fasterxml/jackson/databind/ObjectMapper;

    move-object/from16 v0, p3

    invoke-virtual {v2, v0}, Lcom/fasterxml/jackson/databind/ObjectMapper;->readTree(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 297
    const-string v3, "type"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v10

    .line 298
    const-string v3, "call_id"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v5

    .line 299
    const-string v3, "msg_id"

    invoke-virtual {v2, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v7

    .line 300
    new-instance v2, Lcom/facebook/orca/fbwebrtc/g;

    move-wide/from16 v3, p1

    move-object/from16 v9, p3

    invoke-direct/range {v2 .. v9}, Lcom/facebook/orca/fbwebrtc/g;-><init>(JJJLjava/lang/String;)V

    .line 301
    const-string v3, "offer"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    .line 302
    const-string v3, "hang_up"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "other_dismiss"

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const/4 v3, 0x1

    move/from16 v16, v3

    .line 304
    :goto_1
    if-eqz v17, :cond_6

    move-object/from16 v9, p0

    move-wide/from16 v10, p1

    move-wide v12, v5

    move-wide v14, v7

    .line 306
    invoke-direct/range {v9 .. v15}, Lcom/facebook/orca/fbwebrtc/ag;->a(JJJ)Z

    move-result v12

    .line 307
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->j:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v3}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v13

    .line 308
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->o:Lcom/facebook/e/c;

    invoke-virtual {v3}, Lcom/facebook/e/c;->b()Z

    move-result v14

    .line 309
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/orca/fbwebrtc/ag;->n:Lcom/facebook/orca/fbwebrtc/ae;

    if-eqz p4, :cond_3

    const-string v11, "gcm"

    :goto_2
    move-wide/from16 v9, p1

    invoke-virtual/range {v4 .. v14}, Lcom/facebook/orca/fbwebrtc/ae;->a(JJJLjava/lang/String;ZZZ)V

    .line 317
    if-eqz v12, :cond_4

    .line 318
    sget-object v2, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v3, "duplicate message from peer %d: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p3, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 293
    :catch_0
    move-exception v2

    .line 294
    sget-object v3, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v4, "Failed to parse peer message"

    invoke-static {v3, v4, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 302
    :cond_2
    const/4 v3, 0x0

    move/from16 v16, v3

    goto :goto_1

    .line 309
    :cond_3
    const-string v11, "mqtt"

    goto :goto_2

    .line 322
    :cond_4
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->e:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    if-nez v14, :cond_5

    .line 323
    sget-object v2, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v3, "incoming call ignored because voip is only allowed on wifi network."

    invoke-static {v2, v3}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 327
    :cond_5
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v3}, Lcom/facebook/orca/fbwebrtc/bb;->j()V

    .line 329
    if-nez v13, :cond_6

    .line 330
    sget-object v3, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v4, "mqtt is not connected"

    invoke-static {v3, v4}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 334
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/ag;->l()V

    .line 338
    :cond_6
    if-eqz v16, :cond_7

    .line 340
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->c:Lcom/facebook/orca/fbwebrtc/f;

    move-wide/from16 v0, p1

    invoke-virtual {v3, v0, v1, v5, v6}, Lcom/facebook/orca/fbwebrtc/f;->a(JJ)V

    .line 343
    :cond_7
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->j:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v3}, Lcom/facebook/push/mqtt/v;->d()Z

    move-result v3

    if-nez v3, :cond_8

    if-eqz v16, :cond_9

    .line 344
    :cond_8
    invoke-direct/range {p0 .. p0}, Lcom/facebook/orca/fbwebrtc/ag;->k()V

    .line 345
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/orca/fbwebrtc/g;)V

    goto/16 :goto_0

    .line 346
    :cond_9
    if-eqz v17, :cond_a

    .line 347
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->c:Lcom/facebook/orca/fbwebrtc/f;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/fbwebrtc/f;->a(Lcom/facebook/orca/fbwebrtc/g;)V

    .line 348
    sget-object v2, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v3, "delaying offer message from peer: %d: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p3, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/fbwebrtc/ag;->h:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, Lcom/facebook/orca/fbwebrtc/ah;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lcom/facebook/orca/fbwebrtc/ah;-><init>(Lcom/facebook/orca/fbwebrtc/ag;)V

    const-wide/16 v4, 0x7d0

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto/16 :goto_0

    .line 355
    :cond_a
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/fbwebrtc/ag;->c:Lcom/facebook/orca/fbwebrtc/f;

    invoke-virtual {v3, v2}, Lcom/facebook/orca/fbwebrtc/f;->b(Lcom/facebook/orca/fbwebrtc/g;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 356
    sget-object v2, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v3, "delaying other message from peer: %d: %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object p3, v4, v5

    invoke-static {v2, v3, v4}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 358
    :cond_b
    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/facebook/orca/fbwebrtc/ag;->a(Lcom/facebook/orca/fbwebrtc/g;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/fbwebrtc/ag;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->k()V

    return-void
.end method

.method private a(Lcom/facebook/orca/fbwebrtc/g;)V
    .locals 6

    .prologue
    .line 394
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v1, "message from peer %d: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p1, Lcom/facebook/orca/fbwebrtc/g;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p1, Lcom/facebook/orca/fbwebrtc/g;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 395
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    iget-wide v1, p1, Lcom/facebook/orca/fbwebrtc/g;->a:J

    iget-object v3, p1, Lcom/facebook/orca/fbwebrtc/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/webrtc/WebrtcEngine;->a(JLjava/lang/String;)V

    .line 396
    return-void
.end method

.method private a(JJJ)Z
    .locals 4

    .prologue
    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p5, p6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 366
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    monitor-enter v1

    .line 367
    :try_start_0
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    invoke-interface {v2, v0}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 368
    const/4 v0, 0x1

    monitor-exit v1

    .line 375
    :goto_0
    return v0

    .line 370
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->size()I

    move-result v2

    const/16 v3, 0xa

    if-lt v2, v3, :cond_1

    .line 371
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 373
    :cond_1
    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ag;->b:Ljava/util/Queue;

    invoke-interface {v2, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 374
    monitor-exit v1

    .line 375
    const/4 v0, 0x0

    goto :goto_0

    .line 374
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private j()Z
    .locals 5

    .prologue
    .line 234
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ag;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 235
    const/4 v0, 0x0

    .line 246
    :goto_0
    return v0

    .line 237
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    if-nez v0, :cond_2

    .line 238
    monitor-enter p0

    .line 239
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    if-nez v0, :cond_1

    .line 240
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v1, "webrtc is initializing"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 241
    new-instance v0, Lcom/facebook/webrtc/WebrtcEngine;

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ag;->k:Lcom/facebook/orca/fbwebrtc/az;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    iget-object v3, p0, Lcom/facebook/orca/fbwebrtc/ag;->m:Lcom/facebook/orca/fbwebrtc/n;

    iget-object v4, p0, Lcom/facebook/orca/fbwebrtc/ag;->n:Lcom/facebook/orca/fbwebrtc/ae;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/webrtc/WebrtcEngine;-><init>(Lcom/facebook/webrtc/IWebrtcSignalingMessageInterface;Lcom/facebook/webrtc/IWebrtcUiInterface;Lcom/facebook/webrtc/IWebrtcConfigInterface;Lcom/facebook/webrtc/IWebrtcLoggingInterface;)V

    iput-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    .line 242
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v1, "webrtc is initialized"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 244
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 246
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0}, Lcom/facebook/webrtc/WebrtcEngine;->a()Z

    move-result v0

    goto :goto_0

    .line 244
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private k()V
    .locals 11

    .prologue
    const/4 v1, 0x0

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->c:Lcom/facebook/orca/fbwebrtc/f;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/f;->a()[Lcom/facebook/orca/fbwebrtc/g;

    move-result-object v2

    .line 383
    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 384
    sget-object v5, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v6, "process pending message from peer: %d: callId=%d, msgId=%s"

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    iget-wide v8, v4, Lcom/facebook/orca/fbwebrtc/g;->a:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v7, v1

    const/4 v8, 0x1

    iget-wide v9, v4, Lcom/facebook/orca/fbwebrtc/g;->b:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x2

    iget-wide v9, v4, Lcom/facebook/orca/fbwebrtc/g;->c:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v5, v6, v7}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    iget-object v5, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    iget-wide v6, v4, Lcom/facebook/orca/fbwebrtc/g;->a:J

    iget-object v4, v4, Lcom/facebook/orca/fbwebrtc/g;->d:Ljava/lang/String;

    invoke-virtual {v5, v6, v7, v4}, Lcom/facebook/webrtc/WebrtcEngine;->a(JLjava/lang/String;)V

    .line 383
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 388
    :cond_0
    return-void
.end method

.method private l()V
    .locals 2

    .prologue
    .line 399
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 400
    sget-object v1, Lcom/facebook/push/mqtt/ca;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 401
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ag;->g:Landroid/support/v4/a/e;

    invoke-virtual {v1, v0}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 402
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->i:Lcom/facebook/breakpad/BreakpadManager;

    invoke-virtual {v0}, Lcom/facebook/breakpad/BreakpadManager;->a()V

    .line 191
    return-void
.end method

.method public a(J)V
    .locals 2

    .prologue
    .line 451
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 456
    :goto_0
    return-void

    .line 454
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lcom/facebook/orca/fbwebrtc/bb;->a(JZ)V

    .line 455
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/webrtc/WebrtcEngine;->a(J)V

    goto :goto_0
.end method

.method public a(JLjava/lang/String;)V
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;Z)V

    .line 283
    return-void
.end method

.method public a(JLjava/lang/String;ILjava/lang/String;)V
    .locals 6

    .prologue
    .line 435
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 443
    :goto_0
    return-void

    .line 438
    :cond_0
    if-nez p4, :cond_1

    .line 439
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/webrtc/WebrtcEngine;->b(J)V

    goto :goto_0

    .line 441
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    move-wide v1, p1

    move v3, p4

    move-object v4, p5

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/webrtc/WebrtcEngine;->a(JILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Lcom/facebook/webrtc/a;)V
    .locals 2

    .prologue
    .line 496
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 502
    :goto_0
    return-void

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {p1}, Lcom/facebook/webrtc/a;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/facebook/webrtc/WebrtcEngine;->a(I)V

    goto :goto_0
.end method

.method public a(Lcom/fasterxml/jackson/databind/JsonNode;)V
    .locals 5

    .prologue
    .line 411
    const-string v0, "payload"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/e;->b(Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;

    move-result-object v0

    .line 412
    if-nez v0, :cond_0

    .line 413
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v1, "No valid \'payload\' in Webrtc offer from native push."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 424
    :goto_0
    return-void

    .line 417
    :cond_0
    const-string v1, "uid"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/e;->c(Lcom/fasterxml/jackson/databind/JsonNode;)J

    move-result-wide v1

    .line 418
    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_1

    .line 419
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ag;->a:Ljava/lang/Class;

    const-string v1, "No valid \'uid\' in Webrtc offer from native push."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 423
    :cond_1
    const/4 v3, 0x1

    invoke-direct {p0, v1, v2, v0, v3}, Lcom/facebook/orca/fbwebrtc/ag;->a(JLjava/lang/String;Z)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 484
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 488
    :goto_0
    return-void

    .line 487
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0, p1}, Lcom/facebook/webrtc/WebrtcEngine;->a(Z)V

    goto :goto_0
.end method

.method public b()I
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    if-nez v0, :cond_0

    .line 198
    const/4 v0, 0x0

    .line 200
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->c()I

    move-result v0

    goto :goto_0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 207
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->a()J

    move-result-wide v0

    .line 210
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 217
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/facebook/orca/fbwebrtc/ag;->b()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->f:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 260
    .line 261
    monitor-enter p0

    .line 262
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    if-eqz v1, :cond_0

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    .line 264
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    .line 266
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    if-eqz v0, :cond_1

    .line 269
    invoke-virtual {v0}, Lcom/facebook/webrtc/WebrtcEngine;->b()V

    .line 272
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->l:Lcom/facebook/orca/fbwebrtc/bb;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/bb;->k()V

    .line 273
    return-void

    .line 266
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public h()V
    .locals 1

    .prologue
    .line 462
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 466
    :goto_0
    return-void

    .line 465
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0}, Lcom/facebook/webrtc/WebrtcEngine;->c()V

    goto :goto_0
.end method

.method public i()V
    .locals 1

    .prologue
    .line 472
    invoke-direct {p0}, Lcom/facebook/orca/fbwebrtc/ag;->j()Z

    move-result v0

    if-nez v0, :cond_0

    .line 476
    :goto_0
    return-void

    .line 475
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/ag;->q:Lcom/facebook/webrtc/WebrtcEngine;

    invoke-virtual {v0}, Lcom/facebook/webrtc/WebrtcEngine;->d()V

    goto :goto_0
.end method
