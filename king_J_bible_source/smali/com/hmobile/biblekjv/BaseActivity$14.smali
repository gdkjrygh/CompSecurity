.class Lcom/hmobile/biblekjv/BaseActivity$14;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->addQuickActionMenu()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 944
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 947
    new-instance v0, Lcom/hmobile/quickaction/QuickAction;

    invoke-direct {v0, p1}, Lcom/hmobile/quickaction/QuickAction;-><init>(Landroid/view/View;)V

    .line 948
    .local v0, "qa":Lcom/hmobile/quickaction/QuickAction;
    sget-boolean v1, Lcom/hmobile/biblekjv/HolyBibleApplication;->isPurchased:Z

    if-nez v1, :cond_0

    .line 949
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiRemoveAds:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$2(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 951
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiEmailUpdates:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$3(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 952
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiSurvey:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$4(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 954
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiFeedback:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$5(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 955
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiMoreApps:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$6(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 956
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$14;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity;->aiRate:Lcom/hmobile/quickaction/ActionItem;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity;->access$7(Lcom/hmobile/biblekjv/BaseActivity;)Lcom/hmobile/quickaction/ActionItem;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/hmobile/quickaction/QuickAction;->addActionItem(Lcom/hmobile/quickaction/ActionItem;)V

    .line 957
    invoke-virtual {v0}, Lcom/hmobile/quickaction/QuickAction;->show()V

    .line 959
    return-void
.end method
