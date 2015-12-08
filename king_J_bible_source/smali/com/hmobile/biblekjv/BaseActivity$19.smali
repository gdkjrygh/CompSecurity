.class Lcom/hmobile/biblekjv/BaseActivity$19;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->menuDialogDisplay()V
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
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$19;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 1052
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1055
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1057
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$19;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    const v2, 0x7f070090

    invoke-virtual {v1, v2}, Lcom/hmobile/biblekjv/BaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 1056
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1058
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$19;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 1059
    return-void
.end method
