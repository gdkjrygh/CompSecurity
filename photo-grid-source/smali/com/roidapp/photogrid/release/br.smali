.class public final Lcom/roidapp/photogrid/release/br;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lcom/roidapp/photogrid/release/ra;

.field private c:Lcom/roidapp/photogrid/release/PhotoGridActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/ra;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/br;->b:Lcom/roidapp/photogrid/release/ra;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/br;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/br;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/br;)I
    .locals 1

    .prologue
    .line 14
    iget v0, p0, Lcom/roidapp/photogrid/release/br;->a:I

    return v0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 24
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 25
    check-cast p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object p1, p0, Lcom/roidapp/photogrid/release/br;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 26
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 30
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/br;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f0a0000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/br;->a:I

    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 36
    const v0, 0x7f0300a5

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/br;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/roidapp/photogrid/release/br;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/br;->b:Lcom/roidapp/photogrid/release/ra;

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/br;->b:Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    .line 40
    const v0, 0x7f0d0281

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    .line 41
    iget-object v2, p0, Lcom/roidapp/photogrid/release/br;->b:Lcom/roidapp/photogrid/release/ra;

    .line 1923
    iget v2, v2, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 41
    iget v3, p0, Lcom/roidapp/photogrid/release/br;->a:I

    int-to-float v3, v3

    sub-float/2addr v2, v3

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 42
    new-instance v2, Lcom/roidapp/photogrid/release/bs;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/bs;-><init>(Lcom/roidapp/photogrid/release/br;)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 67
    :cond_0
    return-object v1
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    .line 72
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 73
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/br;->b:Lcom/roidapp/photogrid/release/ra;

    .line 74
    return-void
.end method
