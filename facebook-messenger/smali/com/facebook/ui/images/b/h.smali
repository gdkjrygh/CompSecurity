.class public Lcom/facebook/ui/images/b/h;
.super Ljava/lang/Object;
.source "FetchImageExecutor.java"


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ui/images/cache/a;

.field private final c:Lcom/facebook/common/executors/n;

.field private final d:Lcom/facebook/ui/images/b/l;

.field private final e:Lcom/facebook/ui/images/b/e;


# direct methods
.method public constructor <init>(Lcom/facebook/ui/images/cache/a;Lcom/facebook/common/executors/n;Lcom/facebook/ui/images/b/l;Lcom/facebook/ui/images/b/e;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-class v0, Lcom/facebook/ui/images/b/h;

    iput-object v0, p0, Lcom/facebook/ui/images/b/h;->a:Ljava/lang/Class;

    .line 41
    iput-object p1, p0, Lcom/facebook/ui/images/b/h;->b:Lcom/facebook/ui/images/cache/a;

    .line 42
    iput-object p2, p0, Lcom/facebook/ui/images/b/h;->c:Lcom/facebook/common/executors/n;

    .line 43
    iput-object p3, p0, Lcom/facebook/ui/images/b/h;->d:Lcom/facebook/ui/images/b/l;

    .line 44
    iput-object p4, p0, Lcom/facebook/ui/images/b/h;->e:Lcom/facebook/ui/images/b/e;

    .line 45
    return-void
.end method

.method private a(Landroid/net/Uri;I)I
    .locals 1

    .prologue
    .line 179
    invoke-virtual {p1}, Landroid/net/Uri;->hashCode()I

    move-result v0

    rem-int/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/h;)Lcom/facebook/ui/images/b/l;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/ui/images/b/h;->d:Lcom/facebook/ui/images/b/l;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/h;->c(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method private c(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/images/b/m;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x3

    .line 133
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v1

    .line 134
    iget-object v0, p0, Lcom/facebook/ui/images/b/h;->c:Lcom/facebook/common/executors/n;

    invoke-virtual {v0, v1}, Lcom/facebook/common/executors/n;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 135
    if-nez v0, :cond_1

    .line 137
    const/4 v0, 0x0

    .line 138
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->b()Lcom/facebook/ui/images/base/b;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 139
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->j()Lcom/facebook/ui/images/cache/d;

    move-result-object v2

    .line 140
    iget-object v3, p0, Lcom/facebook/ui/images/b/h;->b:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v3, v2}, Lcom/facebook/ui/images/cache/a;->b(Lcom/facebook/ui/media/cache/l;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 141
    const/4 v0, 0x1

    .line 145
    :cond_0
    new-instance v2, Lcom/facebook/ui/images/b/k;

    invoke-direct {v2, p0, p1}, Lcom/facebook/ui/images/b/k;-><init>(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;)V

    .line 159
    if-eqz v0, :cond_2

    .line 160
    const-string v0, "fetch-image-task-processing"

    .line 171
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    .line 172
    iget-object v4, p0, Lcom/facebook/ui/images/b/h;->c:Lcom/facebook/common/executors/n;

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/facebook/common/executors/n;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/concurrent/Callable;Ljava/lang/String;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 175
    :cond_1
    return-object v0

    .line 162
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->a()Landroid/net/Uri;

    move-result-object v0

    .line 163
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    const-string v4, "api."

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 164
    invoke-direct {p0, v0, v5}, Lcom/facebook/ui/images/b/h;->a(Landroid/net/Uri;I)I

    move-result v0

    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "fetch-image-api-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 167
    :cond_3
    invoke-direct {p0, v0, v5}, Lcom/facebook/ui/images/b/h;->a(Landroid/net/Uri;I)I

    move-result v0

    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "fetch-image-other-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/r;
    .locals 2

    .prologue
    .line 48
    invoke-static {p1}, Lcom/facebook/ui/images/b/p;->a(Lcom/facebook/ui/images/b/m;)Lcom/facebook/ui/images/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/q;->c()Lcom/facebook/ui/images/b/p;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/facebook/ui/images/b/h;->d:Lcom/facebook/ui/images/b/l;

    invoke-interface {v1, v0}, Lcom/facebook/ui/images/b/l;->a(Lcom/facebook/ui/images/b/p;)Lcom/facebook/ui/images/b/r;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/ui/images/b/m;",
            ")",
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/ui/images/b/r;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->i()Lcom/facebook/ui/images/cache/d;

    move-result-object v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    iget-object v0, p0, Lcom/facebook/ui/images/b/h;->b:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/a;->g(Lcom/facebook/ui/media/cache/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    invoke-static {v1}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/v;->ERROR:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/u;->PREV_FAILURE_RETRY_BLOCKED:Lcom/facebook/ui/images/b/u;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 121
    :goto_0
    return-object v0

    .line 74
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/ui/images/b/m;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    iget-object v0, p0, Lcom/facebook/ui/images/b/h;->b:Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/cache/a;->a(Lcom/facebook/ui/media/cache/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 76
    if-eqz v0, :cond_1

    .line 77
    invoke-static {v1}, Lcom/facebook/ui/images/b/r;->a(Lcom/facebook/ui/images/cache/d;)Lcom/facebook/ui/images/b/t;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/b/t;->a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    sget-object v1, Lcom/facebook/ui/images/b/v;->MEMORY_CACHE:Lcom/facebook/ui/images/b/v;

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/b/t;->a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/b/t;->a()Lcom/facebook/ui/images/b/r;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/facebook/ui/images/b/h;->e:Lcom/facebook/ui/images/b/e;

    invoke-virtual {v1, p1}, Lcom/facebook/ui/images/b/e;->a(Lcom/facebook/ui/images/b/m;)Lcom/google/common/d/a/s;

    move-result-object v1

    .line 91
    new-instance v2, Lcom/facebook/ui/images/b/i;

    invoke-direct {v2, p0, p1, v0}, Lcom/facebook/ui/images/b/i;-><init>(Lcom/facebook/ui/images/b/h;Lcom/facebook/ui/images/b/m;Lcom/google/common/d/a/ab;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method
