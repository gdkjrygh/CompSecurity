.class public final Lcom/roidapp/photogrid/release/az;
.super Landroid/view/SurfaceView;
.source "SourceFile"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


# instance fields
.field public a:Z

.field private b:Lcom/roidapp/photogrid/release/ay;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation
.end field

.field private h:F

.field private i:I

.field private j:Landroid/graphics/Paint;

.field private k:Landroid/view/SurfaceHolder;

.field private l:Z

.field private m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private n:I


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .prologue
    const/4 v2, 0x1

    .line 47
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->f:Ljava/util/ArrayList;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    .line 37
    const/high16 v0, 0x41400000    # 12.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->h:F

    .line 38
    const/high16 v0, -0x10000

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->i:I

    .line 39
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->j:Landroid/graphics/Paint;

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    .line 44
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/az;->a:Z

    .line 48
    iput-object p1, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    .line 50
    invoke-static {}, Lcom/roidapp/photogrid/common/bl;->a()Lcom/roidapp/photogrid/common/bl;

    invoke-static {p0}, Lcom/roidapp/photogrid/common/bl;->b(Landroid/view/View;)V

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->j:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/az;->setZOrderOnTop(Z)V

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/az;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->k:Landroid/view/SurfaceHolder;

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->k:Landroid/view/SurfaceHolder;

    const/4 v1, -0x2

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->setFormat(I)V

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->k:Landroid/view/SurfaceHolder;

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 58
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090095

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->n:I

    .line 59
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/az;->a(F)V

    .line 60
    return-void
.end method

.method private j()V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 87
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->k:Landroid/view/SurfaceHolder;

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->lockCanvas()Landroid/graphics/Canvas;

    move-result-object v2

    .line 88
    if-eqz v2, :cond_2

    .line 89
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 1100
    monitor-enter p0

    move v1, v0

    .line 1102
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 1103
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ay;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/az;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 1102
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1105
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    if-eqz v0, :cond_1

    .line 1106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->j:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 1109
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->k:Landroid/view/SurfaceHolder;

    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 94
    :cond_2
    return-void

    .line 1109
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 189
    iget v0, p0, Lcom/roidapp/photogrid/release/az;->n:I

    int-to-float v0, v0

    mul-float/2addr v0, p1

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->h:F

    .line 190
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 196
    iput p1, p0, Lcom/roidapp/photogrid/release/az;->i:I

    .line 197
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 77
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    iput-boolean p1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 81
    :cond_0
    if-eqz p1, :cond_1

    .line 82
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->f:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 84
    :cond_1
    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ay;",
            ">;"
        }
    .end annotation

    .prologue
    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 73
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    return v0
.end method

.method public final declared-synchronized e()V
    .locals 3

    .prologue
    .line 116
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 120
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Z)V

    .line 131
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_1
    monitor-exit p0

    return-void

    .line 123
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ay;

    .line 125
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 126
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 127
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 116
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized f()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 138
    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 139
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Z)V

    .line 142
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 143
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    move v0, v1

    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1196
    const/high16 v0, -0x10000

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->i:I

    .line 159
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/az;->a(F)V

    .line 160
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V

    .line 161
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 162
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2196
    const/high16 v0, -0x10000

    iput v0, p0, Lcom/roidapp/photogrid/release/az;->i:I

    .line 172
    const/high16 v0, 0x40c00000    # 6.0f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/az;->a(F)V

    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k()V

    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Z)V

    .line 182
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V

    .line 183
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 261
    :goto_0
    return v0

    .line 206
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    if-nez v0, :cond_2

    move v0, v1

    .line 207
    goto :goto_0

    .line 209
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 2832
    const-string v3, "FragmentDoodle"

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cy;

    .line 2833
    if-eqz v0, :cond_3

    .line 2834
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/cy;->a()V

    .line 210
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 211
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    .line 212
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    .line 261
    :cond_4
    invoke-super {p0, p1}, Landroid/view/SurfaceView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    goto :goto_0

    .line 215
    :pswitch_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/az;->a:Z

    .line 217
    new-instance v1, Lcom/roidapp/photogrid/release/ay;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/ay;-><init>()V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    .line 218
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    iget v4, p0, Lcom/roidapp/photogrid/release/az;->h:F

    iput v4, v1, Lcom/roidapp/photogrid/release/ay;->b:F

    .line 219
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    iget v4, p0, Lcom/roidapp/photogrid/release/az;->i:I

    iput v4, v1, Lcom/roidapp/photogrid/release/ay;->a:I

    .line 220
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_5

    .line 221
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 223
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_6

    .line 224
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 225
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 227
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    new-instance v4, Landroid/graphics/PointF;

    invoke-direct {v4, v0, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/PointF;)V

    move v0, v2

    .line 228
    goto :goto_0

    .line 232
    :pswitch_1
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    if-eqz v1, :cond_7

    .line 233
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    new-instance v4, Landroid/graphics/PointF;

    invoke-direct {v4, v0, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/PointF;)V

    .line 234
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V

    :cond_7
    move v0, v2

    .line 236
    goto :goto_0

    .line 241
    :pswitch_2
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/az;->a:Z

    .line 242
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    if-eqz v1, :cond_4

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/az;->l:Z

    if-eqz v1, :cond_4

    .line 243
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ay;->a()I

    move-result v1

    if-lez v1, :cond_4

    .line 244
    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    new-instance v4, Landroid/graphics/PointF;

    invoke-direct {v4, v0, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ay;->a(Landroid/graphics/PointF;)V

    .line 245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_8

    .line 246
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k()V

    .line 248
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_9

    .line 249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->m:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Z)V

    .line 251
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/az;->c:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/az;->b:Lcom/roidapp/photogrid/release/ay;

    .line 254
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V

    move v0, v2

    .line 255
    goto/16 :goto_0

    .line 212
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    .prologue
    .line 266
    return-void
.end method

.method public final surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 0

    .prologue
    .line 270
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/az;->j()V

    .line 271
    return-void
.end method

.method public final surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    .prologue
    .line 275
    return-void
.end method
