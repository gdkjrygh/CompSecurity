.class final Lcom/roidapp/photogrid/release/ex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ev;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ev;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 5

    .prologue
    .line 191
    if-eqz p3, :cond_0

    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ev;->b(Lcom/roidapp/photogrid/release/ev;)I

    move-result v1

    int-to-float v2, p2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/ev;->c(Lcom/roidapp/photogrid/release/ev;)F

    move-result v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ev;->a(Lcom/roidapp/photogrid/release/ev;I)I

    .line 193
    new-instance v0, Ljava/math/BigDecimal;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ev;->d(Lcom/roidapp/photogrid/release/ev;)I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ev;->e(Lcom/roidapp/photogrid/release/ev;)I

    move-result v2

    mul-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    float-to-double v2, v1

    invoke-direct {v0, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 194
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ev;->f(Lcom/roidapp/photogrid/release/ev;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x1

    const/4 v4, 0x4

    invoke-virtual {v0, v3, v4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ev;->a(Lcom/roidapp/photogrid/release/ev;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ev;->d(Lcom/roidapp/photogrid/release/ev;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->h(I)V

    .line 198
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ex;->a:Lcom/roidapp/photogrid/release/ev;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ev;->a(Lcom/roidapp/photogrid/release/ev;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 186
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .prologue
    .line 180
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 181
    return-void
.end method
