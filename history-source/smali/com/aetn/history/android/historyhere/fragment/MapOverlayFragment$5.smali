.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 203
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 207
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->isMapTypePlaces()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getInstance(Landroid/content/Context;)Lcom/aetn/history/android/historyhere/model/PoiManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/model/PoiManager;->getCurrentPOIList()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v3, :cond_0

    .line 208
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;-><init>()V

    .line 209
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 210
    .local v1, "r":Landroid/content/res/Resources;
    const v2, 0x7f0d0044

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f0d0043

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->setTitleText(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "GenericDialogFragment"

    invoke-virtual {v0, v2, v3}, Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 216
    .end local v0    # "dialog":Lcom/aetn/history/android/historyhere/dialogs/GenericDialogFragment;
    .end local v1    # "r":Landroid/content/res/Resources;
    :goto_0
    return-void

    .line 213
    :cond_0
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hideDetailPager()V

    .line 214
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v2

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showPlacesList()V

    goto :goto_0
.end method
