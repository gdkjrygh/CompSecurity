.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$1;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 86
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSplashOut()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    .line 90
    return-void
.end method
