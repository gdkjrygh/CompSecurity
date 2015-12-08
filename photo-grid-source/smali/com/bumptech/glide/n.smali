.class final Lcom/bumptech/glide/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Lcom/bumptech/glide/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x7

    const/4 v1, 0x0

    .line 284
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 285
    invoke-static {v4}, Lcom/bumptech/glide/i/h;->a(I)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/n;->a:Ljava/util/Queue;

    move v0, v1

    .line 287
    :goto_0
    if-ge v0, v4, :cond_0

    .line 288
    iget-object v2, p0, Lcom/bumptech/glide/n;->a:Ljava/util/Queue;

    new-instance v3, Lcom/bumptech/glide/m;

    invoke-direct {v3, v1}, Lcom/bumptech/glide/m;-><init>(B)V

    invoke-interface {v2, v3}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 287
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 290
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(II)Lcom/bumptech/glide/m;
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Lcom/bumptech/glide/n;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/m;

    .line 294
    iget-object v1, p0, Lcom/bumptech/glide/n;->a:Ljava/util/Queue;

    invoke-interface {v1, v0}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 295
    invoke-static {v0, p1}, Lcom/bumptech/glide/m;->a(Lcom/bumptech/glide/m;I)I

    .line 296
    invoke-static {v0, p2}, Lcom/bumptech/glide/m;->b(Lcom/bumptech/glide/m;I)I

    .line 297
    return-object v0
.end method
