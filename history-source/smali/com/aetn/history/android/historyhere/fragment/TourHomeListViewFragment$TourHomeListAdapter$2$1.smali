.class Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;
.super Ljava/lang/Object;
.source "TourHomeListViewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;)V
    .locals 0
    .param p1, "this$2"    # Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    .prologue
    .line 332
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 335
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;->val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02013b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 336
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;->val$holder:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$ViewHolder;->bg:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter$2;->this$1:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment$TourHomeListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/TourHomeListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090037

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 337
    return-void
.end method
