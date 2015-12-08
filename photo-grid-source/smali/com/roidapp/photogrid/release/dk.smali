.class public final Lcom/roidapp/photogrid/release/dk;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private b:I

.field private c:Lcom/roidapp/photogrid/release/ng;

.field private d:Z

.field private e:Landroid/view/View;

.field private f:F

.field private g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

.field private h:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/roidapp/photogrid/release/eh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 59
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    .line 66
    const v0, -0x41666666    # -0.3f

    iput v0, p0, Lcom/roidapp/photogrid/release/dk;->f:F

    .line 68
    iput-object v1, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 90
    iput-object v1, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/dk;I)I
    .locals 0

    .prologue
    .line 56
    iput p1, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/dk;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    return-object v0
.end method

.method private a(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 510
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-nez v0, :cond_0

    .line 511
    const/4 v0, 0x0

    .line 513
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/dk;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    return-object p1
.end method

.method private a(IZ)V
    .locals 6

    .prologue
    .line 518
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    if-nez v0, :cond_1

    .line 560
    :cond_0
    :goto_0
    return-void

    .line 521
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/eh;

    .line 522
    if-eqz v0, :cond_0

    .line 525
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0d031b

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 526
    if-eqz v1, :cond_0

    .line 530
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget v0, v0, Lcom/roidapp/photogrid/release/eh;->c:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 532
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0d031c

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 534
    if-eqz p2, :cond_3

    .line 535
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 536
    if-eqz v2, :cond_2

    .line 537
    const/16 v3, 0x32

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 538
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 541
    :cond_2
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 542
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 560
    :catch_0
    move-exception v0

    goto :goto_0

    .line 545
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00bf

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 546
    if-eqz v2, :cond_4

    .line 547
    const/16 v3, 0xff

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 548
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 551
    :cond_4
    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 552
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 9

    .prologue
    .line 1005
    :try_start_0
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 1006
    const-string v0, "event_video_show"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1007
    invoke-static {p1}, Lcom/roidapp/cloudlib/ads/d;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/ads/d;

    move-result-object v2

    .line 1008
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/ads/d;->a()Ljava/util/List;

    move-result-object v4

    .line 1009
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1010
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    if-ltz v1, :cond_0

    .line 1011
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1012
    const-string v5, "video"

    invoke-virtual {v0, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {p1}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v5

    const-string v6, "event"

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v0, v7}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1013
    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/ads/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1014
    if-eqz v5, :cond_1

    .line 1015
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030097

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 1016
    const v0, 0x7f0d010a

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    .line 1017
    const v1, 0x7f0d0269

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 1018
    const v2, 0x7f0d026a

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    .line 1019
    new-instance v6, Landroid/app/AlertDialog$Builder;

    invoke-direct {v6, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v6}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v6

    .line 1020
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "file://"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1021
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 1022
    sget-object v5, Landroid/webkit/WebSettings$LayoutAlgorithm;->SINGLE_COLUMN:Landroid/webkit/WebSettings$LayoutAlgorithm;

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 1023
    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 1024
    const/4 v5, 0x1

    invoke-virtual {v0, v5}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 1026
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1027
    new-instance v0, Lcom/roidapp/photogrid/release/dy;

    invoke-direct {v0, p0, v6}, Lcom/roidapp/photogrid/release/dy;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1033
    invoke-virtual {v6}, Landroid/app/AlertDialog;->show()V

    .line 1034
    invoke-virtual {v6}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    .line 1037
    invoke-virtual {v6}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 1038
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09005d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 1039
    invoke-virtual {v6}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1040
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "event_video_show"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1050
    :cond_0
    :goto_1
    return-void

    .line 1010
    :cond_1
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto/16 :goto_0

    .line 1048
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/dk;Z)Z
    .locals 0

    .prologue
    .line 56
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/dk;->d:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/dk;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/dk;)I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/dk;I)V
    .locals 4

    .prologue
    .line 9136
    const-string v0, ""

    .line 9137
    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 9138
    sget-object v1, Lcom/roidapp/photogrid/release/dz;->a:[I

    invoke-static {}, Lcom/roidapp/photogrid/release/ei;->a()[I

    move-result-object v2

    iget v3, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    aget v2, v2, v3

    add-int/lit8 v2, v2, -0x1

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 9158
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgListSub"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9159
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgListSub"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 9162
    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 56
    return-void

    .line 9140
    :pswitch_0
    const-string v0, "fragmentEditVideoPopupMusic"

    goto :goto_0

    .line 9143
    :pswitch_1
    const-string v0, "fragmentEditVideoPopupTime"

    goto :goto_0

    .line 9146
    :pswitch_2
    sget-object v0, Lcom/roidapp/photogrid/release/ht;->b:Ljava/lang/String;

    goto :goto_0

    .line 9149
    :pswitch_3
    const-string v0, "FragmentBgList"

    goto :goto_0

    .line 9152
    :pswitch_4
    const-string v0, "FragmentBorder"

    goto :goto_0

    .line 9155
    :pswitch_5
    const-string v0, "FragmentEditVideoFilter"

    goto :goto_0

    .line 9160
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgColor"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9161
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-string v2, "FragmentBgColor"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    goto :goto_1

    .line 9138
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/dk;)Landroid/view/View;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    return-object v0
.end method

.method private d()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 494
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v2, :cond_1

    .line 495
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    if-le v2, v0, :cond_0

    .line 497
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 495
    goto :goto_0

    :cond_1
    move v0, v1

    .line 497
    goto :goto_0
.end method

.method private e()Z
    .locals 1

    .prologue
    .line 502
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 505
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/dk;)Z
    .locals 1

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/release/ng;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    return-object v0
.end method

.method private f()V
    .locals 8

    .prologue
    const/16 v7, 0x9

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 786
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 788
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 789
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 790
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ng;->p()I

    move-result v5

    .line 791
    if-eqz v4, :cond_0

    if-ltz v5, :cond_0

    array-length v0, v4

    if-le v5, v0, :cond_1

    .line 811
    :cond_0
    :goto_0
    return-void

    .line 794
    :cond_1
    aget-object v6, v4, v5

    .line 796
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->a(F)V

    .line 797
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 798
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 799
    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 800
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 801
    iput v5, v6, Lcom/roidapp/photogrid/release/ig;->h:I

    .line 805
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    iput-boolean v0, v6, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    new-array v4, v1, [Lcom/roidapp/photogrid/release/ig;

    aput-object v6, v4, v2

    .line 7238
    iput-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 807
    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 808
    new-array v0, v1, [Lcom/roidapp/photogrid/release/ig;

    aput-object v6, v0, v2

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 809
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(I)V

    .line 810
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v7, v2, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    goto :goto_0

    .line 796
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ng;->q()F

    move-result v0

    goto :goto_1

    :cond_3
    move v0, v2

    .line 805
    goto :goto_2
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/dk;)V
    .locals 5

    .prologue
    .line 56
    .line 8740
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 8741
    const-string v0, "video_single_edit_tip"

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8742
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ed

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 8743
    if-eqz v3, :cond_0

    .line 8744
    const v0, 0x7f0d03c1

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 8745
    const v1, 0x7f0d03bf

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 8746
    const v4, 0x7f07031a

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 8747
    const v1, 0x7f0d03c0

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v4, Lcom/roidapp/photogrid/release/dq;

    invoke-direct {v4, p0, v0}, Lcom/roidapp/photogrid/release/dq;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8753
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v4, 0x1080027

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v4, 0x7f0702e7

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v3, 0x7f07016b

    new-instance v4, Lcom/roidapp/photogrid/release/ds;

    invoke-direct {v4, p0, v0, v2}, Lcom/roidapp/photogrid/release/ds;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;)V

    invoke-virtual {v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07016a

    new-instance v2, Lcom/roidapp/photogrid/release/dr;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/dr;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 8780
    :cond_0
    :goto_0
    return-void

    .line 8781
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->f()V

    goto :goto_0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/dk;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->f()V

    return-void
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/dk;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 56
    .line 9819
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 9820
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030133

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 9823
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v1, :cond_0

    .line 9824
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 9825
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 9826
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v3, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    .line 9829
    :cond_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0701c3

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/dt;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/dt;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 9844
    const v2, 0x7f0d04de

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/release/du;

    invoke-direct {v3, p0, v1}, Lcom/roidapp/photogrid/release/du;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9856
    const v2, 0x7f0d04df

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/dv;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/dv;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9876
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 56
    return-void
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/dk;)V
    .locals 12

    .prologue
    const/4 v2, 0x0

    const/16 v11, 0xc

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 56
    .line 10574
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10578
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f030137

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 10579
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f030138

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 10580
    const v0, 0x7f0d04ed

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 10581
    const v1, 0x7f0d04ee

    invoke-virtual {v5, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 10582
    const v2, 0x7f0d04eb

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 10583
    const v3, 0x7f0d04ec

    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    .line 10584
    iget-object v6, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v6}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "show_sign"

    invoke-interface {v6, v7, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    .line 10585
    invoke-static {}, Lcom/roidapp/baselib/c/n;->f()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 10586
    iget-object v7, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v8, 0x1030117

    invoke-virtual {v0, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 10591
    :goto_0
    invoke-virtual {v3, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 10592
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v7, "sign_text"

    const-string v8, ""

    invoke-interface {v0, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 10593
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    :goto_1
    sget-object v7, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v2, v0, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    .line 10594
    if-eqz v6, :cond_4

    .line 10595
    invoke-virtual {v2, v10}, Landroid/widget/EditText;->setCursorVisible(Z)V

    .line 10596
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10597
    const-string v6, "Directed by "

    invoke-virtual {v0, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-le v6, v11, :cond_0

    .line 10598
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v2, v11, v0}, Landroid/widget/EditText;->setSelection(II)V

    .line 10601
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0, v10}, Ljava/util/Timer;-><init>(Z)V

    .line 10602
    new-instance v6, Lcom/roidapp/photogrid/release/ec;

    invoke-direct {v6, p0, v2}, Lcom/roidapp/photogrid/release/ec;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/EditText;)V

    const-wide/16 v8, 0x12c

    invoke-virtual {v0, v6, v8, v9}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 10617
    :goto_2
    new-instance v0, Lcom/roidapp/photogrid/release/ed;

    invoke-direct {v0, p0, v3, v2}, Lcom/roidapp/photogrid/release/ed;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/widget/EditText;)V

    invoke-virtual {v3, v0}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10637
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v0, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v4, 0x7f07010f

    new-instance v5, Lcom/roidapp/photogrid/release/ef;

    invoke-direct {v5, p0, v3, v2}, Lcom/roidapp/photogrid/release/ef;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/CheckBox;Landroid/widget/EditText;)V

    invoke-virtual {v0, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f070049

    new-instance v4, Lcom/roidapp/photogrid/release/ee;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/ee;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 10662
    new-instance v3, Lcom/roidapp/photogrid/release/eg;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/eg;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 10670
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 10672
    new-instance v3, Lcom/roidapp/photogrid/release/dm;

    invoke-direct {v3, p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/dm;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/widget/TextView;Landroid/app/AlertDialog;Landroid/widget/EditText;)V

    .line 10694
    invoke-virtual {v2, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 10695
    invoke-virtual {v2}, Landroid/widget/EditText;->getEditableText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    rsub-int v0, v0, 0x8c

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :cond_1
    return-void

    .line 10588
    :cond_2
    iget-object v7, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v8, 0x1030041

    invoke-virtual {v0, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    goto/16 :goto_0

    .line 10593
    :cond_3
    const-string v0, "Directed by your name"

    goto/16 :goto_1

    .line 10614
    :cond_4
    invoke-virtual {v2, v9}, Landroid/widget/EditText;->setEnabled(Z)V

    goto :goto_2
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/dk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/dk;)V
    .locals 3

    .prologue
    .line 56
    .line 10881
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10892
    :cond_0
    :goto_0
    return-void

    .line 10885
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 10886
    const-string v1, "audio/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 10888
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0xaa04

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 10891
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/dk;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 56
    .line 11814
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 11815
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const-class v2, Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 11816
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0xaa04

    invoke-virtual {v1, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 56
    return-void
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/dk;)Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dk;->d:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/dk;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 56
    .line 12699
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030132

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 12700
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0300e9

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 12702
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701ca

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/roidapp/photogrid/release/do;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/do;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/dn;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/dn;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 12726
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v2

    .line 12727
    const v0, 0x7f0d03b0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 12728
    if-eqz v0, :cond_0

    .line 12729
    new-instance v1, Lcom/roidapp/photogrid/release/dp;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/photogrid/release/dp;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 565
    sget v0, Lcom/roidapp/photogrid/release/ei;->h:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 566
    sget v0, Lcom/roidapp/photogrid/release/ei;->i:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 567
    sget v0, Lcom/roidapp/photogrid/release/ei;->g:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 568
    sget v0, Lcom/roidapp/photogrid/release/ei;->j:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v3

    invoke-direct {p0, v0, v3}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 569
    sget v3, Lcom/roidapp/photogrid/release/ei;->d:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v2

    :goto_0
    invoke-direct {p0, v3, v0}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 570
    sget v0, Lcom/roidapp/photogrid/release/ei;->a:I

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/dk;->d()Z

    move-result v3

    if-nez v3, :cond_2

    :goto_1
    invoke-direct {p0, v0, v2}, Lcom/roidapp/photogrid/release/dk;->a(IZ)V

    .line 571
    return-void

    :cond_1
    move v0, v1

    .line 569
    goto :goto_0

    :cond_2
    move v2, v1

    .line 570
    goto :goto_1
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 102
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    sget v1, Lcom/roidapp/photogrid/release/ei;->b:I

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 103
    sget v0, Lcom/roidapp/photogrid/release/ei;->b:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    .line 105
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 107
    if-eqz p1, :cond_2

    .line 108
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    .line 115
    :cond_1
    :goto_0
    return-void

    .line 110
    :cond_2
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 113
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final b()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 905
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 906
    const-string v3, "FragmentBgListSub"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "FragmentBgColor"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 907
    :cond_0
    new-instance v2, Lcom/roidapp/photogrid/release/by;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/by;-><init>()V

    .line 908
    invoke-virtual {v2, v0, v1, v1}, Lcom/roidapp/photogrid/release/by;->a(ZZI)V

    .line 909
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v3, 0x7f0d03ec

    const-string v4, "FragmentBgList"

    invoke-virtual {v1, v3, v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 920
    :cond_1
    :goto_0
    return v0

    .line 911
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 912
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 913
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    .line 914
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    if-eqz v2, :cond_1

    .line 915
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 920
    goto :goto_0
.end method

.method public final c()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 925
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->isAdded()Z

    move-result v0

    if-nez v0, :cond_1

    .line 7950
    :cond_0
    :goto_0
    return-void

    .line 926
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 927
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 928
    const-string v2, "video_new_preview"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 929
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "video_new_preview"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 930
    sget v0, Lcom/roidapp/photogrid/release/ei;->b:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v1

    .line 931
    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    .line 932
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ng;->t()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 933
    if-eqz v0, :cond_0

    .line 7941
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->isAdded()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7942
    new-instance v2, Landroid/app/Dialog;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    const v4, 0x7f0b001d

    invoke-direct {v2, v3, v4}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 7944
    const v3, 0x7f0300f5

    :try_start_0
    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 7952
    const v3, 0x7f0d0279

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    new-instance v4, Lcom/roidapp/photogrid/release/dx;

    invoke-direct {v4, p0, v2}, Lcom/roidapp/photogrid/release/dx;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/app/Dialog;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7959
    const v3, 0x7f0d03d4

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 7960
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 7961
    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7962
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 7964
    const v0, 0x7f0d03d6

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7965
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 7967
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    .line 7968
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    .line 7969
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 7970
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 7972
    const v0, 0x7f0d03d7

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7973
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 7975
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 7977
    const v0, 0x7f0d03d8

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7978
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7979
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7981
    const v0, 0x7f0d03ce

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7982
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7983
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    div-int/lit8 v4, v4, 0xa

    .line 7984
    add-int/2addr v1, v4

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7986
    const v0, 0x7f0d03cf

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7987
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7988
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit8 v5, v4, 0x2

    sub-int/2addr v1, v5

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7990
    const v0, 0x7f0d03d0

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7991
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7992
    mul-int/lit8 v1, v4, 0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7994
    const v0, 0x7f0d03d1

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 7995
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 7996
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/lit8 v3, v4, 0x2

    sub-int/2addr v1, v3

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7998
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    goto/16 :goto_0

    .line 7946
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_0

    .line 7949
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 936
    :cond_2
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/dk;->a(Landroid/content/Context;)V

    goto/16 :goto_0
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 899
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 902
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 94
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->c:Lcom/roidapp/photogrid/release/ng;

    .line 96
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 97
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    .line 120
    const v0, 0x7f0300c1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 6166
    invoke-virtual {v6}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/dl;

    invoke-direct {v1, p0, v6}, Lcom/roidapp/photogrid/release/dl;-><init>(Lcom/roidapp/photogrid/release/dk;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 6179
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020361

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 6180
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020367

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 6182
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v7

    .line 6184
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    .line 6187
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6188
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->a:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->a:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f0703c5

    const v4, 0x7f0203c1

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6192
    :cond_0
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->b:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->b:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f070307

    const v4, 0x7f0203bb

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6194
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->c:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->c:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f07031b

    const v4, 0x7f02040a

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6196
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->d:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->d:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f07031f

    const v4, 0x7f02040d

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6199
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->e:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->e:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f07013c

    const v4, 0x7f020417

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6202
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->f:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->f:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f07015f

    const v4, 0x7f020578

    const-string v1, "new_feature_video_entry"

    const/4 v5, 0x1

    invoke-interface {v7, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6205
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->g:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->g:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f070040

    const v4, 0x7f020364

    const-string v1, "new_feature_video_blur_entry"

    const/4 v5, 0x1

    invoke-interface {v7, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6208
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->h:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->h:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f070033

    const v4, 0x7f020361

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6210
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->i:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->i:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f070041

    const v4, 0x7f020367

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6212
    iget-object v8, p0, Lcom/roidapp/photogrid/release/dk;->h:Landroid/util/SparseArray;

    sget v0, Lcom/roidapp/photogrid/release/ei;->j:I

    add-int/lit8 v9, v0, -0x1

    new-instance v0, Lcom/roidapp/photogrid/release/eh;

    sget v1, Lcom/roidapp/photogrid/release/ei;->j:I

    add-int/lit8 v2, v1, -0x1

    const v3, 0x7f0702c9

    const v4, 0x7f0203f5

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/eh;-><init>(Lcom/roidapp/photogrid/release/dk;IIIZ)V

    invoke-virtual {v8, v9, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 6218
    const v0, 0x7f0d031a

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 6219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v1, Lcom/roidapp/photogrid/release/dw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/dw;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Landroid/widget/BaseAdapter;)V

    .line 6275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->B:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 6276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f0d03ec

    new-instance v2, Lcom/roidapp/photogrid/release/hh;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/hh;-><init>()V

    sget-object v3, Lcom/roidapp/photogrid/release/hh;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 6278
    sget v0, Lcom/roidapp/photogrid/release/ei;->a:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/dk;->a(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    .line 6279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 6280
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 6281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->e:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/dk;->b:I

    .line 6284
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->a:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->B:Z

    .line 6287
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    new-instance v1, Lcom/roidapp/photogrid/release/ea;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ea;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 6458
    const-string v0, "music_policy"

    const/4 v1, 0x1

    invoke-interface {v7, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/dk;->d:Z

    .line 6462
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/eb;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/eb;-><init>(Lcom/roidapp/photogrid/release/dk;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 6490
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dk;->a()V

    .line 122
    return-object v6
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    .line 127
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b()V

    .line 131
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dk;->g:Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    .line 133
    :cond_0
    return-void
.end method
