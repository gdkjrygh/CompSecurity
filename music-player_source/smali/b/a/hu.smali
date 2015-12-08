.class public final Lb/a/hu;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/util/List;

.field private b:Lb/a/l;

.field private c:Lb/a/x;

.field private d:Lb/a/ap;

.field private e:Lb/a/df;

.field private f:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/a/hu;->a:Ljava/util/List;

    iput-object v1, p0, Lb/a/hu;->b:Lb/a/l;

    iput-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    iput-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    iput-object v1, p0, Lb/a/hu;->e:Lb/a/df;

    iput-object v1, p0, Lb/a/hu;->f:Landroid/content/Context;

    iput-object p1, p0, Lb/a/hu;->f:Landroid/content/Context;

    return-void
.end method

.method private declared-synchronized b()Lb/a/x;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->c:Lb/a/x;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/x;

    invoke-direct {v0}, Lb/a/x;-><init>()V

    iput-object v0, p0, Lb/a/hu;->c:Lb/a/x;

    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {v0}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/x;->a(Ljava/lang/String;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {v0}, Lcom/b/a/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/x;->e(Ljava/lang/String;)Lb/a/x;

    sget-object v1, Lcom/b/a/a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/b/a/a;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    sget-object v2, Lcom/b/a/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb/a/x;->f(Ljava/lang/String;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    sget-object v2, Lcom/b/a/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb/a/x;->g(Ljava/lang/String;)Lb/a/x;

    :cond_0
    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {v0}, Lb/a/ff;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/x;->c(Ljava/lang/String;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    sget-object v2, Lb/a/eg;->a:Lb/a/eg;

    invoke-virtual {v1, v2}, Lb/a/x;->a(Lb/a/eg;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    const-string v2, "5.5.3"

    invoke-virtual {v1, v2}, Lb/a/x;->d(Ljava/lang/String;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {v0}, Lb/a/ff;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/x;->b(Ljava/lang/String;)Lb/a/x;

    iget-object v1, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {v0}, Lb/a/ff;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v0}, Lb/a/x;->a(I)Lb/a/x;

    iget-object v0, p0, Lb/a/hu;->c:Lb/a/x;

    sget v1, Lcom/b/a/a;->c:I

    invoke-virtual {v0, v1}, Lb/a/x;->b(I)Lb/a/x;

    iget-object v0, p0, Lb/a/hu;->c:Lb/a/x;

    invoke-static {}, Lcom/b/a/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a/x;->d(Ljava/lang/String;)Lb/a/x;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_0
    :try_start_2
    iget-object v0, p0, Lb/a/hu;->c:Lb/a/x;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized c()Lb/a/ap;
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    if-nez v0, :cond_2

    new-instance v0, Lb/a/ap;

    invoke-direct {v0}, Lb/a/ap;-><init>()V

    iput-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    invoke-static {}, Lb/a/ff;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/ap;->e(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    invoke-static {v0}, Lb/a/ff;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/ap;->a(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    invoke-static {v0}, Lb/a/ff;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/ap;->b(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    invoke-static {v0}, Lb/a/ff;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/ap;->c(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb/a/ap;->d(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    const-string v2, "Android"

    invoke-virtual {v1, v2}, Lb/a/ap;->f(Ljava/lang/String;)Lb/a/ap;

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lb/a/ap;->g(Ljava/lang/String;)Lb/a/ap;

    invoke-static {v0}, Lb/a/ff;->l(Landroid/content/Context;)[I

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb/a/hu;->d:Lb/a/ap;

    new-instance v2, Lb/a/du;

    const/4 v3, 0x1

    aget v3, v0, v3

    const/4 v4, 0x0

    aget v0, v0, v4

    invoke-direct {v2, v3, v0}, Lb/a/du;-><init>(II)V

    invoke-virtual {v1, v2}, Lb/a/ap;->a(Lb/a/du;)Lb/a/ap;

    :cond_0
    sget-object v0, Lcom/b/a/a;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/b/a/a;->d:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v1, Landroid/os/Build;->BOARD:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb/a/ap;->h(Ljava/lang/String;)Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb/a/ap;->i(Ljava/lang/String;)Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-wide v2, Landroid/os/Build;->TIME:J

    invoke-virtual {v0, v2, v3}, Lb/a/ap;->a(J)Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb/a/ap;->j(Ljava/lang/String;)Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb/a/ap;->k(Ljava/lang/String;)Lb/a/ap;

    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lb/a/ap;->l(Ljava/lang/String;)Lb/a/ap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_0
    :try_start_2
    iget-object v0, p0, Lb/a/hu;->d:Lb/a/ap;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized d()Lb/a/df;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->e:Lb/a/df;

    if-nez v0, :cond_1

    new-instance v0, Lb/a/df;

    invoke-direct {v0}, Lb/a/df;-><init>()V

    iput-object v0, p0, Lb/a/hu;->e:Lb/a/df;

    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v0}, Lb/a/ff;->e(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    const-string v2, "Wi-Fi"

    const/4 v3, 0x0

    aget-object v3, v1, v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    sget-object v3, Lb/a/k;->c:Lb/a/k;

    invoke-virtual {v2, v3}, Lb/a/df;->a(Lb/a/k;)Lb/a/df;

    :goto_0
    const-string v2, ""

    const/4 v3, 0x1

    aget-object v3, v1, v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    const/4 v3, 0x1

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Lb/a/df;->d(Ljava/lang/String;)Lb/a/df;

    :cond_0
    iget-object v1, p0, Lb/a/hu;->e:Lb/a/df;

    invoke-static {v0}, Lb/a/ff;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb/a/df;->c(Ljava/lang/String;)Lb/a/df;

    invoke-static {v0}, Lb/a/ff;->i(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    const/4 v3, 0x0

    aget-object v3, v1, v3

    invoke-virtual {v2, v3}, Lb/a/df;->b(Ljava/lang/String;)Lb/a/df;

    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    const/4 v3, 0x1

    aget-object v1, v1, v3

    invoke-virtual {v2, v1}, Lb/a/df;->a(Ljava/lang/String;)Lb/a/df;

    iget-object v1, p0, Lb/a/hu;->e:Lb/a/df;

    invoke-static {v0}, Lb/a/ff;->h(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Lb/a/df;->a(I)Lb/a/df;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lb/a/hu;->e:Lb/a/df;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_2
    :try_start_3
    const-string v2, "2G/3G"

    const/4 v3, 0x0

    aget-object v3, v1, v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    sget-object v3, Lb/a/k;->b:Lb/a/k;

    invoke-virtual {v2, v3}, Lb/a/df;->a(Lb/a/k;)Lb/a/df;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    :try_start_5
    iget-object v2, p0, Lb/a/hu;->e:Lb/a/df;

    sget-object v3, Lb/a/k;->a:Lb/a/k;

    invoke-virtual {v2, v3}, Lb/a/df;->a(Lb/a/k;)Lb/a/df;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0
.end method

.method private e()Lb/a/cb;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;

    invoke-static {v0}, Lb/a/hd;->a(Landroid/content/Context;)Lb/a/hd;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/hd;->a()Lb/a/cb;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f()Lb/a/bu;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;

    invoke-static {v0}, Lb/a/gg;->a(Landroid/content/Context;)Lb/a/gg;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/gg;->b()Lb/a/bu;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()Lb/a/ad;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;

    const-string v1, "umeng_general_config"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    new-instance v0, Lb/a/ad;

    invoke-direct {v0}, Lb/a/ad;-><init>()V

    const-string v2, "failed_requests "

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lb/a/ad;->b(I)Lb/a/ad;

    const-string v2, "last_request_spent_ms"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v2}, Lb/a/ad;->c(I)Lb/a/ad;

    const-string v2, "successful_request"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lb/a/ad;->a(I)Lb/a/ad;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    new-instance v0, Lb/a/ad;

    invoke-direct {v0}, Lb/a/ad;-><init>()V

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lb/a/hu;->b:Lb/a/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lb/a/et;)V
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;

    invoke-static {v0}, Lb/a/ia;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    :goto_0
    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->b:Lb/a/l;

    if-eqz v0, :cond_1

    new-instance v0, Lb/a/b;

    iget-object v3, p0, Lb/a/hu;->f:Landroid/content/Context;

    invoke-direct {v0, v3}, Lb/a/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lb/a/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/a/hu;->b:Lb/a/l;

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/l;)Lb/a/et;

    const/4 v0, 0x0

    iput-object v0, p0, Lb/a/hu;->b:Lb/a/l;

    :cond_1
    iget-object v0, p0, Lb/a/hu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/hs;

    invoke-interface {v0, p1, v2}, Lb/a/hs;->a(Lb/a/et;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_2
    :try_start_1
    iget-object v0, p0, Lb/a/hu;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0}, Lb/a/hu;->b()Lb/a/x;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/x;)Lb/a/et;

    invoke-direct {p0}, Lb/a/hu;->c()Lb/a/ap;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/ap;)Lb/a/et;

    invoke-direct {p0}, Lb/a/hu;->d()Lb/a/df;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/df;)Lb/a/et;

    invoke-direct {p0}, Lb/a/hu;->g()Lb/a/ad;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/ad;)Lb/a/et;

    invoke-direct {p0}, Lb/a/hu;->e()Lb/a/cb;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/cb;)Lb/a/et;

    invoke-direct {p0}, Lb/a/hu;->f()Lb/a/bu;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/bu;)Lb/a/et;

    iget-object v0, p0, Lb/a/hu;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/q;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    aget-object v0, v2, v4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    aget-object v0, v2, v5

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lb/a/r;

    aget-object v1, v2, v4

    aget-object v2, v2, v5

    invoke-direct {v0, v1, v2}, Lb/a/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p1, v0}, Lb/a/et;->a(Lb/a/r;)Lb/a/et;

    goto/16 :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_2
.end method

.method public final declared-synchronized a(Lb/a/hs;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/hu;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Lb/a/l;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lb/a/hu;->b:Lb/a/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
