.class public Lcom/roidapp/photogrid/release/HelpActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Landroid/view/View;

.field private c:Landroid/view/View;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 156
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/HelpActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/roidapp/photogrid/release/HelpActivity;->e:Ljava/lang/String;

    return-object p1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 50
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/roidapp/photogrid/release/HelpActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 51
    const-string v2, "url"

    .line 1036
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/w;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 1037
    const-string v3, "en"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1038
    const-string v0, ""

    .line 1046
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "http://dl.pg.ksmobile.com/help/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ".html"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 51
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 53
    return-void

    .line 1040
    :cond_0
    const-string v3, "zh"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1041
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v4, "CN"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "-rCN"

    :goto_1
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, "-rTW"

    goto :goto_1

    .line 1044
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/HelpActivity;)Landroid/view/View;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 145
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/HelpActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/HelpActivity;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 154
    :cond_1
    :goto_0
    return-void

    .line 152
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/HelpActivity;->finish()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 63
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 66
    const v0, 0x7f0300d0

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/HelpActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->v:Z

    if-nez v0, :cond_3

    .line 74
    const v0, 0x7f0d01e9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    .line 75
    const v0, 0x7f0d019e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    .line 76
    const v0, 0x7f0d036d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/HelpActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    .line 77
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/HelpActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->e:Ljava/lang/String;

    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 81
    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 82
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 83
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/HelpActivity$MyWebViewClient;-><init>(Lcom/roidapp/photogrid/release/HelpActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 1131
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_3

    .line 1132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 1133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->b:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1135
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 88
    :cond_3
    return-void

    .line 69
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 70
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/HelpActivity;->v:Z

    .line 71
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 112
    :cond_0
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 113
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/HelpActivity;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->a:Landroid/webkit/WebView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 124
    const/4 v0, 0x1

    .line 127
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 102
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 105
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 92
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 93
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->v:Z

    if-nez v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/HelpActivity;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 95
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/HelpActivity;->finish()V

    .line 98
    :cond_0
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 116
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 117
    return-void
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 141
    return-void
.end method
