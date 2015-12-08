.class Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;
.super Ljava/lang/Object;
.source "DirectionsDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;Landroid/app/AlertDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 52
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 53
    .local v5, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v7, "Directed To"

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v8

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    check-cast v7, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v8, "Get Directions"

    invoke-virtual {v7, v8, v5}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 55
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLatitude()D

    move-result-wide v1

    .line 56
    .local v1, "lat":D
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v7}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v7

    invoke-virtual {v7}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getLongitude()D

    move-result-wide v3

    .line 57
    .local v3, "lng":D
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "geo:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ","

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "?q="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ","

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v8}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v8

    invoke-virtual {v8}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ")"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 58
    .local v6, "url":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    const-string v7, "android.intent.action.VIEW"

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-direct {v0, v7, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 59
    .local v0, "intent":Landroid/content/Intent;
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;

    invoke-virtual {v7, v0}, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment;->startActivity(Landroid/content/Intent;)V

    .line 60
    iget-object v7, p0, Lcom/aetn/history/android/historyhere/dialogs/DirectionsDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v7}, Landroid/app/AlertDialog;->cancel()V

    .line 61
    return-void
.end method
