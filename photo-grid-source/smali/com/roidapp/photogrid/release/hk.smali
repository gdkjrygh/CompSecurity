.class public Lcom/roidapp/photogrid/release/hk;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/roidapp/photogrid/video/e;


# static fields
.field public static final a:Ljava/lang/String;


# instance fields
.field protected b:Lcom/roidapp/photogrid/release/ng;

.field protected c:Landroid/view/LayoutInflater;

.field protected d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field e:I

.field f:I

.field g:Z

.field private h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

.field private i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

.field private j:Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/roidapp/photogrid/release/hk;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 30
    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->c:Landroid/view/LayoutInflater;

    .line 33
    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 34
    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 35
    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->j:Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

    .line 272
    iput v1, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 273
    iput v1, p0, Lcom/roidapp/photogrid/release/hk;->f:I

    .line 312
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/hk;->g:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/hk;)I
    .locals 1

    .prologue
    .line 26
    iget v0, p0, Lcom/roidapp/photogrid/release/hk;->k:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    return-object v0
.end method


# virtual methods
.method public final a(II)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 277
    if-nez p2, :cond_1

    .line 310
    :cond_0
    :goto_0
    return-void

    .line 280
    :cond_1
    shl-int/lit8 v0, p1, 0xa

    div-int v2, v0, p2

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 283
    iget v0, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v0, :cond_2

    .line 284
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v3

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 288
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-lez v0, :cond_4

    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    iget v3, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    mul-int/2addr v3, v2

    shr-int/lit8 v3, v3, 0xa

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b(I)V

    .line 294
    iput v1, p0, Lcom/roidapp/photogrid/release/hk;->f:I

    .line 299
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a()I

    move-result v0

    if-nez v0, :cond_3

    .line 300
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v4

    if-le v0, v4, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v0

    :goto_2
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(I)V

    .line 304
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-eqz v0, :cond_0

    .line 306
    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/hk;->g:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    :goto_3
    invoke-virtual {v3, v2, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(IZ)V

    .line 307
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/hk;->g:Z

    if-eqz v0, :cond_0

    .line 308
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/hk;->g:Z

    goto :goto_0

    .line 296
    :cond_4
    iput v2, p0, Lcom/roidapp/photogrid/release/hk;->f:I

    goto :goto_1

    .line 300
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    goto :goto_2

    :cond_6
    move v0, v1

    .line 306
    goto :goto_3
.end method

.method public final a(ZZ)V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 316
    if-eqz p2, :cond_3

    .line 317
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    if-eqz v2, :cond_0

    .line 318
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    const/16 v3, 0x400

    invoke-virtual {v2, v3, v1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(IZ)V

    .line 321
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v2, :cond_2

    .line 322
    iget v2, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v2, :cond_1

    .line 323
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 325
    :cond_1
    iget v2, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-lez v2, :cond_2

    .line 326
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    iget v3, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b(I)V

    .line 328
    :cond_2
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/hk;->g:Z

    .line 332
    :cond_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v2, :cond_4

    .line 333
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-nez p1, :cond_5

    :goto_0
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Z)V

    .line 335
    :cond_4
    return-void

    :cond_5
    move v0, v1

    .line 333
    goto :goto_0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 47
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 48
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090051

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/hk;->k:I

    .line 49
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const v3, 0x7f0300c8

    const/4 v2, 0x0

    .line 71
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 74
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-nez v0, :cond_0

    .line 75
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    sget-object v1, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 76
    invoke-virtual {p1, v3, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 241
    :goto_0
    return-object v0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    .line 79
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hk;->c:Landroid/view/LayoutInflater;

    .line 81
    invoke-virtual {p1, v3, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 84
    const v0, 0x7f0d0066

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/hl;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hl;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Landroid/widget/BaseAdapter;)V

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/hm;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hm;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/hn;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hn;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Lcom/roidapp/photogrid/release/hs;)V

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/ho;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ho;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Lcom/roidapp/photogrid/release/hr;)V

    .line 196
    const v0, 0x7f0d0333

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->j:Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

    .line 198
    const v0, 0x7f0d0334

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    .line 200
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v3

    if-le v0, v3, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v0

    :goto_1
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(I)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/hp;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hp;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(Lcom/roidapp/photogrid/release/hr;)V

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->j:Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a(Lcom/roidapp/photogrid/video/ScrollImageViewEx;)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->j:Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;

    new-instance v2, Lcom/roidapp/photogrid/release/hq;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hq;-><init>(Lcom/roidapp/photogrid/release/hk;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/HorizontalProgressViewEx;->a(Lcom/roidapp/photogrid/release/hs;)V

    .line 234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/video/e;)V

    :cond_1
    :goto_2
    move-object v0, v1

    .line 241
    goto/16 :goto_0

    .line 200
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method public onDestroyView()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 53
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 55
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/photogrid/video/e;)V

    .line 57
    iput-object v1, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    .line 60
    :cond_0
    iput-object v1, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v0, :cond_1

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b()V

    .line 64
    iput-object v1, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 66
    :cond_1
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 248
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hk;->d:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_0

    .line 269
    :goto_0
    return-void

    .line 253
    :cond_0
    shl-int/lit8 v1, p3, 0xa

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v2, v2

    div-int/2addr v1, v2

    .line 255
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 257
    iget v2, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-lez v2, :cond_1

    .line 258
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->h:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    iget v3, p0, Lcom/roidapp/photogrid/release/hk;->e:I

    mul-int/2addr v3, v1

    shr-int/lit8 v3, v3, 0xa

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->smoothScrollTo(II)V

    .line 261
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hk;->i:Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->getVisibility()I

    move-result v3

    if-nez v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {v2, v1, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(IZ)V

    .line 264
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, p3}, Lcom/roidapp/photogrid/release/ng;->k(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 269
    :catch_0
    move-exception v0

    goto :goto_0
.end method
