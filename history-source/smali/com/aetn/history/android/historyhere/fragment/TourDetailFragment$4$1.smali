.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4$1;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->onTourDetailLoadFailed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;

    .prologue
    .line 516
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 520
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$4;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 521
    return-void
.end method
