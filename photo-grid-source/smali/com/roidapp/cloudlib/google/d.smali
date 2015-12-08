.class final Lcom/roidapp/cloudlib/google/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/google/GoogleAuthActivity;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/d;->a:Ljava/lang/ref/WeakReference;

    .line 132
    iput-object p2, p0, Lcom/roidapp/cloudlib/google/d;->b:Ljava/lang/String;

    .line 133
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 137
    .line 140
    const-string v1, "oauth2:"

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " https://www.googleapis.com/auth/userinfo.profile"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 142
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " https://www.googleapis.com/auth/userinfo.email"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 145
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/google/d;->b:Ljava/lang/String;

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/auth/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/android/gms/auth/d; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/auth/a; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v1

    move-object v2, v1

    move-object v1, v0

    .line 158
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;

    .line 159
    if-eqz v0, :cond_0

    .line 161
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/roidapp/cloudlib/common/a;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 163
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 165
    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 166
    invoke-static {v0}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->b(Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)Z

    .line 170
    new-instance v2, Lcom/roidapp/cloudlib/google/e;

    invoke-direct {v2, p0, v0, v1}, Lcom/roidapp/cloudlib/google/e;-><init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Landroid/content/Intent;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 259
    :cond_0
    :goto_1
    return-void

    .line 146
    :catch_0
    move-exception v1

    move-object v2, v1

    .line 148
    invoke-virtual {v2}, Lcom/google/android/gms/auth/d;->a()Landroid/content/Intent;

    move-result-object v1

    .line 150
    invoke-virtual {v2}, Lcom/google/android/gms/auth/d;->printStackTrace()V

    move-object v2, v0

    .line 156
    goto :goto_0

    .line 153
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    move-object v1, v0

    move-object v2, v0

    .line 156
    goto :goto_0

    .line 155
    :catch_2
    move-exception v1

    invoke-virtual {v1}, Lcom/google/android/gms/auth/a;->printStackTrace()V

    move-object v1, v0

    move-object v2, v0

    goto :goto_0

    .line 181
    :cond_1
    new-instance v1, Lcom/roidapp/cloudlib/google/f;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/cloudlib/google/f;-><init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 198
    :cond_2
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 202
    :try_start_1
    new-instance v1, Ljava/net/URL;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "https://www.googleapis.com/oauth2/v1/userinfo?alt=json&access_token="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 205
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v2

    .line 206
    const/16 v4, 0xc8

    if-ne v2, v4, :cond_4

    .line 207
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    .line 209
    new-instance v2, Lorg/json/JSONObject;

    invoke-static {v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 210
    const-string v4, "email"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 211
    const-string v5, "gender"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 212
    const-string v6, "locale"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 214
    const-string v6, "email"

    invoke-virtual {v3, v6, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    if-eqz v5, :cond_3

    .line 217
    const-string v4, "male"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 218
    const-string v4, "gender"

    const-string v5, "1"

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    :cond_3
    :goto_2
    const-string v4, "locale"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_4

    .line 245
    :cond_4
    :goto_3
    new-instance v1, Lcom/roidapp/cloudlib/google/g;

    invoke-direct {v1, p0, v0, v3}, Lcom/roidapp/cloudlib/google/g;-><init>(Lcom/roidapp/cloudlib/google/d;Lcom/roidapp/cloudlib/google/GoogleAuthActivity;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/google/GoogleAuthActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto/16 :goto_1

    .line 219
    :cond_5
    :try_start_2
    const-string v4, "female"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 220
    const-string v4, "gender"

    const-string v5, "0"

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_2

    .line 239
    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    .line 241
    :catch_4
    move-exception v1

    invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_3
.end method
