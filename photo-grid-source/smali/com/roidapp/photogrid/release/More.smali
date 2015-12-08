.class public Lcom/roidapp/photogrid/release/More;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# static fields
.field private static c:Z


# instance fields
.field private a:Landroid/webkit/WebView;

.field private b:Landroid/widget/ProgressBar;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/release/More;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/More;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->b:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private a()V
    .locals 3

    .prologue
    .line 268
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "more_app_new"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 269
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/More;)Z
    .locals 1

    .prologue
    .line 26
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/More;)Landroid/webkit/WebView;
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 112
    const-string v0, "cleanmaster"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    const-string v1, "javascript:hide()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 117
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/More;->a()V

    .line 120
    :cond_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 121
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 122
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 123
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 124
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V

    .line 125
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MoreApp/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Click/Http"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 215
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 216
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 217
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 218
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 219
    const-string v1, "com.android.browser"

    const-string v2, "com.android.browser.BrowserActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 220
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    :goto_0
    return-void

    .line 221
    :catch_0
    move-exception v0

    .line 222
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 224
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 225
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 226
    const/high16 v3, 0x10000000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 227
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 228
    const-string v2, "com.android.browser"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 229
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 231
    :catch_1
    move-exception v1

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 232
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/More;->c(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MoreApp/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Click/GooglePlay"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 245
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 246
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 247
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 248
    const-string v2, "com.android.vending"

    const-string v3, "com.google.android.finsky.activities.MainActivity"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 249
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 250
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 265
    :goto_0
    return-void

    .line 252
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 254
    :try_start_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 255
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 256
    const-string v2, "com.android.vending"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 257
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 258
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 259
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 260
    :catch_1
    move-exception v0

    .line 261
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/More;->a(Ljava/lang/String;)V

    .line 262
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public go(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 129
    const-string v0, "com."

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const-string v1, "http://"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 131
    const-string v1, "com.android.vending"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 132
    const/4 v1, 0x0

    const-string v2, "http://"

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "MoreApp/"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Click/GooglePlay"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 135
    const-string v0, "cleanmaster"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 137
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    const-string v1, "javascript:hide()"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 141
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/More;->a()V

    .line 143
    :cond_1
    const-string v0, "&referrer=utm_source%3D200019%26utm_campaign%3Dphotogrid"

    move-object v1, v0

    .line 150
    :goto_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 151
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 152
    const/high16 v4, 0x10000000

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 153
    const-string v4, "com.android.vending"

    const-string v5, "com.google.android.finsky.activities.MainActivity"

    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 155
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 205
    :goto_1
    return-void

    .line 144
    :cond_2
    const-string v0, "batterydoctor"

    invoke-virtual {v2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 145
    const-string v0, "&referrer=utm_source%3D10030006%26utm_campaign%3Dphotogrid1"

    move-object v1, v0

    goto :goto_0

    .line 147
    :cond_3
    const-string v0, "&referrer=utm_source%3Dphotogrid"

    move-object v1, v0

    goto :goto_0

    .line 157
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 159
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 160
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 161
    const-string v3, "com.android.vending"

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 162
    const/high16 v3, 0x10000000

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 163
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 164
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 165
    :catch_1
    move-exception v0

    .line 166
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/More;->a(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 173
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MoreApp/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/Click/Http"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 174
    const-string v0, "http://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 175
    const-string v0, "cleanmaster"

    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 176
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    if-eqz v0, :cond_6

    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_5

    .line 178
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    const-string v2, "javascript:hide()"

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 180
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/More;->a()V

    .line 184
    :cond_6
    :try_start_2
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 185
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 186
    const/high16 v3, 0x10000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 187
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 188
    const-string v2, "com.android.browser"

    const-string v3, "com.android.browser.BrowserActivity"

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 189
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 190
    :catch_2
    move-exception v0

    .line 191
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 193
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 195
    const/high16 v4, 0x10000000

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 196
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 197
    const-string v3, "com.android.browser"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 198
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/More;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    .line 200
    :catch_3
    move-exception v2

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 201
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/More;->c(Ljava/lang/String;)V

    goto/16 :goto_1
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/16 v3, 0x400

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 34
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 35
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/More;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setFlags(II)V

    .line 40
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/More;->requestWindowFeature(I)Z

    .line 41
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->requestWindowFeature(I)Z

    .line 43
    const v0, 0x7f0300e7

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->v:Z

    if-nez v0, :cond_0

    .line 50
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "more_app_new"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/More;->d:Z

    .line 52
    const v0, 0x7f0d03ad

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/More;->b:Landroid/widget/ProgressBar;

    .line 53
    const v0, 0x7f0d03ac

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/More;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    .line 54
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    new-instance v3, Lcom/roidapp/photogrid/release/lk;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/lk;-><init>(Lcom/roidapp/photogrid/release/More;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    new-instance v3, Lcom/roidapp/photogrid/release/More$2;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/More$2;-><init>(Lcom/roidapp/photogrid/release/More;)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    .line 92
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 93
    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    .line 94
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 95
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 96
    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    const-string v3, "http://dl.cm.ksmobile.com/photogrid/PhotoGrid_More/MoreApp.html"

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 99
    sget-boolean v0, Lcom/roidapp/photogrid/release/More;->c:Z

    if-ne v0, v1, :cond_0

    .line 100
    const-string v0, "http://dl.cm.ksmobile.com/photogrid/PhotoGrid_More/MoreApp.html"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/More;->c(Ljava/lang/String;)V

    .line 101
    sput-boolean v2, Lcom/roidapp/photogrid/release/More;->c:Z

    .line 104
    :cond_0
    return-void

    .line 45
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 46
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/More;->v:Z

    .line 47
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0

    :cond_1
    move v0, v2

    .line 50
    goto :goto_1
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 276
    :cond_0
    const-string v0, "MoreApp/onDestroy1"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    if-eqz v0, :cond_1

    .line 278
    const-string v0, "MoreApp/onDestroy2"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/More;->a:Landroid/webkit/WebView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 281
    :cond_1
    const-string v0, "MoreApp/onDestroy3"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 282
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 283
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 108
    const-string v0, "more"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/More;->t:Ljava/lang/String;

    .line 109
    return-void
.end method
