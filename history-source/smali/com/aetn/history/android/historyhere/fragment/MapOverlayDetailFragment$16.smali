.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;
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
    .line 898
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 901
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;-><init>()V

    .line 902
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2200(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->setPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 903
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$16;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "CallPhoneDialogFragment"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 904
    return-void
.end method
