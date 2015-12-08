.class public abstract Lcom/roidapp/cloudlib/sns/o;
.super Lcom/roidapp/baselib/e/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/roidapp/baselib/e/g",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private volatile e:Z

.field private volatile f:Z

.field private volatile g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/v;",
            ">;"
        }
    .end annotation
.end field

.field private j:I

.field private final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/i;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 34
    invoke-direct {p0, p1, p3, v1}, Lcom/roidapp/baselib/e/g;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;B)V

    .line 20
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->e:Z

    .line 21
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/o;->f:Z

    .line 22
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/o;->g:Z

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->k:Ljava/util/List;

    .line 35
    invoke-virtual {p0, p2}, Lcom/roidapp/cloudlib/sns/o;->a(Lcom/roidapp/baselib/e/i;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/j",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 30
    sget-object v0, Lcom/roidapp/baselib/e/i;->a:Lcom/roidapp/baselib/e/i;

    invoke-direct {p0, p1, v0, p2}, Lcom/roidapp/cloudlib/sns/o;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 31
    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/roidapp/cloudlib/sns/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/roidapp/cloudlib/sns/o",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 94
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/o;->e:Z

    .line 95
    return-object p0
.end method

.method protected abstract a(Ljava/lang/String;Z)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)TT;"
        }
    .end annotation
.end method

.method protected final a(Ljava/net/HttpURLConnection;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 117
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/d/a;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/String;Z)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method final a(Lcom/roidapp/cloudlib/sns/v;)V
    .locals 1

    .prologue
    .line 121
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->i:Ljava/lang/ref/WeakReference;

    .line 122
    return-void
.end method

.method protected final a(Ljava/lang/Iterable;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<",
            "Lcom/roidapp/baselib/e/f;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    if-eqz p1, :cond_1

    .line 41
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/e/f;

    .line 42
    instance-of v2, v0, Lcom/roidapp/baselib/e/k;

    if-eqz v2, :cond_0

    .line 43
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/o;->k:Ljava/util/List;

    new-instance v3, Ljava/lang/String;

    check-cast v0, Lcom/roidapp/baselib/e/k;

    invoke-virtual {v0}, Lcom/roidapp/baselib/e/k;->a()[B

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/String;-><init>([B)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/baselib/e/g;->a(Ljava/lang/Iterable;)V

    .line 48
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Lcom/roidapp/cloudlib/sns/o;->j:I

    .line 73
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/u;->a(Lcom/roidapp/cloudlib/sns/o;)V

    .line 74
    return-void
.end method

.method final b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 125
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->i:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->e:Z

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/v;

    .line 127
    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/v;->a()Lcom/roidapp/cloudlib/sns/p;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_0

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "save to cache - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/o;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " --- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/o;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/m;->b(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/o;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/cloudlib/sns/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/p;->b()V

    .line 136
    :cond_0
    return-void
.end method

.method public final bridge synthetic d()Lcom/roidapp/baselib/e/j;
    .locals 1

    .prologue
    .line 17
    .line 2052
    invoke-super {p0}, Lcom/roidapp/baselib/e/g;->d()Lcom/roidapp/baselib/e/j;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/x;

    .line 17
    return-object v0
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1052
    invoke-super {p0}, Lcom/roidapp/baselib/e/g;->d()Lcom/roidapp/baselib/e/j;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/x;

    .line 59
    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/x;->a()V

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 64
    :goto_0
    if-eqz v0, :cond_1

    .line 66
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_1
    :goto_1
    return-void

    .line 63
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final i()Lcom/roidapp/cloudlib/sns/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/cloudlib/sns/x",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 52
    invoke-super {p0}, Lcom/roidapp/baselib/e/g;->d()Lcom/roidapp/baselib/e/j;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/x;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final l()Lcom/roidapp/cloudlib/sns/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/roidapp/cloudlib/sns/o",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->f:Z

    .line 86
    return-object p0
.end method

.method final m()Z
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->f:Z

    return v0
.end method

.method final n()Z
    .locals 1

    .prologue
    .line 99
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->e:Z

    return v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->d:Ljava/lang/String;

    return-object v0
.end method

.method final p()Ljava/lang/String;
    .locals 2

    .prologue
    .line 107
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->h:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/o;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/o;->k:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/d/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->h:Ljava/lang/String;

    .line 110
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->h:Ljava/lang/String;

    return-object v0
.end method

.method final q()V
    .locals 2

    .prologue
    .line 139
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 140
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/o;->c()V

    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->i:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/o;->i:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/v;

    .line 144
    if-eqz v0, :cond_1

    .line 145
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/v;->b(Lcom/roidapp/cloudlib/sns/o;)V

    .line 151
    :cond_0
    :goto_0
    return-void

    .line 148
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SnsRequestQueue was recycled in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/m;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method final r()Z
    .locals 1

    .prologue
    .line 154
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->g:Z

    return v0
.end method

.method final s()V
    .locals 1

    .prologue
    .line 158
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/o;->g:Z

    .line 159
    return-void
.end method

.method final t()I
    .locals 1

    .prologue
    .line 162
    iget v0, p0, Lcom/roidapp/cloudlib/sns/o;->j:I

    return v0
.end method
