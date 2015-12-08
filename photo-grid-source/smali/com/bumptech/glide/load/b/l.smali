.class final Lcom/bumptech/glide/load/b/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/b/u;


# static fields
.field private static final a:Lcom/bumptech/glide/load/b/m;

.field private static final b:Landroid/os/Handler;


# instance fields
.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/bumptech/glide/g/f;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/bumptech/glide/load/b/m;

.field private final e:Lcom/bumptech/glide/load/b/o;

.field private final f:Lcom/bumptech/glide/load/c;

.field private final g:Ljava/util/concurrent/ExecutorService;

.field private final h:Ljava/util/concurrent/ExecutorService;

.field private final i:Z

.field private j:Z

.field private k:Lcom/bumptech/glide/load/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/x",
            "<*>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:Ljava/lang/Exception;

.field private n:Z

.field private o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/bumptech/glide/g/f;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/bumptech/glide/load/b/t;

.field private q:Lcom/bumptech/glide/load/b/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/b/r",
            "<*>;"
        }
    .end annotation
.end field

.field private volatile r:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 23
    new-instance v0, Lcom/bumptech/glide/load/b/m;

    invoke-direct {v0}, Lcom/bumptech/glide/load/b/m;-><init>()V

    sput-object v0, Lcom/bumptech/glide/load/b/l;->a:Lcom/bumptech/glide/load/b/m;

    .line 24
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/bumptech/glide/load/b/n;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/bumptech/glide/load/b/n;-><init>(B)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, Lcom/bumptech/glide/load/b/l;->b:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/load/c;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/bumptech/glide/load/b/o;)V
    .locals 7

    .prologue
    .line 53
    sget-object v6, Lcom/bumptech/glide/load/b/l;->a:Lcom/bumptech/glide/load/b/m;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/bumptech/glide/load/b/l;-><init>(Lcom/bumptech/glide/load/c;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/bumptech/glide/load/b/o;Lcom/bumptech/glide/load/b/m;)V

    .line 54
    return-void
.end method

.method private constructor <init>(Lcom/bumptech/glide/load/c;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;ZLcom/bumptech/glide/load/b/o;Lcom/bumptech/glide/load/b/m;)V
    .locals 1

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    .line 58
    iput-object p1, p0, Lcom/bumptech/glide/load/b/l;->f:Lcom/bumptech/glide/load/c;

    .line 59
    iput-object p2, p0, Lcom/bumptech/glide/load/b/l;->g:Ljava/util/concurrent/ExecutorService;

    .line 60
    iput-object p3, p0, Lcom/bumptech/glide/load/b/l;->h:Ljava/util/concurrent/ExecutorService;

    .line 61
    iput-boolean p4, p0, Lcom/bumptech/glide/load/b/l;->i:Z

    .line 62
    iput-object p5, p0, Lcom/bumptech/glide/load/b/l;->e:Lcom/bumptech/glide/load/b/o;

    .line 63
    iput-object p6, p0, Lcom/bumptech/glide/load/b/l;->d:Lcom/bumptech/glide/load/b/m;

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/bumptech/glide/load/b/l;)V
    .locals 3

    .prologue
    .line 22
    .line 1141
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->j:Z

    if-eqz v0, :cond_0

    .line 1142
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->k:Lcom/bumptech/glide/load/b/x;

    invoke-interface {v0}, Lcom/bumptech/glide/load/b/x;->d()V

    .line 1143
    :goto_0
    return-void

    .line 1144
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1145
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received a resource without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1147
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->k:Lcom/bumptech/glide/load/b/x;

    iget-boolean v1, p0, Lcom/bumptech/glide/load/b/l;->i:Z

    .line 1191
    new-instance v2, Lcom/bumptech/glide/load/b/r;

    invoke-direct {v2, v0, v1}, Lcom/bumptech/glide/load/b/r;-><init>(Lcom/bumptech/glide/load/b/x;Z)V

    .line 1147
    iput-object v2, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    .line 1148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->l:Z

    .line 1152
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/r;->e()V

    .line 1153
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->e:Lcom/bumptech/glide/load/b/o;

    iget-object v1, p0, Lcom/bumptech/glide/load/b/l;->f:Lcom/bumptech/glide/load/c;

    iget-object v2, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-interface {v0, v1, v2}, Lcom/bumptech/glide/load/b/o;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;)V

    .line 1155
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/g/f;

    .line 1156
    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/l;->c(Lcom/bumptech/glide/g/f;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1157
    iget-object v2, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-virtual {v2}, Lcom/bumptech/glide/load/b/r;->e()V

    .line 1158
    iget-object v2, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-interface {v0, v2}, Lcom/bumptech/glide/g/f;->a(Lcom/bumptech/glide/load/b/x;)V

    goto :goto_1

    .line 1162
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/r;->f()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/bumptech/glide/load/b/l;)V
    .locals 3

    .prologue
    .line 22
    .line 2172
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->j:Z

    if-nez v0, :cond_2

    .line 2174
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2175
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 2177
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->n:Z

    .line 2179
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->e:Lcom/bumptech/glide/load/b/o;

    iget-object v1, p0, Lcom/bumptech/glide/load/b/l;->f:Lcom/bumptech/glide/load/c;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/bumptech/glide/load/b/o;->a(Lcom/bumptech/glide/load/c;Lcom/bumptech/glide/load/b/r;)V

    .line 2181
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/g/f;

    .line 2182
    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/b/l;->c(Lcom/bumptech/glide/g/f;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 2183
    iget-object v2, p0, Lcom/bumptech/glide/load/b/l;->m:Ljava/lang/Exception;

    invoke-interface {v0, v2}, Lcom/bumptech/glide/g/f;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 22
    :cond_2
    return-void
.end method

.method private c(Lcom/bumptech/glide/g/f;)Z
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->o:Ljava/util/Set;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->o:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/g/f;)V
    .locals 1

    .prologue
    .line 77
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 78
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->l:Z

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->q:Lcom/bumptech/glide/load/b/r;

    invoke-interface {p1, v0}, Lcom/bumptech/glide/g/f;->a(Lcom/bumptech/glide/load/b/x;)V

    .line 85
    :goto_0
    return-void

    .line 80
    :cond_0
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->n:Z

    if-eqz v0, :cond_1

    .line 81
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->m:Ljava/lang/Exception;

    invoke-interface {p1, v0}, Lcom/bumptech/glide/g/f;->a(Ljava/lang/Exception;)V

    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a(Lcom/bumptech/glide/load/b/t;)V
    .locals 1

    .prologue
    .line 67
    iput-object p1, p0, Lcom/bumptech/glide/load/b/l;->p:Lcom/bumptech/glide/load/b/t;

    .line 68
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->g:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/b/l;->r:Ljava/util/concurrent/Future;

    .line 69
    return-void
.end method

.method public final a(Lcom/bumptech/glide/load/b/x;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/b/x",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 136
    iput-object p1, p0, Lcom/bumptech/glide/load/b/l;->k:Lcom/bumptech/glide/load/b/x;

    .line 137
    sget-object v0, Lcom/bumptech/glide/load/b/l;->b:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 138
    return-void
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .prologue
    .line 167
    iput-object p1, p0, Lcom/bumptech/glide/load/b/l;->m:Ljava/lang/Exception;

    .line 168
    sget-object v0, Lcom/bumptech/glide/load/b/l;->b:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 169
    return-void
.end method

.method public final b(Lcom/bumptech/glide/g/f;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 88
    invoke-static {}, Lcom/bumptech/glide/i/h;->a()V

    .line 89
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->l:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->n:Z

    if-eqz v0, :cond_3

    .line 1105
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->o:Ljava/util/Set;

    if-nez v0, :cond_1

    .line 1106
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/b/l;->o:Ljava/util/Set;

    .line 1108
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->o:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1118
    :cond_2
    :goto_0
    return-void

    .line 92
    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 93
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1117
    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->n:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->l:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/bumptech/glide/load/b/l;->j:Z

    if-nez v0, :cond_2

    .line 1120
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->p:Lcom/bumptech/glide/load/b/t;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/b/t;->a()V

    .line 1121
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->r:Ljava/util/concurrent/Future;

    .line 1122
    if-eqz v0, :cond_4

    .line 1123
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 1125
    :cond_4
    iput-boolean v1, p0, Lcom/bumptech/glide/load/b/l;->j:Z

    .line 1126
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->e:Lcom/bumptech/glide/load/b/o;

    iget-object v1, p0, Lcom/bumptech/glide/load/b/l;->f:Lcom/bumptech/glide/load/c;

    invoke-interface {v0, p0, v1}, Lcom/bumptech/glide/load/b/o;->a(Lcom/bumptech/glide/load/b/l;Lcom/bumptech/glide/load/c;)V

    goto :goto_0
.end method

.method public final b(Lcom/bumptech/glide/load/b/t;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/bumptech/glide/load/b/l;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/b/l;->r:Ljava/util/concurrent/Future;

    .line 74
    return-void
.end method
