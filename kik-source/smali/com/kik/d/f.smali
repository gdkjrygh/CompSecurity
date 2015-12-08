.class public Lcom/kik/d/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:Z

.field private static final b:Lorg/c/b;


# instance fields
.field private final c:Lcom/kik/d/a;

.field private d:Ljava/util/List;

.field private e:I

.field private final f:Ljava/util/Random;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:J

.field private m:Lcom/kik/d/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/kik/d/f;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/kik/d/f;->a:Z

    .line 34
    const-string v0, "MetricsTracker"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/d/f;->b:Lorg/c/b;

    return-void

    .line 31
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/kik/d/a;Lcom/kik/d/a/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/kik/d/f;->f:Ljava/util/Random;

    .line 42
    iput-object v1, p0, Lcom/kik/d/f;->g:Ljava/lang/String;

    .line 43
    iput-object v1, p0, Lcom/kik/d/f;->h:Ljava/lang/String;

    .line 44
    iput-object v1, p0, Lcom/kik/d/f;->i:Ljava/lang/String;

    .line 46
    const-string v0, "UNK"

    iput-object v0, p0, Lcom/kik/d/f;->j:Ljava/lang/String;

    .line 47
    const-string v0, "unknown"

    iput-object v0, p0, Lcom/kik/d/f;->k:Ljava/lang/String;

    .line 48
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/kik/d/f;->l:J

    .line 54
    iput-object p1, p0, Lcom/kik/d/f;->c:Lcom/kik/d/a;

    .line 55
    const/16 v0, 0x14

    iput v0, p0, Lcom/kik/d/f;->e:I

    .line 56
    iput-object p2, p0, Lcom/kik/d/f;->m:Lcom/kik/d/a/a;

    .line 57
    invoke-interface {p2}, Lcom/kik/d/a/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kik/d/f;->l:J

    .line 58
    return-void
.end method

.method private a(Lcom/kik/d/b/a$k;Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V
    .locals 7

    .prologue
    .line 359
    invoke-static {}, Lcom/kik/d/b/a$a;->q()Lcom/kik/d/b/a$a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/d/f;->f:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kik/d/b/a$a$a;->a(I)Lcom/kik/d/b/a$a$a;

    move-result-object v2

    .line 360
    if-eqz p1, :cond_0

    .line 361
    invoke-static {}, Lcom/kik/d/b/a$i;->j()Lcom/kik/d/b/a$i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kik/d/b/a$i$a;->a(Lcom/kik/d/b/a$k;)Lcom/kik/d/b/a$i$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$i$a;->r()Lcom/kik/d/b/a$i;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$i;)Lcom/kik/d/b/a$a$a;

    .line 362
    sget-boolean v0, Lcom/kik/d/f;->a:Z

    if-nez v0, :cond_2

    if-eqz p2, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 364
    :cond_0
    if-eqz p2, :cond_1

    .line 365
    invoke-static {}, Lcom/kik/d/b/a$d;->k()Lcom/kik/d/b/a$d$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/kik/d/b/a$d$a;->a(Lcom/kik/d/b/a$f;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/kik/d/b/a$d$a;->a(Ljava/lang/String;)Lcom/kik/d/b/a$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/d/b/a$d$a;->r()Lcom/kik/d/b/a$d;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$d;)Lcom/kik/d/b/a$a$a;

    .line 366
    sget-boolean v0, Lcom/kik/d/f;->a:Z

    if-nez v0, :cond_2

    if-nez p3, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 369
    :cond_1
    sget-boolean v0, Lcom/kik/d/f;->a:Z

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 371
    :cond_2
    if-eqz p4, :cond_3

    .line 372
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    .line 373
    invoke-static {}, Lcom/kik/d/b/a$l;->j()Lcom/kik/d/b/a$l$a;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/kik/d/b/a$l$a;->a(Ljava/lang/String;)Lcom/kik/d/b/a$l$a;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/kik/d/b/a$l$a;->b(Ljava/lang/String;)Lcom/kik/d/b/a$l$a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$l$a;)Lcom/kik/d/b/a$a$a;

    goto :goto_0

    .line 377
    :cond_3
    if-eqz p5, :cond_4

    .line 378
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 379
    invoke-static {}, Lcom/kik/d/b/a$n;->i()Lcom/kik/d/b/a$n$a;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/kik/d/b/a$n$a;->a(Ljava/lang/String;)Lcom/kik/d/b/a$n$a;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v1, v0}, Lcom/kik/d/b/a$n$a;->a(Ljava/lang/Iterable;)Lcom/kik/d/b/a$n$a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$n$a;)Lcom/kik/d/b/a$a$a;

    goto :goto_1

    .line 383
    :cond_4
    if-eqz p6, :cond_5

    .line 384
    invoke-interface {p6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 385
    invoke-static {}, Lcom/kik/d/b/a$p;->k()Lcom/kik/d/b/a$p$a;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v4, v1}, Lcom/kik/d/b/a$p$a;->a(Ljava/lang/String;)Lcom/kik/d/b/a$p$a;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kik/d/b/a$p$a;->a(J)Lcom/kik/d/b/a$p$a;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/kik/d/b/a$a$a;->a(Lcom/kik/d/b/a$p$a;)Lcom/kik/d/b/a$a$a;

    goto :goto_2

    .line 390
    :cond_5
    invoke-virtual {v2, p7, p8}, Lcom/kik/d/b/a$a$a;->a(J)Lcom/kik/d/b/a$a$a;

    .line 392
    invoke-virtual {v2}, Lcom/kik/d/b/a$a$a;->r()Lcom/kik/d/b/a$a;

    move-result-object v0

    .line 394
    iget-object v1, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v1, p0, Lcom/kik/d/f;->e:I

    if-lt v0, v1, :cond_6

    invoke-virtual {p0}, Lcom/kik/d/f;->b()V

    .line 395
    :cond_6
    return-void

    .line 394
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final a(I)V
    .locals 0

    .prologue
    .line 80
    iput p1, p0, Lcom/kik/d/f;->e:I

    .line 81
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 10

    .prologue
    .line 189
    new-instance v7, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 190
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v7, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v8, p6

    invoke-direct/range {v1 .. v9}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 193
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V
    .locals 12

    .prologue
    .line 220
    new-instance v9, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v9, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 221
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v9, p3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    new-instance v7, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v7, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 224
    move-object/from16 v0, p6

    move-object/from16 v1, p7

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-wide/from16 v10, p8

    invoke-direct/range {v3 .. v11}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 227
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$k;J)V
    .locals 2

    .prologue
    .line 62
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;J)V

    .line 63
    return-void
.end method

.method public final varargs a(Lcom/kik/d/b/a$k;J[Ljava/lang/Object;)V
    .locals 10

    .prologue
    const/4 v6, 0x0

    .line 231
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 232
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 233
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    move v2, v6

    .line 235
    :goto_0
    const/4 v0, 0x2

    if-ge v2, v0, :cond_8

    .line 241
    aget-object v0, p4, v6

    .line 242
    const/4 v1, 0x1

    aget-object v1, p4, v1

    .line 244
    instance-of v7, v0, Ljava/lang/String;

    if-nez v7, :cond_0

    .line 245
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Arguments must consist of a String key and an Object value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 249
    :cond_0
    if-eqz v1, :cond_1

    .line 250
    instance-of v7, v1, Ljava/util/List;

    if-eqz v7, :cond_2

    .line 254
    check-cast v0, Ljava/lang/String;

    move-object v1, v4

    check-cast v1, Ljava/util/List;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    :cond_1
    :goto_1
    add-int/lit8 v0, v2, 0x2

    move v2, v0

    goto :goto_0

    .line 256
    :cond_2
    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_3

    .line 257
    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 259
    :cond_3
    instance-of v7, v1, Ljava/lang/Byte;

    if-eqz v7, :cond_4

    .line 260
    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Byte;

    invoke-virtual {v1}, Ljava/lang/Byte;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 262
    :cond_4
    instance-of v7, v1, Ljava/lang/Short;

    if-eqz v7, :cond_5

    .line 263
    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Short;

    invoke-virtual {v1}, Ljava/lang/Short;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 265
    :cond_5
    instance-of v7, v1, Ljava/lang/Integer;

    if-eqz v7, :cond_6

    .line 266
    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 268
    :cond_6
    instance-of v7, v1, Ljava/lang/Long;

    if-eqz v7, :cond_7

    .line 269
    check-cast v0, Ljava/lang/String;

    check-cast v1, Ljava/lang/Long;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 272
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Values must be of types List<String>, String or Long"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object v1, p0

    move-object v2, p1

    move-wide v6, p2

    .line 276
    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 277
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$k;Ljava/lang/String;JJ)V
    .locals 9

    .prologue
    const/4 v3, 0x0

    .line 126
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 127
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v1, p0

    move-object v2, p1

    move-object v4, v3

    move-wide v6, p5

    .line 129
    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 130
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$k;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;J)V
    .locals 9

    .prologue
    .line 161
    new-instance v5, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v5, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 162
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v3, Ljava/util/HashMap;

    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 165
    invoke-interface {v3, p5, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide/from16 v6, p7

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 168
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$k;Ljava/util/Map;J)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    .line 101
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, v4

    move-wide v6, p3

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 102
    return-void
.end method

.method public final a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V
    .locals 11

    .prologue
    .line 312
    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-wide/from16 v8, p5

    invoke-direct/range {v1 .. v9}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Lcom/kik/d/b/a$f;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 313
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 472
    iput-object p1, p0, Lcom/kik/d/f;->g:Ljava/lang/String;

    .line 473
    return-void
.end method

.method public final b()V
    .locals 7

    .prologue
    .line 420
    iget-object v6, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    monitor-enter v6

    .line 421
    :try_start_0
    iget-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 422
    monitor-exit v6

    .line 435
    :goto_0
    return-void

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/kik/d/f;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 429
    new-instance v5, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 432
    iget-object v0, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 433
    iget-object v0, p0, Lcom/kik/d/f;->m:Lcom/kik/d/a/a;

    invoke-interface {v0}, Lcom/kik/d/a/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kik/d/f;->l:J

    .line 434
    iget-object v0, p0, Lcom/kik/d/f;->c:Lcom/kik/d/a;

    iget-object v1, p0, Lcom/kik/d/f;->g:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/kik/d/f;->g:Ljava/lang/String;

    :goto_1
    iget-object v2, p0, Lcom/kik/d/f;->h:Ljava/lang/String;

    iget-object v3, p0, Lcom/kik/d/f;->j:Ljava/lang/String;

    iget-object v4, p0, Lcom/kik/d/f;->k:Ljava/lang/String;

    invoke-interface/range {v0 .. v5}, Lcom/kik/d/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 435
    :cond_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 434
    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/kik/d/f;->i:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/kik/d/f;->i:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const-string v1, "unknown"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 477
    iput-object p1, p0, Lcom/kik/d/f;->i:Ljava/lang/String;

    .line 478
    return-void
.end method

.method public final c()J
    .locals 4

    .prologue
    .line 460
    iget-object v1, p0, Lcom/kik/d/f;->d:Ljava/util/List;

    monitor-enter v1

    .line 461
    :try_start_0
    iget-wide v2, p0, Lcom/kik/d/f;->l:J

    monitor-exit v1

    return-wide v2

    .line 462
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 487
    iput-object p1, p0, Lcom/kik/d/f;->h:Ljava/lang/String;

    .line 488
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 497
    iput-object p1, p0, Lcom/kik/d/f;->j:Ljava/lang/String;

    .line 498
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 502
    if-eqz p1, :cond_0

    .line 503
    iput-object p1, p0, Lcom/kik/d/f;->k:Ljava/lang/String;

    .line 505
    :cond_0
    return-void
.end method
