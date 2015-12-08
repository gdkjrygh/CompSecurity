.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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
    .line 537
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 540
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$6;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->access$500(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/ShareUtils;->shareDetail(Landroid/content/Context;Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 542
    return-void
.end method
