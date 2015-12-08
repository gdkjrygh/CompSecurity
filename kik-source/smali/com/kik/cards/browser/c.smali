.class final Lcom/kik/cards/browser/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/webkit/WebView;

.field final synthetic b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;


# direct methods
.method constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment$b;Landroid/webkit/WebView;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/kik/cards/browser/c;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    iput-object p2, p0, Lcom/kik/cards/browser/c;->a:Landroid/webkit/WebView;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lcom/kik/cards/browser/c;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/browser/c;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/kik/cards/browser/c;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a(Lcom/kik/cards/browser/CaptchaWindowFragment$b;)V

    .line 182
    :goto_0
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 183
    return-void

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/browser/c;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->c(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    goto :goto_0
.end method
