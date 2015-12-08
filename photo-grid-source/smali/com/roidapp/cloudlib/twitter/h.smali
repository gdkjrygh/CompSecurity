.class final Lcom/roidapp/cloudlib/twitter/h;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ltwitter4j/auth/AccessToken;",
        "Ltwitter4j/TwitterException;",
        "Ltwitter4j/auth/AccessToken;",
        ">;",
        "Landroid/content/DialogInterface$OnCancelListener;"
    }
.end annotation


# instance fields
.field a:Landroid/app/ProgressDialog;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;)V
    .locals 1

    .prologue
    .line 136
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 137
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->b:Ljava/lang/ref/WeakReference;

    .line 138
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;B)V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/h;-><init>(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;)V

    return-void
.end method

.method private a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;
    .locals 1

    .prologue
    .line 141
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->b:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    goto :goto_0
.end method

.method private varargs a([Ltwitter4j/auth/AccessToken;)Ltwitter4j/auth/AccessToken;
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v3, 0x0

    .line 159
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/h;->a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    move-result-object v1

    .line 160
    if-nez v1, :cond_0

    .line 170
    :goto_0
    return-object v0

    .line 162
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a()Ltwitter4j/Twitter;

    move-result-object v1

    .line 163
    const/4 v2, 0x0

    aget-object v2, p1, v2

    invoke-interface {v1, v2}, Ltwitter4j/Twitter;->setOAuthAccessToken(Ltwitter4j/auth/AccessToken;)V

    .line 164
    invoke-interface {v1}, Ltwitter4j/Twitter;->getAccountSettings()Ltwitter4j/AccountSettings;

    .line 165
    const/4 v1, 0x0

    aget-object v0, p1, v1
    :try_end_0
    .catch Ltwitter4j/TwitterException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 166
    :catch_0
    move-exception v1

    .line 167
    invoke-virtual {v1}, Ltwitter4j/TwitterException;->printStackTrace()V

    .line 168
    const/4 v2, 0x1

    new-array v2, v2, [Ltwitter4j/TwitterException;

    aput-object v1, v2, v3

    invoke-virtual {p0, v2}, Lcom/roidapp/cloudlib/twitter/h;->publishProgress([Ljava/lang/Object;)V

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 130
    check-cast p1, [Ltwitter4j/auth/AccessToken;

    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/twitter/h;->a([Ltwitter4j/auth/AccessToken;)Ltwitter4j/auth/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 196
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/twitter/h;->cancel(Z)Z

    .line 197
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/h;->a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    move-result-object v0

    .line 198
    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->finish()V

    .line 200
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 130
    .line 2174
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/h;->a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    move-result-object v0

    .line 2176
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2177
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2178
    iget-object v1, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    .line 2181
    :cond_0
    if-eqz v0, :cond_1

    .line 2182
    invoke-static {v0}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;)V

    .line 130
    :cond_1
    return-void
.end method

.method protected final onPreExecute()V
    .locals 2

    .prologue
    .line 146
    invoke-super {p0}, Lcom/roidapp/baselib/c/c;->onPreExecute()V

    .line 147
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/h;->a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    move-result-object v0

    .line 148
    if-nez v0, :cond_0

    .line 155
    :goto_0
    return-void

    .line 150
    :cond_0
    sget v1, Lcom/roidapp/cloudlib/at;->R:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    .line 151
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p0}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 154
    iget-object v0, p0, Lcom/roidapp/cloudlib/twitter/h;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    goto :goto_0
.end method

.method protected final synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 130
    check-cast p1, [Ltwitter4j/TwitterException;

    .line 1186
    if-eqz p1, :cond_0

    .line 1188
    invoke-direct {p0}, Lcom/roidapp/cloudlib/twitter/h;->a()Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    move-result-object v0

    .line 1189
    if-eqz v0, :cond_0

    .line 1190
    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ltwitter4j/TwitterException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;->a(Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;Ljava/lang/String;)V

    .line 130
    :cond_0
    return-void
.end method
