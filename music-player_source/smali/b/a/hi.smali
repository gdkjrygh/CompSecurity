.class public final Lb/a/hi;
.super Ljava/lang/Object;

# interfaces
.implements Lb/a/hr;
.implements Lb/a/hx;
.implements Lcom/b/a/a/c;


# instance fields
.field private a:Lb/a/hu;

.field private b:Lcom/b/a/t;

.field private c:Lb/a/b;

.field private d:Lb/a/j;

.field private e:Lb/a/hk;

.field private f:I

.field private g:I

.field private h:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lb/a/hi;->a:Lb/a/hu;

    iput-object v1, p0, Lb/a/hi;->b:Lcom/b/a/t;

    iput-object v1, p0, Lb/a/hi;->c:Lb/a/b;

    new-instance v0, Lb/a/j;

    invoke-direct {v0}, Lb/a/j;-><init>()V

    iput-object v0, p0, Lb/a/hi;->d:Lb/a/j;

    iput-object v1, p0, Lb/a/hi;->e:Lb/a/hk;

    const/16 v0, 0xa

    iput v0, p0, Lb/a/hi;->f:I

    iput-object p1, p0, Lb/a/hi;->h:Landroid/content/Context;

    new-instance v0, Lb/a/hu;

    invoke-direct {v0, p1}, Lb/a/hu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb/a/hi;->a:Lb/a/hu;

    new-instance v0, Lb/a/b;

    invoke-direct {v0, p1}, Lb/a/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-static {p1}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    move-result-object v0

    iput-object v0, p0, Lb/a/hi;->b:Lcom/b/a/t;

    iget-object v0, p0, Lb/a/hi;->d:Lb/a/j;

    iget-object v1, p0, Lb/a/hi;->b:Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lb/a/j;->a(I)V

    new-instance v0, Lb/a/hk;

    invoke-direct {v0, p0}, Lb/a/hk;-><init>(Lb/a/hi;)V

    iput-object v0, p0, Lb/a/hi;->e:Lb/a/hk;

    iget-object v0, p0, Lb/a/hi;->b:Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->e()I

    move-result v0

    iput v0, p0, Lb/a/hi;->g:I

    return-void
.end method

.method private static a([B)Lb/a/et;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    new-instance v1, Lb/a/et;

    invoke-direct {v1}, Lb/a/et;-><init>()V

    new-instance v2, Lb/a/fp;

    invoke-direct {v2}, Lb/a/fp;-><init>()V

    invoke-virtual {v2, v1, p0}, Lb/a/fp;->a(Lb/a/fm;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private varargs a([I)Lb/a/et;
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    iget-object v0, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "MobclickAgent"

    const-string v1, "Appkey is missing ,Please check AndroidManifest.xml"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    move-object v0, v3

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->f()[B

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v3

    :goto_1
    if-nez v0, :cond_3

    iget-object v4, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v4}, Lb/a/hu;->a()I

    move-result v4

    if-nez v4, :cond_3

    move-object v0, v3

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lb/a/hi;->a([B)Lb/a/et;

    move-result-object v0

    goto :goto_1

    :cond_3
    if-nez v0, :cond_7

    new-instance v0, Lb/a/et;

    invoke-direct {v0}, Lb/a/et;-><init>()V

    move-object v4, v0

    :goto_2
    iget-object v0, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v0, v4}, Lb/a/hu;->a(Lb/a/et;)V

    sget-boolean v0, Lb/a/fg;->a:Z

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Lb/a/et;->m()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v4}, Lb/a/et;->l()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/eh;

    invoke-virtual {v0}, Lb/a/eh;->h()I

    move-result v0

    if-lez v0, :cond_6

    move v0, v1

    :goto_4
    move v2, v0

    goto :goto_3

    :cond_4
    if-nez v2, :cond_5

    const-string v0, "MobclickAgent"

    const-string v1, "missing Activities or PageViews"

    invoke-static {v0, v1}, Lb/a/fg;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lb/a/hi;->d:Lb/a/j;

    iget-object v1, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-virtual {v0, v1, v4}, Lb/a/j;->a(Landroid/content/Context;Lb/a/et;)Lb/a/et;

    move-result-object v0

    if-eqz p1, :cond_0

    array-length v1, p1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    new-instance v1, Lb/a/aj;

    invoke-direct {v1}, Lb/a/aj;-><init>()V

    new-instance v2, Lb/a/ct;

    const/4 v4, 0x0

    aget v4, p1, v4

    div-int/lit16 v4, v4, 0x3e8

    const/4 v5, 0x1

    aget v5, p1, v5

    int-to-long v6, v5

    invoke-direct {v2, v4, v6, v7}, Lb/a/ct;-><init>(IJ)V

    invoke-virtual {v1, v2}, Lb/a/aj;->a(Lb/a/ct;)Lb/a/aj;

    invoke-virtual {v0, v1}, Lb/a/et;->a(Lb/a/aj;)Lb/a/et;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    const-string v1, "MobclickAgent"

    const-string v2, "Fail to construct message ..."

    invoke-static {v1, v2, v0}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    iget-object v0, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->g()V

    move-object v0, v3

    goto/16 :goto_0

    :cond_6
    move v0, v2

    goto :goto_4

    :cond_7
    move-object v4, v0

    goto :goto_2
.end method

.method static synthetic a(Lb/a/hi;)Lcom/b/a/t;
    .locals 1

    iget-object v0, p0, Lb/a/hi;->b:Lcom/b/a/t;

    return-object v0
.end method

.method static synthetic a(Lb/a/hi;I)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-virtual {v2}, Lb/a/b;->f()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v2, 0x1

    aput v0, v1, v2

    invoke-direct {p0, v1}, Lb/a/hi;->a([I)Lb/a/et;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v1}, Lb/a/gg;->a(Landroid/content/Context;)Lb/a/gg;

    move-result-object v1

    invoke-virtual {v1}, Lb/a/gg;->a()V

    invoke-virtual {v1}, Lb/a/gg;->b()Lb/a/bu;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb/a/et;->a(Lb/a/bu;)Lb/a/et;

    invoke-static {v0}, Lb/a/hi;->a(Lb/a/et;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lb/a/hi;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lb/a/hi;->h:Landroid/content/Context;

    iget-object v3, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v3}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lb/a/fh;->b(Landroid/content/Context;Ljava/lang/String;[B)Lb/a/fh;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lb/a/fh;->a()[B

    move-result-object v0

    iget-object v2, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v2}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    move-result-object v2

    invoke-static {}, Lcom/b/a/t;->g()V

    invoke-virtual {v2, v0}, Lcom/b/a/t;->b([B)V

    invoke-virtual {v1}, Lb/a/gg;->c()V

    :cond_0
    new-instance v0, Lb/a/hj;

    invoke-direct {v0, p0}, Lb/a/hj;-><init>(Lb/a/hi;)V

    int-to-long v2, p1

    invoke-static {v0, v2, v3}, Lcom/b/a/r;->a(Ljava/lang/Runnable;J)V

    return-void

    :cond_1
    iget-object v2, p0, Lb/a/hi;->h:Landroid/content/Context;

    iget-object v3, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v3}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Lb/a/fh;->a(Landroid/content/Context;Ljava/lang/String;[B)Lb/a/fh;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Lb/a/et;)[B
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    new-instance v1, Lb/a/fs;

    invoke-direct {v1}, Lb/a/fs;-><init>()V

    invoke-virtual {v1, p0}, Lb/a/fs;->a(Lb/a/fm;)[B

    move-result-object v1

    sget-boolean v2, Lb/a/fg;->a:Z

    if-eqz v2, :cond_1

    const-string v2, "MobclickAgent"

    invoke-virtual {p0}, Lb/a/et;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lb/a/fg;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "MobclickAgent"

    const-string v3, "Fail to serialize log ..."

    invoke-static {v2, v3, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method

.method static synthetic b(Lb/a/hi;)Lb/a/b;
    .locals 1

    iget-object v0, p0, Lb/a/hi;->c:Lb/a/b;

    return-object v0
.end method

.method static synthetic c(Lb/a/hi;)Lb/a/j;
    .locals 1

    iget-object v0, p0, Lb/a/hi;->d:Lb/a/j;

    return-object v0
.end method

.method private c()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lb/a/hi;->b:Lcom/b/a/t;

    invoke-virtual {v0}, Lcom/b/a/t;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lb/a/hy;

    iget-object v1, p0, Lb/a/hi;->h:Landroid/content/Context;

    iget-object v2, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-direct {v0, v1, v2}, Lb/a/hy;-><init>(Landroid/content/Context;Lb/a/b;)V

    invoke-virtual {v0, p0}, Lb/a/hy;->a(Lb/a/hx;)V

    iget-object v1, p0, Lb/a/hi;->d:Lb/a/j;

    invoke-virtual {v1}, Lb/a/j;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb/a/hy;->a()V

    :cond_0
    invoke-virtual {v0}, Lb/a/hy;->b()V

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [I

    invoke-direct {p0, v0}, Lb/a/hi;->a([I)Lb/a/et;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "MobclickAgent"

    const-string v1, "No data to report"

    invoke-static {v0, v1}, Lb/a/fg;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_2
    :try_start_1
    new-instance v1, Lb/a/hy;

    iget-object v2, p0, Lb/a/hi;->h:Landroid/content/Context;

    iget-object v3, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-direct {v1, v2, v3}, Lb/a/hy;-><init>(Landroid/content/Context;Lb/a/b;)V

    invoke-virtual {v1, p0}, Lb/a/hy;->a(Lb/a/hx;)V

    iget-object v2, p0, Lb/a/hi;->d:Lb/a/j;

    invoke-virtual {v2}, Lb/a/j;->b()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lb/a/hy;->a()V

    :cond_3
    invoke-virtual {v1, v0}, Lb/a/hy;->a(Lb/a/et;)V

    invoke-direct {p0}, Lb/a/hi;->d()Z

    move-result v0

    invoke-virtual {v1, v0}, Lb/a/hy;->a(Z)V

    invoke-virtual {v1}, Lb/a/hy;->b()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method static synthetic d(Lb/a/hi;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lb/a/hi;->h:Landroid/content/Context;

    return-object v0
.end method

.method private d()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lb/a/hi;->g:I

    packed-switch v1, :pswitch_data_0

    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_2
    sget-boolean v0, Lcom/b/a/a;->f:Z

    goto :goto_0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v0}, Lb/a/ff;->g(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lb/a/hi;->c()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    sget-boolean v0, Lb/a/fg;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "network is unavailable"

    invoke-static {v0, v1}, Lb/a/fg;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 1

    if-ltz p1, :cond_0

    const/4 v0, 0x3

    if-gt p1, v0, :cond_0

    iget-object v0, p0, Lb/a/hi;->d:Lb/a/j;

    invoke-virtual {v0, p1}, Lb/a/j;->a(I)V

    iget-object v0, p0, Lb/a/hi;->e:Lb/a/hk;

    invoke-virtual {v0, p1}, Lb/a/hk;->b(I)V

    :cond_0
    return-void
.end method

.method public final a(Lb/a/hs;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v2, p1}, Lb/a/hu;->a(Lb/a/hs;)V

    :cond_0
    instance-of v2, p1, Lb/a/eh;

    iget-object v3, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-virtual {v3}, Lb/a/b;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v4, p0, Lb/a/hi;->a:Lb/a/hu;

    new-instance v5, Lb/a/l;

    iget-object v6, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-virtual {v6}, Lb/a/b;->e()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Lb/a/l;-><init>(J)V

    invoke-virtual {v4, v5}, Lb/a/hu;->a(Lb/a/l;)V

    :cond_1
    iget-object v4, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v4}, Lb/a/ff;->g(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-boolean v2, Lb/a/fg;->a:Z

    if-eqz v2, :cond_2

    const-string v2, "MobclickAgent"

    const-string v4, "network is unavailable"

    invoke-static {v2, v4}, Lb/a/fg;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move v2, v1

    :goto_0
    if-eqz v2, :cond_7

    invoke-direct {p0}, Lb/a/hi;->c()V

    :cond_3
    :goto_1
    return-void

    :cond_4
    iget-object v4, p0, Lb/a/hi;->c:Lb/a/b;

    invoke-virtual {v4}, Lb/a/b;->a()Z

    move-result v4

    if-eqz v4, :cond_5

    move v2, v0

    goto :goto_0

    :cond_5
    sget-boolean v4, Lb/a/fg;->a:Z

    if-eqz v4, :cond_6

    iget-object v4, p0, Lb/a/hi;->h:Landroid/content/Context;

    invoke-static {v4}, Lb/a/ff;->q(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_6

    move v2, v0

    goto :goto_0

    :cond_6
    iget-object v4, p0, Lb/a/hi;->e:Lb/a/hk;

    invoke-virtual {v4}, Lb/a/hk;->a()Lcom/b/a/i;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/b/a/i;->a(Z)Z

    move-result v2

    goto :goto_0

    :cond_7
    if-nez v3, :cond_8

    iget-object v2, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v2}, Lb/a/hu;->a()I

    move-result v2

    iget v3, p0, Lb/a/hi;->f:I

    if-le v2, v3, :cond_9

    :goto_2
    if-eqz v0, :cond_3

    :cond_8
    invoke-virtual {p0}, Lb/a/hi;->b()V

    goto :goto_1

    :cond_9
    move v0, v1

    goto :goto_2
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v0}, Lb/a/hu;->a()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [I

    invoke-direct {p0, v0}, Lb/a/hi;->a([I)Lb/a/et;

    move-result-object v0

    invoke-static {v0}, Lb/a/hi;->a(Lb/a/et;)[B

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb/a/hi;->b:Lcom/b/a/t;

    invoke-static {v0}, Lcom/b/a/t;->a([B)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    instance-of v1, v0, Ljava/lang/OutOfMemoryError;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lb/a/hi;->b:Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->g()V

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0
.end method

.method public final b(I)V
    .locals 1

    if-lez p1, :cond_0

    iget-object v0, p0, Lb/a/hi;->e:Lb/a/hk;

    invoke-virtual {v0, p1}, Lb/a/hk;->a(I)V

    :cond_0
    return-void
.end method

.method public final b(Lb/a/hs;)V
    .locals 1

    iget-object v0, p0, Lb/a/hi;->a:Lb/a/hu;

    invoke-virtual {v0, p1}, Lb/a/hu;->a(Lb/a/hs;)V

    return-void
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lb/a/hi;->g:I

    return-void
.end method
