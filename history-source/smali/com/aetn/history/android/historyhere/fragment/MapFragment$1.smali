.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;
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
    .line 108
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 111
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "mapUpdateRunnable: run - now refresh the map"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->refreshPlacesMap()V

    .line 113
    return-void
.end method
