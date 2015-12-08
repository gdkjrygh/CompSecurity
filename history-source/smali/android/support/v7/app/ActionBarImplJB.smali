.class public Landroid/support/v7/app/ActionBarImplJB;
.super Landroid/support/v7/app/ActionBarImplICS;
.source "ActionBarImplJB.java"


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "callback"    # Landroid/support/v7/app/ActionBar$Callback;

    .prologue
    .line 24
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/app/ActionBarImplICS;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;Z)V

    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic addOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->addOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V

    return-void
.end method

.method public bridge synthetic addTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->addTab(Landroid/support/v7/app/ActionBar$Tab;)V

    return-void
.end method

.method public bridge synthetic addTab(Landroid/support/v7/app/ActionBar$Tab;I)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "x1"    # I

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplICS;->addTab(Landroid/support/v7/app/ActionBar$Tab;I)V

    return-void
.end method

.method public bridge synthetic addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "x1"    # I
    .param p3, "x2"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/app/ActionBarImplICS;->addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V

    return-void
.end method

.method public bridge synthetic addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;
    .param p2, "x1"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplICS;->addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V

    return-void
.end method

.method public bridge synthetic getCustomView()Landroid/view/View;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getCustomView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDisplayOptions()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getDisplayOptions()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getHeight()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getHeight()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getNavigationItemCount()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getNavigationItemCount()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getNavigationMode()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getNavigationMode()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getSelectedNavigationIndex()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getSelectedNavigationIndex()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getSelectedTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getSelectedTab()Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTabAt(I)Landroid/support/v7/app/ActionBar$Tab;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->getTabAt(I)Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTabCount()I
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getTabCount()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getThemedContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getThemedContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hide()V
    .locals 0

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->hide()V

    return-void
.end method

.method public bridge synthetic isShowing()Z
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->isShowing()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic newTab()Landroid/support/v7/app/ActionBar$Tab;
    .locals 1

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->newTab()Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic removeAllTabs()V
    .locals 0

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->removeAllTabs()V

    return-void
.end method

.method public bridge synthetic removeOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->removeOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V

    return-void
.end method

.method public bridge synthetic removeTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->removeTab(Landroid/support/v7/app/ActionBar$Tab;)V

    return-void
.end method

.method public bridge synthetic removeTabAt(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->removeTabAt(I)V

    return-void
.end method

.method public bridge synthetic selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
    .locals 0
    .param p1, "x0"    # Landroid/support/v7/app/ActionBar$Tab;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V

    return-void
.end method

.method public bridge synthetic setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setCustomView(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setCustomView(I)V

    return-void
.end method

.method public bridge synthetic setCustomView(Landroid/view/View;)V
    .locals 0
    .param p1, "x0"    # Landroid/view/View;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setCustomView(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setCustomView(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
    .locals 0
    .param p1, "x0"    # Landroid/view/View;
    .param p2, "x1"    # Landroid/support/v7/app/ActionBar$LayoutParams;

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplICS;->setCustomView(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V

    return-void
.end method

.method public bridge synthetic setDisplayHomeAsUpEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayHomeAsUpEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setDisplayOptions(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayOptions(I)V

    return-void
.end method

.method public bridge synthetic setDisplayOptions(II)V
    .locals 0
    .param p1, "x0"    # I
    .param p2, "x1"    # I

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayOptions(II)V

    return-void
.end method

.method public bridge synthetic setDisplayShowCustomEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayShowCustomEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setDisplayShowHomeEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayShowHomeEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setDisplayShowTitleEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayShowTitleEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setDisplayUseLogoEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setDisplayUseLogoEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setHomeAsUpIndicator(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setHomeAsUpIndicator(I)V

    return-void
.end method

.method public bridge synthetic setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setHomeButtonEnabled(Z)V
    .locals 0
    .param p1, "x0"    # Z

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setHomeButtonEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setIcon(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setIcon(I)V

    return-void
.end method

.method public bridge synthetic setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 0
    .param p1, "x0"    # Landroid/widget/SpinnerAdapter;
    .param p2, "x1"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .prologue
    .line 20
    invoke-super {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplICS;->setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/support/v7/app/ActionBar$OnNavigationListener;)V

    return-void
.end method

.method public bridge synthetic setLogo(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setLogo(I)V

    return-void
.end method

.method public bridge synthetic setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setNavigationMode(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setNavigationMode(I)V

    return-void
.end method

.method public bridge synthetic setSelectedNavigationItem(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setSelectedNavigationItem(I)V

    return-void
.end method

.method public bridge synthetic setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1, "x0"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic setSubtitle(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setSubtitle(I)V

    return-void
.end method

.method public bridge synthetic setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/CharSequence;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic setTitle(I)V
    .locals 0
    .param p1, "x0"    # I

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setTitle(I)V

    return-void
.end method

.method public bridge synthetic setTitle(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/CharSequence;

    .prologue
    .line 20
    invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarImplICS;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic show()V
    .locals 0

    .prologue
    .line 20
    invoke-super {p0}, Landroid/support/v7/app/ActionBarImplICS;->show()V

    return-void
.end method
