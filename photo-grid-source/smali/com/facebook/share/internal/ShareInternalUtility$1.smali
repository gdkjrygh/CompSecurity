.class final Lcom/facebook/share/internal/ShareInternalUtility$1;
.super Lcom/facebook/share/internal/ResultProcessor;
.source "SourceFile"


# instance fields
.field final synthetic val$callback:Lcom/facebook/FacebookCallback;


# direct methods
.method constructor <init>(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V
    .locals 0

    .prologue
    .line 204
    iput-object p2, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    invoke-direct {p0, p1}, Lcom/facebook/share/internal/ResultProcessor;-><init>(Lcom/facebook/FacebookCallback;)V

    return-void
.end method


# virtual methods
.method public final onCancel(Lcom/facebook/internal/AppCall;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    # invokes: Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnCancelCallback(Lcom/facebook/FacebookCallback;)V
    invoke-static {v0}, Lcom/facebook/share/internal/ShareInternalUtility;->access$100(Lcom/facebook/FacebookCallback;)V

    .line 225
    return-void
.end method

.method public final onError(Lcom/facebook/internal/AppCall;Lcom/facebook/FacebookException;)V
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    # invokes: Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V
    invoke-static {v0, p2}, Lcom/facebook/share/internal/ShareInternalUtility;->access$200(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V

    .line 230
    return-void
.end method

.method public final onSuccess(Lcom/facebook/internal/AppCall;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 207
    if-eqz p2, :cond_1

    .line 208
    invoke-static {p2}, Lcom/facebook/share/internal/ShareInternalUtility;->getNativeDialogCompletionGesture(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 209
    if-eqz v0, :cond_0

    const-string v1, "post"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 210
    :cond_0
    invoke-static {p2}, Lcom/facebook/share/internal/ShareInternalUtility;->getShareDialogPostId(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    .line 211
    iget-object v1, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    # invokes: Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnSuccessCallback(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V
    invoke-static {v1, v0}, Lcom/facebook/share/internal/ShareInternalUtility;->access$000(Lcom/facebook/FacebookCallback;Ljava/lang/String;)V

    .line 220
    :cond_1
    :goto_0
    return-void

    .line 212
    :cond_2
    const-string v1, "cancel"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 213
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    # invokes: Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnCancelCallback(Lcom/facebook/FacebookCallback;)V
    invoke-static {v0}, Lcom/facebook/share/internal/ShareInternalUtility;->access$100(Lcom/facebook/FacebookCallback;)V

    goto :goto_0

    .line 215
    :cond_3
    iget-object v0, p0, Lcom/facebook/share/internal/ShareInternalUtility$1;->val$callback:Lcom/facebook/FacebookCallback;

    new-instance v1, Lcom/facebook/FacebookException;

    const-string v2, "UnknownError"

    invoke-direct {v1, v2}, Lcom/facebook/FacebookException;-><init>(Ljava/lang/String;)V

    # invokes: Lcom/facebook/share/internal/ShareInternalUtility;->invokeOnErrorCallback(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V
    invoke-static {v0, v1}, Lcom/facebook/share/internal/ShareInternalUtility;->access$200(Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookException;)V

    goto :goto_0
.end method
