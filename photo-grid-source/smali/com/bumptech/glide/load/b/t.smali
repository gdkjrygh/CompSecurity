.class final Lcom/bumptech/glide/load/b/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/c/h;
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:I

.field private final b:Lcom/bumptech/glide/load/b/u;

.field private final c:Lcom/bumptech/glide/load/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/a",
            "<***>;"
        }
    .end annotation
.end field

.field private d:I

.field private volatile e:Z


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/b/u;Lcom/bumptech/glide/load/b/a;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/u;",
            "Lcom/bumptech/glide/load/b/a",
            "<***>;I)V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/bumptech/glide/load/b/t;->b:Lcom/bumptech/glide/load/b/u;

    .line 39
    iput-object p2, p0, Lcom/bumptech/glide/load/b/t;->c:Lcom/bumptech/glide/load/b/a;

    .line 40
    sget v0, Lcom/bumptech/glide/load/b/v;->a:I

    iput v0, p0, Lcom/bumptech/glide/load/b/t;->d:I

    .line 41
    iput p3, p0, Lcom/bumptech/glide/load/b/t;->a:I

    .line 42
    return-void
.end method

.method private c()Z
    .locals 2

    .prologue
    .line 81
    iget v0, p0, Lcom/bumptech/glide/load/b/t;->d:I

    sget v1, Lcom/bumptech/glide/load/b/v;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d()Lcom/bumptech/glide/load/b/x;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/b/x",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 106
    const/4 v1, 0x0

    .line 108
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->c:Lcom/bumptech/glide/load/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/a;->a()Lcom/bumptech/glide/load/b/x;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 115
    :goto_0
    if-nez v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->c:Lcom/bumptech/glide/load/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/a;->b()Lcom/bumptech/glide/load/b/x;

    move-result-object v0

    .line 118
    :cond_0
    return-object v0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    const-string v2, "EngineRunnable"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception decoding result from cache: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/b/t;->e:Z

    .line 46
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->c:Lcom/bumptech/glide/load/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/a;->d()V

    .line 47
    return-void
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 127
    iget v0, p0, Lcom/bumptech/glide/load/b/t;->a:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final run()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 51
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/t;->e:Z

    if-eqz v0, :cond_1

    .line 2091
    :cond_0
    :goto_0
    return-void

    .line 1098
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/t;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1099
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/t;->d()Lcom/bumptech/glide/load/b/x;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 66
    :goto_1
    iget-boolean v2, p0, Lcom/bumptech/glide/load/b/t;->e:Z

    if-eqz v2, :cond_3

    .line 67
    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0}, Lcom/bumptech/glide/load/b/x;->d()V

    goto :goto_0

    .line 1122
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->c:Lcom/bumptech/glide/load/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/a;->c()Lcom/bumptech/glide/load/b/x;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    const-string v2, "EngineRunnable"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_1

    .line 73
    :cond_3
    if-nez v0, :cond_5

    .line 2089
    invoke-direct {p0}, Lcom/bumptech/glide/load/b/t;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2090
    sget v0, Lcom/bumptech/glide/load/b/v;->b:I

    iput v0, p0, Lcom/bumptech/glide/load/b/t;->d:I

    .line 2091
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->b:Lcom/bumptech/glide/load/b/u;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/load/b/u;->b(Lcom/bumptech/glide/load/b/t;)V

    goto :goto_0

    .line 2093
    :cond_4
    iget-object v0, p0, Lcom/bumptech/glide/load/b/t;->b:Lcom/bumptech/glide/load/b/u;

    invoke-interface {v0, v1}, Lcom/bumptech/glide/load/b/u;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 3085
    :cond_5
    iget-object v1, p0, Lcom/bumptech/glide/load/b/t;->b:Lcom/bumptech/glide/load/b/u;

    invoke-interface {v1, v0}, Lcom/bumptech/glide/load/b/u;->a(Lcom/bumptech/glide/load/b/x;)V

    goto :goto_0
.end method
