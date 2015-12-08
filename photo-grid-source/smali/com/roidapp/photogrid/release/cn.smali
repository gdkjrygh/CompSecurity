.class final Lcom/roidapp/photogrid/release/cn;
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
    .line 163
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cn;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 5

    .prologue
    const/high16 v3, 0x42480000    # 50.0f

    const/4 v0, 0x0

    const/high16 v4, 0x3fc00000    # 1.5f

    .line 181
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->a:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget-boolean v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_1

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->i(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    if-eq p2, v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->i(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 188
    :cond_1
    const/16 v1, 0x32

    if-le p2, v1, :cond_3

    .line 189
    add-int/lit8 v1, p2, -0x32

    int-to-float v1, v1

    div-float/2addr v1, v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ck;->d(Lcom/roidapp/photogrid/release/ck;)F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    sub-float/2addr v2, v4

    mul-float/2addr v1, v2

    add-float/2addr v1, v4

    .line 195
    :goto_1
    cmpg-float v2, v1, v0

    if-gtz v2, :cond_4

    .line 198
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 199
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, p2}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;I)I

    .line 200
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->e(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->f(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->g(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 201
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;F)F

    .line 203
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    goto :goto_0

    .line 191
    :cond_3
    int-to-float v1, p2

    div-float/2addr v1, v3

    mul-float/2addr v1, v4

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 177
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 167
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->q(Z)V

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    const-string v1, "INNER_SPACE"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ck;->h(Lcom/roidapp/photogrid/release/ck;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/String;F)V

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cn;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 171
    return-void
.end method
