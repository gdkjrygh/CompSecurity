.class Landroid/support/v7/app/ActionBarImplICS;
.super Landroid/support/v7/app/ActionBar;
.source "ActionBarImplICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarImplICS$TabWrapper;,
        Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;,
        Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;
    }
.end annotation


# instance fields
.field final mActionBar:Landroid/app/ActionBar;

.field mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

.field final mActivity:Landroid/app/Activity;

.field private mAddedMenuVisWrappers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;",
            ">;>;"
        }
    .end annotation
.end field

.field final mCallback:Landroid/support/v7/app/ActionBar$Callback;

.field private mHomeActionView:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$Callback;

    .prologue
    .line 46
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/app/ActionBarImplICS;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;Z)V

    .line 47
    return-void
.end method

.method constructor <init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;Z)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$Callback;
    .param p3, "checkHomeAsUpOption"    # Z

    .prologue
    .line 49
    invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    .line 50
    iput-object p1, p0, Landroid/support/v7/app/ActionBarImplICS;->mActivity:Landroid/app/Activity;

    .line 51
    iput-object p2, p0, Landroid/support/v7/app/ActionBarImplICS;->mCallback:Landroid/support/v7/app/ActionBar$Callback;

    .line 52
    invoke-virtual {p1}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    .line 54
    if-eqz p3, :cond_0

    .line 57
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplICS;->getDisplayOptions()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 58
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplICS;->setHomeButtonEnabled(Z)V

    .line 61
    :cond_0
    return-void
.end method

.method private findAndRemoveMenuVisWrapper(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    .locals 4
    .param p1, "compatListener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 65
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 66
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;

    .line 67
    .local v2, "wrapper":Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    if-nez v2, :cond_1

    .line 68
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    add-int/lit8 v1, v0, -0x1

    .end local v0    # "i":I
    .local v1, "i":I
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move v0, v1

    .line 65
    .end local v1    # "i":I
    .restart local v0    # "i":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 69
    :cond_1
    iget-object v3, v2, Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;->mWrappedListener:Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    if-ne v3, p1, :cond_0

    .line 70
    iget-object v3, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 74
    .end local v2    # "wrapper":Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    :goto_1
    return-object v2

    :cond_2
    const/4 v2, 0x0

    goto :goto_1
.end method


# virtual methods
.method public addOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 3
    .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 350
    if-eqz p1, :cond_0

    .line 351
    new-instance v0, Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;

    invoke-direct {v0, p1}, Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;-><init>(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V

    .line 352
    .local v0, "w":Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS;->mAddedMenuVisWrappers:Ljava/util/ArrayList;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->addOnMenuVisibilityListener(Landroid/app/ActionBar$OnMenuVisibilityListener;)V

    .line 355
    .end local v0    # "w":Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    :cond_0
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 247
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;)V

    .line 248
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;I)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "position"    # I

    .prologue
    .line 257
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1, p2}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;I)V

    .line 258
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "position"    # I
    .param p3, "setSelected"    # Z

    .prologue
    .line 262
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1, p2, p3}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;IZ)V

    .line 263
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "setSelected"    # Z

    .prologue
    .line 252
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1, p2}, Landroid/app/ActionBar;->addTab(Landroid/app/ActionBar$Tab;Z)V

    .line 253
    return-void
.end method

.method commitActiveTransaction()V
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 378
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 380
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 381
    return-void
.end method

.method getActiveTransaction()Landroid/support/v4/app/FragmentTransaction;
    .locals 1

    .prologue
    .line 369
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    if-nez v0, :cond_0

    .line 370
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mCallback:Landroid/support/v7/app/ActionBar$Callback;

    invoke-interface {v0}, Landroid/support/v7/app/ActionBar$Callback;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    .line 373
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActiveTransaction:Landroid/support/v4/app/FragmentTransaction;

    return-object v0
.end method

.method public getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getCustomView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayOptions()I
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getDisplayOptions()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getHeight()I

    move-result v0

    return v0
.end method

.method getHomeActionView()Landroid/widget/ImageView;
    .locals 9

    .prologue
    const/4 v6, 0x0

    const v8, 0x102002c

    .line 384
    iget-object v7, p0, Landroid/support/v7/app/ActionBarImplICS;->mHomeActionView:Landroid/widget/ImageView;

    if-nez v7, :cond_2

    .line 385
    iget-object v7, p0, Landroid/support/v7/app/ActionBarImplICS;->mActivity:Landroid/app/Activity;

    invoke-virtual {v7, v8}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 386
    .local v2, "home":Landroid/view/View;
    if-nez v2, :cond_1

    .line 407
    .end local v2    # "home":Landroid/view/View;
    :cond_0
    :goto_0
    return-object v6

    .line 391
    .restart local v2    # "home":Landroid/view/View;
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 392
    .local v3, "parent":Landroid/view/ViewGroup;
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 393
    .local v0, "childCount":I
    const/4 v7, 0x2

    if-ne v0, v7, :cond_0

    .line 398
    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 399
    .local v1, "first":Landroid/view/View;
    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 400
    .local v4, "second":Landroid/view/View;
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v6

    if-ne v6, v8, :cond_3

    move-object v5, v4

    .line 402
    .local v5, "up":Landroid/view/View;
    :goto_1
    instance-of v6, v5, Landroid/widget/ImageView;

    if-eqz v6, :cond_2

    .line 404
    check-cast v5, Landroid/widget/ImageView;

    .end local v5    # "up":Landroid/view/View;
    iput-object v5, p0, Landroid/support/v7/app/ActionBarImplICS;->mHomeActionView:Landroid/widget/ImageView;

    .line 407
    .end local v0    # "childCount":I
    .end local v1    # "first":Landroid/view/View;
    .end local v2    # "home":Landroid/view/View;
    .end local v3    # "parent":Landroid/view/ViewGroup;
    .end local v4    # "second":Landroid/view/View;
    :cond_2
    iget-object v6, p0, Landroid/support/v7/app/ActionBarImplICS;->mHomeActionView:Landroid/widget/ImageView;

    goto :goto_0

    .restart local v0    # "childCount":I
    .restart local v1    # "first":Landroid/view/View;
    .restart local v2    # "home":Landroid/view/View;
    .restart local v3    # "parent":Landroid/view/ViewGroup;
    .restart local v4    # "second":Landroid/view/View;
    :cond_3
    move-object v5, v1

    .line 400
    goto :goto_1
.end method

.method public getNavigationItemCount()I
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getNavigationItemCount()I

    move-result v0

    return v0
.end method

.method public getNavigationMode()I
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getNavigationMode()I

    move-result v0

    return v0
.end method

.method public getSelectedNavigationIndex()I
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getSelectedNavigationIndex()I

    move-result v0

    return v0
.end method

.method public getSelectedTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 287
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getSelectedTab()Landroid/app/ActionBar$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBar$Tab;

    return-object v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getTabAt(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "index"    # I

    .prologue
    .line 292
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->getTabAt(I)Landroid/app/ActionBar$Tab;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ActionBar$Tab;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBar$Tab;

    return-object v0
.end method

.method public getTabCount()I
    .locals 1

    .prologue
    .line 297
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getTabCount()I

    move-result v0

    return v0
.end method

.method getThemeDefaultUpIndicator()Landroid/graphics/drawable/Drawable;
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 411
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplICS;->mActivity:Landroid/app/Activity;

    const/4 v3, 0x1

    new-array v3, v3, [I

    const v4, 0x101030b

    aput v4, v3, v5

    invoke-virtual {v2, v3}, Landroid/app/Activity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 413
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 414
    .local v1, "result":Landroid/graphics/drawable/Drawable;
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 415
    return-object v1
.end method

.method public getThemedContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 302
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public hide()V
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->hide()V

    .line 341
    return-void
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->isShowing()Z

    move-result v0

    return v0
.end method

.method public newTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 3

    .prologue
    .line 239
    iget-object v2, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v2}, Landroid/app/ActionBar;->newTab()Landroid/app/ActionBar$Tab;

    move-result-object v0

    .line 240
    .local v0, "realTab":Landroid/app/ActionBar$Tab;
    new-instance v1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    invoke-direct {v1, p0, v0}, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;-><init>(Landroid/support/v7/app/ActionBarImplICS;Landroid/app/ActionBar$Tab;)V

    .line 241
    .local v1, "result":Landroid/support/v7/app/ActionBarImplICS$TabWrapper;
    invoke-virtual {v0, v1}, Landroid/app/ActionBar$Tab;->setTag(Ljava/lang/Object;)Landroid/app/ActionBar$Tab;

    .line 242
    return-object v1
.end method

.method public removeAllTabs()V
    .locals 1

    .prologue
    .line 277
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->removeAllTabs()V

    .line 278
    return-void
.end method

.method public removeOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 2
    .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 359
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->findAndRemoveMenuVisWrapper(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;

    move-result-object v0

    .line 360
    .local v0, "l":Landroid/support/v7/app/ActionBarImplICS$OnMenuVisibilityListenerWrapper;
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v1, v0}, Landroid/app/ActionBar;->removeOnMenuVisibilityListener(Landroid/app/ActionBar$OnMenuVisibilityListener;)V

    .line 361
    return-void
.end method

.method public removeTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 267
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->removeTab(Landroid/app/ActionBar$Tab;)V

    .line 268
    return-void
.end method

.method public removeTabAt(I)V
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 272
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->removeTabAt(I)V

    .line 273
    return-void
.end method

.method public selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 2
    .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 282
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    check-cast p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;

    .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
    iget-object v1, p1, Landroid/support/v7/app/ActionBarImplICS$TabWrapper;->mWrappedTab:Landroid/app/ActionBar$Tab;

    invoke-virtual {v0, v1}, Landroid/app/ActionBar;->selectTab(Landroid/app/ActionBar$Tab;)V

    .line 283
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 194
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 195
    return-void
.end method

.method public setCustomView(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 93
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setCustomView(I)V

    .line 94
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 79
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;)V

    .line 80
    return-void
.end method

.method public setCustomView(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
    .locals 2
    .param p1, "view"    # Landroid/view/View;
    .param p2, "layoutParams"    # Landroid/support/v7/app/ActionBar$LayoutParams;

    .prologue
    .line 84
    new-instance v0, Landroid/app/ActionBar$LayoutParams;

    invoke-direct {v0, p2}, Landroid/app/ActionBar$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .local v0, "lp":Landroid/app/ActionBar$LayoutParams;
    iget v1, p2, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    iput v1, v0, Landroid/app/ActionBar$LayoutParams;->gravity:I

    .line 88
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v1, p1, v0}, Landroid/app/ActionBar;->setCustomView(Landroid/view/View;Landroid/app/ActionBar$LayoutParams;)V

    .line 89
    return-void
.end method

.method public setDisplayHomeAsUpEnabled(Z)V
    .locals 1
    .param p1, "showHomeAsUp"    # Z

    .prologue
    .line 179
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 180
    return-void
.end method

.method public setDisplayOptions(I)V
    .locals 1
    .param p1, "options"    # I

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayOptions(I)V

    .line 160
    return-void
.end method

.method public setDisplayOptions(II)V
    .locals 1
    .param p1, "options"    # I
    .param p2, "mask"    # I

    .prologue
    .line 164
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1, p2}, Landroid/app/ActionBar;->setDisplayOptions(II)V

    .line 165
    return-void
.end method

.method public setDisplayShowCustomEnabled(Z)V
    .locals 1
    .param p1, "showCustom"    # Z

    .prologue
    .line 189
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayShowCustomEnabled(Z)V

    .line 190
    return-void
.end method

.method public setDisplayShowHomeEnabled(Z)V
    .locals 1
    .param p1, "showHome"    # Z

    .prologue
    .line 174
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayShowHomeEnabled(Z)V

    .line 175
    return-void
.end method

.method public setDisplayShowTitleEnabled(Z)V
    .locals 1
    .param p1, "showTitle"    # Z

    .prologue
    .line 184
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayShowTitleEnabled(Z)V

    .line 185
    return-void
.end method

.method public setDisplayUseLogoEnabled(Z)V
    .locals 1
    .param p1, "useLogo"    # Z

    .prologue
    .line 169
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setDisplayUseLogoEnabled(Z)V

    .line 170
    return-void
.end method

.method public setHomeAsUpIndicator(I)V
    .locals 2
    .param p1, "resId"    # I

    .prologue
    .line 318
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplICS;->getHomeActionView()Landroid/widget/ImageView;

    move-result-object v0

    .line 319
    .local v0, "homeActionView":Landroid/widget/ImageView;
    if-eqz v0, :cond_0

    .line 320
    if-eqz p1, :cond_1

    .line 321
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 326
    :cond_0
    :goto_0
    return-void

    .line 323
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplICS;->getThemeDefaultUpIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "indicator"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 307
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplICS;->getHomeActionView()Landroid/widget/ImageView;

    move-result-object v0

    .line 308
    .local v0, "homeActionView":Landroid/widget/ImageView;
    if-eqz v0, :cond_1

    .line 309
    if-nez p1, :cond_0

    .line 310
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplICS;->getThemeDefaultUpIndicator()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 312
    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 314
    :cond_1
    return-void
.end method

.method public setHomeButtonEnabled(Z)V
    .locals 1
    .param p1, "enabled"    # Z

    .prologue
    .line 365
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 366
    return-void
.end method

.method public setIcon(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 98
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setIcon(I)V

    .line 99
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "icon"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 103
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 104
    return-void
.end method

.method public setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 2
    .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .prologue
    .line 118
    iget-object v1, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    if-eqz p2, :cond_0

    new-instance v0, Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;

    invoke-direct {v0, p2}, Landroid/support/v7/app/ActionBarImplICS$OnNavigationListenerWrapper;-><init>(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V

    :goto_0
    invoke-virtual {v1, p1, v0}, Landroid/app/ActionBar;->setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/app/ActionBar$OnNavigationListener;)V

    .line 120
    return-void

    .line 118
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setLogo(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 108
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setLogo(I)V

    .line 109
    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "logo"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 113
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 114
    return-void
.end method

.method public setNavigationMode(I)V
    .locals 1
    .param p1, "mode"    # I

    .prologue
    .line 229
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setNavigationMode(I)V

    .line 230
    return-void
.end method

.method public setSelectedNavigationItem(I)V
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 124
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setSelectedNavigationItem(I)V

    .line 125
    return-void
.end method

.method public setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 204
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 205
    return-void
.end method

.method public setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 199
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 200
    return-void
.end method

.method public setSubtitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 154
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setSubtitle(I)V

    .line 155
    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "subtitle"    # Ljava/lang/CharSequence;

    .prologue
    .line 149
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 150
    return-void
.end method

.method public setTitle(I)V
    .locals 1
    .param p1, "resId"    # I

    .prologue
    .line 144
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setTitle(I)V

    .line 145
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 139
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0, p1}, Landroid/app/ActionBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 140
    return-void
.end method

.method public show()V
    .locals 1

    .prologue
    .line 335
    iget-object v0, p0, Landroid/support/v7/app/ActionBarImplICS;->mActionBar:Landroid/app/ActionBar;

    invoke-virtual {v0}, Landroid/app/ActionBar;->show()V

    .line 336
    return-void
.end method
