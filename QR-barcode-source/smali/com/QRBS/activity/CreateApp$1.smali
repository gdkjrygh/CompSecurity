.class Lcom/QRBS/activity/CreateApp$1;
.super Ljava/lang/Object;
.source "CreateApp.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateApp;->onCreate(Landroid/os/Bundle;)V
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
.field final synthetic this$0:Lcom/QRBS/activity/CreateApp;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateApp;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateApp$1;->this$0:Lcom/QRBS/activity/CreateApp;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
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
    .line 52
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/QRBS/activity/CreateApp$1;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/QRBS/activity/CreateApp;->access$2(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 53
    .local v1, "s":Ljava/lang/String;
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v2, p0, Lcom/QRBS/activity/CreateApp$1;->this$0:Lcom/QRBS/activity/CreateApp;

    invoke-direct {v0, v2}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 54
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v2, p0, Lcom/QRBS/activity/CreateApp$1;->this$0:Lcom/QRBS/activity/CreateApp;

    # getter for: Lcom/QRBS/activity/CreateApp;->packNames:Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/QRBS/activity/CreateApp;->access$2(Lcom/QRBS/activity/CreateApp;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    return-void
.end method
