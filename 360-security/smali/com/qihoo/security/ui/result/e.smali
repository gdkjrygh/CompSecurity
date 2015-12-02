.class public Lcom/qihoo/security/ui/result/e;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field private c:Lcom/qihoo/security/widget/CommonWebView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object v0, p0, Lcom/qihoo/security/ui/result/e;->a:Landroid/content/Context;

    .line 16
    iput-object v0, p0, Lcom/qihoo/security/ui/result/e;->b:Ljava/lang/String;

    .line 20
    iput-object p1, p0, Lcom/qihoo/security/ui/result/e;->a:Landroid/content/Context;

    .line 21
    iput-object p2, p0, Lcom/qihoo/security/ui/result/e;->b:Ljava/lang/String;

    .line 22
    new-instance v0, Lcom/qihoo/security/widget/CommonWebView;

    invoke-direct {v0, p1}, Lcom/qihoo/security/widget/CommonWebView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/result/e;->c:Lcom/qihoo/security/widget/CommonWebView;

    .line 23
    iget-object v0, p0, Lcom/qihoo/security/ui/result/e;->c:Lcom/qihoo/security/widget/CommonWebView;

    new-instance v1, Lcom/qihoo/security/ui/result/b;

    invoke-direct {v1, p3, p4}, Lcom/qihoo/security/ui/result/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CommonWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 24
    iget-object v0, p0, Lcom/qihoo/security/ui/result/e;->c:Lcom/qihoo/security/widget/CommonWebView;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/CommonWebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 25
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 26
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/qihoo/security/ui/result/e;->c:Lcom/qihoo/security/widget/CommonWebView;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/CommonWebView;->loadUrl(Ljava/lang/String;)V

    .line 33
    return-void
.end method
