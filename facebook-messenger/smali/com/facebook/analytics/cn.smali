.class public Lcom/facebook/analytics/cn;
.super Ljava/lang/Object;
.source "ReliabilityAnalyticsLogger.java"


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final b:Ljava/lang/Class;


# instance fields
.field protected final a:Lcom/facebook/analytics/av;

.field private final c:Lcom/facebook/common/time/a;

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

.field private final e:Lcom/facebook/common/hardware/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/analytics/cn;

    sput-object v0, Lcom/facebook/analytics/cn;->b:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/analytics/av;Lcom/facebook/common/time/a;Ljavax/inject/a;Lcom/facebook/common/hardware/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/common/time/a;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/common/hardware/k;",
            ")V"
        }
    .end annotation

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/facebook/analytics/cn;->a:Lcom/facebook/analytics/av;

    .line 83
    iput-object p2, p0, Lcom/facebook/analytics/cn;->c:Lcom/facebook/common/time/a;

    .line 84
    iput-object p3, p0, Lcom/facebook/analytics/cn;->d:Ljavax/inject/a;

    .line 85
    iput-object p4, p0, Lcom/facebook/analytics/cn;->e:Lcom/facebook/common/hardware/k;

    .line 86
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 613
    iget-object v0, p0, Lcom/facebook/analytics/cn;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p3    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 532
    invoke-direct/range {p0 .. p5}, Lcom/facebook/analytics/cn;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 533
    iget-object v1, p0, Lcom/facebook/analytics/cn;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 534
    return-void
.end method

.method private c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;
    .locals 5
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/facebook/analytics/cb;"
        }
    .end annotation

    .prologue
    .line 552
    new-instance v2, Lcom/facebook/analytics/cb;

    invoke-static {p1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 554
    if-eqz p2, :cond_0

    .line 555
    const-string v0, "status"

    invoke-static {p2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 558
    :cond_0
    if-eqz p5, :cond_1

    .line 559
    invoke-virtual {v2, p5}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 561
    :cond_1
    if-eqz p4, :cond_2

    .line 562
    invoke-virtual {v2, p4}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 565
    :cond_2
    if-eqz p3, :cond_3

    .line 566
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 567
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    goto :goto_0

    .line 571
    :cond_3
    sget-object v0, Lcom/facebook/analytics/cn;->b:Ljava/lang/Class;

    const-string v1, "Reliability event. Category: %s, Status %s, Object Type %s, Object ID %s, Map:\n %s"

    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    const/4 v4, 0x2

    aput-object p4, v3, v4

    const/4 v4, 0x3

    aput-object p5, v3, v4

    const/4 v4, 0x4

    aput-object p3, v3, v4

    invoke-static {v0, v1, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    return-object v2
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 623
    array-length v0, p1

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 624
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Map must have an even (or zero) number of parameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 627
    :cond_0
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v2

    move v0, v1

    .line 628
    :goto_0
    array-length v3, p1

    if-ge v0, v3, :cond_3

    .line 629
    aget-object v3, p1, v0

    if-eqz v3, :cond_1

    add-int/lit8 v3, v0, 0x1

    aget-object v3, p1, v3

    if-nez v3, :cond_2

    .line 630
    :cond_1
    sget-object v3, Lcom/facebook/analytics/cn;->b:Ljava/lang/Class;

    const-string v4, "Reliability Logging parameter %d or %d is null"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    const/4 v6, 0x1

    add-int/lit8 v7, v0, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v3, v4, v5}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 632
    :cond_2
    aget-object v3, p1, v0

    invoke-static {v3}, Lcom/google/common/base/Strings;->nullToEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v4, v0, 0x1

    aget-object v4, p1, v4

    invoke-static {v4}, Lcom/google/common/base/Strings;->nullToEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 635
    :cond_3
    return-object v2
.end method

.method public a(Ljava/lang/String;JIIIZ)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 228
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "offline_threading_id"

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    const-string v3, "total_attachment_size"

    aput-object v3, v0, v1

    const/4 v1, 0x3

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    const-string v3, "photo_attachment_count"

    aput-object v3, v0, v1

    const/4 v1, 0x5

    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x6

    const-string v3, "audio_attachment_count"

    aput-object v3, v0, v1

    const/4 v1, 0x7

    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0x8

    const-string v3, "fbid_attachment_count"

    aput-object v3, v0, v1

    const/16 v1, 0x9

    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0xa

    const-string v3, "are_photo_attachments_pre_uploaded"

    aput-object v3, v0, v1

    const/16 v1, 0xb

    invoke-static {p7}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0xc

    const-string v3, "current_time"

    aput-object v3, v0, v1

    const/16 v1, 0xd

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 236
    invoke-virtual {p0, v3}, Lcom/facebook/analytics/cn;->a(Ljava/util/Map;)V

    .line 238
    const-string v1, "msg_send_attempted"

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    return-void
.end method

.method public a(Ljava/lang/String;JJJLjava/lang/Throwable;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 329
    invoke-virtual {p8}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    .line 331
    const-string v1, "create_thread"

    const-string v2, "failed"

    const/16 v0, 0x12

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v6, "offline_threading_id"

    aput-object v6, v5, v0

    const/4 v0, 0x1

    aput-object p1, v5, v0

    const/4 v0, 0x2

    const-string v6, "sent_timestamp_ms"

    aput-object v6, v5, v0

    const/4 v0, 0x3

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    const/4 v0, 0x4

    const-string v6, "send_time_delta"

    aput-object v6, v5, v0

    const/4 v0, 0x5

    invoke-static {p4, p5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    const/4 v0, 0x6

    const-string v6, "error_type"

    aput-object v6, v5, v0

    const/4 v0, 0x7

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    const/16 v0, 0x8

    const-string v6, "error_message"

    aput-object v6, v5, v0

    const/16 v0, 0x9

    invoke-virtual {p8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v0

    const/16 v0, 0xa

    const-string v6, "error_type_internal"

    aput-object v6, v5, v0

    const/16 v6, 0xb

    if-nez v3, :cond_0

    const-string v0, ""

    :goto_0
    aput-object v0, v5, v6

    const/16 v0, 0xc

    const-string v6, "error_message_internal"

    aput-object v6, v5, v0

    const/16 v6, 0xd

    if-nez v3, :cond_1

    const-string v0, ""

    :goto_1
    aput-object v0, v5, v6

    const/16 v0, 0xe

    const-string v3, "total_attachment_size"

    aput-object v3, v5, v0

    const/16 v0, 0xf

    invoke-static {p6, p7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v0

    const/16 v0, 0x10

    const-string v3, "current_time"

    aput-object v3, v5, v0

    const/16 v0, 0x11

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v0

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    return-void

    .line 331
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 123
    const-string v1, "msg_error_displayed"

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "send_error"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 138
    const-string v1, "msg_cant_send_via_mqtt"

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "reason"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    const/4 v3, 0x4

    const-string v4, "attempt_number"

    aput-object v4, v0, v3

    const/4 v3, 0x5

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJJ)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 298
    const-string v1, "create_thread"

    const-string v2, "success"

    const/16 v0, 0xc

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v5, "thread_id"

    aput-object v5, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v5, "offline_threading_id"

    aput-object v5, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    const/4 v3, 0x4

    const-string v5, "sent_timestamp_ms"

    aput-object v5, v0, v3

    const/4 v3, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    const/4 v3, 0x6

    const-string v5, "send_time_delta"

    aput-object v5, v0, v3

    const/4 v3, 0x7

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    const/16 v3, 0x8

    const-string v5, "total_attachment_size"

    aput-object v5, v0, v3

    const/16 v3, 0x9

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    const/16 v3, 0xa

    const-string v5, "current_time"

    aput-object v5, v0, v3

    const/16 v3, 0xb

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;I)V
    .locals 6

    .prologue
    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messaging_send_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 371
    const-string v2, "success"

    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "thread_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    const/4 v3, 0x4

    const-string v4, "sent_timestamp_ms"

    aput-object v4, v0, v3

    const/4 v3, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "send_time_delta"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "total_attachment_size"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "current_time"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "attempt_number"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ILjava/lang/String;I)V
    .locals 6

    .prologue
    .line 411
    const-string v1, "messaging_send_via_mqtt"

    .line 413
    const-string v2, "failed"

    const/16 v0, 0x14

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "thread_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    const/4 v3, 0x4

    const-string v4, "sent_timestamp_ms"

    aput-object v4, v0, v3

    const/4 v3, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "send_time_delta"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "error_message"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    aput-object p9, v0, v3

    const/16 v3, 0xa

    const-string v4, "error_number"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "mqtt_push_state"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    aput-object p11, v0, v3

    const/16 v3, 0xe

    const-string v4, "total_attachment_size"

    aput-object v4, v0, v3

    const/16 v3, 0xf

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x10

    const-string v4, "current_time"

    aput-object v4, v0, v3

    const/16 v3, 0x11

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x12

    const-string v4, "attempt_number"

    aput-object v4, v0, v3

    const/16 v3, 0x13

    invoke-static/range {p12 .. p12}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Throwable;Ljava/lang/String;I)V
    .locals 7

    .prologue
    .line 454
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "messaging_send_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p10

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 455
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    .line 457
    const-string v3, "failed"

    const/16 v1, 0x16

    new-array v5, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v6, "thread_id"

    aput-object v6, v5, v1

    const/4 v1, 0x1

    aput-object p1, v5, v1

    const/4 v1, 0x2

    const-string v6, "offline_threading_id"

    aput-object v6, v5, v1

    const/4 v1, 0x3

    aput-object p2, v5, v1

    const/4 v1, 0x4

    const-string v6, "sent_timestamp_ms"

    aput-object v6, v5, v1

    const/4 v1, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/4 v1, 0x6

    const-string v6, "send_time_delta"

    aput-object v6, v5, v1

    const/4 v1, 0x7

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/16 v1, 0x8

    const-string v6, "error_type"

    aput-object v6, v5, v1

    const/16 v1, 0x9

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/16 v1, 0xa

    const-string v6, "error_message"

    aput-object v6, v5, v1

    const/16 v1, 0xb

    invoke-virtual/range {p9 .. p9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v1

    const/16 v1, 0xc

    const-string v6, "error_type_internal"

    aput-object v6, v5, v1

    const/16 v6, 0xd

    if-nez v4, :cond_0

    const-string v1, ""

    :goto_0
    aput-object v1, v5, v6

    const/16 v1, 0xe

    const-string v6, "error_message_internal"

    aput-object v6, v5, v1

    const/16 v6, 0xf

    if-nez v4, :cond_1

    const-string v1, ""

    :goto_1
    aput-object v1, v5, v6

    const/16 v1, 0x10

    const-string v4, "total_attachment_size"

    aput-object v4, v5, v1

    const/16 v1, 0x11

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v1

    const/16 v1, 0x12

    const-string v4, "current_time"

    aput-object v4, v5, v1

    const/16 v1, 0x13

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v1

    const/16 v1, 0x14

    const-string v4, "attempt_number"

    aput-object v4, v5, v1

    const/16 v1, 0x15

    invoke-static/range {p11 .. p11}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v5, v1

    invoke-virtual {p0, v5}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    return-void

    .line 457
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    goto :goto_1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 177
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messaging_push_notif_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 178
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "thread_id"

    aput-object v3, v0, v2

    const/4 v2, 0x1

    aput-object p2, v0, v2

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "message_id"

    move-object v0, p0

    move-object v2, p4

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/analytics/cn;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-direct/range {p0 .. p5}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :goto_0
    return-void

    .line 108
    :cond_0
    invoke-direct/range {p0 .. p5}, Lcom/facebook/analytics/cn;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 114
    iget-object v1, p0, Lcom/facebook/analytics/cn;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method protected a(Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 586
    .line 590
    iget-object v1, p0, Lcom/facebook/analytics/cn;->e:Lcom/facebook/common/hardware/k;

    invoke-virtual {v1}, Lcom/facebook/common/hardware/k;->c()Landroid/net/NetworkInfo;

    move-result-object v1

    .line 591
    if-eqz v1, :cond_0

    .line 592
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v2

    .line 593
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    .line 594
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v1

    .line 597
    :goto_0
    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 598
    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 599
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 600
    iget-object v3, p0, Lcom/facebook/analytics/cn;->e:Lcom/facebook/common/hardware/k;

    invoke-virtual {v3}, Lcom/facebook/common/hardware/k;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    .line 602
    const-string v4, "network_is_connected"

    iget-object v5, p0, Lcom/facebook/analytics/cn;->e:Lcom/facebook/common/hardware/k;

    invoke-virtual {v5}, Lcom/facebook/common/hardware/k;->b()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    const-string v4, "network_type"

    invoke-interface {p1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    const-string v2, "network_subtype"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    const-string v1, "network_extra_info"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    const-string v0, "network_wifi_rssi"

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    return-void

    :cond_0
    move-object v1, v0

    move-object v2, v0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;JIIIZ)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 264
    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "offline_threading_id"

    aput-object v3, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const/4 v1, 0x2

    const-string v3, "total_attachment_size"

    aput-object v3, v0, v1

    const/4 v1, 0x3

    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x4

    const-string v3, "photo_attachment_count"

    aput-object v3, v0, v1

    const/4 v1, 0x5

    invoke-static {p4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/4 v1, 0x6

    const-string v3, "audio_attachment_count"

    aput-object v3, v0, v1

    const/4 v1, 0x7

    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0x8

    const-string v3, "fbid_attachment_count"

    aput-object v3, v0, v1

    const/16 v1, 0x9

    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0xa

    const-string v3, "are_photo_attachments_pre_uploaded"

    aput-object v3, v0, v1

    const/16 v1, 0xb

    invoke-static {p7}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    const/16 v1, 0xc

    const-string v3, "current_time"

    aput-object v3, v0, v1

    const/16 v1, 0xd

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v1

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 272
    invoke-virtual {p0, v3}, Lcom/facebook/analytics/cn;->a(Ljava/util/Map;)V

    .line 274
    const-string v1, "msg_create_thread_attempted"

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 155
    const-string v1, "msg_error_retry_selected"

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "send_error"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messaging_push_notif_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 201
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "total_deleted"

    aput-object v3, v0, v2

    const/4 v2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object v0, p0

    move-object v2, p2

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;I)V
    .locals 6

    .prologue
    .line 497
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messaging_send_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 499
    const-string v2, "skipped"

    const/16 v0, 0xe

    new-array v0, v0, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "thread_id"

    aput-object v4, v0, v3

    const/4 v3, 0x1

    aput-object p1, v0, v3

    const/4 v3, 0x2

    const-string v4, "offline_threading_id"

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object p2, v0, v3

    const/4 v3, 0x4

    const-string v4, "sent_timestamp_ms"

    aput-object v4, v0, v3

    const/4 v3, 0x5

    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "send_time_delta"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    invoke-static {p5, p6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "total_attachment_size"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    invoke-static {p7, p8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "current_time"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    invoke-direct {p0}, Lcom/facebook/analytics/cn;->a()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "attempt_number"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v0, v3

    invoke-virtual {p0, v0}, Lcom/facebook/analytics/cn;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    return-void
.end method
