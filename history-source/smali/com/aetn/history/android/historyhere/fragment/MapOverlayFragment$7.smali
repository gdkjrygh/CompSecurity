.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;
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
    .line 226
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 229
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMenu()V

    .line 230
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$7;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->hideDetailPager()V

    .line 231
    return-void
.end method
