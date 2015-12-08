.class Lcom/QRBS/activity/CalendarListSel$1;
.super Ljava/lang/Object;
.source "CalendarListSel.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CalendarListSel;->onCreate(Landroid/os/Bundle;)V
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
.field final synthetic this$0:Lcom/QRBS/activity/CalendarListSel;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CalendarListSel;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CalendarListSel$1;->this$0:Lcom/QRBS/activity/CalendarListSel;

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
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
    .line 51
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel$1;->this$0:Lcom/QRBS/activity/CalendarListSel;

    const-class v2, Lcom/QRBS/activity/CalendarList;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 52
    .local v0, "i":Landroid/content/Intent;
    const-string v2, "CalendarID"

    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel$1;->this$0:Lcom/QRBS/activity/CalendarListSel;

    iget-object v1, v1, Lcom/QRBS/activity/CalendarListSel;->list:Ljava/util/List;

    invoke-interface {v1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/scannerfire/utils/EncodeUtils$CalSel;

    invoke-virtual {v1}, Lcom/scannerfire/utils/EncodeUtils$CalSel;->getId()J

    move-result-wide v4

    invoke-virtual {v0, v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 53
    iget-object v1, p0, Lcom/QRBS/activity/CalendarListSel$1;->this$0:Lcom/QRBS/activity/CalendarListSel;

    invoke-virtual {v1, v0}, Lcom/QRBS/activity/CalendarListSel;->startActivity(Landroid/content/Intent;)V

    .line 54
    return-void
.end method
