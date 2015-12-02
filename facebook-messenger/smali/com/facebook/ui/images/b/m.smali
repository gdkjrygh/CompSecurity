.class public Lcom/facebook/ui/images/b/m;
.super Ljava/lang/Object;
.source "FetchImageParams.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field private final a:Landroid/net/Uri;

.field private final b:Lcom/facebook/ui/images/base/b;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/facebook/ui/images/d/h;

.field private final e:Lcom/facebook/ui/images/cache/e;

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private volatile j:Lcom/facebook/ui/images/cache/d;

.field private volatile k:Lcom/facebook/ui/images/cache/d;

.field private volatile l:Lcom/facebook/ui/images/b/m;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/b/o;)V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/b/o;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/b/o;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 44
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->b(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/b/o;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    .line 47
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->c(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/base/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->b:Lcom/facebook/ui/images/base/b;

    .line 48
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->d(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/d/h;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->d:Lcom/facebook/ui/images/d/h;

    .line 49
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->b(Lcom/facebook/ui/images/b/o;)Lcom/facebook/ui/images/cache/e;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    .line 50
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->e(Lcom/facebook/ui/images/b/o;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/m;->f:Z

    .line 51
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->f(Lcom/facebook/ui/images/b/o;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/m;->g:Z

    .line 52
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->g(Lcom/facebook/ui/images/b/o;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/m;->h:Z

    .line 53
    invoke-static {p1}, Lcom/facebook/ui/images/b/o;->h(Lcom/facebook/ui/images/b/o;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/ui/images/b/m;->i:Z

    .line 55
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->b:Lcom/facebook/ui/images/base/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->b:Lcom/facebook/ui/images/base/b;

    invoke-virtual {v0}, Lcom/facebook/ui/images/base/b;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->c:Ljava/lang/String;

    .line 57
    return-void

    .line 55
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/b/o;Lcom/facebook/ui/images/b/n;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/m;-><init>(Lcom/facebook/ui/images/b/o;)V

    return-void
.end method

.method public static a(Landroid/net/Uri;)Lcom/facebook/ui/images/b/o;
    .locals 2

    .prologue
    .line 203
    new-instance v0, Lcom/facebook/ui/images/b/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/images/b/o;-><init>(Landroid/net/Uri;Lcom/facebook/ui/images/b/n;)V

    return-object v0
.end method

.method public static a(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/m;)Z
    .locals 1

    .prologue
    .line 187
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 188
    const/4 v0, 0x1

    .line 192
    :goto_0
    return v0

    .line 189
    :cond_0
    if-eqz p0, :cond_1

    if-nez p1, :cond_2

    .line 190
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 192
    :cond_2
    invoke-virtual {p0, p1}, Lcom/facebook/ui/images/b/m;->a(Lcom/facebook/ui/images/b/m;)Z

    move-result v0

    goto :goto_0
.end method

.method public static b(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/o;
    .locals 2

    .prologue
    .line 213
    new-instance v0, Lcom/facebook/ui/images/b/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/images/b/o;-><init>(Lcom/facebook/ui/images/b/m;Lcom/facebook/ui/images/b/n;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    return-object v0
.end method

.method public a(Lcom/facebook/ui/images/b/m;)Z
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    iget-object v1, p1, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->c:Ljava/lang/String;

    iget-object v1, p1, Lcom/facebook/ui/images/b/m;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    iget-object v1, p1, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/ui/images/base/b;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->b:Lcom/facebook/ui/images/base/b;

    return-object v0
.end method

.method public c()Lcom/facebook/ui/images/d/h;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->d:Lcom/facebook/ui/images/d/h;

    return-object v0
.end method

.method public d()Lcom/facebook/ui/images/cache/e;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 91
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/m;->f:Z

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 101
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/m;->g:Z

    return v0
.end method

.method public g()Z
    .locals 1

    .prologue
    .line 111
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/m;->h:Z

    return v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 126
    iget-boolean v0, p0, Lcom/facebook/ui/images/b/m;->i:Z

    return v0
.end method

.method public i()Lcom/facebook/ui/images/cache/d;
    .locals 4

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->j:Lcom/facebook/ui/images/cache/d;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->j:Lcom/facebook/ui/images/cache/d;

    .line 160
    :goto_0
    return-object v0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->b:Lcom/facebook/ui/images/base/b;

    if-eqz v0, :cond_2

    .line 152
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->c:Ljava/lang/String;

    sget-object v1, Lcom/facebook/ui/images/base/b;->d:Ljava/lang/String;

    if-ne v0, v1, :cond_1

    .line 153
    const/4 v0, 0x0

    goto :goto_0

    .line 155
    :cond_1
    new-instance v0, Lcom/facebook/ui/images/cache/d;

    iget-object v1, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    iget-object v3, p0, Lcom/facebook/ui/images/b/m;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/ui/images/cache/d;-><init>(Landroid/net/Uri;Lcom/facebook/ui/images/cache/e;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->j:Lcom/facebook/ui/images/cache/d;

    .line 160
    :goto_1
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->j:Lcom/facebook/ui/images/cache/d;

    goto :goto_0

    .line 158
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->j:Lcom/facebook/ui/images/cache/d;

    goto :goto_1
.end method

.method public j()Lcom/facebook/ui/images/cache/d;
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->k:Lcom/facebook/ui/images/cache/d;

    if-nez v0, :cond_0

    .line 165
    new-instance v0, Lcom/facebook/ui/images/cache/d;

    iget-object v1, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/cache/d;-><init>(Landroid/net/Uri;Lcom/facebook/ui/images/cache/e;)V

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->k:Lcom/facebook/ui/images/cache/d;

    .line 167
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->k:Lcom/facebook/ui/images/cache/d;

    return-object v0
.end method

.method public k()Lcom/facebook/ui/images/b/m;
    .locals 3

    .prologue
    .line 171
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->e:Lcom/facebook/ui/images/cache/e;

    sget-object v1, Lcom/facebook/ui/images/cache/d;->b:Lcom/facebook/ui/images/cache/e;

    if-ne v0, v1, :cond_0

    .line 180
    :goto_0
    return-object p0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/facebook/ui/images/b/m;->l:Lcom/facebook/ui/images/b/m;

    if-nez v0, :cond_1

    .line 175
    new-instance v0, Lcom/facebook/ui/images/b/o;

    iget-object v1, p0, Lcom/facebook/ui/images/b/m;->a:Landroid/net/Uri;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/ui/images/b/o;-><init>(Landroid/net/Uri;Lcom/facebook/ui/images/b/n;)V

    sget-object v1, Lcom/facebook/ui/images/cache/d;->b:Lcom/facebook/ui/images/cache/e;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/o;->a(Lcom/facebook/ui/images/cache/e;)Lcom/facebook/ui/images/b/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/o;->a()Lcom/facebook/ui/images/b/m;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ui/images/b/m;->l:Lcom/facebook/ui/images/b/m;

    .line 180
    :cond_1
    iget-object p0, p0, Lcom/facebook/ui/images/b/m;->l:Lcom/facebook/ui/images/b/m;

    goto :goto_0
.end method
