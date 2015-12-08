.class public final Lcom/roidapp/photogrid/cloud/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/aj;


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/cloudlib/ak;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    .line 69
    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 7

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 323
    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    .line 356
    :cond_0
    :goto_0
    return-object v0

    .line 325
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 326
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 331
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p1}, Lcom/roidapp/baselib/gl/c;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 332
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 336
    const-string v2, "output"

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 337
    const-string v1, "android.intent.extra.videoQuality"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_0

    .line 340
    :cond_3
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 341
    const-string v1, "cameraFilterDarkCorner"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 342
    const-string v1, "cameraFilterGroupId"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    .line 343
    const-string v2, "cameraFilterFilterId"

    const/4 v4, 0x7

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 344
    const-string v4, "cameraFilterIsCloudFilter"

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    .line 345
    const-string v5, "cameraFilterCloudFilterPkgName"

    const-string v6, ""

    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object v0, p1

    .line 346
    invoke-static/range {v0 .. v5}, Lcom/roidapp/imagelib/a/h;->a(Landroid/content/Context;IIZZLjava/lang/String;)V

    .line 348
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/CameraPreviewActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 349
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 350
    const-string v2, "current_mode"

    const-string v3, "ImageSelector"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 351
    const-string v2, "camera_image_dir"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    const-string v2, "camera_image_name"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;I)Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 216
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nativetemplates/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/info"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;I)Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 221
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nativetemplates/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 121
    const-class v0, Lcom/roidapp/photogrid/MainPage;

    return-object v0
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 301
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/cmid/LoginService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 302
    const-string v1, "ACTION_LOGIN_BY_FACEBOOK"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 303
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 304
    return-void
.end method

.method public final a(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 288
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/cmid/LoginService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 289
    const-string v1, "ACTION_LOGIN_BY_INSTAGRAM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 290
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 291
    return-void
.end method

.method public final a(Landroid/content/Context;)V
    .locals 6

    .prologue
    .line 73
    const-string v0, "ClientProxyImplement"

    const-string v1, "init ClientProxyImplement"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    .line 75
    invoke-static {}, Lcom/roidapp/cloudlib/facebook/al;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    const-string v0, "393746364042772"

    .line 79
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 80
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.facebook.sdk.ApplicationId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 84
    :goto_0
    new-instance v1, Lcom/roidapp/cloudlib/facebook/a;

    const-class v2, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;

    invoke-direct {v1, v2, p1, v0}, Lcom/roidapp/cloudlib/facebook/a;-><init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;)V

    .line 85
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_0
    new-instance v0, Lcom/roidapp/cloudlib/instagram/h;

    const-class v1, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;

    const-string v3, "49ce12ab3ddc4569879308a589402ce3"

    const-string v4, "dbe30f60a83b4f81855d0a5a48231646"

    const-string v5, "instagram-photogrid-oauth"

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/instagram/h;-><init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    new-instance v0, Lcom/roidapp/cloudlib/flickr/j;

    const-class v1, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    const-string v3, "2b648660edac9af3893a7efdce0e3a7a"

    const-string v4, "59366f3548cdede2"

    const-string v5, "flickrj-sketchguru-oauth"

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/flickr/j;-><init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    new-instance v0, Lcom/roidapp/cloudlib/dropbox/a;

    const-class v1, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    const-string v3, "5tjilag14iugj2j"

    const-string v4, "cum7xl4lfwklnl3"

    sget-object v5, Lcom/dropbox/client2/session/Session$AccessType;->DROPBOX:Lcom/dropbox/client2/session/Session$AccessType;

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/dropbox/a;-><init>(Ljava/lang/Class;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/dropbox/client2/session/Session$AccessType;)V

    .line 92
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v0, Lcom/roidapp/cloudlib/google/h;

    const-class v1, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-direct {v0, v1, p1}, Lcom/roidapp/cloudlib/google/h;-><init>(Ljava/lang/Class;Landroid/content/Context;)V

    .line 94
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v0, Lcom/roidapp/cloudlib/twitter/a;

    const-string v2, "VGFGmjpouSSSQoU36I7w"

    const-string v3, "NFzbR9ahrDVPQJYnu1tkdrhxt9LcE1NBJu2eqUNA"

    const-string v4, "photogrid-twitter"

    const-string v5, "photogrid-twitter:///"

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/twitter/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    return-void

    .line 82
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 3

    .prologue
    .line 105
    const-string v0, "ClientProxyImplement"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "handleException "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    packed-switch p2, :pswitch_data_0

    .line 117
    :goto_0
    return-void

    .line 108
    :pswitch_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0702e3

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 111
    :pswitch_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07028d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 114
    :pswitch_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07004e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 106
    :pswitch_data_0
    .packed-switch 0x1100
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 155
    invoke-static {p1, p2}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 157
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 313
    invoke-static/range {p1 .. p6}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V

    .line 314
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    invoke-static {p1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 167
    return-void
.end method

.method public final a(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 308
    invoke-static {p1, p2, p3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 309
    return-void
.end method

.method public final a(Landroid/os/Bundle;)Z
    .locals 1

    .prologue
    .line 195
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 361
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p1, p2, p3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Landroid/net/Uri;Z)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;
    .locals 3

    .prologue
    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/ak;

    .line 177
    iget-object v2, v0, Lcom/roidapp/cloudlib/ak;->a:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 180
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Landroid/content/Context;)Ljava/io/InputStream;
    .locals 2

    .prologue
    .line 205
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "templates/info"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 131
    const-class v0, Lcom/roidapp/photogrid/common/PrivacyPolicy;

    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 318
    invoke-static {p1, p2}, Lcom/roidapp/photogrid/common/af;->d(Landroid/content/Context;Ljava/lang/String;)V

    .line 319
    return-void
.end method

.method public final c(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 3

    .prologue
    .line 211
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "templates/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 136
    const-class v0, Lcom/roidapp/photogrid/common/Eula;

    return-object v0
.end method

.method public final c(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 230
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "SHOW_NOTIFICATION_FLAG"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;)Lcom/roidapp/cloudlib/ads/l;
    .locals 1

    .prologue
    .line 265
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    const/4 v0, 0x1

    invoke-static {p1, p2, v0}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/s;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    new-instance v0, Lcom/roidapp/photogrid/cloud/a;

    invoke-direct {v0}, Lcom/roidapp/photogrid/cloud/a;-><init>()V

    .line 267
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 150
    const-class v0, Lcom/roidapp/photogrid/release/ImageSelector;

    return-object v0
.end method

.method public final d(Landroid/content/Context;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 260
    invoke-static {p1}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 366
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/filter/ImageEditGLESActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 367
    const-string v1, "image_path"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 368
    const-string v1, "entry_from"

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 369
    const-string v1, "entry_type"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 370
    const-string v1, "edit_suppot_filter"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 371
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 373
    return-object v0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/cloudlib/ak;",
            ">;"
        }
    .end annotation

    .prologue
    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final e(Landroid/content/Context;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 274
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/common/GooglePlayServicesUtil;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/VerifyError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 283
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    move v0, v1

    .line 274
    goto :goto_0

    .line 277
    :catch_0
    move-exception v0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;

    goto :goto_1

    .line 280
    :catch_1
    move-exception v0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/s;->b:Ljava/lang/Boolean;

    goto :goto_1
.end method

.method public final f()Z
    .locals 1

    .prologue
    .line 225
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/baselib/gl/c;->b()Z

    move-result v0

    return v0
.end method
