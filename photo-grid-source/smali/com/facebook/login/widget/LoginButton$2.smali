.class Lcom/facebook/login/widget/LoginButton$2;
.super Lcom/facebook/AccessTokenTracker;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Lcom/facebook/login/widget/LoginButton;


# direct methods
.method constructor <init>(Lcom/facebook/login/widget/LoginButton;)V
    .locals 0

    .prologue
    .line 601
    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton$2;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-direct {p0}, Lcom/facebook/AccessTokenTracker;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCurrentAccessTokenChanged(Lcom/facebook/AccessToken;Lcom/facebook/AccessToken;)V
    .locals 1

    .prologue
    .line 606
    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton$2;->this$0:Lcom/facebook/login/widget/LoginButton;

    # invokes: Lcom/facebook/login/widget/LoginButton;->setButtonText()V
    invoke-static {v0}, Lcom/facebook/login/widget/LoginButton;->access$400(Lcom/facebook/login/widget/LoginButton;)V

    .line 607
    return-void
.end method
