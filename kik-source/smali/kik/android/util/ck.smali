.class public final Lkik/android/util/ck;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/ck$c;,
        Lkik/android/util/ck$a;,
        Lkik/android/util/ck$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private static final o:Lorg/c/b;


# instance fields
.field private b:Ljava/util/EnumMap;

.field private final c:Lkik/a/e/v;

.field private final d:Lcom/kik/l/ab;

.field private e:Lkik/a/e/r;

.field private final f:Lkik/a/e/w;

.field private final g:Lkik/a/e/l;

.field private final h:Lkik/android/d/c;

.field private i:Lcom/kik/android/a;

.field private final j:Z

.field private final k:I

.field private final l:Lkik/android/util/ar;

.field private m:Lcom/kik/g/f;

.field private n:Lcom/kik/g/k;

.field private p:Lcom/kik/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 86
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lkik/android/util/ck;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 124
    const-string v0, "SponsoredUserManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/ck;->o:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;Lkik/a/e/l;Lkik/android/d/c;ZILkik/android/util/ar;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/util/ck;->m:Lcom/kik/g/f;

    .line 122
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/util/ck;->n:Lcom/kik/g/k;

    .line 126
    new-instance v0, Lkik/android/util/cl;

    invoke-direct {v0, p0}, Lkik/android/util/cl;-><init>(Lkik/android/util/ck;)V

    iput-object v0, p0, Lkik/android/util/ck;->p:Lcom/kik/g/i;

    .line 152
    iput-object p1, p0, Lkik/android/util/ck;->c:Lkik/a/e/v;

    .line 153
    iput-object p2, p0, Lkik/android/util/ck;->d:Lcom/kik/l/ab;

    .line 154
    iput-object p3, p0, Lkik/android/util/ck;->f:Lkik/a/e/w;

    .line 155
    iput-object p4, p0, Lkik/android/util/ck;->g:Lkik/a/e/l;

    .line 156
    iput-object p5, p0, Lkik/android/util/ck;->h:Lkik/android/d/c;

    .line 157
    iput-boolean p6, p0, Lkik/android/util/ck;->j:Z

    .line 158
    iput p7, p0, Lkik/android/util/ck;->k:I

    .line 159
    iput-object p8, p0, Lkik/android/util/ck;->l:Lkik/android/util/ar;

    .line 160
    new-instance v0, Ljava/util/EnumMap;

    const-class v2, Lkik/android/util/ck$b;

    invoke-direct {v0, v2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    .line 161
    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v2

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 162
    iget-object v5, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    new-instance v6, Lkik/android/util/ck$a;

    invoke-direct {v6, v1}, Lkik/android/util/ck$a;-><init>(B)V

    invoke-virtual {v5, v4, v6}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 164
    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/util/ck;)Ljava/util/EnumMap;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    return-object v0
.end method

.method static synthetic a(Lkik/android/util/ck;Lorg/json/JSONArray;Lkik/android/util/ck$b;)V
    .locals 16

    .prologue
    .line 51
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    move-object/from16 v0, p2

    invoke-virtual {v2, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lkik/android/util/ck$a;

    iget-object v2, v9, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v9, Lkik/android/util/ck$a;->b:Ljava/util/HashSet;

    invoke-virtual {v2}, Ljava/util/HashSet;->clear()V

    iget-object v2, v9, Lkik/android/util/ck$a;->c:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->clear()V

    sget v2, Lkik/android/util/ck$a$a;->a:I

    iput v2, v9, Lkik/android/util/ck$a;->d:I

    invoke-static/range {p1 .. p1}, Lkik/android/util/ck;->a(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    move v10, v2

    :goto_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v10, v2, :cond_6

    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_2

    const-string v2, "username"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "jid"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v3

    const-string v2, "byline"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "display_pic"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v8, 0x0

    :goto_1
    const-string v2, "display_pic_last_modified"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-wide/16 v6, 0x0

    move-wide v12, v6

    :goto_2
    const-string v2, "first_name"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "last_name"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v7, "verified"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v14

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, ""

    :goto_3
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v2}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_2

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/ck;->e:Lkik/a/e/r;

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Lkik/a/e/r;->c(Ljava/lang/String;)Z

    move-result v6

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/ck;->e:Lkik/a/e/r;

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v7

    const/4 v15, 0x0

    invoke-interface {v2, v7, v15}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Lkik/a/d/k;

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v8}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v2, v14}, Lkik/a/d/k;->b(Z)V

    iget-object v4, v9, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v9, Lkik/android/util/ck$a;->b:Ljava/util/HashSet;

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v4, v9, Lkik/android/util/ck$a;->c:Ljava/util/Map;

    invoke-virtual {v3}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/util/ck;->e:Lkik/a/e/r;

    invoke-interface {v3, v2}, Lkik/a/e/r;->a(Lkik/a/d/k;)V

    :cond_2
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    goto/16 :goto_0

    :cond_3
    const-string v2, "display_pic"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_1

    :cond_4
    const-string v2, "display_pic_last_modified"

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    move-wide v12, v6

    goto/16 :goto_2

    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, " "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_6
    sget v2, Lkik/android/util/ck$a$a;->c:I

    iput v2, v9, Lkik/android/util/ck$a;->d:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/ck;->n:Lcom/kik/g/k;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_7
    return-void

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_4
.end method

.method private static a(Ljava/lang/Object;)Z
    .locals 12

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 355
    :try_start_0
    instance-of v0, p0, Lorg/json/JSONArray;

    if-eqz v0, :cond_b

    .line 356
    check-cast p0, Lorg/json/JSONArray;

    move v4, v1

    .line 357
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v4, v0, :cond_a

    .line 358
    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    .line 359
    instance-of v3, v0, Lorg/json/JSONObject;

    if-eqz v3, :cond_8

    .line 360
    check-cast v0, Lorg/json/JSONObject;

    .line 361
    const-string v3, "username"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v3

    .line 362
    const-string v5, "jid"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v5

    .line 363
    const-string v6, "byline"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v6

    .line 364
    const-string v7, "verified"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v7

    .line 365
    const-string v8, "first_name"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v8

    .line 366
    const-string v9, "last_name"

    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v9

    .line 367
    const-string v10, "display_pic"

    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    .line 368
    const-string v11, "display_pic_last_modified"

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    .line 370
    if-nez v3, :cond_1

    if-nez v5, :cond_1

    const-string v3, "jid"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v3

    if-eqz v3, :cond_0

    move v3, v2

    :goto_1
    if-eqz v3, :cond_1

    if-nez v6, :cond_1

    if-nez v7, :cond_1

    if-nez v8, :cond_1

    if-nez v9, :cond_1

    if-eqz v10, :cond_1

    if-eqz v11, :cond_1

    move v3, v2

    .line 371
    :goto_2
    if-nez v3, :cond_2

    move v0, v1

    .line 411
    :goto_3
    return v0

    :cond_0
    move v3, v1

    .line 370
    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_2

    .line 375
    :cond_2
    const-string v3, "username"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "^[\\w\\.]{2,30}$"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    move v0, v1

    .line 376
    goto :goto_3

    .line 379
    :cond_3
    const-string v3, "jid"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "^[\\w\\.]+@talk\\.kik\\.com$"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    move v0, v1

    .line 380
    goto :goto_3

    .line 383
    :cond_4
    const-string v3, "byline"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "^.{0,40}"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    move v0, v1

    .line 384
    goto :goto_3

    .line 387
    :cond_5
    const-string v3, "first_name"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "^.{1,255}$"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_6

    move v0, v1

    .line 388
    goto :goto_3

    .line 391
    :cond_6
    const-string v3, "last_name"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "^.{0,255}$"

    invoke-virtual {v3, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    move v0, v1

    .line 392
    goto :goto_3

    .line 395
    :cond_7
    const-string v3, "display_pic_last_modified"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    const-string v3, "display_pic_last_modified"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v3, "^[0-9]+$"

    invoke-virtual {v0, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_9

    move v0, v1

    .line 396
    goto :goto_3

    :cond_8
    move v0, v1

    .line 401
    goto :goto_3

    .line 357
    :cond_9
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_0

    :cond_a
    move v0, v2

    .line 404
    goto :goto_3

    .line 407
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    move v0, v1

    .line 409
    goto :goto_3

    :cond_b
    move v0, v1

    .line 411
    goto/16 :goto_3
.end method

.method static synthetic b(Lkik/android/util/ck;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/util/ck;->n:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic c(Lkik/android/util/ck;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/util/ck;->c:Lkik/a/e/v;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lkik/android/util/ck;->n:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/e/r;Lcom/kik/android/a;)V
    .locals 3

    .prologue
    .line 168
    iput-object p1, p0, Lkik/android/util/ck;->e:Lkik/a/e/r;

    .line 169
    iput-object p2, p0, Lkik/android/util/ck;->i:Lcom/kik/android/a;

    .line 171
    iget-object v0, p0, Lkik/android/util/ck;->m:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/util/ck;->e:Lkik/a/e/r;

    invoke-interface {v1}, Lkik/a/e/r;->c()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/ck;->p:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 172
    iget-object v0, p0, Lkik/android/util/ck;->m:Lcom/kik/g/f;

    iget-object v1, p0, Lkik/android/util/ck;->g:Lkik/a/e/l;

    invoke-interface {v1}, Lkik/a/e/l;->e()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lkik/android/util/ck;->p:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 173
    return-void
.end method

.method public final a(Lkik/android/util/ck$b;)V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 204
    iget-object v0, p0, Lkik/android/util/ck;->h:Lkik/android/d/c;

    iget-object v1, p0, Lkik/android/util/ck;->l:Lkik/android/util/ar;

    invoke-interface {v0, v1}, Lkik/android/d/c;->a(Lkik/android/util/ar;)Ljava/lang/String;

    move-result-object v0

    .line 207
    const-string v1, "piranha"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    :cond_0
    :goto_0
    return-void

    .line 211
    :cond_1
    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    .line 212
    iget v1, v0, Lkik/android/util/ck$a;->d:I

    sget v2, Lkik/android/util/ck$a$a;->b:I

    if-eq v1, v2, :cond_0

    .line 215
    sget v1, Lkik/android/util/ck$a$a;->b:I

    iput v1, v0, Lkik/android/util/ck$a;->d:I

    .line 217
    iget-object v0, p0, Lkik/android/util/ck;->f:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v2, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    iget v0, p0, Lkik/android/util/ck;->k:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_2

    const-string v0, "https://bot-dashboard.appspot.com/api"

    :goto_1
    sget-object v1, Lkik/android/util/ck$b;->c:Lkik/android/util/ck$b;

    if-ne p1, v1, :cond_5

    iget-object v1, p0, Lkik/android/util/ck;->i:Lcom/kik/android/a;

    invoke-virtual {v1}, Lcom/kik/android/a;->c()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "1"

    :goto_2
    const-string v3, "%s/v2/discovery/%s?username=%s&sample=%s"

    const/4 v4, 0x4

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v0, v4, v5

    iget-object v0, p1, Lkik/android/util/ck$b;->d:Ljava/lang/String;

    aput-object v0, v4, v6

    aput-object v2, v4, v7

    aput-object v1, v4, v8

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 218
    :goto_3
    new-instance v1, Lkik/android/util/ck$c;

    new-instance v2, Lkik/android/util/cm;

    invoke-direct {v2, p0, p1}, Lkik/android/util/cm;-><init>(Lkik/android/util/ck;Lkik/android/util/ck$b;)V

    new-instance v3, Lkik/android/util/cn;

    invoke-direct {v3, p0, p1}, Lkik/android/util/cn;-><init>(Lkik/android/util/ck;Lkik/android/util/ck$b;)V

    invoke-direct {v1, v0, v2, v3}, Lkik/android/util/ck$c;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)V

    .line 233
    sget-object v0, Lkik/android/util/ck;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Lkik/android/util/co;

    invoke-direct {v2, p0, v1}, Lkik/android/util/co;-><init>(Lkik/android/util/ck;Lkik/android/util/ck$c;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 217
    :cond_2
    iget-boolean v0, p0, Lkik/android/util/ck;->j:Z

    if-eqz v0, :cond_3

    const-string v0, "https://engine.kik.com/api"

    goto :goto_1

    :cond_3
    const-string v0, "https://engine.apikik.com/api"

    goto :goto_1

    :cond_4
    const-string v1, "0"

    goto :goto_2

    :cond_5
    const-string v1, "%s/v2/discovery/%s?username=%s"

    new-array v3, v8, [Ljava/lang/Object;

    aput-object v0, v3, v5

    iget-object v0, p1, Lkik/android/util/ck$b;->d:Ljava/lang/String;

    aput-object v0, v3, v6

    aput-object v2, v3, v7

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3
.end method

.method public final a(Lkik/a/d/k;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 329
    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v2

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v2, v1

    .line 330
    invoke-virtual {p0, p1, v4}, Lkik/android/util/ck;->a(Lkik/a/d/k;Lkik/android/util/ck$b;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 331
    const/4 v0, 0x1

    .line 334
    :cond_0
    return v0

    .line 329
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final a(Lkik/a/d/k;Lkik/android/util/ck$b;)Z
    .locals 1

    .prologue
    .line 343
    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v0, p2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    iget-object v0, v0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 317
    .line 318
    invoke-static {}, Lkik/android/util/ck$b;->values()[Lkik/android/util/ck$b;

    move-result-object v3

    array-length v4, v3

    move v1, v0

    move v2, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v0, v3, v1

    .line 319
    iget-object v5, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v5, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    iget-object v0, v0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v2, v0

    .line 318
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 321
    :cond_0
    return v2
.end method

.method public final b(Lkik/android/util/ck$b;)Z
    .locals 3

    .prologue
    .line 299
    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    .line 300
    iget v1, v0, Lkik/android/util/ck$a;->d:I

    sget v2, Lkik/android/util/ck$a$a;->c:I

    if-eq v1, v2, :cond_0

    iget-object v0, v0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(Lkik/android/util/ck$b;)Ljava/util/ArrayList;
    .locals 2

    .prologue
    .line 306
    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    iget-object v0, v0, Lkik/android/util/ck$a;->a:Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v1
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lkik/android/util/ck;->m:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 349
    sget-object v0, Lkik/android/util/ck;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 350
    return-void
.end method

.method public final d(Lkik/android/util/ck$b;)Ljava/util/Map;
    .locals 2

    .prologue
    .line 312
    new-instance v1, Ljava/util/HashMap;

    iget-object v0, p0, Lkik/android/util/ck;->b:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/ck$a;

    iget-object v0, v0, Lkik/android/util/ck$a;->c:Ljava/util/Map;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    return-object v1
.end method
