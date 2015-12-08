.class public Landroid/support/v7/internal/widget/ListPopupWindow;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;,
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;,
        Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;,
        Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;,
        Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;,
        Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field private static final EXPAND_LIST_TIMEOUT:I = 0xfa

.field public static final FILL_PARENT:I = -0x1

.field public static final INPUT_METHOD_FROM_FOCUSABLE:I = 0x0

.field public static final INPUT_METHOD_NEEDED:I = 0x1

.field public static final INPUT_METHOD_NOT_NEEDED:I = 0x2

.field public static final POSITION_PROMPT_ABOVE:I = 0x0

.field public static final POSITION_PROMPT_BELOW:I = 0x1

.field private static final TAG:Ljava/lang/String; = "ListPopupWindow"

.field public static final WRAP_CONTENT:I = -0x2


# instance fields
.field private mAdapter:Landroid/widget/ListAdapter;

.field private mContext:Landroid/content/Context;

.field private mDropDownAlwaysVisible:Z

.field private mDropDownAnchorView:Landroid/view/View;

.field private mDropDownHeight:I

.field private mDropDownHorizontalOffset:I

.field private mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

.field private mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

.field private mDropDownVerticalOffset:I

.field private mDropDownVerticalOffsetSet:Z

.field private mDropDownWidth:I

.field private mForceIgnoreOutsideTouch:Z

.field private mHandler:Landroid/os/Handler;

.field private final mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

.field private mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

.field private mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private mLayoutDirection:I

.field mListItemExpandMaximum:I

.field private mModal:Z

.field private mObserver:Landroid/database/DataSetObserver;

.field private mPopup:Landroid/widget/PopupWindow;

.field private mPromptPosition:I

.field private mPromptView:Landroid/view/View;

.field private final mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

.field private final mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

.field private mShowDropDownRunnable:Ljava/lang/Runnable;

.field private mTempRect:Landroid/graphics/Rect;

.field private final mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 167
    const/4 v0, 0x0

    sget v1, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I

    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 168
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 178
    sget v0, Landroid/support/v7/appcompat/R$attr;->listPopupWindowStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 179
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    const/4 v1, -0x2

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    .line 72
    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 77
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    .line 78
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    .line 79
    const v1, 0x7fffffff

    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I

    .line 82
    iput v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    .line 93
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    .line 94
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    .line 95
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    .line 96
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    invoke-direct {v1, p0, v2}, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    .line 99
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    .line 101
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    .line 190
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    .line 191
    new-instance v1, Landroid/widget/PopupWindow;

    invoke-direct {v1, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    .line 192
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 194
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 196
    .local v0, "locale":Ljava/util/Locale;
    return-void
.end method

.method static synthetic access$1000(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/os/Handler;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    return-object v0
.end method

.method static synthetic access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;

    .prologue
    .line 55
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    return-object v0
.end method

.method private buildDropDown()I
    .locals 21

    .prologue
    .line 911
    const/16 v17, 0x0

    .line 913
    .local v17, "otherHeights":I
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    if-nez v1, :cond_7

    .line 914
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    .line 922
    .local v8, "context":Landroid/content/Context;
    new-instance v1, Landroid/support/v7/internal/widget/ListPopupWindow$1;

    move-object/from16 v0, p0

    invoke-direct {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$1;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;

    .line 932
    new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    if-nez v1, :cond_6

    const/4 v1, 0x1

    :goto_0
    invoke-direct {v3, v8, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;-><init>(Landroid/content/Context;Z)V

    move-object/from16 v0, p0

    iput-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 933
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 934
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 936
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 937
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 938
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusable(Z)V

    .line 939
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setFocusableInTouchMode(Z)V

    .line 940
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow$2;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$2;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 956
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mScrollListener:Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 958
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    if-eqz v1, :cond_1

    .line 959
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 962
    :cond_1
    move-object/from16 v0, p0

    iget-object v9, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 964
    .local v9, "dropDownView":Landroid/view/ViewGroup;
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    .line 965
    .local v13, "hintView":Landroid/view/View;
    if-eqz v13, :cond_2

    .line 968
    new-instance v11, Landroid/widget/LinearLayout;

    invoke-direct {v11, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 969
    .local v11, "hintContainer":Landroid/widget/LinearLayout;
    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 971
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v12, v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 975
    .local v12, "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    packed-switch v1, :pswitch_data_0

    .line 987
    const-string v1, "ListPopupWindow"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid hint position "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 993
    :goto_1
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    const/high16 v3, -0x80000000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 994
    .local v20, "widthSpec":I
    const/4 v10, 0x0

    .line 995
    .local v10, "heightSpec":I
    move/from16 v0, v20

    invoke-virtual {v13, v0, v10}, Landroid/view/View;->measure(II)V

    .line 997
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 998
    .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v3

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v17, v1, v3

    .line 1001
    move-object v9, v11

    .line 1004
    .end local v10    # "heightSpec":I
    .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
    .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    .end local v20    # "widthSpec":I
    :cond_2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v9}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 1018
    .end local v8    # "context":Landroid/content/Context;
    .end local v13    # "hintView":Landroid/view/View;
    :cond_3
    :goto_2
    const/16 v18, 0x0

    .line 1019
    .local v18, "padding":I
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    .line 1020
    .local v7, "background":Landroid/graphics/drawable/Drawable;
    if-eqz v7, :cond_8

    .line 1021
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v7, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1022
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int v18, v1, v3

    .line 1026
    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    if-nez v1, :cond_4

    .line 1027
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    move-object/from16 v0, p0

    iput v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    .line 1034
    :cond_4
    :goto_3
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_9

    const/4 v14, 0x1

    .line 1036
    .local v14, "ignoreBottomDecorations":Z
    :goto_4
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v1

    move-object/from16 v0, p0

    iget v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v3, v14}, Landroid/support/v7/internal/widget/ListPopupWindow;->getMaxAvailableHeight(Landroid/view/View;IZ)I

    move-result v16

    .line 1039
    .local v16, "maxHeight":I
    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    if-nez v1, :cond_5

    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_a

    .line 1040
    :cond_5
    add-int v1, v16, v18

    .line 1070
    :goto_5
    return v1

    .line 932
    .end local v7    # "background":Landroid/graphics/drawable/Drawable;
    .end local v9    # "dropDownView":Landroid/view/ViewGroup;
    .end local v14    # "ignoreBottomDecorations":Z
    .end local v16    # "maxHeight":I
    .end local v18    # "padding":I
    .restart local v8    # "context":Landroid/content/Context;
    :cond_6
    const/4 v1, 0x0

    goto/16 :goto_0

    .line 977
    .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
    .restart local v11    # "hintContainer":Landroid/widget/LinearLayout;
    .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    .restart local v13    # "hintView":Landroid/view/View;
    :pswitch_0
    invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 978
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto/16 :goto_1

    .line 982
    :pswitch_1
    invoke-virtual {v11, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 983
    invoke-virtual {v11, v9, v12}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_1

    .line 1006
    .end local v8    # "context":Landroid/content/Context;
    .end local v9    # "dropDownView":Landroid/view/ViewGroup;
    .end local v11    # "hintContainer":Landroid/widget/LinearLayout;
    .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    .end local v13    # "hintView":Landroid/view/View;
    :cond_7
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    .line 1007
    .restart local v9    # "dropDownView":Landroid/view/ViewGroup;
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    move-object/from16 v19, v0

    .line 1008
    .local v19, "view":Landroid/view/View;
    if-eqz v19, :cond_3

    .line 1009
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    .line 1011
    .restart local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v3

    iget v3, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    add-int v17, v1, v3

    goto/16 :goto_2

    .line 1030
    .end local v12    # "hintParams":Landroid/widget/LinearLayout$LayoutParams;
    .end local v19    # "view":Landroid/view/View;
    .restart local v7    # "background":Landroid/graphics/drawable/Drawable;
    .restart local v18    # "padding":I
    :cond_8
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    goto :goto_3

    .line 1034
    :cond_9
    const/4 v14, 0x0

    goto :goto_4

    .line 1044
    .restart local v14    # "ignoreBottomDecorations":Z
    .restart local v16    # "maxHeight":I
    :cond_a
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    packed-switch v1, :pswitch_data_1

    .line 1058
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1062
    .local v2, "childWidthSpec":I
    :goto_6
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    const/4 v3, 0x0

    const/4 v4, -0x1

    sub-int v5, v16, v17

    const/4 v6, -0x1

    invoke-virtual/range {v1 .. v6}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->measureHeightOfChildrenCompat(IIIII)I

    move-result v15

    .line 1066
    .local v15, "listContent":I
    if-lez v15, :cond_b

    .line 1067
    add-int v17, v17, v18

    .line 1070
    :cond_b
    add-int v1, v15, v17

    goto :goto_5

    .line 1046
    .end local v2    # "childWidthSpec":I
    .end local v15    # "listContent":I
    :pswitch_2
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    sub-int/2addr v1, v3

    const/high16 v3, -0x80000000

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1050
    .restart local v2    # "childWidthSpec":I
    goto :goto_6

    .line 1052
    .end local v2    # "childWidthSpec":I
    :pswitch_3
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget-object v4, v0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    sub-int/2addr v1, v3

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1056
    .restart local v2    # "childWidthSpec":I
    goto :goto_6

    .line 975
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1044
    :pswitch_data_1
    .packed-switch -0x2
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private removePromptView()V
    .locals 3

    .prologue
    .line 617
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    if-eqz v2, :cond_0

    .line 618
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 619
    .local v1, "parent":Landroid/view/ViewParent;
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 620
    check-cast v0, Landroid/view/ViewGroup;

    .line 621
    .local v0, "group":Landroid/view/ViewGroup;
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 624
    .end local v0    # "group":Landroid/view/ViewGroup;
    .end local v1    # "parent":Landroid/view/ViewParent;
    :cond_0
    return-void
.end method


# virtual methods
.method public clearListSelection()V
    .locals 2

    .prologue
    .line 670
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 671
    .local v0, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    if-eqz v0, :cond_0

    .line 673
    const/4 v1, 0x1

    # setter for: Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 675
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestLayout()V

    .line 677
    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 600
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 601
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V

    .line 602
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 603
    iput-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 604
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mResizePopupRunnable:Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 605
    return-void
.end method

.method public getAnchorView()Landroid/view/View;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;

    return-object v0
.end method

.method public getAnimationStyle()I
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getAnimationStyle()I

    move-result v0

    return v0
.end method

.method public getBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 453
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    return v0
.end method

.method public getHorizontalOffset()I
    .locals 1

    .prologue
    .line 384
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    return v0
.end method

.method public getInputMethodMode()I
    .locals 1

    .prologue
    .line 647
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    return v0
.end method

.method public getListView()Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 765
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    return-object v0
.end method

.method public getMaxAvailableHeight(Landroid/view/View;IZ)I
    .locals 11
    .param p1, "anchor"    # Landroid/view/View;
    .param p2, "yOffset"    # I
    .param p3, "ignoreBottomDecorations"    # Z

    .prologue
    const/4 v10, 0x1

    .line 1089
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 1090
    .local v2, "displayFrame":Landroid/graphics/Rect;
    invoke-virtual {p1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1092
    const/4 v8, 0x2

    new-array v5, v8, [I

    .line 1093
    .local v5, "mDrawingLocation":[I
    move-object v0, v5

    .line 1094
    .local v0, "anchorPos":[I
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 1096
    iget v1, v2, Landroid/graphics/Rect;->bottom:I

    .line 1097
    .local v1, "bottomEdge":I
    if-eqz p3, :cond_0

    .line 1098
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 1099
    .local v6, "res":Landroid/content/res/Resources;
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v1, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1101
    .end local v6    # "res":Landroid/content/res/Resources;
    :cond_0
    aget v8, v0, v10

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int/2addr v8, v9

    sub-int v8, v1, v8

    sub-int v3, v8, p2

    .line 1102
    .local v3, "distanceToBottom":I
    aget v8, v0, v10

    iget v9, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v8, v9

    add-int v4, v8, p2

    .line 1105
    .local v4, "distanceToTop":I
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 1106
    .local v7, "returnedHeight":I
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-eqz v8, :cond_1

    .line 1107
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v8}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v8, v9}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 1108
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v9

    sub-int/2addr v7, v8

    .line 1111
    :cond_1
    return v7
.end method

.method public getPromptPosition()I
    .locals 1

    .prologue
    .line 238
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    return v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 718
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 719
    const/4 v0, 0x0

    .line 721
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public getSelectedItemId()J
    .locals 2

    .prologue
    .line 742
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 743
    const-wide/high16 v0, -0x8000000000000000L

    .line 745
    :goto_0
    return-wide v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemId()J

    move-result-wide v0

    goto :goto_0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .prologue
    .line 730
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 731
    const/4 v0, -0x1

    .line 733
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v0

    goto :goto_0
.end method

.method public getSelectedView()Landroid/view/View;
    .locals 1

    .prologue
    .line 754
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 755
    const/4 v0, 0x0

    .line 757
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public getSoftInputMode()I
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getSoftInputMode()I

    move-result v0

    return v0
.end method

.method public getVerticalOffset()I
    .locals 1

    .prologue
    .line 400
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    if-nez v0, :cond_0

    .line 401
    const/4 v0, 0x0

    .line 403
    :goto_0
    return v0

    :cond_0
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    goto :goto_0
.end method

.method public getWidth()I
    .locals 1

    .prologue
    .line 420
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    return v0
.end method

.method public isDropDownAlwaysVisible()Z
    .locals 1

    .prologue
    .line 293
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    return v0
.end method

.method public isInputMethodNotNeeded()Z
    .locals 2

    .prologue
    .line 691
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isModal()Z
    .locals 1

    .prologue
    .line 260
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    return v0
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 683
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 13
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/16 v12, 0x14

    const/16 v11, 0x13

    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 789
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v9

    if-eqz v9, :cond_8

    .line 795
    const/16 v9, 0x3e

    if-eq p1, v9, :cond_8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v9

    if-gez v9, :cond_0

    const/16 v9, 0x42

    if-eq p1, v9, :cond_8

    const/16 v9, 0x17

    if-eq p1, v9, :cond_8

    .line 799
    :cond_0
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v4

    .line 802
    .local v4, "curIndex":I
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v9}, Landroid/widget/PopupWindow;->isAboveAnchor()Z

    move-result v9

    if-nez v9, :cond_4

    move v2, v7

    .line 804
    .local v2, "below":Z
    :goto_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    .line 807
    .local v0, "adapter":Landroid/widget/ListAdapter;
    const v5, 0x7fffffff

    .line 808
    .local v5, "firstItem":I
    const/high16 v6, -0x80000000

    .line 810
    .local v6, "lastItem":I
    if-eqz v0, :cond_1

    .line 811
    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v1

    .line 812
    .local v1, "allEnabled":Z
    if-eqz v1, :cond_5

    move v5, v8

    .line 814
    :goto_1
    if-eqz v1, :cond_6

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v9

    add-int/lit8 v6, v9, -0x1

    .line 818
    .end local v1    # "allEnabled":Z
    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    if-ne p1, v11, :cond_2

    if-le v4, v5, :cond_3

    :cond_2
    if-nez v2, :cond_7

    if-ne p1, v12, :cond_7

    if-lt v4, v6, :cond_7

    .line 822
    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V

    .line 823
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v8, v7}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 824
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 872
    .end local v0    # "adapter":Landroid/widget/ListAdapter;
    .end local v2    # "below":Z
    .end local v4    # "curIndex":I
    .end local v5    # "firstItem":I
    .end local v6    # "lastItem":I
    :goto_3
    :sswitch_0
    return v7

    .restart local v4    # "curIndex":I
    :cond_4
    move v2, v8

    .line 802
    goto :goto_0

    .line 812
    .restart local v0    # "adapter":Landroid/widget/ListAdapter;
    .restart local v1    # "allEnabled":Z
    .restart local v2    # "below":Z
    .restart local v5    # "firstItem":I
    .restart local v6    # "lastItem":I
    :cond_5
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    # invokes: Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->lookForSelectablePosition(IZ)I
    invoke-static {v9, v8, v7}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I

    move-result v5

    goto :goto_1

    .line 814
    :cond_6
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    # invokes: Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->lookForSelectablePosition(IZ)I
    invoke-static {v9, v10, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I

    move-result v6

    goto :goto_2

    .line 829
    .end local v1    # "allEnabled":Z
    :cond_7
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    # setter for: Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z
    invoke-static {v9, v8}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 832
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v3

    .line 837
    .local v3, "consumed":Z
    if-eqz v3, :cond_9

    .line 840
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    const/4 v10, 0x2

    invoke-virtual {v9, v10}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 845
    iget-object v9, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v9}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->requestFocusFromTouch()Z

    .line 846
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 848
    sparse-switch p1, :sswitch_data_0

    .end local v0    # "adapter":Landroid/widget/ListAdapter;
    .end local v2    # "below":Z
    .end local v3    # "consumed":Z
    .end local v4    # "curIndex":I
    .end local v5    # "firstItem":I
    .end local v6    # "lastItem":I
    :cond_8
    move v7, v8

    .line 872
    goto :goto_3

    .line 858
    .restart local v0    # "adapter":Landroid/widget/ListAdapter;
    .restart local v2    # "below":Z
    .restart local v3    # "consumed":Z
    .restart local v4    # "curIndex":I
    .restart local v5    # "firstItem":I
    .restart local v6    # "lastItem":I
    :cond_9
    if-eqz v2, :cond_a

    if-ne p1, v12, :cond_a

    .line 861
    if-ne v4, v6, :cond_8

    goto :goto_3

    .line 864
    :cond_a
    if-nez v2, :cond_8

    if-ne p1, v11, :cond_8

    if-ne v4, v5, :cond_8

    goto :goto_3

    .line 848
    nop

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_0
        0x14 -> :sswitch_0
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 885
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getSelectedItemPosition()I

    move-result v1

    if-ltz v1, :cond_1

    .line 886
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v1, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    .line 887
    .local v0, "consumed":Z
    if-eqz v0, :cond_0

    .line 888
    sparse-switch p1, :sswitch_data_0

    .line 900
    .end local v0    # "consumed":Z
    :cond_0
    :goto_0
    return v0

    .line 894
    .restart local v0    # "consumed":Z
    :sswitch_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V

    goto :goto_0

    .line 900
    .end local v0    # "consumed":Z
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 888
    :sswitch_data_0
    .sparse-switch
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method public performItemClick(I)Z
    .locals 7
    .param p1, "position"    # I

    .prologue
    .line 702
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 703
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    if-eqz v0, :cond_0

    .line 704
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 705
    .local v1, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getFirstVisiblePosition()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 706
    .local v2, "child":Landroid/view/View;
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v6

    .line 707
    .local v6, "adapter":Landroid/widget/ListAdapter;
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-interface {v6, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    move v3, p1

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 709
    .end local v1    # "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .end local v2    # "child":Landroid/view/View;
    .end local v6    # "adapter":Landroid/widget/ListAdapter;
    :cond_0
    const/4 v0, 0x1

    .line 711
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public postShow()V
    .locals 2

    .prologue
    .line 506
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mShowDropDownRunnable:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 507
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2
    .param p1, "adapter"    # Landroid/widget/ListAdapter;

    .prologue
    .line 205
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    if-nez v0, :cond_3

    .line 206
    new-instance v0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V

    iput-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    .line 210
    :cond_0
    :goto_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    .line 211
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    invoke-interface {p1, v0}, Landroid/widget/ListAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 215
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    if-eqz v0, :cond_2

    .line 216
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 218
    :cond_2
    return-void

    .line 207
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mAdapter:Landroid/widget/ListAdapter;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mObserver:Landroid/database/DataSetObserver;

    invoke-interface {v0, v1}, Landroid/widget/ListAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    goto :goto_0
.end method

.method public setAnchorView(Landroid/view/View;)V
    .locals 0
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 377
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAnchorView:Landroid/view/View;

    .line 378
    return-void
.end method

.method public setAnimationStyle(I)V
    .locals 1
    .param p1, "animationStyle"    # I

    .prologue
    .line 349
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 350
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 340
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 341
    return-void
.end method

.method public setContentWidth(I)V
    .locals 3
    .param p1, "width"    # I

    .prologue
    .line 440
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 441
    .local v0, "popupBackground":Landroid/graphics/drawable/Drawable;
    if-eqz v0, :cond_0

    .line 442
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 443
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTempRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v2

    add-int/2addr v1, p1

    iput v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 447
    :goto_0
    return-void

    .line 445
    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setWidth(I)V

    goto :goto_0
.end method

.method public setDropDownAlwaysVisible(Z)V
    .locals 0
    .param p1, "dropDownAlwaysVisible"    # Z

    .prologue
    .line 285
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    .line 286
    return-void
.end method

.method public setForceIgnoreOutsideTouch(Z)V
    .locals 0
    .param p1, "forceIgnoreOutsideTouch"    # Z

    .prologue
    .line 271
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    .line 272
    return-void
.end method

.method public setHeight(I)V
    .locals 0
    .param p1, "height"    # I

    .prologue
    .line 462
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    .line 463
    return-void
.end method

.method public setHorizontalOffset(I)V
    .locals 0
    .param p1, "offset"    # I

    .prologue
    .line 393
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    .line 394
    return-void
.end method

.method public setInputMethodMode(I)V
    .locals 1
    .param p1, "mode"    # I

    .prologue
    .line 638
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 639
    return-void
.end method

.method setListItemExpandMax(I)V
    .locals 0
    .param p1, "max"    # I

    .prologue
    .line 775
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I

    .line 776
    return-void
.end method

.method public setListSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "selector"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 324
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownListHighlight:Landroid/graphics/drawable/Drawable;

    .line 325
    return-void
.end method

.method public setModal(Z)V
    .locals 1
    .param p1, "modal"    # Z

    .prologue
    .line 250
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    .line 251
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 252
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/widget/PopupWindow$OnDismissListener;

    .prologue
    .line 613
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 614
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0
    .param p1, "clickListener"    # Landroid/widget/AdapterView$OnItemClickListener;

    .prologue
    .line 472
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemClickListener:Landroid/widget/AdapterView$OnItemClickListener;

    .line 473
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0
    .param p1, "selectedListener"    # Landroid/widget/AdapterView$OnItemSelectedListener;

    .prologue
    .line 482
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mItemSelectedListener:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 483
    return-void
.end method

.method public setPromptPosition(I)V
    .locals 0
    .param p1, "position"    # I

    .prologue
    .line 229
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptPosition:I

    .line 230
    return-void
.end method

.method public setPromptView(Landroid/view/View;)V
    .locals 1
    .param p1, "prompt"    # Landroid/view/View;

    .prologue
    .line 492
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    .line 493
    .local v0, "showing":Z
    if-eqz v0, :cond_0

    .line 494
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->removePromptView()V

    .line 496
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPromptView:Landroid/view/View;

    .line 497
    if-eqz v0, :cond_1

    .line 498
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 500
    :cond_1
    return-void
.end method

.method public setSelection(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 656
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    .line 657
    .local v0, "list":Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 658
    const/4 v1, 0x0

    # setter for: Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 659
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V

    .line 660
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChoiceMode()I

    move-result v1

    if-eqz v1, :cond_0

    .line 661
    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setItemChecked(IZ)V

    .line 664
    :cond_0
    return-void
.end method

.method public setSoftInputMode(I)V
    .locals 1
    .param p1, "mode"    # I

    .prologue
    .line 305
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setSoftInputMode(I)V

    .line 306
    return-void
.end method

.method public setVerticalOffset(I)V
    .locals 1
    .param p1, "offset"    # I

    .prologue
    .line 412
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    .line 413
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffsetSet:Z

    .line 414
    return-void
.end method

.method public setWidth(I)V
    .locals 0
    .param p1, "width"    # I

    .prologue
    .line 430
    iput p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    .line 431
    return-void
.end method

.method public show()V
    .locals 10

    .prologue
    const/4 v3, 0x1

    const/4 v9, -0x2

    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 514
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->buildDropDown()I

    move-result v6

    .line 516
    .local v6, "height":I
    const/4 v4, 0x0

    .line 517
    .local v4, "widthSpec":I
    const/4 v5, 0x0

    .line 519
    .local v5, "heightSpec":I
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isInputMethodNotNeeded()Z

    move-result v7

    .line 521
    .local v7, "noInputMethod":Z
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 522
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v0, :cond_2

    .line 525
    const/4 v4, -0x1

    .line 532
    :goto_0
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    if-ne v2, v0, :cond_8

    .line 535
    if-eqz v7, :cond_4

    move v5, v6

    .line 536
    :goto_1
    if-eqz v7, :cond_6

    .line 537
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v8, v0, :cond_5

    :goto_2
    invoke-virtual {v2, v0, v1}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 552
    :goto_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    if-nez v2, :cond_0

    move v1, v3

    :cond_0
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 554
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 594
    :cond_1
    :goto_4
    return-void

    .line 526
    :cond_2
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v9, :cond_3

    .line 527
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v4

    goto :goto_0

    .line 529
    :cond_3
    iget v4, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    goto :goto_0

    :cond_4
    move v5, v0

    .line 535
    goto :goto_1

    :cond_5
    move v0, v1

    .line 537
    goto :goto_2

    .line 541
    :cond_6
    iget-object v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v0, :cond_7

    move v2, v0

    :goto_5
    invoke-virtual {v8, v2, v0}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    goto :goto_3

    :cond_7
    move v2, v1

    goto :goto_5

    .line 546
    :cond_8
    iget v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    if-ne v0, v9, :cond_9

    .line 547
    move v5, v6

    goto :goto_3

    .line 549
    :cond_9
    iget v5, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    goto :goto_3

    .line 557
    :cond_a
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v0, :cond_d

    .line 558
    const/4 v4, -0x1

    .line 567
    :goto_6
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    if-ne v2, v0, :cond_f

    .line 568
    const/4 v5, -0x1

    .line 577
    :goto_7
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v4, v5}, Landroid/widget/PopupWindow;->setWindowLayoutMode(II)V

    .line 581
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mForceIgnoreOutsideTouch:Z

    if-nez v8, :cond_11

    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownAlwaysVisible:Z

    if-nez v8, :cond_11

    :goto_8
    invoke-virtual {v2, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 582
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mTouchInterceptor:Landroid/support/v7/internal/widget/ListPopupWindow$PopupTouchInterceptor;

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 583
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v2

    iget v3, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHorizontalOffset:I

    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownVerticalOffset:I

    invoke-virtual {v1, v2, v3, v8}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 585
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setSelection(I)V

    .line 587
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    if-eqz v0, :cond_b

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 588
    :cond_b
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V

    .line 590
    :cond_c
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mModal:Z

    if-nez v0, :cond_1

    .line 591
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mHideSelector:Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    .line 560
    :cond_d
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    if-ne v2, v9, :cond_e

    .line 561
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    goto :goto_6

    .line 563
    :cond_e
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownWidth:I

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setWidth(I)V

    goto :goto_6

    .line 570
    :cond_f
    iget v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    if-ne v2, v9, :cond_10

    .line 571
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_7

    .line 573
    :cond_10
    iget-object v2, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mPopup:Landroid/widget/PopupWindow;

    iget v8, p0, Landroid/support/v7/internal/widget/ListPopupWindow;->mDropDownHeight:I

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setHeight(I)V

    goto :goto_7

    :cond_11
    move v3, v1

    .line 581
    goto :goto_8
.end method
