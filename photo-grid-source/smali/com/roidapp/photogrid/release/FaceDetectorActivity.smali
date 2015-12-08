.class public Lcom/roidapp/photogrid/release/FaceDetectorActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/facedetector/e;


# instance fields
.field a:Lcom/roidapp/imagelib/facedetector/a;

.field private b:Z

.field private c:Z

.field private d:I

.field private e:I

.field private f:[F

.field private g:Ljava/lang/String;

.field private h:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 33
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 42
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->b:Z

    .line 43
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->c:Z

    .line 44
    iput v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    .line 45
    iput v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->a:Lcom/roidapp/imagelib/facedetector/a;

    .line 52
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 148
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 149
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 150
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->finish()V

    .line 151
    return-void
.end method

.method private d()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 154
    iget v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 156
    const-class v1, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 157
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 158
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->finish()V

    .line 163
    :goto_0
    return-void

    .line 1168
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1169
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    if-nez v1, :cond_2

    .line 1170
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1184
    :cond_1
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->L()Ljava/lang/String;

    move-result-object v1

    .line 1185
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v2

    .line 1186
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->J()[Ljava/lang/String;

    move-result-object v3

    .line 1187
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 1188
    add-int/lit8 v5, v2, -0x1

    aget-object v5, v4, v5

    iget-object v6, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->g:Ljava/lang/String;

    iput-object v6, v5, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    .line 1189
    add-int/lit8 v5, v2, -0x1

    aget-object v5, v4, v5

    iput-object v8, v5, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 1190
    add-int/lit8 v2, v2, -0x1

    aget-object v2, v4, v2

    iput-object v8, v2, Lcom/roidapp/photogrid/release/ig;->b:Ljava/lang/String;

    .line 1192
    const-string v2, "firstCreate"

    invoke-virtual {v0, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1193
    const-string v2, "folder_path"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1194
    const-string v1, "image_paths"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 1195
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 1196
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->finish()V

    goto :goto_0

    .line 1171
    :cond_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    .line 1172
    const-class v1, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1173
    :cond_3
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    if-ne v1, v7, :cond_4

    .line 1174
    const-class v1, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1175
    :cond_4
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_5

    .line 1176
    const-class v1, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1177
    :cond_5
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_6

    .line 1178
    const-class v1, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_1

    .line 1179
    :cond_6
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    .line 1180
    const-class v1, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto/16 :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 253
    return-void
.end method

.method public final a(Ljava/lang/String;F[F)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 260
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 261
    new-array v1, v4, [Lcom/roidapp/photogrid/release/ig;

    .line 262
    iput p2, v0, Lcom/roidapp/photogrid/release/ig;->v:F

    .line 263
    iget-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->g:Ljava/lang/String;

    iput-object v2, v0, Lcom/roidapp/photogrid/release/ig;->c:Ljava/lang/String;

    .line 264
    aput-object v0, v1, v3

    .line 267
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 268
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 269
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 270
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 272
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 273
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 274
    const-string v1, "entryType"

    iget v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 275
    const-string v1, "entryFrom"

    iget v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 276
    const-string v1, "faceMatrix"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[F)Landroid/content/Intent;

    .line 277
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 278
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->finish()V

    .line 279
    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->h:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 288
    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 289
    const v0, 0x7f07020f

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 313
    :cond_0
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d()V

    .line 314
    return-void

    .line 290
    :cond_1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 292
    if-eqz v0, :cond_0

    .line 293
    const-string v1, "702"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 294
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 295
    :cond_2
    const-string v1, "700"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 297
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 298
    :cond_3
    const-string v1, "701"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 300
    invoke-static {p0, p2}, Lcom/roidapp/photogrid/common/y;->b(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 301
    :cond_4
    const-string v1, "703"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 302
    const v0, 0x7f07028d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 304
    :cond_5
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 308
    :cond_6
    if-eqz p1, :cond_0

    .line 309
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
    .locals 0

    .prologue
    .line 321
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d()V

    .line 322
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    const/4 v3, -0x1

    .line 58
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 61
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 62
    const-string v0, "CameraPreviewActivity"

    const-string v1, "new process, go to home"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->c()V

    .line 97
    :cond_0
    :goto_0
    return-void

    .line 68
    :cond_1
    const v0, 0x7f03009b

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->b:Z

    if-nez v0, :cond_0

    .line 92
    sget v0, Lcom/roidapp/photogrid/release/bi;->b:I

    .line 1100
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "entryType"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    .line 1101
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "entryFrom"

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    .line 1102
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "faceMatrix"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getFloatArrayExtra(Ljava/lang/String;)[F

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->f:[F

    .line 1103
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 1105
    sget v2, Lcom/roidapp/photogrid/release/bi;->a:I

    if-eq v2, v0, :cond_4

    .line 1113
    sget v2, Lcom/roidapp/photogrid/release/bi;->b:I

    if-ne v2, v0, :cond_4

    .line 1114
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1115
    iget v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    if-eqz v2, :cond_2

    iget v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    .line 1116
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "path"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->g:Ljava/lang/String;

    .line 1133
    :cond_3
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    const-string v3, "ImagePreviewFragment"

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    if-nez v2, :cond_7

    .line 1134
    new-instance v2, Lcom/roidapp/imagelib/facedetector/a;

    invoke-direct {v2}, Lcom/roidapp/imagelib/facedetector/a;-><init>()V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->a:Lcom/roidapp/imagelib/facedetector/a;

    .line 1136
    const-string v2, "edit_image_path"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1137
    const-string v2, "edit_face_matrix"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->f:[F

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 1138
    iget-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->a:Lcom/roidapp/imagelib/facedetector/a;

    invoke-virtual {v2, v0}, Lcom/roidapp/imagelib/facedetector/a;->setArguments(Landroid/os/Bundle;)V

    .line 1139
    const v0, 0x7f0d005e

    iget-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->a:Lcom/roidapp/imagelib/facedetector/a;

    const-string v3, "ImagePreviewFragment"

    invoke-virtual {v1, v0, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 1140
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 94
    :cond_4
    :goto_3
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->h:Landroid/widget/RelativeLayout;

    .line 95
    iget-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->h:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 70
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 71
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->b:Z

    .line 72
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_1

    .line 1117
    :cond_5
    iget v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    if-ne v2, v5, :cond_3

    .line 1124
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    .line 1125
    if-nez v2, :cond_6

    .line 1126
    const-string v0, "CameraPreviewActivity"

    const-string v1, "selectImages is null, go to main page."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1127
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->c()V

    goto :goto_3

    .line 1130
    :cond_6
    aget-object v2, v2, v4

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v2, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->g:Ljava/lang/String;

    goto :goto_2

    .line 1142
    :cond_7
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "ImagePreviewFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/facedetector/a;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->a:Lcom/roidapp/imagelib/facedetector/a;

    goto :goto_3
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 201
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 202
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->c:Z

    if-ne v1, v0, :cond_0

    .line 209
    :goto_0
    return v0

    .line 205
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d()V

    goto :goto_0

    .line 209
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 219
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V

    .line 220
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 224
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 225
    const-string v0, "entryType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 226
    const-string v0, "entryType"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    .line 228
    :cond_0
    const-string v0, "entryFrom"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    const-string v0, "entryFrom"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    .line 231
    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 0

    .prologue
    .line 214
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V

    .line 215
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 235
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 236
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 237
    const-string v0, "entryType"

    iget v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->d:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 238
    const-string v0, "entryFrom"

    iget v1, p0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;->e:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 239
    return-void
.end method
