.class public final Lcom/roidapp/photogrid/a;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/support/v4/view/ViewPager;

.field private c:Lcom/roidapp/photogrid/d;

.field private d:Landroid/view/LayoutInflater;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Lcom/roidapp/photogrid/c;

.field private p:Lcom/roidapp/photogrid/k;

.field private q:Z

.field private r:Landroid/os/Handler;

.field private s:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/k;)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const v4, 0x3ec8590b

    .line 79
    invoke-virtual {p1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 55
    new-instance v0, Lcom/roidapp/photogrid/b;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/b;-><init>(Lcom/roidapp/photogrid/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    .line 200
    iput-boolean v5, p0, Lcom/roidapp/photogrid/a;->s:Z

    .line 80
    iput-object p1, p0, Lcom/roidapp/photogrid/a;->p:Lcom/roidapp/photogrid/k;

    .line 81
    invoke-virtual {p1}, Lcom/roidapp/photogrid/k;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    .line 82
    iget-object v1, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    .line 1160
    iput-object v1, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    .line 1161
    const-string v0, "layout_inflater"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->d:Landroid/view/LayoutInflater;

    .line 1162
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->d:Landroid/view/LayoutInflater;

    const v2, 0x7f030098

    const/4 v3, 0x1

    invoke-virtual {v0, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 1163
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v3, 0x2d0

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/a;->m:I

    .line 1164
    iget v0, p0, Lcom/roidapp/photogrid/a;->m:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/a;->n:I

    .line 1165
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/a;->k:I

    .line 1166
    iget v0, p0, Lcom/roidapp/photogrid/a;->k:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/a;->l:I

    .line 1167
    const v0, 0x7f0d026b

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->g:Landroid/widget/RelativeLayout;

    .line 1168
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->g:Landroid/widget/RelativeLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget v3, p0, Lcom/roidapp/photogrid/a;->k:I

    iget v4, p0, Lcom/roidapp/photogrid/a;->l:I

    invoke-direct {v1, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1169
    const v0, 0x7f0d026c

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    .line 1170
    const v0, 0x7f0d026d

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->e:Landroid/widget/LinearLayout;

    .line 1171
    new-instance v0, Lcom/roidapp/photogrid/d;

    invoke-direct {v0, p0, v5}, Lcom/roidapp/photogrid/d;-><init>(Lcom/roidapp/photogrid/a;B)V

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    .line 1172
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 1173
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 83
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->j:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/a;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method private b()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, -0x2

    const/4 v1, 0x0

    .line 113
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    if-nez v0, :cond_1

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 116
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 117
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x5

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/a;->i:I

    .line 118
    iget v0, p0, Lcom/roidapp/photogrid/a;->i:I

    if-eq v0, v7, :cond_0

    move v0, v1

    .line 120
    :goto_1
    iget v3, p0, Lcom/roidapp/photogrid/a;->i:I

    if-ge v0, v3, :cond_3

    .line 121
    new-instance v3, Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 122
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 125
    const/high16 v5, 0x41000000    # 8.0f

    mul-float/2addr v5, v2

    float-to-int v5, v5

    .line 126
    invoke-virtual {v4, v5, v1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 127
    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 128
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    sget v4, Lcom/roidapp/photogrid/common/az;->I:I

    if-ne v0, v4, :cond_2

    .line 130
    const v4, 0x7f020362

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 131
    iput-object v3, p0, Lcom/roidapp/photogrid/a;->f:Landroid/widget/ImageView;

    .line 135
    :goto_2
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setId(I)V

    .line 136
    iget-object v4, p0, Lcom/roidapp/photogrid/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 120
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 133
    :cond_2
    const v4, 0x7f020363

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 138
    :cond_3
    iput v1, p0, Lcom/roidapp/photogrid/a;->j:I

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/c;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/a;->j:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->i:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/a;->j:I

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->m:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->n:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/a;)Lcom/roidapp/photogrid/k;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->p:Lcom/roidapp/photogrid/k;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/a;)Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->d:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->k:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/a;)I
    .locals 1

    .prologue
    .line 31
    iget v0, p0, Lcom/roidapp/photogrid/a;->l:I

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 88
    iput-object v2, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    .line 89
    iput-object v2, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 92
    iput-object v2, p0, Lcom/roidapp/photogrid/a;->p:Lcom/roidapp/photogrid/k;

    .line 93
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/u;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 96
    iput-object p1, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/d;->a(Ljava/util/List;)V

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/d;->notifyDataSetChanged()V

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->I:I

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/a;->q:Z

    if-nez v0, :cond_1

    .line 103
    const-string v1, "SNS"

    const-string v2, "show"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/roidapp/photogrid/common/az;->I:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v3, Lcom/roidapp/photogrid/common/az;->I:I

    int-to-long v4, v3

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "show"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/roidapp/photogrid/common/az;->I:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget v4, Lcom/roidapp/photogrid/common/az;->I:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2, v3, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 106
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a;->q:Z

    .line 108
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/a;->b()V

    .line 2145
    sget v0, Lcom/roidapp/photogrid/common/az;->I:I

    iput v0, p0, Lcom/roidapp/photogrid/a;->j:I

    .line 2146
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->b:Landroid/support/v4/view/ViewPager;

    iget v1, p0, Lcom/roidapp/photogrid/a;->j:I

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 2151
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    if-nez v0, :cond_2

    .line 2152
    new-instance v0, Lcom/roidapp/photogrid/c;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/c;-><init>(Lcom/roidapp/photogrid/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    .line 2153
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    if-eqz v0, :cond_2

    .line 2154
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 110
    :cond_2
    return-void
.end method

.method public final onPageScrollStateChanged(I)V
    .locals 4

    .prologue
    .line 203
    packed-switch p1, :pswitch_data_0

    .line 220
    :cond_0
    :goto_0
    return-void

    .line 205
    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a;->s:Z

    .line 206
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 210
    :pswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/a;->s:Z

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->r:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/a;->o:Lcom/roidapp/photogrid/c;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 213
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/a;->s:Z

    goto :goto_0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    .prologue
    .line 179
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 6

    .prologue
    .line 183
    iput p1, p0, Lcom/roidapp/photogrid/a;->j:I

    .line 184
    iget v0, p0, Lcom/roidapp/photogrid/a;->j:I

    sput v0, Lcom/roidapp/photogrid/common/az;->I:I

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->c:Lcom/roidapp/photogrid/d;

    if-eqz v0, :cond_1

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->f:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->f:Landroid/widget/ImageView;

    const v1, 0x7f020363

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 190
    const v1, 0x7f020362

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 191
    iput-object v0, p0, Lcom/roidapp/photogrid/a;->f:Landroid/widget/ImageView;

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 194
    const-string v1, "SNS"

    const-string v2, "show"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    int-to-long v4, p1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v1, v2, v0}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    iget-object v1, p0, Lcom/roidapp/photogrid/a;->a:Landroid/content/Context;

    const-string v2, "SNS"

    const-string v3, "show"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v0, "Main/Banner/"

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/a;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/u;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/u;->a:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    int-to-long v4, p1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2, v3, v0, v4}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 198
    :cond_2
    return-void
.end method
