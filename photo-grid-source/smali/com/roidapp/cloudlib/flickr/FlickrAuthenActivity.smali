.class public Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;


# instance fields
.field private b:Lcom/roidapp/cloudlib/flickr/i;

.field private c:Lcom/roidapp/cloudlib/flickr/h;

.field private d:Landroid/app/ProgressDialog;

.field private e:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 56
    const-string v0, ""

    sput-object v0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 339
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Lcom/roidapp/cloudlib/flickr/h;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c:Lcom/roidapp/cloudlib/flickr/h;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;Lcom/roidapp/cloudlib/flickr/h;)Lcom/roidapp/cloudlib/flickr/h;
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c:Lcom/roidapp/cloudlib/flickr/h;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 38
    .line 1202
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1203
    const-string v0, "AuthenticationActivity"

    const-string v1, "showLoginFailDialog after this activity finish."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1204
    :goto_0
    return-void

    .line 1208
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1209
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 1210
    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 1211
    if-eqz p1, :cond_1

    const-string v1, "authentication"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "challenge"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1212
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/roidapp/cloudlib/at;->as:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aZ:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    .line 1215
    :goto_1
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/flickr/f;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/f;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog;->setButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 1224
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/flickr/g;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/g;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog;->setButton2(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 1232
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 1214
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->as:I

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setMessage(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/app/ProgressDialog;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    return-object v0
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 238
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    .line 239
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 240
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setResult(I)V

    .line 241
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->finish()V

    .line 243
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 75
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->requestWindowFeature(I)Z

    .line 77
    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setResult(I)V

    .line 80
    sget v0, Lcom/roidapp/cloudlib/as;->z:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->setContentView(I)V

    .line 82
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 83
    new-instance v0, Lcom/roidapp/cloudlib/flickr/a;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/a;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    new-instance v1, Lcom/roidapp/cloudlib/flickr/b;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/b;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    new-instance v2, Lcom/roidapp/cloudlib/flickr/c;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/flickr/c;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-static {p0, v0, v1, v2}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnKeyListener;)V

    .line 197
    :goto_0
    return-void

    .line 109
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "Flickr"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/flickr/j;

    .line 110
    iget-object v0, v0, Lcom/roidapp/cloudlib/flickr/j;->h:Ljava/lang/String;

    sput-object v0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->a:Ljava/lang/String;

    .line 113
    sget v0, Lcom/roidapp/cloudlib/ar;->a:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity$4;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 164
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 165
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->d(Landroid/content/Context;)V

    .line 166
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    new-instance v1, Lcom/roidapp/cloudlib/flickr/d;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/d;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 177
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 178
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 180
    const-string v0, ""

    sget v1, Lcom/roidapp/cloudlib/at;->R:I

    invoke-virtual {p0, v1}, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 183
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 184
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/roidapp/cloudlib/flickr/e;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/flickr/e;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 191
    new-instance v0, Lcom/roidapp/cloudlib/flickr/i;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/flickr/i;-><init>(Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b:Lcom/roidapp/cloudlib/flickr/i;

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b:Lcom/roidapp/cloudlib/flickr/i;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/flickr/i;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    goto :goto_0

    .line 194
    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDiskIOException;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->e:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->clearFormData()V

    throw v0
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 247
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 248
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b:Lcom/roidapp/cloudlib/flickr/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b:Lcom/roidapp/cloudlib/flickr/i;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/i;->getStatus$2cfd0ac4()I

    move-result v0

    sget v1, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v0, v1, :cond_0

    .line 250
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->b:Lcom/roidapp/cloudlib/flickr/i;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/i;->cancel(Z)Z

    .line 251
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c:Lcom/roidapp/cloudlib/flickr/h;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c:Lcom/roidapp/cloudlib/flickr/h;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/flickr/h;->getStatus$2cfd0ac4()I

    move-result v0

    sget v1, Lcom/roidapp/baselib/c/l;->c:I

    if-eq v0, v1, :cond_1

    .line 253
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->c:Lcom/roidapp/cloudlib/flickr/h;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/flickr/h;->cancel(Z)Z

    .line 254
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_2

    .line 255
    iget-object v0, p0, Lcom/roidapp/cloudlib/flickr/FlickrAuthenActivity;->d:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 257
    :cond_2
    return-void
.end method
