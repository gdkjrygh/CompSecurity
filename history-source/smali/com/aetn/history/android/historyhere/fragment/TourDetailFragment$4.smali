.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$TourDetailLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 504
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTourDetailLoadFailed()V
    .locals 4

    .prologue
    .line 513
    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$300()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onTourDetailLoadFailed(): show error "

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d003f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 516
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 523
    return-void
.end method

.method public onTourDetailLoaded(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 2
    .param p1, "poi"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 507
    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$300()Ljava/lang/String;

    move-result-object v0

    const-string v1, "setOnTourDetailReceivedListener"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$502(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;Lcom/aetn/history/android/historyhere/model/POIDetail;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    .line 509
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setRemainingData()V

    .line 510
    return-void
.end method
