.class final Lcom/roidapp/photogrid/release/bs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/br;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/br;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 45
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/br;->b(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/br;->b(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v0

    .line 47
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v1

    int-to-float v1, v1

    .line 48
    iget-object v2, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/br;->c(Lcom/roidapp/photogrid/release/br;)I

    move-result v3

    div-int/lit8 v4, p2, 0x5

    add-int/2addr v3, v4

    int-to-float v3, v3

    .line 1927
    iput v3, v2, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 1929
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->a()V

    .line 1930
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->i()V

    .line 1931
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ra;->j()V

    .line 49
    iget-object v2, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v2

    new-instance v3, Landroid/graphics/PointF;

    aget v0, v0, v5

    invoke-direct {v3, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance v0, Landroid/graphics/PointF;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->e()[F

    move-result-object v1

    aget v1, v1, v5

    iget-object v4, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/br;->a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ra;->d()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {v0, v1, v4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v2, v3, v0}, Lcom/roidapp/photogrid/release/ra;->a(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bs;->a:Lcom/roidapp/photogrid/release/br;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/br;->b(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 53
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 58
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 63
    return-void
.end method
