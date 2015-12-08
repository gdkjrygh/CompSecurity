.class public final Lcom/roidapp/imagelib/filter/aj;
.super Lcom/roidapp/imagelib/filter/n;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/imagelib/filter/ad;
.implements Lcom/roidapp/imagelib/filter/ag;
.implements Lcom/roidapp/imagelib/filter/bf;
.implements Ljp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Lcom/roidapp/imagelib/filter/bi;

.field private D:Landroid/graphics/Bitmap;

.field private E:Z

.field private F:Lcom/roidapp/imagelib/filter/bg;

.field private G:Lcom/roidapp/imagelib/filter/az;

.field private H:Lcom/roidapp/imagelib/filter/ImageColorView;

.field private I:Landroid/widget/FrameLayout;

.field private J:Lcom/roidapp/imagelib/filter/r;

.field private K:Landroid/os/Handler;

.field private L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

.field public final f:Ljava/lang/String;

.field protected g:Landroid/view/View;

.field protected h:Ljava/lang/String;

.field protected i:Ljava/lang/String;

.field protected j:I

.field protected k:I

.field protected l:I

.field protected m:I

.field protected n:Lcom/roidapp/imagelib/filter/ai;

.field protected o:Landroid/net/Uri;

.field p:[Ljava/lang/Integer;

.field public q:Lcom/roidapp/imagelib/filter/aq;

.field private r:Landroid/widget/FrameLayout;

.field private s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

.field private t:Ljava/lang/String;

.field private u:Landroid/view/View;

.field private v:Landroid/view/View;

.field private w:Z

.field private volatile x:Z

.field private y:Lcom/roidapp/imagelib/filter/av;

.field private final z:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, -0x1

    const/4 v1, 0x0

    .line 63
    invoke-direct {p0}, Lcom/roidapp/imagelib/filter/n;-><init>()V

    .line 91
    const-string v0, "FILTER_OPTIMIZATION"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->f:Ljava/lang/String;

    .line 100
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->t:Ljava/lang/String;

    .line 101
    iput v2, p0, Lcom/roidapp/imagelib/filter/aj;->j:I

    iput v2, p0, Lcom/roidapp/imagelib/filter/aj;->k:I

    .line 102
    iput v2, p0, Lcom/roidapp/imagelib/filter/aj;->l:I

    iput v2, p0, Lcom/roidapp/imagelib/filter/aj;->m:I

    .line 103
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->n:Lcom/roidapp/imagelib/filter/ai;

    .line 107
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->w:Z

    .line 109
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    .line 110
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    .line 114
    iput v3, p0, Lcom/roidapp/imagelib/filter/aj;->z:I

    .line 115
    iput-boolean v3, p0, Lcom/roidapp/imagelib/filter/aj;->A:Z

    .line 116
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->B:Z

    .line 121
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->E:Z

    .line 137
    new-instance v0, Lcom/roidapp/imagelib/filter/at;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/filter/at;-><init>(Lcom/roidapp/imagelib/filter/aj;B)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    .line 1097
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/aj;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aj;->D:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/av;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->y:Lcom/roidapp/imagelib/filter/av;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1005
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/filter/ao;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/filter/ao;-><init>(Lcom/roidapp/imagelib/filter/aj;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1015
    return-void
.end method

.method private a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V
    .locals 2

    .prologue
    .line 976
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 977
    if-eqz v0, :cond_0

    if-eqz v0, :cond_2

    if-eq p1, v0, :cond_2

    .line 978
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 979
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 980
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilterNoApply(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 981
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    .line 983
    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/aj;Z)Z
    .locals 0

    .prologue
    .line 63
    iput-boolean p1, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/filter/aj;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->D:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/imagelib/filter/aj;Landroid/graphics/Bitmap;)V
    .locals 6

    .prologue
    .line 8594
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 8595
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->deleteImage()V

    .line 8596
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setImage(Landroid/graphics/Bitmap;)V

    .line 8598
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->aD:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 8599
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 8600
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 8601
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 8602
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setVisibility(I)V

    .line 8607
    iget v0, p0, Lcom/roidapp/imagelib/filter/aj;->l:I

    int-to-float v0, v0

    iget v1, p0, Lcom/roidapp/imagelib/filter/aj;->m:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 8609
    const/high16 v1, 0x43b40000    # 360.0f

    div-float v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 8611
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x168

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->saveToPictures(Ljava/lang/String;Ljava/lang/String;IILjp/co/cyberagent/android/gpuimage/GPUImageView$OnPictureSavedListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8617
    :cond_0
    :goto_0
    return-void

    .line 8613
    :catch_0
    move-exception v0

    .line 8614
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 8615
    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/az;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bg;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/bi;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/filter/aj;)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    return-object v0
.end method

.method private f(I)V
    .locals 6

    .prologue
    const/16 v5, 0x405

    const/4 v4, 0x2

    const/4 v3, 0x0

    .line 800
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 856
    :cond_0
    :goto_0
    return-void

    .line 802
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 803
    if-eqz v0, :cond_0

    .line 805
    sget-object v1, Lcom/roidapp/imagelib/filter/ap;->a:[I

    add-int/lit8 v2, p1, -0x1

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 807
    :pswitch_0
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/filter/aj;->a(Landroid/widget/FrameLayout;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_0

    .line 814
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->u:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 815
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 816
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    if-nez v1, :cond_2

    .line 817
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 818
    new-instance v1, Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/imagelib/filter/ImageColorView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    .line 820
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-virtual {v1, p0}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Landroid/support/v4/app/Fragment;)V

    .line 821
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v1

    if-lez v1, :cond_4

    .line 822
    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Lcom/roidapp/imagelib/filter/ImageColorView;

    if-eqz v1, :cond_3

    .line 823
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 824
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    goto :goto_0

    .line 826
    :cond_3
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 827
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 828
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->n:Lcom/roidapp/imagelib/filter/ai;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/ai;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 829
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-static {v0, v5, v4, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 830
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 834
    :cond_4
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 835
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->H:Lcom/roidapp/imagelib/filter/ImageColorView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->n:Lcom/roidapp/imagelib/filter/ai;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/ai;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/ImageColorView;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 836
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-static {v0, v5, v4, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 837
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 805
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic g(Lcom/roidapp/imagelib/filter/aj;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/filter/aj;)Ljp/co/cyberagent/android/gpuimage/GPUImageView;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/imagelib/filter/aj;)Z
    .locals 1

    .prologue
    .line 63
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aj;->A:Z

    return v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)Lcom/roidapp/imagelib/filter/ax;
    .locals 1

    .prologue
    .line 777
    new-instance v0, Lcom/roidapp/imagelib/filter/an;

    invoke-direct {v0, p0, p1, p2}, Lcom/roidapp/imagelib/filter/an;-><init>(Lcom/roidapp/imagelib/filter/aj;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    return-object v0
.end method

.method protected final a(I)V
    .locals 1

    .prologue
    .line 733
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 734
    if-eqz p1, :cond_0

    const/16 v0, 0x25

    if-eq p1, v0, :cond_0

    const/16 v0, 0x26

    if-eq p1, v0, :cond_0

    const/16 v0, 0x27

    if-eq p1, v0, :cond_0

    const/16 v0, 0x29

    if-eq p1, v0, :cond_0

    const/16 v0, 0x1c

    if-ne p1, v0, :cond_2

    .line 736
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->openBlendMode()V

    .line 742
    :cond_1
    :goto_0
    return-void

    .line 738
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->closeBlendMode()V

    goto :goto_0
.end method

.method public final a(Landroid/widget/FrameLayout;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 4

    .prologue
    .line 859
    if-nez p1, :cond_0

    .line 876
    :goto_0
    return-void

    .line 866
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/ImageEditGLESFragment/editFilter"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 868
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/f;->o:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 869
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->u:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 871
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->e()V

    .line 874
    :goto_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    const/16 v1, 0x405

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 875
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 872
    :cond_1
    invoke-virtual {p0, p2}, Lcom/roidapp/imagelib/filter/aj;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_1
.end method

.method public final a(Lcom/roidapp/imagelib/filter/ai;)V
    .locals 0

    .prologue
    .line 880
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aj;->n:Lcom/roidapp/imagelib/filter/ai;

    .line 881
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/aq;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 624
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->t:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/ImageEditGLESFragment/saveBtn"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 625
    iput-boolean v4, p0, Lcom/roidapp/imagelib/filter/aj;->E:Z

    .line 626
    iput-boolean v4, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    .line 627
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 628
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 629
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aj;->B:Z

    if-eqz v0, :cond_0

    .line 630
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    const/16 v1, 0x403

    invoke-static {v0, v1, v3, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 631
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 632
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aj;->q:Lcom/roidapp/imagelib/filter/aq;

    .line 653
    :goto_0
    return-void

    .line 634
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->b:Lcom/roidapp/imagelib/c/b;

    new-instance v1, Lcom/roidapp/imagelib/filter/am;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/imagelib/filter/am;-><init>(Lcom/roidapp/imagelib/filter/aj;Lcom/roidapp/imagelib/filter/aq;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/c/b;->a(Lcom/roidapp/imagelib/c/c;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 4

    .prologue
    .line 704
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 705
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    if-nez v1, :cond_0

    const/16 v1, 0x64

    :goto_0
    invoke-virtual {v2, p1, v1}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;I)V

    .line 707
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 708
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 709
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0, v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 710
    return-void

    .line 705
    :cond_0
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->a()I

    move-result v1

    goto :goto_0
.end method

.method public final b(I)V
    .locals 4

    .prologue
    .line 885
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->a(I)V

    .line 886
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 887
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    .line 888
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/bi;->c(I)F

    move-result v1

    .line 889
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 890
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 891
    instance-of v3, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    if-eqz v3, :cond_0

    .line 892
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setBrightness(F)V

    .line 893
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 894
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 898
    :cond_1
    return-void
.end method

.method public final c(I)V
    .locals 4

    .prologue
    .line 902
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->b(I)V

    .line 903
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 904
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    .line 905
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/bi;->d(I)F

    move-result v1

    .line 906
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 907
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 908
    instance-of v3, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    if-eqz v3, :cond_0

    .line 909
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setContrast(F)V

    .line 910
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 911
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 915
    :cond_1
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 1001
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    return v0
.end method

.method public final d()V
    .locals 5

    .prologue
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    .line 956
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    new-instance v1, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v1}, Lcom/roidapp/imagelib/b/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 957
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 958
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    .line 959
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 960
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 961
    instance-of v1, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    if-eqz v1, :cond_0

    move-object v1, v0

    .line 962
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v1, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setBrightness(F)V

    move-object v1, v0

    .line 963
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setContrast(F)V

    move-object v1, v0

    .line 964
    check-cast v1, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v1, v4}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setSaturation(F)V

    .line 965
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v0, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setHue(F)V

    .line 966
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 967
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 971
    :cond_1
    return-void
.end method

.method public final d(I)V
    .locals 4

    .prologue
    .line 920
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->c(I)V

    .line 921
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 922
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    .line 923
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/bi;->e(I)F

    move-result v1

    .line 924
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 925
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 926
    instance-of v3, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    if-eqz v3, :cond_0

    .line 927
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setSaturation(F)V

    .line 928
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 929
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 933
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 718
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 719
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 720
    new-instance v1, Landroid/view/View;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 721
    sget v2, Lcom/roidapp/imagelib/f;->d:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 722
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/roidapp/imagelib/e;->h:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 723
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 724
    const/16 v2, 0x50

    iput v2, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 725
    invoke-virtual {v0, v1, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 726
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/e;->f:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    .line 727
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 728
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0, v1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 729
    return-void
.end method

.method public final e(I)V
    .locals 4

    .prologue
    .line 939
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/b/b;->d(I)V

    .line 940
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 941
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v1, :cond_1

    .line 942
    invoke-static {p1}, Lcom/roidapp/imagelib/filter/bi;->g(I)F

    move-result v1

    .line 943
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;

    .line 944
    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageFilterGroup;->getFilters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    .line 945
    instance-of v3, v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    if-eqz v3, :cond_0

    .line 946
    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageColorFilter;->setHue(F)V

    .line 947
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 948
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 952
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 6

    .prologue
    .line 745
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    if-nez v0, :cond_1

    .line 761
    :cond_0
    :goto_0
    return-void

    .line 746
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bg;->b()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 747
    invoke-static {v0}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 748
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 749
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    .line 750
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    new-instance v3, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v3}, Lcom/roidapp/imagelib/b/b;-><init>()V

    invoke-virtual {v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 751
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/filter/bi;->b(I)V

    .line 752
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 753
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/bg;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 754
    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/filter/aj;->a(I)V

    .line 756
    instance-of v2, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v2, :cond_4

    .line 757
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v2, p0, Lcom/roidapp/imagelib/filter/aj;->j:I

    iget v3, p0, Lcom/roidapp/imagelib/filter/aj;->k:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    .line 7986
    :goto_1
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    .line 7987
    if-eqz v1, :cond_2

    if-eqz v1, :cond_0

    if-eq v0, v1, :cond_0

    .line 7988
    :cond_2
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 7989
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_3

    .line 7990
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->h()Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFilter(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 7991
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 7993
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->o:Landroid/net/Uri;

    goto :goto_0

    .line 759
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    iget v2, p0, Lcom/roidapp/imagelib/filter/aj;->j:I

    iget v3, p0, Lcom/roidapp/imagelib/filter/aj;->k:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    goto :goto_1
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 770
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bg;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 771
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->j()V

    .line 772
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->requestRender()V

    .line 773
    return-void
.end method

.method public final h()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 321
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 322
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 330
    :goto_0
    return v0

    .line 325
    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 326
    instance-of v0, v0, Lcom/roidapp/imagelib/filter/bg;

    if-eqz v0, :cond_1

    .line 327
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->e()V

    .line 328
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 330
    goto :goto_0
.end method

.method public final i()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 1232
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    .line 1233
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/az;->B()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    goto :goto_0
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 361
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onActivityCreated(Landroid/os/Bundle;)V

    .line 362
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 366
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onAttach(Landroid/app/Activity;)V

    .line 367
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/av;

    if-eqz v0, :cond_0

    .line 368
    check-cast p1, Lcom/roidapp/imagelib/filter/av;

    iput-object p1, p0, Lcom/roidapp/imagelib/filter/aj;->y:Lcom/roidapp/imagelib/filter/av;

    return-void

    .line 370
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImageEditGLESFragment.OnImageEditListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 577
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    if-eqz v0, :cond_1

    .line 590
    :cond_0
    :goto_0
    return-void

    .line 579
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 581
    sget v1, Lcom/roidapp/imagelib/g;->G:I

    if-ne v0, v1, :cond_2

    .line 582
    sget v0, Lcom/roidapp/imagelib/filter/ar;->a:I

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/aj;->f(I)V

    goto :goto_0

    .line 583
    :cond_2
    sget v1, Lcom/roidapp/imagelib/g;->I:I

    if-ne v0, v1, :cond_0

    .line 584
    sget v0, Lcom/roidapp/imagelib/filter/ar;->b:I

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/aj;->f(I)V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/16 v8, 0x64

    .line 241
    invoke-super {p0, p1}, Lcom/roidapp/imagelib/filter/n;->onCreate(Landroid/os/Bundle;)V

    .line 242
    const-string v0, "ImageEditGLESFragment"

    const-string v3, "onCreate"

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v3, "ImageEditGLESFragment/onCreate"

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 245
    iput-boolean v2, p0, Lcom/roidapp/imagelib/filter/aj;->w:Z

    .line 247
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 248
    if-eqz v0, :cond_2

    .line 249
    const-string v3, "edit_image_path"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    .line 250
    const-string v3, "edit_image_origin_path"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->h:Ljava/lang/String;

    .line 251
    const-string v3, "edit_image_filter_path"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->i:Ljava/lang/String;

    .line 252
    const-string v3, "mode_str"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->t:Ljava/lang/String;

    .line 254
    const-string v3, "edit_image_property_lightness"

    const/16 v4, 0x96

    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 255
    const-string v4, "edit_image_property_contast"

    invoke-virtual {v0, v4, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 256
    const-string v5, "edit_image_property_saturation"

    invoke-virtual {v0, v5, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 257
    const-string v6, "edit_image_property_hue"

    const/16 v7, 0xb4

    invoke-virtual {v0, v6, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 259
    const-string v7, "edit_filter_support"

    invoke-virtual {v0, v7, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    iput-boolean v7, p0, Lcom/roidapp/imagelib/filter/aj;->A:Z

    .line 260
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v7

    invoke-virtual {v7}, Lcom/roidapp/baselib/gl/c;->c()Z

    move-result v7

    if-eqz v7, :cond_0

    .line 261
    iput-boolean v9, p0, Lcom/roidapp/imagelib/filter/aj;->B:Z

    .line 265
    :cond_0
    new-instance v7, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v7, v3, v4, v5, v6}, Lcom/roidapp/imagelib/b/b;-><init>(IIII)V

    .line 266
    const-string v3, "alphaProgress"

    invoke-virtual {v0, v3, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 267
    const-string v4, "edit_filter_type"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 268
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 270
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 2041
    invoke-static {v4, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 270
    if-nez v0, :cond_1

    .line 271
    iput-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 273
    :cond_1
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    .line 275
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-static {v0}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-object v0, v1

    .line 277
    :goto_0
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    if-nez v0, :cond_4

    move v1, v2

    :goto_1
    invoke-virtual {v4, v7, v1}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 278
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 279
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->A:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 280
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/filter/bi;->a(I)V

    .line 282
    new-instance v0, Lcom/roidapp/imagelib/filter/r;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->J:Lcom/roidapp/imagelib/filter/r;

    .line 284
    :cond_2
    return-void

    .line 276
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    goto :goto_0

    .line 277
    :cond_4
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    goto :goto_1
.end method

.method public final onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 1

    .prologue
    .line 288
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/imagelib/filter/n;->onCreateAnimation(IZI)Landroid/view/animation/Animation;

    move-result-object v0

    return-object v0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/16 v9, 0x280

    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 294
    const-string v0, "ImageEditGLESFragment"

    const-string v2, "onCreateView"

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 298
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "OpenGL ES 2.0 is not supported on this phone."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 318
    :goto_0
    return-object v1

    .line 303
    :cond_0
    :try_start_0
    const-class v0, Landroid/opengl/GLSurfaceView;

    const-string v2, "setEGLContextClientVersion"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const/4 v4, 0x0

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 310
    sget v0, Lcom/roidapp/imagelib/h;->g:I

    invoke-virtual {p1, v0, p2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    .line 312
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->a()V

    .line 314
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    .line 2518
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v3, "ImageEditGLESFragment/initImageView"

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 2519
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v3, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    .line 2520
    sget v0, Lcom/roidapp/imagelib/g;->ax:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->r:Landroid/widget/FrameLayout;

    .line 2535
    sget v0, Lcom/roidapp/imagelib/g;->aC:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 2537
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v3, Lcom/roidapp/imagelib/filter/al;

    invoke-direct {v3, p0}, Lcom/roidapp/imagelib/filter/al;-><init>(Lcom/roidapp/imagelib/filter/aj;)V

    invoke-virtual {v0, v2, v3}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->setFile(Ljava/io/File;Ljp/co/cyberagent/android/gpuimage/GPUImage$OnImageLoadDoneListener;)V

    .line 2547
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 2548
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v2, p0, Lcom/roidapp/imagelib/filter/aj;->j:I

    .line 2549
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/filter/aj;->k:I

    .line 2554
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->a:Ljava/lang/String;

    .line 3485
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 3489
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v4

    long-to-float v3, v4

    const/high16 v4, 0x44800000    # 1024.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x44800000    # 1024.0f

    div-float/2addr v3, v4

    .line 3490
    const/high16 v4, 0x42c00000    # 96.0f

    cmpl-float v4, v3, v4

    if-ltz v4, :cond_5

    .line 3491
    const/16 v3, 0x1000

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3492
    const/16 v3, 0x800

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3493
    const/16 v3, 0x400

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3508
    :cond_1
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/Integer;

    .line 3509
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3510
    invoke-static {v0, v3}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;[Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    .line 3513
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "save min length is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2554
    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->p:[Ljava/lang/Integer;

    .line 2559
    new-instance v0, Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/aj;->w:Z

    invoke-direct {v0, v2, p0, v3}, Lcom/roidapp/imagelib/filter/az;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/bf;Z)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    .line 2560
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    if-eqz v0, :cond_3

    .line 2561
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/az;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ab;

    .line 2562
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/imagelib/filter/ab;->a(J)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 2563
    if-eqz v0, :cond_2

    .line 2564
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 2565
    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 2567
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 2570
    :cond_3
    new-instance v0, Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v0, v2, p0}, Lcom/roidapp/imagelib/filter/bg;-><init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/ad;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    .line 2571
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0, v6}, Lcom/roidapp/imagelib/filter/bg;->a(Z)V

    .line 2572
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/az;->A()Lcom/roidapp/imagelib/filter/be;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/bg;->a(Lcom/roidapp/imagelib/filter/be;)V

    .line 316
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    .line 4436
    sget v0, Lcom/roidapp/imagelib/g;->G:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->u:Landroid/view/View;

    .line 4437
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->u:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4438
    sget v0, Lcom/roidapp/imagelib/g;->I:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    .line 4439
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4443
    iget-boolean v0, p0, Lcom/roidapp/imagelib/filter/aj;->A:Z

    if-eqz v0, :cond_8

    .line 4444
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    sget v3, Lcom/roidapp/imagelib/g;->ay:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 4445
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    instance-of v3, v3, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    if-eqz v3, :cond_4

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->L:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    :cond_4
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/filter/aj;->a(Landroid/widget/FrameLayout;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 4446
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    const/16 v1, 0x405

    invoke-static {v0, v1, v7, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 4447
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 4455
    :goto_2
    new-instance v0, Lcom/roidapp/imagelib/filter/a;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/a;-><init>(Landroid/content/Context;)V

    .line 4456
    new-instance v1, Lcom/roidapp/imagelib/filter/ak;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/ak;-><init>(Lcom/roidapp/imagelib/filter/aj;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/a;->a(Lcom/roidapp/imagelib/filter/c;)V

    .line 4463
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/a;->a()V

    .line 318
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->g:Landroid/view/View;

    goto/16 :goto_0

    .line 304
    :catch_0
    move-exception v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    .line 306
    const-string v2, ""

    invoke-direct {p0, v0, v2}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 3494
    :cond_5
    const/high16 v4, 0x42c00000    # 96.0f

    cmpg-float v4, v3, v4

    if-gez v4, :cond_6

    const/high16 v4, 0x42800000    # 64.0f

    cmpl-float v4, v3, v4

    if-ltz v4, :cond_6

    .line 3495
    const/16 v3, 0x800

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3496
    const/16 v3, 0x400

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3497
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 3498
    :cond_6
    const/high16 v4, 0x42800000    # 64.0f

    cmpg-float v4, v3, v4

    if-gez v4, :cond_7

    const/high16 v4, 0x42000000    # 32.0f

    cmpl-float v4, v3, v4

    if-ltz v4, :cond_7

    .line 3499
    const/16 v3, 0x3c0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3500
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3501
    const/16 v3, 0x140

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 3502
    :cond_7
    const/high16 v4, 0x42000000    # 32.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    .line 3503
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v6, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3504
    const/16 v3, 0x140

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v7, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 3505
    const/16 v3, 0xa0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_1

    .line 4449
    :cond_8
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->u:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4450
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->v:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 4451
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    const/16 v1, 0x405

    invoke-static {v0, v1, v6, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v0

    .line 4452
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_2
.end method

.method public final onDestroyView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 353
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onDestroyView()V

    .line 355
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->b()V

    .line 5335
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 5336
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImageEditGLESFragment/destroyView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 5337
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 5338
    if-eqz v0, :cond_0

    .line 5339
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 5340
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->removeAllViews()V

    .line 5341
    iput-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    .line 5343
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->r:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_2

    .line 5344
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->r:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 5345
    iput-object v2, p0, Lcom/roidapp/imagelib/filter/aj;->r:Landroid/widget/FrameLayout;

    .line 5347
    :cond_2
    invoke-static {}, Lcom/roidapp/imagelib/filter/r;->a()V

    .line 357
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 377
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onDetach()V

    .line 378
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->y:Lcom/roidapp/imagelib/filter/av;

    .line 379
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->D:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 380
    return-void
.end method

.method public final onPause()V
    .locals 1

    .prologue
    .line 429
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onPause()V

    .line 431
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onPause()V

    .line 433
    :cond_0
    return-void
.end method

.method public final onPictureSaved(Landroid/graphics/Bitmap;)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 657
    iput-boolean v1, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    .line 658
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_0

    .line 659
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->cancelSavePicturesTask()V

    .line 661
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->q:Lcom/roidapp/imagelib/filter/aq;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/aq;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 662
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 663
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_1

    .line 664
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    move-object p1, v0

    .line 668
    :cond_1
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 670
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 7079
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v4}, Landroid/support/v4/app/FragmentActivity;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v2}, Landroid/support/v4/app/FragmentActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 7080
    const-string v4, "FILTER_OPTIMIZATION"

    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 675
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, ".PhotoGrid_"

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    if-eqz v4, :cond_2

    const-string v0, ".png"

    :goto_0
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 679
    if-eqz v4, :cond_3

    .line 680
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v3, v0, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 695
    :goto_1
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 696
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 698
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    const/16 v6, 0x401

    iget-boolean v3, p0, Lcom/roidapp/imagelib/filter/aj;->E:Z

    if-eqz v3, :cond_4

    move v3, v2

    :goto_2
    if-eqz v4, :cond_5

    :goto_3
    invoke-static {v5, v6, v3, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 699
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 700
    iput-boolean v2, p0, Lcom/roidapp/imagelib/filter/aj;->x:Z

    .line 701
    :goto_4
    return-void

    .line 675
    :cond_2
    const-string v0, ".jpg"

    goto :goto_0

    .line 683
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    sget-object v5, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v3, v0, v5}, Lcom/roidapp/imagelib/b/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_1

    .line 686
    :catch_0
    move-exception v0

    .line 687
    :try_start_2
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 688
    invoke-direct {p0, v0, v3}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 695
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 696
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_4

    .line 690
    :catch_1
    move-exception v0

    .line 691
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 692
    invoke-direct {p0, v0, v3}, Lcom/roidapp/imagelib/filter/aj;->a(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 695
    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 696
    invoke-static {}, Ljava/lang/System;->gc()V

    goto :goto_4

    .line 695
    :catchall_0
    move-exception v0

    invoke-static {p1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;)V

    .line 696
    invoke-static {}, Ljava/lang/System;->gc()V

    throw v0

    :cond_4
    move v3, v1

    .line 698
    goto :goto_2

    :cond_5
    move v1, v2

    goto :goto_3
.end method

.method public final onResume()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x0

    .line 384
    invoke-super {p0}, Lcom/roidapp/imagelib/filter/n;->onResume()V

    .line 385
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 387
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->i()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 388
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v1, :cond_3

    .line 389
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v2, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;IILcom/roidapp/imagelib/b/b;)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/aj;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    .line 393
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/aj;->a(I)V

    .line 396
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    if-eqz v0, :cond_1

    .line 397
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->y:Lcom/roidapp/imagelib/filter/av;

    if-eqz v0, :cond_0

    .line 398
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->y:Lcom/roidapp/imagelib/filter/av;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/av;->a()V

    .line 400
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->s:Ljp/co/cyberagent/android/gpuimage/GPUImageView;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/gpuimage/GPUImageView;->onResume()V

    .line 6407
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    if-nez v0, :cond_4

    .line 6408
    :cond_2
    :goto_1
    return-void

    .line 391
    :cond_3
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/bi;->f()I

    move-result v1

    iget v2, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v4, p0, Lcom/roidapp/imagelib/filter/aj;->C:Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/bi;->g()Lcom/roidapp/imagelib/b/b;

    move-result-object v4

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/imagelib/filter/bi;->a(IIILcom/roidapp/imagelib/b/b;Z)Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/imagelib/filter/aj;->a(Ljp/co/cyberagent/android/gpuimage/GPUImageFilter;)V

    goto :goto_0

    .line 6423
    :cond_4
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v0

    if-nez v0, :cond_5

    .line 6410
    :goto_2
    if-eqz v5, :cond_2

    .line 6412
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->F:Lcom/roidapp/imagelib/filter/bg;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/bg;->b()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 6413
    if-eqz v0, :cond_2

    .line 6414
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_2

    .line 6415
    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 6416
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/aj;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 7041
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 6416
    if-nez v0, :cond_2

    .line 6417
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 6418
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->G:Lcom/roidapp/imagelib/filter/az;

    invoke-virtual {v0, v6}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 6419
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v0, v6}, Lcom/roidapp/imagelib/filter/aj;->a(Landroid/widget/FrameLayout;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_1

    .line 6424
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/aj;->I:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v5, v0, Lcom/roidapp/imagelib/filter/bg;

    goto :goto_2
.end method
