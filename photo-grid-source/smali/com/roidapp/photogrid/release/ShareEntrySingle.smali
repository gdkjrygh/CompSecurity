.class public Lcom/roidapp/photogrid/release/ShareEntrySingle;
.super Lcom/roidapp/photogrid/release/ShareEntryBase;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 32
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ShareEntryBase;->onCreate(Landroid/os/Bundle;)V

    .line 34
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 37
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 39
    const-string v0, "pgMode"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 40
    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 42
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 43
    const-string v1, "shareEntry"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    const-string v1, "mime"

    invoke-virtual {v5}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    const-string v1, "uri"

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v5, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 46
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->setResult(ILandroid/content/Intent;)V

    .line 47
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    .line 218
    :cond_1
    :goto_0
    return-void

    .line 49
    :cond_2
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v1, v2

    .line 59
    :goto_1
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v6, "android.intent.action.SEND"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 61
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 62
    if-eqz v0, :cond_a

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 63
    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 64
    if-nez v0, :cond_4

    .line 65
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    goto :goto_0

    .line 52
    :cond_3
    const-string v0, "shareToSelf"

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    move v1, v0

    goto :goto_1

    .line 68
    :cond_4
    const-string v5, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 69
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->a()V

    goto :goto_0

    .line 71
    :cond_5
    const-string v5, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 73
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 74
    const-string v5, "content://media/"

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 75
    if-gez v5, :cond_6

    .line 76
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 82
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    goto :goto_0

    .line 79
    :cond_6
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

    .line 87
    :cond_7
    if-eqz v0, :cond_1

    .line 88
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 89
    if-eqz v5, :cond_9

    .line 90
    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 92
    new-array v4, v2, [Lcom/roidapp/photogrid/release/ig;

    .line 93
    new-instance v6, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v6, v5}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    aput-object v6, v4, v3

    move-object v5, v4

    move v6, v2

    move-object v4, v0

    move v0, v2

    .line 132
    :goto_2
    if-eqz v6, :cond_10

    .line 137
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 138
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v6

    invoke-static {p0, v6}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 142
    new-instance v6, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v6}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 152
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    const-string v7, "other"

    const-string v8, "enableCrittercism50"

    invoke-virtual {v6, v7, v8, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 153
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 157
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 162
    array-length v6, v5

    if-ne v6, v2, :cond_f

    .line 163
    const/4 v6, 0x5

    sput v6, Lcom/roidapp/photogrid/common/az;->q:I

    .line 170
    :goto_3
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v6

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v6

    sput-boolean v6, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 172
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 173
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 174
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 175
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 176
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 177
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 179
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    const-string v5, "ShareEntrySingle"

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 180
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 181
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    const/16 v5, 0xf

    invoke-virtual {v4, v5}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 183
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 184
    sget-object v4, Lcom/roidapp/photogrid/b/g;->j:Lcom/roidapp/photogrid/b/g;

    invoke-static {v4}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 185
    const-string v4, "EditPage_View"

    const-string v5, "SystemGallery_Edit"

    invoke-static {v4, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v4, "OpenPG"

    invoke-static {p0, v4}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 188
    const-string v4, "Share/Single"

    invoke-static {v4}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 189
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 190
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "FromShare/Single/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 193
    const-string v0, "state_single"

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "single_mode"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 198
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 205
    const/high16 v2, 0x4000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 206
    const-string v2, "moreThan9"

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ShareEntrySingle;->b:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 207
    const-string v2, "shareToSelf"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 208
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    .line 209
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_9
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 97
    goto/16 :goto_2

    :cond_a
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 103
    goto/16 :goto_2

    :cond_b
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v6, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 105
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 106
    if-eqz v0, :cond_e

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 107
    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 109
    if-eqz v5, :cond_d

    .line 111
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 113
    invoke-virtual {p0, v5, v0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->a(Ljava/util/ArrayList;I)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v5

    .line 115
    iget-boolean v6, p0, Lcom/roidapp/photogrid/release/ShareEntrySingle;->a:Z

    if-nez v6, :cond_1

    .line 118
    if-eqz v5, :cond_c

    .line 119
    aget-object v4, v5, v3

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    aget-object v6, v5, v3

    iget-object v6, v6, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    move v6, v2

    goto/16 :goto_2

    :cond_c
    move v6, v3

    .line 121
    goto/16 :goto_2

    :cond_d
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 127
    goto/16 :goto_2

    :cond_e
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 128
    goto/16 :goto_2

    .line 165
    :cond_f
    sput v3, Lcom/roidapp/photogrid/common/az;->q:I

    goto/16 :goto_3

    .line 211
    :cond_10
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntrySingle;->c:Z

    if-eqz v0, :cond_1

    .line 212
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    goto/16 :goto_0

    .line 216
    :cond_11
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntrySingle;->finish()V

    goto/16 :goto_0

    :cond_12
    move v0, v3

    move-object v5, v4

    move v6, v3

    goto/16 :goto_2
.end method
