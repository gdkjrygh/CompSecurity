.class Lcom/QRBS/activity/StartActivity$6;
.super Ljava/lang/Object;
.source "StartActivity.java"

# interfaces
.implements Lcom/actionbarsherlock/widget/SearchView$OnCloseListener;


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
    iput-object p1, p0, Lcom/QRBS/activity/StartActivity$6;->this$0:Lcom/QRBS/activity/StartActivity;

    .line 301
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClose()Z
    .locals 3

    .prologue
    .line 305
    iget-object v1, p0, Lcom/QRBS/activity/StartActivity$6;->this$0:Lcom/QRBS/activity/StartActivity;

    invoke-virtual {v1}, Lcom/QRBS/activity/StartActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/scannerfire/fragment/FragmentCronology;

    .line 306
    .local v0, "thisCron":Lcom/scannerfire/fragment/FragmentCronology;
    invoke-virtual {v0}, Lcom/scannerfire/fragment/FragmentCronology;->getAdapter()Lcom/scannerfire/model/CustomListAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scannerfire/model/CustomListAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 307
    const/4 v1, 0x0

    return v1
.end method
