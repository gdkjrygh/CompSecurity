.class public final Lcom/roidapp/photogrid/release/lc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/graphics/Path;

.field public b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Landroid/graphics/PointF;

.field protected f:Z

.field protected g:F

.field protected h:F

.field protected i:Landroid/graphics/PointF;

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:I

.field protected p:Landroid/graphics/Region;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->d:Ljava/util/ArrayList;

    .line 27
    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    return-void
.end method


# virtual methods
.method public final a()Lcom/roidapp/photogrid/release/lc;
    .locals 5

    .prologue
    .line 34
    new-instance v1, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 37
    new-instance v3, Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {v3, v4, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 38
    iget-object v0, v1, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    .line 45
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/lc;->e:Landroid/graphics/PointF;

    .line 46
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/lc;->f:Z

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/lc;->f:Z

    .line 47
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->g:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->g:F

    .line 48
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->h:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->h:F

    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/lc;->i:Landroid/graphics/PointF;

    .line 50
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->j:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 51
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->k:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 52
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->l:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 53
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->m:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 54
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->n:F

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->n:F

    .line 55
    iget v0, p0, Lcom/roidapp/photogrid/release/lc;->o:I

    iput v0, v1, Lcom/roidapp/photogrid/release/lc;->o:I

    .line 57
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    iput-object v0, v1, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    .line 58
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .prologue
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lc;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    .line 64
    new-instance v3, Landroid/graphics/PointF;

    iget v4, v0, Landroid/graphics/PointF;->x:F

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-direct {v3, v4, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 65
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 67
    :cond_0
    return-object v1
.end method

.method public final synthetic clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 11
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v0

    return-object v0
.end method
