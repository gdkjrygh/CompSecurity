.class Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$12;
.super Ljava/lang/Object;
.source "ListOverlayDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setListeners()V
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
    .line 838
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 841
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateCloseListDetail()V

    .line 842
    return-void
.end method
