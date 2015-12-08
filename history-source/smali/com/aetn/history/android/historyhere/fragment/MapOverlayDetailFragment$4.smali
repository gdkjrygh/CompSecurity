.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setRemainingData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 374
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0
    .param p1, "i"    # I

    .prologue
    .line 387
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0
    .param p1, "i"    # I
    .param p2, "v"    # F
    .param p3, "i2"    # I

    .prologue
    .line 377
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3
    .param p1, "i"    # I

    .prologue
    .line 381
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mMorePhotosNumber:Landroid/widget/TextView;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$400(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotoGallery:Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/widgets/CustomViewPager;->getCurrentItem()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mPhotos:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateShowHidePhotoNumber()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$500(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    .line 383
    return-void
.end method
