.class public Lcom/roidapp/imagelib/retouch/v;
.super Landroid/widget/SeekBar;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;
.implements Lcom/roidapp/imagelib/retouch/w;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field private final c:Landroid/widget/TextView;

.field private final d:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

.field private g:Lcom/roidapp/imagelib/retouch/t;

.field private h:I

.field private final i:Ljava/lang/String;

.field private final j:Landroid/view/View;

.field private final k:Landroid/view/View;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljp/co/cyberagent/android/gpuimage/GPUImageView;Landroid/widget/TextView;Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 35
    invoke-direct {p0, p2}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 22
    const-class v0, Lcom/roidapp/imagelib/retouch/v;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->a:Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    .line 27
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->e:Ljava/util/Stack;

    .line 36
    iput-object p7, p0, Lcom/roidapp/imagelib/retouch/v;->k:Landroid/view/View;

    .line 37
    iput-object p6, p0, Lcom/roidapp/imagelib/retouch/v;->j:Landroid/view/View;

    .line 38
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/v;->i:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/roidapp/imagelib/retouch/v;->b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 40
    iput-object p4, p0, Lcom/roidapp/imagelib/retouch/v;->c:Landroid/widget/TextView;

    .line 41
    iput-object p5, p0, Lcom/roidapp/imagelib/retouch/v;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 43
    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->setMax(I)V

    .line 44
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 45
    sget v1, Lcom/roidapp/imagelib/f;->l:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 46
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/retouch/v;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    sget v1, Lcom/roidapp/imagelib/f;->n:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 48
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->setThumb(Landroid/graphics/drawable/Drawable;)V

    .line 49
    invoke-virtual {p0, p0}, Lcom/roidapp/imagelib/retouch/v;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 51
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/v;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->i:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 52
    invoke-virtual {p0, v0, v2, v0, v2}, Lcom/roidapp/imagelib/retouch/v;->setPadding(IIII)V

    .line 72
    return-void
.end method

.method private c(I)V
    .locals 3

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    int-to-float v1, p1

    const v2, 0x3b83126f    # 0.004f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setEps(F)V

    .line 77
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->b:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 78
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 86
    iput p1, p0, Lcom/roidapp/imagelib/retouch/v;->h:I

    .line 87
    iget v0, p0, Lcom/roidapp/imagelib/retouch/v;->h:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->setProgress(I)V

    .line 88
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/retouch/t;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/v;->g:Lcom/roidapp/imagelib/retouch/t;

    .line 83
    return-void
.end method

.method public final b(I)V
    .locals 3

    .prologue
    .line 91
    invoke-virtual {p0, p1}, Lcom/roidapp/imagelib/retouch/v;->a(I)V

    .line 92
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->f:Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;

    int-to-float v1, p1

    const v2, 0x3b83126f    # 0.004f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageGuideFilter;->setEps(F)V

    .line 94
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->e:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 127
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->e:Ljava/util/Stack;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    .line 129
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 130
    :goto_0
    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->c(I)V

    .line 131
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->setProgress(I)V

    .line 132
    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public final e()V
    .locals 3

    .prologue
    .line 136
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->e:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 137
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->c(I)V

    .line 139
    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->setProgress(I)V

    .line 140
    return-void
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 162
    const/4 v0, 0x0

    return v0
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->g:Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->g:Lcom/roidapp/imagelib/retouch/t;

    invoke-interface {v0, p2}, Lcom/roidapp/imagelib/retouch/t;->a(I)V

    .line 100
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/imagelib/retouch/l;->a(I)V

    .line 101
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->c:Landroid/widget/TextView;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    iput p2, p0, Lcom/roidapp/imagelib/retouch/v;->h:I

    .line 104
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/v;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->c:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 110
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 114
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->j:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->j:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->k:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->k:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 116
    :cond_1
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/l;->a(Z)V

    .line 117
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->d:Ljava/util/Stack;

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/v;->e:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->clear()V

    .line 120
    iget v0, p0, Lcom/roidapp/imagelib/retouch/v;->h:I

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/retouch/v;->c(I)V

    .line 123
    return-void
.end method
