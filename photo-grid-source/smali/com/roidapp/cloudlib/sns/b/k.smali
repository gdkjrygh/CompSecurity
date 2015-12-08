.class public final Lcom/roidapp/cloudlib/sns/b/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/s;
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/baselib/e/r;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->a:Ljava/lang/ref/WeakReference;

    .line 63
    return-void
.end method

.method public static a()V
    .locals 1

    .prologue
    .line 51
    invoke-static {}, Lcom/roidapp/cloudlib/sns/b/j;->a()Lcom/roidapp/cloudlib/sns/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/j;->b()V

    .line 52
    return-void
.end method

.method public static a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;Lcom/roidapp/cloudlib/sns/b/m;)V
    .locals 3

    .prologue
    .line 28
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 48
    :cond_0
    :goto_0
    return-void

    .line 32
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/b/j;->a()Lcom/roidapp/cloudlib/sns/b/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/sns/b/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 33
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 34
    invoke-interface {p2, p0, v0}, Lcom/roidapp/cloudlib/sns/b/m;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :cond_2
    const/4 v0, 0x0

    invoke-interface {p2, p0, v0}, Lcom/roidapp/cloudlib/sns/b/m;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V

    .line 38
    new-instance v1, Lcom/roidapp/cloudlib/sns/b/k;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/b/k;-><init>(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;)V

    .line 40
    sget v0, Lcom/roidapp/cloudlib/ar;->cq:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/cloudlib/sns/b/k;

    if-eqz v0, :cond_3

    .line 41
    sget v0, Lcom/roidapp/cloudlib/ar;->cq:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/k;

    .line 1088
    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/k;->b:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_3

    .line 1089
    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/k;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/e/r;

    .line 1090
    if-eqz v0, :cond_3

    .line 1091
    invoke-virtual {v0}, Lcom/roidapp/baselib/e/r;->f()V

    .line 45
    :cond_3
    sget v0, Lcom/roidapp/cloudlib/ar;->cq:I

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->setTag(ILjava/lang/Object;)V

    .line 2066
    iput-object p1, v1, Lcom/roidapp/cloudlib/sns/b/k;->d:Ljava/lang/String;

    .line 2067
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, v1, Lcom/roidapp/cloudlib/sns/b/k;->e:Ljava/lang/ref/WeakReference;

    .line 2068
    new-instance v0, Lcom/roidapp/cloudlib/sns/b/l;

    invoke-direct {v0, v1, p1, v1}, Lcom/roidapp/cloudlib/sns/b/l;-><init>(Lcom/roidapp/cloudlib/sns/b/k;Ljava/lang/String;Lcom/roidapp/baselib/e/s;)V

    .line 2082
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lcom/roidapp/cloudlib/sns/b/k;->b:Ljava/lang/ref/WeakReference;

    .line 2083
    sget-object v1, Lcom/roidapp/baselib/c/c;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(ILjava/lang/Exception;)V
    .locals 0

    .prologue
    .line 140
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 2133
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2134
    invoke-static {}, Lcom/roidapp/cloudlib/sns/b/j;->a()Lcom/roidapp/cloudlib/sns/b/j;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/b/k;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/cloudlib/sns/b/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3117
    :cond_0
    if-eqz p1, :cond_1

    .line 3118
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 3119
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 3120
    if-eqz v0, :cond_1

    .line 3121
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3122
    if-eqz v0, :cond_1

    .line 3123
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/b/k;->c:Ljava/lang/String;

    .line 3124
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    :cond_1
    return-void
.end method

.method public final run()V
    .locals 3

    .prologue
    .line 98
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->a:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;

    .line 101
    if-eqz v0, :cond_1

    sget v1, Lcom/roidapp/cloudlib/ar;->cq:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, p0, :cond_1

    .line 104
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/b/k;->e:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    .line 105
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/b/k;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/b/m;

    .line 106
    if-eqz v1, :cond_0

    .line 107
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/b/k;->c:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Lcom/roidapp/cloudlib/sns/b/m;->a(Lcom/roidapp/cloudlib/sns/basepost/PostCommentsTextView;Ljava/lang/String;)V

    .line 110
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/k;->c:Ljava/lang/String;

    .line 114
    :cond_1
    return-void
.end method
