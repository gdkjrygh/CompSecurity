.class Lcom/QRBS/activity/BookmarksListActivity$1;
.super Ljava/lang/Object;
.source "BookmarksListActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/BookmarksListActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/BookmarksListActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/BookmarksListActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/BookmarksListActivity$1;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "arg3"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 54
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v1, p0, Lcom/QRBS/activity/BookmarksListActivity$1;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    invoke-direct {v0, v1}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 55
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v1, p0, Lcom/QRBS/activity/BookmarksListActivity$1;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->url:Ljava/util/ArrayList;
    invoke-static {v1}, Lcom/QRBS/activity/BookmarksListActivity;->access$1(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/QRBS/activity/BookmarksListActivity$1;->this$0:Lcom/QRBS/activity/BookmarksListActivity;

    # getter for: Lcom/QRBS/activity/BookmarksListActivity;->url:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/QRBS/activity/BookmarksListActivity;->access$1(Lcom/QRBS/activity/BookmarksListActivity;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method
