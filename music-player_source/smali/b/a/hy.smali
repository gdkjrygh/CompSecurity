.class public final Lb/a/hy;
.super Ljava/lang/Object;


# instance fields
.field private a:Lb/a/gg;

.field private b:Lb/a/hd;

.field private final c:I

.field private d:Landroid/content/Context;

.field private e:Lb/a/b;

.field private f:Lb/a/hv;

.field private g:Lb/a/et;

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb/a/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lb/a/hy;->c:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/a/hy;->h:Z

    invoke-static {p1}, Lb/a/gg;->a(Landroid/content/Context;)Lb/a/gg;

    move-result-object v0

    iput-object v0, p0, Lb/a/hy;->a:Lb/a/gg;

    invoke-static {p1}, Lb/a/hd;->a(Landroid/content/Context;)Lb/a/hd;

    move-result-object v0

    iput-object v0, p0, Lb/a/hy;->b:Lb/a/hd;

    iput-object p1, p0, Lb/a/hy;->d:Landroid/content/Context;

    iput-object p2, p0, Lb/a/hy;->e:Lb/a/b;

    new-instance v0, Lb/a/hv;

    invoke-direct {v0, p1}, Lb/a/hv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lb/a/hy;->f:Lb/a/hv;

    iget-object v0, p0, Lb/a/hy;->f:Lb/a/hv;

    iget-object v1, p0, Lb/a/hy;->e:Lb/a/b;

    invoke-virtual {v0, v1}, Lb/a/hv;->a(Lb/a/ht;)V

    return-void
.end method

.method static synthetic a(Lb/a/hy;[B)I
    .locals 1

    invoke-direct {p0, p1}, Lb/a/hy;->a([B)I

    move-result v0

    return v0
.end method

.method private a([B)I
    .locals 5

    const/4 v4, 0x1

    new-instance v1, Lb/a/ea;

    invoke-direct {v1}, Lb/a/ea;-><init>()V

    new-instance v0, Lb/a/fp;

    new-instance v2, Lb/a/gf;

    invoke-direct {v2}, Lb/a/gf;-><init>()V

    invoke-direct {v0, v2}, Lb/a/fp;-><init>(Lb/a/gp;)V

    :try_start_0
    invoke-virtual {v0, v1, p1}, Lb/a/fp;->a(Lb/a/fm;[B)V

    iget v0, v1, Lb/a/ea;->a:I

    if-ne v0, v4, :cond_0

    iget-object v0, p0, Lb/a/hy;->b:Lb/a/hd;

    invoke-virtual {v1}, Lb/a/ea;->f()Lb/a/cb;

    move-result-object v2

    invoke-virtual {v0, v2}, Lb/a/hd;->a(Lb/a/cb;)V

    iget-object v0, p0, Lb/a/hy;->b:Lb/a/hd;

    invoke-virtual {v0}, Lb/a/hd;->b()V

    :cond_0
    const-string v0, "MobclickAgent"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "send log:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lb/a/ea;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lb/a/fg;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget v0, v1, Lb/a/ea;->a:I

    if-ne v0, v4, :cond_1

    const/4 v0, 0x2

    :goto_1
    return v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    goto :goto_1
.end method

.method static synthetic a(Lb/a/hy;)Lb/a/hv;
    .locals 1

    iget-object v0, p0, Lb/a/hy;->f:Lb/a/hv;

    return-object v0
.end method

.method static synthetic b(Lb/a/hy;)Lb/a/b;
    .locals 1

    iget-object v0, p0, Lb/a/hy;->e:Lb/a/b;

    return-object v0
.end method

.method private static b(Lb/a/et;)[B
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

.method static synthetic c(Lb/a/hy;)Z
    .locals 1

    iget-boolean v0, p0, Lb/a/hy;->i:Z

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/a/hy;->i:Z

    return-void
.end method

.method public final a(Lb/a/et;)V
    .locals 0

    iput-object p1, p0, Lb/a/hy;->g:Lb/a/et;

    return-void
.end method

.method public final a(Lb/a/hx;)V
    .locals 1

    iget-object v0, p0, Lb/a/hy;->b:Lb/a/hd;

    invoke-virtual {v0, p1}, Lb/a/hd;->a(Lb/a/hx;)V

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lb/a/hy;->h:Z

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lb/a/hy;->g:Lb/a/et;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lb/a/hy;->a:Lb/a/gg;

    invoke-virtual {v0}, Lb/a/gg;->a()V

    iget-object v0, p0, Lb/a/hy;->g:Lb/a/et;

    iget-object v1, p0, Lb/a/hy;->a:Lb/a/gg;

    invoke-virtual {v1}, Lb/a/gg;->b()Lb/a/bu;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a/et;->a(Lb/a/bu;)Lb/a/et;

    invoke-static {v0}, Lb/a/hy;->b(Lb/a/et;)[B

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "MobclickAgent"

    const-string v1, "message is null"

    invoke-static {v0, v1}, Lb/a/fg;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-boolean v1, p0, Lb/a/hy;->h:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lb/a/hy;->d:Landroid/content/Context;

    iget-object v2, p0, Lb/a/hy;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lb/a/fh;->a(Landroid/content/Context;Ljava/lang/String;[B)Lb/a/fh;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Lb/a/fh;->a()[B

    move-result-object v1

    iget-object v0, p0, Lb/a/hy;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    invoke-static {}, Lcom/b/a/t;->g()V

    iget-object v0, p0, Lb/a/hy;->f:Lb/a/hv;

    invoke-virtual {v0, v1}, Lb/a/hv;->a([B)[B

    move-result-object v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :goto_2
    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-boolean v0, p0, Lb/a/hy;->i:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lb/a/hy;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/b/a/t;->b([B)V

    :cond_1
    const-string v0, "MobclickAgent"

    const-string v1, "connection error"

    invoke-static {v0, v1}, Lb/a/fg;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lb/a/hy;->d:Landroid/content/Context;

    iget-object v2, p0, Lb/a/hy;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/b/a/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lb/a/fh;->b(Landroid/content/Context;Ljava/lang/String;[B)Lb/a/fh;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-direct {p0, v0}, Lb/a/hy;->a([B)I

    move-result v0

    goto :goto_2

    :pswitch_1
    iget-object v0, p0, Lb/a/hy;->e:Lb/a/b;

    invoke-virtual {v0}, Lb/a/b;->d()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lb/a/hy;->e:Lb/a/b;

    invoke-virtual {v0}, Lb/a/b;->c()V

    :cond_4
    iget-object v0, p0, Lb/a/hy;->a:Lb/a/gg;

    invoke-virtual {v0}, Lb/a/gg;->c()V

    iget-object v0, p0, Lb/a/hy;->e:Lb/a/b;

    invoke-virtual {v0}, Lb/a/b;->b()V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lb/a/hy;->e:Lb/a/b;

    invoke-virtual {v0}, Lb/a/b;->b()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lb/a/hy;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/b/a/t;->a(Landroid/content/Context;)Lcom/b/a/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/b/a/t;->i()Lcom/b/a/u;

    move-result-object v0

    new-instance v1, Lb/a/hz;

    invoke-direct {v1, p0}, Lb/a/hz;-><init>(Lb/a/hy;)V

    invoke-virtual {v0, v1}, Lcom/b/a/u;->a(Lcom/b/a/w;)V

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
