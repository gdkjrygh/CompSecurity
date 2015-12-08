.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$8;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 336
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 339
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->hideSearch()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V

    .line 340
    return-void
.end method
