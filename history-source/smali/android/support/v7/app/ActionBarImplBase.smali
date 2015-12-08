.class Landroid/support/v7/app/ActionBarImplBase;
.super Landroid/support/v7/app/ActionBar;
.source "ActionBarImplBase.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;,
        Landroid/support/v7/app/ActionBarImplBase$TabImpl;
    }
.end annotation


# static fields
.field private static final CONTEXT_DISPLAY_NORMAL:I = 0x0

.field private static final CONTEXT_DISPLAY_SPLIT:I = 0x1

.field private static final INVALID_POSITION:I = -0x1


# instance fields
.field mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;

.field private mActionView:Landroid/support/v7/internal/widget/ActionBarView;

.field private mActivity:Landroid/support/v7/app/ActionBarActivity;

.field private mCallback:Landroid/support/v7/app/ActionBar$Callback;

.field private mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private mContentView:Landroid/view/View;

.field private mContext:Landroid/content/Context;

.field private mContextDisplayMode:I

.field private mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

.field private mCurWindowVisibility:I

.field mDeferredDestroyActionMode:Landroid/support/v7/view/ActionMode;

.field mDeferredModeDestroyCallback:Landroid/support/v7/view/ActionMode$Callback;

.field private mDialog:Landroid/app/Dialog;

.field private mDisplayHomeAsUpSet:Z

.field final mHandler:Landroid/os/Handler;

.field private mHasEmbeddedTabs:Z

.field private mHiddenByApp:Z

.field private mHiddenBySystem:Z

.field private mLastMenuVisibility:Z

.field private mMenuVisibilityListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;",
            ">;"
        }
    .end annotation
.end field

.field private mNowShowing:Z

.field private mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

.field private mSavedTabPosition:I

.field private mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

.field private mShowHideAnimationEnabled:Z

.field private mShowingForMode:Z

.field private mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field mTabSelector:Ljava/lang/Runnable;

.field private mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/app/ActionBarImplBase$TabImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mThemedContext:Landroid/content/Context;

.field private mTopVisibilityView:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V
    .locals 1
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$Callback;

    .prologue
    .line 106
    invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    .line 72
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    .line 92
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHandler:Landroid/os/Handler;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mCurWindowVisibility:I

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    .line 107
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    .line 108
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    .line 109
    iput-object p2, p0, Landroid/support/v7/app/ActionBarImplBase;->mCallback:Landroid/support/v7/app/ActionBar$Callback;

    .line 110
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->init(Landroid/support/v7/app/ActionBarActivity;)V

    .line 111
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    return-object v0
.end method

.method static synthetic access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v7/app/ActionBarImplBase;)Z
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    return v0
.end method

.method static synthetic access$300(Landroid/support/v7/app/ActionBarImplBase;)Z
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenBySystem:Z

    return v0
.end method

.method static synthetic access$400(ZZZ)Z
    .locals 1
    .param p0, "x0"    # Z
    .param p1, "x1"    # Z
    .param p2, "x2"    # Z

    .prologue
    .line 54
    invoke-static {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplBase;->checkShowingFlags(ZZZ)Z

    move-result v0

    return v0
.end method

.method static synthetic access$500(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ActionBarContextView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    return-object v0
.end method

.method static synthetic access$600(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ActionBarView;
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;

    .prologue
    .line 54
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    return-object v0
.end method

.method private static checkShowingFlags(ZZZ)Z
    .locals 1
    .param p0, "hiddenByApp"    # Z
    .param p1, "hiddenBySystem"    # Z
    .param p2, "showingForMode"    # Z

    .prologue
    const/4 v0, 0x1

    .line 969
    if-eqz p2, :cond_1

    .line 974
    :cond_0
    :goto_0
    return v0

    .line 971
    :cond_1
    if-nez p0, :cond_2

    if-eqz p1, :cond_0

    .line 972
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private cleanupTabs()V
    .locals 1

    .prologue
    .line 957
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v0, :cond_0

    .line 958
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 960
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 961
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v0, :cond_1

    .line 962
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeAllTabs()V

    .line 964
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    .line 965
    return-void
.end method

.method private configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V
    .locals 6
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "position"    # I

    .prologue
    .line 940
    move-object v3, p1

    check-cast v3, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    .line 941
    .local v3, "tabi":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
    invoke-virtual {v3}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;

    move-result-object v0

    .line 943
    .local v0, "callback":Landroid/support/v7/app/ActionBar$TabListener;
    if-nez v0, :cond_0

    .line 944
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "Action Bar Tab must have a Callback"

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 947
    :cond_0
    invoke-virtual {v3, p2}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V

    .line 948
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 950
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 951
    .local v1, "count":I
    add-int/lit8 v2, p2, 0x1

    .local v2, "i":I
    :goto_0
    if-ge v2, v1, :cond_1

    .line 952
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v4, v2}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V

    .line 951
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 954
    :cond_1
    return-void
.end method

.method private ensureTabsExist()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 919
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v1, :cond_0

    .line 937
    :goto_0
    return-void

    .line 923
    :cond_0
    new-instance v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;-><init>(Landroid/content/Context;)V

    .line 925
    .local v0, "tabScroller":Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    if-eqz v1, :cond_1

    .line 926
    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 927
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 936
    :goto_1
    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    goto :goto_0

    .line 929
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    .line 930
    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 934
    :goto_2
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    goto :goto_1

    .line 932
    :cond_2
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    goto :goto_2
.end method

.method private init(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 7
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 114
    sget v3, Landroid/support/v7/appcompat/R$id;->action_bar_overlay_layout:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    .line 116
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    if-eqz v3, :cond_0

    .line 117
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;

    invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->setActionBar(Landroid/support/v7/app/ActionBar;)V

    .line 119
    :cond_0
    sget v3, Landroid/support/v7/appcompat/R$id;->action_bar:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    .line 120
    sget v3, Landroid/support/v7/appcompat/R$id;->action_context_bar:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/widget/ActionBarContextView;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 121
    sget v3, Landroid/support/v7/appcompat/R$id;->action_bar_container:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 122
    sget v3, Landroid/support/v7/appcompat/R$id;->top_action_bar:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    .line 123
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    if-nez v3, :cond_1

    .line 124
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    .line 126
    :cond_1
    sget v3, Landroid/support/v7/appcompat/R$id;->split_action_bar:I

    invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 128
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz v3, :cond_2

    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-nez v3, :cond_3

    .line 129
    :cond_2
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " can only be used "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "with a compatible window decor layout"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 133
    :cond_3
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v6, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v3, v6}, Landroid/support/v7/internal/widget/ActionBarView;->setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V

    .line 134
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->isSplitActionBar()Z

    move-result v3

    if-eqz v3, :cond_7

    move v3, v4

    :goto_0
    iput v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextDisplayMode:I

    .line 138
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v1

    .line 139
    .local v1, "current":I
    and-int/lit8 v3, v1, 0x4

    if-eqz v3, :cond_8

    move v2, v4

    .line 140
    .local v2, "homeAsUp":Z
    :goto_1
    if-eqz v2, :cond_4

    .line 141
    iput-boolean v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z

    .line 144
    :cond_4
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-static {v3}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    .line 145
    .local v0, "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->enableHomeButtonByDefault()Z

    move-result v3

    if-nez v3, :cond_5

    if-eqz v2, :cond_6

    :cond_5
    move v5, v4

    :cond_6
    invoke-virtual {p0, v5}, Landroid/support/v7/app/ActionBarImplBase;->setHomeButtonEnabled(Z)V

    .line 146
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z

    move-result v3

    invoke-direct {p0, v3}, Landroid/support/v7/app/ActionBarImplBase;->setHasEmbeddedTabs(Z)V

    .line 147
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v3}, Landroid/support/v7/app/ActionBarActivity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/support/v7/app/ActionBarImplBase;->setTitle(Ljava/lang/CharSequence;)V

    .line 148
    return-void

    .end local v0    # "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
    .end local v1    # "current":I
    .end local v2    # "homeAsUp":Z
    :cond_7
    move v3, v5

    .line 134
    goto :goto_0

    .restart local v1    # "current":I
    :cond_8
    move v2, v5

    .line 139
    goto :goto_1
.end method

.method private setHasEmbeddedTabs(Z)V
    .locals 5
    .param p1, "hasEmbeddedTabs"    # Z

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 155
    iput-boolean p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    .line 157
    iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    if-nez v3, :cond_1

    .line 158
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 159
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 164
    :goto_0
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    move v0, v1

    .line 165
    .local v0, "isInTabMode":Z
    :goto_1
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v3, :cond_0

    .line 166
    if-eqz v0, :cond_3

    .line 167
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 172
    :cond_0
    :goto_2
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-boolean v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    if-nez v4, :cond_4

    if-eqz v0, :cond_4

    :goto_3
    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setCollapsable(Z)V

    .line 173
    return-void

    .line 161
    .end local v0    # "isInTabMode":Z
    :cond_1
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    .line 162
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 164
    goto :goto_1

    .line 169
    .restart local v0    # "isInTabMode":Z
    :cond_3
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    goto :goto_2

    :cond_4
    move v1, v2

    .line 172
    goto :goto_3
.end method

.method private updateVisibility(Z)V
    .locals 4
    .param p1, "fromSystem"    # Z

    .prologue
    .line 980
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    iget-boolean v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenBySystem:Z

    iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z

    invoke-static {v1, v2, v3}, Landroid/support/v7/app/ActionBarImplBase;->checkShowingFlags(ZZZ)Z

    move-result v0

    .line 982
    .local v0, "shown":Z
    if-eqz v0, :cond_1

    .line 983
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    if-nez v1, :cond_0

    .line 984
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    .line 985
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->doShow(Z)V

    .line 993
    :cond_0
    :goto_0
    return-void

    .line 988
    :cond_1
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    if-eqz v1, :cond_0

    .line 989
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    .line 990
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->doHide(Z)V

    goto :goto_0
.end method


# virtual methods
.method public addOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 579
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 1
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 401
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/app/ActionBarImplBase;->addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V

    .line 402
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;I)V
    .locals 1
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "position"    # I

    .prologue
    .line 416
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/app/ActionBarImplBase;->addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V

    .line 417
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
    .locals 1
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "position"    # I
    .param p3, "setSelected"    # Z

    .prologue
    .line 421
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V

    .line 422
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V

    .line 423
    invoke-direct {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplBase;->configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V

    .line 424
    if-eqz p3, :cond_0

    .line 425
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 427
    :cond_0
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
    .locals 1
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "setSelected"    # Z

    .prologue
    .line 406
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V

    .line 407
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V

    .line 408
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/app/ActionBarImplBase;->configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V

    .line 409
    if-eqz p2, :cond_0

    .line 410
    invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 412
    :cond_0
    return-void
.end method

.method animateToMode(Z)V
    .locals 4
    .param p1, "toActionMode"    # Z

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 611
    if-eqz p1, :cond_1

    .line 612
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->showForActionMode()V

    .line 617
    :goto_0
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz p1, :cond_2

    const/4 v0, 0x4

    :goto_1
    invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarView;->animateToVisibility(I)V

    .line 618
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    if-eqz p1, :cond_3

    move v0, v1

    :goto_2
    invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->animateToVisibility(I)V

    .line 619
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->hasEmbeddedTabs()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 620
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz p1, :cond_4

    :goto_3
    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 622
    :cond_0
    return-void

    .line 614
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->hideForActionMode()V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 617
    goto :goto_1

    :cond_3
    move v0, v2

    .line 618
    goto :goto_2

    :cond_4
    move v2, v1

    .line 620
    goto :goto_3
.end method

.method public doHide(Z)V
    .locals 5
    .param p1, "fromSystem"    # Z

    .prologue
    const/16 v4, 0x8

    .line 1029
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 1030
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v2

    if-ne v2, v4, :cond_1

    .line 1050
    :cond_0
    :goto_0
    return-void

    .line 1034
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->isShowHideAnimationEnabled()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz p1, :cond_5

    :cond_2
    const/4 v1, 0x1

    .line 1036
    .local v1, "animate":Z
    :goto_1
    if-eqz v1, :cond_3

    .line 1037
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    sget v3, Landroid/support/v7/appcompat/R$anim;->abc_slide_out_top:I

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1038
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1040
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_3
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1042
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    if-eq v2, v4, :cond_0

    .line 1043
    if-eqz v1, :cond_4

    .line 1044
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    sget v3, Landroid/support/v7/appcompat/R$anim;->abc_slide_out_bottom:I

    invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1046
    .restart local v0    # "anim":Landroid/view/animation/Animation;
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1048
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_4
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    goto :goto_0

    .line 1034
    .end local v1    # "animate":Z
    :cond_5
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public doShow(Z)V
    .locals 5
    .param p1, "fromSystem"    # Z

    .prologue
    const/4 v2, 0x0

    .line 1006
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 1007
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 1026
    :cond_0
    :goto_0
    return-void

    .line 1011
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->isShowHideAnimationEnabled()Z

    move-result v3

    if-nez v3, :cond_2

    if-eqz p1, :cond_5

    :cond_2
    const/4 v1, 0x1

    .line 1013
    .local v1, "animate":Z
    :goto_1
    if-eqz v1, :cond_3

    .line 1014
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    sget v4, Landroid/support/v7/appcompat/R$anim;->abc_slide_in_top:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1015
    .local v0, "anim":Landroid/view/animation/Animation;
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1017
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_3
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 1019
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_0

    .line 1020
    if-eqz v1, :cond_4

    .line 1021
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    sget v4, Landroid/support/v7/appcompat/R$anim;->abc_slide_in_bottom:I

    invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 1022
    .restart local v0    # "anim":Landroid/view/animation/Animation;
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1024
    .end local v0    # "anim":Landroid/view/animation/Animation;
    :cond_4
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    goto :goto_0

    .end local v1    # "animate":Z
    :cond_5
    move v1, v2

    .line 1011
    goto :goto_1
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 347
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getCustomNavigationView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayOptions()I
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 539
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    return v0
.end method

.method public getNavigationItemCount()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 252
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 259
    :cond_0
    :goto_0
    return v1

    .line 254
    :pswitch_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 256
    :pswitch_1
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getDropdownAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    .line 257
    .local v0, "adapter":Landroid/widget/SpinnerAdapter;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v1

    goto :goto_0

    .line 252
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getNavigationMode()I
    .locals 1

    .prologue
    .line 362
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    return v0
.end method

.method public getSelectedNavigationIndex()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 240
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 246
    :cond_0
    :goto_0
    return v0

    .line 242
    :pswitch_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v1, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getPosition()I

    move-result v0

    goto :goto_0

    .line 244
    :pswitch_1
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDropdownSelectedPosition()I

    move-result v0

    goto :goto_0

    .line 240
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getSelectedTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 497
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTabAt(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 502
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBar$Tab;

    return-object v0
.end method

.method public getTabCount()I
    .locals 1

    .prologue
    .line 507
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getThemedContext()Landroid/content/Context;
    .locals 5

    .prologue
    .line 512
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;

    if-nez v3, :cond_0

    .line 513
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 514
    .local v1, "outValue":Landroid/util/TypedValue;
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 515
    .local v0, "currentTheme":Landroid/content/res/Resources$Theme;
    sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarWidgetTheme:I

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 516
    iget v2, v1, Landroid/util/TypedValue;->resourceId:I

    .line 518
    .local v2, "targetThemeRes":I
    if-eqz v2, :cond_1

    .line 519
    new-instance v3, Landroid/view/ContextThemeWrapper;

    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-direct {v3, v4, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;

    .line 524
    .end local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
    .end local v1    # "outValue":Landroid/util/TypedValue;
    .end local v2    # "targetThemeRes":I
    :cond_0
    :goto_0
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;

    return-object v3

    .line 521
    .restart local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
    .restart local v1    # "outValue":Landroid/util/TypedValue;
    .restart local v2    # "targetThemeRes":I
    :cond_1
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;

    goto :goto_0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hasNonEmbeddedTabs()Z
    .locals 2

    .prologue
    .line 176
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I

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

.method public hide()V
    .locals 1

    .prologue
    .line 559
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    if-nez v0, :cond_0

    .line 560
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    .line 561
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V

    .line 563
    :cond_0
    return-void
.end method

.method hideForActionMode()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 566
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z

    if-eqz v0, :cond_0

    .line 567
    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z

    .line 568
    invoke-direct {p0, v1}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V

    .line 570
    :cond_0
    return-void
.end method

.method isShowHideAnimationEnabled()Z
    .locals 1

    .prologue
    .line 1053
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowHideAnimationEnabled:Z

    return v0
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 574
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z

    return v0
.end method

.method public newTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 396
    new-instance v0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;-><init>(Landroid/support/v7/app/ActionBarImplBase;)V

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 151
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setHasEmbeddedTabs(Z)V

    .line 152
    return-void
.end method

.method public removeAllTabs()V
    .locals 0

    .prologue
    .line 461
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->cleanupTabs()V

    .line 462
    return-void
.end method

.method public removeOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 1
    .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 584
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 585
    return-void
.end method

.method public removeTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 1
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 431
    invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->removeTabAt(I)V

    .line 432
    return-void
.end method

.method public removeTabAt(I)V
    .locals 7
    .param p1, "position"    # I

    .prologue
    .line 436
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-nez v4, :cond_1

    .line 457
    :cond_0
    :goto_0
    return-void

    .line 441
    :cond_1
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v4, :cond_3

    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v4}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getPosition()I

    move-result v3

    .line 443
    .local v3, "selectedTabPosition":I
    :goto_1
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v4, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeTabAt(I)V

    .line 444
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    .line 445
    .local v2, "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
    if-eqz v2, :cond_2

    .line 446
    const/4 v4, -0x1

    invoke-virtual {v2, v4}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V

    .line 449
    :cond_2
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 450
    .local v1, "newTabCount":I
    move v0, p1

    .local v0, "i":I
    :goto_2
    if-ge v0, v1, :cond_4

    .line 451
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v4, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V

    .line 450
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 441
    .end local v0    # "i":I
    .end local v1    # "newTabCount":I
    .end local v2    # "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
    .end local v3    # "selectedTabPosition":I
    :cond_3
    iget v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    goto :goto_1

    .line 454
    .restart local v0    # "i":I
    .restart local v1    # "newTabCount":I
    .restart local v2    # "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
    .restart local v3    # "selectedTabPosition":I
    :cond_4
    if-ne v3, p1, :cond_0

    .line 455
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x0

    :goto_3
    invoke-virtual {p0, v4}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    goto :goto_0

    :cond_5
    iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    const/4 v5, 0x0

    add-int/lit8 v6, p1, -0x1

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    goto :goto_3
.end method

.method public selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 4
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    const/4 v1, -0x1

    .line 466
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_2

    .line 467
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I

    move-result v1

    :cond_0
    iput v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    .line 493
    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    :cond_1
    :goto_0
    return-void

    .line 471
    .restart local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    :cond_2
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v2}, Landroid/support/v7/app/ActionBarActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 474
    .local v0, "trans":Landroid/support/v4/app/FragmentTransaction;
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-ne v2, p1, :cond_4

    .line 475
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v1, :cond_3

    .line 476
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabReselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 477
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V

    .line 490
    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 491
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_0

    .line 480
    .restart local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    :cond_4
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I

    move-result v1

    :cond_5
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V

    .line 481
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v1, :cond_6

    .line 482
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabUnselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 484
    :cond_6
    check-cast p1, Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    .line 485
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    if-eqz v1, :cond_3

    .line 486
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;

    invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabSelected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    goto :goto_1
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 332
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V

    .line 333
    return-void
.end method

.method public setCustomView(I)V
    .locals 3
    .param p1, "resId"    # I

    .prologue
    .line 193
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setCustomView(Landroid/view/View;)V

    .line 195
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 181
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 182
    return-void
.end method

.method public setCustomView(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "layoutParams"    # Landroid/support/v7/app/ActionBar$LayoutParams;

    .prologue
    .line 186
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 189
    return-void
.end method

.method public setDisplayHomeAsUpEnabled(Z)V
    .locals 2
    .param p1, "showHomeAsUp"    # Z

    .prologue
    const/4 v1, 0x4

    .line 312
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V

    .line 313
    return-void

    .line 312
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayOptions(I)V
    .locals 1
    .param p1, "options"    # I

    .prologue
    .line 285
    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_0

    .line 286
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z

    .line 288
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 289
    return-void
.end method

.method public setDisplayOptions(II)V
    .locals 4
    .param p1, "options"    # I
    .param p2, "mask"    # I

    .prologue
    .line 293
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    .line 294
    .local v0, "current":I
    and-int/lit8 v1, p2, 0x4

    if-eqz v1, :cond_0

    .line 295
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z

    .line 297
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    and-int v2, p1, p2

    xor-int/lit8 v3, p2, -0x1

    and-int/2addr v3, v0

    or-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 298
    return-void
.end method

.method public setDisplayShowCustomEnabled(Z)V
    .locals 2
    .param p1, "showCustom"    # Z

    .prologue
    const/16 v1, 0x10

    .line 322
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V

    .line 323
    return-void

    .line 322
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayShowHomeEnabled(Z)V
    .locals 2
    .param p1, "showHome"    # Z

    .prologue
    const/4 v1, 0x2

    .line 307
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V

    .line 308
    return-void

    .line 307
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayShowTitleEnabled(Z)V
    .locals 2
    .param p1, "showTitle"    # Z

    .prologue
    const/16 v1, 0x8

    .line 317
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V

    .line 318
    return-void

    .line 317
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayUseLogoEnabled(Z)V
    .locals 2
    .param p1, "useLogo"    # Z

    .prologue
    const/4 v1, 0x1

    .line 302
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V

    .line 303
    return-void

    .line 302
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setHomeAsUpIndicator(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 534
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeAsUpIndicator(I)V

    .line 535
    return-void
.end method

.method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "indicator"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 529
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 530
    return-void
.end method

.method public setHomeButtonEnabled(Z)V
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 327
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V

    .line 328
    return-void
.end method

.method public setIcon(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 199
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(I)V

    .line 200
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 204
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 205
    return-void
.end method

.method public setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 1
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .prologue
    .line 219
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 220
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p2}, Landroid/support/v7/internal/widget/ActionBarView;->setCallback(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V

    .line 221
    return-void
.end method

.method public setLogo(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 209
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(I)V

    .line 210
    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "logo"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 214
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 215
    return-void
.end method

.method public setNavigationMode(I)V
    .locals 5
    .param p1, "mode"    # I

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x1

    .line 367
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    .line 368
    .local v0, "oldMode":I
    packed-switch v0, :pswitch_data_0

    .line 375
    :goto_0
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v2, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setNavigationMode(I)V

    .line 376
    packed-switch p1, :pswitch_data_1

    .line 386
    :cond_0
    :goto_1
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    const/4 v3, 0x2

    if-ne p1, v3, :cond_1

    iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z

    if-nez v3, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setCollapsable(Z)V

    .line 387
    return-void

    .line 370
    :pswitch_0
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getSelectedNavigationIndex()I

    move-result v2

    iput v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    .line 371
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 372
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    goto :goto_0

    .line 378
    :pswitch_1
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V

    .line 379
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 380
    iget v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    if-eq v2, v4, :cond_0

    .line 381
    iget v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->setSelectedNavigationItem(I)V

    .line 382
    iput v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I

    goto :goto_1

    .line 368
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch

    .line 376
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1
    .end packed-switch
.end method

.method public setSelectedNavigationItem(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 225
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 233
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "setSelectedNavigationIndex not valid for current navigation mode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :pswitch_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBar$Tab;

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    .line 236
    :goto_0
    return-void

    .line 230
    :pswitch_1
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDropdownSelectedPosition(I)V

    goto :goto_0

    .line 225
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setShowHideAnimationEnabled(Z)V
    .locals 1
    .param p1, "enabled"    # Z

    .prologue
    .line 996
    iput-boolean p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowHideAnimationEnabled:Z

    .line 997
    if-nez p1, :cond_0

    .line 998
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->clearAnimation()V

    .line 999
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_0

    .line 1000
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->clearAnimation()V

    .line 1003
    :cond_0
    return-void
.end method

.method public setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 342
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setSplitBackground(Landroid/graphics/drawable/Drawable;)V

    .line 343
    return-void
.end method

.method public setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 337
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setStackedBackground(Landroid/graphics/drawable/Drawable;)V

    .line 338
    return-void
.end method

.method public setSubtitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 280
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 281
    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "subtitle"    # Ljava/lang/CharSequence;

    .prologue
    .line 275
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 276
    return-void
.end method

.method public setTitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 270
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setTitle(Ljava/lang/CharSequence;)V

    .line 271
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 265
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitle(Ljava/lang/CharSequence;)V

    .line 266
    return-void
.end method

.method public show()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 544
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    if-eqz v0, :cond_0

    .line 545
    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z

    .line 546
    invoke-direct {p0, v1}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V

    .line 548
    :cond_0
    return-void
.end method

.method showForActionMode()V
    .locals 1

    .prologue
    .line 551
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z

    if-nez v0, :cond_0

    .line 552
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z

    .line 553
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V

    .line 555
    :cond_0
    return-void
.end method

.method public startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
    .locals 3
    .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    const/4 v2, 0x1

    .line 588
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;

    if-eqz v1, :cond_0

    .line 589
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->finish()V

    .line 592
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->killMode()V

    .line 593
    new-instance v0, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;

    invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;-><init>(Landroid/support/v7/app/ActionBarImplBase;Landroid/support/v7/view/ActionMode$Callback;)V

    .line 594
    .local v0, "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->dispatchOnCreate()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 595
    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->invalidate()V

    .line 596
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initForMode(Landroid/support/v7/view/ActionMode;)V

    .line 597
    invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->animateToMode(Z)V

    .line 598
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_1

    iget v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextDisplayMode:I

    if-ne v1, v2, :cond_1

    .line 599
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_1

    .line 600
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 603
    :cond_1
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    .line 604
    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;

    .line 607
    .end local v0    # "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
    :goto_0
    return-object v0

    .restart local v0    # "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
