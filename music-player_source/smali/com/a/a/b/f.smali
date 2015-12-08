.class public Lcom/a/a/b/f;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field private static volatile e:Lcom/a/a/b/f;


# instance fields
.field private b:Lcom/a/a/b/g;

.field private c:Lcom/a/a/b/i;

.field private final d:Lcom/a/a/b/f/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/a/a/b/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/a/a/b/f;->a:Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/a/a/b/f/c;

    invoke-direct {v0}, Lcom/a/a/b/f/c;-><init>()V

    iput-object v0, p0, Lcom/a/a/b/f;->d:Lcom/a/a/b/f/a;

    return-void
.end method

.method private static a(Lcom/a/a/b/d;)Landroid/os/Handler;
    .locals 3

    invoke-virtual {p0}, Lcom/a/a/b/d;->r()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {p0}, Lcom/a/a/b/d;->s()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v1, v2, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    goto :goto_0
.end method

.method public static a()Lcom/a/a/b/f;
    .locals 2

    sget-object v0, Lcom/a/a/b/f;->e:Lcom/a/a/b/f;

    if-nez v0, :cond_1

    const-class v1, Lcom/a/a/b/f;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/a/a/b/f;->e:Lcom/a/a/b/f;

    if-nez v0, :cond_0

    new-instance v0, Lcom/a/a/b/f;

    invoke-direct {v0}, Lcom/a/a/b/f;-><init>()V

    sput-object v0, Lcom/a/a/b/f;->e:Lcom/a/a/b/f;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    sget-object v0, Lcom/a/a/b/f;->e:Lcom/a/a/b/f;

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/a/a/b/g;)V
    .locals 2

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ImageLoader configuration can not be initialized with null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    if-nez v0, :cond_2

    iget-boolean v0, p1, Lcom/a/a/b/g;->u:Z

    if-eqz v0, :cond_1

    const-string v0, "Initialize ImageLoader with configuration"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    new-instance v0, Lcom/a/a/b/i;

    invoke-direct {v0, p1}, Lcom/a/a/b/i;-><init>(Lcom/a/a/b/g;)V

    iput-object v0, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    iput-object p1, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    const-string v0, "Try to initialize ImageLoader which had already been initialized before. To re-init ImageLoader with new configuration call ImageLoader.destroy() at first."

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/a/a/c/e;->c(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Landroid/widget/ImageView;Lcom/a/a/b/d;Lcom/a/a/b/f/a;)V
    .locals 9

    const/4 v7, 0x0

    new-instance v2, Lcom/a/a/b/e/b;

    invoke-direct {v2, p2}, Lcom/a/a/b/e/b;-><init>(Landroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ImageLoader must be init with configuration before using"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    if-nez p4, :cond_d

    iget-object v6, p0, Lcom/a/a/b/f;->d:Lcom/a/a/b/f/a;

    :goto_0
    if-nez p3, :cond_c

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-object v5, v0, Lcom/a/a/b/g;->t:Lcom/a/a/b/d;

    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v0, v2}, Lcom/a/a/b/i;->b(Lcom/a/a/b/e/a;)V

    invoke-interface {v2}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    invoke-interface {v6}, Lcom/a/a/b/f/a;->a()V

    invoke-virtual {v5}, Lcom/a/a/b/d;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->a:Landroid/content/res/Resources;

    invoke-virtual {v5, v0}, Lcom/a/a/b/d;->b(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/a/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    :goto_2
    invoke-interface {v2}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    invoke-interface {v6}, Lcom/a/a/b/f/a;->b()V

    :goto_3
    return-void

    :cond_1
    invoke-interface {v2, v7}, Lcom/a/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-object v0, v1, Lcom/a/a/b/g;->a:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v0, v1, Lcom/a/a/b/g;->b:I

    if-gtz v0, :cond_3

    iget v0, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    :cond_3
    iget v1, v1, Lcom/a/a/b/g;->c:I

    if-gtz v1, :cond_4

    iget v1, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    :cond_4
    new-instance v3, Lcom/a/a/b/a/f;

    invoke-direct {v3, v0, v1}, Lcom/a/a/b/a/f;-><init>(II)V

    invoke-static {v2, v3}, Lcom/a/a/c/a;->a(Lcom/a/a/b/e/a;Lcom/a/a/b/a/f;)Lcom/a/a/b/a/f;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/a/a/b/a/f;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/a/a/b/a/f;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v0, v2, v4}, Lcom/a/a/b/i;->a(Lcom/a/a/b/e/a;Ljava/lang/String;)V

    invoke-interface {v2}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    invoke-interface {v6}, Lcom/a/a/b/f/a;->a()V

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->p:Lcom/a/a/a/b/a;

    invoke-interface {v0, v4}, Lcom/a/a/a/b/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/graphics/Bitmap;

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-boolean v0, v0, Lcom/a/a/b/g;->u:Z

    if-eqz v0, :cond_5

    const-string v0, "Load image from memory cache [%s]"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v4, v1, v7

    invoke-static {v0, v1}, Lcom/a/a/c/e;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {v5}, Lcom/a/a/b/d;->e()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lcom/a/a/b/k;

    iget-object v1, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v1, p1}, Lcom/a/a/b/i;->a(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v7

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/a/a/b/k;-><init>(Ljava/lang/String;Lcom/a/a/b/e/a;Lcom/a/a/b/a/f;Ljava/lang/String;Lcom/a/a/b/d;Lcom/a/a/b/f/a;Ljava/util/concurrent/locks/ReentrantLock;)V

    new-instance v1, Lcom/a/a/b/q;

    iget-object v2, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-static {v5}, Lcom/a/a/b/f;->a(Lcom/a/a/b/d;)Landroid/os/Handler;

    move-result-object v3

    invoke-direct {v1, v2, v8, v0, v3}, Lcom/a/a/b/q;-><init>(Lcom/a/a/b/i;Landroid/graphics/Bitmap;Lcom/a/a/b/k;Landroid/os/Handler;)V

    invoke-virtual {v5}, Lcom/a/a/b/d;->s()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lcom/a/a/b/q;->run()V

    goto/16 :goto_3

    :cond_6
    iget-object v0, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v0, v1}, Lcom/a/a/b/i;->a(Lcom/a/a/b/q;)V

    goto/16 :goto_3

    :cond_7
    invoke-virtual {v5}, Lcom/a/a/b/d;->q()Lcom/a/a/b/c/a;

    move-result-object v0

    sget-object v1, Lcom/a/a/b/a/g;->c:Lcom/a/a/b/a/g;

    invoke-interface {v0, v8, v2}, Lcom/a/a/b/c/a;->a(Landroid/graphics/Bitmap;Lcom/a/a/b/e/a;)V

    invoke-interface {v2}, Lcom/a/a/b/e/a;->d()Landroid/view/View;

    invoke-interface {v6}, Lcom/a/a/b/f/a;->b()V

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v5}, Lcom/a/a/b/d;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/a/a/b/f;->b:Lcom/a/a/b/g;

    iget-object v0, v0, Lcom/a/a/b/g;->a:Landroid/content/res/Resources;

    invoke-virtual {v5, v0}, Lcom/a/a/b/d;->a(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/a/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    :cond_9
    :goto_4
    new-instance v0, Lcom/a/a/b/k;

    iget-object v1, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v1, p1}, Lcom/a/a/b/i;->a(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v7

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/a/a/b/k;-><init>(Ljava/lang/String;Lcom/a/a/b/e/a;Lcom/a/a/b/a/f;Ljava/lang/String;Lcom/a/a/b/d;Lcom/a/a/b/f/a;Ljava/util/concurrent/locks/ReentrantLock;)V

    new-instance v1, Lcom/a/a/b/l;

    iget-object v2, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-static {v5}, Lcom/a/a/b/f;->a(Lcom/a/a/b/d;)Landroid/os/Handler;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/a/a/b/l;-><init>(Lcom/a/a/b/i;Lcom/a/a/b/k;Landroid/os/Handler;)V

    invoke-virtual {v5}, Lcom/a/a/b/d;->s()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v1}, Lcom/a/a/b/l;->run()V

    goto/16 :goto_3

    :cond_a
    invoke-virtual {v5}, Lcom/a/a/b/d;->g()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v2, v7}, Lcom/a/a/b/e/a;->a(Landroid/graphics/drawable/Drawable;)Z

    goto :goto_4

    :cond_b
    iget-object v0, p0, Lcom/a/a/b/f;->c:Lcom/a/a/b/i;

    invoke-virtual {v0, v1}, Lcom/a/a/b/i;->a(Lcom/a/a/b/l;)V

    goto/16 :goto_3

    :cond_c
    move-object v5, p3

    goto/16 :goto_1

    :cond_d
    move-object v6, p4

    goto/16 :goto_0
.end method
