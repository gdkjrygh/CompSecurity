.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3$1;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->onPoiDetailLoadFailed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;

    .prologue
    .line 287
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$3;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateCloseMapDetail()V

    .line 291
    return-void
.end method
