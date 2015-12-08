.class public final Lcom/roidapp/imagelib/crop/j;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;


# instance fields
.field private A:Lcom/roidapp/imagelib/filter/bi;

.field private final B:I

.field private C:Z

.field private D:Z

.field private volatile E:Z

.field private F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field private G:I

.field private H:Landroid/view/ViewGroup;

.field private I:Z

.field private J:Landroid/widget/TextView;

.field private K:Z

.field private L:Z

.field private M:Landroid/widget/HorizontalScrollView;

.field private N:I

.field private O:Landroid/os/Handler;

.field private P:I

.field protected a:Ljava/lang/String;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:Landroid/view/View;

.field protected f:Landroid/net/Uri;

.field protected g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field h:Lcom/roidapp/imagelib/b/b;

.field i:[Ljava/lang/Integer;

.field private final j:I

.field private final k:I

.field private final l:I

.field private final m:I

.field private final n:I

.field private o:Landroid/widget/HorizontalScrollView;

.field private p:Landroid/widget/TextView;

.field private q:Lcom/roidapp/imagelib/crop/CropImageView;

.field private r:Lcom/roidapp/imagelib/crop/m;

.field private s:Lcom/roidapp/imagelib/crop/a;

.field private t:Landroid/graphics/Bitmap;

.field private u:Landroid/graphics/Bitmap;

.field private v:Landroid/graphics/Bitmap;

.field private w:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/roidapp/imagelib/crop/m;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private x:Lcom/roidapp/imagelib/filter/av;

.field private y:Z

.field private z:[I


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 51
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 69
    iput v1, p0, Lcom/roidapp/imagelib/crop/j;->j:I

    .line 70
    iput v3, p0, Lcom/roidapp/imagelib/crop/j;->k:I

    .line 71
    iput v4, p0, Lcom/roidapp/imagelib/crop/j;->l:I

    .line 72
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/imagelib/crop/j;->m:I

    .line 73
    const/4 v0, 0x4

    iput v0, p0, Lcom/roidapp/imagelib/crop/j;->n:I

    .line 91
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    .line 105
    iput-boolean v3, p0, Lcom/roidapp/imagelib/crop/j;->y:Z

    .line 107
    new-array v0, v4, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    .line 109
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->f:Landroid/net/Uri;

    .line 113
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    .line 117
    iput v1, p0, Lcom/roidapp/imagelib/crop/j;->B:I

    .line 121
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->C:Z

    .line 122
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->D:Z

    .line 123
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->E:Z

    .line 124
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 127
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->I:Z

    .line 129
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->K:Z

    .line 130
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    .line 136
    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    .line 137
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/imagelib/crop/j;->N:I

    .line 139
    new-instance v0, Lcom/roidapp/imagelib/crop/k;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/crop/k;-><init>(Lcom/roidapp/imagelib/crop/j;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->O:Landroid/os/Handler;

    .line 903
    return-void

    .line 107
    :array_0
    .array-data 4
        -0x1
        -0x1
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/j;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/av;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    return-object v0
.end method

.method private a(II)V
    .locals 2

    .prologue
    .line 720
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/doCrop"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 721
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    iget-object v0, v0, Lcom/roidapp/imagelib/crop/a;->d:Lcom/roidapp/imagelib/crop/h;

    if-nez v0, :cond_0

    .line 722
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/imagelib/crop/a;->b(II)V

    .line 723
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/crop/a;->b(Landroid/graphics/Bitmap;)V

    .line 727
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    .line 728
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    const/4 v1, 0x1

    aput p2, v0, v1

    .line 729
    return-void

    .line 725
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/imagelib/crop/a;->a(II)V

    goto :goto_0
.end method

.method private a(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 525
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    .line 545
    :cond_0
    :goto_0
    return-void

    .line 527
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    if-nez v0, :cond_2

    .line 528
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getView()Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/g;->aj:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    .line 529
    :cond_2
    iget v0, p0, Lcom/roidapp/imagelib/crop/j;->N:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 530
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/crop/j;->N:I

    .line 531
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    if-eqz v0, :cond_0

    .line 532
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 533
    iget v1, p0, Lcom/roidapp/imagelib/crop/j;->N:I

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v3}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    .line 534
    if-ge v1, v0, :cond_4

    .line 535
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0, v4}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto :goto_0

    .line 538
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v2}, Landroid/widget/HorizontalScrollView;->getScrollX()I

    move-result v2

    sub-int/2addr v1, v2

    .line 540
    if-ge v1, v0, :cond_0

    .line 541
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->M:Landroid/widget/HorizontalScrollView;

    sub-int v0, v1, v0

    invoke-virtual {v2, v0, v4}, Landroid/widget/HorizontalScrollView;->smoothScrollBy(II)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/j;II)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/crop/j;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/roidapp/imagelib/crop/m;)V
    .locals 3

    .prologue
    .line 408
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/setCropRatioBackground"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 409
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    .line 410
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    .line 413
    if-eqz v0, :cond_0

    .line 414
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 415
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 419
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 420
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    .line 421
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 423
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/d;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 424
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 426
    :cond_1
    return-void
.end method

.method private a(Lcom/roidapp/imagelib/crop/m;Z)V
    .locals 2

    .prologue
    .line 628
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 629
    if-eqz p2, :cond_0

    .line 630
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 634
    :goto_0
    return-void

    .line 632
    :cond_0
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 732
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->O:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/crop/l;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/crop/l;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 742
    return-void
.end method

.method static synthetic b(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v4, 0x5

    const/4 v3, 0x3

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 669
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 670
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 671
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 672
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 673
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 675
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 676
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 677
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 678
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 679
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 681
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    if-ne v0, v1, :cond_1

    .line 682
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 683
    const/4 v0, 0x2

    invoke-direct {p0, v0, v3}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    .line 697
    :cond_0
    :goto_0
    return-void

    .line 684
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    if-ne v0, v1, :cond_2

    .line 685
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 686
    const/4 v0, 0x4

    invoke-direct {p0, v3, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_0

    .line 687
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    if-ne v0, v1, :cond_3

    .line 688
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 689
    invoke-direct {p0, v3, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_0

    .line 690
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    if-ne v0, v1, :cond_4

    .line 691
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 692
    const/4 v0, 0x7

    invoke-direct {p0, v4, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_0

    .line 693
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    if-ne v0, v1, :cond_0

    .line 694
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 695
    const/16 v0, 0x9

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/CropImageView;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/crop/j;)Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/crop/j;)[I
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/crop/j;)Z
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->E:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/imagelib/crop/j;)I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/crop/j;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->O:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/crop/j;)Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->C:Z

    return v0
.end method

.method static synthetic j(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/filter/bi;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/imagelib/crop/j;)Lcom/roidapp/imagelib/crop/a;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->u:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/imagelib/crop/j;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->v:Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 394
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "ImageEditCropFragment/backToFilter"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 395
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 399
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget v5, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    .line 405
    :cond_0
    :goto_0
    return-void

    .line 401
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iget v5, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    invoke-interface/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/av;->a(ILjava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 334
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/saveBtn"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 335
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    if-eqz v0, :cond_0

    .line 336
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    .line 4148
    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Landroid/graphics/Bitmap;)V

    .line 339
    :cond_0
    iput-boolean v4, p0, Lcom/roidapp/imagelib/crop/j;->E:Z

    .line 340
    iput p1, p0, Lcom/roidapp/imagelib/crop/j;->G:I

    .line 341
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    if-eqz v0, :cond_2

    .line 342
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/q;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-direct {v1, p0, v3, v4, v2}, Lcom/roidapp/imagelib/crop/q;-><init>(Lcom/roidapp/imagelib/crop/j;IILandroid/graphics/Bitmap$CompressFormat;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 4390
    :cond_1
    :goto_0
    return-void

    .line 344
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->D:Z

    if-eqz v0, :cond_3

    .line 345
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    .line 4357
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4358
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/crop/a;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->u:Landroid/graphics/Bitmap;

    .line 4359
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->u:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 4360
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->u:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 4361
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v2}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->deleteImage()V

    .line 4362
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->u:Landroid/graphics/Bitmap;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setImage(Landroid/graphics/Bitmap;Z)V

    .line 4366
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->H:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 4367
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setVisibility(I)V

    .line 4375
    int-to-float v0, v0

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 4377
    const/high16 v1, 0x43b40000    # 360.0f

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 4380
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 4381
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4382
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->forceLayout()V

    .line 4384
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x168

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->saveToPictures(Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4386
    :catch_0
    move-exception v0

    .line 4387
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 4388
    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0

    .line 347
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/q;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-direct {v1, p0, v3, p1, v2}, Lcom/roidapp/imagelib/crop/q;-><init>(Lcom/roidapp/imagelib/crop/j;IILandroid/graphics/Bitmap$CompressFormat;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 278
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 279
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 283
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 284
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/av;

    if-eqz v0, :cond_0

    .line 285
    check-cast p1, Lcom/roidapp/imagelib/filter/av;

    iput-object p1, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    return-void

    .line 287
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImageEditCropFragment.OnImageEditCropListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v6, 0x5

    const/4 v5, 0x0

    const/4 v4, 0x3

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 431
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/j;->E:Z

    if-eqz v2, :cond_1

    .line 522
    :cond_0
    :goto_0
    return-void

    .line 433
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    .line 434
    sget v3, Lcom/roidapp/imagelib/g;->aK:I

    if-ne v3, v2, :cond_4

    .line 435
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/av;->a()V

    .line 436
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 437
    iput-object v5, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    .line 438
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/crop/a;->b()V

    .line 439
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/j;->K:Z

    if-nez v2, :cond_3

    .line 440
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/j;->k:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 441
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/f;->ax:I

    invoke-virtual {v2, v3, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 442
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/imagelib/b/d;->b(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    .line 443
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->b:Ljava/lang/String;

    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    .line 444
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/imagelib/crop/n;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v0}, Lcom/roidapp/imagelib/crop/n;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;I)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 452
    :goto_1
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/j;->K:Z

    if-nez v2, :cond_2

    move v0, v1

    :cond_2
    iput-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->K:Z

    .line 453
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->E:Z

    goto :goto_0

    .line 446
    :cond_3
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/j;->i:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 447
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/f;->aw:I

    invoke-virtual {v2, v3, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 448
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/imagelib/b/d;->b(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    .line 449
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    iput-object v2, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    .line 450
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/imagelib/crop/n;

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    invoke-direct {v3, p0, v4, v0}, Lcom/roidapp/imagelib/crop/n;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;I)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_1

    .line 454
    :cond_4
    sget v3, Lcom/roidapp/imagelib/g;->ai:I

    if-ne v3, v2, :cond_c

    .line 455
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/j;->y:Z

    if-eqz v2, :cond_a

    .line 456
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/j;->f:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 457
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/f;->ay:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 458
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    invoke-virtual {v3, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4637
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4638
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4639
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4640
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4641
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4644
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4645
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4646
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4647
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4648
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;Z)V

    .line 4650
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v3, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    if-ne v2, v3, :cond_6

    .line 4651
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 4652
    const/4 v2, 0x2

    invoke-direct {p0, v4, v2}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    .line 466
    :cond_5
    :goto_2
    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/j;->y:Z

    if-nez v2, :cond_b

    :goto_3
    iput-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->y:Z

    goto/16 :goto_0

    .line 4653
    :cond_6
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v3, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    if-ne v2, v3, :cond_7

    .line 4654
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 4655
    const/4 v2, 0x4

    invoke-direct {p0, v2, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_2

    .line 4656
    :cond_7
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v3, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    if-ne v2, v3, :cond_8

    .line 4657
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 4658
    invoke-direct {p0, v6, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_2

    .line 4659
    :cond_8
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v3, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    if-ne v2, v3, :cond_9

    .line 4660
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 4661
    const/4 v2, 0x7

    invoke-direct {p0, v2, v6}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_2

    .line 4662
    :cond_9
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->r:Lcom/roidapp/imagelib/crop/m;

    sget-object v3, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    if-ne v2, v3, :cond_5

    .line 4663
    sget-object v2, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 4664
    const/16 v2, 0x10

    const/16 v3, 0x9

    invoke-direct {p0, v2, v3}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto :goto_2

    .line 461
    :cond_a
    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    sget v3, Lcom/roidapp/imagelib/j;->h:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 462
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/f;->au:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 463
    iget-object v3, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    invoke-virtual {v3, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 464
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/j;->b()V

    goto :goto_2

    :cond_b
    move v1, v0

    .line 466
    goto :goto_3

    .line 467
    :cond_c
    sget v3, Lcom/roidapp/imagelib/g;->av:I

    if-ne v3, v2, :cond_d

    .line 468
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 469
    sget-object v1, Lcom/roidapp/imagelib/crop/m;->a:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v1}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 470
    invoke-direct {p0, v0, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 471
    :cond_d
    sget v0, Lcom/roidapp/imagelib/g;->al:I

    if-ne v0, v2, :cond_e

    .line 472
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 473
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->b:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 474
    invoke-direct {p0, v1, v1}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 475
    :cond_e
    sget v0, Lcom/roidapp/imagelib/g;->am:I

    if-ne v0, v2, :cond_f

    .line 476
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 477
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 478
    const/4 v0, 0x2

    invoke-direct {p0, v0, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 479
    :cond_f
    sget v0, Lcom/roidapp/imagelib/g;->an:I

    if-ne v0, v2, :cond_10

    .line 480
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 481
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 482
    const/4 v0, 0x2

    invoke-direct {p0, v4, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 483
    :cond_10
    sget v0, Lcom/roidapp/imagelib/g;->ao:I

    if-ne v0, v2, :cond_11

    .line 484
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 485
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 486
    const/4 v0, 0x4

    invoke-direct {p0, v4, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 487
    :cond_11
    sget v0, Lcom/roidapp/imagelib/g;->ap:I

    if-ne v0, v2, :cond_12

    .line 488
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 489
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 490
    invoke-direct {p0, v4, v6}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 491
    :cond_12
    sget v0, Lcom/roidapp/imagelib/g;->aq:I

    if-ne v0, v2, :cond_13

    .line 492
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 493
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 494
    const/4 v0, 0x4

    invoke-direct {p0, v0, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 495
    :cond_13
    sget v0, Lcom/roidapp/imagelib/g;->ar:I

    if-ne v0, v2, :cond_14

    .line 496
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 497
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 498
    invoke-direct {p0, v6, v4}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 499
    :cond_14
    sget v0, Lcom/roidapp/imagelib/g;->as:I

    if-ne v0, v2, :cond_15

    .line 500
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 501
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 502
    const/4 v0, 0x7

    invoke-direct {p0, v6, v0}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 503
    :cond_15
    sget v0, Lcom/roidapp/imagelib/g;->at:I

    if-ne v0, v2, :cond_16

    .line 504
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 505
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 506
    const/4 v0, 0x7

    invoke-direct {p0, v0, v6}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 507
    :cond_16
    sget v0, Lcom/roidapp/imagelib/g;->au:I

    if-ne v0, v2, :cond_17

    .line 508
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 509
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 510
    const/16 v0, 0x9

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0

    .line 511
    :cond_17
    sget v0, Lcom/roidapp/imagelib/g;->ak:I

    if-ne v0, v2, :cond_0

    .line 512
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/crop/j;->a(Landroid/view/View;)V

    .line 513
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 514
    const/16 v0, 0x10

    const/16 v1, 0x9

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/crop/j;->a(II)V

    goto/16 :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v9, -0x2

    const/16 v8, 0x64

    const/4 v7, 0x1

    const/4 v5, 0x0

    .line 196
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 197
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/onCreate"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 200
    if-eqz v1, :cond_2

    .line 201
    const-string v0, "edit_image_path"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    .line 202
    const-string v0, "edit_image_origin_path"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->b:Ljava/lang/String;

    .line 203
    const-string v0, "edit_crop_image_path"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->c:Ljava/lang/String;

    .line 204
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    .line 205
    const-string v0, "edit_image_property_lightness"

    const/16 v2, 0x96

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 206
    const-string v2, "edit_image_property_contast"

    invoke-virtual {v1, v2, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 207
    const-string v3, "edit_image_property_saturation"

    invoke-virtual {v1, v3, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 208
    const-string v4, "edit_image_property_hue"

    const/16 v6, 0xb4

    invoke-virtual {v1, v4, v6}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 209
    const-string v6, "edit_is_crop"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/roidapp/imagelib/crop/j;->I:Z

    .line 210
    const-string v6, "edit_photo_profile"

    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    iput-boolean v6, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    .line 212
    new-instance v6, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v6, v0, v2, v3, v4}, Lcom/roidapp/imagelib/b/b;-><init>(IIII)V

    iput-object v6, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    .line 213
    const-string v0, "edit_filter_type"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 214
    const-string v0, "alphaProgress"

    invoke-virtual {v1, v0, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    .line 216
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    if-nez v0, :cond_2

    .line 218
    iput-boolean v7, p0, Lcom/roidapp/imagelib/crop/j;->C:Z

    .line 219
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    .line 220
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 221
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 222
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 223
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 224
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget v1, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 225
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->C:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 231
    :goto_0
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    iput-boolean v7, p0, Lcom/roidapp/imagelib/crop/j;->D:Z

    .line 233
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 234
    new-instance v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 235
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v9, v9}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 237
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/crop/j;->D:Z

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setGalaxyYSeries(Z)V

    .line 240
    const/4 v0, 0x0

    .line 241
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 242
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v0, :cond_4

    .line 243
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v2, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 248
    :cond_0
    :goto_1
    if-nez v0, :cond_1

    .line 249
    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget v6, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v8

    move v9, v5

    invoke-virtual/range {v4 .. v9}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 250
    :cond_1
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v1, v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilterNoApply(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 255
    :cond_2
    return-void

    .line 227
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->h:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 228
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget v1, p0, Lcom/roidapp/imagelib/crop/j;->P:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 229
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v7}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    goto/16 :goto_0

    .line 245
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->g:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    iget v2, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v4, p0, Lcom/roidapp/imagelib/crop/j;->A:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    goto :goto_1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 261
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/onCreateView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 263
    sget v0, Lcom/roidapp/imagelib/h;->e:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    .line 265
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    .line 1548
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "ImageEditCropFragment/initControls"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1550
    sget v0, Lcom/roidapp/imagelib/g;->ai:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    .line 1551
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1552
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->p:Landroid/widget/TextView;

    sget v2, Lcom/roidapp/imagelib/j;->h:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 1578
    sget v0, Lcom/roidapp/imagelib/g;->av:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1579
    sget v0, Lcom/roidapp/imagelib/g;->al:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1580
    sget v0, Lcom/roidapp/imagelib/g;->am:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1581
    sget v0, Lcom/roidapp/imagelib/g;->an:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1582
    sget v0, Lcom/roidapp/imagelib/g;->ao:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1583
    sget v0, Lcom/roidapp/imagelib/g;->ap:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1584
    sget v0, Lcom/roidapp/imagelib/g;->aq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1585
    sget v0, Lcom/roidapp/imagelib/g;->ar:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1586
    sget v0, Lcom/roidapp/imagelib/g;->as:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1587
    sget v0, Lcom/roidapp/imagelib/g;->at:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1588
    sget v0, Lcom/roidapp/imagelib/g;->au:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1589
    sget v0, Lcom/roidapp/imagelib/g;->ak:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1592
    sget v0, Lcom/roidapp/imagelib/g;->aK:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    .line 1593
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->I:Z

    if-eqz v0, :cond_0

    .line 1594
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1595
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1599
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    aput v3, v0, v3

    .line 1600
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->z:[I

    const/4 v1, 0x1

    aput v3, v0, v1

    .line 267
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    .line 1700
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v2, "ImageEditCropFragment/initView"

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1702
    sget v0, Lcom/roidapp/imagelib/g;->aA:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/crop/CropImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    .line 1703
    sget v0, Lcom/roidapp/imagelib/g;->aj:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->o:Landroid/widget/HorizontalScrollView;

    .line 1705
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/CropImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->H:Landroid/view/ViewGroup;

    .line 1707
    new-instance v0, Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->q:Lcom/roidapp/imagelib/crop/CropImageView;

    invoke-direct {v0, v1, v2}, Lcom/roidapp/imagelib/crop/a;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/crop/CropImageView;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    .line 1709
    invoke-virtual {p0}, Lcom/roidapp/imagelib/crop/j;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/d;->b(Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->i:[Ljava/lang/Integer;

    .line 1710
    iget-boolean v0, p0, Lcom/roidapp/imagelib/crop/j;->L:Z

    if-eqz v0, :cond_1

    .line 1711
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->s:Lcom/roidapp/imagelib/crop/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/crop/a;->a()V

    .line 1712
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->o:Landroid/widget/HorizontalScrollView;

    invoke-virtual {v0, v4}, Landroid/widget/HorizontalScrollView;->setVisibility(I)V

    .line 1713
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/o;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/imagelib/crop/o;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 2609
    :goto_1
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/initCropLayoutMap"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2611
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    .line 2612
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->a:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->av:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2613
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->b:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->al:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2614
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->c:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->am:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2615
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->d:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->an:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2616
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->e:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->ao:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2617
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->f:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->ap:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2618
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->g:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->aq:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2619
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->h:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->ar:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2620
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->i:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->as:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2621
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->j:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->at:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2622
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->k:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->au:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2623
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->w:Ljava/util/HashMap;

    sget-object v1, Lcom/roidapp/imagelib/crop/m;->l:Lcom/roidapp/imagelib/crop/m;

    sget v2, Lcom/roidapp/imagelib/g;->ak:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2624
    invoke-direct {p0}, Lcom/roidapp/imagelib/crop/j;->b()V

    .line 271
    sget-object v0, Lcom/roidapp/imagelib/crop/m;->a:Lcom/roidapp/imagelib/crop/m;

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/crop/j;->a(Lcom/roidapp/imagelib/crop/m;)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->e:Landroid/view/View;

    return-object v0

    .line 1597
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 1715
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/n;

    iget-object v2, p0, Lcom/roidapp/imagelib/crop/j;->d:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v3}, Lcom/roidapp/imagelib/crop/n;-><init>(Lcom/roidapp/imagelib/crop/j;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_1
.end method

.method public final onDestroyView()V
    .locals 2

    .prologue
    .line 300
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->t:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 3323
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 3324
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditCropFragment/destroyGPUView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 3325
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3326
    if-eqz v0, :cond_0

    .line 3327
    iget-object v1, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 3328
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->removeAllViews()V

    .line 3329
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 302
    :cond_1
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 303
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 294
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 295
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/crop/j;->x:Lcom/roidapp/imagelib/filter/av;

    .line 296
    return-void
.end method

.method public final onPause()V
    .locals 1

    .prologue
    .line 316
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onPause()V

    .line 318
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    .line 319
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onPause()V

    .line 320
    :cond_0
    return-void
.end method

.method public final onPictureSaved(Landroid/graphics/Bitmap;)V
    .locals 5

    .prologue
    .line 1004
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/j;->v:Landroid/graphics/Bitmap;

    .line 1005
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/crop/q;

    const/4 v2, 0x1

    iget v3, p0, Lcom/roidapp/imagelib/crop/j;->G:I

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-direct {v1, p0, v2, v3, v4}, Lcom/roidapp/imagelib/crop/q;-><init>(Lcom/roidapp/imagelib/crop/j;IILandroid/graphics/Bitmap$CompressFormat;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1006
    return-void
.end method

.method public final onResume()V
    .locals 1

    .prologue
    .line 307
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 309
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/j;->F:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onResume()V

    .line 312
    :cond_0
    return-void
.end method
