.class public Lcom/roidapp/photogrid/release/ShareEntryVideo;
.super Lcom/roidapp/photogrid/release/ShareEntryBase;
.source "SourceFile"


# instance fields
.field private d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;-><init>()V

    .line 256
    new-instance v0, Lcom/roidapp/photogrid/release/qw;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/qw;-><init>(Lcom/roidapp/photogrid/release/ShareEntryVideo;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ShareEntryVideo;->d:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/4 v2, 0x0

    const/high16 v8, 0x4000000

    const/4 v5, 0x1

    const/4 v1, 0x0

    .line 49
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ShareEntryBase;->onCreate(Landroid/os/Bundle;)V

    .line 50
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v3, "hideVideo"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1206
    sget v0, Lcom/roidapp/videolib/f;->c:I

    .line 1207
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    .line 1208
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v3

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v6, "opengl"

    const-string v7, "gpu_white_list"

    invoke-virtual {v4, v6, v7}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roidapp/baselib/gl/c;->a(Ljava/util/List;)V

    .line 1209
    if-nez v0, :cond_2

    .line 1211
    sget v0, Lcom/roidapp/videolib/f;->b:I

    move v0, v1

    .line 50
    :goto_0
    if-nez v0, :cond_9

    .line 52
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 53
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 54
    const-string v1, "isFromShareGallery"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->finish()V

    .line 56
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->startActivity(Landroid/content/Intent;)V

    .line 203
    :cond_1
    :goto_1
    return-void

    .line 1216
    :cond_2
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1218
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ShareEntryVideo;->d:Landroid/os/Handler;

    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v3, p0, v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/os/Handler;Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 1221
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v3

    const-string v4, "video"

    const-string v6, "black_list"

    invoke-virtual {v3, v4, v6}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p0, v3}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v0

    .line 1222
    sget v3, Lcom/roidapp/videolib/f;->b:I

    if-ne v0, v3, :cond_3

    move v0, v1

    .line 1224
    goto :goto_0

    .line 1226
    :cond_3
    sget v3, Lcom/roidapp/videolib/f;->a:I

    if-ne v0, v3, :cond_8

    move v0, v5

    goto :goto_0

    .line 1230
    :cond_4
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/gl/c;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1232
    invoke-static {}, Lcom/roidapp/videolib/e;->a()Lcom/roidapp/videolib/e;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v3

    const-string v4, "video"

    const-string v6, "black_list"

    invoke-virtual {v3, v4, v6}, Lcom/roidapp/cloudlib/a/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, p0, v3}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;Ljava/util/List;)I

    move-result v0

    .line 1233
    sget v3, Lcom/roidapp/videolib/f;->c:I

    if-ne v0, v3, :cond_5

    move v0, v1

    .line 1240
    goto :goto_0

    .line 1242
    :cond_5
    sget v3, Lcom/roidapp/videolib/f;->a:I

    if-ne v0, v3, :cond_6

    move v0, v5

    .line 1243
    goto/16 :goto_0

    :cond_6
    move v0, v1

    .line 1244
    goto/16 :goto_0

    .line 1249
    :cond_7
    sget v0, Lcom/roidapp/videolib/f;->b:I

    :cond_8
    move v0, v1

    goto/16 :goto_0

    .line 58
    :cond_9
    invoke-static {}, Lcom/roidapp/videolib/core/l;->a()Lcom/roidapp/videolib/core/l;

    invoke-static {}, Lcom/roidapp/videolib/core/l;->d()Z

    move-result v0

    if-nez v0, :cond_a

    .line 59
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 60
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 61
    const-string v1, "isFromShareGalleryVideoNotReady"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 62
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->finish()V

    .line 63
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 67
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 96
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 98
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 99
    if-eqz v0, :cond_e

    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_e

    .line 100
    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 102
    if-eqz v3, :cond_d

    .line 104
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 106
    invoke-virtual {p0, v3, v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->a(Ljava/util/ArrayList;I)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    .line 108
    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/ShareEntryVideo;->a:Z

    if-nez v4, :cond_1

    .line 111
    if-eqz v3, :cond_c

    .line 112
    aget-object v2, v3, v1

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    aget-object v4, v3, v1

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const-string v6, "/"

    invoke-virtual {v4, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move v4, v5

    .line 125
    :goto_2
    if-eqz v4, :cond_f

    .line 129
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 130
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v4

    invoke-static {p0, v4}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 134
    new-instance v4, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v4}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v4, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 144
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v6, "other"

    const-string v7, "enableCrittercism50"

    invoke-virtual {v4, v6, v7, v1}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 145
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 149
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 154
    const/4 v4, 0x6

    sput v4, Lcom/roidapp/photogrid/common/az;->q:I

    .line 158
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v4

    sput-boolean v4, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 160
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 161
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 162
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 163
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 164
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 165
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 166
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const-string v3, "ShareEntryVideo"

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 167
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 168
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const/16 v3, 0x32

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 170
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 171
    sget-object v2, Lcom/roidapp/photogrid/b/g;->n:Lcom/roidapp/photogrid/b/g;

    invoke-static {v2}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 172
    const-string v2, "EditPage_View"

    const-string v3, "SystemGallery_Edit"

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    const-string v2, "OpenPG"

    invoke-static {p0, v2}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 175
    const-string v2, "Share/Video"

    invoke-static {v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 176
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 177
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "FromShare/Video/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 178
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 179
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Z)V

    .line 180
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->o(I)V

    .line 181
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "first_in"

    invoke-interface {v0, v1, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 182
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 183
    const-string v0, "Music: Love PhotoGrid - PhotoGrid"

    .line 184
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/lang/String;)V

    .line 186
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f07002e

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/.music/Love PhotoGrid-L.mp3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/lang/String;)V

    .line 190
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 191
    invoke-virtual {v0, v8}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 192
    const-string v1, "moreThan9"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ShareEntryVideo;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->finish()V

    .line 194
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    :cond_c
    move v4, v1

    .line 114
    goto/16 :goto_2

    :cond_d
    move v0, v1

    move-object v3, v2

    move v4, v1

    .line 120
    goto/16 :goto_2

    :cond_e
    move v0, v1

    move-object v3, v2

    move v4, v1

    .line 121
    goto/16 :goto_2

    .line 196
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryVideo;->c:Z

    if-eqz v0, :cond_1

    .line 197
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->finish()V

    goto/16 :goto_1

    .line 201
    :cond_10
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryVideo;->finish()V

    goto/16 :goto_1

    :cond_11
    move v0, v1

    move-object v3, v2

    move v4, v1

    goto/16 :goto_2
.end method
