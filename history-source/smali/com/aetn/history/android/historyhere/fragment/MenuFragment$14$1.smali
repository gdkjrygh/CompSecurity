.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14$1;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;

    .prologue
    .line 389
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSponsorImageOut()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1700(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    .line 393
    return-void
.end method
