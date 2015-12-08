.class Lcom/QRBS/activity/StartActivity$8;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Lcom/actionbarsherlock/widget/SearchView$OnQueryTextListener;


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
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$8;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 3
    .param p1, "newText"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 338
    const/4 v1, -0x1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 339
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$8;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v1}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/FragmentCronology;

    .line 341
    .local v0, "thisCron":Lcom/scannerfire/fragment/FragmentCronology;
    invoke-virtual {v0}, Lcom/scannerfire/fragment/FragmentCronology;->getAdapter()Lcom/scannerfire/model/CustomListAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 342
    return v2
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 3
    .param p1, "query"    # Ljava/lang/String;

    .prologue
    const/4 v2, 0x1

    .line 347
    const/4 v1, -0x1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->setLastElem(I)V

    .line 349
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$8;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v1}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/FragmentCronology;

    .line 350
    .local v0, "thisCron":Lcom/scannerfire/fragment/FragmentCronology;
    invoke-virtual {v0}, Lcom/scannerfire/fragment/FragmentCronology;->getAdapter()Lcom/scannerfire/model/CustomListAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 351
    return v2
.end method
