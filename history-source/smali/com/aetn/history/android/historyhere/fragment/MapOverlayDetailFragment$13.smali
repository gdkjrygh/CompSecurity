.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$13;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setListeners()V
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
    .line 873
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 876
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$13;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->toggleFavorite()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2300(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V

    .line 878
    return-void
.end method
