.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 318
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFavoritesChanged()V
    .locals 2

    .prologue
    .line 321
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onFavoritesChanged"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->getFavoritesString(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mFavoritesString:Ljava/lang/String;
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1702(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypeFavorites()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasFavorites(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapType(I)V

    .line 329
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideDetailPager()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1800(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 331
    :cond_1
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->refreshPlacesMap()V

    .line 332
    return-void
.end method
