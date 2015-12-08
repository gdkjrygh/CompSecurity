.class public Lcom/actionbarsherlock/internal/app/ActionBarImpl;
.super Lcom/actionbarsherlock/app/ActionBar;
.source "ActionBarImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;,
        Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
    }
.end annotation


# static fields
.field private static final CONTEXT_DISPLAY_NORMAL:I = 0x0

.field private static final CONTEXT_DISPLAY_SPLIT:I = 0x1

.field private static final INVALID_POSITION:I = -0x1


# instance fields
.field mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;

.field private mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

.field private mActivity:Landroid/app/Activity;

.field private mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

.field private mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

.field private mContext:Landroid/content/Context;

.field private mContextDisplayMode:I

.field private mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

.field private mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

.field private mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

.field mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;

.field mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;

.field final mHandler:Landroid/os/Handler;

.field private mHasEmbeddedTabs:Z

.field final mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

.field private mLastMenuVisibility:Z

.field private mMenuVisibilityListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;",
            ">;"
        }
    .end annotation
.end field

.field private mSavedTabPosition:I

.field private mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

.field private mShowHideAnimationEnabled:Z

.field final mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

.field private mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

.field private mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

.field mTabSelector:Ljava/lang/Runnable;

.field private mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mThemedContext:Landroid/content/Context;

.field mWasHiddenBeforeMode:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;I)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "features"    # I

    .prologue
    .line 135
    invoke-direct {p0}, Lcom/actionbarsherlock/app/ActionBar;-><init>()V

    .line 81
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    .line 84
    const/4 v2, -0x1

    iput v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    .line 102
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHandler:Landroid/os/Handler;

    .line 110
    new-instance v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;

    invoke-direct {v2, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    .line 127
    new-instance v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;

    invoke-direct {v2, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    .line 136
    iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;

    .line 137
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    .line 138
    .local v1, "window":Landroid/view/Window;
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 139
    .local v0, "decor":Landroid/view/View;
    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->init(Landroid/view/View;)V

    .line 142
    and-int/lit16 v2, p2, 0x200

    if-nez v2, :cond_0

    .line 143
    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    .line 145
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 1
    .param p1, "dialog"    # Landroid/app/Dialog;

    .prologue
    .line 147
    invoke-direct {p0}, Lcom/actionbarsherlock/app/ActionBar;-><init>()V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    .line 84
    const/4 v0, -0x1

    iput v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    .line 102
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHandler:Landroid/os/Handler;

    .line 110
    new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;

    invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$1;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    .line 127
    new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;

    invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$2;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V

    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    .line 149
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->init(Landroid/view/View;)V

    .line 150
    return-void
.end method

.method static synthetic access$0(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    return-object v0
.end method

.method static synthetic access$1(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method static synthetic access$2(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContainer;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    return-object v0
.end method

.method static synthetic access$3(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)I
    .locals 1

    .prologue
    .line 99
    iget v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I

    return v0
.end method

.method static synthetic access$4(Lcom/actionbarsherlock/internal/app/ActionBarImpl;Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    return-void
.end method

.method static synthetic access$5(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    return-object v0
.end method

.method static synthetic access$6(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ActionBarView;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    return-object v0
.end method

.method static synthetic access$7(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$8(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    return-object v0
.end method

.method private cleanupTabs()V
    .locals 1

    .prologue
    .line 338
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v0, :cond_0

    .line 339
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 341
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 342
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz v0, :cond_1

    .line 343
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeAllTabs()V

    .line 345
    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    .line 346
    return-void
.end method

.method private configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
    .locals 6
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "position"    # I

    .prologue
    .line 425
    move-object v3, p1

    check-cast v3, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    .line 426
    .local v3, "tabi":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
    invoke-virtual {v3}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;

    move-result-object v0

    .line 428
    .local v0, "callback":Lcom/actionbarsherlock/app/ActionBar$TabListener;
    if-nez v0, :cond_0

    .line 429
    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v5, "Action Bar Tab must have a Callback"

    invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 432
    :cond_0
    invoke-virtual {v3, p2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V

    .line 433
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 435
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 436
    .local v1, "count":I
    add-int/lit8 v2, p2, 0x1

    .local v2, "i":I
    :goto_0
    if-lt v2, v1, :cond_1

    .line 439
    return-void

    .line 437
    :cond_1
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v4, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V

    .line 436
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method private ensureTabsExist()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 215
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz v2, :cond_0

    .line 230
    :goto_0
    return-void

    .line 219
    :cond_0
    new-instance v0, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;-><init>(Landroid/content/Context;)V

    .line 221
    .local v0, "tabScroller":Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;
    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z

    if-eqz v2, :cond_1

    .line 222
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 223
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    .line 229
    :goto_1
    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    goto :goto_0

    .line 225
    :cond_1
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :goto_2
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 227
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v1, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    goto :goto_1

    .line 226
    :cond_2
    const/16 v1, 0x8

    goto :goto_2
.end method

.method private init(Landroid/view/View;)V
    .locals 5
    .param p1, "decor"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 153
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    .line 154
    sget v1, Lcom/actionbarsherlock/R$id;->abs__action_bar:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/widget/ActionBarView;

    iput-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    .line 156
    sget v1, Lcom/actionbarsherlock/R$id;->abs__action_context_bar:I

    .line 155
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    iput-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    .line 158
    sget v1, Lcom/actionbarsherlock/R$id;->abs__action_bar_container:I

    .line 157
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    iput-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    .line 160
    sget v1, Lcom/actionbarsherlock/R$id;->abs__split_action_bar:I

    .line 159
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    iput-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    .line 162
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    if-nez v1, :cond_1

    .line 163
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " can only be used "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 164
    const-string v3, "with a compatible window decor layout"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 163
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 167
    :cond_1
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    invoke-virtual {v1, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setContextView(Lcom/actionbarsherlock/internal/widget/ActionBarContextView;)V

    .line 168
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isSplitActionBar()Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    :goto_0
    iput v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I

    .line 173
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v4, 0xe

    if-ge v1, v4, :cond_3

    move v0, v2

    .line 176
    .local v0, "homeButtonEnabled":Z
    :goto_1
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v1

    and-int/lit8 v1, v1, 0x4

    if-eqz v1, :cond_4

    :goto_2
    or-int/2addr v0, v2

    .line 178
    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHomeButtonEnabled(Z)V

    .line 180
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    .line 181
    sget v2, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I

    .line 180
    invoke-static {v1, v2}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z

    move-result v1

    invoke-direct {p0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHasEmbeddedTabs(Z)V

    .line 182
    return-void

    .end local v0    # "homeButtonEnabled":Z
    :cond_2
    move v1, v3

    .line 169
    goto :goto_0

    :cond_3
    move v0, v3

    .line 173
    goto :goto_1

    .restart local v0    # "homeButtonEnabled":Z
    :cond_4
    move v2, v3

    .line 176
    goto :goto_2
.end method

.method private setHasEmbeddedTabs(Z)V
    .locals 5
    .param p1, "hasEmbeddedTabs"    # Z

    .prologue
    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 198
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z

    .line 200
    iget-boolean v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z

    if-nez v3, :cond_1

    .line 201
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    .line 202
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    .line 207
    :goto_0
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    move v0, v1

    .line 208
    .local v0, "isInTabMode":Z
    :goto_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz v3, :cond_0

    .line 209
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz v0, :cond_3

    move v3, v2

    :goto_2
    invoke-virtual {v4, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 211
    :cond_0
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    iget-boolean v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z

    if-nez v4, :cond_4

    if-eqz v0, :cond_4

    :goto_3
    invoke-virtual {v3, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCollapsable(Z)V

    .line 212
    return-void

    .line 204
    .end local v0    # "isInTabMode":Z
    :cond_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTabContainer(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    .line 205
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v3, v4}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setEmbeddedTabView(Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;)V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 207
    goto :goto_1

    .line 209
    .restart local v0    # "isInTabMode":Z
    :cond_3
    const/16 v3, 0x8

    goto :goto_2

    :cond_4
    move v1, v2

    .line 211
    goto :goto_3
.end method


# virtual methods
.method public addOnMenuVisibilityListener(Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 255
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    return-void
.end method

.method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
    .locals 1
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;

    .prologue
    .line 443
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V

    .line 444
    return-void
.end method

.method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V
    .locals 1
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "position"    # I

    .prologue
    .line 448
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V

    .line 449
    return-void
.end method

.method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V
    .locals 1
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "position"    # I
    .param p3, "setSelected"    # Z

    .prologue
    .line 463
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V

    .line 464
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, p1, p2, p3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;IZ)V

    .line 465
    invoke-direct {p0, p1, p2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V

    .line 466
    if-eqz p3, :cond_0

    .line 467
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 469
    :cond_0
    return-void
.end method

.method public addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V
    .locals 1
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;
    .param p2, "setSelected"    # Z

    .prologue
    .line 453
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V

    .line 454
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v0, p1, p2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->addTab(Lcom/actionbarsherlock/app/ActionBar$Tab;Z)V

    .line 455
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->configureTab(Lcom/actionbarsherlock/app/ActionBar$Tab;I)V

    .line 456
    if-eqz p2, :cond_0

    .line 457
    invoke-virtual {p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 459
    :cond_0
    return-void
.end method

.method animateToMode(Z)V
    .locals 4
    .param p1, "toActionMode"    # Z

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 627
    if-eqz p1, :cond_0

    .line 628
    invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->show(Z)V

    .line 630
    :cond_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    if-eqz v0, :cond_1

    .line 631
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentModeAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V

    .line 634
    :cond_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    if-eqz p1, :cond_3

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->animateToVisibility(I)V

    .line 635
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    if-eqz p1, :cond_4

    move v0, v2

    :goto_1
    invoke-virtual {v3, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->animateToVisibility(I)V

    .line 636
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->hasEmbeddedTabs()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->isCollapsed()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 637
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz p1, :cond_5

    :goto_2
    invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->animateToVisibility(I)V

    .line 639
    :cond_2
    return-void

    :cond_3
    move v0, v2

    .line 634
    goto :goto_0

    :cond_4
    move v0, v1

    .line 635
    goto :goto_1

    :cond_5
    move v1, v2

    .line 637
    goto :goto_2
.end method

.method completeDeferredDestroyActionMode()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 233
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;

    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;

    invoke-interface {v0, v1}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V

    .line 235
    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredDestroyActionMode:Lcom/actionbarsherlock/view/ActionMode;

    .line 236
    iput-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mDeferredModeDestroyCallback:Lcom/actionbarsherlock/view/ActionMode$Callback;

    .line 238
    :cond_0
    return-void
.end method

.method public dispatchMenuVisibilityChanged(Z)V
    .locals 3
    .param p1, "isVisible"    # Z

    .prologue
    .line 263
    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mLastMenuVisibility:Z

    if-ne p1, v2, :cond_1

    .line 272
    :cond_0
    return-void

    .line 266
    :cond_1
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mLastMenuVisibility:Z

    .line 268
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 269
    .local v0, "count":I
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    if-ge v1, v0, :cond_0

    .line 270
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;

    invoke-interface {v2, p1}, Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;->onMenuVisibilityChanged(Z)V

    .line 269
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getCustomNavigationView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayOptions()I
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 547
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I

    move-result v0

    return v0
.end method

.method public getNavigationItemCount()I
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 966
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 973
    :cond_0
    :goto_0
    return v1

    .line 968
    :pswitch_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    .line 970
    :pswitch_1
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDropdownAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    .line 971
    .local v0, "adapter":Landroid/widget/SpinnerAdapter;
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v1

    goto :goto_0

    .line 966
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
    .line 392
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    return v0
.end method

.method public getSelectedNavigationIndex()I
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 954
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 960
    :cond_0
    :goto_0
    return v0

    .line 956
    :pswitch_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getPosition()I

    move-result v0

    goto :goto_0

    .line 958
    :pswitch_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDropdownSelectedPosition()I

    move-result v0

    goto :goto_0

    .line 954
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getSelectedTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 542
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 388
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTabAt(I)Lcom/actionbarsherlock/app/ActionBar$Tab;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 1008
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/app/ActionBar$Tab;

    return-object v0
.end method

.method public getTabCount()I
    .locals 1

    .prologue
    .line 979
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getThemedContext()Landroid/content/Context;
    .locals 5

    .prologue
    .line 642
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;

    if-nez v3, :cond_0

    .line 643
    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 644
    .local v1, "outValue":Landroid/util/TypedValue;
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 645
    .local v0, "currentTheme":Landroid/content/res/Resources$Theme;
    sget v3, Lcom/actionbarsherlock/R$attr;->actionBarWidgetTheme:I

    .line 646
    const/4 v4, 0x1

    .line 645
    invoke-virtual {v0, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 647
    iget v2, v1, Landroid/util/TypedValue;->resourceId:I

    .line 649
    .local v2, "targetThemeRes":I
    if-eqz v2, :cond_1

    .line 650
    new-instance v3, Landroid/view/ContextThemeWrapper;

    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-direct {v3, v4, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;

    .line 655
    .end local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
    .end local v1    # "outValue":Landroid/util/TypedValue;
    .end local v2    # "targetThemeRes":I
    :cond_0
    :goto_0
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;

    return-object v3

    .line 652
    .restart local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
    .restart local v1    # "outValue":Landroid/util/TypedValue;
    .restart local v2    # "targetThemeRes":I
    :cond_1
    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    iput-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mThemedContext:Landroid/content/Context;

    goto :goto_0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 10

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 592
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    if-eqz v2, :cond_0

    .line 593
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V

    .line 595
    :cond_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    .line 620
    :goto_0
    return-void

    .line 599
    :cond_1
    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z

    if-eqz v2, :cond_4

    .line 600
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V

    .line 601
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 602
    new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;

    invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V

    .line 603
    .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "alpha"

    new-array v4, v6, [F

    aput v8, v4, v7

    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 604
    .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    if-eqz v2, :cond_2

    .line 605
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    const-string v3, "translationY"

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 606
    aput v8, v4, v7

    iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    aput v5, v4, v6

    .line 605
    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 607
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "translationY"

    new-array v4, v6, [F

    .line 608
    iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    aput v5, v4, v7

    .line 607
    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 610
    :cond_2
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    if-nez v2, :cond_3

    .line 611
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V

    .line 612
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "alpha"

    new-array v4, v6, [F

    aput v8, v4, v7

    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 614
    :cond_3
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V

    .line 615
    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    .line 616
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    .line 618
    .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
    .end local v1    # "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
    :cond_4
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHideListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V

    goto/16 :goto_0
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 623
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public newTab()Lcom/actionbarsherlock/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 473
    new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-direct {v0, p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;)V

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 185
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    .line 186
    sget v1, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I

    .line 185
    invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ResourcesCompat;->getResources_getBoolean(Landroid/content/Context;I)Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setHasEmbeddedTabs(Z)V

    .line 189
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    .line 190
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 191
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 195
    :cond_0
    return-void
.end method

.method public removeAllTabs()V
    .locals 0

    .prologue
    .line 334
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->cleanupTabs()V

    .line 335
    return-void
.end method

.method public removeOnMenuVisibilityListener(Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 1
    .param p1, "listener"    # Lcom/actionbarsherlock/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 259
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mMenuVisibilityListeners:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 260
    return-void
.end method

.method public removeTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
    .locals 1
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;

    .prologue
    .line 478
    invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->removeTabAt(I)V

    .line 479
    return-void
.end method

.method public removeTabAt(I)V
    .locals 7
    .param p1, "position"    # I

    .prologue
    .line 483
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-nez v4, :cond_1

    .line 504
    :cond_0
    :goto_0
    return-void

    .line 488
    :cond_1
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v4, :cond_3

    .line 489
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getPosition()I

    move-result v3

    .line 490
    .local v3, "selectedTabPosition":I
    :goto_1
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v4, p1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->removeTabAt(I)V

    .line 491
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    .line 492
    .local v2, "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
    if-eqz v2, :cond_2

    .line 493
    const/4 v4, -0x1

    invoke-virtual {v2, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V

    .line 496
    :cond_2
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 497
    .local v1, "newTabCount":I
    move v0, p1

    .local v0, "i":I
    :goto_2
    if-lt v0, v1, :cond_4

    .line 501
    if-ne v3, p1, :cond_0

    .line 502
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, 0x0

    :goto_3
    invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    goto :goto_0

    .line 489
    .end local v0    # "i":I
    .end local v1    # "newTabCount":I
    .end local v2    # "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
    .end local v3    # "selectedTabPosition":I
    :cond_3
    iget v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    goto :goto_1

    .line 498
    .restart local v0    # "i":I
    .restart local v1    # "newTabCount":I
    .restart local v2    # "removedTab":Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;
    .restart local v3    # "selectedTabPosition":I
    :cond_4
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v4, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->setPosition(I)V

    .line 497
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 502
    :cond_5
    iget-object v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    const/4 v5, 0x0

    add-int/lit8 v6, p1, -0x1

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    goto :goto_3
.end method

.method public selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V
    .locals 4
    .param p1, "tab"    # Lcom/actionbarsherlock/app/ActionBar$Tab;

    .prologue
    const/4 v2, -0x1

    .line 508
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getNavigationMode()I

    move-result v1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    .line 509
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I

    move-result v1

    :goto_0
    iput v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    .line 538
    .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
    :cond_0
    :goto_1
    return-void

    .restart local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
    :cond_1
    move v1, v2

    .line 509
    goto :goto_0

    .line 513
    :cond_2
    const/4 v0, 0x0

    .line 514
    .local v0, "trans":Landroid/support/v4/app/FragmentTransaction;
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;

    instance-of v1, v1, Landroid/support/v4/app/FragmentActivity;

    if-eqz v1, :cond_3

    .line 515
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActivity:Landroid/app/Activity;

    check-cast v1, Landroid/support/v4/app/FragmentActivity;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 516
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 519
    :cond_3
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-ne v1, p1, :cond_5

    .line 520
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v1, :cond_4

    .line 521
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabReselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 522
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->animateToTab(I)V

    .line 535
    .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
    :cond_4
    :goto_2
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 536
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_1

    .line 525
    .restart local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
    :cond_5
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/actionbarsherlock/app/ActionBar$Tab;->getPosition()I

    move-result v2

    :cond_6
    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V

    .line 526
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v1, :cond_7

    .line 527
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabUnselected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    .line 529
    :cond_7
    check-cast p1, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    .end local p1    # "tab":Lcom/actionbarsherlock/app/ActionBar$Tab;
    iput-object p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    .line 530
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    if-eqz v1, :cond_4

    .line 531
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;->getCallback()Lcom/actionbarsherlock/app/ActionBar$TabListener;

    move-result-object v1

    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSelectedTab:Lcom/actionbarsherlock/internal/app/ActionBarImpl$TabImpl;

    invoke-interface {v1, v2, v0}, Lcom/actionbarsherlock/app/ActionBar$TabListener;->onTabSelected(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V

    goto :goto_2
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 366
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V

    .line 367
    return-void
.end method

.method public setCustomView(I)V
    .locals 3
    .param p1, "resId"    # I

    .prologue
    .line 276
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setCustomView(Landroid/view/View;)V

    .line 277
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 937
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 938
    return-void
.end method

.method public setCustomView(Landroid/view/View;Lcom/actionbarsherlock/app/ActionBar$LayoutParams;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;
    .param p2, "layoutParams"    # Lcom/actionbarsherlock/app/ActionBar$LayoutParams;

    .prologue
    .line 942
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 943
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V

    .line 944
    return-void
.end method

.method public setDisplayHomeAsUpEnabled(Z)V
    .locals 2
    .param p1, "showHomeAsUp"    # Z

    .prologue
    const/4 v1, 0x4

    .line 291
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V

    .line 292
    return-void

    .line 291
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayOptions(I)V
    .locals 1
    .param p1, "options"    # I

    .prologue
    .line 357
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 358
    return-void
.end method

.method public setDisplayOptions(II)V
    .locals 4
    .param p1, "options"    # I
    .param p2, "mask"    # I

    .prologue
    .line 361
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getDisplayOptions()I

    move-result v0

    .line 362
    .local v0, "current":I
    iget-object v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    and-int v2, p1, p2

    xor-int/lit8 v3, p2, -0x1

    and-int/2addr v3, v0

    or-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 363
    return-void
.end method

.method public setDisplayShowCustomEnabled(Z)V
    .locals 2
    .param p1, "showCustom"    # Z

    .prologue
    const/16 v1, 0x10

    .line 301
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V

    .line 302
    return-void

    .line 301
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayShowHomeEnabled(Z)V
    .locals 2
    .param p1, "showHome"    # Z

    .prologue
    const/4 v1, 0x2

    .line 286
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V

    .line 287
    return-void

    .line 286
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayShowTitleEnabled(Z)V
    .locals 2
    .param p1, "showTitle"    # Z

    .prologue
    const/16 v1, 0x8

    .line 296
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V

    .line 297
    return-void

    .line 296
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDisplayUseLogoEnabled(Z)V
    .locals 2
    .param p1, "useLogo"    # Z

    .prologue
    const/4 v1, 0x1

    .line 281
    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setDisplayOptions(II)V

    .line 282
    return-void

    .line 281
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setHomeButtonEnabled(Z)V
    .locals 1
    .param p1, "enable"    # Z

    .prologue
    .line 306
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V

    .line 307
    return-void
.end method

.method public setIcon(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 1014
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setIcon(I)V

    .line 1015
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 1019
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1020
    return-void
.end method

.method public setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;)V
    .locals 1
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
    .param p2, "callback"    # Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;

    .prologue
    .line 948
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 949
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCallback(Lcom/actionbarsherlock/app/ActionBar$OnNavigationListener;)V

    .line 950
    return-void
.end method

.method public setLogo(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 1024
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setLogo(I)V

    .line 1025
    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "logo"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 1029
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 1030
    return-void
.end method

.method public setNavigationMode(I)V
    .locals 5
    .param p1, "mode"    # I

    .prologue
    const/4 v1, 0x0

    const/4 v4, -0x1

    .line 984
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    .line 985
    .local v0, "oldMode":I
    packed-switch v0, :pswitch_data_0

    .line 992
    :goto_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v2, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setNavigationMode(I)V

    .line 993
    packed-switch p1, :pswitch_data_1

    .line 1003
    :cond_0
    :goto_1
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    const/4 v3, 0x2

    if-ne p1, v3, :cond_1

    iget-boolean v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mHasEmbeddedTabs:Z

    if-nez v3, :cond_1

    const/4 v1, 0x1

    :cond_1
    invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setCollapsable(Z)V

    .line 1004
    return-void

    .line 987
    :pswitch_0
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->getSelectedNavigationIndex()I

    move-result v2

    iput v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    .line 988
    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 989
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    goto :goto_0

    .line 995
    :pswitch_1
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->ensureTabsExist()V

    .line 996
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabScrollView:Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v2, v1}, Lcom/actionbarsherlock/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 997
    iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    if-eq v2, v4, :cond_0

    .line 998
    iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    invoke-virtual {p0, v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setSelectedNavigationItem(I)V

    .line 999
    iput v4, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSavedTabPosition:I

    goto :goto_1

    .line 985
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch

    .line 993
    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_1
    .end packed-switch
.end method

.method public setSelectedNavigationItem(I)V
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 320
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->getNavigationMode()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 328
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 329
    const-string v1, "setSelectedNavigationItem not valid for current navigation mode"

    .line 328
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :pswitch_0
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/app/ActionBar$Tab;

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->selectTab(Lcom/actionbarsherlock/app/ActionBar$Tab;)V

    .line 331
    :goto_0
    return-void

    .line 325
    :pswitch_1
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setDropdownSelectedPosition(I)V

    goto :goto_0

    .line 320
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
    .line 248
    iput-boolean p1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z

    .line 249
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V

    .line 252
    :cond_0
    return-void
.end method

.method public setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 374
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    if-eqz v0, :cond_0

    .line 375
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setSplitBackground(Landroid/graphics/drawable/Drawable;)V

    .line 377
    :cond_0
    return-void
.end method

.method public setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 370
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setStackedBackground(Landroid/graphics/drawable/Drawable;)V

    .line 371
    return-void
.end method

.method public setSubtitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 316
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 317
    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "subtitle"    # Ljava/lang/CharSequence;

    .prologue
    .line 353
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 354
    return-void
.end method

.method public setTitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 311
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->setTitle(Ljava/lang/CharSequence;)V

    .line 312
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 349
    iget-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionView:Lcom/actionbarsherlock/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/widget/ActionBarView;->setTitle(Ljava/lang/CharSequence;)V

    .line 350
    return-void
.end method

.method public show()V
    .locals 1

    .prologue
    .line 552
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->show(Z)V

    .line 553
    return-void
.end method

.method show(Z)V
    .locals 10
    .param p1, "markHiddenBeforeMode"    # Z

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 556
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    if-eqz v2, :cond_0

    .line 557
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;->end()V

    .line 559
    :cond_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    .line 560
    if-eqz p1, :cond_1

    iput-boolean v6, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z

    .line 588
    :cond_1
    :goto_0
    return-void

    .line 563
    :cond_2
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 565
    iget-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowHideAnimationEnabled:Z

    if-eqz v2, :cond_5

    .line 566
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V

    .line 567
    new-instance v0, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;

    invoke-direct {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;-><init>()V

    .line 568
    .local v0, "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "alpha"

    new-array v4, v8, [F

    aput v9, v4, v6

    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->play(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    move-result-object v1

    .line 569
    .local v1, "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    if-eqz v2, :cond_3

    .line 570
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContentView:Lcom/actionbarsherlock/internal/nineoldandroids/widget/NineFrameLayout;

    const-string v3, "translationY"

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 571
    iget-object v5, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v5}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    aput v5, v4, v6

    aput v7, v4, v8

    .line 570
    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 572
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    iget-object v3, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->getHeight()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTranslationY(F)V

    .line 573
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "translationY"

    new-array v4, v8, [F

    aput v7, v4, v6

    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 575
    :cond_3
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_4

    iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I

    if-ne v2, v8, :cond_4

    .line 576
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V

    .line 577
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v6}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 578
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    const-string v3, "alpha"

    new-array v4, v8, [F

    aput v9, v4, v6

    invoke-static {v2, v3, v4}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/actionbarsherlock/internal/nineoldandroids/animation/ObjectAnimator;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;->with(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;

    .line 580
    :cond_4
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v2}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->addListener(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;)V

    .line 581
    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mCurrentShowAnim:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;

    .line 582
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;->start()V

    goto/16 :goto_0

    .line 584
    .end local v0    # "anim":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet;
    .end local v1    # "b":Lcom/actionbarsherlock/internal/nineoldandroids/animation/AnimatorSet$Builder;
    :cond_5
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v9}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setAlpha(F)V

    .line 585
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContainerView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v7}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setTranslationY(F)V

    .line 586
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mShowListener:Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator$AnimatorListener;->onAnimationEnd(Lcom/actionbarsherlock/internal/nineoldandroids/animation/Animator;)V

    goto/16 :goto_0
.end method

.method public startActionMode(Lcom/actionbarsherlock/view/ActionMode$Callback;)Lcom/actionbarsherlock/view/ActionMode;
    .locals 5
    .param p1, "callback"    # Lcom/actionbarsherlock/view/ActionMode$Callback;

    .prologue
    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 400
    const/4 v1, 0x0

    .line 401
    .local v1, "wasHidden":Z
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;

    if-eqz v2, :cond_0

    .line 402
    iget-boolean v1, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z

    .line 403
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->finish()V

    .line 406
    :cond_0
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    invoke-virtual {v2}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->killMode()V

    .line 407
    new-instance v0, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;

    invoke-direct {v0, p0, p1}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;-><init>(Lcom/actionbarsherlock/internal/app/ActionBarImpl;Lcom/actionbarsherlock/view/ActionMode$Callback;)V

    .line 408
    .local v0, "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->dispatchOnCreate()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 409
    invoke-virtual {p0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez v1, :cond_2

    move v2, v3

    :goto_0
    iput-boolean v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mWasHiddenBeforeMode:Z

    .line 410
    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;->invalidate()V

    .line 411
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    invoke-virtual {v2, v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->initForMode(Lcom/actionbarsherlock/view/ActionMode;)V

    .line 412
    invoke-virtual {p0, v4}, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->animateToMode(Z)V

    .line 413
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextDisplayMode:I

    if-ne v2, v4, :cond_1

    .line 415
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mSplitView:Lcom/actionbarsherlock/internal/widget/ActionBarContainer;

    invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 417
    :cond_1
    iget-object v2, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mContextView:Lcom/actionbarsherlock/internal/widget/ActionBarContextView;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V

    .line 418
    iput-object v0, p0, Lcom/actionbarsherlock/internal/app/ActionBarImpl;->mActionMode:Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;

    .line 421
    .end local v0    # "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
    :goto_1
    return-object v0

    .restart local v0    # "mode":Lcom/actionbarsherlock/internal/app/ActionBarImpl$ActionModeImpl;
    :cond_2
    move v2, v4

    .line 409
    goto :goto_0

    .line 421
    :cond_3
    const/4 v0, 0x0

    goto :goto_1
.end method
