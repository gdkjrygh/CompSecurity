.class Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 74
    .line 75
    sget-object v2, Lcom/roidapp/cloudlib/twitter/a;->i:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 87
    :goto_0
    return v0

    .line 78
    :cond_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 79
    const-string v3, "denied"

    invoke-virtual {v2, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 81
    iget-object v3, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    new-instance v4, Lcom/roidapp/cloudlib/twitter/f;

    iget-object v5, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-direct {v4, v5, v0}, Lcom/roidapp/cloudlib/twitter/f;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;B)V

    invoke-static {v3, v4}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;Lcom/roidapp/cloudlib/twitter/f;)Lcom/roidapp/cloudlib/twitter/f;

    .line 82
    iget-object v3, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-static {v3}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->a(Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;)Lcom/roidapp/cloudlib/twitter/f;

    move-result-object v3

    new-array v4, v1, [Landroid/net/Uri;

    aput-object v2, v4, v0

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/twitter/f;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    move v0, v1

    goto :goto_0

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity$3;->a:Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterLoginActivity;->finish()V

    move v0, v1

    goto :goto_0
.end method
