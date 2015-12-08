.class Lcom/hmobile/biblekjv/BaseActivity$1$1;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity$1;->onComplete(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

.field private final synthetic val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity$1;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public UploadFailed()V
    .locals 3

    .prologue
    .line 189
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-interface {v0}, Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;->Failed()V

    .line 191
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/BaseActivity$1;->access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 193
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/BaseActivity$1;->access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 194
    const-string v1, "error occured please try again."

    .line 195
    const/4 v2, 0x1

    .line 192
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 195
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 196
    return-void
.end method

.method public UploadSuccessFully()V
    .locals 4

    .prologue
    .line 174
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    if-eqz v1, :cond_0

    .line 175
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-interface {v1}, Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;->SuccessFully()V

    .line 176
    :cond_0
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity$1;->access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 178
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v1}, Lcom/hmobile/biblekjv/BaseActivity$1;->access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 179
    const-string v2, "Twitter share successfully."

    .line 180
    const/4 v3, 0x1

    .line 177
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 181
    .local v0, "t":Landroid/widget/Toast;
    const/16 v1, 0x51

    .line 182
    const/4 v2, 0x0

    .line 183
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$1$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$1;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v3}, Lcom/hmobile/biblekjv/BaseActivity$1;->access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v3

    iget v3, v3, Lcom/hmobile/biblekjv/BaseActivity;->screenHeight:I

    div-int/lit8 v3, v3, 0x2

    .line 181
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 184
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 185
    return-void
.end method
