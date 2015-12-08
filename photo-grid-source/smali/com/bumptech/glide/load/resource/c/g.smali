.class final Lcom/bumptech/glide/load/resource/c/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/bumptech/glide/load/resource/c/i;

.field private final b:Lcom/bumptech/glide/b/a;

.field private final c:Landroid/os/Handler;

.field private d:Z

.field private e:Z

.field private f:Lcom/bumptech/glide/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/e",
            "<",
            "Lcom/bumptech/glide/b/a;",
            "Lcom/bumptech/glide/b/a;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/bumptech/glide/load/resource/c/h;

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/resource/c/i;Lcom/bumptech/glide/b/a;II)V
    .locals 5

    .prologue
    .line 43
    invoke-static {p1}, Lcom/bumptech/glide/h;->a(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/h;->a()Lcom/bumptech/glide/load/b/a/e;

    move-result-object v0

    .line 1172
    new-instance v1, Lcom/bumptech/glide/load/resource/c/n;

    invoke-direct {v1, v0}, Lcom/bumptech/glide/load/resource/c/n;-><init>(Lcom/bumptech/glide/load/b/a/e;)V

    .line 1173
    new-instance v0, Lcom/bumptech/glide/load/resource/c/l;

    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/c/l;-><init>()V

    .line 1174
    invoke-static {}, Lcom/bumptech/glide/load/resource/a;->b()Lcom/bumptech/glide/load/b;

    move-result-object v2

    .line 1175
    invoke-static {p1}, Lcom/bumptech/glide/h;->b(Landroid/content/Context;)Lcom/bumptech/glide/p;

    move-result-object v3

    const-class v4, Lcom/bumptech/glide/b/a;

    invoke-virtual {v3, v0, v4}, Lcom/bumptech/glide/p;->a(Lcom/bumptech/glide/load/c/s;Ljava/lang/Class;)Lcom/bumptech/glide/r;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/bumptech/glide/r;->a(Ljava/lang/Object;)Lcom/bumptech/glide/s;

    move-result-object v0

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3}, Lcom/bumptech/glide/s;->a(Ljava/lang/Class;)Lcom/bumptech/glide/g;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/g;->a(Lcom/bumptech/glide/load/b;)Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/e;)Lcom/bumptech/glide/e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Z)Lcom/bumptech/glide/e;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->b:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->b(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Lcom/bumptech/glide/e;->a(II)Lcom/bumptech/glide/e;

    move-result-object v0

    .line 43
    invoke-direct {p0, p2, p3, v0}, Lcom/bumptech/glide/load/resource/c/g;-><init>(Lcom/bumptech/glide/load/resource/c/i;Lcom/bumptech/glide/b/a;Lcom/bumptech/glide/e;)V

    .line 45
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/resource/c/i;Lcom/bumptech/glide/b/a;Lcom/bumptech/glide/e;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/c/i;",
            "Lcom/bumptech/glide/b/a;",
            "Lcom/bumptech/glide/e",
            "<",
            "Lcom/bumptech/glide/b/a;",
            "Lcom/bumptech/glide/b/a;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-boolean v3, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    .line 33
    iput-boolean v3, p0, Lcom/bumptech/glide/load/resource/c/g;->e:Z

    .line 50
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/bumptech/glide/load/resource/c/j;

    invoke-direct {v2, p0, v3}, Lcom/bumptech/glide/load/resource/c/j;-><init>(Lcom/bumptech/glide/load/resource/c/g;B)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 52
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/g;->a:Lcom/bumptech/glide/load/resource/c/i;

    .line 53
    iput-object p2, p0, Lcom/bumptech/glide/load/resource/c/g;->b:Lcom/bumptech/glide/b/a;

    .line 54
    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->c:Landroid/os/Handler;

    .line 55
    iput-object p3, p0, Lcom/bumptech/glide/load/resource/c/g;->f:Lcom/bumptech/glide/e;

    .line 56
    return-void
.end method

.method private e()V
    .locals 5

    .prologue
    .line 95
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->e:Z

    if-eqz v0, :cond_1

    .line 106
    :cond_0
    :goto_0
    return-void

    .line 98
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->e:Z

    .line 100
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->b:Lcom/bumptech/glide/b/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/b/a;->a()V

    .line 101
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/bumptech/glide/load/resource/c/g;->b:Lcom/bumptech/glide/b/a;

    invoke-virtual {v2}, Lcom/bumptech/glide/b/a;->b()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    .line 102
    new-instance v2, Lcom/bumptech/glide/load/resource/c/h;

    iget-object v3, p0, Lcom/bumptech/glide/load/resource/c/g;->c:Landroid/os/Handler;

    iget-object v4, p0, Lcom/bumptech/glide/load/resource/c/g;->b:Lcom/bumptech/glide/b/a;

    invoke-virtual {v4}, Lcom/bumptech/glide/b/a;->d()I

    move-result v4

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/bumptech/glide/load/resource/c/h;-><init>(Landroid/os/Handler;IJ)V

    .line 103
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->f:Lcom/bumptech/glide/e;

    new-instance v1, Lcom/bumptech/glide/load/resource/c/k;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/c/k;-><init>()V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/load/c;)Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/e;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 67
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    if-eqz v0, :cond_0

    .line 74
    :goto_0
    return-void

    .line 70
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    .line 71
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->h:Z

    .line 73
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/g;->e()V

    goto :goto_0
.end method

.method public final a(Lcom/bumptech/glide/load/g;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 60
    if-nez p1, :cond_0

    .line 61
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Transformation must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->f:Lcom/bumptech/glide/e;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/bumptech/glide/load/g;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a([Lcom/bumptech/glide/load/g;)Lcom/bumptech/glide/e;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->f:Lcom/bumptech/glide/e;

    .line 64
    return-void
.end method

.method final a(Lcom/bumptech/glide/load/resource/c/h;)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    .line 110
    iget-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->h:Z

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->c:Landroid/os/Handler;

    invoke-virtual {v0, v3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 125
    :goto_0
    return-void

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    .line 116
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    .line 117
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/g;->a:Lcom/bumptech/glide/load/resource/c/i;

    invoke-static {p1}, Lcom/bumptech/glide/load/resource/c/h;->a(Lcom/bumptech/glide/load/resource/c/h;)I

    move-result v2

    invoke-interface {v1, v2}, Lcom/bumptech/glide/load/resource/c/i;->b(I)V

    .line 119
    if-eqz v0, :cond_1

    .line 120
    iget-object v1, p0, Lcom/bumptech/glide/load/resource/c/g;->c:Landroid/os/Handler;

    invoke-virtual {v1, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 123
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->e:Z

    .line 124
    invoke-direct {p0}, Lcom/bumptech/glide/load/resource/c/g;->e()V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    .line 78
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 81
    .line 2077
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->d:Z

    .line 82
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    invoke-static {v0}, Lcom/bumptech/glide/h;->a(Lcom/bumptech/glide/g/b/k;)V

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    .line 86
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/resource/c/g;->h:Z

    .line 88
    return-void
.end method

.method public final d()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/resource/c/g;->g:Lcom/bumptech/glide/load/resource/c/h;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/resource/c/h;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
