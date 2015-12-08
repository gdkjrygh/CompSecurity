.class final Lcom/bumptech/glide/load/b/k;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference",
        "<",
        "Lcom/bumptech/glide/load/b/r",
        "<*>;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/load/c;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/c;",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;",
            "Ljava/lang/ref/ReferenceQueue",
            "<-",
            "Lcom/bumptech/glide/load/b/r",
            "<*>;>;)V"
        }
    .end annotation

    .prologue
    .line 339
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 340
    iput-object p1, p0, Lcom/bumptech/glide/load/b/k;->a:Lcom/bumptech/glide/load/c;

    .line 341
    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/load/b/k;)Lcom/bumptech/glide/load/c;
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Lcom/bumptech/glide/load/b/k;->a:Lcom/bumptech/glide/load/c;

    return-object v0
.end method
