.class Lcom/hmobile/biblekjv/BaseActivity$1;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lme/grantland/twitter/Twitter$DialogListener;


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

.field private final synthetic val$share_text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->val$share_text:Ljava/lang/String;

    iput-object p3, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/BaseActivity$1;)Lcom/hmobile/biblekjv/BaseActivity;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    return-object v0
.end method


# virtual methods
.method public onCancel()V
    .locals 5

    .prologue
    .line 206
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 207
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 206
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 208
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    const-string v2, "Canceled"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 209
    const-string v3, "Twitter Login Canceled"

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 210
    const-string v3, "Ok"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 211
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 212
    .local v0, "alert":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 213
    return-void
.end method

.method public onComplete(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "accessKey"    # Ljava/lang/String;
    .param p2, "accessSecret"    # Ljava/lang/String;

    .prologue
    .line 159
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-static {v3}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 160
    .local v2, "settings":Landroid/content/SharedPreferences;
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 162
    .local v1, "editor":Landroid/content/SharedPreferences$Editor;
    const-string v3, "accessKey"

    invoke-interface {v1, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 163
    const-string v3, "accessSecret"

    invoke-interface {v1, v3, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 164
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 166
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    new-instance v4, Lme/grantland/twitter/Tweeter;

    iget-object v5, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_KEY:Ljava/lang/String;

    .line 167
    iget-object v6, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v6, v6, Lcom/hmobile/biblekjv/BaseActivity;->CONSUMER_SECRET:Ljava/lang/String;

    invoke-direct {v4, p1, p2, v5, v6}, Lme/grantland/twitter/Tweeter;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    iput-object v4, v3, Lcom/hmobile/biblekjv/BaseActivity;->tweet:Lme/grantland/twitter/Tweeter;

    .line 169
    :try_start_0
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v3, v3, Lcom/hmobile/biblekjv/BaseActivity;->tweet:Lme/grantland/twitter/Tweeter;

    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->val$share_text:Ljava/lang/String;

    const/4 v5, 0x0

    .line 170
    new-instance v6, Lcom/hmobile/biblekjv/BaseActivity$1$1;

    iget-object v7, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->val$delegate:Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;

    invoke-direct {v6, p0, v7}, Lcom/hmobile/biblekjv/BaseActivity$1$1;-><init>(Lcom/hmobile/biblekjv/BaseActivity$1;Lcom/hmobile/model/LikeShareInfo$LikeShareDelegate;)V

    .line 169
    invoke-virtual {v3, v4, v5, v6}, Lme/grantland/twitter/Tweeter;->upload(Ljava/lang/String;ZLme/grantland/twitter/Tweeter$TwitterUploadDelegate;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 202
    :goto_0
    return-void

    .line 198
    :catch_0
    move-exception v0

    .line 199
    .local v0, "e":Ljava/lang/Exception;
    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    invoke-virtual {v3}, Lcom/hmobile/biblekjv/BaseActivity;->hideProgress()V

    .line 200
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onError(Lme/grantland/twitter/TwitterError;)V
    .locals 5
    .param p1, "error"    # Lme/grantland/twitter/TwitterError;

    .prologue
    .line 217
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 218
    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$1;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    .line 217
    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 219
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    const-string v2, "Error"

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {p1}, Lme/grantland/twitter/TwitterError;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 220
    const-string v3, "Ok"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 221
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 222
    .local v0, "alert":Landroid/app/AlertDialog;
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 223
    return-void
.end method
