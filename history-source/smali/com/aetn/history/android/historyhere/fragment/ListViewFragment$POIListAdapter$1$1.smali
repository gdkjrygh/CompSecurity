.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;
.super Ljava/lang/Object;
.source "ListViewFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;)V
    .locals 0
    .param p1, "this$2"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    .prologue
    .line 294
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 297
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->root:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090014

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 298
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->val$holder:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;

    iget-object v0, v0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$ViewHolder;->iconMask:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1$1;->this$2:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter$1;->this$1:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$POIListAdapter;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0200e9

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 299
    return-void
.end method
