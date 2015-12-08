.class public final Lcom/roidapp/photogrid/release/cg;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:Landroid/widget/SeekBar;

.field private c:I

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/roidapp/photogrid/release/ng;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 18
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 22
    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->b:Landroid/widget/SeekBar;

    .line 25
    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/cg;->f:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cg;I)I
    .locals 0

    .prologue
    .line 18
    iput p1, p0, Lcom/roidapp/photogrid/release/cg;->g:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/ng;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cg;Z)Z
    .locals 0

    .prologue
    .line 18
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/cg;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cg;)I
    .locals 1

    .prologue
    .line 18
    iget v0, p0, Lcom/roidapp/photogrid/release/cg;->g:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/cg;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/cg;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/cg;)Z
    .locals 1

    .prologue
    .line 18
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/cg;->f:Z

    return v0
.end method


# virtual methods
.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 31
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    .line 36
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 37
    return-void

    .line 35
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .prologue
    .line 54
    const v0, 0x7f0300aa

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 56
    const v0, 0x7f0d028c

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 57
    if-eqz v0, :cond_0

    .line 58
    new-instance v2, Lcom/roidapp/photogrid/release/ch;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ch;-><init>(Lcom/roidapp/photogrid/release/cg;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    if-nez v0, :cond_1

    .line 67
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->bd()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/cg;->c:I

    .line 71
    :goto_0
    const v0, 0x7f0d028b

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->d:Landroid/widget/ImageView;

    .line 72
    const v0, 0x7f0d0052

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cg;->b:Landroid/widget/SeekBar;

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->b:Landroid/widget/SeekBar;

    const/16 v2, 0x64

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setMax(I)V

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->b:Landroid/widget/SeekBar;

    iget v2, p0, Lcom/roidapp/photogrid/release/cg;->c:I

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 75
    iget v0, p0, Lcom/roidapp/photogrid/release/cg;->c:I

    iput v0, p0, Lcom/roidapp/photogrid/release/cg;->g:I

    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->b:Landroid/widget/SeekBar;

    new-instance v2, Lcom/roidapp/photogrid/release/ci;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ci;-><init>(Lcom/roidapp/photogrid/release/cg;)V

    invoke-virtual {v0, v2}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 102
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->e:Lcom/roidapp/photogrid/release/ng;

    if-nez v0, :cond_2

    .line 103
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-nez v0, :cond_2

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->d:Landroid/widget/ImageView;

    const v2, 0x7f020364

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 112
    :goto_1
    const v0, 0x7f0d028a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 113
    new-instance v2, Lcom/roidapp/photogrid/release/cj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/cj;-><init>(Lcom/roidapp/photogrid/release/cg;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    return-object v1

    .line 69
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ag()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    mul-int/lit8 v0, v0, 0x5

    iput v0, p0, Lcom/roidapp/photogrid/release/cg;->c:I

    goto :goto_0

    .line 109
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cg;->d:Landroid/widget/ImageView;

    const v2, 0x7f020365

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1
.end method
