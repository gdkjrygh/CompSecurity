.class public final Lcom/roidapp/imagelib/retouch/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lcom/roidapp/imagelib/retouch/l;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized f()Lcom/roidapp/imagelib/retouch/l;
    .locals 2

    .prologue
    .line 68
    const-class v1, Lcom/roidapp/imagelib/retouch/l;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/roidapp/imagelib/retouch/l;->e:Lcom/roidapp/imagelib/retouch/l;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/roidapp/imagelib/retouch/l;

    invoke-direct {v0}, Lcom/roidapp/imagelib/retouch/l;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/retouch/l;->e:Lcom/roidapp/imagelib/retouch/l;

    .line 71
    :cond_0
    sget-object v0, Lcom/roidapp/imagelib/retouch/l;->e:Lcom/roidapp/imagelib/retouch/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 68
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public static declared-synchronized g()V
    .locals 2

    .prologue
    .line 75
    const-class v0, Lcom/roidapp/imagelib/retouch/l;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-object v1, Lcom/roidapp/imagelib/retouch/l;->e:Lcom/roidapp/imagelib/retouch/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    monitor-exit v0

    return-void

    .line 75
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 40
    iput p1, p0, Lcom/roidapp/imagelib/retouch/l;->a:I

    .line 41
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 24
    iput-boolean p1, p0, Lcom/roidapp/imagelib/retouch/l;->d:Z

    .line 25
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/l;->d:Z

    return v0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lcom/roidapp/imagelib/retouch/l;->b:I

    .line 53
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 28
    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->a:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->b:I

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->c:I

    if-gtz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/l;->d:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 64
    iput p1, p0, Lcom/roidapp/imagelib/retouch/l;->c:I

    .line 65
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 32
    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->a:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->b:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/imagelib/retouch/l;->c:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
