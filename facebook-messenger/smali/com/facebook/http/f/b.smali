.class public Lcom/facebook/http/f/b;
.super Lcom/facebook/widget/c/a;
.source "HttpProxyPreference.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 18
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/a;-><init>(Landroid/content/Context;)V

    .line 19
    sget-object v0, Lcom/facebook/http/f/c;->g:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/b;->setKey(Ljava/lang/String;)V

    .line 20
    sget v0, Lcom/facebook/o;->debug_http_proxy_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/b;->setTitle(I)V

    .line 21
    invoke-virtual {p0}, Lcom/facebook/http/f/b;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/facebook/o;->debug_http_proxy_summary:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/b;->a(Ljava/lang/CharSequence;)V

    .line 22
    sget v0, Lcom/facebook/o;->debug_http_proxy_dialog_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/http/f/b;->setDialogTitle(I)V

    .line 23
    invoke-virtual {p0}, Lcom/facebook/http/f/b;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    sget v1, Lcom/facebook/o;->debug_http_proxy_hint:I

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(I)V

    .line 24
    invoke-virtual {p0}, Lcom/facebook/http/f/b;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setSingleLine(Z)V

    .line 25
    invoke-virtual {p0}, Lcom/facebook/http/f/b;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setInputType(I)V

    .line 26
    return-void
.end method
