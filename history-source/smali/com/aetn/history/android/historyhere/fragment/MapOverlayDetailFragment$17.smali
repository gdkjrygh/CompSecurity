.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;
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
    .line 909
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 912
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v3

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getWebsite()Ljava/lang/String;

    move-result-object v2

    .line 913
    .local v2, "url":Ljava/lang/String;
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 914
    .local v1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "Link Location"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 915
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v3

    const-string v4, "External Link"

    invoke-virtual {v3, v4, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 916
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 917
    .local v0, "browserIntent":Landroid/content/Intent;
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$17;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v3, v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->startActivity(Landroid/content/Intent;)V

    .line 918
    return-void
.end method
