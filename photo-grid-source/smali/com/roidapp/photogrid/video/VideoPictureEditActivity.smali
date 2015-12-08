.class public Lcom/roidapp/photogrid/video/VideoPictureEditActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->b()V

    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 144
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    .line 145
    if-nez v0, :cond_1

    .line 149
    :cond_0
    :goto_0
    return-void

    .line 146
    :cond_1
    array-length v0, v0

    .line 147
    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 148
    const v0, 0x7f07019d

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 163
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 164
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    if-nez v1, :cond_2

    .line 165
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 166
    const-string v1, "CartPage_View"

    const-string v2, "Edit_Cart"

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    :cond_0
    :goto_0
    const-string v1, "folder_path"

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 180
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/lang/String;)V

    .line 181
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/lang/String;)V

    .line 182
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->o(I)V

    .line 183
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->al()V

    .line 186
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->k(Z)V

    .line 187
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->startActivity(Landroid/content/Intent;)V

    .line 188
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->finish()V

    .line 190
    :cond_1
    return-void

    .line 167
    :cond_2
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    .line 168
    const-class v1, Lcom/roidapp/photogrid/cloud/FlickrSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 169
    :cond_3
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_4

    .line 170
    const-class v1, Lcom/roidapp/photogrid/cloud/FbPhotoSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 171
    :cond_4
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_5

    .line 172
    const-class v1, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 173
    :cond_5
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_6

    .line 174
    const-class v1, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 175
    :cond_6
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->z(Landroid/content/Context;)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 176
    const-class v1, Lcom/roidapp/photogrid/cloud/InstagramSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 46
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    const v0, 0x7f030135

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    .line 62
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 63
    const-string v1, "video_new_select_4.84"

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 64
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "video_new_select_4.84"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1105
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1106
    new-instance v3, Landroid/app/Dialog;

    const v0, 0x7f0b001d

    invoke-direct {v3, p0, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 1108
    const v0, 0x7f0300c4

    :try_start_1
    invoke-virtual {v3, v0}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 1117
    :try_start_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020601

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 1118
    const v1, 0x7f0d0321

    invoke-virtual {v3, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 1119
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1120
    new-instance v4, Lcom/roidapp/photogrid/video/bn;

    invoke-direct {v4, p0, v0}, Lcom/roidapp/photogrid/video/bn;-><init>(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;Landroid/graphics/drawable/AnimationDrawable;)V

    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 1133
    const v0, 0x7f0d0279

    invoke-virtual {v3, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/video/bo;

    invoke-direct {v1, p0, v3}, Lcom/roidapp/photogrid/video/bo;-><init>(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;Landroid/app/Dialog;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1140
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 71
    :cond_0
    :goto_0
    const-string v0, "key_picture_fragment"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-nez v0, :cond_2

    .line 72
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f0d04e3

    new-instance v2, Lcom/roidapp/photogrid/video/bp;

    invoke-direct {v2}, Lcom/roidapp/photogrid/video/bp;-><init>()V

    const-string v3, "key_picture_fragment"

    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 78
    :goto_1
    return-void

    .line 56
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 57
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_1

    .line 1110
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 1113
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 1129
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 67
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->b()V

    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->attach(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    goto :goto_1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 194
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 195
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    .line 196
    if-eqz v0, :cond_1

    .line 197
    const v1, 0x7f0d04e3

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentById(I)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 201
    instance-of v1, v0, Lcom/roidapp/photogrid/video/bp;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 202
    check-cast v0, Lcom/roidapp/photogrid/video/bp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/bp;->b()V

    .line 208
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 210
    :goto_1
    return v0

    .line 206
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->a()V

    goto :goto_0

    .line 210
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 82
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 83
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 215
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    .line 216
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->b(Landroid/content/Context;)V

    .line 217
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 221
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 222
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->c(Landroid/content/Context;)V

    .line 223
    return-void
.end method
