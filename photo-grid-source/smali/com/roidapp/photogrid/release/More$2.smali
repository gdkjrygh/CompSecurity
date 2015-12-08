.class Lcom/roidapp/photogrid/release/More$2;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/More;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/More;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/roidapp/photogrid/release/More$2;->a:Lcom/roidapp/photogrid/release/More;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 73
    const-string v0, "market://"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "?id="

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    .line 75
    const-string v1, "http://"

    invoke-virtual {p2, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 76
    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More$2;->a:Lcom/roidapp/photogrid/release/More;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/More;->go(Ljava/lang/String;)V

    .line 86
    :goto_0
    const/4 v0, 0x1

    return v0

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More$2;->a:Lcom/roidapp/photogrid/release/More;

    const-string v1, "com.android.vending"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "play.google"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More$2;->a:Lcom/roidapp/photogrid/release/More;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/More;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More$2;->a:Lcom/roidapp/photogrid/release/More;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/More;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
