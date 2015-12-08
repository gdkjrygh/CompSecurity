.class public final Lcom/roidapp/imagelib/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/util/concurrent/locks/Lock;


# instance fields
.field private final a:Lcom/roidapp/baselib/b/i;

.field private c:Lcom/roidapp/imagelib/c/f;

.field private d:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/c/b;->b:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method public constructor <init>(Lcom/roidapp/baselib/b/i;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/c/b;->d:Ljava/lang/Boolean;

    .line 22
    iput-object p1, p0, Lcom/roidapp/imagelib/c/b;->a:Lcom/roidapp/baselib/b/i;

    .line 23
    return-void
.end method

.method static synthetic a()Ljava/util/concurrent/locks/Lock;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/roidapp/imagelib/c/b;->b:Ljava/util/concurrent/locks/Lock;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;Lcom/roidapp/imagelib/c/h;Landroid/graphics/drawable/Drawable;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 26
    iget-object v0, p0, Lcom/roidapp/imagelib/c/b;->c:Lcom/roidapp/imagelib/c/f;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not set bitmap loader"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/c/b;->a:Lcom/roidapp/baselib/b/i;

    iget-object v3, p2, Lcom/roidapp/imagelib/c/h;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/b/i;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 40
    :cond_1
    :goto_0
    return-void

    .line 33
    :cond_2
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1043
    invoke-virtual {p1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/c/g;

    .line 1044
    if-nez v0, :cond_3

    move v0, v1

    .line 35
    :goto_1
    if-eqz v0, :cond_1

    .line 36
    new-instance v0, Lcom/roidapp/imagelib/c/g;

    iget-object v3, p0, Lcom/roidapp/imagelib/c/b;->a:Lcom/roidapp/baselib/b/i;

    invoke-direct {v0, p1, p2, v3}, Lcom/roidapp/imagelib/c/g;-><init>(Landroid/widget/ImageView;Lcom/roidapp/imagelib/c/h;Lcom/roidapp/baselib/b/i;)V

    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 38
    sget-object v3, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/roidapp/imagelib/c/b;->d:Ljava/lang/Boolean;

    aput-object v5, v4, v2

    iget-object v2, p0, Lcom/roidapp/imagelib/c/b;->c:Lcom/roidapp/imagelib/c/f;

    aput-object v2, v4, v1

    invoke-virtual {v0, v3, v4}, Lcom/roidapp/imagelib/c/g;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0

    .line 1045
    :cond_3
    invoke-static {v0}, Lcom/roidapp/imagelib/c/g;->a(Lcom/roidapp/imagelib/c/g;)Lcom/roidapp/imagelib/c/h;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/imagelib/c/h;->a:Ljava/lang/String;

    iget-object v4, p2, Lcom/roidapp/imagelib/c/h;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lcom/roidapp/imagelib/c/g;->getStatus$2cfd0ac4()I

    move-result v3

    sget v4, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v3, v4, :cond_4

    move v0, v2

    .line 1046
    goto :goto_1

    .line 1048
    :cond_4
    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/c/g;->cancel(Z)Z

    move v0, v1

    .line 1049
    goto :goto_1
.end method

.method public final a(Lcom/roidapp/imagelib/c/c;)V
    .locals 3

    .prologue
    .line 135
    iget-object v0, p0, Lcom/roidapp/imagelib/c/b;->d:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    :goto_0
    return-void

    .line 136
    :cond_0
    sget-object v0, Lcom/roidapp/imagelib/c/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 138
    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/c/b;->d:Ljava/lang/Boolean;

    .line 139
    iget-object v0, p0, Lcom/roidapp/imagelib/c/b;->a:Lcom/roidapp/baselib/b/i;

    if-eqz v0, :cond_1

    .line 140
    iget-object v0, p0, Lcom/roidapp/imagelib/c/b;->a:Lcom/roidapp/baselib/b/i;

    invoke-virtual {v0}, Lcom/roidapp/baselib/b/i;->a()V

    .line 143
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/c/d;

    invoke-direct {v0, p1}, Lcom/roidapp/imagelib/c/d;-><init>(Lcom/roidapp/imagelib/c/c;)V

    .line 144
    sget-object v1, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/c/d;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    sget-object v0, Lcom/roidapp/imagelib/c/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/roidapp/imagelib/c/b;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final a(Lcom/roidapp/imagelib/c/f;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lcom/roidapp/imagelib/c/b;->c:Lcom/roidapp/imagelib/c/f;

    .line 131
    return-void
.end method
