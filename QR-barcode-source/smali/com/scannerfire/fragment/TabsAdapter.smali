.class public Lcom/scannerfire/fragment/TabsAdapter;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "TabsAdapter.java"

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/scannerfire/fragment/TabsAdapter$DummyTabFactory;,
        Lcom/scannerfire/fragment/TabsAdapter$TabInfo;
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mTabHost:Landroid/widget/TabHost;

.field private final mTabs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/fragment/TabsAdapter$TabInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final mViewPager:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Landroid/widget/TabHost;Landroid/support/v4/view/ViewPager;)V
    .locals 1
    .param p1, "activity"    # Landroid/support/v4/app/FragmentActivity;
    .param p2, "tabHost"    # Landroid/widget/TabHost;
    .param p3, "pager"    # Landroid/support/v4/view/ViewPager;

    .prologue
    .line 53
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabs:Ljava/util/ArrayList;

    .line 54
    iput-object p1, p0, Lcom/scannerfire/fragment/TabsAdapter;->mContext:Landroid/content/Context;

    .line 55
    iput-object p2, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    .line 56
    iput-object p3, p0, Lcom/scannerfire/fragment/TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    .line 57
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v0, p0}, Landroid/widget/TabHost;->setOnTabChangedListener(Landroid/widget/TabHost$OnTabChangeListener;)V

    .line 58
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 59
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 60
    return-void
.end method


# virtual methods
.method public addTab(Landroid/widget/TabHost$TabSpec;Ljava/lang/Class;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4
    .param p1, "tabSpec"    # Landroid/widget/TabHost$TabSpec;
    .param p3, "args"    # Landroid/os/Bundle;
    .param p4, "StringTag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/TabHost$TabSpec;",
            "Ljava/lang/Class",
            "<*>;",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 63
    .local p2, "clss":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    new-instance v2, Lcom/scannerfire/fragment/TabsAdapter$DummyTabFactory;

    iget-object v3, p0, Lcom/scannerfire/fragment/TabsAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/scannerfire/fragment/TabsAdapter$DummyTabFactory;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v2}, Landroid/widget/TabHost$TabSpec;->setContent(Landroid/widget/TabHost$TabContentFactory;)Landroid/widget/TabHost$TabSpec;

    .line 64
    invoke-virtual {p1}, Landroid/widget/TabHost$TabSpec;->getTag()Ljava/lang/String;

    move-result-object v1

    .line 65
    .local v1, "tag":Ljava/lang/String;
    new-instance v0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;

    invoke-direct {v0, v1, p2, p3}, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;-><init>(Ljava/lang/String;Ljava/lang/Class;Landroid/os/Bundle;)V

    .line 66
    .local v0, "info":Lcom/scannerfire/fragment/TabsAdapter$TabInfo;
    iget-object v2, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v2, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v2, p1}, Landroid/widget/TabHost;->addTab(Landroid/widget/TabHost$TabSpec;)V

    .line 68
    invoke-virtual {p0}, Lcom/scannerfire/fragment/TabsAdapter;->notifyDataSetChanged()V

    .line 69
    return-void
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 4
    .param p1, "position"    # I

    .prologue
    .line 78
    iget-object v1, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabs:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;

    .line 79
    .local v0, "info":Lcom/scannerfire/fragment/TabsAdapter$TabInfo;
    iget-object v1, p0, Lcom/scannerfire/fragment/TabsAdapter;->mContext:Landroid/content/Context;

    # getter for: Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->clss:Ljava/lang/Class;
    invoke-static {v0}, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->access$0(Lcom/scannerfire/fragment/TabsAdapter$TabInfo;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    # getter for: Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->args:Landroid/os/Bundle;
    invoke-static {v0}, Lcom/scannerfire/fragment/TabsAdapter$TabInfo;->access$1(Lcom/scannerfire/fragment/TabsAdapter$TabInfo;)Landroid/os/Bundle;

    move-result-object v3

    invoke-static {v1, v2, v3}, Landroid/support/v4/app/Fragment;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    return-object v1
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0
    .param p1, "state"    # I

    .prologue
    .line 109
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0
    .param p1, "position"    # I
    .param p2, "positionOffset"    # F
    .param p3, "positionOffsetPixels"    # I

    .prologue
    .line 91
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3
    .param p1, "position"    # I

    .prologue
    .line 100
    iget-object v2, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v2}, Landroid/widget/TabHost;->getTabWidget()Landroid/widget/TabWidget;

    move-result-object v1

    .line 101
    .local v1, "widget":Landroid/widget/TabWidget;
    invoke-virtual {v1}, Landroid/widget/TabWidget;->getDescendantFocusability()I

    move-result v0

    .line 102
    .local v0, "oldFocusability":I
    const/high16 v2, 0x60000

    invoke-virtual {v1, v2}, Landroid/widget/TabWidget;->setDescendantFocusability(I)V

    .line 103
    iget-object v2, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v2, p1}, Landroid/widget/TabHost;->setCurrentTab(I)V

    .line 104
    invoke-virtual {v1, v0}, Landroid/widget/TabWidget;->setDescendantFocusability(I)V

    .line 105
    return-void
.end method

.method public onTabChanged(Ljava/lang/String;)V
    .locals 2
    .param p1, "tabId"    # Ljava/lang/String;

    .prologue
    .line 84
    iget-object v1, p0, Lcom/scannerfire/fragment/TabsAdapter;->mTabHost:Landroid/widget/TabHost;

    invoke-virtual {v1}, Landroid/widget/TabHost;->getCurrentTab()I

    move-result v0

    .line 85
    .local v0, "position":I
    iget-object v1, p0, Lcom/scannerfire/fragment/TabsAdapter;->mViewPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 86
    return-void
.end method
