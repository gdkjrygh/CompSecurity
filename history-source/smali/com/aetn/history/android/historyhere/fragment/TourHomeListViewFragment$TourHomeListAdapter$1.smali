.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;
.super Ljava/lang/Object;
.source "TourHomeListViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

.field final synthetic val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

.field final synthetic val$o:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;Lcom/aetn/history/android/historyhere/model/POIDetail;Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    .prologue
    .line 307
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->val$o:Lcom/aetn/history/android/historyhere/model/POIDetail;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "_v"    # Landroid/view/View;

    .prologue
    .line 310
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->val$o:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v0, v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showTourDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 312
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02013b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 313
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->bg:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09003a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 315
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1$1;

    invoke-direct {v1, p0}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$1;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 322
    return-void
.end method
