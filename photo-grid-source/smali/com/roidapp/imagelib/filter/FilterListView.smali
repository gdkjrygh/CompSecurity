.class public Lcom/roidapp/imagelib/filter/FilterListView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/hlistview/s;


# instance fields
.field private a:Lcom/roidapp/imagelib/filter/l;

.field private b:Lcom/roidapp/baselib/hlistview/HListView;

.field private c:I

.field private d:Landroid/widget/ImageView;

.field private e:Lcom/roidapp/imagelib/filter/ab;

.field private f:Lcom/roidapp/imagelib/filter/bj;

.field private g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/imagelib/filter/m;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/content/Context;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->c:I

    .line 43
    new-instance v0, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    .line 398
    const-string v0, "DefaultSelType"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 9

    .prologue
    const/4 v8, 0x3

    const/4 v7, 0x0

    const/4 v6, 0x4

    const/4 v5, 0x1

    const/4 v4, 0x2

    .line 59
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 40
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->c:I

    .line 43
    new-instance v0, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    .line 398
    const-string v0, "DefaultSelType"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    .line 60
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->i:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/FilterListView;->j:Ljava/lang/String;

    .line 1090
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    .line 1091
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1092
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/f;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 1093
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    sget v1, Lcom/roidapp/imagelib/g;->g:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setId(I)V

    .line 1094
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/imagelib/filter/d;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/d;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1101
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1103
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 1104
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1105
    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 1107
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1109
    new-instance v0, Lcom/roidapp/baselib/hlistview/HListView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->i:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    .line 1110
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 1111
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 1112
    sget v0, Lcom/roidapp/imagelib/g;->g:I

    invoke-virtual {v1, v5, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 1114
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1117
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/HListView;->a(Lcom/roidapp/baselib/hlistview/s;)V

    .line 1119
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    .line 1120
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1461
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v7, v3}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1462
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v4, v5}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1463
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v4, v4}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1464
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    const/16 v3, 0x8

    invoke-direct {v2, p0, v4, v3}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1465
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v6, v3}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1466
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v8, v8}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1467
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v5, v4}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1468
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v6, v5}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1469
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    new-instance v2, Lcom/roidapp/imagelib/filter/m;

    invoke-direct {v2, p0, v6, v6}, Lcom/roidapp/imagelib/filter/m;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;II)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1122
    new-instance v1, Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v0, v2, v7}, Lcom/roidapp/imagelib/filter/ab;-><init>(Ljava/util/List;Landroid/content/Context;Z)V

    iput-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    .line 1124
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 1125
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v7}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/graphics/drawable/Drawable;)V

    .line 1127
    new-instance v0, Lcom/roidapp/imagelib/filter/a;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/a;-><init>(Landroid/content/Context;)V

    .line 1128
    new-instance v1, Lcom/roidapp/imagelib/filter/e;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/filter/e;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/a;->a(Lcom/roidapp/imagelib/filter/c;)V

    .line 1156
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/a;->a()V

    .line 1160
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/d;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/FilterListView;->setBackgroundColor(I)V

    .line 63
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/filter/FilterListView;)Lcom/roidapp/imagelib/filter/ab;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    return-object v0
.end method

.method private a(I)V
    .locals 1

    .prologue
    .line 383
    const-string v0, "ManualSelType"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    .line 384
    invoke-direct {p0, p1}, Lcom/roidapp/imagelib/filter/FilterListView;->b(I)V

    .line 385
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, p1}, Lcom/roidapp/baselib/hlistview/HListView;->c(I)V

    .line 386
    return-void
.end method

.method private b(I)V
    .locals 4

    .prologue
    .line 409
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 410
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/ax;

    if-eqz v1, :cond_0

    if-gez p1, :cond_1

    .line 423
    :cond_0
    :goto_0
    return-void

    .line 412
    :cond_1
    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    .line 413
    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/ax;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 414
    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v2

    iget v3, v0, Lcom/roidapp/imagelib/filter/ax;->b:I

    if-eq v2, v3, :cond_0

    .line 416
    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v2

    iput v2, v0, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 417
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->notifyDataSetChanged()V

    .line 418
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 419
    sget-object v2, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 420
    if-eqz v2, :cond_2

    .line 421
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 422
    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    goto :goto_0
.end method

.method private b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 3

    .prologue
    .line 541
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/imagelib/filter/l;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 544
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    if-eqz v0, :cond_0

    .line 545
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v0

    .line 546
    invoke-interface {v0, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 547
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 548
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/roidapp/imagelib/filter/l;->a(ILjava/lang/String;)V

    .line 550
    :cond_0
    invoke-interface {p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 8426
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-ne v0, p1, :cond_2

    :cond_1
    :goto_0
    return-void

    .line 8427
    :cond_2
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    iput-object p1, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    goto :goto_0
.end method

.method private static c(I)I
    .locals 2

    .prologue
    .line 455
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 456
    invoke-virtual {v0, p0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v1, p0, 0x0

    add-int/lit8 v1, v1, 0x1

    rem-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x0

    return v0
.end method


# virtual methods
.method public final a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/view/View;I)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/baselib/hlistview/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 176
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 177
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/ab;

    if-eqz v1, :cond_4

    .line 2321
    invoke-virtual {p1, p3}, Lcom/roidapp/baselib/hlistview/AdapterView;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

    .line 2323
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_2

    .line 2324
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v3

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 3041
    invoke-static {v3, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 2324
    if-nez v1, :cond_1

    .line 2327
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 2329
    sget v2, Lcom/roidapp/imagelib/j;->m:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 2330
    sget v2, Lcom/roidapp/imagelib/j;->c:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 2331
    sget v2, Lcom/roidapp/imagelib/j;->a:I

    new-instance v3, Lcom/roidapp/imagelib/filter/i;

    invoke-direct {v3, p0}, Lcom/roidapp/imagelib/filter/i;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2340
    sget v2, Lcom/roidapp/imagelib/j;->d:I

    new-instance v3, Lcom/roidapp/imagelib/filter/j;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/imagelib/filter/j;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 2352
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 3392
    :cond_0
    :goto_0
    return-void

    .line 2355
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v3

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v3, v1}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 2362
    :cond_2
    new-instance v1, Lcom/roidapp/imagelib/filter/k;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, p0, v0, v3}, Lcom/roidapp/imagelib/filter/k;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    .line 2368
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v3

    .line 2370
    if-eqz v3, :cond_7

    .line 2371
    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v4

    iput v4, v1, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 2372
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->b()I

    move-result v0

    .line 2373
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    if-eqz v4, :cond_3

    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v3

    if-eqz v3, :cond_3

    .line 2374
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    invoke-interface {v3, v2}, Lcom/roidapp/imagelib/filter/l;->a(Z)V

    .line 2377
    :cond_3
    :goto_1
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v3, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 2378
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/hlistview/HListView;->i(I)V

    .line 2379
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 179
    :cond_4
    instance-of v0, v0, Lcom/roidapp/imagelib/filter/ax;

    if-eqz v0, :cond_0

    .line 3389
    const-string v0, "ManualSelType"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    .line 3390
    invoke-direct {p0, p3}, Lcom/roidapp/imagelib/filter/FilterListView;->b(I)V

    .line 3391
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->t()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-eq v0, p3, :cond_5

    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->t()I

    move-result v0

    if-ne v0, p3, :cond_6

    .line 3392
    :cond_5
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    add-int/lit8 v1, p3, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->c(I)V

    goto :goto_0

    .line 3394
    :cond_6
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->c(I)V

    goto :goto_0

    :cond_7
    move v0, v2

    goto :goto_1
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 284
    instance-of v0, p1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v0, :cond_0

    .line 285
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v0, p1

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 6041
    invoke-static {v2, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 285
    if-nez v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object p1, v0, v1

    .line 288
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v0, v0, v1

    const/4 v2, 0x7

    aget-object p2, v0, v2

    .line 292
    :cond_0
    new-instance v3, Lcom/roidapp/imagelib/filter/h;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v3, p0, p1, v0}, Lcom/roidapp/imagelib/filter/h;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    .line 298
    invoke-interface {p1, p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 299
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 302
    if-eqz v0, :cond_3

    .line 303
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v0

    iput v0, v3, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 304
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b()I

    move-result v0

    :goto_0
    move v2, v1

    .line 307
    :goto_1
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/ab;->getCount()I

    move-result v4

    if-ge v2, v4, :cond_2

    .line 308
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v4, v2}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v4

    .line 309
    iget-object v5, p0, Lcom/roidapp/imagelib/filter/FilterListView;->i:Landroid/content/Context;

    invoke-interface {v4, v5}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/roidapp/imagelib/filter/FilterListView;->i:Landroid/content/Context;

    invoke-interface {p1, v6}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 310
    invoke-interface {v4, p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 307
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 314
    :cond_2
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 315
    iget-object v2, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/hlistview/HListView;->i(I)V

    .line 316
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 317
    invoke-direct {p0, p1, p2}, Lcom/roidapp/imagelib/filter/FilterListView;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 318
    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;Z)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 194
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object p1, v0, v2

    .line 197
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 201
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/ab;

    if-nez v1, :cond_2

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/ax;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    if-eq v1, p1, :cond_3

    .line 202
    :cond_2
    new-instance v1, Lcom/roidapp/imagelib/filter/g;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, p0, p1, v0}, Lcom/roidapp/imagelib/filter/g;-><init>(Lcom/roidapp/imagelib/filter/FilterListView;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Landroid/content/Context;)V

    .line 208
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 209
    if-eqz v0, :cond_e

    .line 210
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 211
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b()I

    move-result v0

    .line 214
    :goto_0
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v3, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 215
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v3, v0}, Lcom/roidapp/baselib/hlistview/HListView;->i(I)V

    .line 216
    iget-object v3, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    move-object v3, v1

    .line 222
    :goto_1
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->e()I

    move-result v4

    .line 223
    const/4 v1, -0x1

    if-ne v4, v1, :cond_4

    .line 281
    :goto_2
    return-void

    .line 218
    :cond_3
    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    .line 219
    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b()I

    move-result v1

    move-object v3, v0

    move v0, v1

    goto :goto_1

    .line 227
    :cond_4
    if-eqz p3, :cond_8

    .line 228
    add-int/lit8 v0, v0, -0x1

    .line 229
    if-gez v0, :cond_d

    .line 230
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/ab;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)I

    move-result v0

    .line 231
    if-gtz v0, :cond_5

    .line 232
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/ab;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    .line 236
    :goto_3
    instance-of v0, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v0, :cond_7

    .line 237
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object v0, v1

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 4041
    invoke-static {v4, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 237
    if-nez v0, :cond_6

    .line 252
    :goto_4
    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/filter/FilterListView;->a(I)V

    goto :goto_2

    .line 234
    :cond_5
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    goto :goto_3

    .line 241
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v0, v1

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 248
    :cond_7
    invoke-virtual {v3, v1}, Lcom/roidapp/imagelib/filter/ax;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 249
    invoke-virtual {v3}, Lcom/roidapp/imagelib/filter/ax;->getCount()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    goto :goto_4

    .line 254
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 255
    if-lt v0, v4, :cond_c

    .line 256
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/ab;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)I

    move-result v0

    .line 257
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/ab;->getCount()I

    move-result v1

    .line 258
    add-int/lit8 v1, v1, -0x1

    if-lt v0, v1, :cond_9

    .line 259
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    .line 263
    :goto_5
    instance-of v0, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v0, :cond_b

    .line 264
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object v0, v1

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 5041
    invoke-static {v5, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 264
    if-nez v0, :cond_a

    .line 266
    add-int/lit8 v2, v4, -0x1

    .line 279
    :goto_6
    invoke-direct {p0, v2}, Lcom/roidapp/imagelib/filter/FilterListView;->a(I)V

    goto/16 :goto_2

    .line 261
    :cond_9
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/filter/ab;->a(I)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v1

    goto :goto_5

    .line 268
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object v0, v1

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 275
    :cond_b
    invoke-virtual {v3, v1}, Lcom/roidapp/imagelib/filter/ax;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_6

    :cond_c
    move v2, v0

    goto :goto_6

    :cond_d
    move v2, v0

    goto :goto_4

    :cond_e
    move v0, v2

    goto/16 :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/l;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    .line 165
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 168
    if-eqz p1, :cond_0

    .line 169
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/hlistview/HListView;->a(Lcom/roidapp/baselib/hlistview/s;)V

    .line 172
    :goto_0
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Lcom/roidapp/baselib/hlistview/s;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 186
    instance-of v0, v0, Lcom/roidapp/imagelib/filter/ab;

    if-eqz v0, :cond_0

    .line 187
    const/4 v0, 0x1

    .line 189
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 405
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 431
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    if-nez v0, :cond_1

    .line 445
    :cond_0
    :goto_0
    return-void

    .line 432
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 433
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/ax;

    if-eqz v1, :cond_0

    .line 434
    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 435
    if-eqz v0, :cond_0

    .line 436
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_0

    .line 437
    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 438
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 7041
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    .line 438
    if-nez v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    if-eqz v0, :cond_2

    .line 442
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v0, v0, v2

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->f:Lcom/roidapp/imagelib/filter/bj;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/bj;->a:[[Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    aget-object v1, v1, v2

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/imagelib/filter/FilterListView;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 444
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->d()V

    goto :goto_0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 448
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->a:Lcom/roidapp/imagelib/filter/l;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/roidapp/imagelib/filter/l;->a(Z)V

    .line 450
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->d:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/hlistview/HListView;->a(Landroid/widget/ListAdapter;)V

    .line 452
    return-void
.end method

.method public final e()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 474
    const-string v0, "ShuffleSelType"

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->k:Ljava/lang/String;

    .line 475
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->e:Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ab;->a()Ljava/util/List;

    move-result-object v4

    .line 476
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 477
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 478
    invoke-static {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->c(I)I

    move-result v1

    .line 479
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/m;

    .line 7072
    iget v2, v0, Lcom/roidapp/imagelib/filter/m;->a:I

    .line 7076
    iget v0, v0, Lcom/roidapp/imagelib/filter/m;->b:I

    .line 482
    iget-object v4, p0, Lcom/roidapp/imagelib/filter/FilterListView;->g:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    aget-object v2, v4, v2

    .line 483
    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->a(I)Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    .line 484
    sget-object v0, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eqz v0, :cond_0

    .line 485
    sget-object v0, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v0, v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 486
    :cond_0
    invoke-direct {p0, v2, v4}, Lcom/roidapp/imagelib/filter/FilterListView;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 487
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    .line 488
    instance-of v3, v0, Lcom/roidapp/imagelib/filter/ab;

    if-eqz v3, :cond_3

    .line 489
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 499
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/FilterListView;->h:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 538
    :cond_2
    :goto_1
    return-void

    .line 490
    :cond_3
    instance-of v3, v0, Lcom/roidapp/imagelib/filter/ax;

    if-eqz v3, :cond_1

    .line 491
    check-cast v0, Lcom/roidapp/imagelib/filter/ax;

    .line 492
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v3

    .line 493
    if-eq v3, v2, :cond_4

    .line 494
    invoke-virtual {v0, v2}, Lcom/roidapp/imagelib/filter/ax;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 496
    :cond_4
    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v2

    iput v2, v0, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 497
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ax;->notifyDataSetChanged()V

    goto :goto_0

    :cond_5
    move-object v2, v3

    .line 504
    :cond_6
    :goto_2
    if-nez v2, :cond_8

    .line 505
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    .line 506
    invoke-static {v0}, Lcom/roidapp/imagelib/filter/FilterListView;->c(I)I

    move-result v0

    .line 507
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

    .line 508
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_7

    .line 509
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 8041
    invoke-static {v5, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 509
    if-eqz v1, :cond_6

    .line 511
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/FilterListView;->getContext()Landroid/content/Context;

    move-result-object v5

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v5, v1}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 512
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->d()Ljava/util/List;

    move-result-object v1

    .line 513
    if-eqz v1, :cond_b

    :goto_3
    move-object v2, v0

    .line 515
    goto :goto_2

    :cond_7
    move-object v2, v0

    .line 517
    goto :goto_2

    .line 521
    :cond_8
    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->d()Ljava/util/List;

    move-result-object v0

    .line 522
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Lcom/roidapp/imagelib/filter/FilterListView;->c(I)I

    move-result v1

    .line 523
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 524
    sget-object v1, Lcom/roidapp/imagelib/a/h;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-interface {v1, v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 525
    invoke-direct {p0, v2, v0}, Lcom/roidapp/imagelib/filter/FilterListView;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 526
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/FilterListView;->b:Lcom/roidapp/baselib/hlistview/HListView;

    invoke-virtual {v1}, Lcom/roidapp/baselib/hlistview/HListView;->z()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Landroid/widget/BaseAdapter;

    .line 527
    instance-of v3, v1, Lcom/roidapp/imagelib/filter/ab;

    if-eqz v3, :cond_9

    .line 528
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto/16 :goto_1

    .line 529
    :cond_9
    instance-of v3, v1, Lcom/roidapp/imagelib/filter/ax;

    if-eqz v3, :cond_2

    .line 530
    check-cast v1, Lcom/roidapp/imagelib/filter/ax;

    .line 531
    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/ax;->a()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v3

    .line 532
    if-eq v3, v2, :cond_a

    .line 533
    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/filter/ax;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 535
    :cond_a
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v0

    iput v0, v1, Lcom/roidapp/imagelib/filter/ax;->b:I

    .line 536
    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/ax;->notifyDataSetChanged()V

    goto/16 :goto_1

    :cond_b
    move-object v0, v2

    goto :goto_3
.end method
