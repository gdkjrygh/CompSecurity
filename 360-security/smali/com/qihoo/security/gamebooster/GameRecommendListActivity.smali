.class public Lcom/qihoo/security/gamebooster/GameRecommendListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/qihoo/security/gamebooster/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo/security/app/BaseActivity;",
        "Landroid/widget/AdapterView$OnItemClickListener;",
        "Lcom/qihoo/security/gamebooster/h",
        "<",
        "Lcom/qihoo/security/gamebooster/g;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/gamebooster/f;

.field private B:Landroid/view/LayoutInflater;

.field private C:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

.field private D:Landroid/widget/TextView;

.field private E:Ljava/lang/String;

.field private F:Landroid/graphics/Bitmap;

.field private G:Landroid/view/View;

.field private H:Landroid/view/View;

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private J:Z

.field private K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/adv/d;",
            ">;"
        }
    .end annotation
.end field

.field private M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/ui/result/AdvData;",
            ">;"
        }
    .end annotation
.end field

.field private N:Lcom/qihoo/security/adv/a/a;

.field private O:Z

.field private P:Landroid/view/View;

.field private Q:Z

.field private final y:Ljava/lang/String;

.field private z:Landroid/widget/ListView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 46
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->y:Ljava/lang/String;

    .line 60
    iput-boolean v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->J:Z

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    .line 73
    iput-boolean v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->Q:Z

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->J:Z

    return v0
.end method

.method static synthetic a(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;Z)Z
    .locals 0

    .prologue
    .line 46
    iput-boolean p1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->Q:Z

    return p1
.end method

.method static synthetic b(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)Z
    .locals 1

    .prologue
    .line 46
    iget-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->O:Z

    return v0
.end method

.method private o()V
    .locals 2

    .prologue
    .line 93
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    .line 94
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/pm/PackageManager;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 95
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/b;->e()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    .line 96
    if-lez v0, :cond_0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->E:Ljava/lang/String;

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->C:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->E:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    return-void

    .line 96
    :cond_0
    const-string/jumbo v0, "0"

    goto :goto_0
.end method

.method private p()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 102
    const v0, 0x7f0b0146

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    .line 103
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->B:Landroid/view/LayoutInflater;

    const v1, 0x7f030066

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->G:Landroid/view/View;

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->B:Landroid/view/LayoutInflater;

    const v1, 0x7f030067

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->H:Landroid/view/View;

    .line 105
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->G:Landroid/view/View;

    const v1, 0x7f0b0148

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->C:Lcom/qihoo/security/widget/ImageView/RemoteImageView;

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->G:Landroid/view/View;

    const v1, 0x7f0b0149

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->D:Landroid/widget/TextView;

    .line 108
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->G:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->H:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;)V

    .line 110
    new-instance v0, Lcom/qihoo/security/gamebooster/f;

    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/gamebooster/f;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    .line 111
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 112
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 113
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->G:Landroid/view/View;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$1;-><init>(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->z:Landroid/widget/ListView;

    new-instance v1, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$2;-><init>(Lcom/qihoo/security/gamebooster/GameRecommendListActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 149
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 249
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->J:Z

    .line 250
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 251
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    .line 253
    :cond_0
    invoke-virtual {p1}, Lcom/qihoo/security/gamebooster/g;->c()Ljava/util/List;

    move-result-object v0

    .line 254
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 261
    :cond_1
    return-void

    .line 257
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 258
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/gamebooster/LocalGamePkg;

    .line 259
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/LocalGamePkg;->getPkgName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 46
    check-cast p1, Lcom/qihoo/security/gamebooster/g;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->a(Lcom/qihoo/security/gamebooster/g;Ljava/lang/Object;)V

    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 199
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 200
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c008f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->b(Ljava/lang/String;)V

    .line 203
    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 161
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onBackPressed()V

    .line 162
    const v0, 0x7f040006

    const v1, 0x7f040008

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->overridePendingTransition(II)V

    .line 163
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 77
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 78
    const v0, 0x7f030065

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->setContentView(I)V

    .line 79
    const v0, 0x7f0b0147

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->P:Landroid/view/View;

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->P:Landroid/view/View;

    const v1, 0x7f0b0079

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ProgressCircleView;

    .line 81
    const v1, 0x7f02003d

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ProgressCircleView;->setProgressBackground(I)V

    .line 82
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->B:Landroid/view/LayoutInflater;

    .line 83
    invoke-virtual {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string/jumbo v1, "from_gameboost"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->O:Z

    .line 84
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->p()V

    .line 85
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->o()V

    .line 87
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->register(Ljava/lang/Object;)V

    .line 88
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->N:Lcom/qihoo/security/adv/a/a;

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->N:Lcom/qihoo/security/adv/a/a;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 90
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 167
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 169
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    if-eqz v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 171
    iget v2, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    if-nez v2, :cond_0

    .line 172
    iget-object v0, v0, Lcom/qihoo/security/ui/result/AdvData;->nativeAd:Lcom/facebook/ads/NativeAd;

    invoke-virtual {v0}, Lcom/facebook/ads/NativeAd;->n()V

    goto :goto_0

    .line 175
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 179
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    if-eqz v0, :cond_3

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    iget-boolean v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->Q:Z

    invoke-virtual {v0, v1}, Lcom/qihoo/security/gamebooster/f;->a(Z)V

    .line 181
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/f;->a()V

    .line 184
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 186
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->F:Landroid/graphics/Bitmap;

    .line 189
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 193
    :cond_5
    invoke-static {}, Lde/greenrobot/event/EventBus;->getDefault()Lde/greenrobot/event/EventBus;

    move-result-object v0

    invoke-virtual {v0, p0}, Lde/greenrobot/event/EventBus;->unregister(Ljava/lang/Object;)V

    .line 195
    return-void
.end method

.method public onEventMainThread(Lcom/qihoo/security/f/a;)V
    .locals 3

    .prologue
    .line 267
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->P:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    sget-object v0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;->a:[I

    iget-object v1, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 282
    :cond_0
    :goto_0
    return-void

    .line 270
    :pswitch_0
    iget-object v0, p1, Lcom/qihoo/security/f/a;->b:Ljava/util/List;

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->K:Ljava/util/List;

    .line 271
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->N:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->d(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    .line 272
    iget-object v0, p1, Lcom/qihoo/security/f/a;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 273
    if-eqz v0, :cond_0

    .line 274
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 275
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 276
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/f;->notifyDataSetChanged()V

    goto :goto_0

    .line 268
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onEventMainThread(Lcom/qihoo/security/f/b;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 288
    sget-object v0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity$3;->a:[I

    iget-object v1, p1, Lcom/qihoo/security/f/b;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v1}, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 316
    :cond_0
    :goto_0
    return-void

    .line 290
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->N:Lcom/qihoo/security/adv/a/a;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->K:Ljava/util/List;

    iget-object v2, p1, Lcom/qihoo/security/f/b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/adv/a/a;->a(Ljava/util/List;Ljava/lang/String;)I

    move-result v1

    .line 291
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz v1, :cond_0

    .line 292
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->K:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/adv/d;

    .line 293
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->N:Lcom/qihoo/security/adv/a/a;

    iget-object v3, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    invoke-virtual {v2, v0, v3}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/d;Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 294
    invoke-virtual {v0, v4}, Lcom/qihoo/security/adv/d;->a(I)V

    .line 295
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v1, :cond_1

    .line 296
    iget-object v2, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    invoke-interface {v2, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 300
    :goto_1
    iget-object v0, p1, Lcom/qihoo/security/f/b;->a:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    invoke-static {v0, v1, v4}, Lcom/qihoo/security/ui/result/f;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v0

    .line 301
    if-eqz v0, :cond_0

    .line 302
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 303
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 304
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->A:Lcom/qihoo/security/gamebooster/f;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/f;->notifyDataSetChanged()V

    goto :goto_0

    .line 298
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->L:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 288
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
    .line 207
    add-int/lit8 v0, p3, -0x2

    if-gez v0, :cond_0

    .line 245
    :goto_0
    return-void

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->M:Ljava/util/List;

    add-int/lit8 v1, p3, -0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/ui/result/AdvData;

    .line 212
    iget v1, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    .line 219
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 220
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    invoke-static {}, Lcom/qihoo/security/adv/AdvDataManager;->a()Lcom/qihoo/security/adv/AdvDataManager;

    move-result-object v3

    sget-object v4, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->Click:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    invoke-virtual {v3, v4, v2}, Lcom/qihoo/security/adv/AdvDataManager;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;)V

    .line 222
    sget-object v2, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->GameBoosterAddRecmdAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    iget v3, v0, Lcom/qihoo/security/ui/result/AdvData;->type:I

    invoke-static {v2, v3}, Lcom/qihoo/security/adv/a/c;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;I)V

    .line 223
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 230
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/View;->performClick()Z

    goto :goto_0

    .line 235
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->p:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 236
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/result/a;->a(Lcom/qihoo/security/ui/result/AdvData;)V

    goto :goto_0

    .line 238
    :cond_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c00c4

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 153
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onResume()V

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->J:Z

    .line 155
    invoke-direct {p0}, Lcom/qihoo/security/gamebooster/GameRecommendListActivity;->o()V

    .line 156
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/qihoo/security/gamebooster/b;->a(Lcom/qihoo/security/gamebooster/h;)V

    .line 157
    return-void
.end method
