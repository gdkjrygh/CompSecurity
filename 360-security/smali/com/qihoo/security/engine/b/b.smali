.class public Lcom/qihoo/security/engine/b/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qihoo/security/engine/d/c$a;


# instance fields
.field final a:Landroid/content/Context;

.field final b:Lcom/qihoo/security/engine/b/c;

.field final c:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Lcom/qihoo/security/engine/d/c;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljava/util/concurrent/Executor;

.field volatile e:Z

.field volatile f:Z

.field private g:I

.field private final h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/qihoo/security/engine/b/c;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/qihoo/security/engine/b/b;->g:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/b/b;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/b/b;->h:Landroid/util/SparseArray;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->e:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    iput-object p1, p0, Lcom/qihoo/security/engine/b/b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    return-void
.end method

.method private d()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/d/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/d/c;->e()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/engine/d/b;)I
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/d/b;->a(I)Lcom/qihoo/security/engine/FileInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v1, :cond_0

    const-string/jumbo v2, "v5t"

    new-instance v3, Ljava/lang/StringBuilder;

    sget-object v4, Lcom/qihoo/security/env/QVSEnv;->LAST_UPDATE_TIME_STAMP:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/engine/ApkInfo;->addUpExts(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    if-eqz v1, :cond_2

    const v0, -0x7fffbffc

    :cond_1
    :goto_0
    return v0

    :cond_2
    const-string/jumbo v1, "1"

    iget-object v2, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    const-string/jumbo v3, "debug.idle_enumerator"

    invoke-virtual {v2, v3}, Lcom/qihoo/security/engine/b/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/c;->f:Lcom/qihoo/security/engine/e/c;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/e/c;->a(Lcom/qihoo/security/engine/d/b;)I

    move-result v0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/c;->e:Lcom/qihoo/security/services/d;

    invoke-virtual {v1}, Lcom/qihoo/security/services/d;->e()Lcom/qihoo/security/services/a;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/services/ScanResult;

    invoke-direct {v2, p1}, Lcom/qihoo/security/services/ScanResult;-><init>(Lcom/qihoo/security/engine/d/b;)V

    invoke-interface {v1, v2}, Lcom/qihoo/security/services/a;->a(Lcom/qihoo/security/services/ScanResult;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method a()V
    .locals 2

    const/4 v1, 0x0

    iput v1, p0, Lcom/qihoo/security/engine/b/b;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->e:Z

    iput-boolean v1, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->h:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->h:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Lcom/qihoo/security/engine/d/c;)V
    .locals 2

    invoke-virtual {p1}, Lcom/qihoo/security/engine/d/c;->c()I

    invoke-virtual {p1}, Lcom/qihoo/security/engine/d/c;->a()I

    move-result v0

    const/16 v1, 0x63

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->e:Z

    iget-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->l()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/engine/b/b;->d()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/b/d;->a(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/c;->k()V

    goto :goto_0
.end method

.method a(Lcom/qihoo/security/services/DeepScanItem;)V
    .locals 4

    iget v0, p1, Lcom/qihoo/security/services/DeepScanItem;->enumeratorId:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    new-instance v0, Lcom/qihoo/security/engine/d/e;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/qihoo/security/services/DeepScanItem;->content:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p0}, Lcom/qihoo/security/engine/d/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/engine/d/c$a;)V

    move-object v2, v0

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->h:Landroid/util/SparseArray;

    iget v1, p1, Lcom/qihoo/security/services/DeepScanItem;->enumeratorId:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {v2}, Lcom/qihoo/security/engine/d/c;->b()I

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :pswitch_1
    new-instance v0, Lcom/qihoo/security/engine/d/d;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->a:Landroid/content/Context;

    iget-object v2, p1, Lcom/qihoo/security/services/DeepScanItem;->content:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p0}, Lcom/qihoo/security/engine/d/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/engine/d/c$a;)V

    move-object v2, v0

    goto :goto_1

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v1, v0}, Lcom/qihoo/security/engine/d/c;->a(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method b()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->e:Z

    invoke-direct {p0}, Lcom/qihoo/security/engine/b/b;->d()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/b;->b:Lcom/qihoo/security/engine/b/c;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/c;->h:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/b/d;->b(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/qihoo/security/engine/d/a;

    invoke-direct {v1, p0}, Lcom/qihoo/security/engine/d/a;-><init>(Lcom/qihoo/security/engine/d/c$a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/d/c;

    iget-object v2, p0, Lcom/qihoo/security/engine/b/b;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method c()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/b/b;->g:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/b/b;->f:Z

    iget-object v0, p0, Lcom/qihoo/security/engine/b/b;->c:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/d/c;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/d/c;->f()I

    goto :goto_0
.end method
