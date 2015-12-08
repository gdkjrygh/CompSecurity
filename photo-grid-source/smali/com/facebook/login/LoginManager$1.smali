.class Lcom/facebook/login/LoginManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/internal/CallbackManagerImpl$Callback;


# instance fields
.field final synthetic this$0:Lcom/facebook/login/LoginManager;

.field final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/login/LoginManager;Lcom/facebook/FacebookCallback;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/facebook/login/LoginManager$1;->this$0:Lcom/facebook/login/LoginManager;

    iput-object p2, p0, Lcom/facebook/login/LoginManager$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityResult(ILandroid/content/Intent;)Z
    .locals 2

    .prologue
    .line 140
    iget-object v0, p0, Lcom/facebook/login/LoginManager$1;->this$0:Lcom/facebook/login/LoginManager;

    iget-object v1, p0, Lcom/facebook/login/LoginManager$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-virtual {v0, p1, p2, v1}, Lcom/facebook/login/LoginManager;->onActivityResult(ILandroid/content/Intent;Lcom/facebook/FacebookCallback;)Z

    move-result v0

    return v0
.end method
