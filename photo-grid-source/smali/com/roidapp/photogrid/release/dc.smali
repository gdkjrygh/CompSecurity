.class public final Lcom/roidapp/photogrid/release/dc;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Lcom/roidapp/photogrid/release/lr;

.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/LinearLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/TextView;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/TextView;

.field private w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private x:Z

.field private y:Ljava/lang/String;

.field private z:[Lcom/roidapp/photogrid/release/ig;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 58
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/dc;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->a:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic a(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    .line 37
    .line 7724
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const v2, -0x41b33333    # -0.2f

    move v3, v1

    move v5, v1

    move v6, v4

    move v7, v1

    move v8, v4

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 7725
    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 7726
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 37
    return-void
.end method

.method private a(ZZ)V
    .locals 8

    .prologue
    const v7, 0x7f0c00c0

    const v6, 0x7f0c00bf

    const/16 v5, 0xff

    const/16 v4, 0x32

    const/4 v3, 0x0

    .line 677
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020421

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 678
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020422

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 679
    if-eqz p1, :cond_2

    .line 680
    if-eqz v0, :cond_0

    .line 681
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 682
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 683
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 694
    :cond_0
    :goto_0
    if-eqz p2, :cond_3

    .line 695
    if-eqz v1, :cond_1

    .line 696
    invoke-virtual {v1, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 697
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 698
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 707
    :cond_1
    :goto_1
    return-void

    .line 687
    :cond_2
    if-eqz v0, :cond_0

    .line 688
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 689
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    invoke-virtual {v2, v3, v0, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 701
    :cond_3
    if-eqz v1, :cond_1

    .line 702
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 703
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v3, v1, v3, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 704
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/dc;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 37
    .line 6730
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6731
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 6732
    new-instance v1, Landroid/app/Dialog;

    const v2, 0x7f0b001d

    invoke-direct {v1, v0, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 6734
    const v0, 0x7f0300ef

    :try_start_0
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 6742
    const v0, 0x7f0d03c6

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6743
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 6744
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->a:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    .line 6745
    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 6746
    const v0, 0x7f0d03c8

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6747
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 6748
    invoke-virtual {v0, v2, v3, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 6749
    const v0, 0x7f0d03c9

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 6750
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 6751
    invoke-virtual {v0, v2, v3, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 6752
    const v0, 0x7f0d0279

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v2, Lcom/roidapp/photogrid/release/dh;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/dh;-><init>(Lcom/roidapp/photogrid/release/dc;Landroid/app/Dialog;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6758
    new-instance v0, Lcom/roidapp/photogrid/release/di;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/di;-><init>(Lcom/roidapp/photogrid/release/dc;)V

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 6765
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 6766
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->A:Lcom/roidapp/photogrid/release/lr;

    invoke-interface {v0}, Lcom/roidapp/photogrid/release/lr;->f()V

    .line 6740
    :cond_0
    :goto_0
    return-void

    .line 6736
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 6739
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/dc;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->c:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/dc;)[Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->z:[Lcom/roidapp/photogrid/release/ig;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/dc;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/dc;)Lcom/roidapp/photogrid/release/lr;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->A:Lcom/roidapp/photogrid/release/lr;

    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 5

    .prologue
    const/16 v2, 0xff

    const/4 v4, 0x0

    .line 268
    if-eqz p1, :cond_1

    .line 269
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02038f

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 270
    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 271
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070161

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 280
    :goto_0
    return-void

    .line 274
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203cb

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 275
    if-eqz v0, :cond_2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 276
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070166

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 277
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 667
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    .line 668
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->b:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 669
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 670
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 671
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 672
    const/4 v0, 0x1

    .line 674
    :cond_0
    return v0
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 717
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 721
    :cond_0
    :goto_0
    return-void

    .line 720
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 65
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 66
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 67
    instance-of v0, p1, Lcom/roidapp/photogrid/release/lr;

    if-eqz v0, :cond_0

    .line 68
    check-cast p1, Lcom/roidapp/photogrid/release/lr;

    iput-object p1, p0, Lcom/roidapp/photogrid/release/dc;->A:Lcom/roidapp/photogrid/release/lr;

    return-void

    .line 70
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet NewbieDialogMgr.NewbieListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v3, 0x4

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v7, 0x5

    const/4 v0, 0x0

    .line 284
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z()Lcom/roidapp/photogrid/release/if;

    move-result-object v4

    .line 285
    if-nez v4, :cond_1

    .line 5710
    :cond_0
    :goto_0
    return-void

    .line 288
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 5651
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    if-eqz v1, :cond_2

    .line 5652
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 5653
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 5654
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5655
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 5657
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->b()V

    .line 5709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5712
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 5713
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v2, 0x7f0d028d

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v1, v2, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0

    .line 293
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 294
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/+90\u00b0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 296
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_4

    .line 297
    const-string v2, "+90\u00b02"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 301
    :cond_3
    :goto_1
    if-eqz v4, :cond_0

    .line 302
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    .line 303
    aget-object v2, v1, v0

    iget v3, v2, Lcom/roidapp/photogrid/release/ig;->q:I

    add-int/lit8 v3, v3, 0x5a

    iput v3, v2, Lcom/roidapp/photogrid/release/ig;->q:I

    .line 304
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 305
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 298
    :cond_4
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v7, :cond_3

    .line 299
    const-string v2, "+90\u00b02"

    sget v3, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 307
    :cond_5
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->a(F)V

    goto/16 :goto_0

    .line 312
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Flip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 314
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_7

    .line 315
    const-string v0, "Horizontal2"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 319
    :cond_6
    :goto_2
    if-eqz v4, :cond_0

    .line 320
    iget-object v0, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    rem-int/lit16 v0, v0, 0xb4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 321
    const/16 v1, 0x2d

    if-lt v0, v1, :cond_8

    const/16 v1, 0x87

    if-gt v0, v1, :cond_8

    .line 322
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->e()V

    goto/16 :goto_0

    .line 316
    :cond_7
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_6

    .line 317
    const-string v0, "Horizontal2"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_2

    .line 324
    :cond_8
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->d()V

    goto/16 :goto_0

    .line 329
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/Flip_vertical"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 331
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_a

    .line 332
    const-string v0, "Vertical2"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 336
    :cond_9
    :goto_3
    if-eqz v4, :cond_0

    .line 337
    iget-object v0, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    rem-int/lit16 v0, v0, 0xb4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 338
    const/16 v1, 0x2d

    if-lt v0, v1, :cond_b

    const/16 v1, 0x87

    if-gt v0, v1, :cond_b

    .line 339
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->d()V

    goto/16 :goto_0

    .line 333
    :cond_a
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_9

    .line 334
    const-string v0, "Vertical2"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_3

    .line 341
    :cond_b
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->e()V

    goto/16 :goto_0

    .line 347
    :pswitch_5
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/dc;->x:Z

    if-eqz v2, :cond_c

    .line 348
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 349
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070209

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/dc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 352
    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/Swap"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 354
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_d

    .line 355
    const-string v2, "Swap2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 357
    :cond_d
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v1, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 358
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v1, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 359
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->c:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 360
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 365
    :pswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/-10\u00b0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 367
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_f

    .line 368
    const-string v0, "-10\u00b02"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 372
    :cond_e
    :goto_4
    if-eqz v4, :cond_0

    .line 373
    const/high16 v0, -0x3ee00000    # -10.0f

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->a(F)V

    goto/16 :goto_0

    .line 369
    :cond_f
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_e

    .line 370
    const-string v0, "-10\u00b02"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_4

    .line 377
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/+10\u00b0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 379
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_11

    .line 380
    const-string v0, "+10\u00b02"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 384
    :cond_10
    :goto_5
    if-eqz v4, :cond_0

    .line 385
    const/high16 v0, 0x41200000    # 10.0f

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->a(F)V

    goto/16 :goto_0

    .line 381
    :cond_11
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_10

    .line 382
    const-string v0, "+10\u00b02"

    sget v1, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_5

    .line 389
    :pswitch_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/ZoomIn"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 391
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_14

    .line 392
    const-string v2, "ZoomIn2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 396
    :cond_12
    :goto_6
    if-eqz v4, :cond_0

    .line 397
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->a(Z)Z

    move-result v2

    .line 398
    if-nez v2, :cond_13

    move v0, v1

    :cond_13
    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/dc;->a(ZZ)V

    goto/16 :goto_0

    .line 393
    :cond_14
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v7, :cond_12

    .line 394
    const-string v2, "ZoomIn2"

    sget v3, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_6

    .line 402
    :pswitch_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/Zoom Out"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 404
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_17

    .line 405
    const-string v2, "ZoomOut2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 409
    :cond_15
    :goto_7
    if-eqz v4, :cond_0

    .line 410
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->b(Z)Z

    move-result v2

    .line 411
    if-nez v2, :cond_16

    move v0, v1

    :cond_16
    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/dc;->a(ZZ)V

    goto/16 :goto_0

    .line 406
    :cond_17
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v7, :cond_15

    .line 407
    const-string v2, "ZoomOut2"

    sget v3, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v3, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_7

    .line 415
    :pswitch_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/banner/Left"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 417
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_19

    .line 418
    const-string v1, "Left2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 422
    :cond_18
    :goto_8
    if-eqz v4, :cond_0

    .line 423
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->c(Z)V

    goto/16 :goto_0

    .line 419
    :cond_19
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v7, :cond_18

    .line 420
    const-string v1, "Left2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_8

    .line 427
    :pswitch_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/banner/Right"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 429
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_1b

    .line 430
    const-string v0, "Right2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 434
    :cond_1a
    :goto_9
    if-eqz v4, :cond_0

    .line 435
    invoke-virtual {v4, v1}, Lcom/roidapp/photogrid/release/if;->c(Z)V

    goto/16 :goto_0

    .line 431
    :cond_1b
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_1a

    .line 432
    const-string v0, "Right2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_9

    .line 439
    :pswitch_c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/banner/Up"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 441
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_1d

    .line 442
    const-string v1, "Up2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 446
    :cond_1c
    :goto_a
    if-eqz v4, :cond_0

    .line 447
    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->d(Z)V

    goto/16 :goto_0

    .line 443
    :cond_1d
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v7, :cond_1c

    .line 444
    const-string v1, "Up2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_a

    .line 451
    :pswitch_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/banner/Down"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 453
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_1f

    .line 454
    const-string v0, "Down2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 458
    :cond_1e
    :goto_b
    if-eqz v4, :cond_0

    .line 459
    invoke-virtual {v4, v1}, Lcom/roidapp/photogrid/release/if;->d(Z)V

    goto/16 :goto_0

    .line 455
    :cond_1f
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_1e

    .line 456
    const-string v0, "Down2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_b

    .line 463
    :pswitch_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/banner/DeleteImg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 466
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_20

    .line 467
    const-string v0, "Delete2"

    sget v1, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v2, v1, 0x1

    sput v2, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 469
    :cond_20
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dc;->x:Z

    if-eqz v0, :cond_21

    .line 470
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07020e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/dc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 471
    :cond_21
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_22

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_22

    .line 472
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07004c

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/dc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 474
    :cond_22
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 475
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070177

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 476
    const v1, 0x7f07032f

    new-instance v2, Lcom/roidapp/photogrid/release/de;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/de;-><init>(Lcom/roidapp/photogrid/release/dc;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 488
    const v1, 0x7f0701ec

    new-instance v2, Lcom/roidapp/photogrid/release/df;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/df;-><init>(Lcom/roidapp/photogrid/release/dc;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 497
    new-instance v1, Lcom/roidapp/photogrid/release/dg;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/dg;-><init>(Lcom/roidapp/photogrid/release/dc;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 505
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 512
    :pswitch_f
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v3, :cond_23

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-lez v2, :cond_23

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v3, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 513
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070200

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/dc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 515
    :cond_23
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 6094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v2}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v2

    .line 515
    if-eqz v2, :cond_26

    .line 516
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/banner/Filter"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 518
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v1, :cond_25

    .line 519
    const-string v1, "Filter2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 523
    :cond_24
    :goto_c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2, v0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 520
    :cond_25
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v7, :cond_24

    .line 521
    const-string v1, "Filter2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_c

    .line 525
    :cond_26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/Crop"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 527
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_28

    .line 528
    const-string v2, "Crop2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 532
    :cond_27
    :goto_d
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v3, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3, v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 529
    :cond_28
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v7, :cond_27

    .line 530
    const-string v2, "Crop2"

    sget v3, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_d

    .line 537
    :pswitch_10
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v3, :cond_29

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-lez v2, :cond_29

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v3, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v2

    if-eqz v2, :cond_29

    .line 538
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070207

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/dc;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 540
    :cond_29
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/banner/Crop"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 542
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v2, :cond_2b

    .line 543
    const-string v2, "Crop2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 547
    :cond_2a
    :goto_e
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v3, v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3, v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 544
    :cond_2b
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v7, :cond_2a

    .line 545
    const-string v2, "Crop2"

    sget v3, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_e

    .line 551
    :pswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/banner/FreeCrop"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 553
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_2d

    .line 554
    const-string v0, "ClipPhoto2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 559
    :cond_2c
    :goto_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(II)V

    goto/16 :goto_0

    .line 555
    :cond_2d
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_2c

    .line 556
    const-string v0, "ClipPhoto2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_f

    .line 564
    :pswitch_12
    if-eqz v4, :cond_0

    .line 566
    iget-boolean v2, v4, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 567
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_2f

    move v3, v1

    .line 568
    :goto_10
    if-eqz v3, :cond_2e

    move v2, v1

    .line 571
    :cond_2e
    if-eqz v3, :cond_30

    .line 572
    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->v:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->t:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-nez v5, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->u:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-nez v5, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->p:I

    if-nez v5, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->x:I

    if-nez v5, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->r:I

    if-ne v5, v1, :cond_30

    iget-object v5, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v5, v5, Lcom/roidapp/photogrid/release/ig;->s:I

    if-ne v5, v1, :cond_30

    .line 574
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f07002b

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto/16 :goto_0

    :cond_2f
    move v3, v0

    .line 567
    goto :goto_10

    .line 579
    :cond_30
    if-eqz v2, :cond_35

    .line 580
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/banner/FitIn"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 582
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v7, :cond_34

    .line 583
    if-nez v3, :cond_33

    .line 584
    const-string v1, "In_FitIn2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v2, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 592
    :goto_11
    if-nez v3, :cond_31

    .line 593
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0203cb

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 594
    const/16 v2, 0xff

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 595
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f070166

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 596
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {v2, v8, v1, v8, v8}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 600
    :cond_31
    iput-boolean v0, v4, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 601
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v7, :cond_32

    .line 602
    iput-boolean v0, v4, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 608
    :cond_32
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(Z)V

    .line 609
    iget-object v0, v4, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 610
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    goto/16 :goto_0

    .line 586
    :cond_33
    const-string v1, "Or_FitIn2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v5, v2, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    goto :goto_11

    .line 590
    :cond_34
    const-string v1, "FitIn2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v5, v2, 0x1

    sput v5, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    goto :goto_11

    .line 612
    :cond_35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/banner/FitOut"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 614
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_37

    .line 615
    const-string v0, "In_FitOut2"

    sget v2, Lcom/roidapp/photogrid/common/az;->E:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->E:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;I)V

    .line 619
    :goto_12
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f02038f

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 620
    const/16 v2, 0xff

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 621
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f070161

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 622
    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {v2, v8, v0, v8, v8}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 623
    iput-boolean v1, v4, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 624
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v7, :cond_36

    .line 625
    iput-boolean v1, v4, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 631
    :cond_36
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(Z)V

    .line 632
    iget-object v0, v4, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 633
    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    goto/16 :goto_0

    .line 617
    :cond_37
    const-string v0, "FitOut2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    goto :goto_12

    .line 641
    :pswitch_13
    const-string v1, "Retouch2"

    sget v2, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v3, v2, 0x1

    sput v3, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 642
    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v2, v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(II)V

    goto/16 :goto_0

    .line 288
    :pswitch_data_0
    .packed-switch 0x7f0d034b
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_12
        :pswitch_0
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_13
        :pswitch_e
        :pswitch_0
        :pswitch_11
        :pswitch_0
        :pswitch_2
        :pswitch_6
        :pswitch_7
        :pswitch_3
        :pswitch_4
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v9, 0x4

    const/4 v1, 0x1

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 78
    const v0, 0x7f0300cd

    invoke-virtual {p1, v0, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 4085
    const v0, 0x7f0d034b

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->a:Landroid/widget/ImageView;

    .line 4090
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->a:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v4, Lcom/roidapp/photogrid/release/dd;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/dd;-><init>(Lcom/roidapp/photogrid/release/dc;)V

    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 4107
    const v0, 0x7f0d034c

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->b:Landroid/widget/TextView;

    .line 4108
    const v0, 0x7f0d034d

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->c:Landroid/widget/LinearLayout;

    .line 4109
    const v0, 0x7f0d034e

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->e:Landroid/widget/TextView;

    .line 4110
    const v0, 0x7f0d0354

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->f:Landroid/widget/TextView;

    .line 4111
    const v0, 0x7f0d0352

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->g:Landroid/widget/TextView;

    .line 4112
    const v0, 0x7f0d0359

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->i:Landroid/widget/TextView;

    .line 4113
    const v0, 0x7f0d035c

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->j:Landroid/widget/TextView;

    .line 4114
    const v0, 0x7f0d035d

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->k:Landroid/widget/TextView;

    .line 4115
    const v0, 0x7f0d035b

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->l:Landroid/widget/TextView;

    .line 4116
    const v0, 0x7f0d035e

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->m:Landroid/widget/TextView;

    .line 4117
    const v0, 0x7f0d035f

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->n:Landroid/widget/TextView;

    .line 4118
    const v0, 0x7f0d0360

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    .line 4119
    const v0, 0x7f0d0361

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    .line 4120
    const v0, 0x7f0d0362

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->q:Landroid/widget/TextView;

    .line 4121
    const v0, 0x7f0d0363

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->r:Landroid/widget/TextView;

    .line 4122
    const v0, 0x7f0d0364

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->s:Landroid/widget/TextView;

    .line 4123
    const v0, 0x7f0d0365

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->t:Landroid/widget/TextView;

    .line 4124
    const v0, 0x7f0d0353

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->d:Landroid/widget/RelativeLayout;

    .line 4125
    const v0, 0x7f0d0357

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    .line 4126
    const v0, 0x7f0d0350

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    .line 4128
    const v0, 0x7f0d0356

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->h:Landroid/widget/TextView;

    .line 4130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4131
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->e:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->i:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->k:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4140
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->o:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4143
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->q:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->r:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->s:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->t:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->v:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4149
    const v0, 0x7f0d034f

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 4151
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 5094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {v4}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v4

    .line 4151
    if-nez v4, :cond_0

    .line 4152
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4160
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    iput-object v4, p0, Lcom/roidapp/photogrid/release/dc;->z:[Lcom/roidapp/photogrid/release/ig;

    .line 4161
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->z:[Lcom/roidapp/photogrid/release/ig;

    if-nez v4, :cond_1

    .line 4163
    const-string v0, "130"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 80
    :goto_0
    return-object v3

    .line 4166
    :cond_1
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->z:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    if-ne v4, v1, :cond_e

    .line 4167
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/dc;->x:Z

    .line 4168
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->e:Landroid/widget/TextView;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4169
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v4, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4170
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v4, v9, :cond_2

    .line 4171
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->g:Landroid/widget/TextView;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4173
    :cond_2
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4174
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v4, v9, :cond_3

    .line 4175
    const v4, 0x7f0d0355

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 4178
    :cond_3
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0x9

    if-eq v4, v5, :cond_4

    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0xa

    if-ne v4, v5, :cond_5

    .line 4179
    :cond_4
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4202
    :cond_5
    :goto_1
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v4, v9, :cond_6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v4

    if-ne v4, v9, :cond_8

    .line 4204
    :cond_7
    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4207
    :cond_8
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v9, :cond_9

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_9

    .line 4208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4209
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f02037b

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 4210
    const/16 v4, 0x32

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4211
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {v4, v7, v0, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4213
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-lez v0, :cond_a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v4, v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 4214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4215
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f02038e

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 4216
    const/16 v4, 0x32

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4217
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->f:Landroid/widget/TextView;

    invoke-virtual {v4, v7, v0, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4220
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-lez v0, :cond_b

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget v4, v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->b(I)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 4221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0c00c0

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4222
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f020379

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 4223
    const/16 v4, 0x32

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4224
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->g:Landroid/widget/TextView;

    invoke-virtual {v4, v7, v0, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4226
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dc;->w:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z()Lcom/roidapp/photogrid/release/if;

    move-result-object v4

    .line 4227
    if-eqz v4, :cond_d

    .line 4228
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v5, 0x2

    if-ne v0, v5, :cond_10

    move v0, v1

    :goto_2
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/dc;->a(Z)V

    .line 4230
    invoke-virtual {v4, v1}, Lcom/roidapp/photogrid/release/if;->a(Z)Z

    move-result v0

    if-nez v0, :cond_11

    move v0, v1

    :goto_3
    invoke-virtual {v4, v1}, Lcom/roidapp/photogrid/release/if;->b(Z)Z

    move-result v4

    if-nez v4, :cond_c

    move v2, v1

    :cond_c
    invoke-direct {p0, v0, v2}, Lcom/roidapp/photogrid/release/dc;->a(ZZ)V

    .line 4233
    :cond_d
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_0

    .line 4235
    :pswitch_1
    const-string v0, "GridActivity/Edit"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4183
    :cond_e
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/roidapp/baselib/gl/c;->e(Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_f

    .line 4184
    const v4, 0x7f0d0355

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 4186
    :cond_f
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0c00bf

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4187
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0203fe

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 4188
    const/16 v5, 0xff

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4189
    iget-object v5, p0, Lcom/roidapp/photogrid/release/dc;->e:Landroid/widget/TextView;

    invoke-virtual {v5, v7, v4, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 4191
    iget-object v4, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0c00bf

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4192
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/dc;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f02037b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 4193
    const/16 v5, 0xff

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4194
    iget-object v5, p0, Lcom/roidapp/photogrid/release/dc;->u:Landroid/widget/TextView;

    invoke-virtual {v5, v7, v4, v7, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_1

    .line 4228
    :cond_10
    iget-boolean v0, v4, Lcom/roidapp/photogrid/release/if;->C:Z

    goto/16 :goto_2

    :cond_11
    move v0, v2

    .line 4230
    goto :goto_3

    .line 4238
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-ne v0, v1, :cond_12

    .line 4239
    const-string v0, "GridActivity/Single/Instagram/Edit"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4241
    :cond_12
    const-string v0, "GridActivity/Single/Original/Edit"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4245
    :pswitch_3
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4248
    :pswitch_4
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4251
    :pswitch_5
    const-string v0, "GridActivity/Template/Edit"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/dc;->y:Ljava/lang/String;

    goto/16 :goto_0

    .line 4233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
