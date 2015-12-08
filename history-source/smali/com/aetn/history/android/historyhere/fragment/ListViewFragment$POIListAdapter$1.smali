.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;
.super Ljava/lang/Object;
.source "ListViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

.field final synthetic val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

.field final synthetic val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;Lcom/aetn/history/android/historyhere/model/POIDetail;)V
    .locals 0
    .param p1, "this$1"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    .prologue
    .line 281
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iput-object p3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6
    .param p1, "_v"    # Landroid/view/View;

    .prologue
    .line 284
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "setOnTouchListener: make dark"

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->root:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f090015

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 286
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v3, v3, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v3}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f020089

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 287
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v2}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    check-cast v2, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$poi:Lcom/aetn/history/android/historyhere/model/POIDetail;

    invoke-virtual {v2, v3}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->showListDetail(Lcom/aetn/history/android/historyhere/model/POIDetail;)V

    .line 288
    const/4 v2, 0x2

    new-array v0, v2, [I

    .line 289
    .local v0, "coords":[I
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 291
    const/4 v2, 0x1

    aget v1, v0, v2

    .line 292
    .local v1, "top":I
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "position of item from top: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v4, v4, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getTopPositionOfView(Landroid/view/View;)I
    invoke-static {v4, p1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$200(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;Landroid/view/View;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v2, v2, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->TAG:Ljava/lang/String;
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "height of item from top: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;

    invoke-direct {v3, p0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;)V

    const-wide/16 v4, 0x32

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 301
    return-void
.end method
