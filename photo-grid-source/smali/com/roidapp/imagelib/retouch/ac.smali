.class public final Lcom/roidapp/imagelib/retouch/ac;
.super Landroid/widget/SeekBar;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/roidapp/imagelib/retouch/w;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field private c:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private final d:Landroid/widget/TextView;

.field private e:I

.field private f:Lcom/roidapp/imagelib/retouch/t;

.field private final g:Ljava/lang/String;

.field private final h:Landroid/view/View;

.field private final i:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/widget/TextView;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 30
    invoke-direct {p0, p2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 19
    const-class v0, Lcom/roidapp/imagelib/retouch/v;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->a:Ljava/lang/String;

    .line 31
    iput-object p7, p0, Lcom/roidapp/imagelib/retouch/ac;->i:Landroid/view/View;

    .line 32
    iput-object p6, p0, Lcom/roidapp/imagelib/retouch/ac;->h:Landroid/view/View;

    .line 33
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/ac;->g:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/roidapp/imagelib/retouch/ac;->b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 35
    iput-object p4, p0, Lcom/roidapp/imagelib/retouch/ac;->d:Landroid/widget/TextView;

    .line 36
    iput-object p5, p0, Lcom/roidapp/imagelib/retouch/ac;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 38
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/ac;->setMax(I)V

    .line 39
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 40
    sget v1, Lcom/roidapp/imagelib/f;->l:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 41
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/retouch/ac;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    sget v1, Lcom/roidapp/imagelib/f;->n:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/ac;->setThumb(Landroid/graphics/drawable/Drawable;)V

    .line 44
    invoke-virtual {p0, p0}, Lcom/roidapp/imagelib/retouch/ac;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 46
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/ac;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->i:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 47
    invoke-virtual {p0, v0, v2, v0, v2}, Lcom/roidapp/imagelib/retouch/ac;->setPadding(IIII)V

    .line 66
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 80
    iput p1, p0, Lcom/roidapp/imagelib/retouch/ac;->e:I

    .line 81
    iget v0, p0, Lcom/roidapp/imagelib/retouch/ac;->e:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/ac;->setProgress(I)V

    .line 82
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/retouch/t;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/ac;->f:Lcom/roidapp/imagelib/retouch/t;

    .line 77
    return-void
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 85
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/retouch/ac;->a(I)V

    .line 86
    int-to-float v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v1, v0, v1

    .line 87
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setAlpha(F)V

    .line 88
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 105
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 111
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 0

    .prologue
    .line 94
    return-void
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 100
    return-void
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 123
    const/4 v0, 0x0

    return v0
.end method

.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .prologue
    .line 129
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->f:Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->f:Lcom/roidapp/imagelib/retouch/t;

    invoke-interface {v0, p2}, Lcom/roidapp/imagelib/retouch/t;->b(I)V

    .line 130
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/imagelib/retouch/l;->b(I)V

    .line 131
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->d:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iput p2, p0, Lcom/roidapp/imagelib/retouch/ac;->e:I

    .line 133
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 137
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/ac;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 138
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->d:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 139
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 143
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->h:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->h:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 144
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->i:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->i:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->d:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    iget v0, p0, Lcom/roidapp/imagelib/retouch/ac;->e:I

    .line 1069
    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v1, v0, v1

    .line 1071
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->c:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setAlpha(F)V

    .line 1072
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/ac;->b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 149
    return-void
.end method
