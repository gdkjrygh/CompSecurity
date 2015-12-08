.class public final Lcrittercism/android/bg;
.super Lcom/crittercism/app/Transaction;

# interfaces
.implements Lcrittercism/android/cg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcrittercism/android/bg$a;
    }
.end annotation


# static fields
.field private static b:Ljava/util/concurrent/ExecutorService;

.field private static c:Ljava/util/concurrent/ScheduledExecutorService;

.field private static o:Ljava/util/List;

.field private static volatile p:J

.field private static volatile q:J

.field private static final r:[I

.field private static s:Lcrittercism/android/bg;

.field private static t:Lcrittercism/android/bh;


# instance fields
.field private d:Ljava/lang/String;

.field private e:J

.field private f:I

.field private g:J

.field private h:J

.field private i:J

.field private j:Lcrittercism/android/bg$a;

.field private k:Ljava/util/Map;

.field private l:Ljava/lang/String;

.field private m:J

.field private n:Ljava/util/concurrent/ScheduledFuture;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 51
    new-instance v0, Lcrittercism/android/dz;

    invoke-direct {v0}, Lcrittercism/android/dz;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    .line 63
    const/4 v0, 0x1

    new-instance v1, Lcrittercism/android/dz;

    invoke-direct {v1}, Lcrittercism/android/dz;-><init>()V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lcrittercism/android/bg;->c:Ljava/util/concurrent/ScheduledExecutorService;

    .line 94
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    sput-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    .line 95
    sput-wide v2, Lcrittercism/android/bg;->p:J

    .line 96
    sput-wide v2, Lcrittercism/android/bg;->q:J

    .line 109
    const/16 v0, 0x16

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcrittercism/android/bg;->r:[I

    .line 136
    const/4 v0, 0x0

    sput-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    .line 138
    new-instance v0, Lcrittercism/android/bh;

    invoke-direct {v0}, Lcrittercism/android/bh;-><init>()V

    sput-object v0, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    return-void

    .line 109
    :array_0
    .array-data 4
        0x20
        0x220
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x20
        0x2020
    .end array-data
.end method

.method public constructor <init>(Lcrittercism/android/az;Ljava/lang/String;)V
    .locals 6

    .prologue
    const-wide/16 v4, -0x1

    const/16 v3, 0xff

    const/4 v0, -0x1

    .line 152
    invoke-direct {p0}, Lcom/crittercism/app/Transaction;-><init>()V

    .line 70
    iput-wide v4, p0, Lcrittercism/android/bg;->e:J

    .line 71
    iput v0, p0, Lcrittercism/android/bg;->f:I

    .line 92
    const/4 v1, 0x0

    iput-object v1, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 153
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_1

    .line 154
    const-string v1, "Crittercism"

    const-string v2, "Transaction name exceeds 255 characters! Truncating to first 255 characters."

    invoke-static {v1, v2}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const/4 v1, 0x0

    invoke-virtual {p2, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    .line 161
    :goto_0
    sget-object v1, Lcrittercism/android/bg$a;->a:Lcrittercism/android/bg$a;

    iput-object v1, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 162
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcrittercism/android/bg;->k:Ljava/util/Map;

    .line 163
    iput-object p1, p0, Lcrittercism/android/bg;->a:Lcrittercism/android/az;

    .line 164
    sget-object v1, Lcrittercism/android/cf;->a:Lcrittercism/android/cf;

    invoke-virtual {v1}, Lcrittercism/android/cf;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcrittercism/android/bg;->l:Ljava/lang/String;

    .line 170
    iput-wide v4, p0, Lcrittercism/android/bg;->e:J

    .line 174
    sget-object v1, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    iget-object v1, v1, Lcrittercism/android/bh;->d:Lorg/json/JSONObject;

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "value"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    :cond_0
    iput v0, p0, Lcrittercism/android/bg;->f:I

    .line 179
    return-void

    .line 159
    :cond_1
    iput-object p2, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    goto :goto_0
.end method

.method private constructor <init>(Lcrittercism/android/bg;)V
    .locals 2

    .prologue
    .line 181
    invoke-direct {p0}, Lcom/crittercism/app/Transaction;-><init>()V

    .line 70
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcrittercism/android/bg;->e:J

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcrittercism/android/bg;->f:I

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 182
    iget-object v0, p1, Lcrittercism/android/bg;->d:Ljava/lang/String;

    iput-object v0, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    .line 183
    iget-wide v0, p1, Lcrittercism/android/bg;->e:J

    iput-wide v0, p0, Lcrittercism/android/bg;->e:J

    .line 184
    iget v0, p1, Lcrittercism/android/bg;->f:I

    iput v0, p0, Lcrittercism/android/bg;->f:I

    .line 185
    iget-wide v0, p1, Lcrittercism/android/bg;->g:J

    iput-wide v0, p0, Lcrittercism/android/bg;->g:J

    .line 186
    iget-wide v0, p1, Lcrittercism/android/bg;->h:J

    iput-wide v0, p0, Lcrittercism/android/bg;->h:J

    .line 187
    iget-object v0, p1, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    iput-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 188
    iget-object v0, p1, Lcrittercism/android/bg;->k:Ljava/util/Map;

    iput-object v0, p0, Lcrittercism/android/bg;->k:Ljava/util/Map;

    .line 189
    iget-object v0, p1, Lcrittercism/android/bg;->l:Ljava/lang/String;

    iput-object v0, p0, Lcrittercism/android/bg;->l:Ljava/lang/String;

    .line 190
    iget-wide v0, p1, Lcrittercism/android/bg;->i:J

    iput-wide v0, p0, Lcrittercism/android/bg;->i:J

    .line 191
    iget-wide v0, p1, Lcrittercism/android/bg;->m:J

    iput-wide v0, p0, Lcrittercism/android/bg;->m:J

    .line 192
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONArray;)V
    .locals 6

    .prologue
    const/4 v4, -0x1

    .line 199
    invoke-direct {p0}, Lcom/crittercism/app/Transaction;-><init>()V

    .line 70
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcrittercism/android/bg;->e:J

    .line 71
    iput v4, p0, Lcrittercism/android/bg;->f:I

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 200
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    .line 201
    invoke-static {}, Lcrittercism/android/bg$a;->values()[Lcrittercism/android/bg$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 202
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcrittercism/android/bg;->e:J

    .line 203
    const/4 v0, 0x3

    invoke-virtual {p1, v0, v4}, Lorg/json/JSONArray;->optInt(II)I

    move-result v0

    iput v0, p0, Lcrittercism/android/bg;->f:I

    .line 204
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcrittercism/android/bg;->k:Ljava/util/Map;

    .line 205
    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 206
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    .line 207
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 209
    iget-object v3, p0, Lcrittercism/android/bg;->k:Ljava/util/Map;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 211
    :cond_0
    sget-object v0, Lcrittercism/android/ed;->a:Lcrittercism/android/ed;

    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrittercism/android/ed;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->g:J

    .line 212
    sget-object v0, Lcrittercism/android/ed;->a:Lcrittercism/android/ed;

    const/4 v1, 0x6

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcrittercism/android/ed;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->h:J

    .line 214
    const/4 v0, 0x7

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONArray;->optDouble(ID)D

    move-result-wide v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    const-wide/high16 v4, 0x4022000000000000L    # 9.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lcrittercism/android/bg;->i:J

    .line 216
    sget-object v0, Lcrittercism/android/cf;->a:Lcrittercism/android/cf;

    invoke-virtual {v0}, Lcrittercism/android/cf;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/bg;->l:Ljava/lang/String;

    .line 217
    return-void
.end method

.method static synthetic a(Lcrittercism/android/bg;)Lcrittercism/android/bg$a;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    return-object v0
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 698
    invoke-static {}, Lcrittercism/android/bg;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 699
    sget-object v0, Lcrittercism/android/bg;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcrittercism/android/bg$5;

    invoke-direct {v1, p0}, Lcrittercism/android/bg$5;-><init>(Lcrittercism/android/bg;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    .line 709
    :cond_0
    return-void
.end method

.method public static a(Lcrittercism/android/aw;)V
    .locals 6

    .prologue
    .line 415
    :try_start_0
    invoke-interface {p0}, Lcrittercism/android/aw;->w()Lcrittercism/android/br;

    move-result-object v1

    .line 416
    invoke-virtual {v1}, Lcrittercism/android/br;->c()Ljava/util/List;

    move-result-object v0

    .line 417
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 418
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bp;

    .line 419
    check-cast v0, Lcrittercism/android/by;

    .line 420
    invoke-virtual {v0}, Lcrittercism/android/by;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONArray;
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    .line 421
    if-eqz v0, :cond_0

    .line 424
    :try_start_1
    new-instance v5, Lcrittercism/android/bg;

    invoke-direct {v5, v0}, Lcrittercism/android/bg;-><init>(Lorg/json/JSONArray;)V

    .line 425
    iput-wide v2, v5, Lcrittercism/android/bg;->h:J

    .line 426
    sget-object v0, Lcrittercism/android/bg$a;->h:Lcrittercism/android/bg$a;

    iput-object v0, v5, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 427
    invoke-interface {p0}, Lcrittercism/android/aw;->x()Lcrittercism/android/br;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcrittercism/android/br;->a(Lcrittercism/android/cg;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/ThreadDeath; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_0

    .line 428
    :catch_0
    move-exception v0

    :try_start_2
    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/ThreadDeath; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_0

    .line 439
    :catch_1
    move-exception v0

    throw v0

    .line 431
    :catch_2
    move-exception v0

    :try_start_3
    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catch Ljava/lang/ThreadDeath; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_0

    .line 441
    :catch_3
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    .line 444
    :goto_1
    return-void

    .line 438
    :cond_1
    :try_start_4
    invoke-virtual {v1}, Lcrittercism/android/br;->a()V
    :try_end_4
    .catch Ljava/lang/ThreadDeath; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1
.end method

.method public static a(Lcrittercism/android/az;)V
    .locals 9

    .prologue
    .line 272
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sput-wide v0, Lcrittercism/android/bg;->q:J

    .line 273
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 274
    sget-object v2, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v2

    .line 275
    :try_start_0
    sget-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 276
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 278
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bg;

    .line 279
    monitor-enter v0

    .line 280
    :try_start_1
    iget-object v3, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v4, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v3, v4, :cond_0

    .line 281
    iget-wide v3, v0, Lcrittercism/android/bg;->m:J

    sget-wide v5, Lcrittercism/android/bg;->p:J

    cmp-long v3, v3, v5

    if-ltz v3, :cond_1

    .line 290
    iget-wide v3, v0, Lcrittercism/android/bg;->m:J

    sget-wide v5, Lcrittercism/android/bg;->q:J

    cmp-long v3, v3, v5

    if-gtz v3, :cond_0

    .line 291
    iget-wide v3, v0, Lcrittercism/android/bg;->i:J

    sget-wide v5, Lcrittercism/android/bg;->q:J

    iget-wide v7, v0, Lcrittercism/android/bg;->m:J

    sub-long/2addr v5, v7

    add-long/2addr v3, v5

    iput-wide v3, v0, Lcrittercism/android/bg;->i:J

    .line 299
    :cond_0
    :goto_1
    invoke-direct {v0}, Lcrittercism/android/bg;->r()V

    .line 300
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 276
    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    .line 296
    :cond_1
    :try_start_2
    iget-wide v3, v0, Lcrittercism/android/bg;->i:J

    sget-wide v5, Lcrittercism/android/bg;->q:J

    sget-wide v7, Lcrittercism/android/bg;->p:J

    sub-long/2addr v5, v7

    add-long/2addr v3, v5

    iput-wide v3, v0, Lcrittercism/android/bg;->i:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 301
    :cond_2
    new-instance v0, Lcrittercism/android/bg$1;

    invoke-direct {v0, v1, p0}, Lcrittercism/android/bg$1;-><init>(Ljava/util/List;Lcrittercism/android/az;)V

    .line 318
    new-instance v1, Ljava/util/concurrent/FutureTask;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 319
    sget-object v2, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v2

    .line 320
    :try_start_3
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 321
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 329
    :try_start_4
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1

    .line 335
    :goto_2
    return-void

    .line 321
    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    .line 330
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 332
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method private a(Lcrittercism/android/bg$a;)V
    .locals 4

    .prologue
    .line 657
    sget-object v0, Lcrittercism/android/bg$a;->c:Lcrittercism/android/bg$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcrittercism/android/bg$a;->e:Lcrittercism/android/bg$a;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcrittercism/android/bg$a;->i:Lcrittercism/android/bg$a;

    .line 660
    :cond_0
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v0, v1, :cond_2

    .line 661
    invoke-direct {p0}, Lcrittercism/android/bg;->r()V

    .line 662
    invoke-direct {p0, p1}, Lcrittercism/android/bg;->b(Lcrittercism/android/bg$a;)V

    .line 668
    :cond_1
    :goto_0
    return-void

    .line 663
    :cond_2
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->f:Lcrittercism/android/bg$a;

    if-eq v0, v1, :cond_1

    .line 664
    const-string v0, "Crittercism"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transaction "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not running. Either it has not been started or it has been stopped."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Transaction is not running"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static a(Lcrittercism/android/bh;)V
    .locals 0

    .prologue
    .line 141
    sput-object p0, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    .line 143
    return-void
.end method

.method public static b(Lcrittercism/android/az;)Ljava/util/List;
    .locals 11

    .prologue
    .line 341
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 342
    sget-object v1, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v1

    .line 343
    :try_start_0
    sget-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 344
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 346
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 347
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    .line 349
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_2

    .line 350
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bg;

    .line 351
    monitor-enter v0

    .line 352
    :try_start_1
    iget-object v7, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v8, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v7, v8, :cond_1

    .line 353
    iput-wide v3, v0, Lcrittercism/android/bg;->h:J

    .line 354
    sget-object v7, Lcrittercism/android/bg$a;->g:Lcrittercism/android/bg$a;

    iput-object v7, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 357
    invoke-static {}, Lcrittercism/android/bg;->l()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 358
    sget-wide v7, Lcrittercism/android/bg;->p:J

    iget-wide v9, v0, Lcrittercism/android/bg;->m:J

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    .line 360
    iget-wide v9, v0, Lcrittercism/android/bg;->i:J

    sub-long v7, v5, v7

    add-long/2addr v7, v9

    iput-wide v7, v0, Lcrittercism/android/bg;->i:J

    .line 365
    :cond_0
    :goto_1
    invoke-direct {v0}, Lcrittercism/android/bg;->r()V

    .line 366
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 349
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0

    .line 344
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 363
    :cond_1
    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 366
    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    .line 376
    :cond_2
    new-instance v0, Lcrittercism/android/bg$2;

    invoke-direct {v0, p0}, Lcrittercism/android/bg$2;-><init>(Lcrittercism/android/az;)V

    .line 384
    new-instance v1, Ljava/util/concurrent/FutureTask;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 385
    sget-object v3, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v3

    .line 386
    :try_start_3
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 387
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 388
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 392
    :try_start_4
    invoke-virtual {v1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1

    .line 399
    :goto_2
    return-object v2

    .line 388
    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    .line 393
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 395
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_2
.end method

.method private declared-synchronized b(I)V
    .locals 4

    .prologue
    .line 768
    monitor-enter p0

    if-gez p1, :cond_0

    .line 769
    :try_start_0
    const-string v0, "Crittercism"

    const-string v1, "Ignoring Transaction.setValue(int) call. Negative parameter provided."

    invoke-static {v0, v1}, Lcrittercism/android/dx;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 798
    :goto_0
    monitor-exit p0

    return-void

    .line 774
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->a:Lcrittercism/android/bg$a;

    if-ne v0, v1, :cond_1

    .line 775
    iput p1, p0, Lcrittercism/android/bg;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 768
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 776
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v0, v1, :cond_2

    .line 777
    iput p1, p0, Lcrittercism/android/bg;->f:I

    .line 778
    new-instance v0, Lcrittercism/android/bg;

    invoke-direct {v0, p0}, Lcrittercism/android/bg;-><init>(Lcrittercism/android/bg;)V

    .line 781
    new-instance v1, Lcrittercism/android/bg$7;

    invoke-direct {v1, p0, v0}, Lcrittercism/android/bg$7;-><init>(Lcrittercism/android/bg;Lcrittercism/android/bg;)V

    .line 789
    sget-object v2, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 790
    :try_start_3
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 791
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v2

    throw v0

    .line 792
    :cond_2
    const-string v0, "Crittercism"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transaction "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " no longer in progress. Ignoring setValue(int) call."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Transaction no longer in progress"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0
.end method

.method private b(Lcrittercism/android/bg$a;)V
    .locals 6

    .prologue
    .line 728
    iput-object p1, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 729
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->h:J

    .line 730
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    .line 733
    invoke-static {}, Lcrittercism/android/bg;->l()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 734
    sget-wide v2, Lcrittercism/android/bg;->p:J

    iget-wide v4, p0, Lcrittercism/android/bg;->m:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    .line 735
    iget-wide v4, p0, Lcrittercism/android/bg;->i:J

    sub-long/2addr v0, v2

    add-long/2addr v0, v4

    iput-wide v0, p0, Lcrittercism/android/bg;->i:J

    .line 738
    :cond_0
    sget-object v1, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v1

    .line 739
    :try_start_0
    sget-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 740
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 741
    new-instance v0, Lcrittercism/android/bg;

    invoke-direct {v0, p0}, Lcrittercism/android/bg;-><init>(Lcrittercism/android/bg;)V

    .line 742
    new-instance v1, Lcrittercism/android/bg$6;

    invoke-direct {v1, p0, v0}, Lcrittercism/android/bg$6;-><init>(Lcrittercism/android/bg;Lcrittercism/android/bg;)V

    .line 751
    sget-object v2, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v2

    .line 752
    :try_start_1
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 753
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    .line 740
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    .line 753
    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0
.end method

.method static synthetic b(Lcrittercism/android/bg;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcrittercism/android/bg;->s()V

    return-void
.end method

.method static synthetic c(Lcrittercism/android/bg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcrittercism/android/bg;->l:Ljava/lang/String;

    return-object v0
.end method

.method public static c(Lcrittercism/android/az;)V
    .locals 8

    .prologue
    .line 448
    :try_start_0
    new-instance v1, Lcrittercism/android/bg;

    const-string v0, "App Load"

    invoke-direct {v1, p0, v0}, Lcrittercism/android/bg;-><init>(Lcrittercism/android/az;Ljava/lang/String;)V

    sput-object v1, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {}, Lcrittercism/android/bg;->m()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    sget-object v4, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    iput-object v4, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v4, v2

    sub-long v4, v6, v4

    iput-wide v4, v0, Lcrittercism/android/bg;->g:J

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v2, v3, v5}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v2, v4, v2

    sub-long v2, v6, v2

    iput-wide v2, v0, Lcrittercism/android/bg;->m:J

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    sget-object v2, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    sget-object v3, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    iget-object v3, v3, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcrittercism/android/bh;->a(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcrittercism/android/bg;->e:J

    sget-object v2, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    sget-object v3, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    new-instance v0, Lcrittercism/android/bg;

    sget-object v2, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    invoke-direct {v0, v2}, Lcrittercism/android/bg;-><init>(Lcrittercism/android/bg;)V

    new-instance v2, Lcrittercism/android/bg$3;

    invoke-direct {v2, p0, v0}, Lcrittercism/android/bg$3;-><init>(Lcrittercism/android/az;Lcrittercism/android/bg;)V

    sget-object v3, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    sget-object v2, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    iget-wide v4, v2, Lcrittercism/android/bg;->e:J

    invoke-direct {v0, v4, v5}, Lcrittercism/android/bg;->a(J)V

    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_0
    :try_start_5
    monitor-exit v1

    .line 454
    :goto_0
    return-void

    .line 448
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v1

    throw v0
    :try_end_6
    .catch Ljava/lang/ThreadDeath; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1

    .line 453
    :catch_0
    move-exception v0

    throw v0

    .line 448
    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v3

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 451
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static f()V
    .locals 9

    .prologue
    .line 220
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sput-wide v0, Lcrittercism/android/bg;->p:J

    .line 221
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 222
    sget-object v1, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v1

    .line 223
    :try_start_0
    sget-object v2, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 224
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 236
    sget-object v1, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    if-eqz v1, :cond_0

    .line 237
    sget-wide v1, Lcrittercism/android/bg;->q:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 238
    sget-object v1, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    monitor-enter v1

    .line 239
    :try_start_1
    sget-object v2, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    iget-wide v3, v2, Lcrittercism/android/bg;->i:J

    sget-wide v5, Lcrittercism/android/bg;->p:J

    sget-object v7, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    iget-wide v7, v7, Lcrittercism/android/bg;->m:J

    sub-long/2addr v5, v7

    add-long/2addr v3, v5

    iput-wide v3, v2, Lcrittercism/android/bg;->i:J

    .line 240
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 245
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bg;

    .line 246
    monitor-enter v0

    .line 247
    :try_start_2
    iget-object v2, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v3, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v2, v3, :cond_1

    .line 248
    iget-object v2, v0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v2}, Ljava/util/concurrent/ScheduledFuture;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 251
    iget-wide v2, v0, Lcrittercism/android/bg;->e:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v5, v0, Lcrittercism/android/bg;->i:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-direct {v0, v2, v3}, Lcrittercism/android/bg;->a(J)V

    .line 261
    :cond_1
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 224
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    .line 240
    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0

    .line 255
    :cond_2
    :try_start_3
    iget-object v2, v0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    if-nez v2, :cond_1

    .line 258
    iget-wide v2, v0, Lcrittercism/android/bg;->e:J

    invoke-direct {v0, v2, v3}, Lcrittercism/android/bg;->a(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    .line 262
    :cond_3
    return-void
.end method

.method public static g()V
    .locals 1

    .prologue
    .line 550
    :try_start_0
    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    if-eqz v0, :cond_0

    sget-object v0, Lcrittercism/android/bg;->s:Lcrittercism/android/bg;

    invoke-virtual {v0}, Lcrittercism/android/bg;->b()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 556
    :cond_0
    :goto_0
    return-void

    .line 551
    :catch_0
    move-exception v0

    throw v0

    .line 553
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public static i()V
    .locals 4

    .prologue
    .line 674
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 675
    sget-object v1, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v1

    .line 676
    :try_start_0
    sget-object v2, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 677
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 679
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcrittercism/android/bg;

    .line 680
    monitor-enter v0

    .line 681
    :try_start_1
    iget-object v2, v0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v3, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v2, v3, :cond_0

    .line 682
    sget-object v2, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    iget-object v3, v0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcrittercism/android/bh;->a(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, v0, Lcrittercism/android/bg;->e:J

    .line 683
    invoke-direct {v0}, Lcrittercism/android/bg;->r()V

    .line 687
    iget-wide v2, v0, Lcrittercism/android/bg;->e:J

    invoke-direct {v0, v2, v3}, Lcrittercism/android/bg;->a(J)V

    .line 689
    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 677
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    .line 690
    :cond_1
    return-void
.end method

.method private static l()Z
    .locals 4

    .prologue
    .line 266
    sget-wide v0, Lcrittercism/android/bg;->p:J

    sget-wide v2, Lcrittercism/android/bg;->q:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static m()J
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v9, 0x0

    const-wide/16 v1, -0x1

    .line 515
    new-array v3, v0, [J

    .line 517
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    .line 518
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "/proc/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, "/stat"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 520
    :try_start_0
    const-class v4, Landroid/os/Process;

    .line 523
    const-string v5, "readProcFile"

    const/4 v6, 0x5

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    const/4 v7, 0x1

    const-class v8, [I

    aput-object v8, v6, v7

    const/4 v7, 0x2

    const-class v8, [Ljava/lang/String;

    aput-object v8, v6, v7

    const/4 v7, 0x3

    const-class v8, [J

    aput-object v8, v6, v7

    const/4 v7, 0x4

    const-class v8, [F

    aput-object v8, v6, v7

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 525
    const/4 v5, 0x0

    const/4 v6, 0x5

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    sget-object v7, Lcrittercism/android/bg;->r:[I

    aput-object v7, v6, v0

    const/4 v0, 0x2

    const/4 v7, 0x0

    aput-object v7, v6, v0

    const/4 v0, 0x3

    aput-object v3, v6, v0

    const/4 v0, 0x4

    const/4 v7, 0x0

    aput-object v7, v6, v0

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    .line 527
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-nez v0, :cond_0

    move-wide v0, v1

    .line 545
    :goto_0
    return-wide v0

    .line 530
    :catch_0
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    move-wide v0, v1

    .line 532
    goto :goto_0

    .line 533
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    move-wide v0, v1

    .line 535
    goto :goto_0

    .line 536
    :catch_2
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    move-wide v0, v1

    .line 538
    goto :goto_0

    .line 539
    :catch_3
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    move-wide v0, v1

    .line 541
    goto :goto_0

    .line 545
    :cond_0
    aget-wide v0, v3, v9

    const-wide/16 v2, 0xa

    mul-long/2addr v0, v2

    goto :goto_0
.end method

.method private declared-synchronized n()V
    .locals 4

    .prologue
    .line 577
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->a:Lcrittercism/android/bg$a;

    if-ne v0, v1, :cond_0

    .line 578
    sget-object v0, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    iput-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    .line 579
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->g:J

    .line 580
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->m:J

    .line 581
    sget-object v0, Lcrittercism/android/bg;->t:Lcrittercism/android/bh;

    iget-object v1, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcrittercism/android/bh;->a(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bg;->e:J

    .line 582
    sget-object v1, Lcrittercism/android/bg;->o:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 583
    :try_start_1
    sget-object v0, Lcrittercism/android/bg;->o:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 585
    :try_start_2
    new-instance v0, Lcrittercism/android/bg;

    invoke-direct {v0, p0}, Lcrittercism/android/bg;-><init>(Lcrittercism/android/bg;)V

    .line 586
    new-instance v1, Lcrittercism/android/bg$4;

    invoke-direct {v1, p0, v0}, Lcrittercism/android/bg$4;-><init>(Lcrittercism/android/bg;Lcrittercism/android/bg;)V

    .line 594
    sget-object v2, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 595
    :try_start_3
    sget-object v0, Lcrittercism/android/bg;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 603
    iget-wide v0, p0, Lcrittercism/android/bg;->e:J

    invoke-direct {p0, v0, v1}, Lcrittercism/android/bg;->a(J)V

    .line 604
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 610
    :goto_0
    monitor-exit p0

    return-void

    .line 584
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 577
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    .line 604
    :catchall_2
    move-exception v0

    :try_start_5
    monitor-exit v2

    throw v0

    .line 605
    :cond_0
    const-string v0, "Crittercism"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Transaction "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " has already been started."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Transaction has already started"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcrittercism/android/dx;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0
.end method

.method private declared-synchronized o()V
    .locals 1

    .prologue
    .line 624
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcrittercism/android/bg$a;->c:Lcrittercism/android/bg$a;

    invoke-direct {p0, v0}, Lcrittercism/android/bg;->a(Lcrittercism/android/bg$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 625
    monitor-exit p0

    return-void

    .line 624
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized p()V
    .locals 1

    .prologue
    .line 639
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcrittercism/android/bg$a;->e:Lcrittercism/android/bg$a;

    invoke-direct {p0, v0}, Lcrittercism/android/bg;->a(Lcrittercism/android/bg$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 640
    monitor-exit p0

    return-void

    .line 639
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized q()V
    .locals 1

    .prologue
    .line 653
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcrittercism/android/bg$a;->i:Lcrittercism/android/bg$a;

    invoke-direct {p0, v0}, Lcrittercism/android/bg;->a(Lcrittercism/android/bg$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 654
    monitor-exit p0

    return-void

    .line 653
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized r()V
    .locals 2

    .prologue
    .line 715
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 717
    iget-object v0, p0, Lcrittercism/android/bg;->n:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 719
    :cond_0
    monitor-exit p0

    return-void

    .line 715
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized s()V
    .locals 2

    .prologue
    .line 722
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    sget-object v1, Lcrittercism/android/bg$a;->b:Lcrittercism/android/bg$a;

    if-ne v0, v1, :cond_0

    .line 723
    sget-object v0, Lcrittercism/android/bg$a;->f:Lcrittercism/android/bg$a;

    invoke-direct {p0, v0}, Lcrittercism/android/bg;->b(Lcrittercism/android/bg$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 725
    :cond_0
    monitor-exit p0

    return-void

    .line 722
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized t()I
    .locals 1

    .prologue
    .line 813
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcrittercism/android/bg;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 568
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/bg;->n()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 574
    :goto_0
    return-void

    .line 569
    :catch_0
    move-exception v0

    throw v0

    .line 571
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 759
    :try_start_0
    invoke-direct {p0, p1}, Lcrittercism/android/bg;->b(I)V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 765
    :goto_0
    return-void

    .line 760
    :catch_0
    move-exception v0

    throw v0

    .line 762
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Ljava/io/OutputStream;)V
    .locals 2

    .prologue
    .line 877
    const/4 v0, 0x0

    .line 879
    :try_start_0
    invoke-virtual {p0}, Lcrittercism/android/bg;->j()Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 883
    :goto_0
    if-eqz v0, :cond_0

    .line 884
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    .line 885
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 887
    :cond_0
    return-void

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 615
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/bg;->o()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 621
    :goto_0
    return-void

    .line 616
    :catch_0
    move-exception v0

    throw v0

    .line 618
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 630
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/bg;->p()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 636
    :goto_0
    return-void

    .line 631
    :catch_0
    move-exception v0

    throw v0

    .line 633
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 803
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/bg;->t()I
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    .line 808
    :goto_0
    return v0

    .line 804
    :catch_0
    move-exception v0

    throw v0

    .line 806
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    .line 808
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 872
    iget-object v0, p0, Lcrittercism/android/bg;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 644
    :try_start_0
    invoke-direct {p0}, Lcrittercism/android/bg;->q()V
    :try_end_0
    .catch Ljava/lang/ThreadDeath; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 650
    :goto_0
    return-void

    .line 645
    :catch_0
    move-exception v0

    throw v0

    .line 647
    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final j()Lorg/json/JSONArray;
    .locals 9

    .prologue
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 854
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iget-object v1, p0, Lcrittercism/android/bg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    iget-object v1, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    invoke-virtual {v1}, Lcrittercism/android/bg$a;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    move-result-object v0

    iget-wide v1, p0, Lcrittercism/android/bg;->e:J

    long-to-double v1, v1

    div-double/2addr v1, v7

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    move-result-object v1

    iget v0, p0, Lcrittercism/android/bg;->f:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    iget-object v2, p0, Lcrittercism/android/bg;->k:Ljava/util/Map;

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    sget-object v1, Lcrittercism/android/ed;->a:Lcrittercism/android/ed;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Lcrittercism/android/bg;->g:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Lcrittercism/android/ed;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    sget-object v1, Lcrittercism/android/ed;->a:Lcrittercism/android/ed;

    new-instance v2, Ljava/util/Date;

    iget-wide v3, p0, Lcrittercism/android/bg;->h:J

    invoke-direct {v2, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v2}, Lcrittercism/android/ed;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    .line 862
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_1

    .line 863
    iget-wide v1, p0, Lcrittercism/android/bg;->i:J

    long-to-double v1, v1

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    const-wide/high16 v5, 0x4022000000000000L    # 9.0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    div-double/2addr v1, v3

    mul-double/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-double v1, v1

    div-double/2addr v1, v7

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONArray;->put(D)Lorg/json/JSONArray;

    .line 867
    :goto_1
    return-object v0

    .line 854
    :cond_0
    iget v0, p0, Lcrittercism/android/bg;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    .line 865
    :cond_1
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1
.end method

.method public final k()Lcrittercism/android/bg$a;
    .locals 1

    .prologue
    .line 921
    iget-object v0, p0, Lcrittercism/android/bg;->j:Lcrittercism/android/bg$a;

    return-object v0
.end method
