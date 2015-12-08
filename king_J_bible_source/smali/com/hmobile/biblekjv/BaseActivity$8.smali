.class Lcom/hmobile/biblekjv/BaseActivity$8;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->onBackPressed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;

.field private final synthetic val$dialog:Landroid/app/AlertDialog;

.field private final synthetic val$rlRate:Landroid/widget/RelativeLayout;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/widget/RelativeLayout;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->val$rlRate:Landroid/widget/RelativeLayout;

    iput-object p3, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->val$dialog:Landroid/app/AlertDialog;

    .line 678
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v3, 0x1

    .line 683
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 685
    .local v1, "settings":Landroid/content/SharedPreferences;
    const-string v2, "exit_alert"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 687
    .local v0, "exitFlag":I
    if-ne v0, v3, :cond_0

    .line 688
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->val$rlRate:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 693
    :goto_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->stopBilllingService()V

    .line 694
    return-void

    .line 690
    :cond_0
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->val$dialog:Landroid/app/AlertDialog;

    invoke-virtual {v2}, Landroid/app/AlertDialog;->dismiss()V

    .line 691
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$8;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    goto :goto_0
.end method
