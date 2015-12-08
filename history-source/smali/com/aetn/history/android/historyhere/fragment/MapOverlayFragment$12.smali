.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;
.super Ljava/lang/Object;
.source "MapOverlayFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->animateExpandDetail()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

.field final synthetic val$frag:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    .prologue
    .line 760
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;->val$frag:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 763
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$12;->val$frag:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->animateInMainLayout()V

    .line 764
    return-void
.end method
