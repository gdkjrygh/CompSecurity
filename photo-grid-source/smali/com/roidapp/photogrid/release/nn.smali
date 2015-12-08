.class public final Lcom/roidapp/photogrid/release/nn;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:F

.field private c:F

.field private d:Landroid/widget/TextView;

.field private e:Ljava/lang/String;

.field private f:Z

.field private g:Landroid/widget/ImageView;

.field private h:Z

.field private i:Z

.field private j:I

.field private k:Z

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 35
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 44
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    .line 45
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->i:Z

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->k:Z

    .line 48
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->l:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/nn;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 35
    .line 1416
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1417
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1418
    const-string v2, "WATER_MARK"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1419
    const-string v0, "WATER_MARK"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 1423
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 35
    return-void

    .line 1421
    :cond_0
    const-string v0, "WATER_MARK"

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method

.method private a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 409
    const-string v1, "WATER_MARK"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/nn;)Z
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nn;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/nn;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/nn;)Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->l:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/nn;)V
    .locals 3

    .prologue
    .line 35
    .line 1492
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->k:Z

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/nn;->l:Z

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(ZZ)V

    .line 1493
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nn;->dismissAllowingStateLoss()V

    .line 35
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/nn;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/nn;)Z
    .locals 1

    .prologue
    .line 35
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/nn;)Z
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->k:Z

    return v0
.end method


# virtual methods
.method protected final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->d:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 472
    :cond_0
    return-void
.end method

.method public final a(ZZ)V
    .locals 0

    .prologue
    .line 51
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    .line 52
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/nn;->l:Z

    .line 53
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/nn;->i:Z

    .line 54
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 476
    const-string v0, "PhotoSaveDialog/onCancel"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 477
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->k:Z

    .line 478
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->k:Z

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/nn;->l:Z

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(ZZ)V

    .line 479
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 480
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 59
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nn;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    .line 60
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/nn;->f:Z

    .line 61
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_1

    .line 62
    const-string v0, "Grid"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    .line 79
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/nn;->j:I

    .line 80
    return-void

    .line 63
    :cond_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    .line 64
    const-string v0, "Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0

    .line 65
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 66
    const-string v0, "Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0

    .line 67
    :cond_3
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_4

    .line 68
    const-string v0, "Free"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0

    .line 69
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 70
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/nn;->f:Z

    .line 71
    const-string v0, "Wide"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0

    .line 72
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 73
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/nn;->f:Z

    .line 74
    const-string v0, "High"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0

    .line 75
    :cond_6
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 76
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/nn;->f:Z

    .line 77
    const-string v0, "Video"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->e:Ljava/lang/String;

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .prologue
    .line 84
    const-string v0, "PhotoSaveDialog/onCreateView"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 85
    const v0, 0x7f030120

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v11

    .line 1096
    const v0, 0x7f0d04a5

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    .line 1097
    const v0, 0x7f0d04a9

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 1099
    const v0, 0x7f0d04a1

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 1100
    const v0, 0x7f0d04a8

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/RelativeLayout;

    .line 1101
    const v0, 0x7f0d04ac

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 1105
    const/4 v6, 0x0

    .line 1107
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 1108
    const v0, 0x7f0d04a3

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1109
    const v1, 0x7f0d04a4

    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1110
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f07024e

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1111
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f07024c

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1122
    :cond_0
    :goto_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_6

    .line 1123
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1124
    const v0, 0x7f0d04ab

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1125
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1128
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1129
    const v0, 0x7f0d04af

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1155
    new-instance v1, Lcom/roidapp/photogrid/release/oa;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    const v0, 0x7f0d04a4

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    invoke-direct {v1, v3, v0, v2, v4}, Lcom/roidapp/photogrid/release/oa;-><init>(Landroid/content/Context;Landroid/widget/TextView;Landroid/view/View;Z)V

    .line 1156
    new-instance v0, Lcom/roidapp/photogrid/release/no;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/no;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1162
    new-instance v0, Lcom/roidapp/photogrid/release/ns;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/ns;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v8, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1237
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    if-eqz v0, :cond_1

    .line 1238
    const v0, 0x7f0d04b9

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 1239
    const v1, 0x7f0d03da

    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1240
    const v2, 0x7f0d020f

    invoke-virtual {v11, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 1241
    const v3, 0x7f0203ea

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1242
    const v0, 0x7f07021a

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1243
    const v0, 0x7f070228

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 1248
    :cond_1
    const v0, 0x7f0d04b2

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->d:Landroid/widget/TextView;

    .line 1249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1252
    const v0, 0x7f0d04b0

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 1254
    new-instance v1, Lcom/roidapp/photogrid/release/nz;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nz;-><init>(Lcom/roidapp/photogrid/release/nn;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1270
    const v1, 0x7f0d04b4

    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 1272
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    const-string v3, "com.cleanmaster.mguard"

    invoke-static {v2, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/nn;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_9

    .line 1274
    :cond_2
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1275
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 1276
    const v1, 0x7f0d04b3

    invoke-virtual {v11, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1277
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1278
    const/4 v2, -0x1

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1279
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1309
    :goto_2
    const v0, 0x7f0d04b8

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/nq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nq;-><init>(Lcom/roidapp/photogrid/release/nn;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1325
    const v0, 0x7f0d04a0

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/nn;->g:Landroid/widget/ImageView;

    .line 1326
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/photogrid/release/nr;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nr;-><init>(Lcom/roidapp/photogrid/release/nn;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    return-object v11

    .line 1113
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->f(Landroid/content/Context;)Z

    move-result v6

    .line 1114
    const v0, 0x7f0d04a4

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1115
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/nn;->f:Z

    if-nez v1, :cond_4

    .line 1116
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 1117
    :cond_4
    if-nez v6, :cond_5

    iget v1, p0, Lcom/roidapp/photogrid/release/nn;->j:I

    const/16 v3, 0x438

    if-lt v1, v3, :cond_0

    .line 1118
    :cond_5
    const/4 v6, 0x1

    .line 1119
    const v1, 0x7f070286

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_0

    .line 1170
    :cond_6
    const v0, 0x7f0d04ad

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1171
    const v1, 0x7f070221

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 1173
    new-instance v0, Lcom/roidapp/photogrid/release/oa;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/nn;->h:Z

    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/nn;->i:Z

    iget v5, p0, Lcom/roidapp/photogrid/release/nn;->j:I

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/oa;-><init>(Landroid/content/Context;Landroid/view/View;ZZIZ)V

    .line 1176
    new-instance v1, Lcom/roidapp/photogrid/release/oa;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-direct {v1, v3, v7}, Lcom/roidapp/photogrid/release/oa;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 1178
    new-instance v3, Lcom/roidapp/photogrid/release/nt;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/photogrid/release/nt;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1186
    new-instance v2, Lcom/roidapp/photogrid/release/nu;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/nu;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v7, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1194
    new-instance v2, Lcom/roidapp/photogrid/release/nv;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/nv;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v8, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1201
    new-instance v0, Lcom/roidapp/photogrid/release/nw;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/release/nw;-><init>(Lcom/roidapp/photogrid/release/nn;Lcom/roidapp/photogrid/release/oa;)V

    invoke-virtual {v9, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1211
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_7

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_8

    .line 1212
    :cond_7
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1213
    const v0, 0x7f0d04af

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_1

    .line 1215
    :cond_8
    const v0, 0x7f0d04ae

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 1216
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/nn;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1217
    new-instance v1, Lcom/roidapp/photogrid/release/nx;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/nx;-><init>(Lcom/roidapp/photogrid/release/nn;Landroid/widget/CheckBox;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1225
    new-instance v1, Lcom/roidapp/photogrid/release/ny;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/ny;-><init>(Lcom/roidapp/photogrid/release/nn;Landroid/widget/CheckBox;)V

    invoke-virtual {v10, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 1342
    :cond_9
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1343
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1344
    const-string v2, "SAVEPATH"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1345
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1346
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_a

    .line 1347
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 1351
    :cond_a
    const-string v2, "get_memory_error"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_d

    .line 1354
    const/4 v0, 0x1

    .line 1282
    :goto_3
    if-eqz v0, :cond_c

    .line 1364
    const/4 v0, 0x0

    .line 1365
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 1366
    const-string v3, "get_memory_error"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_b

    .line 1368
    const-string v3, "SAVEPATH"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1369
    if-eqz v3, :cond_b

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    .line 1370
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1371
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 1373
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v4, "get_memory_error"

    const/4 v5, 0x1

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1374
    new-instance v0, Landroid/os/StatFs;

    invoke-direct {v0, v3}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 1375
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v3

    int-to-long v4, v3

    .line 1376
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v3

    int-to-long v6, v3

    .line 1377
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v8, v0

    .line 1378
    mul-long/2addr v6, v4

    long-to-float v0, v6

    iput v0, p0, Lcom/roidapp/photogrid/release/nn;->b:F

    .line 1379
    mul-long/2addr v4, v8

    long-to-float v0, v4

    iput v0, p0, Lcom/roidapp/photogrid/release/nn;->c:F

    .line 1380
    const/4 v0, 0x1

    .line 1382
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "get_memory_error"

    const/4 v4, 0x2

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1283
    :cond_b
    if-eqz v0, :cond_c

    .line 1284
    new-instance v2, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    iget v3, p0, Lcom/roidapp/photogrid/release/nn;->b:F

    iget v4, p0, Lcom/roidapp/photogrid/release/nn;->c:F

    invoke-direct {v2, v0, v3, v4}, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;-><init>(Landroid/content/Context;FF)V

    .line 1285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nn;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41a00000    # 20.0f

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->a(I)V

    .line 1286
    const v0, 0x7f0d04b6

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 1287
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1289
    new-instance v2, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 1290
    const v0, 0x7f0d04b7

    invoke-virtual {v11, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 1291
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/roidapp/photogrid/release/nn;->b:F

    const/high16 v5, 0x4e800000

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/photogrid/release/nn;->c:F

    const/high16 v5, 0x4e800000

    div-float/2addr v4, v5

    float-to-double v4, v4

    invoke-virtual {v2, v4, v5}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "GB"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1296
    :cond_c
    new-instance v0, Lcom/roidapp/photogrid/release/np;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/np;-><init>(Lcom/roidapp/photogrid/release/nn;)V

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_2

    .line 1356
    :cond_d
    const/4 v0, 0x0

    goto/16 :goto_3
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 93
    return-void
.end method
