.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;
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
    .line 166
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 169
    invoke-static {}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->setMapTypeTours()V

    .line 170
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourHomeList()V

    .line 171
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hasNotSelectedPlaces:Z

    .line 172
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 173
    .local v0, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v1, "Button Tapped"

    const-string v2, "Tours"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    const-string v2, "Home Screen Button Taps"

    invoke-virtual {v1, v2, v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 175
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->localyticsTagTourViewedEvent()V

    .line 176
    return-void
.end method
