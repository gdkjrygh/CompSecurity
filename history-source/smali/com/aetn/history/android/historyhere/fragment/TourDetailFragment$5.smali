.class Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$5;
.super Ljava/lang/Object;
.source "TourDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    .prologue
    .line 528
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 532
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment$5;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourDetailFragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->popBackStack()V

    .line 534
    return-void
.end method
