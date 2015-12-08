.class Lcom/QRBS/activity/StartActivity$2;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Landroid/widget/TabHost$OnTabChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/StartActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/StartActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$2;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabChanged(Ljava/lang/String;)V
    .locals 3
    .param p1, "tabId"    # Ljava/lang/String;

    .prologue
    .line 179
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$2;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->mTabHost:Landroid/widget/TabHost;
    invoke-static {v1}, Lcom/QRBS/activity/StartActivity;->access$1(Lcom/QRBS/activity/StartActivity;)Landroid/widget/TabHost;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/TabHost;->getCurrentTab()I

    move-result v0

    .line 180
    .local v0, "position":I
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$2;->this$0:Lcom/QRBS/activity/StartActivity;

    # getter for: Lcom/QRBS/activity/StartActivity;->mViewPager:Landroid/support/v4/view/ViewPager;
    invoke-static {v1}, Lcom/QRBS/activity/StartActivity;->access$2(Lcom/QRBS/activity/StartActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 181
    const-string v1, "History"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 183
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$2;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v1}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/fragment/FragmentCronology;

    invoke-virtual {v1}, Lcom/scannerfire/fragment/FragmentCronology;->clearCronology()V

    .line 184
    const/4 v1, -0x1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 187
    :cond_0
    return-void
.end method
