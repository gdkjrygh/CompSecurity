.class public Lcom/roidapp/photogrid/release/ShareEntryFilter;
.super Lcom/roidapp/photogrid/release/ShareEntryBase;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v4, 0x0

    const/high16 v9, 0x4000000

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 31
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ShareEntryBase;->onCreate(Landroid/os/Bundle;)V

    .line 32
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 34
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 35
    invoke-virtual {v0, v9}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 36
    const-string v1, "isFilterFromShareGallery"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 37
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    .line 38
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->startActivity(Landroid/content/Intent;)V

    .line 222
    :cond_0
    :goto_0
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 44
    if-eqz v5, :cond_a

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 46
    const-string v0, "pgMode"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 47
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 49
    :cond_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 50
    const-string v1, "shareEntry"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    const-string v1, "mime"

    invoke-virtual {v5}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    const-string v1, "uri"

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v5, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 53
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->setResult(ILandroid/content/Intent;)V

    .line 54
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    goto :goto_0

    .line 56
    :cond_3
    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    .line 66
    :goto_1
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v6, "android.intent.action.SEND"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 68
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 69
    if-eqz v0, :cond_c

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 70
    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 71
    if-nez v0, :cond_5

    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    goto/16 :goto_0

    .line 59
    :cond_4
    const-string v0, "shareToSelf"

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    move v1, v0

    goto :goto_1

    .line 75
    :cond_5
    const-string v5, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 76
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->a()V

    goto/16 :goto_0

    .line 78
    :cond_6
    const-string v5, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 80
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 81
    const-string v5, "content://media/"

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 82
    if-gez v5, :cond_7

    .line 83
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 88
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 89
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    goto/16 :goto_0

    .line 86
    :cond_7
    :try_start_1
    const-string v6, "/ACTUAL"

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 94
    :cond_8
    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 96
    if-eqz v5, :cond_b

    .line 97
    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 99
    new-array v4, v2, [Lcom/roidapp/photogrid/release/ig;

    .line 100
    new-instance v6, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v6, v5}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    aput-object v6, v4, v3

    move-object v5, v4

    move v6, v2

    move-object v4, v0

    move v0, v2

    .line 140
    :goto_2
    if-eqz v6, :cond_10

    .line 145
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 146
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v6

    invoke-static {p0, v6}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 150
    new-instance v6, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v6}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 160
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    const-string v7, "other"

    const-string v8, "enableCrittercism50"

    invoke-virtual {v6, v7, v8, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 161
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 165
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 170
    array-length v6, v5

    if-ne v6, v2, :cond_d

    .line 171
    const/4 v6, 0x5

    sput v6, Lcom/roidapp/photogrid/common/az;->q:I

    .line 178
    :goto_3
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v6

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v6

    sput-boolean v6, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 180
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 181
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 182
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 183
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 184
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 185
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 187
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    const-string v5, "ShareEntryFilter"

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 189
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    const/16 v5, 0xf

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 191
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 192
    sget-object v4, Lcom/roidapp/photogrid/b/g;->m:Lcom/roidapp/photogrid/b/g;

    invoke-static {v4}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 193
    const-string v4, "FilterPage_View"

    const-string v5, "_Filter"

    invoke-static {v4, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    const-string v4, "OpenPG"

    invoke-static {p0, v4}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 197
    const-string v4, "Share/Filter"

    invoke-static {v4}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 198
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 199
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FromShareEntryFilter/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 202
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 203
    const-string v0, "edit_image_index"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 204
    const-string v0, "entry_type"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 205
    const-string v0, "edit_suppot_filter"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 206
    invoke-virtual {v4, v9}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 207
    const-string v0, "shareToSelf"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 208
    if-eqz v1, :cond_f

    .line 209
    const-string v1, "entry_from"

    invoke-static {}, Lcom/roidapp/baselib/c/n;->a()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x2

    :goto_4
    invoke-virtual {v4, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 212
    :goto_5
    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->startActivity(Landroid/content/Intent;)V

    .line 220
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    goto/16 :goto_0

    :cond_b
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 104
    goto/16 :goto_2

    :cond_c
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 108
    goto/16 :goto_2

    .line 173
    :cond_d
    sput v3, Lcom/roidapp/photogrid/common/az;->q:I

    goto/16 :goto_3

    .line 209
    :cond_e
    const/4 v0, 0x3

    goto :goto_4

    .line 211
    :cond_f
    const-string v0, "entry_from"

    const/4 v1, 0x4

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_5

    .line 215
    :cond_10
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryFilter;->c:Z

    if-eqz v0, :cond_0

    .line 216
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFilter;->finish()V

    goto/16 :goto_0

    :cond_11
    move v0, v3

    move-object v5, v4

    move v6, v3

    goto/16 :goto_2
.end method
