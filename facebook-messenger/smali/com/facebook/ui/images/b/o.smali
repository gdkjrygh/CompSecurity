.class public Lcom/facebook/ui/images/b/o;
.super Ljava/lang/Object;
.source "FetchImageParams.java"


# instance fields
.field private final a:Landroid/net/Uri;

.field private b:Lcom/facebook/ui/images/base/b;

.field private c:Lcom/facebook/ui/images/d/h;

.field private d:Lcom/facebook/ui/images/cache/e;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method private constructor <init>(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 232
    sget-object v0, Lcom/facebook/ui/images/cache/d;->a:Lcom/facebook/ui/images/cache/e;

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->d:Lcom/facebook/ui/images/cache/e;

    .line 240
    iput-object p1, p0, Lcom/facebook/ui/images/b/o;->a:Landroid/net/Uri;

    .line 241
    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Lcom/facebook/ui/images/b/n;)V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/o;-><init>(Landroid/net/Uri;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/ui/images/b/m;)V
    .locals 1

    .prologue
    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 232
    sget-object v0, Lcom/facebook/ui/images/cache/d;->a:Lcom/facebook/ui/images/cache/e;

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->d:Lcom/facebook/ui/images/cache/e;

    .line 244
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->a:Landroid/net/Uri;

    .line 245
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->b()Lcom/facebook/ui/images/base/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->b:Lcom/facebook/ui/images/base/b;

    .line 246
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->c()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->c:Lcom/facebook/ui/images/d/h;

    .line 247
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->d()Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/o;->d:Lcom/facebook/ui/images/cache/e;

    .line 248
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/o;->e:Z

    .line 249
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->f()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/o;->f:Z

    .line 250
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->g()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/o;->g:Z

    .line 251
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->h()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/o;->h:Z

    .line 252
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/n;)V
    .locals 0

    .prologue
    .line 224
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/o;-><init>(Lcom/facebook/ui/images/b/m;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/o;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/ui/images/b/o;->a:Landroid/net/Uri;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/cache/e;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/ui/images/b/o;->d:Lcom/facebook/ui/images/cache/e;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/base/b;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/ui/images/b/o;->b:Lcom/facebook/ui/images/base/b;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/d/h;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/ui/images/b/o;->c:Lcom/facebook/ui/images/d/h;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ui/images/b/o;)Z
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/o;->e:Z

    return v0
.end method

.method static synthetic f(Lcom/facebook/ui/images/b/o;)Z
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/o;->f:Z

    return v0
.end method

.method static synthetic g(Lcom/facebook/ui/images/b/o;)Z
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/o;->g:Z

    return v0
.end method

.method static synthetic h(Lcom/facebook/ui/images/b/o;)Z
    .locals 1

    .prologue
    .line 224
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/o;->h:Z

    return v0
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/m;
    .locals 2

    .prologue
    .line 343
    new-instance v0, Lcom/facebook/ui/images/b/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/images/b/m;-><init>(Lcom/facebook/ui/images/b/o;Lcom/facebook/ui/images/b/n;)V

    return-object v0
.end method

.method public a(Lcom/facebook/ui/images/base/b;)Lcom/facebook/ui/images/b/o;
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Lcom/facebook/ui/images/b/o;->b:Lcom/facebook/ui/images/base/b;

    .line 263
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;
    .locals 0

    .prologue
    .line 286
    iput-object p1, p0, Lcom/facebook/ui/images/b/o;->d:Lcom/facebook/ui/images/cache/e;

    .line 287
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/b/o;
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/facebook/ui/images/b/o;->c:Lcom/facebook/ui/images/d/h;

    .line 275
    return-object p0
.end method

.method public a(Z)Lcom/facebook/ui/images/b/o;
    .locals 0

    .prologue
    .line 297
    iput-boolean p1, p0, Lcom/facebook/ui/images/b/o;->e:Z

    .line 298
    return-object p0
.end method
