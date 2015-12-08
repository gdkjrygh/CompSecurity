.class public Lcom/pinterest/pinit/PinIt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EXTRA_DESCRIPTION:Ljava/lang/String; = "com.pinterest.EXTRA_DESCRIPTION"

.field private static final EXTRA_IMAGE:Ljava/lang/String; = "com.pinterest.EXTRA_IMAGE"

.field private static final EXTRA_PARTNER_ID:Ljava/lang/String; = "com.pinterest.EXTRA_PARTNER_ID"

.field private static final EXTRA_PARTNER_PACKAGE:Ljava/lang/String; = "com.pinterest.EXTRA_PARTNER_PACKAGE"

.field private static final EXTRA_URI:Ljava/lang/String; = "com.pinterest.EXTRA_URI"

.field private static final EXTRA_URL:Ljava/lang/String; = "com.pinterest.EXTRA_URL"

.field private static final INTENT_PIN_IT:Ljava/lang/String; = "com.pinterest.action.PIN_IT"

.field private static final TAG:Ljava/lang/String; = "Pinterest Pin It"

.field private static _partnerId:Ljava/lang/String;

.field private static debugMode:Z


# instance fields
.field private _description:Ljava/lang/String;

.field private _imageUri:Landroid/net/Uri;

.field private _imageUrl:Ljava/lang/String;

.field private _listener:Lcom/pinterest/pinit/PinItListener;

.field private _url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static forceInstallPinterest(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 231
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "market://details?id=com.pinterest"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v0

    .line 233
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 234
    const/4 v0, 0x1

    .line 236
    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getPartnerId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 401
    sget-object v0, Lcom/pinterest/pinit/PinIt;->_partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public static isDebugMode()Z
    .locals 1

    .prologue
    .line 299
    sget-boolean v0, Lcom/pinterest/pinit/PinIt;->debugMode:Z

    return v0
.end method

.method private static varargs log(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 219
    sget-boolean v0, Lcom/pinterest/pinit/PinIt;->debugMode:Z

    if-eqz v0, :cond_0

    .line 220
    const-string v0, "Pinterest Pin It"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    :cond_0
    return-void
.end method

.method private static varargs loge(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 208
    sget-boolean v0, Lcom/pinterest/pinit/PinIt;->debugMode:Z

    if-eqz v0, :cond_0

    .line 209
    const-string v0, "Pinterest Pin It"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    :cond_0
    return-void
.end method

.method public static meetsRequirements()Z
    .locals 2

    .prologue
    .line 246
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static pinterestInstalled(Landroid/content/Context;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 256
    invoke-static {}, Lcom/pinterest/pinit/PinIt;->meetsRequirements()Z

    move-result v2

    if-nez v2, :cond_0

    .line 275
    :goto_0
    return v1

    .line 261
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "com.pinterest"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 262
    if-eqz v2, :cond_3

    .line 263
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    const/16 v4, 0x10

    if-lt v3, v4, :cond_2

    .line 264
    :goto_1
    const-string v3, "Pinterest versionCode:%s versionName:%s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget v6, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v4, v5

    const/4 v5, 0x1

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    aput-object v2, v4, v5

    invoke-static {v3, v4}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_2
    if-nez v0, :cond_1

    .line 269
    const-string v2, "Pinterest app version too low!"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_3
    move v1, v0

    .line 275
    goto :goto_0

    :cond_2
    move v0, v1

    .line 263
    goto :goto_1

    .line 266
    :cond_3
    const-string v0, "Pinterest app not installed!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    goto :goto_2

    .line 270
    :catch_0
    move-exception v0

    .line 271
    sget-boolean v2, Lcom/pinterest/pinit/PinIt;->debugMode:Z

    if-eqz v2, :cond_4

    .line 272
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    move v0, v1

    .line 273
    goto :goto_3
.end method

.method public static setDebugMode(Z)V
    .locals 0

    .prologue
    .line 308
    sput-boolean p0, Lcom/pinterest/pinit/PinIt;->debugMode:Z

    .line 309
    return-void
.end method

.method public static setPartnerId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 411
    sput-object p0, Lcom/pinterest/pinit/PinIt;->_partnerId:Ljava/lang/String;

    .line 412
    return-void
.end method


# virtual methods
.method public doPinIt(Landroid/content/Context;)V
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 121
    invoke-static {}, Lcom/pinterest/pinit/PinIt;->meetsRequirements()Z

    move-result v2

    if-nez v2, :cond_1

    .line 195
    :cond_0
    :goto_0
    return-void

    .line 123
    :cond_1
    iget-object v2, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v2, :cond_2

    .line 124
    iget-object v2, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    invoke-virtual {v2}, Lcom/pinterest/pinit/PinItListener;->onStart()V

    .line 125
    :cond_2
    invoke-static {p1}, Lcom/pinterest/pinit/PinIt;->pinterestInstalled(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 126
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_3

    .line 127
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    new-instance v1, Lcom/pinterest/pinit/exceptions/NotInstalledException;

    invoke-direct {v1}, Lcom/pinterest/pinit/exceptions/NotInstalledException;-><init>()V

    invoke-virtual {v0, v1}, Lcom/pinterest/pinit/PinItListener;->onException(Ljava/lang/Exception;)V

    .line 129
    :cond_3
    invoke-static {p1}, Lcom/pinterest/pinit/PinIt;->forceInstallPinterest(Landroid/content/Context;)Z

    goto :goto_0

    .line 134
    :cond_4
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 135
    const-string v3, "com.pinterest.action.PIN_IT"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 139
    iget-object v3, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    .line 141
    const-string v3, "com.pinterest.EXTRA_IMAGE"

    iget-object v4, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 147
    :goto_1
    if-nez v0, :cond_7

    .line 148
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_5

    .line 149
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    new-instance v2, Lcom/pinterest/pinit/exceptions/ImageException;

    invoke-direct {v2}, Lcom/pinterest/pinit/exceptions/ImageException;-><init>()V

    invoke-virtual {v0, v2}, Lcom/pinterest/pinit/PinItListener;->onException(Ljava/lang/Exception;)V

    .line 150
    :cond_5
    const-string v0, "imageUrl and/or imageUri cannot be null! Did you call setImageUrl(String) or setImageUri(Uri)?"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 142
    :cond_6
    iget-object v3, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    if-eqz v3, :cond_f

    .line 144
    const-string v3, "com.pinterest.EXTRA_URI"

    iget-object v4, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    goto :goto_1

    .line 155
    :cond_7
    sget-object v0, Lcom/pinterest/pinit/PinIt;->_partnerId:Ljava/lang/String;

    if-eqz v0, :cond_8

    sget-object v0, Lcom/pinterest/pinit/PinIt;->_partnerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_a

    .line 156
    :cond_8
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_9

    .line 157
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    new-instance v2, Lcom/pinterest/pinit/exceptions/PartnerIdException;

    invoke-direct {v2}, Lcom/pinterest/pinit/exceptions/PartnerIdException;-><init>()V

    invoke-virtual {v0, v2}, Lcom/pinterest/pinit/PinItListener;->onException(Ljava/lang/Exception;)V

    .line 158
    :cond_9
    const-string v0, "partnerId cannot be null! Did you call setPartnerId?"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 161
    :cond_a
    const-string v0, "com.pinterest.EXTRA_PARTNER_ID"

    sget-object v3, Lcom/pinterest/pinit/PinIt;->_partnerId:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 165
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_url:Ljava/lang/String;

    if-nez v0, :cond_c

    .line 166
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    if-nez v0, :cond_d

    .line 167
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_b

    .line 168
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    new-instance v2, Lcom/pinterest/pinit/exceptions/SourceUrlException;

    invoke-direct {v2}, Lcom/pinterest/pinit/exceptions/SourceUrlException;-><init>()V

    invoke-virtual {v0, v2}, Lcom/pinterest/pinit/PinItListener;->onException(Ljava/lang/Exception;)V

    .line 169
    :cond_b
    const-string v0, "url cannot be null! Did you call setUrl?"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/pinterest/pinit/PinIt;->loge(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 173
    :cond_c
    const-string v0, "com.pinterest.EXTRA_URL"

    iget-object v3, p0, Lcom/pinterest/pinit/PinIt;->_url:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    :cond_d
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_description:Ljava/lang/String;

    if-nez v0, :cond_e

    .line 178
    const-string v0, "description is null. You can optionally set it with setDescription."

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lcom/pinterest/pinit/PinIt;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :goto_2
    const-string v0, "com.pinterest.EXTRA_PARTNER_PACKAGE"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 189
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/pinterest/pinit/PinItListener;->onComplete(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 192
    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    invoke-virtual {v0, v1}, Lcom/pinterest/pinit/PinItListener;->onComplete(Z)V

    goto/16 :goto_0

    .line 180
    :cond_e
    const-string v0, "com.pinterest.EXTRA_DESCRIPTION"

    iget-object v3, p0, Lcom/pinterest/pinit/PinIt;->_description:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_2

    :cond_f
    move v0, v1

    goto/16 :goto_1
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_description:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getListener()Lcom/pinterest/pinit/PinItListener;
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/pinterest/pinit/PinIt;->_url:Ljava/lang/String;

    return-object v0
.end method

.method public reset()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 282
    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_url:Ljava/lang/String;

    .line 283
    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    .line 284
    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    .line 285
    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_description:Ljava/lang/String;

    .line 286
    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    .line 287
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 378
    iput-object p1, p0, Lcom/pinterest/pinit/PinIt;->_description:Ljava/lang/String;

    .line 379
    return-void
.end method

.method public setImageUri(Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 343
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    .line 344
    iput-object p1, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    .line 345
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 325
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pinterest/pinit/PinIt;->_imageUri:Landroid/net/Uri;

    .line 326
    iput-object p1, p0, Lcom/pinterest/pinit/PinIt;->_imageUrl:Ljava/lang/String;

    .line 327
    return-void
.end method

.method public setListener(Lcom/pinterest/pinit/PinItListener;)V
    .locals 0

    .prologue
    .line 394
    iput-object p1, p0, Lcom/pinterest/pinit/PinIt;->_listener:Lcom/pinterest/pinit/PinItListener;

    .line 395
    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 361
    iput-object p1, p0, Lcom/pinterest/pinit/PinIt;->_url:Ljava/lang/String;

    .line 362
    return-void
.end method
