.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$PoiDetailLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->makeDetailRequest()V
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
    .line 277
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPoiDetailLoadFailed()V
    .locals 4

    .prologue
    .line 285
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d003d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 287
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 293
    return-void
.end method

.method public onPoiDetailLoaded(Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 1
    .param p1, "detail"    # Lcom/aetn/history/android/historyhere/model/POIDetail;

    .prologue
    .line 280
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setRemainingData()V

    .line 281
    return-void
.end method
