.class public Lcom/facebook/orca/sms/y;
.super Ljava/lang/Object;
.source "MmsSmsContentResolverHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static k:[Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/orca/sms/bn;

.field private final d:Lcom/facebook/orca/sms/r;

.field private final e:Lcom/facebook/orca/sms/a;

.field private final f:Lcom/facebook/orca/sms/bk;

.field private final g:Lcom/facebook/prefs/shared/d;

.field private final h:Lcom/facebook/orca/threads/r;

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 57
    const-class v0, Lcom/facebook/orca/sms/y;

    sput-object v0, Lcom/facebook/orca/sms/y;->a:Ljava/lang/Class;

    .line 607
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "COUNT(*) AS num_threads"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "SUM(read) AS read_count"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "MAX(date) AS latest_message_time"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/sms/y;->k:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/r;Lcom/facebook/orca/sms/a;Lcom/facebook/orca/sms/bk;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/threads/r;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/orca/sms/bn;",
            "Lcom/facebook/orca/sms/r;",
            "Lcom/facebook/orca/sms/a;",
            "Lcom/facebook/orca/sms/bk;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/orca/threads/r;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    .line 80
    iput-object p2, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    .line 81
    iput-object p3, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    .line 82
    iput-object p4, p0, Lcom/facebook/orca/sms/y;->e:Lcom/facebook/orca/sms/a;

    .line 83
    iput-object p5, p0, Lcom/facebook/orca/sms/y;->f:Lcom/facebook/orca/sms/bk;

    .line 84
    iput-object p6, p0, Lcom/facebook/orca/sms/y;->g:Lcom/facebook/prefs/shared/d;

    .line 85
    iput-object p7, p0, Lcom/facebook/orca/sms/y;->h:Lcom/facebook/orca/threads/r;

    .line 86
    iput-object p8, p0, Lcom/facebook/orca/sms/y;->i:Ljavax/inject/a;

    .line 87
    iput-object p9, p0, Lcom/facebook/orca/sms/y;->j:Ljavax/inject/a;

    .line 88
    return-void
.end method

.method private varargs a(I[Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    .line 517
    array-length v0, p2

    if-nez v0, :cond_0

    .line 518
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 554
    :goto_0
    return-object v0

    .line 521
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 522
    const/4 v2, 0x0

    .line 523
    const/4 v1, 0x0

    .line 524
    array-length v0, p2

    new-array v7, v0, [I

    .line 525
    const/4 v0, 0x0

    :goto_1
    array-length v3, p2

    if-ge v0, v3, :cond_7

    .line 526
    aget-object v3, p2, v0

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v3

    add-int/2addr v1, v3

    .line 527
    const/4 v3, 0x0

    aput v3, v7, v0

    .line 525
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 548
    :cond_1
    invoke-virtual {v6, v4}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 550
    add-int/lit8 v0, v5, 0x1

    .line 551
    aget v3, v7, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v7, v2

    move v5, v0

    .line 530
    :goto_2
    if-lt v5, p1, :cond_2

    const/4 v0, -0x1

    if-ne p1, v0, :cond_5

    :cond_2
    if-ge v5, v1, :cond_5

    .line 533
    const/4 v4, 0x0

    .line 534
    const/4 v2, -0x1

    .line 535
    const/4 v3, 0x0

    :goto_3
    array-length v0, p2

    if-ge v3, v0, :cond_1

    .line 537
    aget v0, v7, v3

    aget-object v8, p2, v3

    invoke-virtual {v8}, Lcom/google/common/a/es;->size()I

    move-result v8

    if-ge v0, v8, :cond_4

    aget-object v0, p2, v3

    aget v8, v7, v3

    invoke-virtual {v0, v8}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 542
    :goto_4
    if-eqz v4, :cond_3

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v8

    invoke-virtual {v4}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v10

    cmp-long v8, v8, v10

    if-lez v8, :cond_6

    :cond_3
    move-object v2, v0

    move v0, v3

    .line 535
    :goto_5
    add-int/lit8 v3, v3, 0x1

    move-object v4, v2

    move v2, v0

    goto :goto_3

    .line 537
    :cond_4
    const/4 v0, 0x0

    goto :goto_4

    .line 554
    :cond_5
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    :cond_6
    move v0, v2

    move-object v2, v4

    goto :goto_5

    :cond_7
    move v5, v2

    goto :goto_2
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 259
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v4

    move v2, v0

    move v3, v0

    .line 263
    :goto_0
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-lt v3, v0, :cond_0

    invoke-virtual {p2}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v2, v0, :cond_4

    .line 264
    :cond_0
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v3, v0, :cond_1

    .line 265
    invoke-virtual {p2, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 266
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p2}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v2, v0, :cond_2

    .line 268
    invoke-virtual {p1, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 269
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 271
    :cond_2
    invoke-virtual {p1, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    .line 272
    invoke-virtual {p2, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/f;

    .line 273
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v5

    invoke-virtual {v0}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v0

    cmp-long v0, v5, v0

    if-gez v0, :cond_3

    .line 274
    invoke-virtual {p1, v3}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 275
    add-int/lit8 v1, v3, 0x1

    move v0, v2

    :goto_1
    move v2, v0

    move v3, v1

    .line 280
    goto :goto_0

    .line 277
    :cond_3
    invoke-virtual {p2, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 278
    add-int/lit8 v0, v2, 0x1

    move v1, v3

    goto :goto_1

    .line 282
    :cond_4
    invoke-virtual {v4}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/google/common/a/es;Lcom/google/common/a/es;I)Lcom/google/common/a/es;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;I)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 214
    .line 216
    invoke-virtual {p1}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->g(Ljava/util/Iterator;)Lcom/google/common/a/jr;

    move-result-object v4

    .line 218
    invoke-virtual {p2}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->g(Ljava/util/Iterator;)Lcom/google/common/a/jr;

    move-result-object v5

    move v1, v2

    move v3, v2

    .line 220
    :goto_0
    add-int v0, v3, v1

    if-ge v0, p3, :cond_4

    invoke-interface {v4}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {v5}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 222
    :cond_0
    invoke-interface {v4}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 223
    invoke-interface {v5}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    .line 224
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 225
    :cond_1
    invoke-interface {v5}, Lcom/google/common/a/jr;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 226
    invoke-interface {v4}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    .line 227
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 229
    :cond_2
    invoke-interface {v5}, Lcom/google/common/a/jr;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v6

    invoke-interface {v4}, Lcom/google/common/a/jr;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    invoke-virtual {v0}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v8

    cmp-long v0, v6, v8

    if-gez v0, :cond_3

    .line 231
    invoke-interface {v4}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    .line 232
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 234
    :cond_3
    invoke-interface {v5}, Lcom/google/common/a/jr;->next()Ljava/lang/Object;

    .line 235
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 239
    :cond_4
    invoke-virtual {p1, v2, v3}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v0

    .line 241
    invoke-virtual {p2, v2, v1}, Lcom/google/common/a/es;->a(II)Lcom/google/common/a/es;

    move-result-object v1

    .line 243
    iget-object v2, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/sms/r;->a(Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v1

    .line 246
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/sms/y;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/util/List;Lcom/google/common/a/ex;)Lcom/google/common/a/es;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/Long;",
            "Lcom/facebook/user/User;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 298
    const-wide v1, 0x7fffffffffffffffL

    .line 299
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 301
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-wide v2, v1

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/f;

    .line 302
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v6

    cmp-long v2, v6, v2

    if-gez v2, :cond_1

    const/4 v2, 0x1

    :goto_1
    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 303
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v2

    .line 305
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->a()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v0, p2

    invoke-virtual {v0, v6}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 306
    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 302
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 310
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/sms/y;->f:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v1}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v6

    .line 311
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v7

    .line 313
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/f;

    .line 314
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->a()J

    move-result-wide v9

    .line 315
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v2

    const-wide/32 v4, 0xf4240

    mul-long v11, v2, v4

    .line 317
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 318
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/user/User;

    .line 319
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/facebook/orca/sms/y;->f:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v4, v2}, Lcom/facebook/orca/sms/bk;->a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 321
    :cond_3
    const/4 v3, 0x0

    .line 322
    const/4 v2, 0x0

    .line 323
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    const/4 v13, 0x1

    if-ne v4, v13, :cond_7

    .line 324
    const/4 v3, 0x1

    .line 325
    const/4 v2, 0x0

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/messages/model/threads/ParticipantInfo;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    move v4, v3

    move-object v3, v2

    .line 327
    :goto_4
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v13

    .line 329
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 330
    new-instance v14, Lcom/facebook/orca/threads/p;

    invoke-direct {v14}, Lcom/facebook/orca/threads/p;-><init>()V

    invoke-static {v9, v10}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/facebook/orca/threads/p;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/p;

    move-result-object v14

    invoke-virtual {v14, v2}, Lcom/facebook/orca/threads/p;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/p;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/threads/p;->f()Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v2

    .line 334
    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 337
    :cond_4
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->e()Ljava/lang/String;

    move-result-object v2

    .line 338
    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->f()Ljava/lang/String;

    move-result-object v5

    .line 339
    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_5

    .line 341
    :goto_6
    new-instance v5, Lcom/facebook/orca/threads/v;

    invoke-direct {v5}, Lcom/facebook/orca/threads/v;-><init>()V

    invoke-static {v9, v10}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/facebook/orca/threads/v;->a(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v5, v11, v12}, Lcom/facebook/orca/threads/v;->c(J)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v5, v11, v12}, Lcom/facebook/orca/threads/v;->a(J)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v5, v11, v12}, Lcom/facebook/orca/threads/v;->b(J)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->c()J

    move-result-wide v9

    invoke-virtual {v5, v9, v10}, Lcom/facebook/orca/threads/v;->d(J)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v5, v13}, Lcom/facebook/orca/threads/v;->a(Ljava/util/List;)Lcom/facebook/orca/threads/v;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/facebook/orca/threads/v;->a(Z)Lcom/facebook/orca/threads/v;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/v;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/facebook/orca/threads/v;->d(Ljava/lang/String;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->g()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/v;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/facebook/orca/threads/v;->c(Z)Lcom/facebook/orca/threads/v;

    move-result-object v2

    invoke-virtual {v1}, Lcom/facebook/orca/sms/f;->d()Z

    move-result v1

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/v;->b(Z)Lcom/facebook/orca/threads/v;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/v;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/facebook/orca/threads/v;->d(Z)Lcom/facebook/orca/threads/v;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 357
    invoke-virtual {v7, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto/16 :goto_2

    :cond_5
    move-object v2, v5

    .line 339
    goto :goto_6

    .line 359
    :cond_6
    invoke-virtual {v7}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    return-object v1

    :cond_7
    move v4, v3

    move-object v3, v2

    goto/16 :goto_4
.end method

.method private a(Ljava/util/Collection;)Lcom/google/common/a/ex;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/Long;",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 390
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/y;->b(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v2

    .line 392
    invoke-virtual {v2}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/y;->c(Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v0

    .line 394
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v3

    .line 395
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 396
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 397
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 398
    iget-object v1, p0, Lcom/facebook/orca/sms/y;->f:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 399
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 401
    :cond_0
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v1

    .line 402
    invoke-virtual {v2}, Lcom/google/common/a/ex;->l()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 403
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v0

    .line 404
    invoke-virtual {v0}, Lcom/google/common/a/em;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 405
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 406
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v0, v8}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;

    goto :goto_1

    .line 410
    :cond_3
    invoke-virtual {v1}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/Collection;)Lcom/google/common/a/ex;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v6, 0x0

    .line 423
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-static {}, Lcom/google/common/a/ex;->c()Lcom/google/common/a/ex;

    move-result-object v0

    .line 456
    :goto_0
    return-object v0

    .line 427
    :cond_0
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v7

    .line 428
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "_id"

    aput-object v0, v2, v6

    const/4 v0, 0x1

    const-string v1, "recipient_ids"

    aput-object v1, v2, v0

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 430
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "simple"

    const-string v4, "true"

    invoke-virtual {v0, v1, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 434
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v4, 0x0

    const-string v5, "date DESC"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 442
    :try_start_0
    const-string v0, "_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 443
    const-string v0, "recipient_ids"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    .line 444
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 445
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 446
    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 447
    const-string v8, " "

    invoke-virtual {v0, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    move v0, v6

    :goto_1
    if-ge v0, v9, :cond_1

    aget-object v10, v8, v0

    .line 448
    invoke-static {v10}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2

    .line 449
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v7, v11, v10}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 454
    :cond_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 456
    invoke-virtual {v7}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    goto/16 :goto_0

    .line 454
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private c(Ljava/util/Collection;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 466
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v6

    .line 467
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v6

    .line 494
    :goto_0
    return-object v0

    .line 471
    :cond_0
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_id"

    aput-object v1, v2, v0

    const/4 v0, 0x1

    const-string v1, "address"

    aput-object v1, v2, v0

    .line 472
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 474
    sget-object v0, Landroid_src/c/j;->a:Landroid/net/Uri;

    const-string v1, "canonical-addresses"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 484
    :try_start_0
    const-string v0, "address"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 485
    const-string v2, "_id"

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    .line 486
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 487
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 488
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 489
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 492
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    move-object v0, v6

    .line 494
    goto :goto_0
.end method

.method private e(J)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 378
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/y;->a(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v0

    .line 379
    invoke-virtual {v0}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Lcom/facebook/orca/sms/c;)Lcom/facebook/orca/sms/d;
    .locals 7

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->a(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;

    move-result-object v1

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/r;->a(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;

    move-result-object v0

    .line 114
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->a()I

    move-result v2

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/orca/sms/y;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;I)Lcom/google/common/a/es;

    move-result-object v2

    .line 120
    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    add-int/2addr v0, v1

    .line 122
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->a()I

    move-result v1

    if-gt v0, v1, :cond_1

    const/4 v0, 0x1

    move v1, v0

    .line 124
    :goto_1
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v3

    .line 125
    invoke-virtual {v2}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    .line 126
    invoke-virtual {v0}, Lcom/facebook/orca/sms/f;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->b(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;

    move-result-object v1

    .line 111
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 122
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    goto :goto_1

    .line 128
    :cond_2
    invoke-direct {p0, v3}, Lcom/facebook/orca/sms/y;->a(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v0

    .line 129
    invoke-direct {p0, v2, v0}, Lcom/facebook/orca/sms/y;->a(Ljava/util/List;Lcom/google/common/a/ex;)Lcom/google/common/a/es;

    move-result-object v2

    .line 131
    new-instance v3, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-direct {v3, v2, v1}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V

    .line 133
    invoke-virtual {v0}, Lcom/google/common/a/ex;->p()Lcom/google/common/a/em;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 134
    new-instance v1, Lcom/facebook/orca/sms/d;

    invoke-direct {v1, v3, v0}, Lcom/facebook/orca/sms/d;-><init>(Lcom/facebook/orca/threads/ThreadsCollection;Lcom/google/common/a/es;)V

    .line 136
    return-object v1
.end method

.method a(J)Lcom/facebook/orca/sms/e;
    .locals 3

    .prologue
    .line 157
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    .line 158
    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/y;->a(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 161
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/e;

    .line 163
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/facebook/orca/sms/e;

    const/4 v1, 0x0

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/sms/e;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    goto :goto_0
.end method

.method a(Ljava/lang/String;)Lcom/facebook/orca/sms/e;
    .locals 2

    .prologue
    .line 146
    invoke-virtual {p0, p1}, Lcom/facebook/orca/sms/y;->b(Ljava/lang/String;)J

    move-result-wide v0

    .line 147
    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/sms/y;->a(J)Lcom/facebook/orca/sms/e;

    move-result-object v0

    return-object v0
.end method

.method a()Lcom/facebook/orca/threads/FolderCounts;
    .locals 11

    .prologue
    const-wide/16 v6, -0x1

    const/4 v10, 0x0

    const/4 v3, 0x0

    .line 619
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "simple"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 625
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/sms/y;->k:[Ljava/lang/String;

    move-object v4, v3

    move-object v5, v3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    .line 633
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 634
    const-string v0, "num_threads"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 635
    const-string v1, "read_count"

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v3, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 636
    sub-int v2, v0, v1

    .line 637
    const-string v0, "latest_message_time"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    move-wide v8, v0

    move v1, v2

    .line 640
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 642
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->g:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/prefs/n;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v2, v6, v7}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v3

    .line 644
    const-wide/32 v5, 0xf4240

    mul-long/2addr v5, v8

    .line 645
    cmp-long v0, v3, v8

    if-gez v0, :cond_0

    const/4 v2, 0x1

    .line 646
    :goto_1
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/threads/FolderCounts;-><init>(IIJJ)V

    return-object v0

    .line 640
    :catchall_0
    move-exception v0

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    move v2, v10

    .line 645
    goto :goto_1

    :cond_1
    move-wide v8, v6

    move v1, v10

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/sms/b;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 11

    .prologue
    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 558
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v7

    .line 559
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->b()I

    move-result v0

    if-nez v0, :cond_0

    .line 560
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v7, v1, v6}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    .line 604
    :goto_0
    return-object v0

    .line 563
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->a()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/sms/y;->e(J)Lcom/google/common/a/es;

    move-result-object v8

    .line 570
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 571
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->a(Lcom/facebook/orca/sms/b;)Lcom/google/common/a/es;

    move-result-object v1

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/r;->a(Lcom/facebook/orca/sms/b;)Lcom/google/common/a/es;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    .line 579
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/sms/bn;->c(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v9

    .line 581
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/sms/r;->b(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v10

    .line 585
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v4

    .line 586
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v3

    .line 587
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ne v0, v5, :cond_3

    .line 588
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->e:Lcom/facebook/orca/sms/a;

    invoke-virtual {v0, p1, v8}, Lcom/facebook/orca/sms/a;->a(Lcom/facebook/orca/sms/b;Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v3

    .line 590
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->e:Lcom/facebook/orca/sms/a;

    invoke-virtual {v0, v3, v7}, Lcom/facebook/orca/sms/a;->a(Ljava/util/List;Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    .line 596
    :goto_2
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->b()I

    move-result v4

    const/4 v8, 0x3

    new-array v8, v8, [Lcom/google/common/a/es;

    aput-object v9, v8, v6

    aput-object v10, v8, v5

    const/4 v9, 0x2

    aput-object v0, v8, v9

    invoke-direct {p0, v4, v8}, Lcom/facebook/orca/sms/y;->a(I[Lcom/google/common/a/es;)Lcom/google/common/a/es;

    move-result-object v4

    .line 601
    invoke-virtual {v2}, Lcom/google/common/a/es;->size()I

    move-result v0

    invoke-virtual {v1}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->b()I

    move-result v1

    if-ge v0, v1, :cond_2

    move v0, v5

    .line 604
    :goto_3
    new-instance v1, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-direct {v1, v7, v4, v0}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    move-object v0, v1

    goto/16 :goto_0

    .line 574
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->a(Lcom/facebook/orca/sms/b;)Lcom/google/common/a/es;

    move-result-object v1

    .line 575
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    goto :goto_1

    :cond_2
    move v0, v6

    .line 601
    goto :goto_3

    :cond_3
    move-object v0, v3

    move-object v3, v4

    goto :goto_2
.end method

.method a(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->i:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->a(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v1

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/r;->a(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v0

    .line 188
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/orca/sms/y;->a(Lcom/google/common/a/es;Lcom/google/common/a/es;I)Lcom/google/common/a/es;

    move-result-object v0

    .line 194
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/y;->a(Ljava/util/Collection;)Lcom/google/common/a/ex;

    move-result-object v1

    .line 195
    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/sms/y;->a(Ljava/util/List;Lcom/google/common/a/ex;)Lcom/google/common/a/es;

    move-result-object v0

    .line 196
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 198
    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 199
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/orca/threads/m;->c(Ljava/lang/String;)J

    move-result-wide v4

    .line 200
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v4

    invoke-static {v4}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v4

    .line 201
    new-instance v5, Lcom/facebook/orca/sms/e;

    invoke-direct {v5, v0, v4}, Lcom/facebook/orca/sms/e;-><init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/google/common/a/es;)V

    .line 203
    invoke-virtual {v2, v5}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_1

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/sms/bn;->b(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v1

    .line 185
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 206
    :cond_1
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 368
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/google/common/a/kl;->a([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    .line 369
    iget-object v1, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Landroid_src/c/m;->a(Landroid/content/Context;Ljava/util/Set;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(J)Lcom/facebook/messages/model/threads/Message;
    .locals 3

    .prologue
    .line 498
    const/4 v0, 0x1

    const-wide/16 v1, -0x1

    invoke-static {p1, p2, v0, v1, v2}, Lcom/facebook/orca/sms/b;->a(JIJ)Lcom/facebook/orca/sms/b;

    move-result-object v0

    .line 503
    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/y;->a(Lcom/facebook/orca/sms/b;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 504
    invoke-virtual {v0}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 669
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 670
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "simple"

    const-string v2, "true"

    invoke-virtual {v0, v1, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 674
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_id"

    aput-object v3, v2, v5

    const-string v3, "read=0"

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 682
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 683
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 686
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 688
    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 689
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/sms/r;->a(Ljava/util/Collection;)V

    .line 690
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/sms/bn;->a(Ljava/util/Collection;)V

    .line 692
    :cond_1
    return-object v6
.end method

.method c(J)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 654
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 655
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 656
    const-string v2, "read"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 657
    iget-object v2, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v0, v1, v4, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 663
    return-void
.end method

.method c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 701
    invoke-static {p1}, Lcom/facebook/orca/threads/m;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 702
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->c:Lcom/facebook/orca/sms/bn;

    invoke-static {p1}, Lcom/facebook/orca/threads/m;->d(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/sms/bn;->b(J)V

    .line 708
    :goto_0
    return-void

    .line 703
    :cond_0
    invoke-static {p1}, Lcom/facebook/orca/threads/m;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 704
    iget-object v0, p0, Lcom/facebook/orca/sms/y;->d:Lcom/facebook/orca/sms/r;

    invoke-static {p1}, Lcom/facebook/orca/threads/m;->e(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/sms/r;->b(J)V

    goto :goto_0

    .line 706
    :cond_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Message id is not an Mms or Sms id"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method d(J)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 696
    sget-object v0, Landroid_src/c/j;->b:Landroid/net/Uri;

    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 697
    iget-object v1, p0, Lcom/facebook/orca/sms/y;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 698
    return-void
.end method
