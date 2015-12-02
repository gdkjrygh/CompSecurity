.class public Lcom/android/volley/e;
.super Lcom/android/volley/j;
.source "360Security"


# direct methods
.method public constructor <init>(Lcom/android/volley/a;Lcom/android/volley/g;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/android/volley/j;-><init>(Lcom/android/volley/a;Lcom/android/volley/g;)V

    .line 39
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/android/volley/e;->b()V

    .line 45
    new-instance v0, Lcom/android/volley/b;

    iget-object v1, p0, Lcom/android/volley/e;->a:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v2, p0, Lcom/android/volley/e;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/android/volley/e;->c:Lcom/android/volley/a;

    iget-object v4, p0, Lcom/android/volley/e;->e:Lcom/android/volley/l;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/android/volley/b;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/a;Lcom/android/volley/l;)V

    iput-object v0, p0, Lcom/android/volley/e;->g:Lcom/android/volley/b;

    .line 46
    iget-object v0, p0, Lcom/android/volley/e;->g:Lcom/android/volley/b;

    invoke-virtual {v0}, Lcom/android/volley/b;->start()V

    .line 49
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/android/volley/e;->f:[Lcom/android/volley/h;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 50
    new-instance v1, Lcom/android/volley/d;

    iget-object v2, p0, Lcom/android/volley/e;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Lcom/android/volley/e;->d:Lcom/android/volley/g;

    iget-object v4, p0, Lcom/android/volley/e;->c:Lcom/android/volley/a;

    iget-object v5, p0, Lcom/android/volley/e;->e:Lcom/android/volley/l;

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/android/volley/d;-><init>(Ljava/util/concurrent/BlockingQueue;Lcom/android/volley/g;Lcom/android/volley/a;Lcom/android/volley/l;)V

    .line 52
    iget-object v2, p0, Lcom/android/volley/e;->f:[Lcom/android/volley/h;

    aput-object v1, v2, v0

    .line 53
    invoke-virtual {v1}, Lcom/android/volley/d;->start()V

    .line 49
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 55
    :cond_0
    return-void
.end method
