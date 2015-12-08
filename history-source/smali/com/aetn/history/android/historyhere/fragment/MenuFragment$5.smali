.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 179
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 183
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasFavorites(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 184
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentFavoritesListFromDB(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 185
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showFavorites()V

    .line 189
    :goto_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    .line 190
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 191
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "Button Tapped"

    const-string v2, "Favorites"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    const-string v2, "Home Screen Button Taps"

    invoke-virtual {v1, v2, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 193
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsTagTourViewedEvent()V

    .line 194
    return-void

    .line 187
    .end local v0    # "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->showFavoritesIntro()V
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$300(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    goto :goto_0
.end method
