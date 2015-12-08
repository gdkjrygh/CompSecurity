.class Lcom/hmobile/biblekjv/BaseActivity$2;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->signInwithTwitter(Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;

.field private final synthetic val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public UploadFailed()V
    .locals 3

    .prologue
    .line 252
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-interface {v0}, Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;->Failed()V

    .line 253
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 254
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v0}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 255
    const-string v1, "error occured please try again."

    .line 256
    const/4 v2, 0x1

    .line 254
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 256
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 257
    return-void
.end method

.method public UploadSuccessFully()V
    .locals 4

    .prologue
    .line 239
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-interface {v1}, Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;->SuccessFully()V

    .line 240
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 241
    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v1}, Lcom/hmobile/biblekjv/BaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 242
    const-string v2, "Twitter share successfully."

    .line 243
    const/4 v3, 0x1

    .line 241
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 245
    .local v0, "t":Landroid/widget/Toast;
    const/16 v1, 0x51

    const/4 v2, 0x0

    .line 246
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$2;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget v3, v3, Lcom/hmobile/biblekjv/BaseActivity;->screenHeight:I

    div-int/lit8 v3, v3, 0x2

    .line 244
    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/Toast;->setGravity(III)V

    .line 247
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 248
    return-void
.end method
