.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$1;
.super Ljava/lang/Object;
.source "TourHomeListViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    .prologue
    .line 76
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 79
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$1;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showMenu()V

    .line 80
    return-void
.end method
