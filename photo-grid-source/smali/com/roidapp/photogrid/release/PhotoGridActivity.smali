.class public Lcom/roidapp/photogrid/release/PhotoGridActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;
.implements Lcom/roidapp/imagelib/filter/y;
.implements Lcom/roidapp/photogrid/release/lo;
.implements Lcom/roidapp/photogrid/release/lr;
.implements Lcom/roidapp/photogrid/release/mp;
.implements Lcom/roidapp/photogrid/release/ok;


# static fields
.field private static ar:I

.field private static as:I

.field private static at:I

.field private static au:I

.field private static av:I

.field private static aw:I

.field private static ax:I

.field private static ay:F

.field private static az:F


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public D:Z

.field E:Z

.field F:Z

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/TextView;

.field private K:Landroid/widget/TextView;

.field private L:Landroid/widget/TextView;

.field private M:Landroid/widget/TextView;

.field private N:Landroid/widget/RelativeLayout;

.field private O:Landroid/widget/RelativeLayout;

.field private P:Landroid/widget/TextView;

.field private Q:Landroid/widget/FrameLayout;

.field private R:Landroid/widget/FrameLayout;

.field private S:Landroid/widget/FrameLayout;

.field private T:Lcom/roidapp/photogrid/release/PhotoView;

.field private U:Lcom/roidapp/photogrid/release/az;

.field private V:Z

.field private W:Z

.field private X:Z

.field private Y:Ljava/lang/String;

.field private Z:Z

.field public a:Landroid/widget/RelativeLayout;

.field private aA:Z

.field private aB:Landroid/view/View;

.field private aC:Landroid/widget/TextView;

.field private aD:Z

.field private aE:J

.field private aF:J

.field private aG:F

.field private aH:F

.field private aI:F

.field private aJ:F

.field private aK:F

.field private aL:Z

.field private aM:Z

.field private aN:I

.field private aO:F

.field private aP:Z

.field private aQ:F

.field private aR:F

.field private aS:Lcom/roidapp/photogrid/release/if;

.field private aT:Z

.field private aU:Z

.field private aV:Z

.field private aW:Z

.field private aX:I

.field private aY:I

.field private aZ:I

.field private aa:I

.field private ab:I

.field private ac:Z

.field private ad:Landroid/widget/TextView;

.field private ae:Z

.field private af:Z

.field private ag:I

.field private ah:Z

.field private ai:Z

.field private aj:Z

.field private ak:Landroid/widget/RelativeLayout;

.field private al:Z

.field private final am:Z

.field private an:Z

.field private ao:Ljava/lang/Boolean;

.field private ap:Z

.field private aq:Ljava/lang/String;

.field public b:Lcom/roidapp/photogrid/release/mm;

.field private ba:I

.field private bb:I

.field private bc:I

.field private bd:Landroid/os/Vibrator;

.field private be:Landroid/widget/ImageView;

.field private bf:Landroid/graphics/Bitmap;

.field public c:Lcom/roidapp/photogrid/release/oi;

.field public d:Lcom/roidapp/photogrid/release/ml;

.field public e:[Lcom/roidapp/photogrid/release/ig;

.field public f:Ljava/lang/String;

.field public g:I

.field protected h:Z

.field public i:Z

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Lcom/roidapp/photogrid/common/bc;

.field public n:I

.field public o:Z

.field protected p:Z

.field protected q:Z

.field public r:Z

.field public s:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field protected y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 117
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 145
    new-instance v0, Lcom/roidapp/photogrid/release/ml;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/release/ml;-><init>(Ljava/lang/ref/WeakReference;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    .line 151
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    .line 155
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 157
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 170
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 172
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V:Z

    .line 178
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W:Z

    .line 182
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->X:Z

    .line 184
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 187
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z:Z

    .line 188
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aa:I

    .line 190
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    .line 192
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p:Z

    .line 193
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac:Z

    .line 195
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q:Z

    .line 220
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    .line 222
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af:Z

    .line 228
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->y:Z

    .line 229
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 231
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->A:Z

    .line 232
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->B:Z

    .line 242
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aj:Z

    .line 245
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->al:Z

    .line 246
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->am:Z

    .line 252
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->an:Z

    .line 253
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ao:Ljava/lang/Boolean;

    .line 254
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ap:Z

    .line 255
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->E:Z

    .line 3614
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aL:Z

    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    .line 3617
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 5354
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    .line 5356
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aZ:I

    .line 5357
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    .line 5358
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    .line 5359
    iput v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    return-void
.end method

.method private S()V
    .locals 9

    .prologue
    const v8, 0x7f0701b1

    const v7, 0x7f0701af

    const/4 v6, 0x0

    const/16 v5, 0x8

    const/4 v2, 0x0

    .line 691
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 692
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 693
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 694
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 695
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 696
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 698
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    .line 699
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    .line 700
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    .line 703
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    if-eqz v0, :cond_4

    .line 704
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 709
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v6, v6, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    const v1, 0x7f020459

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 711
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 712
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 713
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f090193

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 714
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f090187

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 716
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x3

    if-ne v1, v4, :cond_8

    :cond_2
    move v1, v3

    .line 719
    :goto_0
    invoke-virtual {v0, v1, v2, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 720
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 721
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 731
    :cond_3
    :goto_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 813
    :goto_2
    :pswitch_0
    return-void

    .line 723
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    .line 724
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 725
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 726
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 727
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_1

    .line 738
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    const v1, 0x7f0701ae

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 745
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    const v1, 0x7f07013c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 746
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aB:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 747
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 748
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 749
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 750
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 753
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    const v1, 0x7f07037b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 754
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aB:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 755
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_2

    .line 758
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    const v1, 0x7f0701a8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 764
    :pswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    const v1, 0x7f0701a9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_2

    .line 771
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 772
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->e()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z:Z

    if-eqz v0, :cond_6

    .line 773
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    const v1, 0x7f02038d

    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 781
    :goto_3
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->f()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(I)V

    .line 783
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 784
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 787
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 776
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 777
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 778
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v1, v6, v0, v6, v6}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 793
    :pswitch_7
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    if-eqz v0, :cond_7

    .line 794
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 799
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 800
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    .line 805
    :pswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 806
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    const v1, 0x7f0701aa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_2

    :cond_8
    move v1, v2

    goto/16 :goto_0

    .line 731
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private T()V
    .locals 2

    .prologue
    .line 861
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_0

    .line 862
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(I)V

    .line 863
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->a(F)V

    .line 865
    :cond_0
    return-void
.end method

.method private U()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1017
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->H:Z

    .line 1018
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 1024
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "folder_name"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1025
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 1026
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 1027
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1028
    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1029
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 1030
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 1031
    const-string v0, "MainPage_View"

    const-string v1, "Cart_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1032
    return-void
.end method

.method private V()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1214
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 1216
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v1, :pswitch_data_0

    .line 1255
    :goto_0
    :pswitch_0
    return-void

    .line 1219
    :pswitch_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v1

    .line 1220
    const-string v2, "state_single"

    invoke-virtual {p0, v2, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    .line 1221
    const/4 v3, 0x1

    if-eq v1, v3, :cond_0

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 1223
    :cond_0
    const-string v3, "single_mode"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 1225
    :cond_1
    const-string v1, "background_bg_blur"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v3

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1228
    :pswitch_2
    const-string v1, "state_grid"

    invoke-virtual {p0, v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1229
    const-string v2, "background_state_no_bg"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_color_position"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_shape_index"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_pattern_index0"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_pattern_index1"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 1239
    :pswitch_3
    const-string v1, "state_free"

    invoke-virtual {p0, v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1240
    const-string v2, "background_color_position"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_shape_index"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_pattern_index0"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_pattern_index1"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_custom_image"

    sget-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_custom_image_path_original"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aC()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "background_custom_image_path_crop"

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aB()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto/16 :goto_0

    .line 1216
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private W()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1312
    invoke-direct {p0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 1313
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1314
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v1, :cond_0

    .line 1315
    const-string v1, "path"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1316
    const-string v1, "entryType"

    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aa:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1317
    const-string v1, "entryFrom"

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1319
    :cond_0
    const-class v1, Lcom/roidapp/photogrid/release/FaceDetectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1320
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 1321
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 1322
    return-void
.end method

.method private X()V
    .locals 1

    .prologue
    .line 2237
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2255
    :goto_0
    :pswitch_0
    return-void

    .line 2246
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    goto :goto_0

    .line 2250
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2251
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2252
    sget-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    goto :goto_0

    .line 2237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private Y()V
    .locals 19

    .prologue
    .line 2260
    const/4 v2, 0x0

    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 2261
    const/4 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 2262
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "isSaveFirst"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2263
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z()V

    .line 2264
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v2, :cond_18

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 28164
    iget-object v3, v2, Lcom/roidapp/photogrid/release/oi;->b:Landroid/app/Activity;

    const/16 v4, 0xf

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;I)Z

    move-result v3

    .line 28165
    if-nez v3, :cond_19

    .line 28166
    iget-object v2, v2, Lcom/roidapp/photogrid/release/oi;->q:Landroid/os/Handler;

    const/16 v3, 0x2be

    invoke-virtual {v2, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 28167
    const/4 v2, 0x0

    .line 2264
    :goto_0
    if-eqz v2, :cond_18

    .line 2265
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 2268
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1a

    .line 2269
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v2

    .line 2270
    const-wide/32 v4, 0x780ce839

    cmp-long v4, v2, v4

    if-ltz v4, :cond_0

    const-wide/32 v4, 0x780ce89d

    cmp-long v4, v2, v4

    if-lez v4, :cond_1

    :cond_0
    const-wide/32 v4, 0x77fda97d

    cmp-long v4, v2, v4

    if-ltz v4, :cond_2

    const-wide/32 v4, 0x77fda983

    cmp-long v2, v2, v4

    if-gtz v2, :cond_2

    .line 2271
    :cond_1
    const/4 v2, 0x1

    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 2286
    :cond_2
    :goto_1
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0x9

    if-eq v2, v3, :cond_3

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_1c

    .line 2287
    :cond_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 29139
    const/16 v3, 0x280

    iput v3, v2, Lcom/roidapp/photogrid/release/oi;->f:I

    .line 2308
    :goto_2
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    .line 2310
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v2, :cond_4

    .line 2311
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 2313
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 2314
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 31230
    move-object/from16 v0, p0

    iput-object v0, v2, Lcom/roidapp/photogrid/release/oi;->i:Lcom/roidapp/photogrid/release/ok;

    .line 2315
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2316
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2317
    sget-object v2, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2320
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_27

    .line 31345
    const-string v2, "VideoSavingDialogFragment"

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 31346
    new-instance v3, Lcom/roidapp/photogrid/release/ri;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/ri;-><init>()V

    .line 31347
    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lcom/roidapp/photogrid/release/ri;->setStyle(II)V

    .line 31348
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v2, :cond_26

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v2, :cond_25

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mm;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    :goto_3
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ri;->a(I)V

    .line 31349
    const-string v2, "VideoSavingDialogFragment"

    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 2327
    :goto_4
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/oi;->a()V

    .line 2328
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2330
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 2333
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v2, :cond_5

    .line 2334
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v4, v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ay()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->u()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->v()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aH()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aK()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aJ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/ModeSwitch/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ag:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aD:Z

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    .line 2347
    :cond_5
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    if-eqz v2, :cond_32

    .line 2349
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2352
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->b()Z

    move-result v2

    if-eqz v2, :cond_2b

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v2, "HasRetouch/"

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->c()Z

    move-result v2

    if-eqz v2, :cond_28

    const-string v2, "Smoother/"

    :goto_5
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->d()Z

    move-result v2

    if-eqz v2, :cond_29

    const-string v2, "Whiten/"

    :goto_6
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->e()Z

    move-result v2

    if-eqz v2, :cond_2a

    const-string v2, "Blemish/"

    :goto_7
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_8
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2360
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-ne v2, v4, :cond_6

    .line 2361
    const-string v2, "Save/Share"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2363
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->i()Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 2364
    const-string v2, "Template"

    const-string v4, "Share"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "NewStuff/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-static {v0, v2, v4, v5, v6}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2372
    :cond_6
    :goto_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    iget v4, v4, Lcom/roidapp/photogrid/release/oi;->f:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2373
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2374
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/oi;->d()Z

    move-result v2

    if-eqz v2, :cond_7

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-eq v2, v4, :cond_7

    .line 2375
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/waterMark"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2377
    :cond_7
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_8

    .line 2378
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v4, Lcom/roidapp/photogrid/common/az;->C:Z

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2382
    :cond_8
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x5

    if-eq v2, v4, :cond_9

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-eq v2, v4, :cond_9

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0xa

    if-ne v2, v4, :cond_a

    .line 2385
    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Share/bgbLur/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2390
    :cond_a
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "NEW_USER"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 2391
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NEW_USER/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save/Share"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2393
    :cond_b
    const-string v2, "/Save/Share/filter/"

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(Ljava/lang/String;)V

    .line 2395
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-ne v2, v3, :cond_18

    .line 2396
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2397
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 2398
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v8

    .line 2400
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v9

    .line 2401
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v10

    .line 2402
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v11

    .line 2403
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v12

    .line 2404
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v13

    .line 2405
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v14

    .line 2406
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v15

    .line 2407
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v16

    .line 2408
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2d

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    sget v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aw:I

    if-eq v2, v3, :cond_2d

    const/4 v2, 0x1

    .line 2409
    :goto_a
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2e

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    sget v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ax:I

    if-eq v3, v4, :cond_2e

    const/4 v3, 0x1

    .line 2410
    :goto_b
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->b()Z

    move-result v17

    .line 2411
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v4, :cond_2f

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoView;->c()Z

    move-result v4

    if-eqz v4, :cond_2f

    const/4 v4, 0x1

    .line 2412
    :goto_c
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v5, :cond_30

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PhotoView;->d()Z

    move-result v5

    if-eqz v5, :cond_30

    const/4 v5, 0x1

    .line 2413
    :goto_d
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v6, :cond_31

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_31

    const/4 v6, 0x1

    .line 2415
    :goto_e
    sget v18, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ar:I

    move/from16 v0, v18

    if-eq v9, v0, :cond_c

    .line 2416
    packed-switch v9, :pswitch_data_0

    .line 2427
    :goto_f
    :pswitch_0
    invoke-virtual {v8, v9}, Lcom/roidapp/photogrid/b/k;->a(I)V

    .line 2429
    :cond_c
    if-eqz v10, :cond_d

    .line 2430
    const-string v9, "Layout"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2432
    :cond_d
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->as:I

    if-ne v11, v9, :cond_e

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->at:I

    if-ne v12, v9, :cond_e

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->au:I

    if-eq v13, v9, :cond_f

    .line 2433
    :cond_e
    const-string v9, "Background"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2434
    invoke-virtual {v8, v11}, Lcom/roidapp/photogrid/b/k;->b(I)V

    .line 2435
    invoke-virtual {v8, v12}, Lcom/roidapp/photogrid/b/k;->c(I)V

    .line 2436
    invoke-virtual {v8, v13}, Lcom/roidapp/photogrid/b/k;->d(I)V

    .line 2438
    :cond_f
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ay:F

    cmpl-float v9, v15, v9

    if-nez v9, :cond_10

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->az:F

    cmpl-float v9, v16, v9

    if-eqz v9, :cond_11

    .line 2439
    :cond_10
    const-string v9, "Border"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2440
    invoke-virtual {v8, v15}, Lcom/roidapp/photogrid/b/k;->a(F)V

    .line 2441
    move/from16 v0, v16

    invoke-virtual {v8, v0}, Lcom/roidapp/photogrid/b/k;->b(F)V

    .line 2443
    :cond_11
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->av:I

    if-eq v14, v9, :cond_12

    .line 2444
    const-string v9, "Frame"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2445
    invoke-virtual {v8, v14}, Lcom/roidapp/photogrid/b/k;->e(I)V

    .line 2447
    :cond_12
    if-eqz v2, :cond_13

    .line 2448
    const-string v2, "Crop"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2449
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v9, 0x0

    aget-object v2, v2, v9

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/roidapp/photogrid/b/k;->g(I)V

    .line 2451
    :cond_13
    if-eqz v3, :cond_14

    .line 2452
    const-string v2, "Filter"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2453
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/roidapp/photogrid/b/k;->f(I)V

    .line 2455
    :cond_14
    if-eqz v17, :cond_15

    .line 2456
    const-string v2, "Retouch"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2458
    :cond_15
    if-eqz v4, :cond_16

    .line 2459
    const-string v2, "Text"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2461
    :cond_16
    if-eqz v5, :cond_17

    .line 2462
    const-string v2, "Sticker"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2464
    :cond_17
    if-eqz v6, :cond_18

    .line 2465
    const-string v2, "Draw"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2619
    :cond_18
    :goto_10
    return-void

    .line 28169
    :cond_19
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 2273
    :cond_1a
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    .line 2274
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    .line 2275
    if-eqz v3, :cond_2

    .line 2276
    array-length v4, v3

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 2277
    if-eqz v5, :cond_1b

    iget-boolean v5, v5, Lcom/roidapp/photogrid/release/ig;->m:Z

    if-eqz v5, :cond_1b

    .line 2278
    const/4 v2, 0x1

    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->F:Z

    goto/16 :goto_1

    .line 2276
    :cond_1b
    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    .line 2288
    :cond_1c
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0xa

    if-ne v2, v3, :cond_22

    .line 2289
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 2290
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 29341
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 29342
    const/4 v5, 0x1

    iput-boolean v5, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 29343
    invoke-static {v2, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 29344
    iget v2, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 29345
    const/16 v4, 0xa00

    if-lt v2, v4, :cond_1d

    .line 29346
    const/16 v2, 0xa00

    .line 30139
    :goto_12
    iput v2, v3, Lcom/roidapp/photogrid/release/oi;->f:I

    goto/16 :goto_2

    .line 29347
    :cond_1d
    const/16 v4, 0x800

    if-lt v2, v4, :cond_1e

    const/16 v4, 0xa00

    if-ge v2, v4, :cond_1e

    .line 29348
    const/16 v2, 0xa00

    goto :goto_12

    .line 29349
    :cond_1e
    const/16 v4, 0x67c

    if-lt v2, v4, :cond_1f

    const/16 v4, 0x800

    if-ge v2, v4, :cond_1f

    .line 29350
    const/16 v2, 0x800

    goto :goto_12

    .line 29351
    :cond_1f
    const/16 v4, 0x438

    if-lt v2, v4, :cond_20

    const/16 v4, 0x67c

    if-ge v2, v4, :cond_20

    .line 29352
    const/16 v2, 0x67c

    goto :goto_12

    .line 29353
    :cond_20
    const/16 v4, 0x2d0

    if-lt v2, v4, :cond_21

    const/16 v4, 0x438

    if-ge v2, v4, :cond_21

    .line 29354
    const/16 v2, 0x438

    goto :goto_12

    .line 29356
    :cond_21
    const/16 v2, 0x2d0

    goto :goto_12

    .line 2298
    :cond_22
    invoke-static/range {p0 .. p0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v2

    .line 2299
    if-nez v2, :cond_23

    .line 2300
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    const/16 v3, 0x438

    if-lt v2, v3, :cond_24

    .line 2301
    const/16 v2, 0x780

    .line 2306
    :cond_23
    :goto_13
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 31139
    iput v2, v3, Lcom/roidapp/photogrid/release/oi;->f:I

    goto/16 :goto_2

    .line 2303
    :cond_24
    const/16 v2, 0x2d0

    goto :goto_13

    .line 31348
    :cond_25
    const/4 v2, 0x0

    goto/16 :goto_3

    :cond_26
    const/4 v2, 0x0

    goto/16 :goto_3

    .line 2323
    :cond_27
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    goto/16 :goto_4

    .line 2352
    :cond_28
    const-string v2, ""

    goto/16 :goto_5

    :cond_29
    const-string v2, ""

    goto/16 :goto_6

    :cond_2a
    const-string v2, ""

    goto/16 :goto_7

    :cond_2b
    const-string v2, ""

    goto/16 :goto_8

    .line 2368
    :cond_2c
    const-string v2, "Template"

    const-string v4, "Share"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-static {v0, v2, v4, v5, v6}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto/16 :goto_9

    .line 2408
    :cond_2d
    const/4 v2, 0x0

    goto/16 :goto_a

    .line 2409
    :cond_2e
    const/4 v3, 0x0

    goto/16 :goto_b

    .line 2411
    :cond_2f
    const/4 v4, 0x0

    goto/16 :goto_c

    .line 2412
    :cond_30
    const/4 v5, 0x0

    goto/16 :goto_d

    .line 2413
    :cond_31
    const/4 v6, 0x0

    goto/16 :goto_e

    .line 2418
    :pswitch_1
    const-string v18, "Instagram"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 2421
    :pswitch_2
    const-string v18, "Original"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 2424
    :pswitch_3
    const-string v18, "Shape"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_f

    .line 2471
    :cond_32
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2475
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Save/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->b()Z

    move-result v2

    if-eqz v2, :cond_42

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v2, "HasRetouch/"

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->c()Z

    move-result v2

    if-eqz v2, :cond_3f

    const-string v2, "Smoother/"

    :goto_14
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->d()Z

    move-result v2

    if-eqz v2, :cond_40

    const-string v2, "Whiten/"

    :goto_15
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/l;->e()Z

    move-result v2

    if-eqz v2, :cond_41

    const-string v2, "Blemish/"

    :goto_16
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_17
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2483
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-ne v2, v4, :cond_33

    .line 2484
    const-string v2, "Save"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/roidapp/baselib/c/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 2486
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->i()Z

    move-result v2

    if-eqz v2, :cond_43

    .line 2487
    const-string v2, "Template"

    const-string v4, "Save"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "NewStuff/"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-static {v0, v2, v4, v5, v6}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 2495
    :cond_33
    :goto_18
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    iget v4, v4, Lcom/roidapp/photogrid/release/oi;->f:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2496
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Save"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2497
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/oi;->d()Z

    move-result v2

    if-eqz v2, :cond_34

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x4

    if-eq v2, v4, :cond_34

    .line 2498
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/waterMark"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2500
    :cond_34
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_35

    .line 2501
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v4, Lcom/roidapp/photogrid/common/az;->C:Z

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aD()Z

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2505
    :cond_35
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x5

    if-eq v2, v4, :cond_36

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-eq v2, v4, :cond_36

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0xa

    if-ne v2, v4, :cond_37

    .line 2508
    :cond_36
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "/Save/Save/bgbLur/"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 2513
    :cond_37
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "NEW_USER"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_38

    .line 2514
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NEW_USER/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/Save"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 2516
    :cond_38
    const-string v2, "/Save/Save/filter/"

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(Ljava/lang/String;)V

    .line 2518
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-ne v2, v3, :cond_18

    .line 2519
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v4

    .line 2520
    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->a()Z

    move-result v2

    .line 2521
    if-eqz v2, :cond_39

    .line 2522
    const-string v3, "SingleSave"

    const-string v5, "SingleAutoRetouch_Apply"

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v8, 0x0

    aget-object v7, v7, v8

    iget-object v7, v7, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v7

    invoke-static {v3, v5, v6, v7}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2524
    :cond_39
    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->c()Z

    move-result v3

    if-eqz v3, :cond_3a

    if-nez v2, :cond_3a

    .line 2525
    const-string v3, "SingleSave"

    const-string v5, "SingleSmoother_Apply"

    const/4 v6, 0x1

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v8, 0x0

    aget-object v7, v7, v8

    iget-object v7, v7, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v7

    invoke-static {v3, v5, v6, v7}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2527
    :cond_3a
    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->d()Z

    move-result v3

    if-eqz v3, :cond_3b

    if-nez v2, :cond_3b

    .line 2528
    const-string v2, "SingleSave"

    const-string v3, "SingleWhiten_Apply"

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v7, 0x0

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v2, v3, v5, v6}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2530
    :cond_3b
    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->e()Z

    move-result v2

    if-eqz v2, :cond_3c

    .line 2531
    const-string v2, "SingleSave"

    const-string v3, "SingleBlemish_Apply"

    const/4 v5, 0x1

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v7, 0x0

    aget-object v6, v6, v7

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v6

    invoke-static {v2, v3, v5, v6}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2534
    :cond_3c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    .line 2535
    if-eqz v3, :cond_18

    .line 2536
    array-length v5, v3

    const/4 v2, 0x0

    :goto_19
    if-ge v2, v5, :cond_44

    aget-object v6, v3, v2

    .line 2537
    iget-object v7, v6, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    invoke-static {v7}, Lcom/roidapp/imagelib/filter/groupinfo/b;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)Z

    move-result v7

    if-eqz v7, :cond_3d

    .line 2538
    const-string v7, "SingleSave"

    const-string v8, "SingleFilter_Apply"

    const/4 v9, 0x1

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v11, 0x0

    aget-object v10, v10, v11

    iget-object v10, v10, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v10

    invoke-static {v7, v8, v9, v10}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2540
    :cond_3d
    iget-object v7, v6, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    if-eqz v7, :cond_3e

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    invoke-virtual {v6}, Lcom/roidapp/imagelib/b/b;->a()Z

    move-result v6

    if-eqz v6, :cond_3e

    .line 2541
    const-string v6, "SingleSave"

    const-string v7, "SingleAdjust_Apply"

    const/4 v8, 0x1

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v10, 0x0

    aget-object v9, v9, v10

    iget-object v9, v9, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v9

    invoke-static {v6, v7, v8, v9}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;II)V

    .line 2536
    :cond_3e
    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    .line 2475
    :cond_3f
    const-string v2, ""

    goto/16 :goto_14

    :cond_40
    const-string v2, ""

    goto/16 :goto_15

    :cond_41
    const-string v2, ""

    goto/16 :goto_16

    :cond_42
    const-string v2, ""

    goto/16 :goto_17

    .line 2491
    :cond_43
    const-string v2, "Template"

    const-string v4, "Save"

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v0, p0

    invoke-static {v0, v2, v4, v5, v6}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto/16 :goto_18

    .line 2545
    :cond_44
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "-"

    const-string v5, ""

    invoke-virtual {v2, v3, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2546
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 2547
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v8

    .line 2549
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v9

    .line 2550
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v10

    .line 2551
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v11

    .line 2552
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v12

    .line 2553
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v13

    .line 2554
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v14

    .line 2555
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v15

    .line 2556
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v16

    .line 2557
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_51

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    sget v3, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aw:I

    if-eq v2, v3, :cond_51

    const/4 v2, 0x1

    .line 2558
    :goto_1a
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v5, 0x0

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_52

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v5, 0x0

    aget-object v3, v3, v5

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    sget v5, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ax:I

    if-eq v3, v5, :cond_52

    const/4 v3, 0x1

    .line 2559
    :goto_1b
    invoke-virtual {v4}, Lcom/roidapp/imagelib/retouch/l;->b()Z

    move-result v17

    .line 2560
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v4, :cond_53

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/PhotoView;->c()Z

    move-result v4

    if-eqz v4, :cond_53

    const/4 v4, 0x1

    .line 2561
    :goto_1c
    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v5, :cond_54

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/PhotoView;->d()Z

    move-result v5

    if-eqz v5, :cond_54

    const/4 v5, 0x1

    .line 2562
    :goto_1d
    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v6, :cond_55

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_55

    const/4 v6, 0x1

    .line 2564
    :goto_1e
    sget v18, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ar:I

    move/from16 v0, v18

    if-eq v9, v0, :cond_45

    .line 2565
    packed-switch v9, :pswitch_data_1

    .line 2576
    :goto_1f
    :pswitch_4
    invoke-virtual {v8, v9}, Lcom/roidapp/photogrid/b/k;->a(I)V

    .line 2578
    :cond_45
    if-eqz v10, :cond_46

    .line 2579
    const-string v9, "Layout"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2581
    :cond_46
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->as:I

    if-ne v11, v9, :cond_47

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->at:I

    if-ne v12, v9, :cond_47

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->au:I

    if-eq v13, v9, :cond_48

    .line 2582
    :cond_47
    const-string v9, "Background"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2583
    invoke-virtual {v8, v11}, Lcom/roidapp/photogrid/b/k;->b(I)V

    .line 2584
    invoke-virtual {v8, v12}, Lcom/roidapp/photogrid/b/k;->c(I)V

    .line 2585
    invoke-virtual {v8, v13}, Lcom/roidapp/photogrid/b/k;->d(I)V

    .line 2587
    :cond_48
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ay:F

    cmpl-float v9, v15, v9

    if-nez v9, :cond_49

    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->az:F

    cmpl-float v9, v16, v9

    if-eqz v9, :cond_4a

    .line 2588
    :cond_49
    const-string v9, "Border"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2589
    invoke-virtual {v8, v15}, Lcom/roidapp/photogrid/b/k;->a(F)V

    .line 2590
    move/from16 v0, v16

    invoke-virtual {v8, v0}, Lcom/roidapp/photogrid/b/k;->b(F)V

    .line 2592
    :cond_4a
    sget v9, Lcom/roidapp/photogrid/release/PhotoGridActivity;->av:I

    if-eq v14, v9, :cond_4b

    .line 2593
    const-string v9, "Frame"

    invoke-static {v9, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2594
    invoke-virtual {v8, v14}, Lcom/roidapp/photogrid/b/k;->e(I)V

    .line 2596
    :cond_4b
    if-eqz v2, :cond_4c

    .line 2597
    const-string v2, "Crop"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2598
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v9, 0x0

    aget-object v2, v2, v9

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/roidapp/photogrid/b/k;->g(I)V

    .line 2600
    :cond_4c
    if-eqz v3, :cond_4d

    .line 2601
    const-string v2, "Filter"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2602
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-virtual {v8, v2}, Lcom/roidapp/photogrid/b/k;->f(I)V

    .line 2604
    :cond_4d
    if-eqz v17, :cond_4e

    .line 2605
    const-string v2, "Retouch"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2607
    :cond_4e
    if-eqz v4, :cond_4f

    .line 2608
    const-string v2, "Text"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2610
    :cond_4f
    if-eqz v5, :cond_50

    .line 2611
    const-string v2, "Sticker"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2613
    :cond_50
    if-eqz v6, :cond_18

    .line 2614
    const-string v2, "Draw"

    invoke-static {v2, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_10

    .line 2557
    :cond_51
    const/4 v2, 0x0

    goto/16 :goto_1a

    .line 2558
    :cond_52
    const/4 v3, 0x0

    goto/16 :goto_1b

    .line 2560
    :cond_53
    const/4 v4, 0x0

    goto/16 :goto_1c

    .line 2561
    :cond_54
    const/4 v5, 0x0

    goto/16 :goto_1d

    .line 2562
    :cond_55
    const/4 v6, 0x0

    goto/16 :goto_1e

    .line 2567
    :pswitch_5
    const-string v18, "Instagram"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 2570
    :pswitch_6
    const-string v18, "Original"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 2573
    :pswitch_7
    const-string v18, "Shape"

    move-object/from16 v0, v18

    invoke-static {v0, v7}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1f

    .line 2416
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 2565
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_7
    .end packed-switch
.end method

.method private Z()V
    .locals 7

    .prologue
    const/4 v3, 0x1

    .line 2659
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 2660
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2661
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2707
    :goto_0
    :pswitch_0
    return-void

    .line 2663
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2664
    new-instance v0, Lcom/roidapp/photogrid/release/oo;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/oo;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2667
    :pswitch_2
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2668
    new-instance v0, Lcom/roidapp/photogrid/release/pd;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/pd;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2671
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-ne v0, v3, :cond_0

    .line 2672
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2676
    :goto_1
    new-instance v0, Lcom/roidapp/photogrid/release/ou;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ou;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2674
    :cond_0
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    goto :goto_1

    .line 2679
    :pswitch_4
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2680
    new-instance v0, Lcom/roidapp/photogrid/release/pa;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/pa;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2683
    :pswitch_5
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2684
    new-instance v0, Lcom/roidapp/photogrid/release/ox;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ox;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2687
    :pswitch_6
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2688
    new-instance v0, Lcom/roidapp/photogrid/release/or;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/or;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2691
    :pswitch_7
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2692
    new-instance v0, Lcom/roidapp/photogrid/release/ol;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ol;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2695
    :pswitch_8
    const-string v0, "WideActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2696
    new-instance v0, Lcom/roidapp/photogrid/release/pi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/roidapp/photogrid/release/pi;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2699
    :pswitch_9
    const-string v0, "HighActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2700
    new-instance v0, Lcom/roidapp/photogrid/release/pi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v3, 0x2

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/roidapp/photogrid/release/pi;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2703
    :pswitch_a
    const-string v0, "VideoActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2704
    new-instance v0, Lcom/roidapp/photogrid/release/pg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/pg;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto/16 :goto_0

    .line 2661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_3
        :pswitch_a
        :pswitch_0
        :pswitch_6
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private a(Landroid/content/Intent;Z)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 5110
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_2

    .line 5111
    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_1

    .line 5112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->a([Ljava/lang/String;)V

    :cond_1
    move-object v0, v1

    .line 5146
    :goto_0
    return-object v0

    .line 5116
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {p0, v0, p2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;

    move-result-object v2

    .line 5123
    if-eqz p2, :cond_4

    .line 5124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_3

    .line 5125
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    check-cast v0, Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ng;->a([Ljava/lang/String;)V

    .line 5146
    :cond_3
    :goto_1
    const/4 v0, 0x1

    aget-object v0, v2, v0

    goto :goto_0

    .line 5129
    :cond_4
    const/4 v0, 0x0

    aget-object v0, v2, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 5130
    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 5138
    :pswitch_0
    const v0, 0x7f07015d

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(I)V

    move-object v0, v1

    .line 5139
    goto :goto_0

    .line 5132
    :pswitch_1
    const v0, 0x7f070181

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(I)V

    move-object v0, v1

    .line 5133
    goto :goto_0

    .line 5135
    :pswitch_2
    const v0, 0x7f070026

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(I)V

    move-object v0, v1

    .line 5136
    goto :goto_0

    .line 5130
    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private a(Landroid/graphics/Bitmap;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 5564
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 5565
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 5566
    :cond_0
    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    .line 5567
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    .line 5584
    :goto_0
    return-void

    .line 5570
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_2

    .line 5572
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 5580
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    const/16 v1, 0x88

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 5581
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 5575
    :catch_0
    move-exception v0

    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 5578
    :catch_1
    move-exception v0

    iput-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    goto :goto_1

    .line 5583
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method private static a(Lcom/roidapp/cloudlib/template/d;Z)V
    .locals 20

    .prologue
    .line 1778
    if-nez p0, :cond_1

    .line 1857
    :cond_0
    :goto_0
    return-void

    .line 1781
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 24043
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/d;->b:Ljava/lang/String;

    .line 24047
    move-object/from16 v0, p0

    iget v1, v0, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 24055
    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/roidapp/cloudlib/template/d;->e:Z

    .line 24059
    move-object/from16 v0, p0

    iget-boolean v5, v0, Lcom/roidapp/cloudlib/template/d;->f:Z

    .line 24063
    move-object/from16 v0, p0

    iget-boolean v6, v0, Lcom/roidapp/cloudlib/template/d;->g:Z

    .line 24067
    move-object/from16 v0, p0

    iget v7, v0, Lcom/roidapp/cloudlib/template/d;->h:F

    .line 24071
    move-object/from16 v0, p0

    iget v8, v0, Lcom/roidapp/cloudlib/template/d;->i:F

    .line 24075
    move-object/from16 v0, p0

    iget v9, v0, Lcom/roidapp/cloudlib/template/d;->j:F

    .line 24079
    move-object/from16 v0, p0

    iget v10, v0, Lcom/roidapp/cloudlib/template/d;->k:F

    .line 24083
    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 24103
    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/roidapp/cloudlib/template/d;->q:Ljava/util/List;

    .line 24107
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/roidapp/cloudlib/template/d;->r:Ljava/util/List;

    .line 24111
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/roidapp/cloudlib/template/d;->s:Ljava/util/List;

    .line 25087
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/roidapp/cloudlib/template/d;->m:Ljava/util/List;

    .line 25091
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->n:Ljava/util/List;

    move-object/from16 v16, v0

    .line 25095
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->o:Ljava/util/List;

    move-object/from16 v17, v0

    .line 25099
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->p:Ljava/util/List;

    move-object/from16 v18, v0

    .line 25115
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->t:Ljava/util/List;

    move-object/from16 v19, v0

    .line 1802
    if-eqz p1, :cond_3

    .line 1803
    invoke-virtual {v2, v11}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/List;)V

    .line 1804
    invoke-virtual {v2, v12}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/util/List;)V

    .line 1805
    invoke-virtual {v2, v13}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/util/List;)V

    .line 1806
    invoke-virtual {v2, v14}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/util/List;)V

    .line 1807
    invoke-virtual {v2, v15}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/util/List;)V

    .line 1809
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ln;->d()Ljava/lang/String;

    move-result-object v1

    .line 1810
    if-eqz v1, :cond_2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1811
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/roidapp/cloudlib/template/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ln;->a(Ljava/lang/String;)V

    .line 1812
    invoke-virtual {v2, v10}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1813
    invoke-virtual {v2, v7}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1814
    invoke-virtual {v2, v8}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1815
    invoke-virtual {v2, v9}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 1816
    invoke-virtual {v2, v7}, Lcom/roidapp/photogrid/release/ih;->i(F)V

    .line 1817
    invoke-virtual {v2, v8}, Lcom/roidapp/photogrid/release/ih;->g(F)V

    .line 1818
    invoke-virtual {v2, v9}, Lcom/roidapp/photogrid/release/ih;->h(F)V

    goto/16 :goto_0

    .line 1822
    :cond_3
    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    .line 1823
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->a(Z)V

    .line 1824
    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->b(Z)V

    .line 1825
    invoke-virtual {v2, v6}, Lcom/roidapp/photogrid/release/ih;->c(Z)V

    .line 1826
    invoke-virtual {v2, v11}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/List;)V

    .line 1827
    invoke-virtual {v2, v12}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/util/List;)V

    .line 1828
    invoke-virtual {v2, v13}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/util/List;)V

    .line 1829
    invoke-virtual {v2, v14}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/util/List;)V

    .line 1830
    invoke-virtual {v2, v15}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/util/List;)V

    .line 1832
    move-object/from16 v0, v16

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/util/List;)V

    .line 1833
    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/util/List;)V

    .line 1834
    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/util/List;)V

    .line 1836
    if-eqz v6, :cond_4

    .line 1837
    const/16 v1, 0xf

    .line 1839
    :cond_4
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1840
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->p(I)V

    .line 1841
    invoke-virtual {v2, v7}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 1842
    invoke-virtual {v2, v8}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 1843
    invoke-virtual {v2, v9}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 1844
    invoke-virtual {v2, v10}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 1846
    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/util/List;)V

    .line 1848
    const/16 v3, 0x9

    if-ge v1, v3, :cond_0

    .line 1849
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PhotoGridActivity;)Z
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aU:Z

    return v0
.end method

.method private aa()Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 2846
    const/4 v0, 0x0

    .line 2847
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v1, :cond_0

    .line 2848
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2849
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->b()Ljava/lang/String;

    move-result-object v0

    .line 2852
    :cond_0
    if-eqz v0, :cond_1

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2853
    :goto_0
    return-object v0

    .line 2852
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    goto :goto_0
.end method

.method private ab()V
    .locals 2

    .prologue
    .line 3116
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 3138
    :pswitch_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac()V

    .line 3141
    :goto_0
    return-void

    .line 3120
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    if-nez v0, :cond_0

    .line 3121
    new-instance v0, Lcom/roidapp/photogrid/common/bc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bc;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    .line 3123
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/bc;->a(Ljava/lang/ref/WeakReference;)V

    goto :goto_0

    .line 3126
    :pswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    .line 3128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    if-nez v0, :cond_1

    .line 3129
    new-instance v0, Lcom/roidapp/photogrid/common/bc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/bc;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    .line 3131
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/common/bc;->a(Ljava/lang/ref/WeakReference;)V

    goto :goto_0

    .line 3134
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac()V

    goto :goto_0

    .line 3116
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private ac()V
    .locals 1

    .prologue
    .line 3147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    if-eqz v0, :cond_0

    .line 3148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bc;->a()V

    .line 3149
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m:Lcom/roidapp/photogrid/common/bc;

    .line 3151
    :cond_0
    return-void
.end method

.method private ad()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 3499
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    sparse-switch v0, :sswitch_data_0

    .line 3513
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3517
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 3518
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v0

    .line 3519
    const v1, 0x3f4ccccd    # 0.8f

    cmpl-float v1, v0, v1

    if-nez v1, :cond_1

    .line 3520
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v1, "4 : 5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3527
    :cond_0
    :goto_1
    return-void

    .line 3502
    :sswitch_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 3508
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 3504
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3505
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 3521
    :cond_1
    const v1, 0x3ff47ae1    # 1.91f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_2

    .line 3522
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v1, "1.91 : 1"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 3524
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v1, "1 : 1"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 3499
    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0xa -> :sswitch_0
    .end sparse-switch

    .line 3502
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private ae()V
    .locals 2

    .prologue
    .line 3600
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3601
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702cb

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 3606
    :cond_0
    :goto_0
    return-void

    .line 3602
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3603
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0702ca

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private af()Ljava/lang/String;
    .locals 5

    .prologue
    .line 4706
    const-string v1, ""

    .line 4707
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    .line 4708
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    .line 4709
    if-eqz v0, :cond_0

    .line 4710
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 4711
    instance-of v3, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v3, :cond_2

    .line 4712
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->r()Ljava/lang/String;

    move-result-object v0

    .line 4713
    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    :goto_1
    move-object v1, v0

    .line 4717
    goto :goto_0

    .line 4720
    :cond_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4721
    const v0, 0x7f0702b8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 4722
    :cond_1
    return-object v1

    :cond_2
    move-object v0, v1

    goto :goto_1
.end method

.method private ag()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 5545
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-eqz v0, :cond_0

    .line 5546
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    .line 5547
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 5549
    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    if-eq v0, v3, :cond_1

    .line 5550
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 5551
    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v1, :cond_1

    .line 5552
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 5554
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    if-eq v0, v3, :cond_2

    .line 5555
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 5556
    if-eqz v0, :cond_2

    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v1, :cond_2

    .line 5557
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 49587
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    .line 49588
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 49589
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 49591
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 49592
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 49593
    iput-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bf:Landroid/graphics/Bitmap;

    .line 5560
    :cond_4
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    .line 5561
    return-void
.end method

.method private ah()V
    .locals 2

    .prologue
    .line 5599
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 5600
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 2622
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    .line 2623
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 2624
    if-nez v2, :cond_1

    .line 2656
    :cond_0
    :goto_0
    return-void

    .line 2626
    :cond_1
    array-length v3, v2

    move v1, v0

    :goto_1
    if-ge v1, v3, :cond_4

    .line 2627
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v5, 0x8

    if-ne v4, v5, :cond_3

    .line 2628
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/imagelib/filter/aa;->c()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    .line 2629
    if-eqz v4, :cond_2

    .line 2630
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2626
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 2633
    :cond_3
    aget-object v4, v2, v1

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 2634
    if-eqz v4, :cond_2

    .line 2635
    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    .line 2636
    if-eqz v4, :cond_2

    .line 2638
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2640
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2644
    :cond_4
    if-ge v0, v3, :cond_0

    .line 2645
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    .line 2646
    if-eqz v0, :cond_0

    .line 2647
    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    .line 2648
    if-eqz v0, :cond_0

    .line 2649
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "globalFilter/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0
.end method

.method private d(ZZ)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 986
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 988
    if-eqz p1, :cond_3

    .line 989
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    .line 990
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 992
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_1

    .line 993
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->f()V

    .line 1002
    :cond_1
    :goto_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    if-eqz p2, :cond_2

    .line 1003
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 1008
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 1010
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V()V

    .line 1011
    return-void

    .line 996
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 997
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 998
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->h()V

    goto :goto_0
.end method

.method private e(II)I
    .locals 2

    .prologue
    .line 4041
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    .line 4042
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 4043
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v1, p1, p2}, Landroid/graphics/Region;->contains(II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4048
    :goto_1
    return v0

    .line 4042
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4048
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method private e(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 5682
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 5683
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 5684
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 5685
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 5686
    const v1, 0x7f07032f

    new-instance v2, Lcom/roidapp/photogrid/release/ma;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ma;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5693
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 5694
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 5695
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 5696
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 5697
    return-void
.end method

.method private e(ZZ)V
    .locals 9

    .prologue
    const/16 v3, 0xa5

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    .line 1993
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x11

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 1994
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2099
    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Z)V

    .line 2101
    return-void

    .line 1996
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 1997
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 1998
    new-instance v0, Lcom/roidapp/photogrid/release/ms;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ms;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 1999
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2000
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2001
    const-string v1, "new_feature_resize"

    invoke-interface {v0, v1, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2002
    iput-boolean v8, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af:Z

    .line 2003
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "new_feature_resize"

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 2007
    :pswitch_2
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2008
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2009
    new-instance v0, Lcom/roidapp/photogrid/release/ne;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ne;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 2010
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    .line 2021
    :pswitch_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 2032
    :goto_1
    :pswitch_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2033
    new-instance v0, Lcom/roidapp/photogrid/release/my;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/my;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 2034
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_0

    .line 2023
    :pswitch_5
    const-string v0, "GridActivity/Single/Instagram"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    goto :goto_1

    .line 2026
    :pswitch_6
    const-string v0, "GridActivity/Single/Original"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    goto :goto_1

    .line 2029
    :pswitch_7
    const-string v0, "GridActivity/Single/Shape"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    goto :goto_1

    .line 2037
    :pswitch_8
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2038
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2039
    new-instance v0, Lcom/roidapp/photogrid/release/nc;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/nc;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 2040
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 2043
    :pswitch_9
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2044
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2045
    new-instance v0, Lcom/roidapp/photogrid/release/na;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/na;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 2046
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 2049
    :pswitch_a
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 2050
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2051
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2052
    new-instance v0, Lcom/roidapp/photogrid/release/mw;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/mw;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    goto/16 :goto_0

    .line 2056
    :pswitch_b
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2057
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2058
    new-instance v0, Lcom/roidapp/photogrid/release/mq;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move v1, p2

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/mq;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 2059
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto/16 :goto_0

    .line 2062
    :pswitch_c
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 2063
    const-string v0, "WideActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2064
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2065
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2067
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0203a6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2068
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2070
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2071
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    const v1, 0x7f0701ab

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2072
    new-instance v0, Lcom/roidapp/photogrid/release/nl;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct {v0, p2, p0, v1, v2}, Lcom/roidapp/photogrid/release/nl;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    goto/16 :goto_0

    .line 2075
    :pswitch_d
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 2076
    const-string v0, "HighActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 2077
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 2078
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2080
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f02041e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2081
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2082
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2083
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    const v1, 0x7f0701b6

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 2084
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2085
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2086
    new-instance v0, Lcom/roidapp/photogrid/release/mu;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct {v0, p2, p0, v1, v2}, Lcom/roidapp/photogrid/release/mu;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    goto/16 :goto_0

    .line 2089
    :pswitch_e
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 2090
    const-string v0, "VideoActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    .line 26603
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 2092
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2093
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v8}, Landroid/widget/RelativeLayout;->setGravity(I)V

    .line 2094
    new-instance v0, Lcom/roidapp/photogrid/release/ng;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct {v0, p2, p0, v1, v2}, Lcom/roidapp/photogrid/release/ng;-><init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    goto/16 :goto_0

    .line 1994
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_2
        :pswitch_3
        :pswitch_e
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_9
    .end packed-switch

    .line 2021
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_7
    .end packed-switch
.end method

.method private f(ZZ)V
    .locals 10

    .prologue
    const/4 v5, 0x0

    .line 5190
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah:Z

    .line 5191
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ai:Z

    .line 5192
    new-instance v1, Lcom/roidapp/photogrid/common/be;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ak:Landroid/widget/RelativeLayout;

    const/4 v4, 0x0

    const/4 v6, 0x1

    const-wide/16 v8, 0x7d0

    move-object v2, p0

    move v7, p2

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/photogrid/common/be;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;IZZJ)V

    .line 5195
    const-string v0, ""

    .line 5196
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v2, :pswitch_data_0

    .line 5223
    :goto_0
    :pswitch_0
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/common/be;->a(Ljava/lang/CharSequence;)V

    .line 5226
    return-void

    .line 5199
    :pswitch_1
    if-eqz p1, :cond_0

    .line 5200
    const v0, 0x7f07029e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5202
    :cond_0
    const v0, 0x7f07029c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5209
    :pswitch_2
    if-eqz p1, :cond_1

    .line 5210
    const v0, 0x7f070388

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5212
    :cond_1
    const v0, 0x7f070389

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5216
    :pswitch_3
    if-eqz p1, :cond_2

    .line 5217
    const v0, 0x7f07029d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5219
    :cond_2
    const v0, 0x7f07029b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 5196
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private h(Z)V
    .locals 2

    .prologue
    .line 477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 478
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/release/mm;->a(ZZ)V

    .line 480
    :cond_0
    return-void
.end method

.method private i(Z)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 2192
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x9

    if-eq v1, v2, :cond_0

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 2208
    :cond_0
    :goto_0
    return v0

    .line 2195
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 2196
    const-string v2, "REGISTER_COUNT"

    const/4 v3, -0x3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 2199
    const/4 v3, 0x2

    if-ge v2, v3, :cond_2

    .line 2200
    if-eqz p1, :cond_0

    .line 2201
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "REGISTER_COUNT"

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0

    .line 2204
    :cond_2
    const/4 v1, 0x5

    if-ge v2, v1, :cond_0

    .line 2208
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static j()I
    .locals 1

    .prologue
    .line 645
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 646
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    .line 648
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j(Z)Z
    .locals 6

    .prologue
    const/16 v5, 0x9

    const/4 v2, 0x0

    const v4, 0x7f0d028d

    const/4 v1, 0x1

    .line 4420
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_1d

    .line 4421
    const-string v0, "FragmentBottomMain"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4422
    const-string v0, "FragmentBottomMain"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cs;

    .line 4423
    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/cs;->c()Z

    move-result v0

    if-eqz v0, :cond_15

    move v0, v1

    .line 4552
    :goto_0
    return v0

    .line 4426
    :cond_0
    const-string v0, "FragmentIEPanel"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4427
    const-string v0, "FragmentIEPanel"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ez;

    .line 4428
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ez;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    move v0, v1

    .line 4429
    goto :goto_0

    .line 4432
    :cond_1
    if-eqz v0, :cond_2

    .line 4433
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ez;->c()V

    .line 4435
    :cond_2
    const-string v0, "FragmentIEPanel"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4436
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4437
    goto :goto_0

    .line 4439
    :cond_3
    const-string v0, "FragmentGridEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4440
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dc;

    .line 4441
    if-eqz v0, :cond_5

    .line 4442
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    move v0, v1

    .line 4443
    goto :goto_0

    .line 4445
    :cond_4
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->b()V

    .line 4448
    :cond_5
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4449
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4450
    goto :goto_0

    .line 4451
    :cond_6
    const-string v0, "FragmentEditTip"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 4452
    const-string v0, "FragmentEditTip"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_7

    .line 4454
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 4456
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-nez v0, :cond_8

    .line 4457
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    :goto_1
    move v0, v1

    .line 4462
    goto/16 :goto_0

    .line 4460
    :cond_8
    new-instance v0, Lcom/roidapp/photogrid/release/dc;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/dc;-><init>()V

    const-string v2, "FragmentGridEdit"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_1

    .line 4463
    :cond_9
    const-string v0, "FragmentFreeEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 4464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_a

    .line 4465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 4467
    :cond_a
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4468
    goto/16 :goto_0

    .line 4469
    :cond_b
    const-string v0, "FragmentSticker"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 4470
    const-string v0, "FragmentSticker"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fn;

    .line 4473
    if-eqz v0, :cond_c

    .line 4474
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fn;->a()V

    .line 4476
    :cond_c
    const-string v0, "FragmentSticker"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4477
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4478
    goto/16 :goto_0

    .line 4479
    :cond_d
    const-string v0, "fragmentEditVideo"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 4480
    const-string v0, "fragmentEditVideo"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dk;

    .line 4481
    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->b()Z

    move-result v0

    if-eqz v0, :cond_15

    move v0, v1

    .line 4482
    goto/16 :goto_0

    .line 4484
    :cond_e
    const-string v0, "FragmentDoodle"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    const-string v0, "FragmentDoodleTop"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 4485
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_10

    .line 4486
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/az;->a(Z)V

    .line 4487
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->g()V

    .line 4489
    :cond_10
    const-string v0, "FragmentDoodle"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4490
    const-string v0, "FragmentDoodleTop"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4491
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 4492
    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4493
    goto/16 :goto_0

    .line 4494
    :cond_11
    const-string v0, "FragmentTextEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 4495
    const-string v0, "FragmentTextEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4499
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4500
    goto/16 :goto_0

    .line 4501
    :cond_12
    sget-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 4502
    sget-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/s;

    .line 4503
    if-nez v0, :cond_13

    move v0, v2

    goto/16 :goto_0

    .line 4504
    :cond_13
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/s;->h()Z

    move-result v0

    if-nez v0, :cond_14

    .line 4505
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v4, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    :cond_14
    move v0, v1

    .line 4507
    goto/16 :goto_0

    .line 4510
    :cond_15
    if-eqz p1, :cond_1a

    .line 4511
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 4512
    const-string v3, "isSaveFirst"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->X:Z

    if-eqz v0, :cond_19

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x4

    if-eq v0, v3, :cond_19

    .line 4513
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v5, :cond_16

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v3, 0xa

    if-ne v0, v3, :cond_17

    .line 46733
    :cond_16
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 46734
    const v3, 0x7f070311

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f070043

    new-instance v4, Lcom/roidapp/photogrid/release/mf;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/mf;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f070044

    new-instance v4, Lcom/roidapp/photogrid/release/me;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/me;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 46752
    new-instance v3, Lcom/roidapp/photogrid/release/mg;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/mg;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 46758
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 4518
    :goto_2
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->X:Z

    move v0, v1

    .line 4519
    goto/16 :goto_0

    .line 46768
    :cond_17
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 46769
    const v3, 0x7f030106

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 46770
    const v0, 0x7f0d040f

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 46771
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v4, v5, :cond_18

    .line 46772
    const v4, 0x7f070252

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 46774
    :cond_18
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 46775
    const v4, 0x108008a

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v4, 0x7f070253

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v3, 0x7f07024f

    new-instance v4, Lcom/roidapp/photogrid/release/mh;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/mh;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 46788
    new-instance v3, Lcom/roidapp/photogrid/release/mi;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/mi;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 46794
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_2

    .line 4521
    :cond_19
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1b

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1b

    .line 4522
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W()V

    :cond_1a
    :goto_3
    move v0, v2

    .line 4552
    goto/16 :goto_0

    .line 4534
    :cond_1b
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->H:Z

    if-eqz v0, :cond_1c

    .line 4535
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U()V

    goto :goto_3

    .line 4537
    :cond_1c
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    goto :goto_3

    .line 4543
    :cond_1d
    const-string v0, "FragmentGridEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 4544
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dc;

    .line 4545
    if-eqz v0, :cond_1a

    .line 4546
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->a()Z

    move-result v0

    if-eqz v0, :cond_1a

    move v0, v1

    .line 4547
    goto/16 :goto_0
.end method

.method private k(Z)V
    .locals 2

    .prologue
    .line 6344
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6349
    :cond_0
    :goto_0
    return-void

    .line 6345
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    sget-object v1, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 6346
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/roidapp/imagelib/filter/s;

    if-eqz v1, :cond_0

    .line 6347
    check-cast v0, Lcom/roidapp/imagelib/filter/s;

    .line 6348
    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/s;->a(Z)V

    goto :goto_0
.end method


# virtual methods
.method protected final B()Z
    .locals 1

    .prologue
    .line 393
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    return v0
.end method

.method public final G()V
    .locals 1

    .prologue
    .line 4366
    const-string v0, "fragmentEditVideo"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->a()V

    .line 4367
    return-void
.end method

.method public final declared-synchronized H()V
    .locals 3

    .prologue
    .line 4612
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4614
    const v0, 0x7f0d028d

    new-instance v1, Lcom/roidapp/photogrid/release/ez;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/ez;-><init>()V

    const-string v2, "FragmentIEPanel"

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4615
    monitor-exit p0

    return-void

    .line 4612
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized I()V
    .locals 3

    .prologue
    .line 4620
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4621
    const v0, 0x7f0d028d

    new-instance v1, Lcom/roidapp/photogrid/release/fn;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/fn;-><init>()V

    const-string v2, "FragmentSticker"

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4622
    monitor-exit p0

    return-void

    .line 4620
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final J()V
    .locals 1

    .prologue
    .line 4677
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad()V

    .line 4679
    const-string v0, "FragmentBottomMain"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cs;

    .line 4680
    if-eqz v0, :cond_0

    .line 4681
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/cs;->b()V

    .line 4683
    :cond_0
    return-void
.end method

.method public final declared-synchronized K()V
    .locals 3

    .prologue
    .line 5154
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 5155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 5156
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    .line 5157
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 5158
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5160
    const v0, 0x7f0d03eb

    new-instance v1, Lcom/roidapp/photogrid/release/hk;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/hk;-><init>()V

    sget-object v2, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 5165
    :goto_0
    const v0, 0x7f0d028d

    new-instance v1, Lcom/roidapp/photogrid/release/dk;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/dk;-><init>()V

    const-string v2, "fragmentEditVideo"

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5170
    :goto_1
    monitor-exit p0

    return-void

    .line 5162
    :cond_0
    :try_start_1
    sget-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 5154
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 5167
    :cond_1
    :try_start_2
    sget-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 5168
    const v0, 0x7f0d028d

    new-instance v1, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1
.end method

.method public final L()V
    .locals 3

    .prologue
    .line 5254
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aU:Z

    if-eqz v0, :cond_0

    .line 5281
    :goto_0
    return-void

    .line 5258
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aU:Z

    .line 5259
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 5260
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 5261
    const v1, 0x7f070192

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 5262
    const v1, 0x7f07024f

    new-instance v2, Lcom/roidapp/photogrid/release/mj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/mj;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5271
    new-instance v1, Lcom/roidapp/photogrid/release/mk;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/mk;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 5279
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 5280
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0
.end method

.method public final M()V
    .locals 1

    .prologue
    .line 5288
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 5289
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 5290
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 5291
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->a()V

    .line 5295
    :goto_0
    return-void

    .line 5293
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    goto :goto_0
.end method

.method public final N()V
    .locals 2

    .prologue
    .line 5299
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 5301
    return-void
.end method

.method public final O()Lcom/roidapp/photogrid/release/PhotoView;
    .locals 1

    .prologue
    .line 5310
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    return-object v0
.end method

.method public final P()Lcom/roidapp/photogrid/release/az;
    .locals 1

    .prologue
    .line 5321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    return-object v0
.end method

.method public final Q()V
    .locals 1

    .prologue
    .line 5701
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah:Z

    .line 5702
    return-void
.end method

.method public final R()Z
    .locals 1

    .prologue
    .line 6387
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    return v0
.end method

.method public final a()V
    .locals 3

    .prologue
    .line 6335
    sget-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6336
    const-string v0, "FragmentSticker"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 6337
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 6338
    const v1, 0x7f0d028d

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 6340
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1576
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq p1, v0, :cond_0

    .line 1577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1579
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 888
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 889
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 890
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 891
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 892
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 893
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 894
    const-string v1, "modeStr"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 895
    const-string v1, "entry_ga_tag"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 896
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 897
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 898
    return-void
.end method

.method public final a(III)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 872
    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 873
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 874
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 875
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 876
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 877
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 878
    const-string v1, "entry_from"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 879
    const-string v1, "entry_type"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 880
    const-string v1, "edit_suppot_filter"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 881
    const-string v1, "entry_ga_tag"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 882
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 883
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 884
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 885
    return-void
.end method

.method public final a(IIZ)V
    .locals 8

    .prologue
    const/16 v5, 0x9

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 1594
    .line 1596
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1598
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "REGISTER_COUNT"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1610
    :cond_0
    iput v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    .line 1612
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_1

    .line 1613
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 1614
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x4

    if-ne v1, v3, :cond_6

    const/4 v1, 0x4

    if-eq p1, v1, :cond_6

    .line 1615
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->h()V

    .line 1619
    :goto_0
    iput-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    .line 1621
    :cond_1
    if-eq p1, v4, :cond_8

    .line 1622
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-nez v1, :cond_7

    .line 1623
    new-instance v1, Lcom/roidapp/photogrid/release/az;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/az;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    .line 1627
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v1, :cond_2

    .line 1628
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/mm;->f()V

    .line 1630
    :cond_2
    new-instance v1, Lcom/roidapp/photogrid/release/PhotoView;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/PhotoView;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    .line 1639
    :cond_3
    :goto_2
    if-ne p1, v5, :cond_9

    .line 1640
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1645
    :goto_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 1646
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V()V

    .line 1650
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v1, :pswitch_data_0

    .line 1660
    :cond_4
    :goto_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 1661
    packed-switch p1, :pswitch_data_1

    :goto_5
    :pswitch_0
    move v1, v0

    .line 1745
    :goto_6
    sput p1, Lcom/roidapp/photogrid/common/az;->q:I

    .line 1747
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ak()I

    move-result v4

    .line 1748
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v5

    if-le v5, v4, :cond_5

    .line 1749
    new-array v5, v4, [Lcom/roidapp/photogrid/release/ig;

    .line 1750
    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-static {v6, v2, v5, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1751
    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1752
    iput-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 1755
    :cond_5
    iput-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 1756
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab()V

    .line 1767
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->S()V

    .line 1768
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 1770
    :goto_7
    return-void

    .line 1617
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->i()V

    goto :goto_0

    .line 1625
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    .line 1633
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v1, :cond_3

    .line 1634
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/az;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1635
    iput-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    goto :goto_2

    .line 1642
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 1652
    :pswitch_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-lez v1, :cond_4

    .line 1653
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->f()V

    goto :goto_4

    .line 1663
    :pswitch_2
    sget-object v1, Lcom/roidapp/photogrid/b/g;->b:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 1664
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    if-ne v1, v0, :cond_a

    .line 1665
    const/16 v1, 0xf

    iput v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 1666
    const/4 p1, 0x5

    .line 1671
    :goto_8
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    move v1, v0

    .line 1672
    goto :goto_6

    .line 1669
    :cond_a
    const/16 v1, 0xf

    iput v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    goto :goto_8

    .line 1675
    :pswitch_3
    sget-object v1, Lcom/roidapp/photogrid/b/g;->a:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 1676
    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    if-eq v1, v0, :cond_b

    .line 1677
    const/16 v1, 0xf

    iput v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 1681
    :cond_b
    :pswitch_4
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v1, v4, :cond_c

    .line 1682
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->a()V

    .line 1688
    :cond_c
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->al()V

    .line 1691
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->F:Z

    move v1, v0

    .line 1693
    goto/16 :goto_6

    .line 1695
    :pswitch_5
    sget-object v1, Lcom/roidapp/photogrid/b/g;->c:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 1696
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    move v1, v0

    .line 1697
    goto/16 :goto_6

    .line 1699
    :pswitch_6
    sget-object v1, Lcom/roidapp/photogrid/b/g;->d:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 1700
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v1, v4, :cond_d

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v1, v5, :cond_d

    .line 1701
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aj()V

    .line 1702
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/imagelib/filter/aa;->f()V

    .line 1703
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 1705
    :cond_d
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v1, v5, :cond_e

    .line 1706
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 1707
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->j(Z)V

    .line 1708
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->o(I)V

    .line 1709
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "first_in"

    invoke-interface {v1, v4, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1710
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    move v1, v0

    goto/16 :goto_6

    .line 1719
    :cond_e
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->b()V

    move v1, v2

    .line 1722
    goto/16 :goto_6

    .line 1724
    :pswitch_7
    if-eqz p3, :cond_f

    .line 1725
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 1726
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aF()Lcom/roidapp/cloudlib/template/d;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/cloudlib/template/d;Z)V

    move v1, v0

    .line 1727
    goto/16 :goto_6

    .line 1729
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 1730
    invoke-direct {p0, v2, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 1731
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 1732
    const-class v2, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-virtual {v1, p0, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1733
    const-string v2, "infoc_tag"

    const/4 v3, 0x5

    if-ne p2, v3, :cond_10

    const/4 v0, 0x2

    :cond_10
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1735
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 1736
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 1737
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    goto/16 :goto_7

    .line 1741
    :pswitch_8
    sget-object v1, Lcom/roidapp/photogrid/b/g;->f:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    goto/16 :goto_5

    .line 1650
    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
    .end packed-switch

    .line 1661
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final declared-synchronized a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 3017
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 3044
    :goto_0
    monitor-exit p0

    return-void

    .line 3021
    :cond_0
    const v0, 0x7f0d028d

    if-ne p1, v0, :cond_4

    .line 3023
    :try_start_1
    const-string v0, "FragmentDoodle"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3024
    const-string v0, "xxxxx"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l:Ljava/lang/String;

    .line 3026
    :cond_1
    iput-object p3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    .line 3033
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 3034
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_3

    instance-of v1, p2, Lcom/roidapp/photogrid/release/ga;

    if-eqz v1, :cond_3

    .line 3035
    const/high16 v1, 0x7f040000

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(II)Landroid/support/v4/app/FragmentTransaction;

    .line 3037
    :cond_3
    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3039
    :try_start_2
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 3041
    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 3017
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 3027
    :cond_4
    const v0, 0x7f0d03ec

    if-ne p1, v0, :cond_5

    .line 3029
    :try_start_4
    iput-object p3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    goto :goto_1

    .line 3030
    :cond_5
    const v0, 0x7f0d03ed

    if-ne p1, v0, :cond_2

    .line 3031
    iput-object p3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1
.end method

.method public final a(IZ)V
    .locals 2

    .prologue
    .line 932
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 933
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->x(I)V

    .line 934
    if-eqz p2, :cond_1

    .line 935
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v0

    .line 936
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    .line 940
    :goto_1
    if-eqz p2, :cond_2

    .line 941
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->l()V

    .line 946
    :goto_2
    return-void

    .line 936
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 938
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/mm;->a(Z)V

    goto :goto_1

    .line 943
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->k()V

    .line 944
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->l()V

    goto :goto_2
.end method

.method public final a(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 3047
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3048
    :cond_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 3066
    :cond_1
    :goto_0
    return-void

    .line 3061
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 3062
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3063
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 2

    .prologue
    .line 5740
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/cloudlib/template/d;Z)V

    .line 5741
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 5742
    const-string v0, "FragmentLayout"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fb;

    .line 5743
    if-eqz v0, :cond_0

    .line 5744
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fb;->a()V

    .line 5746
    :cond_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 5749
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J()V

    .line 5754
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C:Z

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->D:Z

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(ZZ)V

    .line 5755
    return-void

    .line 5751
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 5752
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/b/b;I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v1, 0x0

    .line 6297
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->N()I

    move-result v2

    .line 6298
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v2, :cond_0

    if-nez p2, :cond_1

    .line 6315
    :cond_0
    :goto_0
    return-void

    .line 6299
    :cond_1
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k(Z)V

    .line 6300
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {p2}, Lcom/roidapp/imagelib/b/b;->b()Lcom/roidapp/imagelib/b/b;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/roidapp/imagelib/filter/aa;->a(Lcom/roidapp/imagelib/b/b;)V

    .line 6301
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/aa;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 6302
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/roidapp/imagelib/filter/aa;->a(I)V

    .line 6303
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    move v0, v1

    .line 6305
    :goto_1
    if-ge v0, v2, :cond_2

    .line 6306
    aget-object v4, v3, v0

    iput-object v6, v4, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 6307
    aget-object v4, v3, v0

    .line 50199
    iput-object v6, v4, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 50200
    const/16 v5, 0x64

    iput v5, v4, Lcom/roidapp/photogrid/release/ig;->l:I

    .line 50201
    new-instance v5, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v5}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v5, v4, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 6305
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 6310
    :cond_2
    invoke-virtual {p0, v1, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0
.end method

.method public final declared-synchronized a(Lcom/roidapp/photogrid/release/ra;)V
    .locals 3

    .prologue
    .line 4602
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4604
    const v0, 0x7f0d028d

    invoke-static {p1}, Lcom/roidapp/photogrid/release/ga;->a(Lcom/roidapp/photogrid/release/ra;)Lcom/roidapp/photogrid/release/ga;

    move-result-object v1

    const-string v2, "FragmentTextEdit"

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4605
    monitor-exit p0

    return-void

    .line 4602
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 11

    .prologue
    .line 2813
    .line 36819
    const-string v0, "sharePhoto"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 36820
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 36821
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 36823
    iget-object v8, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    .line 36825
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 36826
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->h()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 36830
    :cond_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 36831
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aa()Ljava/lang/String;

    move-result-object v5

    .line 36832
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ap()I

    move-result v1

    mul-int/2addr v0, v1

    int-to-long v2, v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->at()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v2, v3, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(JZ)I

    move-result v10

    .line 36833
    const-string v0, "SharePage_View"

    const-string v1, "Edit_Share"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36834
    const/16 v1, 0xf01

    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->at()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v6, ""

    :goto_1
    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/br;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    .line 36837
    :goto_2
    return-void

    .line 36832
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ar()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 36834
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aq()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 36838
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V()V

    .line 36839
    const-string v0, "SharePage_View"

    const-string v1, "Edit_Share"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36840
    const/16 v1, 0xf01

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/br;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    goto :goto_2
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 852
    const-string v0, "FragmentDoodle"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cy;

    .line 853
    if-eqz v0, :cond_0

    .line 854
    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/cy;->a(Z)V

    .line 856
    :cond_0
    return-void
.end method

.method public final a(ZI)V
    .locals 4

    .prologue
    .line 1367
    if-eqz p1, :cond_0

    .line 1368
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07028a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1372
    :goto_0
    return-void

    .line 1370
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701a0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 2989
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    if-nez p1, :cond_1

    .line 3007
    :cond_0
    :goto_0
    return v0

    .line 2992
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 2993
    if-eqz v1, :cond_0

    .line 2994
    const-string v2, "FragmentDoodleTop"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v2, :cond_2

    .line 2995
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/az;->a(Z)V

    .line 2997
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 2998
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 3000
    :try_start_0
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 3005
    :goto_1
    const/4 v0, 0x1

    goto :goto_0

    .line 3002
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_1
.end method

.method public final a(ZZ)Z
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/16 v6, -0x14

    const/4 v7, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1873
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1874
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C:Z

    .line 1875
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->D:Z

    .line 1878
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 1880
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_1

    .line 1882
    :cond_0
    const-string v0, "AddDeco"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 1883
    const-string v0, "181"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    move v0, v2

    .line 1988
    :goto_0
    return v0

    .line 1888
    :cond_1
    iput-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    .line 1891
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 1892
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 1893
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoView;->a(Z)V

    .line 1895
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 1897
    if-eqz p2, :cond_4

    .line 1898
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 1899
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_3

    .line 1900
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->i()V

    .line 1903
    :cond_3
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 1904
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ln;->c()V

    .line 1905
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 1908
    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    .line 1909
    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 1910
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->o(Z)V

    .line 1911
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ah()V

    .line 1912
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 1913
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->E()V

    .line 25262
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 25264
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v4, :pswitch_data_0

    .line 1918
    :cond_4
    :goto_1
    :pswitch_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ap:Z

    if-eqz v0, :cond_7

    .line 1924
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v0

    .line 1925
    if-eqz v0, :cond_6

    .line 1926
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    .line 1927
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 1928
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_2

    .line 25269
    :pswitch_1
    const-string v4, "state_single"

    invoke-virtual {p0, v4, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 25270
    const-string v5, "single_mode"

    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 25272
    const-string v5, "background_bg_blur"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->v(Z)V

    .line 25276
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae()V

    .line 25279
    :pswitch_2
    const-string v4, "state_grid"

    invoke-virtual {p0, v4, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 25280
    const-string v5, "background_state_no_bg"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 25281
    const-string v5, "background_color_position"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 25282
    const-string v5, "background_shape_index"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->g(I)V

    .line 25283
    const-string v5, "background_pattern_index0"

    invoke-interface {v4, v5, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 25284
    const-string v5, "background_pattern_index1"

    invoke-interface {v4, v5, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    goto/16 :goto_1

    .line 25288
    :pswitch_3
    const-string v4, "state_free"

    invoke-virtual {p0, v4, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 25290
    const-string v5, "background_color_position"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 25292
    const-string v5, "background_pattern_index0"

    const/4 v6, 0x2

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 25293
    const-string v5, "background_pattern_index1"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 25294
    const-string v5, "background_custom_image"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 25295
    const-string v5, "background_custom_image_path_original"

    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/lang/String;)V

    .line 25296
    const-string v5, "background_custom_image_path_crop"

    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 1932
    :cond_6
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    .line 1933
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ap:Z

    .line 1936
    :cond_7
    const/16 v0, 0xc

    invoke-virtual {p0, v2, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZI)V

    .line 1937
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 1939
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_1

    .line 1984
    :cond_8
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(ZZ)V

    :goto_3
    move v0, v1

    .line 1988
    goto/16 :goto_0

    .line 1941
    :pswitch_5
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1949
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 1950
    packed-switch v0, :pswitch_data_2

    .line 1978
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(ZZ)V

    goto :goto_3

    .line 1956
    :pswitch_7
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ln;->b()I

    move-result v4

    if-eq v4, v0, :cond_9

    .line 1957
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 1958
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    .line 26043
    new-instance v3, Lcom/roidapp/photogrid/release/ll;

    invoke-direct {v3, p0, p0}, Lcom/roidapp/photogrid/release/ll;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lo;)V

    sget-object v4, Lcom/roidapp/baselib/c/c;->EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

    new-array v5, v1, [Ljava/lang/Integer;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v2

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/photogrid/release/ll;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_3

    .line 1960
    :cond_9
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v3

    .line 1961
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/ln;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 1962
    if-eqz v3, :cond_a

    .line 1963
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah()V

    .line 1964
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    .line 26047
    new-instance v4, Lcom/roidapp/photogrid/release/lm;

    invoke-direct {v4, p0, p0, v0}, Lcom/roidapp/photogrid/release/lm;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/release/lo;I)V

    sget-object v0, Lcom/roidapp/baselib/c/c;->EXECUTOR_SHAPE:Ljava/util/concurrent/Executor;

    new-array v5, v1, [Ljava/lang/String;

    aput-object v3, v5, v2

    invoke-virtual {v4, v0, v5}, Lcom/roidapp/photogrid/release/lm;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_3

    .line 1966
    :cond_a
    if-nez p1, :cond_b

    .line 1967
    const-string v0, "FragmentLayout"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fb;

    .line 1968
    if-eqz v0, :cond_b

    .line 1969
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fb;->a()V

    .line 1972
    :cond_b
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(ZZ)V

    goto :goto_3

    .line 25264
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 1939
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_6
        :pswitch_6
    .end packed-switch

    .line 1950
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 5760
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0700e6

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 49765
    if-eqz v0, :cond_0

    .line 49766
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 49769
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 49770
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Shape/Error/Toast/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 49772
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->p(Z)V

    .line 49773
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 49774
    invoke-virtual {p0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 5761
    return-void
.end method

.method public final declared-synchronized b(I)V
    .locals 10

    .prologue
    const/4 v9, 0x7

    const/4 v8, 0x3

    const/4 v7, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 4064
    monitor-enter p0

    :try_start_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v8, :cond_1

    .line 4184
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 4068
    :cond_1
    if-nez p1, :cond_2

    .line 4069
    const/4 v0, 0x0

    :try_start_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 4070
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 4071
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_2

    .line 4072
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(Z)V

    .line 4077
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 4078
    iput p1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    move v4, v2

    .line 4079
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 4080
    const/4 v3, 0x0

    .line 4081
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    add-int/lit8 v5, v4, 0x1

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 4082
    if-eqz v0, :cond_3

    instance-of v5, v0, Lcom/roidapp/photogrid/release/if;

    if-eqz v5, :cond_3

    .line 4083
    check-cast v0, Lcom/roidapp/photogrid/release/if;

    move-object v3, v0

    .line 4085
    :cond_3
    if-eqz v3, :cond_4

    .line 4086
    add-int/lit8 v0, v4, 0x1

    if-ne p1, v0, :cond_11

    .line 4087
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_5

    .line 4090
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4091
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 4092
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    .line 4094
    const v0, 0x7f0d028d

    new-instance v3, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v5, "FragmentBottomMain"

    invoke-virtual {p0, v0, v3, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 4097
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoView;->a(Z)V

    .line 4079
    :cond_4
    :goto_2
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    .line 4099
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget v0, v0, Lcom/roidapp/photogrid/release/PhotoView;->b:I

    const/4 v5, -0x1

    if-eq v0, v5, :cond_6

    .line 4100
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 4064
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 4103
    :cond_6
    const/4 v0, 0x1

    :try_start_2
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 4107
    const-string v0, "FragmentEditTip"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dj;

    .line 4108
    if-eqz v0, :cond_8

    .line 4109
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43094
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 4110
    if-eqz v0, :cond_7

    .line 4111
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v4, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 4113
    :cond_7
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v4, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 4120
    :cond_8
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    if-eq v0, v7, :cond_f

    .line 4123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_12

    .line 4124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 4125
    if-le v0, v1, :cond_12

    .line 4126
    if-ne v0, v8, :cond_9

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v5, v5, Lcom/roidapp/photogrid/release/mm;->m:I

    if-eq v5, v9, :cond_f

    .line 4128
    :cond_9
    const/16 v5, 0xd

    if-ne v0, v5, :cond_a

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v5, v5, Lcom/roidapp/photogrid/release/mm;->m:I

    if-eq v5, v7, :cond_f

    .line 4131
    :cond_a
    const/4 v5, 0x6

    if-ne v0, v5, :cond_b

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v0, v0, Lcom/roidapp/photogrid/release/mm;->m:I

    if-eq v0, v9, :cond_f

    :cond_b
    move v0, v1

    .line 4136
    :goto_3
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v5, v7, :cond_c

    .line 4137
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v5

    if-nez v5, :cond_c

    move v0, v2

    .line 4142
    :cond_c
    if-eqz v0, :cond_e

    .line 4144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v5, v5, Lcom/roidapp/photogrid/release/mm;->k:Landroid/widget/RelativeLayout;

    const/4 v6, 0x1

    invoke-virtual {v0, v3, v5, v6}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/if;Landroid/widget/RelativeLayout;Z)V

    .line 4145
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af:Z

    if-eqz v0, :cond_e

    .line 4146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af:Z

    .line 4147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_d

    .line 4151
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->o()V

    .line 4153
    :cond_d
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af:Z

    .line 4166
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4167
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 4168
    instance-of v5, v0, Lcom/roidapp/photogrid/release/dc;

    if-eqz v5, :cond_10

    .line 4169
    check-cast v0, Lcom/roidapp/photogrid/release/dc;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/release/if;->C:Z

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/dc;->a(Z)V

    goto/16 :goto_2

    :cond_f
    move v0, v2

    .line 4131
    goto :goto_3

    .line 4171
    :cond_10
    const v0, 0x7f0d028d

    new-instance v3, Lcom/roidapp/photogrid/release/dc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/dc;-><init>()V

    const-string v5, "FragmentGridEdit"

    invoke-virtual {p0, v0, v3, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 4177
    :cond_11
    iget-boolean v0, v3, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_4

    .line 4178
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_2

    :cond_12
    move v0, v2

    goto :goto_3
.end method

.method public final b(II)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 906
    const v0, 0x7f070195

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 922
    :goto_0
    return-void

    .line 17955
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 17956
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 17957
    const-string v1, "FreeCropMode"

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 17958
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "entry_mode"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 17959
    if-ne p1, v4, :cond_1

    .line 17960
    const-class v1, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 17961
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 17973
    :goto_1
    invoke-direct {p0, v4, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 17974
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 17975
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto :goto_0

    .line 17963
    :cond_1
    sput-boolean v4, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 17964
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x9

    if-eq v1, v2, :cond_2

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0xa

    if-ne v1, v2, :cond_3

    .line 17965
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 17969
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 17970
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 17971
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 17967
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    goto :goto_2
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 2106
    if-eqz p1, :cond_1

    .line 2107
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->z:Z

    if-eqz v0, :cond_0

    .line 2108
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->X()V

    .line 2123
    :goto_0
    return-void

    .line 2111
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->X()V

    .line 2116
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_2

    .line 2117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 2118
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/release/mm;->a(Lcom/roidapp/photogrid/release/mp;)V

    .line 2119
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->a()V

    goto :goto_0

    .line 2121
    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    goto :goto_0
.end method

.method public final b(ZI)V
    .locals 6

    .prologue
    const/4 v0, 0x2

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 3393
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 3395
    if-nez p1, :cond_0

    .line 3396
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    .line 3407
    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {v2, p2}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 3409
    packed-switch p2, :pswitch_data_1

    .line 3420
    :goto_1
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v3

    if-eqz v3, :cond_2

    .line 3421
    const v3, 0x3fb9999a    # 1.45f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 3425
    :goto_2
    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 3427
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 3428
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 3429
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->ai()V

    .line 3433
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    if-ne v3, v1, :cond_3

    .line 3434
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v4

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 3442
    :cond_1
    :goto_3
    invoke-virtual {p0, v1, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 3443
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae()V

    .line 3444
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T()V

    .line 3446
    return-void

    :pswitch_1
    move p2, v0

    .line 3399
    goto :goto_0

    :pswitch_2
    move p2, v1

    .line 3402
    goto :goto_0

    .line 3411
    :pswitch_3
    const/4 v3, -0x2

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    goto :goto_1

    .line 3414
    :pswitch_4
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 3415
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    goto :goto_1

    .line 3423
    :cond_2
    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_2

    .line 3435
    :cond_3
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v2

    if-ne v2, v0, :cond_1

    .line 3436
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v4

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    goto :goto_3

    .line 3396
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_2
    .end packed-switch

    .line 3409
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final b(ZZ)V
    .locals 2

    .prologue
    .line 2889
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 2890
    const-string v0, "saveDialog"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2891
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 2892
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 39145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2892
    if-eqz v0, :cond_0

    .line 2893
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 40145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2893
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    .line 2897
    :cond_0
    return-void
.end method

.method public final declared-synchronized b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 3074
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1

    .prologue
    .line 5243
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2934
    invoke-static {}, Lcom/roidapp/photogrid/b/f;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c(I)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x5

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 4199
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 4200
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    .line 4202
    if-eqz v3, :cond_0

    array-length v0, v3

    if-nez v0, :cond_1

    .line 4246
    :cond_0
    :goto_0
    return-void

    .line 4206
    :cond_1
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    new-array v4, v0, [Lcom/roidapp/photogrid/release/ig;

    move v0, v1

    .line 4207
    :goto_1
    array-length v5, v4

    if-ge v0, v5, :cond_4

    .line 4208
    if-ge v0, p1, :cond_3

    .line 4209
    aget-object v5, v3, v0

    aput-object v5, v4, v0

    .line 4207
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 4210
    :cond_3
    if-lt v0, p1, :cond_2

    .line 4211
    add-int/lit8 v5, v0, 0x1

    aget-object v5, v3, v5

    aput-object v5, v4, v0

    goto :goto_2

    .line 4214
    :cond_4
    array-length v0, v4

    if-ne v0, v6, :cond_6

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_6

    .line 4215
    sput v7, Lcom/roidapp/photogrid/common/az;->q:I

    .line 4216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v7, :cond_5

    .line 4217
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4218
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4220
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->S()V

    .line 43238
    :cond_6
    iput-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 4225
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 4230
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 4231
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 4232
    invoke-virtual {v2, v8}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    .line 4233
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 4234
    invoke-virtual {v2, v8}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 4235
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->o(Z)V

    .line 4238
    array-length v0, v4

    if-ne v0, v6, :cond_7

    .line 4239
    invoke-virtual {p0, v6, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(ZZ)V

    goto :goto_0

    .line 4241
    :cond_7
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->ai()V

    .line 4242
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 4243
    invoke-virtual {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0
.end method

.method public final c(II)V
    .locals 1

    .prologue
    .line 1360
    const-string v0, "VideoSavingDialogFragment"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ri;

    .line 1361
    if-eqz v0, :cond_0

    .line 1362
    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/release/ri;->a(II)V

    .line 1364
    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 3

    .prologue
    .line 2860
    const-string v0, "saveDialog"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2861
    new-instance v0, Lcom/roidapp/photogrid/release/nn;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/nn;-><init>()V

    .line 2862
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p:Z

    invoke-virtual {v0, p1, v1}, Lcom/roidapp/photogrid/release/nn;->a(ZZ)V

    .line 2863
    const/4 v1, 0x0

    const v2, 0x7f0b0027

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/nn;->setStyle(II)V

    .line 2864
    const-string v1, "saveDialog"

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 2866
    return-void
.end method

.method public final c(ZZ)V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3449
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 3451
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v3, v6, :cond_0

    .line 3452
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 3467
    :goto_0
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v3

    if-eqz v3, :cond_3

    .line 3468
    const v3, 0x3fb9999a    # 1.45f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 3472
    :goto_1
    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 3474
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 3475
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 3476
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->ai()V

    .line 3480
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-ne v3, v4, :cond_5

    .line 3481
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v1

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v2

    if-nez v2, :cond_4

    :goto_2
    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 3489
    :goto_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J()V

    .line 3490
    invoke-virtual {p0, p2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 3491
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T()V

    .line 3493
    return-void

    .line 3454
    :cond_0
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 3455
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 3456
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 3459
    :cond_1
    if-eqz p1, :cond_2

    .line 3460
    const-string v3, "state_single"

    invoke-virtual {p0, v3, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "single_mode"

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    goto :goto_0

    .line 3463
    :cond_2
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    goto :goto_0

    .line 3470
    :cond_3
    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    goto :goto_1

    :cond_4
    move v0, v1

    .line 3481
    goto :goto_2

    .line 3486
    :cond_5
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, v1

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v3, v6, :cond_6

    :goto_4
    iput-boolean v0, v2, Lcom/roidapp/photogrid/release/ig;->B:Z

    goto :goto_3

    :cond_6
    move v0, v1

    goto :goto_4
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 5713
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 5714
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ln;->b(I)V

    .line 5715
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C:Z

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->D:Z

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(ZZ)V

    .line 5723
    return-void
.end method

.method public final d(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 4566
    const/16 v0, 0x12

    if-ne v0, p1, :cond_1

    .line 4567
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->q()V

    .line 4568
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 4569
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701a0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4570
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4571
    const-string v0, "AddDeco"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4572
    new-instance v0, Lcom/roidapp/photogrid/release/c;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/c;-><init>()V

    .line 4573
    const/4 v1, 0x2

    invoke-virtual {v0, v3, v1}, Lcom/roidapp/photogrid/release/c;->setStyle(II)V

    .line 4574
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/c;->a(I)V

    .line 4579
    const-string v1, "AddDeco"

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)V

    .line 4594
    :cond_0
    :goto_0
    return-void

    .line 4582
    :cond_1
    const/16 v0, 0x11

    if-ne p1, v0, :cond_0

    .line 4583
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v1

    .line 4584
    instance-of v0, v1, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, v1

    .line 4585
    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Lcom/roidapp/photogrid/release/ra;)V

    .line 4586
    check-cast v1, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ra;->C()V

    .line 47321
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    .line 4588
    if-eqz v0, :cond_0

    .line 4589
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    goto :goto_0
.end method

.method public final d(II)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 5426
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    if-nez v0, :cond_1

    .line 5482
    :cond_0
    :goto_0
    return-void

    .line 5430
    :cond_1
    invoke-virtual {p0, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 5431
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    .line 5432
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-nez v0, :cond_0

    .line 5434
    iput p1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aX:I

    .line 5435
    iput p2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aY:I

    .line 5436
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    .line 5437
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    .line 5442
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 5443
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 5444
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aN:I

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    .line 5445
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    if-nez v0, :cond_2

    .line 5446
    const v0, 0x7f0d03ee

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    .line 5447
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bd:Landroid/os/Vibrator;

    if-nez v0, :cond_3

    .line 5448
    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bd:Landroid/os/Vibrator;

    .line 5449
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bd:Landroid/os/Vibrator;

    if-eqz v0, :cond_4

    .line 5450
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bd:Landroid/os/Vibrator;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 5451
    :cond_4
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 5452
    if-eqz v0, :cond_0

    .line 5453
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 5457
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 5458
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 5459
    :cond_5
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->buildDrawingCache(Z)V

    .line 5460
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/if;->getDrawingCache(Z)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/graphics/Bitmap;)V

    .line 5461
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->destroyDrawingCache()V

    .line 5468
    :goto_1
    const/4 v1, 0x2

    new-array v3, v1, [I

    .line 5469
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/if;->getLocationOnScreen([I)V

    .line 5470
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v1, v1, Lcom/roidapp/photogrid/release/mm;->w:I

    shl-int/lit8 v2, p1, 0x1

    if-le v1, v2, :cond_7

    const/4 v1, 0x5

    move v2, v1

    .line 5472
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 5473
    aget v4, v3, v6

    add-int/2addr v2, v4

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 5474
    aget v2, v3, v5

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aZ:I

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x5

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 5475
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 5476
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->getHeight()I

    move-result v0

    iput v0, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5478
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_0

    .line 5464
    :cond_6
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/graphics/Bitmap;)V

    goto :goto_1

    .line 5470
    :cond_7
    const/4 v1, -0x5

    move v2, v1

    goto :goto_2
.end method

.method public final d(Z)V
    .locals 2

    .prologue
    .line 4249
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1, p1}, Lcom/roidapp/photogrid/release/mm;->b(IZ)V

    .line 4250
    return-void
.end method

.method public final e()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 5729
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    .line 5730
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Shape/Error/Info/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 5732
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->p(Z)V

    .line 5733
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 5734
    invoke-virtual {p0, v3, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 5735
    return-void
.end method

.method public final e(Z)Z
    .locals 4

    .prologue
    const v3, 0x7f0d028d

    const/4 v1, 0x1

    .line 4371
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_7

    .line 4372
    const-string v0, "FragmentTextEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ga;

    .line 4373
    if-eqz v0, :cond_1

    .line 4374
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ga;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 4375
    const-string v0, "FragmentTextEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4376
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 4377
    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    :goto_0
    move v0, v1

    .line 4416
    :goto_1
    return v0

    .line 4379
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ga;->b()V

    goto :goto_0

    .line 4384
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 4385
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4386
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x6

    if-eq v0, v2, :cond_3

    .line 4387
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 4388
    :cond_2
    sget-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4389
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 4392
    :cond_3
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    move v0, v1

    .line 4393
    goto :goto_1

    .line 4396
    :cond_4
    if-eqz p1, :cond_6

    .line 4397
    const-string v0, "FragmentGridEdit"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4398
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dc;

    .line 4399
    if-eqz v0, :cond_5

    .line 4400
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dc;->b()V

    .line 4402
    :cond_5
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4403
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 4404
    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4405
    goto :goto_1

    .line 4409
    :cond_6
    sget-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 4410
    sget-object v0, Lcom/roidapp/imagelib/filter/s;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 4411
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 4412
    const-string v2, "FragmentBottomMain"

    invoke-virtual {p0, v3, v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v1

    .line 4413
    goto :goto_1

    .line 4416
    :cond_7
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 6283
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 6284
    return-void
.end method

.method public final f(Z)V
    .locals 3

    .prologue
    .line 5174
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    sget-object v1, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 5175
    if-nez p1, :cond_1

    .line 5176
    if-eqz v0, :cond_0

    .line 5177
    sget-object v0, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 5184
    :cond_0
    :goto_0
    return-void

    .line 5180
    :cond_1
    if-nez v0, :cond_0

    .line 5181
    const v0, 0x7f0d03eb

    new-instance v1, Lcom/roidapp/photogrid/release/hk;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/hk;-><init>()V

    sget-object v2, Lcom/roidapp/photogrid/release/hk;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 6288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 6289
    return-void
.end method

.method public final g(Z)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 5624
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aB()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 5626
    new-instance v0, Ljava/io/File;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aC()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 49657
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 49658
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 49659
    const v1, 0x7f07022b

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 49660
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 49661
    const v1, 0x7f07030a

    new-instance v2, Lcom/roidapp/photogrid/release/lz;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/lz;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 49675
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 49676
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 49677
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 49678
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 5652
    :goto_0
    return-void

    .line 5629
    :cond_0
    invoke-direct {p0, v3, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 5630
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 5631
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5632
    const-string v1, "background_image_path"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aC()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5633
    const-string v1, "hasbackground"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5634
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 5635
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto :goto_0

    .line 5638
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 5639
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5641
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 5642
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 5645
    const v1, 0xaa03

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 5646
    :catch_0
    move-exception v0

    .line 5647
    const-string v1, "You don\'t have gallery. Please install one"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 5648
    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public final i()V
    .locals 6

    .prologue
    .line 614
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qx;->b()Ljava/util/ArrayList;

    move-result-object v3

    .line 615
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 616
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_3

    .line 617
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 618
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/qx;->c(Ljava/lang/String;)I

    move-result v1

    .line 620
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/qx;->c()Z

    move-result v5

    if-nez v5, :cond_0

    const/4 v5, -0x1

    if-ne v1, v5, :cond_2

    .line 621
    :cond_0
    new-instance v1, Lcom/roidapp/photogrid/release/qz;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V

    .line 622
    const/4 v5, 0x2

    iput v5, v1, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 623
    iput-object v0, v1, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 624
    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/roidapp/photogrid/release/qz;->J:Z

    .line 625
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/qx;->a(Lcom/roidapp/photogrid/release/qz;)V

    move-object v0, v1

    .line 629
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v1

    .line 630
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 631
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->a(Lcom/roidapp/photogrid/release/ao;)V

    .line 632
    add-int/lit8 v1, v4, -0x1

    if-ne v2, v1, :cond_1

    .line 633
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Lcom/roidapp/photogrid/release/ao;)V

    .line 634
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 616
    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 627
    :cond_2
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/qx;->a(I)Lcom/roidapp/photogrid/release/qz;

    move-result-object v0

    goto :goto_1

    .line 639
    :cond_3
    return-void
.end method

.method public final k()V
    .locals 3

    .prologue
    .line 842
    const-string v0, "FragmentDoodleTop"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/da;

    .line 843
    if-eqz v0, :cond_0

    .line 844
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/da;->a(ZZ)V

    .line 846
    :cond_0
    return-void
.end method

.method public final l()V
    .locals 11

    .prologue
    const/4 v10, 0x4

    const/4 v9, 0x6

    const/4 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1038
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 1207
    :goto_0
    return-void

    .line 1043
    :cond_0
    invoke-direct {p0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 1045
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 1047
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ao:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ao:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aJ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->aJ()Ljava/lang/String;

    move-result-object v0

    const-string v4, "ShareEntry"

    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1048
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->an:Z

    .line 1049
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto :goto_0

    .line 1053
    :cond_1
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 1054
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1055
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v0

    .line 1056
    if-nez v0, :cond_6

    .line 1057
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v9, :cond_2

    .line 1058
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 1059
    const/16 v0, 0xa

    invoke-virtual {p0, v2, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZI)V

    .line 1061
    const-string v0, "CartPage_View"

    const-string v5, "Edit_Cart"

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1063
    :cond_2
    const-class v0, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1075
    :cond_3
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    const/4 v5, 0x3

    if-ne v0, v5, :cond_4

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v10, :cond_4

    .line 1076
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 1077
    aget-object v0, v0, v2

    iput-object v8, v0, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 1081
    :cond_4
    const-string v0, "firstCreate"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1082
    const-string v0, "folder_path"

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1083
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 1084
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 1192
    :cond_5
    :goto_2
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->removeAllElements()V

    .line 1193
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ln;->c()V

    .line 1194
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1195
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->p(Z)V

    .line 1198
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    .line 1199
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 1200
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 1201
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->E()V

    .line 1202
    invoke-static {}, Lcom/roidapp/photogrid/release/pr;->a()Lcom/roidapp/photogrid/release/pr;

    invoke-static {}, Lcom/roidapp/photogrid/release/pr;->c()V

    .line 1204
    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 1205
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    .line 1206
    invoke-static {}, Lcom/roidapp/videolib/a/a;->a()V

    goto/16 :goto_0

    .line 1064
    :cond_6
    const/4 v5, 0x3

    if-ne v0, v5, :cond_7

    .line 1065
    const-class v0, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1066
    :cond_7
    if-ne v0, v1, :cond_8

    .line 1067
    const-class v0, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1068
    :cond_8
    const/4 v5, 0x5

    if-ne v0, v5, :cond_9

    .line 1069
    const-class v0, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1070
    :cond_9
    if-ne v0, v10, :cond_a

    .line 1071
    const-class v0, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1072
    :cond_a
    const/4 v5, 0x2

    if-ne v0, v5, :cond_3

    .line 1073
    const-class v0, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1088
    :pswitch_1
    const/16 v0, 0x32

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 1089
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v5

    .line 1091
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v0, v5, v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->b()V

    .line 1095
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-lez v0, :cond_13

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v9, :cond_13

    move v0, v1

    .line 1101
    :goto_3
    sget-boolean v6, Lcom/roidapp/photogrid/common/az;->t:Z

    if-eqz v6, :cond_c

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v6, :cond_c

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 18145
    iget-object v6, v6, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1101
    if-eqz v6, :cond_c

    .line 1102
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->k(Z)V

    .line 1103
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->t:Z

    .line 1106
    if-nez v0, :cond_b

    .line 1107
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->an()V

    .line 1110
    :cond_b
    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    iget v6, v6, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v6, v5, v6

    iput-boolean v1, v6, Lcom/roidapp/photogrid/release/ig;->A:Z

    .line 1111
    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    iget v6, v6, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v6, v5, v6

    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 19145
    iget-object v7, v7, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1111
    iput-object v7, v6, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    .line 1119
    :goto_4
    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1120
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 1122
    if-eqz v0, :cond_e

    .line 1123
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 1124
    invoke-virtual {p0, v9, v10, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    goto/16 :goto_0

    .line 1113
    :cond_c
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->av()Z

    move-result v6

    if-eqz v6, :cond_d

    .line 1114
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->am()V

    goto :goto_4

    .line 1116
    :cond_d
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->al()V

    goto :goto_4

    .line 1127
    :cond_e
    sput v9, Lcom/roidapp/photogrid/common/az;->q:I

    .line 1128
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1129
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->F:Z

    if-eqz v0, :cond_f

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v0, v5, v0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->m:Z

    .line 1131
    :cond_f
    const-class v0, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto/16 :goto_2

    .line 1135
    :pswitch_2
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 1136
    aget-object v1, v0, v2

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->b()V

    .line 1137
    sget-boolean v1, Lcom/roidapp/photogrid/common/az;->u:Z

    if-eqz v1, :cond_10

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v1, :cond_10

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 20145
    iget-object v1, v1, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1137
    if-eqz v1, :cond_10

    .line 1138
    aget-object v1, v0, v2

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 21145
    iget-object v5, v5, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1138
    iput-object v5, v1, Lcom/roidapp/photogrid/release/ig;->g:Ljava/lang/String;

    .line 1140
    :cond_10
    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1141
    invoke-virtual {v3, v8}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 1142
    const/4 v0, 0x7

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 1143
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1145
    const-class v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto/16 :goto_2

    .line 1149
    :pswitch_3
    const/16 v0, 0xf

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    goto/16 :goto_2

    .line 1152
    :pswitch_4
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1153
    const/16 v0, 0xf

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 1160
    :cond_11
    :goto_5
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v5, "return_template_choose"

    invoke-virtual {v0, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1161
    const-class v0, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1162
    const-string v0, "return_template_choose"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    goto/16 :goto_2

    .line 1155
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_11

    .line 1156
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 1157
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    goto :goto_5

    .line 1166
    :pswitch_5
    const-string v0, "background_image_path"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1167
    const-class v0, Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto/16 :goto_2

    .line 1172
    :pswitch_6
    const/16 v0, 0x9

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    goto/16 :goto_2

    .line 1175
    :pswitch_7
    const/16 v0, 0x32

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 1176
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h(Z)V

    .line 1177
    const-class v0, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1178
    const-string v0, "VideoSortPage_View"

    const-string v1, "Edit_VideoSort"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_13
    move v0, v2

    goto/16 :goto_3

    .line 1084
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final m()V
    .locals 2

    .prologue
    .line 1328
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->bringToFront()V

    .line 1330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1332
    return-void
.end method

.method public final n()V
    .locals 3

    .prologue
    .line 1337
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1338
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1339
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701a0

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1341
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1342
    return-void
.end method

.method public final o()V
    .locals 1

    .prologue
    .line 1355
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1356
    const-string v0, "VideoSavingDialogFragment"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 1357
    return-void
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .prologue
    const/4 v5, 0x5

    const/4 v4, 0x4

    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 4862
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 4863
    sparse-switch p1, :sswitch_data_0

    .line 5107
    :cond_0
    :goto_0
    return-void

    .line 4865
    :sswitch_0
    const/16 v0, 0x1102

    if-ne p2, v0, :cond_0

    .line 4866
    invoke-virtual {p0, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g(Z)V

    goto :goto_0

    .line 4870
    :sswitch_1
    const v0, 0xcc02

    if-ne p2, v0, :cond_0

    .line 4872
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4873
    const-string v2, "file"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 4875
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 4877
    const-string v0, "saveDialog"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/nn;

    .line 4878
    if-eqz v0, :cond_0

    .line 4879
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/nn;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 4885
    :sswitch_2
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 4886
    packed-switch p2, :pswitch_data_0

    .line 4890
    :pswitch_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 4891
    invoke-virtual {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0

    .line 4894
    :pswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto :goto_0

    .line 4906
    :pswitch_2
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 4907
    invoke-virtual {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0

    .line 4910
    :pswitch_3
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac:Z

    .line 4911
    invoke-virtual {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0

    .line 4914
    :pswitch_4
    const-string v0, "reEdit"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 4915
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/Stack;->removeAllElements()V

    .line 4916
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4917
    const/4 v2, 0x2

    invoke-virtual {p0, v0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    goto :goto_0

    .line 4920
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/Stack;)V

    .line 4921
    invoke-direct {p0, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 4922
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x8

    if-ne v0, v2, :cond_1

    .line 4923
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lez v0, :cond_1

    .line 4924
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 4927
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 4928
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto/16 :goto_0

    .line 4931
    :pswitch_6
    const-string v0, "isUseFilter"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 4932
    const-string v2, "isUseRetouch"

    invoke-virtual {p3, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 4933
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v3, v5, :cond_4

    .line 4934
    if-eqz v0, :cond_2

    .line 4935
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/share/finish/goto/retouch"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 4938
    const/4 v3, 0x6

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(II)V

    .line 4940
    :cond_2
    if-eqz v2, :cond_3

    .line 4941
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/share/finish/goto/filter"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 4944
    const/4 v3, 0x7

    invoke-virtual {p0, v1, v1, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    .line 4946
    :cond_3
    if-nez v0, :cond_0

    if-nez v2, :cond_0

    .line 4947
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/share/finish/goto/filter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 4949
    const/4 v0, 0x7

    invoke-virtual {p0, v1, v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(III)V

    goto/16 :goto_0

    .line 4952
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_0

    .line 4953
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->removeAllElements()V

    .line 4954
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4955
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v2, "/share/finish/goto/mode_template"

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 4957
    invoke-virtual {p0, v4, v5, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    goto/16 :goto_0

    .line 4962
    :pswitch_7
    const-string v0, "swich_mode"

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 4963
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/Stack;->removeAllElements()V

    .line 4964
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4965
    invoke-virtual {p0, v0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    goto/16 :goto_0

    .line 4969
    :pswitch_8
    invoke-direct {p0, v1, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 4970
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 4971
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_1

    .line 4998
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 4999
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 5002
    :goto_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v4, :cond_5

    .line 5003
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 5004
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const-string v2, "Again"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 5005
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 5006
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 5008
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto/16 :goto_0

    .line 4973
    :pswitch_9
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 4974
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    goto :goto_1

    .line 4977
    :pswitch_a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    goto :goto_1

    .line 4980
    :pswitch_b
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4981
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const-string v2, "Again"

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 4982
    const-string v1, "template_tip"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0702e4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4983
    const-class v1, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 4984
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 4987
    :pswitch_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 4988
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aj()V

    .line 4989
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    goto :goto_1

    .line 4993
    :pswitch_d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 4994
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    goto/16 :goto_1

    .line 5012
    :pswitch_e
    :try_start_0
    invoke-virtual {p0, p3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 5013
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 5019
    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 5024
    :sswitch_3
    invoke-direct {p0, p3, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/content/Intent;Z)Ljava/lang/String;

    goto/16 :goto_0

    .line 5027
    :sswitch_4
    invoke-direct {p0, p3, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/content/Intent;Z)Ljava/lang/String;

    move-result-object v0

    .line 5028
    if-eqz v0, :cond_0

    .line 5034
    invoke-direct {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 5035
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 5036
    const-string v3, "background_image_path"

    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5037
    const-string v0, "hasbackground"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 5038
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 5039
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto/16 :goto_0

    .line 5044
    :sswitch_5
    invoke-direct {p0, p3, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Landroid/content/Intent;Z)Ljava/lang/String;

    move-result-object v0

    .line 5045
    if-eqz v0, :cond_0

    .line 5048
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V()V

    .line 5049
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    .line 5050
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    if-ne v3, v6, :cond_8

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v3, v5, :cond_8

    .line 5053
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v1

    iput-boolean v1, v3, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 5055
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->size()I

    move-result v3

    if-lez v3, :cond_6

    .line 5056
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 5057
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5060
    :cond_6
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_7

    .line 5061
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 5064
    :cond_7
    sput v1, Lcom/roidapp/photogrid/common/az;->q:I

    .line 5066
    const/16 v3, 0xf

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 5070
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->S()V

    .line 5072
    :cond_8
    new-instance v3, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v3, v0}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 5073
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/ig;->j:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 5074
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->e()Lcom/roidapp/imagelib/b/b;

    move-result-object v0

    iput-object v0, v3, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 5075
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v4, v0, [Lcom/roidapp/photogrid/release/ig;

    move v0, v1

    .line 5076
    :goto_2
    array-length v5, v4

    if-ge v0, v5, :cond_a

    .line 5077
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v5, v5

    if-ne v0, v5, :cond_9

    .line 5078
    aput-object v3, v4, v0

    .line 5076
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 5080
    :cond_9
    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v0

    aput-object v5, v4, v0

    goto :goto_3

    .line 49238
    :cond_a
    iput-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 5085
    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 5086
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->ai()V

    .line 5089
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 5090
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->r(I)V

    .line 5091
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 5092
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v6, :cond_b

    .line 5093
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->i()V

    .line 5095
    :cond_b
    invoke-virtual {v2, v7}, Lcom/roidapp/photogrid/release/ih;->n(Ljava/util/List;)V

    .line 5096
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 5097
    invoke-virtual {v2, v7}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 5098
    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->o(Z)V

    .line 5100
    invoke-virtual {p0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 4863
    nop

    :sswitch_data_0
    .sparse-switch
        0xf01 -> :sswitch_2
        0xaa01 -> :sswitch_5
        0xaa02 -> :sswitch_0
        0xaa03 -> :sswitch_4
        0xaa04 -> :sswitch_3
        0xcc01 -> :sswitch_1
    .end sparse-switch

    .line 4886
    :pswitch_data_0
    .packed-switch 0x8800
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_8
        :pswitch_0
        :pswitch_e
        :pswitch_7
        :pswitch_6
        :pswitch_1
    .end packed-switch

    .line 4971
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_d
        :pswitch_d
        :pswitch_b
        :pswitch_a
        :pswitch_c
    .end packed-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x3

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1377
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    .line 23343
    :cond_0
    :goto_0
    return-void

    .line 1380
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1418
    :sswitch_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 1419
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 1421
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/backBtn"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1423
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    if-eq v0, v3, :cond_5

    .line 1424
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W()V

    goto :goto_0

    .line 1395
    :sswitch_1
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v3, :cond_4

    .line 1397
    const-string v0, "WideHighActivity/highTowide"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1398
    const/4 v0, 0x2

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 1405
    :goto_1
    invoke-virtual {p0, v1, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0

    .line 1401
    :cond_4
    const-string v0, "WideHighActivity/wideTohigh"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1402
    sput v3, Lcom/roidapp/photogrid/common/az;->q:I

    goto :goto_1

    .line 1409
    :sswitch_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1410
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1411
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 1412
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1413
    const-class v1, Lcom/roidapp/photogrid/release/EffectsList;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1414
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 1415
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto/16 :goto_0

    .line 1436
    :cond_5
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->H:Z

    if-eqz v0, :cond_6

    .line 1437
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U()V

    goto/16 :goto_0

    .line 1439
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    goto/16 :goto_0

    .line 1445
    :sswitch_3
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 1446
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/shareBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1448
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/shareBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1449
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_9

    .line 1450
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1451
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h(Z)V

    .line 1452
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto/16 :goto_0

    .line 1455
    :cond_7
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 22145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1455
    if-eqz v0, :cond_8

    .line 1456
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1457
    const-string v0, "Video/VideoActivity/DirectShare"

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 23145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 1458
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    .line 1460
    :cond_8
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto/16 :goto_0

    .line 1464
    :cond_9
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_a

    .line 1465
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto/16 :goto_0

    .line 1467
    :cond_a
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto/16 :goto_0

    .line 1473
    :sswitch_4
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 1478
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h(Z)V

    .line 1480
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    if-eqz v0, :cond_b

    .line 1481
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/saveBtn/Messenger"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1483
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/saveBtn/Messenger"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1484
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto/16 :goto_0

    .line 1486
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/saveBtn"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1488
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/saveBtn"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1489
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto/16 :goto_0

    .line 1494
    :sswitch_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/saveBtnForSingleVideo"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1497
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-le v0, v1, :cond_14

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v3, 0x6

    if-ne v0, v3, :cond_14

    move v0, v1

    .line 1500
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/saveBtnForSingleVideo/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    if-eqz v0, :cond_c

    const-string v0, "VideoActivity"

    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1506
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto/16 :goto_0

    .line 1500
    :cond_c
    const-string v0, "VideoPictureEditActivity"

    goto :goto_3

    .line 1509
    :sswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/switchModelBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1511
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/switchModelBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 1517
    new-instance v0, Lcom/roidapp/photogrid/release/ly;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ly;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    .line 1559
    new-instance v3, Lcom/roidapp/photogrid/release/ld;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    if-eqz v5, :cond_d

    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    invoke-static {}, Lcom/roidapp/videolib/core/l;->d()Z

    move-result v5

    if-eqz v5, :cond_d

    :goto_4
    invoke-direct {v3, p0, v4, v0, v1}, Lcom/roidapp/photogrid/release/ld;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;Landroid/widget/RelativeLayout;Lcom/roidapp/photogrid/release/lj;Z)V

    .line 1560
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ld;->b()V

    goto/16 :goto_0

    :cond_d
    move v1, v2

    .line 1559
    goto :goto_4

    .line 1563
    :sswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/favouriteBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1564
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/favouriteBtn"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 23334
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_0

    .line 23337
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z:Z

    if-eqz v0, :cond_e

    .line 23338
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020412

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 23339
    const/16 v1, 0xa5

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 23340
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v1, v4, v0, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 23341
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z:Z

    .line 23342
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->j()V

    goto/16 :goto_0

    .line 23344
    :cond_e
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z:Z

    .line 23345
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    const v1, 0x7f02038d

    invoke-virtual {v0, v2, v1, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 23346
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/roidapp/cloudlib/template/j;->a(Ljava/lang/ref/WeakReference;)V

    .line 23347
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0700dd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 23531
    :sswitch_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_0

    .line 23535
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 23536
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 23565
    cmpl-float v4, v3, v6

    if-nez v4, :cond_11

    .line 23567
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v5, "4 : 5"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23568
    const v4, 0x3f4ccccd    # 0.8f

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 23569
    const-string v4, "Instagram 4 : 5"

    invoke-static {p0, v4}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 23582
    :goto_5
    const/4 v4, -0x1

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 23583
    cmpg-float v4, v3, v6

    if-gez v4, :cond_13

    .line 23584
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 23590
    :cond_f
    :goto_6
    const-string v0, "ProportionFragment"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/fi;

    .line 23591
    if-eqz v0, :cond_10

    .line 23592
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fi;->a()V

    .line 23595
    :cond_10
    invoke-virtual {p0, v2, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_0

    .line 23570
    :cond_11
    const v4, 0x3f4ccccd    # 0.8f

    cmpl-float v4, v3, v4

    if-nez v4, :cond_12

    .line 23572
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v5, "1.91 : 1"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23573
    const v4, 0x3ff47ae1    # 1.91f

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 23574
    const-string v4, "Instagram 1.91 : 1"

    invoke-static {p0, v4}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_5

    .line 23577
    :cond_12
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    const-string v5, "1 : 1"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23578
    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 23579
    const-string v4, "Instagram 1 : 1"

    invoke-static {p0, v4}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_5

    .line 23585
    :cond_13
    cmpl-float v3, v3, v6

    if-ltz v3, :cond_f

    .line 23586
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    goto :goto_6

    :cond_14
    move v0, v2

    goto/16 :goto_2

    .line 1380
    :sswitch_data_0
    .sparse-switch
        0x7f0d0028 -> :sswitch_0
        0x7f0d003a -> :sswitch_4
        0x7f0d0237 -> :sswitch_3
        0x7f0d03e2 -> :sswitch_1
        0x7f0d03e3 -> :sswitch_6
        0x7f0d03e6 -> :sswitch_5
        0x7f0d03e7 -> :sswitch_7
        0x7f0d03e8 -> :sswitch_2
        0x7f0d03ea -> :sswitch_8
    .end sparse-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 484
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 485
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 38

    .prologue
    .line 279
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_1

    .line 280
    :cond_0
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 282
    :cond_1
    invoke-super/range {p0 .. p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 285
    const v2, 0x7f0300f8

    :try_start_0
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 297
    :goto_0
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->v:Z

    if-nez v2, :cond_11

    .line 299
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "moreThan9"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W:Z

    .line 301
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "shareToSelf"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 302
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "shareToSelf"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ao:Ljava/lang/Boolean;

    .line 307
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "entryType"

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aa:I

    .line 308
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "entryFrom"

    const/4 v4, -0x1

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab:I

    .line 309
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "isCrash"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aj:Z

    .line 312
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->s()Z

    move-result v2

    .line 313
    if-eqz v2, :cond_2

    .line 314
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 316
    :cond_2
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aj:Z

    if-eqz v3, :cond_4f

    .line 317
    const/4 v4, 0x0

    .line 318
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "crashFile"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 6792
    if-eqz v2, :cond_40

    .line 6793
    new-instance v19, Ljava/io/File;

    move-object/from16 v0, v19

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6795
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v20

    .line 6796
    const/4 v5, 0x0

    .line 6797
    const/4 v3, 0x0

    .line 6799
    :try_start_1
    new-instance v6, Ljava/io/FileInputStream;

    move-object/from16 v0, v19

    invoke-direct {v6, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_e
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6800
    :try_start_2
    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_f
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_d
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 6801
    :try_start_3
    new-instance v2, Lcom/google/a/s;

    invoke-direct {v2}, Lcom/google/a/s;-><init>()V

    invoke-virtual {v2}, Lcom/google/a/s;->a()Lcom/google/a/k;

    move-result-object v21

    .line 6802
    new-instance v2, Lcom/google/a/ac;

    invoke-direct {v2}, Lcom/google/a/ac;-><init>()V

    invoke-static {v5}, Lcom/google/a/ac;->a(Ljava/io/Reader;)Lcom/google/a/x;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v22

    .line 6804
    const-string v2, "mode"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/a/x;->g()I

    move-result v2

    sput v2, Lcom/roidapp/photogrid/common/az;->q:I

    .line 6805
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aj:Z

    if-eqz v2, :cond_3

    .line 6806
    sget-object v2, Lcom/roidapp/photogrid/b/g;->o:Lcom/roidapp/photogrid/b/g;

    invoke-static {v2}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 6807
    const-string v2, "EditPage_View"

    const-string v3, "_Edit"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6809
    :cond_3
    const-string v2, "imageStates"

    move-object/from16 v0, v22

    invoke-virtual {v0, v2}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v2

    const-class v3, [Lcom/roidapp/photogrid/release/ig;

    move-object/from16 v0, v21

    invoke-virtual {v0, v2, v3}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/roidapp/photogrid/release/ig;

    .line 6811
    const-string v3, "folderPath"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v23

    .line 6812
    const/4 v3, 0x0

    .line 6813
    const-string v7, "paths"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    if-eqz v7, :cond_4e

    .line 6814
    const-string v3, "paths"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v7, [Ljava/lang/String;

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v7}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    move-object/from16 v18, v3

    .line 6817
    :goto_2
    const-string v3, "customRatio"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    if-eqz v3, :cond_4

    const-string v3, "customRatio"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    .line 8068
    instance-of v3, v3, Lcom/google/a/z;

    .line 6817
    if-nez v3, :cond_4

    .line 6818
    const-string v3, "customRatio"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    const-class v7, [F

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v7}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    .line 6819
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a([F)V

    .line 6821
    :cond_4
    const-string v3, "imageCount"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v24

    .line 6822
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v7, 0x3

    if-eq v3, v7, :cond_5

    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v7, 0x2

    if-ne v3, v7, :cond_13

    .line 6823
    :cond_5
    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 6824
    move-object/from16 v0, v20

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 6825
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Ljava/lang/String;)V

    .line 6826
    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 7257
    :goto_3
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    .line 7265
    :goto_4
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    .line 7271
    :goto_5
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_40

    .line 7272
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    move v3, v4

    .line 320
    :goto_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aj:Z

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->r(Z)V

    .line 326
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v4, "isfreeCrop"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 327
    if-nez v2, :cond_6

    .line 328
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 17509
    :cond_6
    const v2, 0x7f0d0028

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    .line 17511
    const v2, 0x7f0d0237

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    .line 17512
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0203ea

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 17513
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 17514
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17516
    const v2, 0x7f0d003a

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    .line 17517
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f0203e6

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 17518
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 17519
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17521
    const v2, 0x7f0d03e6

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    .line 17523
    const v2, 0x7f0d03e7

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    .line 17524
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f020412

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 17525
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 17526
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17528
    const v2, 0x7f0d03e3

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    .line 17529
    const v2, 0x7f0d03e4

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->M:Landroid/widget/TextView;

    .line 17531
    const v2, 0x7f0d03e2

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    .line 17532
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f02041e

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 17533
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 17534
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17536
    const v2, 0x7f0d03e8

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    .line 17537
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f020385

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 17538
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 17539
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v2, v6, v7}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 17541
    const v2, 0x7f0d03e9

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    .line 17542
    const v2, 0x7f0d040d

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O:Landroid/widget/RelativeLayout;

    .line 17543
    const v2, 0x7f0d01ac

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->P:Landroid/widget/TextView;

    .line 17544
    const v2, 0x7f0d028d

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Q:Landroid/widget/FrameLayout;

    .line 17545
    const v2, 0x7f0d03ec

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->R:Landroid/widget/FrameLayout;

    .line 17546
    const v2, 0x7f0d03ed

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->S:Landroid/widget/FrameLayout;

    .line 17565
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v4, 0x6

    if-eq v2, v4, :cond_7

    .line 17566
    new-instance v2, Lcom/roidapp/photogrid/release/PhotoView;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/release/PhotoView;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    .line 17567
    new-instance v2, Lcom/roidapp/photogrid/release/az;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/release/az;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    .line 17570
    :cond_7
    const v2, 0x7f0d0260

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ak:Landroid/widget/RelativeLayout;

    .line 17572
    const v2, 0x7f0d03e0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aB:Landroid/view/View;

    .line 17574
    const v2, 0x7f0d03ea

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aC:Landroid/widget/TextView;

    .line 17581
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 17582
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->L()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f:Ljava/lang/String;

    .line 17583
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v2

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g:I

    .line 17584
    sget v2, Lcom/roidapp/photogrid/common/az;->g:I

    if-nez v2, :cond_8

    .line 17585
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x41c80000    # 25.0f

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    sput v2, Lcom/roidapp/photogrid/common/az;->g:I

    .line 17589
    :cond_8
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3e

    .line 17590
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    .line 17607
    :goto_7
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    move-object/from16 v0, p0

    iput v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ag:I

    .line 17608
    invoke-static/range {p0 .. p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v2

    const-string v4, "event"

    const-string v5, "mother2015"

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v5, v6}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->y:Z

    .line 17609
    invoke-static/range {p0 .. p0}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v2

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aD:Z

    .line 17655
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17656
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->H:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17657
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->I:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17658
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0x9

    if-eq v2, v4, :cond_9

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v4, 0xa

    if-ne v2, v4, :cond_a

    .line 17659
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17661
    :cond_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->J:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17662
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17663
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->N:Landroid/widget/RelativeLayout;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17664
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->L:Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17674
    invoke-direct/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->S()V

    .line 17675
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->aE()Ljava/util/Stack;

    move-result-object v4

    .line 17676
    if-eqz v4, :cond_3f

    invoke-virtual {v4}, Ljava/util/Stack;->size()I

    move-result v2

    if-lez v2, :cond_3f

    .line 17677
    invoke-virtual {v4}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v2, v5, :cond_b

    .line 17678
    invoke-virtual {v4}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 17680
    :cond_b
    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    .line 333
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v4, "isInterFilter"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 334
    if-nez v2, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v4, "isRetouch"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_c

    .line 335
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->g()V

    .line 336
    invoke-static {}, Lcom/roidapp/photogrid/b/k;->a()Lcom/roidapp/photogrid/b/k;

    move-result-object v2

    .line 337
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->b()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ar:I

    .line 338
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->c()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->as:I

    .line 339
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->d()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->at:I

    .line 340
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->e()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->au:I

    .line 341
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->h()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->av:I

    .line 342
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->f()F

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ay:F

    .line 343
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->g()F

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->az:F

    .line 344
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->j()I

    move-result v4

    sput v4, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aw:I

    .line 345
    invoke-virtual {v2}, Lcom/roidapp/photogrid/b/k;->i()I

    move-result v2

    sput v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ax:I

    .line 349
    :cond_c
    if-eqz p1, :cond_d

    .line 350
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ap:Z

    .line 360
    :cond_d
    const/4 v2, 0x1

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    move-result v2

    if-nez v2, :cond_e

    .line 361
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->al:Z

    .line 365
    :cond_e
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ap:Z

    if-nez v2, :cond_f

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v2, :cond_10

    :cond_f
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_11

    .line 17701
    :cond_10
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah:Z

    .line 389
    :cond_11
    return-void

    .line 286
    :catch_0
    move-exception v2

    .line 287
    :try_start_6
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 288
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 289
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 290
    const v2, 0x7f0300f8

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->setContentView(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_0

    .line 293
    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 294
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->v:Z

    .line 295
    new-instance v2, Lcom/roidapp/photogrid/common/cc;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 304
    :cond_12
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ao:Ljava/lang/Boolean;

    goto/16 :goto_1

    .line 6828
    :cond_13
    :try_start_7
    const-string v3, "scale"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v25

    .line 6829
    const-string v3, "proportionMode"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v26

    .line 6830
    const-string v3, "proportion"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v27

    .line 6832
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v7, 0x1

    if-ne v3, v7, :cond_17

    .line 6833
    const-string v3, "isFreeFull"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v8

    .line 6834
    const-string v3, "useBgImage"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 6835
    const-string v3, "isPicBorder"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v9

    .line 6836
    const-string v3, "bgImagePath"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-nez v3, :cond_15

    const/4 v3, 0x0

    move-object v7, v3

    .line 6837
    :goto_9
    const-string v3, "bgImageSrcPath"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-nez v3, :cond_16

    const/4 v3, 0x0

    .line 6838
    :goto_a
    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 6839
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/lang/String;)V

    .line 6840
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/lang/String;)V

    .line 6841
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->n(Z)V

    .line 7078
    :cond_14
    :goto_b
    const-string v3, "layoutIndex"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v8

    .line 7080
    const-string v3, "bgShapeIndex"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v9

    .line 7081
    const-string v3, "bgPattenIndex0"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v10

    .line 7082
    const-string v3, "bgPattenIndex1"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v11

    .line 7083
    const-string v3, "bgColorPosition"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v12

    .line 7085
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 7087
    const-string v3, "textItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_3b

    .line 7088
    const-string v3, "textItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v14

    .line 7089
    const/4 v3, 0x0

    move v7, v3

    :goto_c
    invoke-virtual {v14}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v7, v3, :cond_3b

    .line 7090
    invoke-virtual {v14, v7}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v15

    .line 7092
    new-instance v16, Lcom/roidapp/photogrid/release/ra;

    const-string v3, "mText"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v3}, Lcom/roidapp/photogrid/release/ra;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 7093
    const-string v3, "layoutWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->c:I

    .line 7094
    const-string v3, "layoutHeight"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->d:I

    .line 7096
    const-string v3, "isTemplateTextItem"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_36

    const-string v3, "isTemplateTextItem"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    if-eqz v3, :cond_36

    .line 7098
    const-string v3, "mTextFColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->e(I)V

    .line 7099
    invoke-virtual/range {v16 .. v16}, Lcom/roidapp/photogrid/release/ra;->F()V

    .line 7100
    const-string v3, "bgName"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ra;->ao:Ljava/lang/String;

    .line 7101
    const-string v3, "bgColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->ar:I

    .line 7102
    const-string v3, "bgType"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    move-object/from16 v0, v16

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/ra;->aq:Z

    .line 7103
    const-string v3, "fixedWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->as:I

    .line 7104
    const-string v3, "savedWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->at:F

    .line 7105
    const-string v3, "textSize"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->ad:F

    .line 7106
    const-string v3, "bgRepeat"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->ap:I

    .line 7110
    :goto_d
    const-string v3, "mPattenScale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->e(F)V

    .line 7111
    const-string v3, "mFontType"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->c(I)V

    .line 7112
    const-string v3, "mTextFColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->e(I)V

    .line 7113
    const-string v3, "mTextSColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    const/16 v17, 0x1

    move/from16 v0, v17

    if-ne v3, v0, :cond_3a

    .line 7114
    invoke-virtual/range {v16 .. v16}, Lcom/roidapp/photogrid/release/ra;->u()V

    .line 7118
    :goto_e
    const-string v3, "mTextShadowColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->g(I)V

    .line 7120
    const-string v3, "mPattenIndex"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v17, [I

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    .line 7121
    const/16 v17, 0x0

    aget v17, v3, v17

    const/16 v28, 0x1

    aget v3, v3, v28

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ra;->a(II)V

    .line 7123
    const-string v3, "mBgColorPos"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->a(I)V

    .line 7124
    const-string v3, "mStrokeScale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->f(F)V

    .line 7125
    const-string v3, "alpha"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->d(I)V

    .line 7126
    const-string v3, "showShadowLayout"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->a(Z)V

    .line 7127
    const-string v3, "radius"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->d(F)V

    .line 7128
    const-string v3, "dx"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    const-string v17, "dx"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move-object/from16 v0, v16

    move/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/roidapp/photogrid/release/ra;->d(FF)V

    .line 7129
    const-string v3, "srcPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ra;->n:[F

    .line 7130
    const-string v3, "dstPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ra;->o:[F

    .line 7131
    const-string v3, "scale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->h:F

    .line 7132
    const-string v3, "offsetDegree"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->l:F

    .line 7133
    const-string v3, "offsetX"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->j:F

    .line 7134
    const-string v3, "offsetY"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ra;->k:F

    .line 7135
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ra;->b:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "matrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v28, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 7136
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ra;->H:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "bgMatrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v28, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 7137
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ra;->G:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "bmMatrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v28, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v28

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 7138
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ra;->I:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "tMatrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v15, [F

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v15}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 7139
    move-object/from16 v0, v16

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7089
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    goto/16 :goto_c

    .line 6836
    :cond_15
    const-string v3, "bgImagePath"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object v7, v3

    goto/16 :goto_9

    .line 6837
    :cond_16
    const-string v3, "bgImageSrcPath"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_a

    .line 6845
    :cond_17
    const-string v3, "mIsNoBg"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    .line 6846
    const-string v7, "points"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v7

    .line 6847
    const-string v8, "innerspace"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->e()F

    move-result v28

    .line 6848
    const-string v8, "outerspace"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->e()F

    move-result v29

    .line 6849
    const-string v8, "corner_radious"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->e()F

    move-result v30

    .line 6850
    const-string v8, "Inner_spaceSaved"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->e()F

    move-result v8

    .line 6851
    const-string v9, "Outer_spaceSaved"

    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/a/x;->e()F

    move-result v9

    .line 6852
    const-string v10, "Corner_radiousSaved"

    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/a/x;->e()F

    move-result v10

    .line 6853
    move-object/from16 v0, v20

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 6854
    move-object/from16 v0, v20

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 6855
    move-object/from16 v0, v20

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 6856
    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->i(F)V

    .line 6857
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->g(F)V

    .line 6858
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/ih;->h(F)V

    .line 6859
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/lang/String;)V

    .line 6861
    const/4 v7, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    .line 6862
    const-string v7, "gridMode"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->g()I

    move-result v7

    .line 6863
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 6864
    const-string v7, "isFitVideoEdit"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->h()Z

    move-result v7

    .line 6865
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 6866
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 6867
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v7, 0x4

    if-ne v3, v7, :cond_28

    .line 6869
    const-string v3, "bgImage"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-nez v3, :cond_18

    const/4 v3, 0x0

    move-object/from16 v17, v3

    .line 6870
    :goto_f
    const-string v3, "isBgRepeat"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v31

    .line 6871
    const-string v3, "isSupportScale"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v32

    .line 6872
    const-string v3, "isSupportLayout"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v33

    .line 6873
    const/4 v14, 0x0

    .line 6874
    const/4 v13, 0x0

    .line 6875
    const/4 v12, 0x0

    .line 6876
    const/4 v3, 0x0

    .line 6877
    const/4 v11, 0x0

    .line 6878
    const/4 v10, 0x0

    .line 6879
    const/4 v9, 0x0

    .line 6880
    const/4 v8, 0x0

    .line 6881
    const/4 v7, 0x0

    .line 6882
    const-string v15, "gridPoints"

    move-object/from16 v0, v22

    invoke-virtual {v0, v15}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v15

    if-eqz v15, :cond_4d

    .line 6883
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 6884
    const-string v15, "gridPoints"

    move-object/from16 v0, v22

    invoke-virtual {v0, v15}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6885
    const/4 v15, 0x0

    move/from16 v16, v15

    :goto_10
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v15

    move/from16 v0, v16

    if-ge v0, v15, :cond_1a

    .line 6886
    move-object/from16 v0, v34

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v35

    .line 6887
    new-instance v36, Ljava/util/ArrayList;

    invoke-direct/range {v36 .. v36}, Ljava/util/ArrayList;-><init>()V

    .line 6888
    const/4 v15, 0x0

    :goto_11
    invoke-virtual/range {v35 .. v35}, Lcom/google/a/u;->a()I

    move-result v37

    move/from16 v0, v37

    if-ge v15, v0, :cond_19

    .line 6889
    move-object/from16 v0, v35

    invoke-virtual {v0, v15}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v37

    invoke-virtual/range {v37 .. v37}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v37

    .line 6890
    invoke-interface/range {v36 .. v37}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6888
    add-int/lit8 v15, v15, 0x1

    goto :goto_11

    .line 6869
    :cond_18
    const-string v3, "bgImage"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v3

    goto/16 :goto_f

    .line 6892
    :cond_19
    move-object/from16 v0, v36

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6885
    add-int/lit8 v15, v16, 0x1

    move/from16 v16, v15

    goto :goto_10

    :cond_1a
    move-object/from16 v16, v14

    .line 6895
    :goto_12
    const-string v14, "stickerImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v14}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v14

    if-eqz v14, :cond_4c

    .line 6896
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 6897
    const-string v14, "stickerImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v14}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v14

    invoke-virtual {v14}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v15

    .line 6898
    const/4 v14, 0x0

    :goto_13
    invoke-virtual {v15}, Lcom/google/a/u;->a()I

    move-result v34

    move/from16 v0, v34

    if-ge v14, v0, :cond_1b

    .line 6899
    invoke-virtual {v15, v14}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v34

    invoke-virtual/range {v34 .. v34}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v34

    .line 6900
    move-object/from16 v0, v34

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6898
    add-int/lit8 v14, v14, 0x1

    goto :goto_13

    :cond_1b
    move-object v15, v13

    .line 6903
    :goto_14
    const-string v13, "maskImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v13}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v13

    if-eqz v13, :cond_4b

    .line 6904
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 6905
    const-string v13, "maskImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v13}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v14

    .line 6906
    const/4 v13, 0x0

    :goto_15
    invoke-virtual {v14}, Lcom/google/a/u;->a()I

    move-result v34

    move/from16 v0, v34

    if-ge v13, v0, :cond_1c

    .line 6907
    invoke-virtual {v14, v13}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v34

    invoke-virtual/range {v34 .. v34}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v34

    .line 6908
    move-object/from16 v0, v34

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6906
    add-int/lit8 v13, v13, 0x1

    goto :goto_15

    :cond_1c
    move-object v14, v12

    .line 6911
    :goto_16
    const-string v12, "stikerPos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v12}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v12

    if-eqz v12, :cond_4a

    .line 6912
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6913
    const-string v3, "stikerPos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    new-instance v12, Lcom/roidapp/photogrid/release/mb;

    move-object/from16 v0, p0

    invoke-direct {v12, v0}, Lcom/roidapp/photogrid/release/mb;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v12}, Lcom/roidapp/photogrid/release/mb;->b()Ljava/lang/reflect/Type;

    move-result-object v12

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v12}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    move-object v13, v3

    .line 6916
    :goto_17
    const-string v3, "textItemsTM"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_49

    .line 6917
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 6918
    const-string v3, "textItemsTM"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6919
    const/4 v3, 0x0

    move v12, v3

    :goto_18
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v12, v3, :cond_1d

    .line 6920
    move-object/from16 v0, v34

    invoke-virtual {v0, v12}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v3

    const-class v35, Lcom/roidapp/cloudlib/template/m;

    move-object/from16 v0, v21

    move-object/from16 v1, v35

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/cloudlib/template/m;

    .line 6921
    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6919
    add-int/lit8 v3, v12, 0x1

    move v12, v3

    goto :goto_18

    :cond_1d
    move-object v12, v11

    .line 6924
    :goto_19
    const-string v3, "gridScaleList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_48

    .line 6925
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6926
    const-string v10, "gridScaleList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6927
    const/4 v10, 0x0

    move v11, v10

    :goto_1a
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v10

    if-ge v11, v10, :cond_1f

    .line 6929
    move-object/from16 v0, v34

    invoke-virtual {v0, v11}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v10

    .line 9068
    instance-of v10, v10, Lcom/google/a/z;

    .line 6929
    if-eqz v10, :cond_1e

    const/4 v10, 0x0

    .line 6930
    :goto_1b
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6927
    add-int/lit8 v10, v11, 0x1

    move v11, v10

    goto :goto_1a

    .line 6929
    :cond_1e
    move-object/from16 v0, v34

    invoke-virtual {v0, v11}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/a/x;->e()F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    goto :goto_1b

    :cond_1f
    move-object v11, v3

    .line 6933
    :goto_1c
    const-string v3, "gridRotateList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_47

    .line 6934
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 6935
    const-string v9, "gridRotateList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6936
    const/4 v9, 0x0

    move v10, v9

    :goto_1d
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v9

    if-ge v10, v9, :cond_21

    .line 6937
    move-object/from16 v0, v34

    invoke-virtual {v0, v10}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v9

    .line 10068
    instance-of v9, v9, Lcom/google/a/z;

    .line 6937
    if-eqz v9, :cond_20

    const/4 v9, 0x0

    .line 6938
    :goto_1e
    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6936
    add-int/lit8 v9, v10, 0x1

    move v10, v9

    goto :goto_1d

    .line 6937
    :cond_20
    move-object/from16 v0, v34

    invoke-virtual {v0, v10}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/a/x;->e()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    goto :goto_1e

    :cond_21
    move-object v10, v3

    .line 6941
    :goto_1f
    const-string v3, "gridOffsetList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_46

    .line 6942
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 6943
    const-string v3, "gridOffsetList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6944
    const/4 v3, 0x0

    move v9, v3

    :goto_20
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v9, v3, :cond_23

    .line 6945
    move-object/from16 v0, v34

    invoke-virtual {v0, v9}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    .line 11068
    instance-of v3, v3, Lcom/google/a/z;

    .line 6945
    if-eqz v3, :cond_22

    const/4 v3, 0x0

    :goto_21
    const-class v35, Lcom/roidapp/cloudlib/template/f;

    move-object/from16 v0, v21

    move-object/from16 v1, v35

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/cloudlib/template/f;

    .line 6946
    invoke-interface {v8, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6944
    add-int/lit8 v3, v9, 0x1

    move v9, v3

    goto :goto_20

    .line 6945
    :cond_22
    move-object/from16 v0, v34

    invoke-virtual {v0, v9}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v3

    goto :goto_21

    :cond_23
    move-object v9, v8

    .line 6949
    :goto_22
    const-string v3, "filterInfos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_45

    .line 6950
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 6951
    const-string v3, "filterInfos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v34

    .line 6952
    const/4 v3, 0x0

    move v8, v3

    :goto_23
    invoke-virtual/range {v34 .. v34}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v8, v3, :cond_25

    .line 6953
    move-object/from16 v0, v34

    invoke-virtual {v0, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    .line 12068
    instance-of v3, v3, Lcom/google/a/z;

    .line 6953
    if-eqz v3, :cond_24

    const/4 v3, 0x0

    :goto_24
    const-class v35, Lcom/roidapp/cloudlib/template/e;

    move-object/from16 v0, v21

    move-object/from16 v1, v35

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/cloudlib/template/e;

    .line 6954
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6952
    add-int/lit8 v3, v8, 0x1

    move v8, v3

    goto :goto_23

    .line 6953
    :cond_24
    move-object/from16 v0, v34

    invoke-virtual {v0, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v3

    goto :goto_24

    :cond_25
    move-object v3, v7

    .line 6959
    :goto_25
    move-object/from16 v0, v20

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/List;)V

    .line 6960
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/util/List;)V

    .line 6961
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/util/List;)V

    .line 6962
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/util/List;)V

    .line 6963
    move-object/from16 v0, v20

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/util/List;)V

    .line 6964
    move-object/from16 v0, v20

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    .line 6965
    move-object/from16 v0, v20

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Z)V

    .line 6966
    move-object/from16 v0, v20

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(Z)V

    .line 6967
    move-object/from16 v0, v20

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(Z)V

    .line 6968
    move-object/from16 v0, v20

    invoke-virtual {v0, v14}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/util/List;)V

    .line 6969
    move-object/from16 v0, v20

    invoke-virtual {v0, v15}, Lcom/roidapp/photogrid/release/ih;->h(Ljava/util/List;)V

    .line 6970
    move-object/from16 v0, v20

    invoke-virtual {v0, v13}, Lcom/roidapp/photogrid/release/ih;->i(Ljava/util/List;)V

    .line 6971
    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Lcom/roidapp/photogrid/release/ih;->k(Ljava/util/List;)V

    .line 6972
    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->p(I)V

    .line 6973
    new-instance v7, Lcom/roidapp/cloudlib/template/d;

    invoke-direct {v7}, Lcom/roidapp/cloudlib/template/d;-><init>()V

    .line 6974
    move-object/from16 v0, v17

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/d;->b:Ljava/lang/String;

    .line 6975
    move/from16 v0, v31

    iput-boolean v0, v7, Lcom/roidapp/cloudlib/template/d;->e:Z

    .line 6976
    move/from16 v0, v28

    iput v0, v7, Lcom/roidapp/cloudlib/template/d;->h:F

    .line 6977
    move/from16 v0, v29

    iput v0, v7, Lcom/roidapp/cloudlib/template/d;->i:F

    .line 6978
    move/from16 v0, v30

    iput v0, v7, Lcom/roidapp/cloudlib/template/d;->j:F

    .line 6979
    move/from16 v0, v32

    iput-boolean v0, v7, Lcom/roidapp/cloudlib/template/d;->f:Z

    .line 6980
    move/from16 v0, v33

    iput-boolean v0, v7, Lcom/roidapp/cloudlib/template/d;->g:Z

    .line 6981
    move-object/from16 v0, v16

    iput-object v0, v7, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 6982
    iput-object v11, v7, Lcom/roidapp/cloudlib/template/d;->q:Ljava/util/List;

    .line 6983
    iput-object v10, v7, Lcom/roidapp/cloudlib/template/d;->r:Ljava/util/List;

    .line 6984
    iput-object v9, v7, Lcom/roidapp/cloudlib/template/d;->s:Ljava/util/List;

    .line 6985
    move/from16 v0, v24

    iput v0, v7, Lcom/roidapp/cloudlib/template/d;->c:I

    .line 6986
    iput-object v14, v7, Lcom/roidapp/cloudlib/template/d;->m:Ljava/util/List;

    .line 6987
    iput-object v15, v7, Lcom/roidapp/cloudlib/template/d;->n:Ljava/util/List;

    .line 6988
    iput-object v13, v7, Lcom/roidapp/cloudlib/template/d;->o:Ljava/util/List;

    .line 6989
    iput-object v12, v7, Lcom/roidapp/cloudlib/template/d;->p:Ljava/util/List;

    .line 6990
    iput-object v3, v7, Lcom/roidapp/cloudlib/template/d;->t:Ljava/util/List;

    .line 6991
    move/from16 v0, v25

    iput v0, v7, Lcom/roidapp/cloudlib/template/d;->k:F

    .line 6993
    move-object/from16 v0, v20

    invoke-virtual {v0, v7}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 6994
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    const/4 v7, 0x4

    if-ne v3, v7, :cond_14

    .line 6995
    const-string v3, "templateName"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_14

    .line 6996
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v3

    const-string v7, "templateName"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ln;->a(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_b

    .line 7242
    :catch_2
    move-exception v2

    move-object v3, v5

    move-object v5, v6

    :goto_26
    :try_start_8
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 7243
    const/4 v2, 0x0

    const/4 v6, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v6}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 7244
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 7245
    new-instance v2, Landroid/content/Intent;

    const-class v6, Lcom/roidapp/photogrid/MainPage;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 7246
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 7255
    if-eqz v5, :cond_26

    .line 7257
    :try_start_9
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 7263
    :cond_26
    :goto_27
    if-eqz v3, :cond_27

    .line 7265
    :try_start_a
    invoke-virtual {v3}, Ljava/io/InputStreamReader;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 7271
    :cond_27
    :goto_28
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_40

    .line 7272
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    move v3, v4

    goto/16 :goto_6

    .line 7001
    :cond_28
    :try_start_b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v3

    const/4 v7, 0x4

    if-ne v3, v7, :cond_14

    .line 7002
    const/4 v9, 0x0

    .line 7003
    const/4 v8, 0x0

    .line 7004
    const/4 v7, 0x0

    .line 7006
    const/4 v3, 0x0

    .line 7008
    const-string v10, "gridPoints"

    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v10

    if-eqz v10, :cond_44

    .line 7009
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 7010
    const-string v10, "gridPoints"

    move-object/from16 v0, v22

    invoke-virtual {v0, v10}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v12

    .line 7011
    const/4 v10, 0x0

    move v11, v10

    :goto_29
    invoke-virtual {v12}, Lcom/google/a/u;->a()I

    move-result v10

    if-ge v11, v10, :cond_2a

    .line 7012
    invoke-virtual {v12, v11}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v13

    .line 7013
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 7014
    const/4 v10, 0x0

    :goto_2a
    invoke-virtual {v13}, Lcom/google/a/u;->a()I

    move-result v15

    if-ge v10, v15, :cond_29

    .line 7015
    invoke-virtual {v13, v10}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v15

    invoke-virtual {v15}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v15

    .line 7016
    invoke-interface {v14, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7014
    add-int/lit8 v10, v10, 0x1

    goto :goto_2a

    .line 7018
    :cond_29
    invoke-interface {v9, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7011
    add-int/lit8 v10, v11, 0x1

    move v11, v10

    goto :goto_29

    :cond_2a
    move-object v11, v9

    .line 7021
    :goto_2b
    const-string v9, "maskImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v9

    if-eqz v9, :cond_43

    .line 7022
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 7023
    const-string v9, "maskImages"

    move-object/from16 v0, v22

    invoke-virtual {v0, v9}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v10

    .line 7024
    const/4 v9, 0x0

    :goto_2c
    invoke-virtual {v10}, Lcom/google/a/u;->a()I

    move-result v12

    if-ge v9, v12, :cond_2b

    .line 7025
    invoke-virtual {v10, v9}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v12

    .line 7026
    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7024
    add-int/lit8 v9, v9, 0x1

    goto :goto_2c

    :cond_2b
    move-object v10, v8

    .line 7029
    :goto_2d
    const-string v8, "gridScaleList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    if-eqz v8, :cond_42

    .line 7030
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 7031
    const-string v8, "gridScaleList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v8}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v12

    .line 7032
    const/4 v8, 0x0

    move v9, v8

    :goto_2e
    invoke-virtual {v12}, Lcom/google/a/u;->a()I

    move-result v8

    if-ge v9, v8, :cond_2d

    .line 7034
    invoke-virtual {v12, v9}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v8

    .line 13068
    instance-of v8, v8, Lcom/google/a/z;

    .line 7034
    if-eqz v8, :cond_2c

    const/4 v8, 0x0

    .line 7035
    :goto_2f
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7032
    add-int/lit8 v8, v9, 0x1

    move v9, v8

    goto :goto_2e

    .line 7034
    :cond_2c
    invoke-virtual {v12, v9}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/a/x;->e()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    goto :goto_2f

    :cond_2d
    move-object v9, v7

    .line 7038
    :goto_30
    const-string v7, "gridRotateList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    if-eqz v7, :cond_2f

    .line 7040
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 7041
    const-string v7, "gridRotateList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v13

    .line 7042
    const/4 v7, 0x0

    move v8, v7

    :goto_31
    invoke-virtual {v13}, Lcom/google/a/u;->a()I

    move-result v7

    if-ge v8, v7, :cond_2f

    .line 7043
    invoke-virtual {v13, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v7

    .line 14068
    instance-of v7, v7, Lcom/google/a/z;

    .line 7043
    if-eqz v7, :cond_2e

    const/4 v7, 0x0

    .line 7044
    :goto_32
    invoke-interface {v12, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7042
    add-int/lit8 v7, v8, 0x1

    move v8, v7

    goto :goto_31

    .line 7043
    :cond_2e
    invoke-virtual {v13, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->e()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    goto :goto_32

    .line 7047
    :cond_2f
    const-string v7, "gridOffsetList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    if-eqz v7, :cond_41

    .line 7048
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 7049
    const-string v3, "gridOffsetList"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v12

    .line 7050
    const/4 v3, 0x0

    move v8, v3

    :goto_33
    invoke-virtual {v12}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v8, v3, :cond_31

    .line 7051
    invoke-virtual {v12, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    .line 15068
    instance-of v3, v3, Lcom/google/a/z;

    .line 7051
    if-eqz v3, :cond_30

    const/4 v3, 0x0

    :goto_34
    const-class v13, Lcom/roidapp/cloudlib/template/f;

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v13}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/cloudlib/template/f;

    .line 7052
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7050
    add-int/lit8 v3, v8, 0x1

    move v8, v3

    goto :goto_33

    .line 7051
    :cond_30
    invoke-virtual {v12, v8}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v3

    goto :goto_34

    :cond_31
    move-object v8, v7

    .line 7055
    :goto_35
    const-string v3, "filterInfos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_33

    .line 7056
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 7057
    const-string v3, "filterInfos"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v13

    .line 7058
    const/4 v3, 0x0

    move v7, v3

    :goto_36
    invoke-virtual {v13}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v7, v3, :cond_33

    .line 7059
    invoke-virtual {v13, v7}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    .line 16068
    instance-of v3, v3, Lcom/google/a/z;

    .line 7059
    if-eqz v3, :cond_32

    const/4 v3, 0x0

    :goto_37
    const-class v14, Lcom/roidapp/cloudlib/template/e;

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v14}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/cloudlib/template/e;

    .line 7060
    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7058
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    goto :goto_36

    .line 7059
    :cond_32
    invoke-virtual {v13, v7}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v3

    goto :goto_37

    .line 7065
    :cond_33
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/util/List;)V

    .line 7066
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/util/List;)V

    .line 7067
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/util/List;)V

    .line 7068
    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/util/List;)V

    .line 7069
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/util/List;)V

    .line 7070
    const-string v3, "templateName"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_14

    .line 7071
    invoke-static {}, Lcom/roidapp/photogrid/release/ln;->a()Lcom/roidapp/photogrid/release/ln;

    move-result-object v3

    const-string v7, "templateName"

    move-object/from16 v0, v22

    invoke-virtual {v0, v7}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ln;->a(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto/16 :goto_b

    .line 7248
    :catch_3
    move-exception v2

    :goto_38
    :try_start_c
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 7249
    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object/from16 v0, p0

    invoke-direct {v0, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 7250
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 7251
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/roidapp/photogrid/MainPage;

    move-object/from16 v0, p0

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->startActivity(Landroid/content/Intent;)V

    .line 7252
    invoke-virtual/range {p0 .. p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 7255
    if-eqz v6, :cond_34

    .line 7257
    :try_start_d
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8

    .line 7263
    :cond_34
    :goto_39
    if-eqz v5, :cond_35

    .line 7265
    :try_start_e
    invoke-virtual {v5}, Ljava/io/InputStreamReader;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_9

    .line 7271
    :cond_35
    :goto_3a
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_40

    .line 7272
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    move v3, v4

    goto/16 :goto_6

    .line 7108
    :cond_36
    :try_start_f
    const-string v3, "mTextFColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->e(I)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto/16 :goto_d

    .line 7255
    :catchall_0
    move-exception v2

    :goto_3b
    if-eqz v6, :cond_37

    .line 7257
    :try_start_10
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_a

    .line 7263
    :cond_37
    :goto_3c
    if-eqz v5, :cond_38

    .line 7265
    :try_start_11
    invoke-virtual {v5}, Ljava/io/InputStreamReader;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_b

    .line 7271
    :cond_38
    :goto_3d
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_39

    .line 7272
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    :cond_39
    throw v2

    .line 7116
    :cond_3a
    :try_start_12
    const-string v3, "mTextSColor"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->f(I)V

    goto/16 :goto_e

    .line 7142
    :cond_3b
    const-string v3, "decoItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_3c

    .line 7143
    const-string v3, "decoItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v14

    .line 7144
    const/4 v3, 0x0

    move v7, v3

    :goto_3e
    invoke-virtual {v14}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v7, v3, :cond_3c

    .line 7145
    invoke-virtual {v14, v7}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v15

    .line 7146
    new-instance v16, Lcom/roidapp/photogrid/release/qz;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V

    .line 7147
    const-string v3, "type"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 7148
    move-object/from16 v0, v16

    iget v3, v0, Lcom/roidapp/photogrid/release/qz;->V:I

    packed-switch v3, :pswitch_data_0

    .line 7167
    :goto_3f
    const-string v3, "srcPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/qz;->n:[F

    .line 7168
    const-string v3, "dstPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/qz;->o:[F

    .line 7169
    const-string v3, "initHeight"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->t:I

    .line 7170
    const-string v3, "initWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->s:I

    .line 7171
    const-string v3, "layoutHeight"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->d:I

    .line 7172
    const-string v3, "layoutWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->c:I

    .line 7173
    const-string v3, "scale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->h:F

    .line 7174
    const-string v3, "offsetDegree"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->l:F

    .line 7175
    const-string v3, "offsetX"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->j:F

    .line 7176
    const-string v3, "offsetY"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->k:F

    .line 7177
    const-string v3, "type"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 7178
    const-string v3, "mirrorH"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->P:I

    .line 7179
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/qz;->b:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "matrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    const-class v15, [F

    move-object/from16 v0, v21

    invoke-virtual {v0, v3, v15}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 17221
    move-object/from16 v0, v16

    iget v3, v0, Lcom/roidapp/photogrid/release/qz;->l:F

    const/4 v15, 0x0

    add-float/2addr v3, v15

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->l:F

    .line 7181
    invoke-virtual/range {v16 .. v16}, Lcom/roidapp/photogrid/release/qz;->g()V

    .line 7182
    move-object/from16 v0, v16

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7144
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    goto/16 :goto_3e

    .line 7150
    :pswitch_0
    const-string v3, "imgId"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    .line 16365
    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->L:I

    goto/16 :goto_3f

    .line 7154
    :pswitch_1
    const-string v3, "packageName"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    .line 7155
    const-string v3, "fileName"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    .line 7156
    const-string v3, "position"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->U:I

    goto/16 :goto_3f

    .line 7159
    :pswitch_2
    const-string v3, "stickterPath"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->c()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 7160
    const-string v3, "x"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->M:F

    .line 7161
    const-string v3, "y"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->N:F

    .line 7162
    const-string v3, "initScale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/qz;->O:F

    goto/16 :goto_3f

    .line 7185
    :cond_3c
    const-string v3, "picItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    if-eqz v3, :cond_3d

    .line 7186
    const-string v3, "picItem"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->j()Lcom/google/a/u;

    move-result-object v14

    .line 7187
    const/4 v3, 0x0

    move v7, v3

    :goto_40
    invoke-virtual {v14}, Lcom/google/a/u;->a()I

    move-result v3

    if-ge v7, v3, :cond_3d

    .line 7188
    invoke-virtual {v14, v7}, Lcom/google/a/u;->a(I)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->i()Lcom/google/a/aa;

    move-result-object v15

    .line 7189
    new-instance v16, Lcom/roidapp/photogrid/release/ps;

    move-object/from16 v0, v16

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/release/ps;-><init>(Landroid/content/Context;)V

    .line 7190
    aget-object v3, v2, v7

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ps;->H:Lcom/roidapp/photogrid/release/ig;

    .line 7191
    const-string v3, "srcPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ps;->n:[F

    .line 7192
    const-string v3, "dstPs"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    const-class v17, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v17

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ps;->o:[F

    .line 7193
    const-string v3, "initHeight"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->t:I

    .line 7194
    const-string v3, "initWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->s:I

    .line 7195
    const-string v3, "layoutHeight"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->d:I

    .line 7196
    const-string v3, "layoutWidth"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->c:I

    .line 7197
    const-string v3, "scale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->h:F

    .line 7198
    const-string v3, "baseScale"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->u:F

    .line 7199
    const-string v3, "offsetDegree"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->l:F

    .line 7200
    const-string v3, "offsetX"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->j:F

    .line 7201
    const-string v3, "offsetY"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->k:F

    .line 7202
    const-string v3, "baseOffsetX"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->v:F

    .line 7203
    const-string v3, "baseOffsetY"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->w:F

    .line 7204
    const-string v3, "mirrorH"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->g()I

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->K:I

    .line 7205
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ps;->b:Landroid/graphics/Matrix;

    move-object/from16 v17, v0

    const-string v3, "matrix"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->b(Ljava/lang/String;)Lcom/google/a/u;

    move-result-object v3

    const-class v22, [F

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    invoke-virtual {v0, v3, v1}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    move-object/from16 v0, v17

    invoke-virtual {v0, v3}, Landroid/graphics/Matrix;->setValues([F)V

    .line 7206
    const-string v3, "bBorder"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->h()Z

    move-result v3

    move-object/from16 v0, v16

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ps;->a(Z)V

    .line 7207
    new-instance v3, Lcom/roidapp/photogrid/release/lc;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/lc;-><init>()V

    .line 7208
    const-string v17, "x"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->j:F

    .line 7209
    const-string v17, "y"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->k:F

    .line 7210
    const-string v17, "width"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->l:F

    .line 7211
    const-string v17, "height"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->m:F

    .line 7212
    const-string v17, "maxEdge"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->e()F

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->n:F

    .line 7213
    const-string v17, "rotate"

    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/google/a/x;->g()I

    move-result v17

    move/from16 v0, v17

    iput v0, v3, Lcom/roidapp/photogrid/release/lc;->o:I

    .line 7214
    move-object/from16 v0, v16

    iput-object v3, v0, Lcom/roidapp/photogrid/release/ps;->I:Lcom/roidapp/photogrid/release/lc;

    .line 7215
    const-string v3, "ShadowInsetBorder"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->M:F

    .line 7217
    const-string v3, "ShadowInsetNormal"

    invoke-virtual {v15, v3}, Lcom/google/a/aa;->a(Ljava/lang/String;)Lcom/google/a/x;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/a/x;->e()F

    move-result v3

    move-object/from16 v0, v16

    iput v3, v0, Lcom/roidapp/photogrid/release/ps;->L:F

    .line 7219
    move-object/from16 v0, v16

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7187
    add-int/lit8 v3, v7, 0x1

    move v7, v3

    goto/16 :goto_40

    .line 7223
    :cond_3d
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->delete()Z

    .line 7225
    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 7226
    move-object/from16 v0, v20

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 7227
    move-object/from16 v0, v20

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Ljava/lang/String;)V

    .line 7228
    move-object/from16 v0, v20

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 7229
    move-object/from16 v0, v20

    invoke-virtual {v0, v8}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 7230
    move-object/from16 v0, v20

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 7232
    move-object/from16 v0, v20

    invoke-virtual {v0, v9}, Lcom/roidapp/photogrid/release/ih;->g(I)V

    .line 7233
    move-object/from16 v0, v20

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 7234
    move-object/from16 v0, v20

    invoke-virtual {v0, v11}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 7235
    move-object/from16 v0, v20

    invoke-virtual {v0, v12}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 7236
    move-object/from16 v0, v20

    invoke-virtual {v0, v13}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 7237
    const/4 v2, 0x0

    move-object/from16 v0, v20

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 7238
    move-object/from16 v0, v20

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 7239
    move-object/from16 v0, v20

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(Z)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_12 .. :try_end_12} :catch_3
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    goto/16 :goto_3

    .line 7259
    :catch_4
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_4

    .line 7267
    :catch_5
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_5

    .line 7259
    :catch_6
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_27

    .line 7267
    :catch_7
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_28

    .line 7259
    :catch_8
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_39

    .line 7267
    :catch_9
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_3a

    .line 7259
    :catch_a
    move-exception v3

    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_3c

    .line 7267
    :catch_b
    move-exception v3

    invoke-virtual {v3}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_3d

    .line 17592
    :cond_3e
    sget-object v2, Lcom/roidapp/photogrid/release/mc;->a:[I

    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v5

    const-string v6, "video"

    const-string v7, "black_list"

    invoke-virtual {v5, v6, v7}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    move-object/from16 v0, p0

    invoke-virtual {v4, v0, v5}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    aget v2, v2, v4

    packed-switch v2, :pswitch_data_1

    goto/16 :goto_7

    .line 17595
    :pswitch_3
    const/4 v2, 0x1

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    goto/16 :goto_7

    .line 17598
    :pswitch_4
    const/4 v2, 0x0

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    goto/16 :goto_7

    .line 17602
    :pswitch_5
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    invoke-static/range {p0 .. p0}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;)Z

    move-result v2

    move-object/from16 v0, p0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ae:Z

    goto/16 :goto_7

    .line 17682
    :cond_3f
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    .line 7255
    :catchall_1
    move-exception v2

    move-object v6, v5

    move-object v5, v3

    goto/16 :goto_3b

    :catchall_2
    move-exception v2

    move-object v5, v3

    goto/16 :goto_3b

    :catchall_3
    move-exception v2

    move-object v6, v5

    move-object v5, v3

    goto/16 :goto_3b

    .line 7248
    :catch_c
    move-exception v2

    move-object v6, v5

    move-object v5, v3

    goto/16 :goto_38

    :catch_d
    move-exception v2

    move-object v5, v3

    goto/16 :goto_38

    .line 7242
    :catch_e
    move-exception v2

    goto/16 :goto_26

    :catch_f
    move-exception v2

    move-object v5, v6

    goto/16 :goto_26

    :cond_40
    move v3, v4

    goto/16 :goto_6

    :cond_41
    move-object v8, v3

    goto/16 :goto_35

    :cond_42
    move-object v9, v7

    goto/16 :goto_30

    :cond_43
    move-object v10, v8

    goto/16 :goto_2d

    :cond_44
    move-object v11, v9

    goto/16 :goto_2b

    :cond_45
    move-object v3, v7

    goto/16 :goto_25

    :cond_46
    move-object v9, v8

    goto/16 :goto_22

    :cond_47
    move-object v10, v9

    goto/16 :goto_1f

    :cond_48
    move-object v11, v10

    goto/16 :goto_1c

    :cond_49
    move-object v12, v11

    goto/16 :goto_19

    :cond_4a
    move-object v13, v3

    goto/16 :goto_17

    :cond_4b
    move-object v14, v12

    goto/16 :goto_16

    :cond_4c
    move-object v15, v13

    goto/16 :goto_14

    :cond_4d
    move-object/from16 v16, v14

    goto/16 :goto_12

    :cond_4e
    move-object/from16 v18, v3

    goto/16 :goto_2

    :cond_4f
    move v3, v2

    goto/16 :goto_6

    .line 7148
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch

    .line 17592
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 4800
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    .line 4801
    const v0, 0x7f070150

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v2, v2, v3, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0203ea

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 4802
    const/4 v0, 0x2

    const v1, 0x7f07027d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v2, v3, v0, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0203e6

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 4804
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    return v0
.end method

.method public onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 488
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 489
    const-string v1, "NEW_USER"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 490
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 491
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac()V

    .line 492
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->s(Z)V

    .line 494
    invoke-static {}, Lcom/roidapp/photogrid/release/rc;->b()V

    .line 495
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 498
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->an:Z

    if-eqz v0, :cond_0

    .line 499
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 501
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v3, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x1

    .line 4254
    if-ne p1, v3, :cond_16

    .line 4256
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0xa

    if-ne v0, v2, :cond_0

    .line 4257
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 4260
    :cond_0
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v6, :cond_1

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_9

    .line 4261
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-le v0, v1, :cond_8

    .line 4262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_4

    .line 4263
    :cond_2
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    .line 4362
    :cond_3
    :goto_0
    return v0

    .line 4265
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_7

    .line 4266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_5

    .line 4267
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 4269
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_6

    .line 4271
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 4272
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aF()Lcom/roidapp/cloudlib/template/d;

    move-result-object v0

    .line 4273
    if-eqz v0, :cond_6

    .line 44083
    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 4275
    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    if-eq v0, v2, :cond_6

    .line 4276
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    goto :goto_0

    .line 4281
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    :cond_7
    move v0, v1

    .line 4283
    goto :goto_0

    .line 4285
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    move v0, v1

    .line 4286
    goto :goto_0

    .line 4290
    :cond_9
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v2, 0x9

    if-ne v0, v2, :cond_e

    .line 4291
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    .line 4292
    if-nez v0, :cond_3

    .line 4295
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v5

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 4296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-le v0, v1, :cond_d

    .line 4297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4298
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x6

    if-ne v0, v2, :cond_a

    .line 4299
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 4300
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 4301
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v5

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v3, v2, v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ig;->b()V

    .line 4302
    sget-boolean v3, Lcom/roidapp/photogrid/common/az;->t:Z

    if-eqz v3, :cond_b

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v3, :cond_b

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 44145
    iget-object v3, v3, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 4302
    if-eqz v3, :cond_b

    .line 4303
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->k(Z)V

    .line 4304
    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->t:Z

    .line 4305
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->an()V

    .line 4306
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v5

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v3, v2, v3

    iput-boolean v1, v3, Lcom/roidapp/photogrid/release/ig;->A:Z

    .line 4307
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v5

    iget v3, v3, Lcom/roidapp/photogrid/release/ig;->h:I

    aget-object v3, v2, v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 45145
    iget-object v4, v4, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 4307
    iput-object v4, v3, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    .line 4315
    :goto_1
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 4316
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 4319
    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 4320
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 4322
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v6, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    :goto_2
    move v0, v1

    .line 4326
    goto/16 :goto_0

    .line 4309
    :cond_b
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->av()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 4310
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->am()V

    goto :goto_1

    .line 4312
    :cond_c
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->al()V

    goto :goto_1

    .line 4324
    :cond_d
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    goto :goto_2

    .line 4330
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-le v0, v1, :cond_14

    .line 4331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_10

    .line 4332
    :cond_f
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    goto/16 :goto_0

    .line 4335
    :cond_10
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    if-nez v0, :cond_13

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_13

    .line 4336
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_11

    .line 4337
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 4339
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_12

    .line 4341
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 4342
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aF()Lcom/roidapp/cloudlib/template/d;

    move-result-object v0

    .line 4343
    if-eqz v0, :cond_12

    .line 46083
    iget-object v0, v0, Lcom/roidapp/cloudlib/template/d;->l:Ljava/util/List;

    .line 4345
    if-eqz v0, :cond_12

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v2

    if-eq v0, v2, :cond_12

    .line 4346
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    goto/16 :goto_0

    .line 4350
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0, v3, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    :cond_13
    move v0, v1

    .line 4353
    goto/16 :goto_0

    .line 4354
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    if-ne v0, v1, :cond_15

    .line 4355
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->s:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v3, :cond_15

    .line 4356
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aP:Z

    .line 4360
    :cond_15
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j(Z)Z

    move-result v0

    goto/16 :goto_0

    .line 4362
    :cond_16
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto/16 :goto_0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 4817
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_0

    .line 4857
    :goto_0
    return v0

    .line 4820
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 4857
    :goto_1
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 4825
    :pswitch_0
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 4827
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_3

    .line 4828
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4829
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto :goto_1

    .line 4832
    :cond_1
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 48145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 4832
    if-eqz v0, :cond_2

    .line 4834
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 49145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 4834
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 4836
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto :goto_1

    .line 4840
    :cond_3
    invoke-static {p0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_4

    .line 4841
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto :goto_1

    .line 4843
    :cond_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto :goto_1

    .line 4848
    :pswitch_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    .line 4853
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    goto :goto_1

    .line 4820
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onPause()V
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 458
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h(Z)V

    .line 459
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->j()V

    .line 461
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ag()V

    .line 462
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac()V

    .line 463
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 464
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 4809
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 4810
    const/4 v0, 0x0

    .line 4812
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onResume()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 397
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 398
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->al:Z

    if-eqz v0, :cond_1

    .line 454
    :cond_0
    :goto_0
    return-void

    .line 401
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_2

    .line 402
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->i()V

    .line 405
    :cond_2
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 406
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->s(Z)V

    .line 408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_4

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_4

    .line 409
    :cond_3
    const-string v0, "180"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_0

    .line 412
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->v:Z

    if-nez v0, :cond_0

    .line 414
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ab()V

    .line 415
    const-string v0, "AddDeco"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_0

    .line 416
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ao()Ljava/util/List;

    move-result-object v4

    .line 417
    if-eqz v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 423
    const/4 v1, 0x0

    .line 425
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 426
    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 436
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v3, :cond_5

    .line 437
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/PhotoView;->b(Ljava/lang/String;)Z

    .line 439
    :cond_5
    if-nez v1, :cond_6

    .line 440
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 442
    :cond_6
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v2

    :goto_2
    move v3, v0

    .line 445
    goto :goto_1

    .line 446
    :cond_7
    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    .line 447
    invoke-interface {v4, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 448
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 449
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    goto/16 :goto_0

    :cond_8
    move v0, v3

    goto :goto_2
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 466
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 467
    const-string v0, "PhotoGridActivity"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 468
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 472
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 473
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 474
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .prologue
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    const/4 v7, 0x0

    const/4 v4, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 3630
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-nez v0, :cond_1

    move v1, v2

    .line 4030
    :cond_0
    :goto_0
    return v1

    .line 3637
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v3, v0

    .line 3638
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v5, v0

    .line 3640
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-nez v0, :cond_7

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v6, 0x7f0d03e9

    if-ne v0, v6, :cond_7

    .line 3641
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-eqz v0, :cond_2

    .line 3642
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 3643
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 3644
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 3647
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->d()Z

    move-result v0

    if-nez v0, :cond_3

    .line 3648
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "FragmentBottomMain"

    invoke-virtual {v0, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 3649
    if-nez v0, :cond_3

    .line 3650
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 3654
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->m()I

    move-result v0

    if-eq v0, v4, :cond_5

    .line 3655
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3656
    instance-of v0, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v0, :cond_4

    .line 3657
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 3659
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 3660
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->n()V

    .line 3662
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v1

    :goto_1
    iput-boolean v0, v3, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 3664
    :cond_5
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(Z)Z

    move-result v1

    goto :goto_0

    :cond_6
    move v0, v2

    .line 3662
    goto :goto_1

    .line 3667
    :cond_7
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v1, :cond_8

    move v1, v2

    .line 3668
    goto :goto_0

    .line 3671
    :cond_8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 41384
    iget-boolean v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    if-eqz v6, :cond_a

    .line 41385
    and-int/lit16 v0, v0, 0xff

    const/4 v6, 0x2

    if-ne v0, v6, :cond_9

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aX:I

    sub-int v0, v3, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    if-ge v0, v6, :cond_9

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aY:I

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    if-ge v0, v6, :cond_9

    move v0, v1

    .line 3671
    :goto_2
    if-nez v0, :cond_0

    .line 3676
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move v1, v2

    .line 4030
    goto/16 :goto_0

    .line 41389
    :cond_9
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    .line 41390
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v6, 0x10

    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ml;->removeMessages(I)V

    :cond_a
    move v0, v2

    .line 41393
    goto :goto_2

    .line 3680
    :sswitch_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aQ:F

    .line 3681
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aR:F

    .line 3682
    invoke-direct {p0, v3, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(II)I

    move-result v6

    .line 3683
    if-eq v6, v4, :cond_f

    .line 3685
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_b

    .line 3686
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 3688
    :cond_b
    add-int/lit8 v0, v6, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aN:I

    .line 3689
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aN:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    .line 3691
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    if-eqz v0, :cond_c

    .line 3692
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v6, 0x1

    if-eq v0, v3, :cond_0

    .line 3696
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 3697
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o:Z

    .line 3698
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V:Z

    .line 3700
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3, v6}, Lcom/roidapp/photogrid/release/mm;->b(II)V

    .line 3701
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 3702
    const-string v0, "FragmentBottomMain"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_33

    .line 3703
    new-instance v0, Lcom/roidapp/photogrid/release/cs;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/cs;-><init>()V

    .line 3704
    const v3, 0x7f0d028d

    const-string v4, "FragmentBottomMain"

    invoke-virtual {p0, v3, v0, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    move v0, v2

    .line 3725
    :goto_3
    if-eqz v0, :cond_10

    .line 3726
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    goto/16 :goto_0

    .line 3707
    :cond_c
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_33

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-le v0, v1, :cond_33

    .line 3712
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    .line 42365
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    if-ne v0, v4, :cond_d

    .line 42366
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v0, v0, Lcom/roidapp/photogrid/release/mm;->w:I

    div-int/lit8 v0, v0, 0x64

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    .line 42367
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    const/16 v6, 0xa

    if-ge v0, v6, :cond_d

    .line 42368
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bc:I

    .line 42370
    :cond_d
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aZ:I

    if-ne v0, v4, :cond_e

    .line 42371
    sget v0, Lcom/roidapp/photogrid/common/az;->g:I

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aZ:I

    .line 3714
    :cond_e
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aX:I

    .line 3715
    iput v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aY:I

    .line 3716
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v6, 0x10

    invoke-virtual {v4, v6, v3, v5}, Lcom/roidapp/photogrid/release/ml;->obtainMessage(III)Landroid/os/Message;

    move-result-object v3

    const-wide/16 v4, 0x258

    invoke-virtual {v0, v3, v4, v5}, Lcom/roidapp/photogrid/release/ml;->sendMessageDelayed(Landroid/os/Message;J)Z

    move v0, v2

    goto :goto_3

    .line 3721
    :cond_f
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(Z)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_3

    .line 3736
    :cond_10
    iget-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x258

    cmp-long v0, v4, v6

    if-lez v0, :cond_12

    .line 3737
    :cond_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    goto/16 :goto_0

    .line 3744
    :cond_12
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x4

    if-ne v0, v3, :cond_14

    .line 3745
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->h()Z

    move-result v0

    if-nez v0, :cond_15

    .line 3751
    :cond_13
    :goto_4
    if-eqz v2, :cond_0

    .line 3752
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aF:J

    .line 3753
    iget-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aF:J

    iget-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    iget-wide v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aF:J

    iget-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x122

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    .line 3754
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aT:Z

    goto/16 :goto_0

    .line 3748
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->e:Landroid/graphics/Bitmap;

    if-nez v0, :cond_13

    :cond_15
    move v2, v1

    goto :goto_4

    .line 42485
    :sswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-eqz v0, :cond_1c

    .line 42487
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v6, 0x5

    if-le v0, v6, :cond_16

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2}, Lcom/roidapp/photogrid/common/bp;->a(Landroid/view/MotionEvent;)I

    move-result v0

    if-ne v0, v1, :cond_1a

    .line 42488
    :cond_16
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    if-eqz v0, :cond_17

    .line 42490
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aX:I

    sub-int v0, v3, v0

    .line 42491
    iget v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aY:I

    sub-int v6, v5, v6

    .line 42492
    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getLeft()I

    move-result v7

    add-int/2addr v0, v7

    .line 42493
    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getTop()I

    move-result v7

    add-int/2addr v6, v7

    .line 42494
    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/widget/ImageView;->getWidth()I

    move-result v8

    add-int/2addr v8, v0

    iget-object v9, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->be:Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/widget/ImageView;->getHeight()I

    move-result v9

    add-int/2addr v9, v6

    invoke-virtual {v7, v0, v6, v8, v9}, Landroid/widget/ImageView;->layout(IIII)V

    .line 42497
    :cond_17
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aX:I

    .line 42498
    iput v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aY:I

    .line 42501
    invoke-direct {p0, v3, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(II)I

    move-result v0

    .line 42502
    add-int/lit8 v0, v0, 0x1

    .line 42503
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    if-ne v0, v3, :cond_32

    move v3, v4

    .line 42505
    :goto_5
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    if-eq v3, v0, :cond_1a

    .line 42506
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    if-eq v0, v4, :cond_18

    .line 42507
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 42508
    if-eqz v0, :cond_18

    .line 42509
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 42511
    :cond_18
    if-eq v3, v4, :cond_19

    .line 42512
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 42513
    if-eqz v0, :cond_19

    .line 42514
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/if;->setSelected(Z)V

    .line 42516
    :cond_19
    iput v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->bb:I

    :cond_1a
    move v0, v1

    .line 3763
    :goto_6
    if-nez v0, :cond_0

    .line 3767
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    if-lez v0, :cond_1b

    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aN:I

    if-eq v0, v3, :cond_1b

    .line 3768
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 3771
    :cond_1b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_0

    .line 3812
    invoke-static {p2}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 3814
    :pswitch_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aL:Z

    if-eqz v0, :cond_1d

    .line 3815
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aG:F

    .line 3816
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aH:F

    .line 3817
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aG:F

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aI:F

    .line 3818
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aH:F

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aJ:F

    .line 3819
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aL:Z

    goto/16 :goto_0

    :cond_1c
    move v0, v2

    .line 42521
    goto :goto_6

    .line 3821
    :cond_1d
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aI:F

    .line 3822
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aJ:F

    .line 3823
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->t:Z

    .line 3824
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    .line 3825
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aG:F

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aH:F

    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aI:F

    iget v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aJ:F

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/roidapp/photogrid/release/if;->a(FFFF)V

    .line 3826
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aI:F

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aG:F

    .line 3827
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aJ:F

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aH:F

    .line 3828
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    goto/16 :goto_0

    .line 3832
    :pswitch_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    if-eqz v0, :cond_1e

    .line 3833
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    .line 3834
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v1}, Lcom/roidapp/photogrid/common/bp;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v2}, Lcom/roidapp/photogrid/common/bp;->a(Landroid/view/MotionEvent;I)F

    move-result v3

    sub-float/2addr v0, v3

    float-to-double v4, v0

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v1}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v2}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;I)F

    move-result v3

    sub-float/2addr v0, v3

    float-to-double v6, v0

    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    add-double/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v0, v4

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aK:F

    .line 3835
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    .line 3836
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    iput v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aO:F

    goto/16 :goto_0

    .line 3838
    :cond_1e
    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v1}, Lcom/roidapp/photogrid/common/bp;->a(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v2}, Lcom/roidapp/photogrid/common/bp;->a(Landroid/view/MotionEvent;I)F

    move-result v3

    sub-float/2addr v0, v3

    float-to-double v4, v0

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v1}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;I)F

    move-result v0

    invoke-static {}, Lcom/roidapp/photogrid/common/bp;->a()Lcom/roidapp/photogrid/common/bp;

    invoke-static {p2, v2}, Lcom/roidapp/photogrid/common/bp;->b(Landroid/view/MotionEvent;I)F

    move-result v2

    sub-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v0, v2

    .line 3841
    const/high16 v2, 0x41f00000    # 30.0f

    cmpl-float v2, v0, v2

    if-lez v2, :cond_0

    .line 3842
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aO:F

    mul-float/2addr v0, v3

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aK:F

    div-float/2addr v0, v3

    iput v0, v2, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 3843
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    const v2, 0x3dcccccd    # 0.1f

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_20

    .line 3844
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    const v2, 0x3dcccccd    # 0.1f

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 3849
    :cond_1f
    :goto_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    goto/16 :goto_0

    .line 3845
    :cond_20
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v0, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/if;->b()F

    move-result v2

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_1f

    .line 3846
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/if;->b()F

    move-result v2

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    goto :goto_7

    .line 3859
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_21

    .line 3860
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 42525
    :cond_21
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aW:Z

    if-eqz v0, :cond_27

    .line 42526
    invoke-direct {p0, v3, v5}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e(II)I

    move-result v0

    .line 42527
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    if-eq v3, v4, :cond_22

    if-eq v0, v4, :cond_22

    .line 42529
    add-int/lit8 v0, v0, 0x1

    .line 42530
    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    if-eq v0, v3, :cond_22

    .line 42532
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->m()V

    .line 42533
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ba:I

    add-int/lit8 v4, v4, -0x1

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v4, v0}, Lcom/roidapp/photogrid/release/mm;->b(II)V

    .line 42534
    const-string v0, "Hand_Swap2"

    sget v3, Lcom/roidapp/photogrid/common/az;->D:I

    add-int/lit8 v4, v3, 0x1

    sput v4, Lcom/roidapp/photogrid/common/az;->D:I

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/b/f;->b(Ljava/lang/String;I)V

    .line 42537
    :cond_22
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ag()V

    move v0, v1

    .line 3864
    :goto_8
    if-nez v0, :cond_0

    .line 3885
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aT:Z

    if-nez v0, :cond_24

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_24

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_24

    .line 3886
    const-string v0, "FragmentGridEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    .line 3887
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    .line 3889
    :cond_23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 3890
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->t:Z

    .line 3891
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->a()V

    .line 3894
    :cond_24
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aT:Z

    if-eqz v0, :cond_2f

    .line 3895
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aQ:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_2d

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aR:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_2d

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V:Z

    if-nez v0, :cond_2d

    .line 3896
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    .line 3901
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    .line 3905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_26

    .line 3907
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 3908
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_28

    move v0, v1

    .line 3913
    :goto_9
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->v:F

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v4, v4, v5

    if-nez v4, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->t:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x40a00000    # 5.0f

    cmpl-float v4, v4, v5

    if-gtz v4, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->u:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x40a00000    # 5.0f

    cmpl-float v4, v4, v5

    if-gtz v4, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->p:I

    if-nez v4, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->x:I

    if-nez v4, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->r:I

    if-ne v4, v1, :cond_25

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iget v4, v4, Lcom/roidapp/photogrid/release/ig;->s:I

    if-eq v4, v1, :cond_29

    .line 3918
    :cond_25
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 3919
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 3920
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 3921
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 3922
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 3923
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 3924
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 3925
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 4010
    :cond_26
    :goto_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    .line 4011
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aT:Z

    .line 4012
    const-wide/16 v4, 0x0

    iput-wide v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aF:J

    .line 4015
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V:Z

    .line 4016
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aV:Z

    .line 4017
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x10

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->removeMessages(I)V

    .line 4019
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aL:Z

    .line 4020
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    goto/16 :goto_0

    :cond_27
    move v0, v2

    .line 42540
    goto/16 :goto_8

    :cond_28
    move v0, v2

    .line 3908
    goto/16 :goto_9

    .line 3927
    :cond_29
    if-nez v0, :cond_26

    .line 3928
    if-eqz v3, :cond_2b

    .line 3930
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 3931
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 3932
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-ne v0, v3, :cond_2a

    .line 3933
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 3936
    :cond_2a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 3937
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 3938
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 3939
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 3940
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 3941
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 3942
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 3944
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 3945
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 3965
    :goto_b
    const-string v0, "FragmentGridEdit"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 3966
    instance-of v3, v0, Lcom/roidapp/photogrid/release/dc;

    if-eqz v3, :cond_26

    .line 3967
    check-cast v0, Lcom/roidapp/photogrid/release/dc;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-boolean v3, v3, Lcom/roidapp/photogrid/release/if;->C:Z

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/dc;->a(Z)V

    goto/16 :goto_a

    .line 3947
    :cond_2b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->C:Z

    .line 3948
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 3949
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-ne v0, v3, :cond_2c

    .line 3950
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/if;->A:Z

    .line 3953
    :cond_2c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    const/high16 v3, 0x3f800000    # 1.0f

    iput v3, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 3954
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->t:F

    .line 3955
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v7, v0, Lcom/roidapp/photogrid/release/ig;->u:F

    .line 3956
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->p:I

    .line 3957
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v2, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 3958
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->r:I

    .line 3959
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/if;->c:Lcom/roidapp/photogrid/release/ig;

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->s:I

    .line 3961
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/if;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/if;->b(Landroid/graphics/Bitmap;)V

    .line 3962
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    goto :goto_b

    .line 3972
    :cond_2d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_26

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_26

    .line 3973
    const-string v0, "FragmentGridEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    .line 3974
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    .line 3976
    :cond_2e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 3977
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->t:Z

    .line 3978
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->a()V

    goto/16 :goto_a

    .line 3983
    :cond_2f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aE:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x12c

    cmp-long v0, v4, v6

    if-gtz v0, :cond_30

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aQ:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_30

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iget v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aR:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v3, 0x41200000    # 10.0f

    cmpg-float v0, v0, v3

    if-gez v0, :cond_30

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V:Z

    if-nez v0, :cond_30

    .line 3990
    iget v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aN:I

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(I)V

    goto/16 :goto_a

    .line 3992
    :cond_30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    if-eqz v0, :cond_26

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    if-eqz v0, :cond_26

    .line 3993
    const-string v0, "FragmentGridEdit"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_31

    .line 3994
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->s:Z

    .line 3996
    :cond_31
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->invalidate()V

    .line 3997
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/if;->t:Z

    .line 3998
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aS:Lcom/roidapp/photogrid/release/if;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/if;->a()V

    goto/16 :goto_a

    .line 4023
    :sswitch_3
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    goto/16 :goto_0

    .line 4026
    :sswitch_4
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aM:Z

    .line 4027
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aL:Z

    goto/16 :goto_0

    :cond_32
    move v3, v0

    goto/16 :goto_5

    :cond_33
    move v0, v2

    goto/16 :goto_3

    .line 3676
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_2
        0x2 -> :sswitch_1
        0x6 -> :sswitch_4
        0x105 -> :sswitch_3
    .end sparse-switch

    .line 3812
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final p()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 2135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-nez v0, :cond_1

    .line 2136
    invoke-virtual {p0, v7, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 2186
    :cond_0
    :goto_0
    return-void

    .line 2139
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2, p0}, Lcom/roidapp/photogrid/release/mm;->a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V

    .line 2141
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ad()V

    .line 27126
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "FragmentBottomMain"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cs;

    .line 27127
    if-eqz v0, :cond_2

    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x5

    if-ne v2, v3, :cond_2

    .line 27128
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/cs;->a()V

    .line 2144
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n()V

    .line 2145
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k(Z)V

    .line 27628
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2149
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->getVisibility()I

    move-result v0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_4

    .line 2150
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    .line 2160
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ah:Z

    if-eqz v0, :cond_a

    .line 2161
    invoke-direct {p0, v1, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(ZZ)V

    .line 2166
    :cond_5
    :goto_2
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i(Z)Z

    move-result v0

    .line 2168
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p:Z

    if-nez v2, :cond_6

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac:Z

    if-eqz v2, :cond_7

    .line 2169
    :cond_6
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    .line 2170
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->p:Z

    .line 2171
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ac:Z

    .line 2173
    if-eqz v0, :cond_7

    .line 2176
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "REGISTER_COUNT"

    invoke-interface {v0, v2, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    move v0, v1

    .line 2180
    :cond_7
    if-eqz v0, :cond_0

    .line 2181
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 2183
    new-instance v0, Lcom/roidapp/photogrid/common/ap;

    invoke-direct {v0}, Lcom/roidapp/photogrid/common/ap;-><init>()V

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ap;->a(Landroid/app/Activity;)V

    goto/16 :goto_0

    .line 27631
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W:Z

    if-eqz v0, :cond_9

    .line 27632
    const/16 v0, 0x9

    .line 27633
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v2, :pswitch_data_0

    .line 27640
    :goto_3
    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v3, 0x1080027

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702c4

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702c3

    new-array v5, v7, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f07016b

    new-instance v3, Lcom/roidapp/photogrid/release/md;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/md;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 27654
    :cond_9
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->W:Z

    goto/16 :goto_1

    .line 27635
    :pswitch_0
    const/16 v0, 0xf

    goto :goto_3

    .line 2162
    :cond_a
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ai:Z

    if-eqz v0, :cond_5

    .line 2163
    invoke-direct {p0, v7, v7}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(ZZ)V

    goto/16 :goto_2

    .line 27633
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q()V
    .locals 2

    .prologue
    .line 2220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    if-eqz v0, :cond_0

    .line 2221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->b()V

    .line 2223
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 2224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 2227
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_2

    .line 2228
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 2230
    :cond_2
    return-void
.end method

.method public final r()V
    .locals 11

    .prologue
    .line 2715
    const-string v0, "savePhotoFinish"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2717
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 2718
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->o()V

    .line 2723
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_3

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_3

    .line 2724
    :cond_0
    const-string v0, "182"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 2805
    :cond_1
    :goto_1
    return-void

    .line 2720
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n()V

    goto :goto_0

    .line 2727
    :cond_3
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i(Z)Z

    .line 2729
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    if-eqz v0, :cond_4

    .line 2730
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07027e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2731
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 32145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2731
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    goto :goto_1

    .line 2734
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aA:Z

    if-eqz v0, :cond_5

    .line 2735
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07027e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2737
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 2742
    const-string v0, "image/jpeg"

    .line 2748
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 33145
    iget-object v1, v1, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2748
    invoke-static {v1, v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2749
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->finish()V

    goto :goto_1

    .line 2739
    :sswitch_0
    const-string v0, "image/png"

    goto :goto_2

    .line 2745
    :sswitch_1
    const-string v0, "video/mp4"

    goto :goto_2

    .line 2755
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_6

    .line 2756
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->t:Z

    .line 2758
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    goto/16 :goto_1

    .line 2759
    :cond_6
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_7

    .line 2760
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->u:Z

    .line 2761
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->l()V

    goto/16 :goto_1

    .line 2770
    :cond_7
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_8

    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->f()Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_a

    .line 2772
    :cond_9
    new-instance v1, Lcom/roidapp/photogrid/common/be;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ak:Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 34145
    iget-object v4, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2772
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0xbb8

    move-object v2, p0

    invoke-direct/range {v1 .. v9}, Lcom/roidapp/photogrid/common/be;-><init>(Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/lang/String;IZZJ)V

    .line 2773
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f07027e

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/common/be;->a(Ljava/lang/CharSequence;)V

    .line 2774
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto/16 :goto_1

    .line 2776
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_b

    .line 2777
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/az;->setVisibility(I)V

    .line 2779
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07027e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2780
    const-string v0, "SavePage_View"

    const-string v1, "Edit_Save"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2781
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_e

    .line 2782
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aa()Ljava/lang/String;

    move-result-object v5

    .line 2783
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ap()I

    move-result v1

    mul-int/2addr v0, v1

    int-to-long v2, v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->at()Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x1

    :goto_3
    invoke-static {v2, v3, v0}, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a(JZ)I

    move-result v10

    .line 2789
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_1

    .line 2790
    const/16 v1, 0xf01

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 35145
    iget-object v2, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2790
    const/16 v3, 0xa

    const/4 v4, 0x0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->at()Z

    move-result v0

    if-eqz v0, :cond_d

    const-string v6, ""

    :goto_4
    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/bf;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    goto/16 :goto_1

    .line 2783
    :cond_c
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ar()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/lang/String;)Z

    move-result v0

    goto :goto_3

    .line 2790
    :cond_d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aq()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    .line 2794
    :cond_e
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->V()V

    .line 2795
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_1

    .line 2796
    const/16 v1, 0xf01

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 36145
    iget-object v2, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2796
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v3

    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->af()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y:Ljava/lang/String;

    iget-object v8, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->aq:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/bf;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    goto/16 :goto_1

    .line 2737
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method public final s()V
    .locals 2

    .prologue
    .line 2872
    const-string v0, "saveDialog"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2874
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    if-eqz v0, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 37145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2874
    if-eqz v0, :cond_0

    .line 2878
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 2879
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 38145
    iget-object v0, v0, Lcom/roidapp/photogrid/release/oi;->e:Ljava/lang/String;

    .line 2879
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/oi;->c()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;I)V

    .line 2883
    :goto_0
    return-void

    .line 2881
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Y()V

    goto :goto_0
.end method

.method public final t()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    .line 2903
    const-string v0, "saveDialog"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2904
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(Ljava/lang/String;)Z

    .line 2906
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2927
    :goto_0
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 2928
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->Z()V

    .line 2929
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/oi;->e()V

    .line 2930
    return-void

    .line 2908
    :pswitch_0
    new-instance v0, Lcom/roidapp/photogrid/release/oo;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/oo;-><init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2911
    :pswitch_1
    new-instance v0, Lcom/roidapp/photogrid/release/pd;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/pd;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2914
    :pswitch_2
    new-instance v0, Lcom/roidapp/photogrid/release/ou;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ou;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2917
    :pswitch_3
    new-instance v0, Lcom/roidapp/photogrid/release/ol;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/ol;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;Lcom/roidapp/photogrid/release/az;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2920
    :pswitch_4
    new-instance v0, Lcom/roidapp/photogrid/release/pi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-direct {v0, p0, v1, v2, v7}, Lcom/roidapp/photogrid/release/pi;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2923
    :pswitch_5
    new-instance v0, Lcom/roidapp/photogrid/release/pi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v3, 0x2

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/roidapp/photogrid/release/pi;-><init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    goto :goto_0

    .line 2906
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final u()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 2971
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n()V

    .line 2972
    const/4 v0, 0x1

    invoke-direct {p0, v1, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->d(ZZ)V

    .line 2973
    new-instance v0, Lcom/roidapp/photogrid/release/be;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/be;-><init>()V

    .line 41024
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "(Product Model:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",SDK:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41025
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 41026
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 41027
    const v2, 0x7f070158

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 41028
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 41029
    const v2, 0x7f070157

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 41030
    const v2, 0x7f070156

    new-instance v3, Lcom/roidapp/photogrid/release/bf;

    invoke-direct {v3, v0, p0}, Lcom/roidapp/photogrid/release/bf;-><init>(Lcom/roidapp/photogrid/release/be;Landroid/app/Activity;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 41037
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 41038
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 41043
    :goto_0
    return-void

    .line 41040
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 41042
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_0
.end method

.method public final v()Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 3154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    .line 3155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3156
    instance-of v2, v0, Lcom/roidapp/photogrid/release/ra;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 3160
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->U:Lcom/roidapp/photogrid/release/az;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/az;->d()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method public final w()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 3171
    const-string v0, "doShake"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 3174
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 3258
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 3176
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 3177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3178
    if-eqz v0, :cond_1

    .line 3179
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 3180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->b()V

    .line 3183
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->W()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->t(I)V

    .line 3184
    invoke-virtual {p0, v1, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(ZI)V

    goto :goto_0

    .line 3188
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3192
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f080003

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 3194
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    array-length v4, v0

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    .line 3195
    aget-object v3, v0, v3

    .line 3197
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 3199
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->l(Ljava/lang/String;)V

    .line 3200
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/String;)V

    .line 3201
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 3202
    invoke-direct {p0, v2, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(ZZ)V

    goto :goto_0

    .line 3205
    :pswitch_3
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 3207
    const-string v0, "FragmentBgListSub"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3208
    const-string v0, "FragmentBgListSub"

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/cd;

    .line 3209
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/cd;->a()I

    move-result v0

    if-nez v0, :cond_2

    .line 3210
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->K()V

    .line 3215
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->c()V

    .line 3216
    invoke-direct {p0, v2, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(ZZ)V

    goto/16 :goto_0

    .line 3220
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_3

    .line 3221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->g()Lcom/roidapp/photogrid/release/ao;

    move-result-object v0

    .line 3222
    if-eqz v0, :cond_3

    .line 3223
    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/ao;->f:Z

    .line 3224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->b()V

    .line 3228
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    .line 3232
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 3234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->d()V

    .line 3237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ne v0, v2, :cond_4

    move v0, v1

    .line 3244
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iget v4, v4, Lcom/roidapp/photogrid/release/mm;->m:I

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 3245
    iget-object v3, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/mm;->b(Z)I

    move-result v3

    .line 3246
    iget-object v4, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v4, v3, v0}, Lcom/roidapp/photogrid/release/mm;->a(IZ)V

    .line 3248
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->ai:Z

    .line 3249
    invoke-virtual {p0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 3250
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T()V

    goto/16 :goto_0

    .line 3239
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/16 v3, 0xf

    if-le v0, v3, :cond_5

    move v0, v2

    .line 3240
    goto :goto_1

    .line 3242
    :cond_5
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z

    move-result v0

    goto :goto_1

    .line 3174
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 2939
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 2959
    :pswitch_0
    const-string v0, "grid"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    .line 2962
    :goto_0
    return-void

    .line 2943
    :pswitch_1
    const-string v0, "grid"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    goto :goto_0

    .line 2946
    :pswitch_2
    const-string v0, "free"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    goto :goto_0

    .line 2949
    :pswitch_3
    const-string v0, "template_grid"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    goto :goto_0

    .line 2953
    :pswitch_4
    const-string v0, "wide_high"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    goto :goto_0

    .line 2956
    :pswitch_5
    const-string v0, "video"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->t:Ljava/lang/String;

    goto :goto_0

    .line 2939
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_5
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final y()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 3263
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    .line 3264
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 3307
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 3266
    :pswitch_1
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aV()I

    move-result v0

    invoke-virtual {p0, v4, v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b(ZI)V

    goto :goto_0

    .line 3270
    :pswitch_2
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ba()Ljava/util/List;

    move-result-object v0

    .line 3271
    if-eqz v0, :cond_0

    .line 3275
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    iput-boolean v3, v2, Lcom/roidapp/photogrid/release/mm;->G:Z

    .line 3277
    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 3279
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->bc()F

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 3280
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aZ()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->m(Z)V

    .line 3281
    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aT()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 3282
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->m(Ljava/util/List;)V

    .line 3283
    invoke-virtual {p0, v4, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0

    .line 3288
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 3291
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aU()Ljava/lang/String;

    move-result-object v2

    .line 3292
    if-eqz v2, :cond_0

    .line 3296
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ra;

    .line 3298
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ra;->r()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->l(Ljava/lang/String;)V

    .line 3299
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ra;->a(Ljava/lang/String;)V

    .line 3300
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->T:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    goto :goto_0

    .line 3304
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->b:Lcom/roidapp/photogrid/release/mm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/mm;->e()V

    goto :goto_0

    .line 3264
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public final z()Lcom/roidapp/photogrid/release/if;
    .locals 2

    .prologue
    .line 4191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a:Landroid/widget/RelativeLayout;

    iget v1, p0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    return-object v0
.end method
