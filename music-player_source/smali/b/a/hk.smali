.class public final Lb/a/hk;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Lb/a/hi;

.field private final b:J

.field private final c:I

.field private final d:I

.field private e:Lcom/b/a/i;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Z


# direct methods
.method public constructor <init>(Lb/a/hi;)V
    .locals 4

    const/16 v3, 0x2710

    const/4 v2, 0x0

    iput-object p1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x4d3f6400

    iput-wide v0, p0, Lb/a/hk;->b:J

    const v0, 0x1b7740

    iput v0, p0, Lb/a/hk;->c:I

    iput v3, p0, Lb/a/hk;->d:I

    iput-boolean v2, p0, Lb/a/hk;->j:Z

    invoke-static {p1}, Lb/a/hi;->a(Lb/a/hi;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->c()I

    move-result v0

    iput v0, p0, Lb/a/hk;->f:I

    invoke-static {p1}, Lb/a/hi;->a(Lb/a/hi;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->d()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {v0}, Lb/a/hk;->c(I)I

    move-result v0

    iput v0, p0, Lb/a/hk;->g:I

    :goto_0
    invoke-static {p1}, Lb/a/hi;->a(Lb/a/hi;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->b()[I

    move-result-object v0

    aget v1, v0, v2

    iput v1, p0, Lb/a/hk;->h:I

    const/4 v1, 0x1

    aget v0, v0, v1

    iput v0, p0, Lb/a/hk;->i:I

    return-void

    :cond_0
    sget v0, Lcom/b/a/a;->g:I

    if-lez v0, :cond_1

    sget v0, Lcom/b/a/a;->g:I

    invoke-static {v0}, Lb/a/hk;->c(I)I

    move-result v0

    iput v0, p0, Lb/a/hk;->g:I

    goto :goto_0

    :cond_1
    iput v3, p0, Lb/a/hk;->g:I

    goto :goto_0
.end method

.method private static c(I)I
    .locals 1

    const v0, 0x1b7740

    if-le p0, v0, :cond_0

    move p0, v0

    :cond_0
    return p0
.end method


# virtual methods
.method public final a()Lcom/b/a/i;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v3, p0, Lb/a/hk;->f:I

    if-lez v3, :cond_3

    iget-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    instance-of v0, v0, Lcom/b/a/d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    invoke-virtual {v0}, Lcom/b/a/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    if-eqz v1, :cond_2

    iget-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    :goto_1
    iput-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    :cond_0
    :goto_2
    iput-boolean v2, p0, Lb/a/hk;->j:Z

    iget-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    return-object v0

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/b/a/d;

    iget-object v1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v1}, Lb/a/hi;->b(Lb/a/hi;)Lb/a/b;

    move-result-object v1

    iget-object v3, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v3}, Lb/a/hi;->c(Lb/a/hi;)Lb/a/j;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/b/a/d;-><init>(Lb/a/b;Lb/a/j;)V

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lb/a/hk;->e:Lcom/b/a/i;

    instance-of v3, v3, Lcom/b/a/e;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lb/a/hk;->e:Lcom/b/a/i;

    invoke-virtual {v3}, Lcom/b/a/i;->a()Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v1

    :goto_3
    if-nez v3, :cond_0

    iget-object v3, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v3}, Lb/a/hi;->a(Lb/a/hi;)Lcom/b/a/t;

    move-result-object v3

    invoke-virtual {v3}, Lcom/b/a/t;->h()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v3}, Lb/a/hi;->b(Lb/a/hi;)Lb/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lb/a/b;->a()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v3, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v3}, Lb/a/hi;->b(Lb/a/hi;)Lb/a/b;

    move-result-object v3

    invoke-virtual {v3}, Lb/a/b;->f()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/32 v6, 0x4d3f6400

    cmp-long v3, v4, v6

    if-lez v3, :cond_5

    :goto_4
    if-eqz v1, :cond_7

    iget-object v1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v1}, Lb/a/hi;->d(Lb/a/hi;)Landroid/content/Context;

    move-result-object v1

    const-string v3, "umeng_general_config"

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-nez v1, :cond_6

    :goto_5
    iget v1, p0, Lb/a/hk;->g:I

    invoke-static {v1, v0}, Lcom/b/a/l;->a(ILjava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/b/a/e;

    invoke-direct {v1, v0}, Lcom/b/a/e;-><init>(I)V

    iput-object v1, p0, Lb/a/hk;->e:Lcom/b/a/i;

    iget-object v1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v1, v0}, Lb/a/hi;->a(Lb/a/hi;I)V

    goto :goto_2

    :cond_4
    move v3, v2

    goto :goto_3

    :cond_5
    move v1, v2

    goto :goto_4

    :cond_6
    const-string v3, "signature"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    :cond_7
    iget v0, p0, Lb/a/hk;->h:I

    iget v1, p0, Lb/a/hk;->i:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    new-instance v0, Lcom/b/a/f;

    invoke-direct {v0}, Lcom/b/a/f;-><init>()V

    :goto_6
    iput-object v0, p0, Lb/a/hk;->e:Lcom/b/a/i;

    goto/16 :goto_2

    :pswitch_1
    new-instance v0, Lcom/b/a/f;

    invoke-direct {v0}, Lcom/b/a/f;-><init>()V

    goto :goto_6

    :pswitch_2
    new-instance v0, Lcom/b/a/g;

    iget-object v3, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v3}, Lb/a/hi;->b(Lb/a/hi;)Lb/a/b;

    move-result-object v3

    int-to-long v4, v1

    invoke-direct {v0, v3, v4, v5}, Lcom/b/a/g;-><init>(Lb/a/b;J)V

    goto :goto_6

    :pswitch_3
    new-instance v0, Lcom/b/a/h;

    iget-object v1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v1}, Lb/a/hi;->b(Lb/a/hi;)Lb/a/b;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/b/a/h;-><init>(Lb/a/b;)V

    goto :goto_6

    :pswitch_4
    new-instance v0, Lcom/b/a/i;

    invoke-direct {v0}, Lcom/b/a/i;-><init>()V

    goto :goto_6

    :pswitch_5
    new-instance v0, Lcom/b/a/j;

    iget-object v1, p0, Lb/a/hk;->a:Lb/a/hi;

    invoke-static {v1}, Lb/a/hi;->d(Lb/a/hi;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/b/a/j;-><init>(Landroid/content/Context;)V

    goto :goto_6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_5
        :pswitch_2
    .end packed-switch
.end method

.method public final a(I)V
    .locals 1

    invoke-static {p1}, Lb/a/hk;->c(I)I

    move-result v0

    iput v0, p0, Lb/a/hk;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/hk;->j:Z

    return-void
.end method

.method public final b(I)V
    .locals 1

    iput p1, p0, Lb/a/hk;->f:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/hk;->j:Z

    return-void
.end method
