.class Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;
.super Landroid/database/DataSetObserver;
.source "AdapterViewICS.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/AdapterViewICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AdapterDataSetObserver"
.end annotation


# instance fields
.field private mInstanceState:Landroid/os/Parcelable;

.field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V
    .locals 1

    .prologue
    .line 796
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    .line 798
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    return-void
.end method


# virtual methods
.method public clearSavedState()V
    .locals 1

    .prologue
    .line 843
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    .line 844
    return-void
.end method

.method public onChanged()V
    .locals 2

    .prologue
    .line 802
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z

    .line 803
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget v1, v1, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I

    .line 804
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 808
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    if-lez v0, :cond_0

    .line 810
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    # invokes: Landroid/support/v7/internal/widget/AdapterViewICS;->onRestoreInstanceState(Landroid/os/Parcelable;)V
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$000(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/os/Parcelable;)V

    .line 811
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    .line 815
    :goto_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkFocus()V

    .line 816
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->requestLayout()V

    .line 817
    return-void

    .line 813
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->rememberSyncState()V

    goto :goto_0
.end method

.method public onInvalidated()V
    .locals 6

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.AdapterDataSetObserver;"
    const-wide/high16 v4, -0x8000000000000000L

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 821
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z

    .line 823
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 826
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    # invokes: Landroid/support/v7/internal/widget/AdapterViewICS;->onSaveInstanceState()Landroid/os/Parcelable;
    invoke-static {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$100(Landroid/support/v7/internal/widget/AdapterViewICS;)Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->mInstanceState:Landroid/os/Parcelable;

    .line 830
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iget v1, v1, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    iput v1, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldItemCount:I

    .line 831
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput v3, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 832
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 833
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput-wide v4, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 834
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 835
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput-wide v4, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 836
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    iput-boolean v3, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 838
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkFocus()V

    .line 839
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->requestLayout()V

    .line 840
    return-void
.end method
