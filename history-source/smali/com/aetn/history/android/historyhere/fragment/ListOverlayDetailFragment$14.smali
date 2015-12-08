.class Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;
.super Ljava/lang/Object;
.source "ListOverlayDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 856
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 859
    new-instance v0, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;

    invoke-direct {v0}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;-><init>()V

    .line 860
    .local v0, "dialog":Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->detail:Lcom/aetn/history/android/historyhere/model/POIDetail;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1600(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/model/POIDetail;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->setPOI(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 861
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "CallPhoneDialogFragment"

    invoke-virtual {v0, v1, v2}, Lcom/aetn/history/android/historyhere/dialogs/CallPhoneDialogFragment;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 862
    return-void
.end method
