.class public final Lcom/cm/kinfoc/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static h:Lcom/cm/kinfoc/q;

.field private static i:Z

.field private static j:Z

.field private static o:Ljava/lang/String;

.field private static p:Ljava/lang/String;

.field private static q:J

.field private static r:I

.field private static final s:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Z

.field private f:Lcom/cm/kinfoc/z;

.field private g:Lcom/cm/kinfoc/n;

.field private k:I

.field private final l:Ljava/lang/Object;

.field private m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 67
    sput-object v1, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    .line 69
    sput-boolean v2, Lcom/cm/kinfoc/q;->i:Z

    .line 71
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cm/kinfoc/q;->j:Z

    .line 81
    sput-object v1, Lcom/cm/kinfoc/q;->o:Ljava/lang/String;

    .line 83
    sput-object v1, Lcom/cm/kinfoc/q;->p:Ljava/lang/String;

    .line 85
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/cm/kinfoc/q;->q:J

    .line 87
    sput v2, Lcom/cm/kinfoc/q;->r:I

    .line 89
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/cm/kinfoc/q;->s:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object v1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    .line 55
    iput-object v1, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    .line 57
    iput-object v1, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/kinfoc/q;->d:I

    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cm/kinfoc/q;->e:Z

    .line 63
    iput-object v1, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    .line 65
    iput-object v1, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    .line 73
    const/4 v0, -0x1

    iput v0, p0, Lcom/cm/kinfoc/q;->k:I

    .line 75
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/q;->l:Ljava/lang/Object;

    .line 77
    new-instance v0, Lcom/cm/a/a;

    invoke-direct {v0}, Lcom/cm/a/a;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/q;->m:Ljava/util/Map;

    .line 79
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/q;->n:Ljava/lang/Object;

    .line 95
    iput-object p1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    .line 96
    iget-object v0, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 97
    invoke-direct {p0}, Lcom/cm/kinfoc/q;->g()V

    .line 99
    :cond_0
    return-void
.end method

.method public static a()Lcom/cm/kinfoc/q;
    .locals 6

    .prologue
    .line 132
    sget-object v1, Lcom/cm/kinfoc/q;->s:Ljava/lang/Object;

    monitor-enter v1

    .line 133
    :try_start_0
    sget-object v0, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    if-nez v0, :cond_0

    .line 134
    new-instance v0, Lcom/cm/kinfoc/q;

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v2

    invoke-virtual {v2}, Lcom/cm/kinfoc/a/e;->b()Landroid/app/Application;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/cm/kinfoc/q;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    .line 136
    :cond_0
    sget-object v0, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    iget-object v0, v0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/cm/kinfoc/q;->o:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/cm/kinfoc/q;->p:Ljava/lang/String;

    if-nez v0, :cond_2

    :cond_1
    sget v0, Lcom/cm/kinfoc/q;->r:I

    mul-int/lit8 v0, v0, 0x5

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v2, v0

    sget-wide v4, Lcom/cm/kinfoc/q;->q:J

    add-long/2addr v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_2

    sget v0, Lcom/cm/kinfoc/q;->r:I

    const/4 v2, 0x6

    if-ge v0, v2, :cond_2

    .line 137
    sget v0, Lcom/cm/kinfoc/q;->r:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/cm/kinfoc/q;->r:I

    .line 138
    sget-object v0, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    sget-object v2, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    iget-object v2, v2, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/cm/kinfoc/q;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    .line 1037
    sget-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    .line 141
    :cond_2
    sget-object v0, Lcom/cm/kinfoc/q;->h:Lcom/cm/kinfoc/q;

    monitor-exit v1

    return-object v0

    .line 142
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .prologue
    const-wide/16 v6, 0x3e8

    .line 293
    const-string v0, ""

    .line 294
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->j()Ljava/lang/String;

    move-result-object v1

    .line 295
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    const-string v0, "uuid="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    invoke-static {v1}, Lcom/cm/kinfoc/y;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "uuid"

    invoke-static {v0, v3}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 298
    if-nez v0, :cond_4

    .line 299
    const-string v0, "11111111111111111111111111111111"

    .line 305
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sput-wide v4, Lcom/cm/kinfoc/q;->q:J

    .line 306
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    const-string v0, "&action="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    div-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    const-string v0, "&xaid="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    const-string v0, "xaid"

    invoke-static {v1, v0}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 312
    if-nez v0, :cond_0

    .line 313
    const-string v0, ""

    .line 315
    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    const-string v0, "&ver="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    const-string v0, "&lang="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    .line 321
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 322
    if-eqz v0, :cond_1

    const-string v3, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    if-eqz v1, :cond_1

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 324
    :cond_1
    const/4 v0, 0x0

    const-string v1, "lang"

    invoke-static {v0, v1}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 328
    :goto_1
    if-nez v0, :cond_2

    .line 329
    const-string v0, "NONE"

    .line 331
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    const-string v0, "&cn="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cn"

    invoke-static {v0, v1}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 335
    if-nez v0, :cond_3

    .line 336
    const-string v0, "-1"

    .line 338
    :cond_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    const-string v0, "&osver="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&osname="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&brand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/cm/kinfoc/a/e;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->l()Ljava/lang/String;

    move-result-object v0

    const-string v1, "model"

    invoke-static {v0, v1}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/cm/kinfoc/q;->p:Ljava/lang/String;

    .line 346
    const-string v0, "&model="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/cm/kinfoc/q;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    const-string v0, "&net="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/cm/kinfoc/y;->a(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 350
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->d()Z

    move-result v1

    .line 351
    const-string v0, "&newuser="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v1, :cond_6

    const-string v0, "1"

    :goto_2
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    const-string v0, "&newusertime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    if-eqz v1, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    div-long/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 300
    :cond_4
    const-string v3, "00000000000000000000000000000000"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    sput-object v0, Lcom/cm/kinfoc/q;->o:Ljava/lang/String;

    goto/16 :goto_0

    .line 326
    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "_"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "lang"

    invoke-static {v0, v1}, Lcom/cm/kinfoc/q;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 351
    :cond_6
    const-string v0, "0"

    goto :goto_2

    .line 352
    :cond_7
    const-string v0, "0"

    goto :goto_3
.end method

.method private a(Ljava/lang/String;)Z
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 364
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 395
    :goto_0
    return v0

    .line 368
    :cond_0
    iget-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    if-nez v0, :cond_1

    move v0, v1

    .line 369
    goto :goto_0

    .line 372
    :cond_1
    iget-object v3, p0, Lcom/cm/kinfoc/q;->n:Ljava/lang/Object;

    monitor-enter v3

    .line 374
    :try_start_0
    iget-object v0, p0, Lcom/cm/kinfoc/q;->m:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 375
    if-eqz v0, :cond_2

    .line 376
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    monitor-exit v3

    goto :goto_0

    .line 393
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 380
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    invoke-virtual {v0, p1}, Lcom/cm/kinfoc/n;->b(Ljava/lang/String;)I

    move-result v0

    .line 381
    if-nez v0, :cond_3

    .line 383
    iget-object v0, p0, Lcom/cm/kinfoc/q;->m:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    monitor-exit v3

    move v0, v1

    goto :goto_0

    .line 385
    :cond_3
    const/16 v4, 0x2710

    if-ge v0, v4, :cond_4

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v4

    invoke-virtual {v4}, Lcom/cm/kinfoc/a/e;->g()D

    move-result-wide v4

    const-wide v6, 0x40c3880000000000L    # 10000.0

    mul-double/2addr v4, v6

    double-to-int v4, v4

    if-le v4, v0, :cond_4

    .line 388
    iget-object v0, p0, Lcom/cm/kinfoc/q;->m:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    monitor-exit v3

    move v0, v1

    goto :goto_0

    .line 392
    :cond_4
    iget-object v0, p0, Lcom/cm/kinfoc/q;->m:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v0, v2

    .line 395
    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 708
    sget-boolean v2, Lcom/cm/kinfoc/q;->i:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/cm/kinfoc/q;->e:Z

    if-nez v2, :cond_2

    :cond_0
    move v0, v1

    .line 769
    :cond_1
    :goto_0
    return v0

    .line 711
    :cond_2
    iget-object v2, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    if-nez v2, :cond_4

    :cond_3
    move v0, v1

    .line 712
    goto :goto_0

    .line 715
    :cond_4
    sget-boolean v2, Lcom/cm/kinfoc/q;->j:Z

    if-nez v2, :cond_5

    if-eqz p3, :cond_1

    .line 720
    :cond_5
    invoke-direct {p0, p1}, Lcom/cm/kinfoc/q;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 724
    iget-object v2, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    invoke-virtual {v2, p1}, Lcom/cm/kinfoc/n;->a(Ljava/lang/String;)I

    move-result v2

    .line 725
    if-eqz v2, :cond_1

    .line 729
    const/16 v3, 0x2710

    if-ge v2, v3, :cond_6

    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v3

    invoke-virtual {v3}, Lcom/cm/kinfoc/a/e;->g()D

    move-result-wide v4

    const-wide v6, 0x40c3880000000000L    # 10000.0

    mul-double/2addr v4, v6

    double-to-int v3, v4

    if-gt v3, v2, :cond_1

    .line 735
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "tableName: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " dataString: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4037
    sget-boolean v2, Lcom/cm/kinfoc/ag;->a:Z

    .line 5037
    sget-boolean v2, Lcom/cm/kinfoc/ag;->a:Z

    .line 740
    iget-object v2, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    iget v3, p0, Lcom/cm/kinfoc/q;->d:I

    iget-object v4, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    invoke-static {p1, p2, v2, v3, v4}, Lcom/cm/kinfoc/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)[B

    move-result-object v2

    .line 741
    if-nez v2, :cond_8

    .line 6037
    sget-boolean v0, Lcom/cm/kinfoc/ag;->a:Z

    .line 743
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    const-string v3, "__test_infoc__"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 744
    new-instance v0, Ljava/lang/NullPointerException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "infoc data format error, see logcat for more details. table name: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    move v0, v1

    .line 746
    goto/16 :goto_0

    .line 750
    :cond_8
    if-eqz p3, :cond_9

    .line 751
    iget-object v1, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    .line 6273
    invoke-virtual {v1, v2, p1}, Lcom/cm/kinfoc/z;->a([BLjava/lang/String;)V

    goto/16 :goto_0

    .line 755
    :cond_9
    iget-object v1, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    invoke-virtual {v1, v2, p1, v0, v0}, Lcom/cm/kinfoc/z;->a([BLjava/lang/String;ZI)Z

    .line 759
    iget-object v2, p0, Lcom/cm/kinfoc/q;->l:Ljava/lang/Object;

    monitor-enter v2

    .line 760
    :try_start_0
    iget v1, p0, Lcom/cm/kinfoc/q;->k:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_b

    iget-object v1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/cm/kinfoc/ag;->b(Landroid/content/Context;)I

    move-result v1

    :goto_1
    iput v1, p0, Lcom/cm/kinfoc/q;->k:I

    .line 762
    iget v1, p0, Lcom/cm/kinfoc/q;->k:I

    const/16 v3, 0x1e

    if-lt v1, v3, :cond_a

    .line 763
    const/4 v1, 0x0

    iput v1, p0, Lcom/cm/kinfoc/q;->k:I

    .line 6897
    iget-object v1, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    if-eqz v1, :cond_a

    .line 6898
    iget-object v1, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    invoke-virtual {v1}, Lcom/cm/kinfoc/z;->a()V

    .line 766
    :cond_a
    monitor-exit v2

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 760
    :cond_b
    :try_start_1
    iget v1, p0, Lcom/cm/kinfoc/q;->k:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method static synthetic a(Z)Z
    .locals 0

    .prologue
    .line 47
    sput-boolean p0, Lcom/cm/kinfoc/q;->j:Z

    return p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)[B
    .locals 1

    .prologue
    .line 945
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/cm/kinfoc/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 950
    :goto_0
    return-object v0

    .line 947
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b()V
    .locals 2

    .prologue
    .line 149
    sget-boolean v0, Lcom/cm/kinfoc/q;->i:Z

    if-eqz v0, :cond_0

    .line 153
    :goto_0
    return-void

    .line 152
    :cond_0
    new-instance v0, Lcom/cm/kinfoc/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/cm/kinfoc/r;-><init>(B)V

    invoke-virtual {v0}, Lcom/cm/kinfoc/r;->start()V

    goto :goto_0
.end method

.method static synthetic b(Z)V
    .locals 0

    .prologue
    .line 47
    .line 7244
    sput-boolean p0, Lcom/cm/kinfoc/q;->i:Z

    .line 47
    return-void
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 260
    const-string v0, "uuid"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    if-eqz p0, :cond_0

    const-string v0, "00000000000000000000000000000000"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 261
    :cond_0
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/cm/kinfoc/a/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2

    .line 263
    :cond_1
    const-string v0, "00000000000000000000000000000000"

    .line 284
    :cond_2
    :goto_0
    return-object v0

    .line 268
    :cond_3
    if-eqz p0, :cond_4

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 272
    :cond_4
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/cm/kinfoc/a/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 273
    if-eqz v0, :cond_5

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 274
    :cond_5
    const/4 v0, 0x0

    goto :goto_0

    .line 280
    :cond_6
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 281
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Lcom/cm/kinfoc/a/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    move-object v0, p0

    .line 284
    goto :goto_0
.end method

.method public static declared-synchronized c()Z
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 1237
    const-class v4, Lcom/cm/kinfoc/q;

    monitor-enter v4

    :try_start_0
    sget-boolean v0, Lcom/cm/kinfoc/q;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    if-eqz v0, :cond_1

    .line 162
    const/4 v0, 0x1

    .line 182
    :cond_0
    :goto_0
    monitor-exit v4

    return v0

    .line 165
    :cond_1
    :try_start_1
    new-instance v0, Lcom/cm/kinfoc/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/cm/kinfoc/r;-><init>(B)V

    invoke-virtual {v0}, Lcom/cm/kinfoc/r;->run()V

    .line 167
    const/4 v1, 0x5

    .line 2237
    :goto_1
    sget-boolean v0, Lcom/cm/kinfoc/q;->i:Z

    .line 170
    if-eqz v0, :cond_2

    .line 171
    invoke-static {}, Lcom/cm/kinfoc/q;->a()Lcom/cm/kinfoc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1237
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    .line 176
    :cond_2
    const-wide/16 v6, 0x64

    :try_start_2
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 180
    :goto_2
    add-int/lit8 v3, v1, -0x1

    if-lez v1, :cond_0

    move v1, v3

    goto :goto_1

    .line 178
    :catch_0
    move-exception v1

    move v1, v2

    goto :goto_2
.end method

.method public static d()Z
    .locals 1

    .prologue
    .line 237
    sget-boolean v0, Lcom/cm/kinfoc/q;->i:Z

    return v0
.end method

.method public static e()Z
    .locals 1

    .prologue
    .line 446
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    .line 450
    const/4 v0, 0x0

    return v0
.end method

.method public static f()Z
    .locals 1

    .prologue
    .line 602
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    .line 606
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized g()V
    .locals 6

    .prologue
    .line 103
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->c()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    .line 104
    iget-object v0, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/cm/kinfoc/q;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    .line 105
    new-instance v0, Lcom/cm/kinfoc/n;

    invoke-direct {v0}, Lcom/cm/kinfoc/n;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    .line 106
    new-instance v0, Lcom/cm/kinfoc/z;

    iget-object v1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    invoke-direct {v0, v1, v2}, Lcom/cm/kinfoc/z;-><init>(Landroid/content/Context;Lcom/cm/kinfoc/n;)V

    iput-object v0, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    .line 107
    iget-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    invoke-virtual {v0}, Lcom/cm/kinfoc/n;->a()I

    move-result v0

    iput v0, p0, Lcom/cm/kinfoc/q;->d:I

    .line 108
    iget-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    invoke-virtual {v0}, Lcom/cm/kinfoc/n;->b()I

    move-result v4

    .line 109
    iget-object v0, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    int-to-long v2, v4

    invoke-virtual {v0, v2, v3}, Lcom/cm/kinfoc/z;->a(J)V

    .line 110
    invoke-static {}, Lcom/cm/kinfoc/o;->a()Lcom/cm/kinfoc/o;

    move-result-object v0

    iget-object v1, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    iget-object v2, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    iget v3, p0, Lcom/cm/kinfoc/q;->d:I

    iget-object v5, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/cm/kinfoc/o;->a(Lcom/cm/kinfoc/n;Ljava/lang/String;IILjava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 114
    invoke-direct {p0}, Lcom/cm/kinfoc/q;->h()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 117
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Lcom/cm/kinfoc/q;->b:Ljava/lang/String;

    .line 118
    invoke-static {}, Lcom/cm/kinfoc/o;->a()Lcom/cm/kinfoc/o;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/cm/kinfoc/o;->a(Lcom/cm/kinfoc/n;Ljava/lang/String;IILjava/lang/String;)V

    .line 119
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/q;->c:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/q;->g:Lcom/cm/kinfoc/n;

    .line 121
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    .line 122
    const/4 v0, 0x0

    iput v0, p0, Lcom/cm/kinfoc/q;->d:I

    .line 123
    invoke-direct {p0}, Lcom/cm/kinfoc/q;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 103
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private h()V
    .locals 1

    .prologue
    .line 252
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cm/kinfoc/q;->e:Z

    .line 253
    iget-object v0, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/cm/kinfoc/q;->f:Lcom/cm/kinfoc/z;

    invoke-virtual {v0}, Lcom/cm/kinfoc/z;->b()V

    .line 256
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 405
    iget-object v1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    .line 2695
    invoke-direct {p0, p1, p2, v0}, Lcom/cm/kinfoc/q;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    .line 405
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 415
    iget-object v1, p0, Lcom/cm/kinfoc/q;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    .line 3695
    invoke-direct {p0, p1, p2, v0}, Lcom/cm/kinfoc/q;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    .line 415
    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
