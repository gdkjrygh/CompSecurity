.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;
.super Ljava/lang/Object;
.source "TourHomeListViewFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PoiManager$AllToursDataLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->loadCurrentData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 124
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataLoadFailed()V
    .locals 4

    .prologue
    .line 139
    const-string v1, "TourHomeListViewFragment"

    const-string v2, "onPoiDetailLoadFailed"

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d003b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->manageDetailNotLoaded(Ljava/lang/String;)V

    .line 141
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 142
    .local v0, "fm":Landroid/support/v4/app/FragmentManager;
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 143
    return-void
.end method

.method public onDataLoaded(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/aetn/history/android/historyhere/model/POIDetail;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 127
    .local p1, "newList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/aetn/history/android/historyhere/model/POIDetail;>;"
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    # setter for: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;
    invoke-static {v0, p1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$002(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 128
    const-string v0, "TourHomeListViewFragment"

    const-string v1, "loadCurrentData() now loaded"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    # setter for: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$002(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 132
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->tourList:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {v1}, Lcom/aetn/history/android/historyhere/model/POIDetail;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setData()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V

    .line 134
    return-void
.end method
