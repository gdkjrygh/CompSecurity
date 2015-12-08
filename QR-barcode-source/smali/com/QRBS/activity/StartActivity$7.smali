.class Lcom/QRBS/activity/StartActivity$7;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Lcom/actionbarsherlock/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/StartActivity;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
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
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$7;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v3, 0x1

    .line 323
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$7;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v1}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/FragmentCronology;

    .line 324
    .local v0, "thisCron":Lcom/scannerfire/fragment/FragmentCronology;
    invoke-virtual {v0}, Lcom/scannerfire/fragment/FragmentCronology;->getAdapter()Lcom/scannerfire/model/CustomListAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 325
    const/4 v1, -0x1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 326
    return v3
.end method

.method public onMenuItemActionExpand(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 2
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v1, 0x1

    .line 316
    iget-object v0, p0, Lcom/QRBS/activity/StartActivity$7;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-static {v0, v1}, Lcom/QRBS/activity/StartActivity;->access$6(Lcom/QRBS/activity/StartActivity;Z)V

    .line 318
    return v1
.end method
