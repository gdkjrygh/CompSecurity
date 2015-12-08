.class public final Lcom/kik/cards/web/plugin/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/cards/web/plugin/h$c;,
        Lcom/kik/cards/web/plugin/h$a;,
        Lcom/kik/cards/web/plugin/h$b;
    }
.end annotation


# static fields
.field private static final l:Lorg/c/b;


# instance fields
.field a:Ljava/util/Map;

.field private b:Lcom/kik/g/k;

.field private c:Ljava/util/Map;

.field private d:Ljava/util/Map;

.field private e:Ljava/util/Map;

.field private f:Lcom/kik/cards/web/ax;

.field private g:Lcom/kik/g/f;

.field private h:Lcom/kik/m/a;

.field private i:Ljava/lang/String;

.field private j:Z

.field private k:Lcom/kik/cards/web/plugin/b;

.field private m:Lkik/a/f/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 131
    const-string v0, "CardsWebPluginReg"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Lcom/kik/m/a;Ljava/lang/String;Lkik/a/f/k;)V
    .locals 2

    .prologue
    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->a:Ljava/util/Map;

    .line 35
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->b:Lcom/kik/g/k;

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    .line 123
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    .line 125
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->f:Lcom/kik/cards/web/ax;

    .line 126
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->g:Lcom/kik/g/f;

    .line 130
    new-instance v0, Lcom/kik/cards/web/plugin/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/cards/web/plugin/h$a;-><init>(Lcom/kik/cards/web/plugin/h;B)V

    iput-object v0, p0, Lcom/kik/cards/web/plugin/h;->k:Lcom/kik/cards/web/plugin/b;

    .line 136
    iput-object p1, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    .line 137
    iput-object p2, p0, Lcom/kik/cards/web/plugin/h;->i:Ljava/lang/String;

    .line 138
    iput-object p3, p0, Lcom/kik/cards/web/plugin/h;->m:Lkik/a/f/k;

    .line 139
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/plugin/h;)Lcom/kik/cards/web/ax;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->f:Lcom/kik/cards/web/ax;

    return-object v0
.end method

.method private a(Ljava/lang/String;)Lcom/kik/cards/web/plugin/d;
    .locals 6

    .prologue
    .line 160
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/d;

    .line 161
    if-eqz v0, :cond_3

    .line 163
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 164
    if-eqz v1, :cond_0

    .line 165
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/h$b;

    .line 166
    iget-object v3, p0, Lcom/kik/cards/web/plugin/h;->g:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->i()Lcom/kik/g/e;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lcom/kik/g/f;->b(Lcom/kik/g/e;Lcom/kik/g/i;)V

    goto :goto_0

    .line 170
    :cond_0
    iget-object v2, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    monitor-enter v2

    .line 172
    :try_start_0
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 173
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 174
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 177
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 179
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f_()V

    .line 181
    :cond_3
    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 5

    .prologue
    .line 469
    const/4 v2, 0x0

    .line 470
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 471
    if-eqz v0, :cond_2

    .line 472
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/h$b;

    .line 473
    iget-object v4, v1, Lcom/kik/cards/web/plugin/h$b;->a:Ljava/lang/String;

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    move-object v2, v1

    .line 476
    goto :goto_0

    .line 478
    :cond_0
    if-eqz v2, :cond_1

    .line 479
    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 480
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->g:Lcom/kik/g/f;

    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/d;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->i()Lcom/kik/g/e;

    move-result-object v0

    invoke-virtual {v1, v0, v2}, Lcom/kik/g/f;->b(Lcom/kik/g/e;Lcom/kik/g/i;)V

    .line 483
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 491
    :goto_2
    return-object v0

    .line 487
    :cond_1
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_2

    .line 491
    :cond_2
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_2

    :cond_3
    move-object v1, v2

    goto :goto_1
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    .locals 10

    .prologue
    const/4 v3, 0x0

    .line 416
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    const-string v1, "name"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/d;

    .line 417
    if-nez v0, :cond_0

    .line 418
    sget-object v0, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    const-string v1, "Plugin not found: {}"

    const-string v2, "name"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 419
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 464
    :goto_0
    return-object v0

    .line 422
    :cond_0
    invoke-virtual {v0, p2}, Lcom/kik/cards/web/plugin/d;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 423
    sget-object v1, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    const-string v2, "Plugin access forbidden: {}"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 424
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x193

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0

    .line 427
    :cond_1
    new-instance v2, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v2}, Lcom/kik/cards/web/plugin/j;-><init>()V

    .line 428
    invoke-virtual {v2}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "version"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->g()I

    move-result v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 429
    invoke-virtual {v2}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "name"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 431
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v5

    array-length v6, v5

    move v1, v3

    :goto_1
    if-ge v1, v6, :cond_4

    aget-object v7, v5, v1

    const-class v8, Lcom/kik/cards/web/plugin/g;

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    if-eqz v8, :cond_3

    new-instance v8, Lcom/kik/cards/web/plugin/h$c;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v7, v0, v9}, Lcom/kik/cards/web/plugin/h$c;-><init>(Ljava/lang/reflect/Method;Lcom/kik/cards/web/plugin/d;Ljava/lang/String;)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const-class v8, Lcom/kik/cards/web/plugin/c;

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    if-eqz v8, :cond_2

    new-instance v8, Lcom/kik/cards/web/plugin/h$c;

    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v7, v0, v9, v3}, Lcom/kik/cards/web/plugin/h$c;-><init>(Ljava/lang/reflect/Method;Lcom/kik/cards/web/plugin/d;Ljava/lang/String;B)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 432
    :cond_4
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 433
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/h$c;

    .line 435
    invoke-virtual {v1}, Lcom/kik/cards/web/plugin/h$c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 437
    iget-object v5, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    monitor-enter v5

    .line 439
    :try_start_0
    iget-object v6, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/kik/cards/web/plugin/h$c;->e()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 441
    :cond_5
    invoke-virtual {v2}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v1

    const-string v4, "functions"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 444
    const-string v1, "eventCallback"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 445
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_7

    .line 446
    new-instance v3, Lcom/kik/cards/web/plugin/h$b;

    invoke-direct {v3, p0, v1}, Lcom/kik/cards/web/plugin/h$b;-><init>(Lcom/kik/cards/web/plugin/h;Ljava/lang/String;)V

    .line 448
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 449
    if-nez v1, :cond_6

    .line 450
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 451
    iget-object v4, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    :cond_6
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 455
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->g:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->i()Lcom/kik/g/e;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 457
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->h()Ljava/util/List;

    move-result-object v1

    .line 458
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/f;

    .line 459
    invoke-virtual {v3, v1}, Lcom/kik/cards/web/plugin/h$b;->a(Lcom/kik/cards/web/plugin/f;)V

    goto :goto_4

    .line 463
    :cond_7
    sget-object v1, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    const-string v3, "Success requesting plugin: {}"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v3, v0}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v0, v2

    .line 464
    goto/16 :goto_0
.end method

.method static synthetic b(Lcom/kik/cards/web/plugin/h;)Lcom/kik/cards/web/plugin/b;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->k:Lcom/kik/cards/web/plugin/b;

    return-object v0
.end method

.method static synthetic e()Lorg/c/b;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    return-object v0
.end method

.method private f()Lcom/kik/cards/web/plugin/j;
    .locals 8

    .prologue
    .line 390
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 392
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v0}, Lcom/kik/m/a;->a()Ljava/lang/String;

    move-result-object v0

    .line 393
    iget-object v2, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v2}, Lcom/kik/m/a;->c()Ljava/lang/String;

    move-result-object v2

    .line 394
    iget-object v3, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v3}, Lcom/kik/m/a;->d()Ljava/lang/String;

    move-result-object v3

    .line 395
    iget-object v4, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v4}, Lcom/kik/m/a;->e()Ljava/lang/String;

    move-result-object v4

    .line 396
    iget-object v5, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v5}, Lcom/kik/m/a;->f()Ljava/lang/String;

    move-result-object v5

    .line 397
    iget-object v6, p0, Lcom/kik/cards/web/plugin/h;->m:Lkik/a/f/k;

    invoke-interface {v6}, Lkik/a/f/k;->i()Ljava/lang/String;

    move-result-object v6

    .line 399
    const-string v7, "version"

    invoke-virtual {v1, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 400
    const-string v0, "feature"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 401
    const-string v0, "buildDate"

    invoke-virtual {v1, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 402
    const-string v0, "machineName"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 403
    const-string v0, "commit"

    invoke-virtual {v1, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 404
    const-string v0, "metricsUrl"

    invoke-static {v6}, Lkik/android/util/cq;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    :goto_0
    return-object v0

    .line 406
    :catch_0
    move-exception v0

    .line 407
    sget-object v1, Lcom/kik/cards/web/plugin/h;->l:Lorg/c/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Error generating requestVersion result: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 408
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->b:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .prologue
    const/16 v8, 0x1f4

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 300
    .line 304
    if-eqz p2, :cond_0

    :try_start_0
    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 305
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    move-object v1, v0

    .line 312
    :goto_0
    const-string v0, "requestPlugin"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 313
    invoke-direct {p0, v1, p3}, Lcom/kik/cards/web/plugin/h;->a(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move v2, v3

    .line 361
    :goto_1
    if-nez v0, :cond_1

    .line 362
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v8}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    .line 365
    :cond_1
    if-nez v2, :cond_2

    .line 366
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->b:Lcom/kik/g/k;

    invoke-virtual {v1, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 367
    iput-boolean v3, p0, Lcom/kik/cards/web/plugin/h;->j:Z

    .line 371
    :cond_2
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 373
    :try_start_1
    const-string v2, "status"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/j;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 374
    const-string v2, "data"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 380
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    return-object v0

    .line 308
    :cond_3
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    goto :goto_0

    .line 317
    :cond_4
    const-string v0, "requestVersion"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 318
    invoke-direct {p0}, Lcom/kik/cards/web/plugin/h;->f()Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    goto :goto_1

    .line 320
    :cond_5
    const-string v0, "unbindCallback"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 321
    const-string v0, "name"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "eventCallback"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/kik/cards/web/plugin/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v0

    goto :goto_1

    .line 324
    :cond_6
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/h$c;

    .line 326
    if-nez v0, :cond_7

    .line 327
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 350
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 353
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_1

    .line 329
    :cond_7
    :try_start_3
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->d()Z

    move-result v4

    if-eqz v4, :cond_8

    .line 330
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 355
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 358
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v0, v8}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 333
    :cond_8
    :try_start_4
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->a()Ljava/lang/reflect/Method;

    move-result-object v4

    .line 335
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-ne v5, v3, :cond_9

    .line 336
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->c()Lcom/kik/cards/web/plugin/d;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/j;

    .line 342
    :goto_3
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->c()Lcom/kik/cards/web/plugin/d;

    move-result-object v0

    .line 344
    if-eqz v0, :cond_a

    .line 345
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/d;->b()Z

    move-result v0

    :goto_4
    move v2, v0

    move-object v0, v1

    .line 359
    goto/16 :goto_1

    .line 339
    :cond_9
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->c()Lcom/kik/cards/web/plugin/d;

    move-result-object v5

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v1, 0x1

    aput-object p3, v6, v1

    invoke-virtual {v4, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/cards/web/plugin/j;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_3

    .line 377
    :catch_2
    move-exception v0

    const-string v0, "{status: 500, data: {}, wtf: true}"

    goto/16 :goto_2

    :cond_a
    move v0, v2

    goto :goto_4
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v5, 0x2

    const/4 v6, 0x1

    .line 215
    if-eqz p2, :cond_0

    :try_start_0
    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    move-object v1, v0

    .line 223
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/h$c;

    .line 224
    if-nez v0, :cond_2

    .line 225
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x194

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 281
    :goto_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 283
    :try_start_1
    const-string v2, "status"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/j;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 284
    const-string v2, "data"

    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    .line 290
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->b:Lcom/kik/g/k;

    invoke-virtual {v0, p1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 291
    iput-boolean v6, p0, Lcom/kik/cards/web/plugin/h;->j:Z

    .line 293
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 294
    :goto_2
    return-object v0

    .line 220
    :cond_1
    :try_start_2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    goto :goto_0

    .line 227
    :cond_2
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->d()Z

    move-result v2

    if-nez v2, :cond_3

    .line 230
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x195

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    .line 261
    :catch_0
    move-exception v0

    .line 262
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 263
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 268
    :goto_3
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto :goto_1

    .line 233
    :cond_3
    :try_start_3
    new-instance v2, Lcom/kik/cards/web/plugin/i;

    invoke-direct {v2, p0, p1, p3}, Lcom/kik/cards/web/plugin/i;-><init>(Lcom/kik/cards/web/plugin/h;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->a()Ljava/lang/reflect/Method;

    move-result-object v3

    .line 253
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    if-ne v4, v5, :cond_4

    .line 254
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->c()Lcom/kik/cards/web/plugin/d;

    move-result-object v0

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/j;

    goto :goto_1

    .line 257
    :cond_4
    invoke-virtual {v0}, Lcom/kik/cards/web/plugin/h$c;->c()Lcom/kik/cards/web/plugin/d;

    move-result-object v0

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const/4 v2, 0x1

    aput-object v1, v4, v2

    const/4 v1, 0x2

    aput-object p4, v4, v1

    invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/web/plugin/j;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1

    .line 266
    :cond_5
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 270
    :catch_1
    move-exception v0

    .line 271
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 272
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 277
    :goto_4
    new-instance v0, Lcom/kik/cards/web/plugin/j;

    const/16 v1, 0x1f4

    invoke-direct {v0, v1}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    goto/16 :goto_1

    .line 275
    :cond_6
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_4

    .line 287
    :catch_2
    move-exception v0

    const-string v0, "{status: 500, data: {}, wtf: true}"

    goto/16 :goto_2
.end method

.method public final a(Lcom/kik/cards/web/ax;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/kik/cards/web/plugin/h;->f:Lcom/kik/cards/web/ax;

    .line 207
    return-void
.end method

.method public final a(Lcom/kik/cards/web/plugin/d;)V
    .locals 2

    .prologue
    .line 153
    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/h;->a(Ljava/lang/String;)Lcom/kik/cards/web/plugin/d;

    .line 155
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 148
    iget-boolean v0, p0, Lcom/kik/cards/web/plugin/h;->j:Z

    return v0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 189
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 191
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 192
    invoke-direct {p0, v0}, Lcom/kik/cards/web/plugin/h;->a(Ljava/lang/String;)Lcom/kik/cards/web/plugin/d;

    goto :goto_0

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 196
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 197
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/plugin/h;->j:Z

    .line 199
    iget-object v1, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    monitor-enter v1

    .line 200
    :try_start_0
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 201
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/kik/cards/web/plugin/h;->h:Lcom/kik/m/a;

    invoke-virtual {v0}, Lcom/kik/m/a;->g()Z

    move-result v0

    return v0
.end method
