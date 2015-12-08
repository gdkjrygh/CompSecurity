.class public Lcom/roidapp/photogrid/release/CameraPreviewActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/a/y;


# instance fields
.field a:Lcom/roidapp/imagelib/a/i;

.field private b:Z

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private j:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->b:Z

    .line 51
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->c:I

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    .line 62
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 139
    iget v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 140
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->setResult(I)V

    .line 141
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    .line 153
    :goto_0
    return-void

    .line 143
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 144
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 145
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 146
    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 147
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->startActivity(Landroid/content/Intent;)V

    .line 148
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    .line 149
    const-string v0, "MainPage_View"

    const-string v1, "Selfie_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "Cancel_Photo"

    const-string v1, "Selfie_Cancel"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 203
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 204
    const-string v0, "Take_Photo"

    const-string v1, "Selfie_Take"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Z)V
    .locals 6

    .prologue
    .line 299
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 300
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterDarkCorner"

    invoke-interface {v1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 301
    instance-of v1, p1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_1

    .line 302
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterIsCloudFilter"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 303
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterCloudFilterPkgName"

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 304
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterGroupId"

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    long-to-int v3, v4

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 305
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "cameraFilterFilterId"

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 314
    :cond_0
    :goto_0
    return-void

    .line 307
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterIsCloudFilter"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 308
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterCloudFilterPkgName"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 309
    if-eqz p1, :cond_0

    .line 310
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "cameraFilterGroupId"

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    long-to-int v3, v4

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 311
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "cameraFilterFilterId"

    invoke-interface {p1}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->b()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Lcom/roidapp/imagelib/b/b;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 221
    iget v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->f:I

    if-ne v0, v5, :cond_0

    .line 222
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->setResult(I)V

    .line 223
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    .line 253
    :goto_0
    return-void

    .line 225
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 226
    new-array v1, v5, [Lcom/roidapp/photogrid/release/ig;

    .line 227
    aput-object v0, v1, v4

    .line 228
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/imagelib/ImageLibrary;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 229
    iget v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    aget-object v2, v1, v2

    iput-object p1, v2, Lcom/roidapp/photogrid/release/ig;->o:Ljava/lang/String;

    .line 230
    iget v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    aget-object v2, v1, v2

    const/4 v3, 0x0

    iput-object v3, v2, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 231
    iget v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    aget-object v2, v1, v2

    iput-object p3, v2, Lcom/roidapp/photogrid/release/ig;->k:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 232
    iget v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    aget-object v2, v1, v2

    iput-object p2, v2, Lcom/roidapp/photogrid/release/ig;->i:Lcom/roidapp/imagelib/b/b;

    .line 233
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 234
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v5}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 235
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 236
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 237
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 239
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 240
    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 241
    const-string v1, "edit_image_index"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 242
    sput-object p4, Lcom/roidapp/imagelib/a/h;->l:Ljava/lang/String;

    .line 248
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->startActivity(Landroid/content/Intent;)V

    .line 249
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    .line 250
    const-string v0, "Preview_page"

    const-string v1, "Selfie_Preview"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 262
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 263
    const v0, 0x7f07020f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 287
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d()V

    .line 288
    return-void

    .line 264
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 265
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 266
    if-eqz v0, :cond_0

    .line 267
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 268
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 269
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 271
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 272
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 274
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 275
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 276
    const v0, 0x7f07028d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 278
    :cond_5
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 282
    :cond_6
    if-eqz p1, :cond_0

    .line 283
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 213
    return-void
.end method

.method public final c()V
    .locals 0

    .prologue
    .line 294
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d()V

    .line 295
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 68
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 70
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 71
    const-string v0, "CameraPreviewActivity"

    const-string v1, "new process, go to home"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1132
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1133
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->startActivity(Landroid/content/Intent;)V

    .line 1134
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    .line 1135
    const-string v0, "MainPage_View"

    const-string v1, "Selfie_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :cond_0
    :goto_0
    return-void

    .line 77
    :cond_1
    const v0, 0x7f03000a

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :goto_1
    sget-boolean v0, Ljp/co/cyberagent/android/gpuimage/GPUImageNativeLibrary;->loadGPUImageFailed:Z

    if-eqz v0, :cond_2

    .line 87
    const-string v0, "error exception,please reinstall the app from Google Play"

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 88
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 89
    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 90
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->startActivity(Landroid/content/Intent;)V

    .line 91
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->finish()V

    goto :goto_0

    .line 79
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 80
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->b:Z

    .line 81
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 94
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->b:Z

    if-nez v0, :cond_0

    .line 95
    const-string v0, "SelfieCam"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->e:Ljava/lang/String;

    .line 96
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "current_mode"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->g:Ljava/lang/String;

    .line 97
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "camera_image_dir"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->h:Ljava/lang/String;

    .line 98
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "camera_image_name"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->i:Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->g:Ljava/lang/String;

    const-string v1, "ImageSelector"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 100
    iput v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->f:I

    .line 104
    :goto_2
    sget v0, Lcom/roidapp/photogrid/release/ar;->a:I

    .line 2112
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 2114
    sget v2, Lcom/roidapp/photogrid/release/ar;->a:I

    if-ne v2, v0, :cond_5

    .line 2115
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "CameraPreviewFragment"

    invoke-virtual {v0, v2}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_4

    .line 2116
    new-instance v0, Lcom/roidapp/imagelib/a/i;

    invoke-direct {v0}, Lcom/roidapp/imagelib/a/i;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    .line 2117
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2118
    const-string v2, "camera_image_dir"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2119
    const-string v2, "camera_image_filename"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2120
    const-string v2, "current_mode"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 2121
    iget-object v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/a/i;->setArguments(Landroid/os/Bundle;)V

    .line 2122
    const v0, 0x7f0d005e

    iget-object v2, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    const-string v3, "CameraPreviewFragment"

    invoke-virtual {v1, v0, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 2123
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 106
    :goto_3
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->j:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 102
    :cond_3
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->f:I

    goto :goto_2

    .line 2125
    :cond_4
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "CameraPreviewFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/a/i;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    goto :goto_3

    .line 2127
    :cond_5
    sget v0, Lcom/roidapp/photogrid/release/ar;->b:I

    goto :goto_3
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 189
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 190
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->a:Lcom/roidapp/imagelib/a/i;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/i;->b()V

    .line 195
    :goto_0
    const/4 v0, 0x1

    .line 197
    :goto_1
    return v0

    .line 193
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d()V

    goto :goto_0

    .line 197
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 162
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 163
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 167
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 168
    const-string v0, "key_edit_image_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    const-string v0, "key_edit_image_index"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    .line 171
    :cond_0
    const-string v0, "entry_from"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    .line 175
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 157
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 158
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 179
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 180
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 181
    iget v0, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 182
    const-string v0, "key_edit_image_index"

    iget v1, p0, Lcom/roidapp/photogrid/release/CameraPreviewActivity;->d:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 185
    :cond_0
    return-void
.end method
