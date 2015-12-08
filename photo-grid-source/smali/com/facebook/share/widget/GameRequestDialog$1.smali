.class Lcom/facebook/share/widget/GameRequestDialog$1;
.super Lcom/facebook/share/internal/ResultProcessor;
.source "SourceFile"


# instance fields
.field final synthetic this$0:Lcom/facebook/share/widget/GameRequestDialog;

.field final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/share/widget/GameRequestDialog;Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V
    .locals 0

    .prologue
    .line 129
    iput-object p1, p0, Lcom/facebook/share/widget/GameRequestDialog$1;->this$0:Lcom/facebook/share/widget/GameRequestDialog;

    iput-object p3, p0, Lcom/facebook/share/widget/GameRequestDialog$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-direct {p0, p2}, Lcom/facebook/share/internal/ResultProcessor;-><init>(Lcom/facebook/FacebookCallback;)V

    return-void
.end method


# virtual methods
.method public onSuccess(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 132
    if-eqz p2, :cond_0

    .line 133
    iget-object v0, p0, Lcom/facebook/share/widget/GameRequestDialog$1;->val$callback:Lcom/facebook/FacebookCallback;

    new-instance v1, Lcom/facebook/share/widget/GameRequestDialog$Result;

    const-string v2, "request"

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/facebook/share/widget/GameRequestDialog$Result;-><init>(Ljava/lang/String;Lcom/facebook/share/widget/GameRequestDialog$1;)V

    invoke-interface {v0, v1}, Lcom/facebook/FacebookCallback;->onSuccess(Ljava/lang/Object;)V

    .line 138
    :goto_0
    return-void

    .line 136
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/share/widget/GameRequestDialog$1;->onCancel(Lcom/facebook/internal/AppCall;)V

    goto :goto_0
.end method
