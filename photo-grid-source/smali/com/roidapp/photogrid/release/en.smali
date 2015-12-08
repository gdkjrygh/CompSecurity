.class final Lcom/roidapp/photogrid/release/en;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;)V
    .locals 0

    .prologue
    .line 155
    iput-object p1, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 6

    .prologue
    .line 175
    if-eqz p3, :cond_0

    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    int-to-float v1, p2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/el;->b(Lcom/roidapp/photogrid/release/el;)I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;I)I

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->f(Lcom/roidapp/photogrid/release/el;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/el;->d(Lcom/roidapp/photogrid/release/el;)Ljava/text/DecimalFormat;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/el;->c(Lcom/roidapp/photogrid/release/el;)I

    move-result v3

    const v4, 0xea60

    div-int/2addr v3, v4

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/el;->d(Lcom/roidapp/photogrid/release/el;)Ljava/text/DecimalFormat;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/el;->c(Lcom/roidapp/photogrid/release/el;)I

    move-result v3

    div-int/lit16 v3, v3, 0x3e8

    rem-int/lit8 v3, v3, 0x3c

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/el;->e(Lcom/roidapp/photogrid/release/el;)Ljava/text/DecimalFormat;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/el;->c(Lcom/roidapp/photogrid/release/el;)I

    move-result v3

    rem-int/lit16 v3, v3, 0x3e8

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/el;->c(Lcom/roidapp/photogrid/release/el;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->g(I)V

    .line 184
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 170
    :cond_0
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 159
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 160
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/roidapp/photogrid/release/en;->a:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->a(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/ng;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->j(I)V

    .line 163
    :cond_0
    return-void
.end method
