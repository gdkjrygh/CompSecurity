.class public final Lcom/mobvista/sdk/m/core/loader/c;
.super Lcom/mobvista/sdk/m/a/a/d/a;
.source "360Security"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/mobvista/sdk/m/core/c/f;

.field private c:Lcom/mobvista/sdk/m/core/loader/g;

.field private d:[I

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mobvista/sdk/m/core/c/f;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/d/a;-><init>()V

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    .line 45
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->d:[I

    .line 47
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->e:Z

    .line 48
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->f:Z

    .line 49
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->g:Z

    .line 54
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/c;->a:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    .line 56
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/c;)Lcom/mobvista/sdk/m/core/loader/g;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    return-object v0
.end method

.method private a()V
    .locals 7

    .prologue
    const/16 v1, 0x14

    const/4 v6, 0x0

    .line 174
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 175
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v6, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 177
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->d:[I

    aget v3, v3, v6

    add-int/lit8 v3, v3, -0x3

    if-le v2, v3, :cond_1

    .line 178
    iput-boolean v6, p0, Lcom/mobvista/sdk/m/core/loader/c;->e:Z

    .line 179
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    if-eqz v1, :cond_0

    .line 180
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/core/loader/g;->b(Ljava/lang/Object;)V

    .line 229
    :cond_0
    :goto_0
    return-void

    .line 187
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/a;-><init>()V

    .line 188
    sget-object v2, Lcom/mobvista/sdk/m/a/f/d;->a:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/c;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILjava/util/List;Lcom/mobvista/sdk/m/core/c/f;Landroid/content/Context;Ljava/lang/String;)V

    .line 190
    invoke-virtual {v0, v6}, Lcom/mobvista/sdk/m/core/loader/a;->a(I)V

    .line 191
    const/4 v1, 0x1

    new-instance v2, Lcom/mobvista/sdk/m/core/loader/d;

    invoke-direct {v2, p0}, Lcom/mobvista/sdk/m/core/loader/d;-><init>(Lcom/mobvista/sdk/m/core/loader/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/loader/c;Z)Z
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->e:Z

    return v0
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/loader/c;Z)Z
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->f:Z

    return v0
.end method

.method private c()V
    .locals 8

    .prologue
    const/16 v1, 0x14

    const/4 v7, 0x2

    const/4 v6, 0x1

    .line 234
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 235
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v6, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 237
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->d:[I

    aget v3, v3, v6

    add-int/lit8 v3, v3, -0x3

    if-le v2, v3, :cond_1

    .line 238
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->f:Z

    .line 239
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    if-eqz v1, :cond_0

    .line 240
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/core/loader/g;->b(Ljava/lang/Object;)V

    .line 285
    :cond_0
    :goto_0
    return-void

    .line 247
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/a;-><init>()V

    .line 248
    sget-object v2, Lcom/mobvista/sdk/m/a/f/d;->a:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/c;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILjava/util/List;Lcom/mobvista/sdk/m/core/c/f;Landroid/content/Context;Ljava/lang/String;)V

    .line 250
    invoke-virtual {v0, v6}, Lcom/mobvista/sdk/m/core/loader/a;->a(I)V

    .line 251
    invoke-virtual {v0, v7}, Lcom/mobvista/sdk/m/core/loader/a;->b(I)V

    .line 252
    new-instance v1, Lcom/mobvista/sdk/m/core/loader/e;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/loader/e;-><init>(Lcom/mobvista/sdk/m/core/loader/c;)V

    invoke-virtual {v0, v7, v1}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/loader/c;Z)Z
    .locals 1

    .prologue
    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->g:Z

    return v0
.end method

.method private d()V
    .locals 7

    .prologue
    const/16 v1, 0x14

    const/4 v6, 0x2

    .line 291
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 292
    iget-object v2, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v6, v2}, Lcom/mobvista/sdk/m/core/c/b;->a(IILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 294
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->d:[I

    aget v3, v3, v6

    add-int/lit8 v3, v3, -0x3

    if-le v2, v3, :cond_1

    .line 295
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->g:Z

    .line 296
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    if-eqz v1, :cond_0

    .line 297
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    invoke-interface {v1, v0}, Lcom/mobvista/sdk/m/core/loader/g;->b(Ljava/lang/Object;)V

    .line 347
    :cond_0
    :goto_0
    return-void

    .line 304
    :cond_1
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/a;-><init>()V

    .line 305
    sget-object v2, Lcom/mobvista/sdk/m/a/f/d;->a:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/loader/c;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobvista/sdk/m/core/loader/c;->h:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILjava/util/List;Lcom/mobvista/sdk/m/core/c/f;Landroid/content/Context;Ljava/lang/String;)V

    .line 307
    invoke-virtual {v0, v6}, Lcom/mobvista/sdk/m/core/loader/a;->a(I)V

    .line 308
    invoke-virtual {v0, v6}, Lcom/mobvista/sdk/m/core/loader/a;->b(I)V

    .line 309
    const/4 v1, 0x3

    new-instance v2, Lcom/mobvista/sdk/m/core/loader/f;

    invoke-direct {v2, p0}, Lcom/mobvista/sdk/m/core/loader/f;-><init>(Lcom/mobvista/sdk/m/core/loader/c;)V

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(ILcom/mobvista/sdk/m/core/loader/g;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 60
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/c;->c:Lcom/mobvista/sdk/m/core/loader/g;

    .line 63
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->b:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/b;->b()V

    .line 67
    packed-switch p1, :pswitch_data_0

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 69
    :pswitch_0
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->e:Z

    if-nez v0, :cond_0

    .line 72
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->e:Z

    .line 73
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/c;->a()V

    goto :goto_0

    .line 76
    :pswitch_1
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->f:Z

    if-nez v0, :cond_0

    .line 79
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->f:Z

    .line 80
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/c;->c()V

    goto :goto_0

    .line 83
    :pswitch_2
    iget-boolean v0, p0, Lcom/mobvista/sdk/m/core/loader/c;->g:Z

    if-nez v0, :cond_0

    .line 86
    iput-boolean v1, p0, Lcom/mobvista/sdk/m/core/loader/c;->g:Z

    .line 87
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/c;->d()V

    goto :goto_0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
