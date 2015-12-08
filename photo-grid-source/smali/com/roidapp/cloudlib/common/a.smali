.class public final Lcom/roidapp/cloudlib/common/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/SharedPreferences;

.field private static b:Lcom/roidapp/cloudlib/common/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 221
    new-instance v0, Lcom/roidapp/cloudlib/common/b;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/common/b;-><init>()V

    sput-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    return-void
.end method

.method public static A(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 481
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 482
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 483
    const-string v1, "com.roidapp.cloudlib.photoOriginal"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 484
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 485
    return-void
.end method

.method private static B(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    .line 40
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    .line 43
    :cond_0
    return-void
.end method

.method public static a()Lcom/roidapp/cloudlib/common/b;
    .locals 1

    .prologue
    .line 253
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    return-object v0
.end method

.method public static a(I)V
    .locals 2

    .prologue
    .line 106
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 107
    const-string v1, "instagram-mode"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 108
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 109
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 75
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 76
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 77
    const-string v1, "instagram-username"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    const-string v1, "instagram-userId"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 79
    const-string v1, "instagram-token"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 80
    const-string v1, "instagram-head"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 81
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 82
    return-void
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 211
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 212
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 213
    const-string v1, "FlickrMode"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 214
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 215
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 145
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 146
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 147
    const-string v1, "flickrj-android-userName"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 148
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 149
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 237
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 238
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 239
    const-string v1, "facebook_user_name"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 240
    const-string v1, "FbUserId"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 241
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 242
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 307
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 308
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 309
    const-string v1, "twitter_token"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 310
    const-string v1, "twitter_token_secret"

    invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 311
    const-string v1, "twitter_user_name"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 312
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 313
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 65
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 66
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 67
    const-string v1, "instagram-username"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 68
    const-string v1, "instagram-userId"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 69
    const-string v1, "instagram-token"

    invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    const-string v1, "instagram-head"

    invoke-interface {v0, v1, p4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 71
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 72
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 257
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    iput-object p0, v0, Lcom/roidapp/cloudlib/common/b;->a:Ljava/lang/String;

    .line 258
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    iput-object p1, v0, Lcom/roidapp/cloudlib/common/b;->c:Ljava/lang/String;

    .line 259
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    iput p2, v0, Lcom/roidapp/cloudlib/common/b;->b:I

    .line 260
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    iput-object p3, v0, Lcom/roidapp/cloudlib/common/b;->d:Ljava/lang/String;

    .line 261
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    iput-object p4, v0, Lcom/roidapp/cloudlib/common/b;->e:Ljava/lang/String;

    .line 262
    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 85
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 86
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "instagram-username"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b()V
    .locals 2

    .prologue
    .line 265
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    const-string v1, ""

    iput-object v1, v0, Lcom/roidapp/cloudlib/common/b;->a:Ljava/lang/String;

    .line 266
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    const-string v1, ""

    iput-object v1, v0, Lcom/roidapp/cloudlib/common/b;->c:Ljava/lang/String;

    .line 267
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    const/4 v1, 0x0

    iput v1, v0, Lcom/roidapp/cloudlib/common/b;->b:I

    .line 268
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    const-string v1, ""

    iput-object v1, v0, Lcom/roidapp/cloudlib/common/b;->d:Ljava/lang/String;

    .line 269
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->b:Lcom/roidapp/cloudlib/common/b;

    const-string v1, ""

    iput-object v1, v0, Lcom/roidapp/cloudlib/common/b;->e:Ljava/lang/String;

    .line 270
    return-void
.end method

.method public static b(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 474
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 475
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 476
    const-string v1, "com.roidapp.cloudlib.photoOriginal"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 477
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 478
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 197
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 198
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 199
    const-string v1, "UserUrl"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 200
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 201
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 410
    const-string v0, "cloudlib_dropbox_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 412
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 413
    const-string v1, "cloudlib_dropbox_access_key"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 414
    const-string v1, "cloudlib_dropbox_access_secret"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 415
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 416
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 153
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 155
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 156
    const-string v1, "flickrj-android-oauthToken"

    invoke-interface {v0, v1, p3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 157
    const-string v1, "flickrj-android-tokenSecret"

    invoke-interface {v0, v1, p4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 158
    const-string v1, "flickrj-android-userName"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 159
    const-string v1, "flickrj-android-userId"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 160
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 161
    return-void
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 90
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 91
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "instagram-userId"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 375
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 376
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 377
    const-string v1, "googleToken"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 378
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 379
    return-void
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 95
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 96
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "instagram-token"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 419
    if-nez p0, :cond_0

    .line 426
    :goto_0
    return-void

    .line 421
    :cond_0
    const-string v0, "cloudlib_dropbox_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 423
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 424
    const-string v1, "cloudlib_dropbox_user_name"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 425
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 100
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 101
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "instagram-head"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 117
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 118
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "instagram-mode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static g(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 140
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 141
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "flickrj-android-userName"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static h(Landroid/content/Context;)Lcom/googlecode/flickrjandroid/oauth/OAuth;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 165
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 167
    sget-object v1, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v2, "flickrj-android-oauthToken"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 168
    sget-object v2, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v3, "flickrj-android-tokenSecret"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 169
    sget-object v3, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v4, "flickrj-android-userName"

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 170
    sget-object v4, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v5, "flickrj-android-userId"

    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 172
    if-nez v1, :cond_0

    if-nez v2, :cond_0

    .line 173
    const-string v1, "Prefers"

    const-string v2, "No oauth token retrieved"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    :goto_0
    return-object v0

    .line 176
    :cond_0
    new-instance v0, Lcom/googlecode/flickrjandroid/oauth/OAuth;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/oauth/OAuth;-><init>()V

    .line 177
    if-eqz v4, :cond_1

    .line 178
    new-instance v5, Lcom/googlecode/flickrjandroid/people/User;

    invoke-direct {v5}, Lcom/googlecode/flickrjandroid/people/User;-><init>()V

    .line 179
    invoke-virtual {v5, v3}, Lcom/googlecode/flickrjandroid/people/User;->setUsername(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v5, v4}, Lcom/googlecode/flickrjandroid/people/User;->setId(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v0, v5}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setUser(Lcom/googlecode/flickrjandroid/people/User;)V

    .line 183
    :cond_1
    new-instance v3, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;

    invoke-direct {v3}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;-><init>()V

    .line 184
    invoke-virtual {v0, v3}, Lcom/googlecode/flickrjandroid/oauth/OAuth;->setToken(Lcom/googlecode/flickrjandroid/oauth/OAuthToken;)V

    .line 185
    invoke-virtual {v3, v1}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->setOauthToken(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v3, v2}, Lcom/googlecode/flickrjandroid/oauth/OAuthToken;->setOauthTokenSecret(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static i(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 192
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 193
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "UserUrl"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static j(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 205
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 206
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "FlickrMode"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 227
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 228
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "facebook_user_name"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static l(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 245
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 246
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 247
    const-string v1, "facebook_user_name"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 248
    const-string v1, "FbUserId"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 249
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 250
    return-void
.end method

.method public static m(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 286
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 287
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "select_photo_index"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public static n(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 291
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 292
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 293
    const-string v1, "select_photo_index"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 294
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 295
    return-void
.end method

.method public static o(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 316
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 317
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 318
    const-string v1, "twitter_token"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 319
    const-string v1, "twitter_token_secret"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 320
    const-string v1, "twitter_user_name"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 321
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 322
    return-void
.end method

.method public static p(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 325
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 326
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 327
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 328
    const/4 v0, 0x1

    .line 329
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static q(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 333
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 334
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "twitter_token"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static r(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 338
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 339
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "twitter_token_secret"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static s(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 343
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 344
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "twitter_user_name"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static t(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 370
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 371
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "Search_Keyword"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static u(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 382
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 383
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 384
    const-string v1, "googleToken"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 385
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 386
    return-void
.end method

.method public static v(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 389
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 390
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "googleToken"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static w(Landroid/content/Context;)[Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v0, 0x0

    .line 436
    const-string v1, "cloudlib_dropbox_prefs"

    invoke-virtual {p0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 438
    const-string v2, "cloudlib_dropbox_access_key"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 439
    const-string v3, "cloudlib_dropbox_access_secret"

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 440
    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 441
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    .line 442
    aput-object v2, v0, v4

    .line 443
    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 446
    :cond_0
    return-object v0
.end method

.method public static x(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 451
    const-string v0, "cloudlib_dropbox_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 453
    const-string v1, "cloudlib_dropbox_user_name"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 454
    return-object v0
.end method

.method public static y(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 458
    const-string v0, "cloudlib_dropbox_prefs"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 459
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 460
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 461
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 462
    return-void
.end method

.method public static z(Landroid/content/Context;)I
    .locals 3

    .prologue
    .line 469
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->B(Landroid/content/Context;)V

    .line 470
    sget-object v0, Lcom/roidapp/cloudlib/common/a;->a:Landroid/content/SharedPreferences;

    const-string v1, "com.roidapp.cloudlib.photoOriginal"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method
