.class Lcom/hmobile/biblekjv/BaseActivity$9;
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

.field private final synthetic val$editor:Landroid/content/SharedPreferences$Editor;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Landroid/content/SharedPreferences$Editor;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->val$editor:Landroid/content/SharedPreferences$Editor;

    .line 697
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 701
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->val$editor:Landroid/content/SharedPreferences$Editor;

    const-string v2, "exit_alert"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 702
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->val$editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 704
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    .line 705
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 706
    .local v0, "intent":Landroid/content/Intent;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 707
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v2}, Lcom/hmobile/biblekjv/BaseActivity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 706
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 708
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1, v0}, Lcom/hmobile/biblekjv/BaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 709
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$9;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->finish()V

    .line 710
    return-void
.end method
