.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;
.super Ljava/lang/Object;
.source "ListViewFragment.java"

# interfaces
.implements Lcom/aetn/history/android/historyhere/model/PreferenceManager$OnFavoritesChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .prologue
    .line 71
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFavoritesChanged()V
    .locals 2

    .prologue
    .line 74
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "onFavoritesChanged"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/aetn/history/android/historyhere/model/PreferenceManager;->hasFavorites(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hidePlacesList()V

    .line 81
    :goto_0
    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->loadCurrentData()V

    goto :goto_0
.end method
