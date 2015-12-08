.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$2;
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
    .line 181
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 184
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->toggleMapSettingsMenu()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)V

    .line 185
    return-void
.end method
