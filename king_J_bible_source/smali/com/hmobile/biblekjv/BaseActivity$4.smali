.class Lcom/hmobile/biblekjv/BaseActivity$4;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity;->loadData(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/BaseActivity;

.field private final synthetic val$desc:Ljava/lang/String;

.field private final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$desc:Ljava/lang/String;

    .line 334
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/biblekjv/BaseActivity$4;)Lcom/hmobile/biblekjv/BaseActivity;
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    return-object v0
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 6
    .param p1, "session"    # Lcom/facebook/Session;
    .param p2, "state"    # Lcom/facebook/SessionState;
    .param p3, "exception"    # Ljava/lang/Exception;

    .prologue
    const/4 v5, 0x1

    .line 339
    invoke-virtual {p1}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$title:Ljava/lang/String;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$desc:Ljava/lang/String;

    # invokes: Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lcom/hmobile/biblekjv/BaseActivity;->access$0(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/facebook/Session;->saveSession(Lcom/facebook/Session;Landroid/os/Bundle;)V

    .line 362
    :goto_0
    return-void

    .line 343
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->this$0:Lcom/hmobile/biblekjv/BaseActivity;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 344
    const-string v3, "email"

    aput-object v3, v1, v2

    const-string v2, "user_birthday"

    aput-object v2, v1, v5

    const/4 v2, 0x2

    .line 345
    const-string v3, "user_hometown"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "user_location"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    .line 346
    const-string v3, "publish_actions"

    aput-object v3, v1, v2

    .line 344
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 347
    new-instance v2, Lcom/hmobile/biblekjv/BaseActivity$4$1;

    iget-object v3, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$title:Ljava/lang/String;

    iget-object v4, p0, Lcom/hmobile/biblekjv/BaseActivity$4;->val$desc:Ljava/lang/String;

    invoke-direct {v2, p0, v3, v4}, Lcom/hmobile/biblekjv/BaseActivity$4$1;-><init>(Lcom/hmobile/biblekjv/BaseActivity$4;Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    # invokes: Lcom/hmobile/biblekjv/BaseActivity;->openActiveSession(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;
    invoke-static {v0, v5, v1, v2}, Lcom/hmobile/biblekjv/BaseActivity;->access$1(Landroid/app/Activity;ZLjava/util/List;Lcom/facebook/Session$StatusCallback;)Lcom/facebook/Session;

    goto :goto_0
.end method
