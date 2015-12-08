.class Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;
.super Ljava/lang/Object;
.source "CallPhoneDialogFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

.field final synthetic val$dialog:Landroid/app/AlertDialog;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;Landroid/app/AlertDialog;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    .prologue
    .line 49
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 52
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 53
    .local v1, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
    const-string v3, "Place Called"

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    check-cast v3, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    const-string v4, "Call Phone Number"

    invoke-virtual {v3, v4, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->tagLocalyticsEvent(Ljava/lang/String;Ljava/util/Map;)V

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "tel:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    # getter for: Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->poi:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->access$000(Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v4

    invoke-virtual {v4}, Lcom/aetn/history/android/historyhere/model/POIDetail;->getFormattedPhoneNumber()Ljava/lang/String;

    move-result-object v4

    const-string v5, "-"

    const-string v6, ""

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 56
    .local v2, "url":Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.CALL"

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 57
    .local v0, "intent":Landroid/content/Intent;
    const/high16 v3, 0x10000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 58
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->this$0:Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    invoke-virtual {v3, v0}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->startActivity(Landroid/content/Intent;)V

    .line 59
    iget-object v3, p0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment$1;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v3}, Landroid/app/AlertDialog;->cancel()V

    .line 60
    return-void
.end method
