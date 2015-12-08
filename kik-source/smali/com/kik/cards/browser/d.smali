.class final Lcom/kik/cards/browser/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/webkit/WebView;

.field final synthetic b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;


# direct methods
.method constructor <init>(Lcom/kik/cards/browser/CaptchaWindowFragment$b;Landroid/webkit/WebView;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/kik/cards/browser/d;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    iput-object p2, p0, Lcom/kik/cards/browser/d;->a:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 201
    iget-object v0, p0, Lcom/kik/cards/browser/d;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    iget-object v0, p0, Lcom/kik/cards/browser/d;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->a(Lcom/kik/cards/browser/CaptchaWindowFragment$b;)V

    .line 207
    :goto_0
    return-void

    .line 205
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/browser/d;->b:Lcom/kik/cards/browser/CaptchaWindowFragment$b;

    iget-object v0, v0, Lcom/kik/cards/browser/CaptchaWindowFragment$b;->c:Lcom/kik/cards/browser/CaptchaWindowFragment;

    invoke-static {v0}, Lcom/kik/cards/browser/CaptchaWindowFragment;->c(Lcom/kik/cards/browser/CaptchaWindowFragment;)V

    goto :goto_0
.end method
