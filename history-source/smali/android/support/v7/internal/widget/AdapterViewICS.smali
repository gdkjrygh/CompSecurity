.class abstract Landroid/support/v7/internal/widget/AdapterViewICS;
.super Landroid/view/ViewGroup;
.source "AdapterViewICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/AdapterViewICS$1;,
        Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,
        Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;,
        Landroid/support/v7/internal/widget/AdapterViewICS$AdapterContextMenuInfo;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/widget/Adapter;",
        ">",
        "Landroid/view/ViewGroup;"
    }
.end annotation


# static fields
.field public static final INVALID_POSITION:I = -0x1

.field public static final INVALID_ROW_ID:J = -0x8000000000000000L

.field static final ITEM_VIEW_TYPE_HEADER_OR_FOOTER:I = -0x2

.field static final ITEM_VIEW_TYPE_IGNORE:I = -0x1

.field static final SYNC_FIRST_POSITION:I = 0x1

.field static final SYNC_MAX_DURATION_MILLIS:I = 0x64

.field static final SYNC_SELECTED_POSITION:I


# instance fields
.field mBlockLayoutRequests:Z

.field mDataChanged:Z

.field private mDesiredFocusableInTouchModeState:Z

.field private mDesiredFocusableState:Z

.field private mEmptyView:Landroid/view/View;

.field mFirstPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "scrolling"
    .end annotation
.end field

.field mInLayout:Z

.field mItemCount:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field private mLayoutHeight:I

.field mNeedSync:Z

.field mNextSelectedPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field mNextSelectedRowId:J

.field mOldItemCount:I

.field mOldSelectedPosition:I

.field mOldSelectedRowId:J

.field mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

.field mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

.field mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

.field mSelectedPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field mSelectedRowId:J

.field private mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v7/internal/widget/AdapterViewICS",
            "<TT;>.SelectionNotifier;"
        }
    .end annotation
.end field

.field mSpecificTop:I

.field mSyncHeight:J

.field mSyncMode:I

.field mSyncPosition:I

.field mSyncRowId:J


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v0, 0x0

    .line 228
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 67
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 229
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v0, 0x0

    .line 232
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 233
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    const-wide/high16 v1, -0x8000000000000000L

    const/4 v0, 0x0

    .line 236
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 237
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/os/Parcelable;)V
    .locals 0
    .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;
    .param p1, "x1"    # Landroid/os/Parcelable;

    .prologue
    .line 50
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/AdapterViewICS;)Landroid/os/Parcelable;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;

    .prologue
    .line 50
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/AdapterViewICS;)V
    .locals 0
    .param p0, "x0"    # Landroid/support/v7/internal/widget/AdapterViewICS;

    .prologue
    .line 50
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V

    return-void
.end method

.method private fireOnSelected()V
    .locals 6

    .prologue
    .line 891
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    if-nez v0, :cond_0

    .line 902
    :goto_0
    return-void

    .line 894
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v3

    .line 895
    .local v3, "selection":I
    if-ltz v3, :cond_1

    .line 896
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;

    move-result-object v2

    .line 897
    .local v2, "v":Landroid/view/View;
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1, v3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v4

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onItemSelected(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V

    goto :goto_0

    .line 900
    .end local v2    # "v":Landroid/view/View;
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-interface {v0, p0}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onNothingSelected(Landroid/support/v7/internal/widget/AdapterViewICS;)V

    goto :goto_0
.end method

.method private updateEmptyStatus(Z)V
    .locals 6
    .param p1, "empty"    # Z

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 733
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 734
    const/4 p1, 0x0

    .line 737
    :cond_0
    if-eqz p1, :cond_3

    .line 738
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 739
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 740
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    .line 749
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z

    if-eqz v0, :cond_1

    .line 750
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getRight()I

    move-result v4

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getBottom()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->onLayout(ZIIII)V

    .line 756
    :cond_1
    :goto_1
    return-void

    .line 743
    :cond_2
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    goto :goto_0

    .line 753
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 754
    :cond_4
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 2
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 461
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;I)V
    .locals 2
    .param p1, "child"    # Landroid/view/View;
    .param p2, "index"    # I

    .prologue
    .line 474
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, int) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1, "child"    # Landroid/view/View;
    .param p2, "index"    # I
    .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 502
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, int, LayoutParams) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .param p1, "child"    # Landroid/view/View;
    .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 487
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, LayoutParams) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected canAnimate()Z
    .locals 1

    .prologue
    .line 916
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-super {p0}, Landroid/view/ViewGroup;->canAnimate()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method checkFocus()V
    .locals 6

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 714
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 715
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    if-nez v3, :cond_5

    :cond_0
    move v1, v4

    .line 716
    .local v1, "empty":Z
    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v3

    if-eqz v3, :cond_6

    :cond_1
    move v2, v4

    .line 720
    .local v2, "focusable":Z
    :goto_1
    if-eqz v2, :cond_7

    iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    if-eqz v3, :cond_7

    move v3, v4

    :goto_2
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 721
    if-eqz v2, :cond_8

    iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    if-eqz v3, :cond_8

    move v3, v4

    :goto_3
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 722
    iget-object v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    if-eqz v3, :cond_4

    .line 723
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move v5, v4

    :cond_3
    invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V

    .line 725
    :cond_4
    return-void

    .end local v1    # "empty":Z
    .end local v2    # "focusable":Z
    :cond_5
    move v1, v5

    .line 715
    goto :goto_0

    .restart local v1    # "empty":Z
    :cond_6
    move v2, v5

    .line 716
    goto :goto_1

    .restart local v2    # "focusable":Z
    :cond_7
    move v3, v5

    .line 720
    goto :goto_2

    :cond_8
    move v3, v5

    .line 721
    goto :goto_3
.end method

.method checkSelectionChanged()V
    .locals 4

    .prologue
    .line 983
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    iget v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 984
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->selectionChanged()V

    .line 985
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 986
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 988
    :cond_1
    return-void
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2
    .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;

    .prologue
    .line 906
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;

    move-result-object v0

    .line 907
    .local v0, "selectedView":Landroid/view/View;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 909
    const/4 v1, 0x1

    .line 911
    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 793
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 794
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 785
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    .local p1, "container":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 786
    return-void
.end method

.method findSyncPosition()I
    .locals 19

    .prologue
    .line 999
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 1001
    .local v2, "count":I
    if-nez v2, :cond_1

    .line 1002
    const/4 v14, -0x1

    .line 1074
    :cond_0
    :goto_0
    return v14

    .line 1005
    :cond_1
    move-object/from16 v0, p0

    iget-wide v8, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1006
    .local v8, "idToMatch":J
    move-object/from16 v0, p0

    iget v14, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1009
    .local v14, "seed":I
    const-wide/high16 v15, -0x8000000000000000L

    cmp-long v15, v8, v15

    if-nez v15, :cond_2

    .line 1010
    const/4 v14, -0x1

    goto :goto_0

    .line 1014
    :cond_2
    const/4 v15, 0x0

    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 1015
    add-int/lit8 v15, v2, -0x1

    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 1017
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15

    const-wide/16 v17, 0x64

    add-long v3, v15, v17

    .line 1022
    .local v3, "endTime":J
    move v5, v14

    .line 1025
    .local v5, "first":I
    move v10, v14

    .line 1028
    .local v10, "last":I
    const/4 v11, 0x0

    .line 1038
    .local v11, "next":Z
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v1

    .line 1039
    .local v1, "adapter":Landroid/widget/Adapter;, "TT;"
    if-nez v1, :cond_5

    .line 1040
    const/4 v14, -0x1

    goto :goto_0

    .line 1058
    .local v6, "hitFirst":Z
    .local v7, "hitLast":Z
    .local v12, "rowId":J
    :cond_3
    if-nez v6, :cond_4

    if-eqz v11, :cond_9

    if-nez v7, :cond_9

    .line 1060
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 1061
    move v14, v10

    .line 1063
    const/4 v11, 0x0

    .line 1043
    .end local v6    # "hitFirst":Z
    .end local v7    # "hitLast":Z
    .end local v12    # "rowId":J
    :cond_5
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15

    cmp-long v15, v15, v3

    if-gtz v15, :cond_6

    .line 1044
    invoke-interface {v1, v14}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v12

    .line 1045
    .restart local v12    # "rowId":J
    cmp-long v15, v12, v8

    if-eqz v15, :cond_0

    .line 1050
    add-int/lit8 v15, v2, -0x1

    if-ne v10, v15, :cond_7

    const/4 v7, 0x1

    .line 1051
    .restart local v7    # "hitLast":Z
    :goto_2
    if-nez v5, :cond_8

    const/4 v6, 0x1

    .line 1053
    .restart local v6    # "hitFirst":Z
    :goto_3
    if-eqz v7, :cond_3

    if-eqz v6, :cond_3

    .line 1074
    .end local v6    # "hitFirst":Z
    .end local v7    # "hitLast":Z
    .end local v12    # "rowId":J
    :cond_6
    const/4 v14, -0x1

    goto :goto_0

    .line 1050
    .restart local v12    # "rowId":J
    :cond_7
    const/4 v7, 0x0

    goto :goto_2

    .line 1051
    .restart local v7    # "hitLast":Z
    :cond_8
    const/4 v6, 0x0

    goto :goto_3

    .line 1064
    .restart local v6    # "hitFirst":Z
    :cond_9
    if-nez v7, :cond_a

    if-nez v11, :cond_5

    if-nez v6, :cond_5

    .line 1066
    :cond_a
    add-int/lit8 v5, v5, -0x1

    .line 1067
    move v14, v5

    .line 1069
    const/4 v11, 0x1

    goto :goto_1
.end method

.method public abstract getAdapter()Landroid/widget/Adapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public getCount()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 591
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    return v0
.end method

.method public getEmptyView()Landroid/view/View;
    .locals 1

    .prologue
    .line 674
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    return-object v0
.end method

.method public getFirstVisiblePosition()I
    .locals 1

    .prologue
    .line 634
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    return v0
.end method

.method public getItemAtPosition(I)Ljava/lang/Object;
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 765
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 766
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1

    :cond_1
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0
.end method

.method public getItemIdAtPosition(I)J
    .locals 3
    .param p1, "position"    # I

    .prologue
    .line 770
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 771
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const-wide/high16 v1, -0x8000000000000000L

    :goto_0
    return-wide v1

    :cond_1
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v1

    goto :goto_0
.end method

.method public getLastVisiblePosition()I
    .locals 2

    .prologue
    .line 644
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final getOnItemClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
    .locals 1

    .prologue
    .line 290
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    return-object v0
.end method

.method public final getOnItemLongClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
    .locals 1

    .prologue
    .line 356
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

    return-object v0
.end method

.method public final getOnItemSelectedListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
    .locals 1

    .prologue
    .line 402
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    return-object v0
.end method

.method public getPositionForView(Landroid/view/View;)I
    .locals 7
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v5, -0x1

    .line 604
    move-object v3, p1

    .line 607
    .local v3, "listItem":Landroid/view/View;
    :goto_0
    :try_start_0
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .local v4, "v":Landroid/view/View;
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    if-nez v6, :cond_1

    .line 608
    move-object v3, v4

    goto :goto_0

    .line 610
    .end local v4    # "v":Landroid/view/View;
    :catch_0
    move-exception v1

    .line 624
    :cond_0
    :goto_1
    return v5

    .line 616
    .restart local v4    # "v":Landroid/view/View;
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v0

    .line 617
    .local v0, "childCount":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_2
    if-ge v2, v0, :cond_0

    .line 618
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 619
    iget v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    add-int/2addr v5, v2

    goto :goto_1

    .line 617
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 575
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 576
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v1

    .line 577
    .local v1, "selection":I
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    if-lez v2, :cond_0

    if-ltz v1, :cond_0

    .line 578
    invoke-interface {v0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    .line 580
    :goto_0
    return-object v2

    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public getSelectedItemId()J
    .locals 2
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 561
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    return-wide v0
.end method

.method public getSelectedItemPosition()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 552
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    return v0
.end method

.method public abstract getSelectedView()Landroid/view/View;
.end method

.method handleDataChanged()V
    .locals 10

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const-wide/high16 v8, -0x8000000000000000L

    const/4 v7, 0x1

    const/4 v6, -0x1

    const/4 v5, 0x0

    .line 920
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 921
    .local v0, "count":I
    const/4 v1, 0x0

    .line 923
    .local v1, "found":Z
    if-lez v0, :cond_4

    .line 928
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    if-eqz v4, :cond_0

    .line 931
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 935
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->findSyncPosition()I

    move-result v2

    .line 936
    .local v2, "newPos":I
    if-ltz v2, :cond_0

    .line 938
    invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 939
    .local v3, "selectablePos":I
    if-ne v3, v2, :cond_0

    .line 941
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V

    .line 942
    const/4 v1, 0x1

    .line 946
    .end local v2    # "newPos":I
    .end local v3    # "selectablePos":I
    :cond_0
    if-nez v1, :cond_4

    .line 948
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v2

    .line 951
    .restart local v2    # "newPos":I
    if-lt v2, v0, :cond_1

    .line 952
    add-int/lit8 v2, v0, -0x1

    .line 954
    :cond_1
    if-gez v2, :cond_2

    .line 955
    const/4 v2, 0x0

    .line 959
    :cond_2
    invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 960
    .restart local v3    # "selectablePos":I
    if-gez v3, :cond_3

    .line 962
    invoke-virtual {p0, v2, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 964
    :cond_3
    if-ltz v3, :cond_4

    .line 965
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V

    .line 966
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V

    .line 967
    const/4 v1, 0x1

    .line 971
    .end local v2    # "newPos":I
    .end local v3    # "selectablePos":I
    :cond_4
    if-nez v1, :cond_5

    .line 973
    iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 974
    iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 975
    iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 976
    iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 977
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 978
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V

    .line 980
    :cond_5
    return-void
.end method

.method isInFilterMode()Z
    .locals 1

    .prologue
    .line 684
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v0, 0x0

    return v0
.end method

.method lookForSelectablePosition(IZ)I
    .locals 0
    .param p1, "position"    # I
    .param p2, "lookDown"    # Z

    .prologue
    .line 1086
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    return p1
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 849
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 850
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 851
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    .line 542
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getHeight()I

    move-result v0

    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I

    .line 543
    return-void
.end method

.method public performItemClick(Landroid/view/View;IJ)Z
    .locals 7
    .param p1, "view"    # Landroid/view/View;
    .param p2, "position"    # I
    .param p3, "id"    # J

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v6, 0x1

    const/4 v0, 0x0

    .line 303
    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    if-eqz v1, :cond_1

    .line 304
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->playSoundEffect(I)V

    .line 305
    if-eqz p1, :cond_0

    .line 306
    invoke-virtual {p1, v6}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 308
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;->onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V

    move v0, v6

    .line 312
    :cond_1
    return v0
.end method

.method rememberSyncState()V
    .locals 6

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1119
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v2

    if-lez v2, :cond_1

    .line 1120
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 1121
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I

    int-to-long v2, v2

    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncHeight:J

    .line 1122
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    if-ltz v2, :cond_2

    .line 1124
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    iget v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1125
    .local v1, "v":Landroid/view/View;
    iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1126
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1127
    if-eqz v1, :cond_0

    .line 1128
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I

    .line 1130
    :cond_0
    iput v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    .line 1147
    .end local v1    # "v":Landroid/view/View;
    :cond_1
    :goto_0
    return-void

    .line 1133
    :cond_2
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1134
    .restart local v1    # "v":Landroid/view/View;
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 1135
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    if-ltz v2, :cond_4

    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 1136
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v2

    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1140
    :goto_1
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1141
    if-eqz v1, :cond_3

    .line 1142
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I

    .line 1144
    :cond_3
    iput v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    goto :goto_0

    .line 1138
    :cond_4
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    goto :goto_1
.end method

.method public removeAllViews()V
    .locals 2

    .prologue
    .line 537
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeAllViews() is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2
    .param p1, "child"    # Landroid/view/View;

    .prologue
    .line 515
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeView(View) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public removeViewAt(I)V
    .locals 2
    .param p1, "index"    # I

    .prologue
    .line 527
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeViewAt(int) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method selectionChanged()V
    .locals 2

    .prologue
    .line 869
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    if-eqz v0, :cond_2

    .line 870
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    if-eqz v0, :cond_4

    .line 875
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    if-nez v0, :cond_1

    .line 876
    new-instance v0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$1;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    .line 878
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->post(Ljava/lang/Runnable;)Z

    .line 885
    :cond_2
    :goto_0
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isShown()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_3

    .line 886
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->sendAccessibilityEvent(I)V

    .line 888
    :cond_3
    return-void

    .line 880
    :cond_4
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V

    goto :goto_0
.end method

.method public abstract setAdapter(Landroid/widget/Adapter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public setEmptyView(Landroid/view/View;)V
    .locals 3
    .param p1, "emptyView"    # Landroid/view/View;

    .prologue
    .line 659
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    .line 661
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 662
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    .line 663
    .local v1, "empty":Z
    :goto_0
    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V

    .line 664
    return-void

    .line 662
    .end local v1    # "empty":Z
    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public setFocusable(Z)V
    .locals 5
    .param p1, "focusable"    # Z

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 689
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 690
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    if-nez v4, :cond_3

    :cond_0
    move v1, v3

    .line 692
    .local v1, "empty":Z
    :goto_0
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    .line 693
    if-nez p1, :cond_1

    .line 694
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    .line 697
    :cond_1
    if-eqz p1, :cond_4

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    :goto_1
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 698
    return-void

    .end local v1    # "empty":Z
    :cond_3
    move v1, v2

    .line 690
    goto :goto_0

    .restart local v1    # "empty":Z
    :cond_4
    move v3, v2

    .line 697
    goto :goto_1
.end method

.method public setFocusableInTouchMode(Z)V
    .locals 5
    .param p1, "focusable"    # Z

    .prologue
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 702
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 703
    .local v0, "adapter":Landroid/widget/Adapter;, "TT;"
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    if-nez v4, :cond_3

    :cond_0
    move v1, v3

    .line 705
    .local v1, "empty":Z
    :goto_0
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    .line 706
    if-eqz p1, :cond_1

    .line 707
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    .line 710
    :cond_1
    if-eqz p1, :cond_4

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_2
    :goto_1
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 711
    return-void

    .end local v1    # "empty":Z
    :cond_3
    move v1, v2

    .line 703
    goto :goto_0

    .restart local v1    # "empty":Z
    :cond_4
    move v3, v2

    .line 710
    goto :goto_1
.end method

.method setNextSelectedPositionInt(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 1104
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 1105
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 1107
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    .line 1108
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1109
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1111
    :cond_0
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2
    .param p1, "l"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 776
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
    .locals 0
    .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .prologue
    .line 282
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .line 283
    return-void
.end method

.method public setOnItemLongClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

    .prologue
    .line 345
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isLongClickable()Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->setLongClickable(Z)V

    .line 348
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

    .line 349
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V
    .locals 0
    .param p1, "listener"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    .prologue
    .line 398
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    .line 399
    return-void
.end method

.method setSelectedPositionInt(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 1094
    .local p0, "this":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 1095
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J

    move-result-wide v0

    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 1096
    return-void
.end method

.method public abstract setSelection(I)V
.end method
