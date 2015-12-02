.class public Lcom/qihoo/security/adv/a/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/adv/a/a;


# instance fields
.field private final b:Lcom/qihoo/security/adv/AdvDataManager;

.field private final c:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/qihoo/security/adv/a;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/qihoo/security/adv/a/b;

.field private final f:Landroid/content/Context;

.field private final g:Lcom/qihoo/security/adv/AdvDataManager$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/qihoo/security/adv/AdvDataManager$c",
            "<",
            "Lcom/qihoo/security/adv/AdvDataManager$a;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->c:Ljava/util/Hashtable;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->d:Ljava/util/HashMap;

    .line 91
    new-instance v0, Lcom/qihoo/security/adv/a/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/adv/a/a$1;-><init>(Lcom/qihoo/security/adv/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->g:Lcom/qihoo/security/adv/AdvDataManager$c;

    .line 56
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    .line 57
    invoke-static {}, Lcom/qihoo/security/adv/a/b;->a()Lcom/qihoo/security/adv/a/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->e:Lcom/qihoo/security/adv/a/b;

    .line 58
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    .line 59
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/adv/a/a;
    .locals 2

    .prologue
    .line 62
    const-class v1, Lcom/qihoo/security/adv/a/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/adv/a/a;->a:Lcom/qihoo/security/adv/a/a;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Lcom/qihoo/security/adv/a/a;

    invoke-direct {v0}, Lcom/qihoo/security/adv/a/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/adv/a/a;->a:Lcom/qihoo/security/adv/a/a;

    .line 65
    :cond_0
    sget-object v0, Lcom/qihoo/security/adv/a/a;->a:Lcom/qihoo/security/adv/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 62
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/adv/a/a;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method private a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/a;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            "Lcom/qihoo/security/adv/a;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v11, 0x1

    const/4 v3, 0x0

    const/16 v10, 0xb

    .line 220
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 221
    invoke-virtual {p2}, Lcom/qihoo/security/adv/a;->d()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 223
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 225
    invoke-virtual {p2}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v2, v3

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 226
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->e()I

    move-result v1

    if-eqz v1, :cond_0

    .line 229
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v1

    .line 230
    if-eqz v1, :cond_3

    .line 231
    iget-object v8, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v8, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v2

    :goto_1
    move v2, v0

    .line 263
    goto :goto_0

    .line 234
    :cond_1
    invoke-virtual {v0, v11}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 236
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->d()I

    move-result v8

    if-eq v10, v8, :cond_2

    .line 237
    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 238
    invoke-virtual {v0, v10}, Lcom/qihoo/security/adv/d;->c(I)V

    .line 241
    :cond_2
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 242
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    move v0, v2

    goto :goto_1

    .line 244
    :cond_3
    invoke-virtual {p0, v0, v4}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 245
    invoke-virtual {v0, v3}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 246
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v2

    goto :goto_1

    .line 248
    :cond_4
    if-ge v2, v6, :cond_7

    .line 249
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/adv/e;

    .line 250
    invoke-virtual {v0, v11}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 251
    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->a(Lcom/qihoo/security/adv/e;)V

    .line 253
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->d()I

    move-result v8

    if-eq v10, v8, :cond_5

    .line 254
    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 255
    invoke-virtual {v0, v10}, Lcom/qihoo/security/adv/d;->c(I)V

    .line 258
    :cond_5
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    .line 260
    add-int/lit8 v2, v2, 0x1

    move v0, v2

    goto :goto_1

    .line 267
    :cond_6
    return-object v4

    :cond_7
    move v0, v2

    goto :goto_1
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/e;",
            ">;"
        }
    .end annotation

    .prologue
    .line 441
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 442
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/e;

    .line 443
    iget-object v3, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 444
    iget-object v3, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 446
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 449
    :cond_1
    return-object v1
.end method

.method private a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/d;Lcom/qihoo/security/adv/e;)V
    .locals 2

    .prologue
    const/16 v1, 0xb

    .line 413
    invoke-virtual {p2, p3}, Lcom/qihoo/security/adv/d;->a(Lcom/qihoo/security/adv/e;)V

    .line 415
    invoke-virtual {p2}, Lcom/qihoo/security/adv/d;->d()I

    move-result v0

    if-eq v1, v0, :cond_0

    .line 416
    invoke-virtual {p3}, Lcom/qihoo/security/adv/e;->j()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 417
    invoke-virtual {p2, v1}, Lcom/qihoo/security/adv/d;->c(I)V

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {p3}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    .line 421
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/adv/a/a;Ljava/util/List;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    return-void
.end method

.method private a(Ljava/util/List;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            ")V"
        }
    .end annotation

    .prologue
    .line 149
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 150
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/c;

    .line 151
    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->a()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    .line 152
    iget-object v3, p0, Lcom/qihoo/security/adv/a/a;->e:Lcom/qihoo/security/adv/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, p2, v0}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/lang/String;)V

    goto :goto_0

    .line 156
    :cond_2
    return-void
.end method

.method private a(Lcom/qihoo/security/adv/e;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 386
    iget-object v1, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 387
    iget-object v1, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/qihoo/security/adv/e;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/adv/AdvDataManager;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    :cond_0
    :goto_0
    return v0

    .line 393
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/adv/e;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 399
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/adv/a/a;)Ljava/util/Hashtable;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->c:Ljava/util/Hashtable;

    return-object v0
.end method

.method private e(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 2

    .prologue
    .line 86
    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->isShouldCache()Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->c:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    :cond_0
    return-void
.end method

.method private f(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 189
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;

    move-result-object v0

    .line 192
    if-eqz v0, :cond_2

    .line 193
    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 194
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v4

    .line 195
    if-eqz v4, :cond_0

    .line 196
    iget-object v5, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-virtual {v4}, Lcom/qihoo/security/adv/e;->f()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/qihoo360/mobilesafe/b/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 197
    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/d;->b(I)V

    .line 198
    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 199
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lcom/qihoo/security/adv/a/c;->a(I)V

    .line 208
    return-object v2

    .line 205
    :cond_2
    sget-object v0, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->PrepareAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 207
    goto :goto_1
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/String;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;",
            "Ljava/lang/String;",
            ")I"
        }
    .end annotation

    .prologue
    .line 487
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    .line 488
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    .line 489
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/c;

    .line 490
    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->a()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 495
    :goto_1
    return v0

    .line 488
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 495
    :cond_2
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 5

    .prologue
    .line 74
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/a/a;->e(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 76
    iget-object v2, p0, Lcom/qihoo/security/adv/a/a;->d:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    iget-object v2, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    iget-object v3, p0, Lcom/qihoo/security/adv/a/a;->g:Lcom/qihoo/security/adv/AdvDataManager$c;

    invoke-virtual {v2, v3, p1, v0, v1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$c;Lcom/qihoo/security/adv/AdvDataManager$AdvType;J)V

    .line 78
    return-void
.end method

.method public a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/d;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 431
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->e:Lcom/qihoo/security/adv/a/b;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 477
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v0}, Lcom/qihoo/security/adv/AdvDataManager;->b()V

    .line 478
    return-void
.end method

.method public b(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V
    .locals 2

    .prologue
    .line 134
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->b:Lcom/qihoo/security/adv/AdvDataManager;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Lcom/qihoo/security/adv/a;

    move-result-object v0

    .line 135
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 136
    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 140
    :goto_0
    return-void

    .line 138
    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    goto :goto_0
.end method

.method public declared-synchronized c(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 165
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 166
    const/4 v0, 0x0

    .line 178
    :goto_0
    monitor-exit p0

    return-object v0

    .line 168
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->c:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/a;

    .line 169
    if-nez v0, :cond_1

    .line 173
    invoke-direct {p0, p1}, Lcom/qihoo/security/adv/a/a;->f(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 178
    :cond_1
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/a;)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 165
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/adv/AdvDataManager$AdvType;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/language/b;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 312
    :goto_0
    return-object v0

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/adv/a/a;->c:Ljava/util/Hashtable;

    invoke-virtual {p1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->getMid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/a;

    .line 275
    if-nez v0, :cond_1

    move-object v0, v1

    .line 276
    goto :goto_0

    .line 282
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 284
    invoke-virtual {v0}, Lcom/qihoo/security/adv/a;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 285
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->e()I

    move-result v3

    if-eqz v3, :cond_2

    .line 291
    invoke-virtual {v0}, Lcom/qihoo/security/adv/d;->i()Lcom/qihoo/security/adv/e;

    move-result-object v3

    .line 292
    if-eqz v3, :cond_3

    .line 293
    invoke-direct {p0, v3}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/e;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 294
    invoke-direct {p0, p1, v0, v3}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Lcom/qihoo/security/adv/d;Lcom/qihoo/security/adv/e;)V

    .line 298
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 299
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 301
    :cond_3
    iget-object v3, p0, Lcom/qihoo/security/adv/a/a;->e:Lcom/qihoo/security/adv/a/b;

    invoke-virtual {v3, v0, v1}, Lcom/qihoo/security/adv/a/b;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 305
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 306
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 312
    goto :goto_0
.end method
