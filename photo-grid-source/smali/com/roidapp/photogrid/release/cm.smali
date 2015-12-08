.class final Lcom/roidapp/photogrid/release/cm;
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
    .line 116
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/cm;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    .prologue
    const/high16 v2, 0x42480000    # 50.0f

    const/high16 v3, 0x3fc00000    # 1.5f

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->a:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->c(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    if-eq p2, v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->c(Lcom/roidapp/photogrid/release/ck;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 141
    :cond_1
    const/16 v0, 0x32

    if-le p2, v0, :cond_3

    .line 142
    add-int/lit8 v0, p2, -0x32

    int-to-float v0, v0

    div-float/2addr v0, v2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->d(Lcom/roidapp/photogrid/release/ck;)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v1, v3

    mul-float/2addr v0, v1

    add-float/2addr v0, v3

    .line 146
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 147
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->T()V

    .line 148
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, p2}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;I)I

    .line 149
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->e(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->f(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ck;->g(Lcom/roidapp/photogrid/release/ck;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 150
    iget-object v1, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;F)F

    .line 152
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    goto :goto_0

    .line 144
    :cond_3
    int-to-float v0, p2

    div-float/2addr v0, v2

    mul-float/2addr v0, v3

    goto :goto_1
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->a:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 129
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 120
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->q(Z)V

    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    const-string v1, "OUTER_SPACE"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;)F

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ck;->a(Lcom/roidapp/photogrid/release/ck;Ljava/lang/String;F)V

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cm;->b:Lcom/roidapp/photogrid/release/ck;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ck;->b(Lcom/roidapp/photogrid/release/ck;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->c(I)V

    .line 123
    return-void
.end method
