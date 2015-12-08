.class Lcom/hmobile/biblekjv/BaseActivity$4$1;
.super Ljava/lang/Object;
.source "BaseActivity.java"

# interfaces
.implements Lcom/facebook/Session$StatusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/BaseActivity$4;->call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/hmobile/biblekjv/BaseActivity$4;

.field private final synthetic val$desc:Ljava/lang/String;

.field private final synthetic val$title:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/BaseActivity$4;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$4;

    iput-object p2, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->val$title:Ljava/lang/String;

    iput-object p3, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->val$desc:Ljava/lang/String;

    .line 347
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call(Lcom/facebook/Session;Lcom/facebook/SessionState;Ljava/lang/Exception;)V
    .locals 3
    .param p1, "session"    # Lcom/facebook/Session;
    .param p2, "state"    # Lcom/facebook/SessionState;
    .param p3, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 353
    invoke-virtual {p1}, Lcom/facebook/Session;->isOpened()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    iget-object v0, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->this$1:Lcom/hmobile/biblekjv/BaseActivity$4;

    # getter for: Lcom/hmobile/biblekjv/BaseActivity$4;->this$0:Lcom/hmobile/biblekjv/BaseActivity;
    invoke-static {v0}, Lcom/hmobile/biblekjv/BaseActivity$4;->access$0(Lcom/hmobile/biblekjv/BaseActivity$4;)Lcom/hmobile/biblekjv/BaseActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->val$title:Ljava/lang/String;

    iget-object v2, p0, Lcom/hmobile/biblekjv/BaseActivity$4$1;->val$desc:Ljava/lang/String;

    # invokes: Lcom/hmobile/biblekjv/BaseActivity;->publishFeedDialog(Ljava/lang/String;Ljava/lang/String;)V
    invoke-static {v0, v1, v2}, Lcom/hmobile/biblekjv/BaseActivity;->access$0(Lcom/hmobile/biblekjv/BaseActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 356
    const/4 v0, 0x0

    .line 355
    invoke-static {p1, v0}, Lcom/facebook/Session;->saveSession(Lcom/facebook/Session;Landroid/os/Bundle;)V

    .line 359
    :cond_0
    return-void
.end method
