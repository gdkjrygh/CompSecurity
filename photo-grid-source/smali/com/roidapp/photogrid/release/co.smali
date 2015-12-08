.class final Lcom/roidapp/photogrid/release/co;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Lcom/roidapp/photogrid/release/ck;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ck;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/co;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .prologue
    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->a:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->k(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    if-eq p2, v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->k(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 258
    :cond_0
    :goto_0
    return-void

    .line 237
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 239
    int-to-float v0, v1

    .line 240
    if-le v1, v2, :cond_2

    .line 241
    int-to-float v0, v2

    .line 243
    :cond_2
    const/4 v1, 0x0

    .line 244
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_4

    .line 245
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    int-to-float v2, p2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    move v0, v1

    .line 250
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, p2}, Lcom/roidapp/photogrid/release/ck;->c(Lcom/roidapp/photogrid/release/ck;I)I

    .line 251
    iget-object v1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->e(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->f(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->g(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 252
    iget-object v1, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ck;->c(Lcom/roidapp/photogrid/release/ck;F)F

    .line 254
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    goto :goto_0

    .line 247
    :cond_4
    int-to-float v1, p2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->Q()F

    move-result v2

    mul-float/2addr v0, v2

    const/high16 v2, 0x43480000    # 200.0f

    div-float/2addr v0, v2

    mul-float/2addr v0, v1

    .line 248
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    goto :goto_1
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 218
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->q(Z)V

    .line 219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    const-string v1, "CORNER_RADIOUS"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ck;->j(Lcom/roidapp/photogrid/release/ck;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/String;F)V

    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/co;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 221
    return-void
.end method
