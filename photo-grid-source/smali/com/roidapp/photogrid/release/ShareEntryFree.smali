.class public Lcom/roidapp/photogrid/release/ShareEntryFree;
.super Lcom/roidapp/photogrid/release/ShareEntryBase;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 35
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

    .line 38
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ShareEntryBase;->onCreate(Landroid/os/Bundle;)V

    .line 40
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 43
    if-eqz v5, :cond_10

    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 45
    const-string v0, "pgMode"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 46
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

    .line 48
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 49
    const-string v1, "shareEntry"

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    const-string v1, "mime"

    invoke-virtual {v5}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    const-string v1, "uri"

    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v5, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 52
    const/4 v1, -0x1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->setResult(ILandroid/content/Intent;)V

    .line 53
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    .line 203
    :cond_1
    :goto_0
    return-void

    .line 55
    :cond_2
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    move v1, v2

    .line 65
    :goto_1
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v6, "android.intent.action.SEND"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 67
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 68
    if-eqz v0, :cond_a

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 69
    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 70
    if-nez v0, :cond_4

    .line 71
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    goto :goto_0

    .line 58
    :cond_3
    const-string v0, "shareToSelf"

    invoke-virtual {v5, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    move v1, v0

    goto :goto_1

    .line 74
    :cond_4
    const-string v5, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 75
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->a()V

    goto :goto_0

    .line 77
    :cond_5
    const-string v5, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 79
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 80
    const-string v5, "content://media/"

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 81
    if-gez v5, :cond_6

    .line 82
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 87
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 88
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    goto :goto_0

    .line 85
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

    .line 93
    :cond_7
    if-eqz v0, :cond_1

    .line 94
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v5

    .line 95
    if-eqz v5, :cond_9

    .line 96
    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 98
    new-array v4, v2, [Lcom/roidapp/photogrid/release/ig;

    .line 99
    new-instance v6, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v6, v5}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    aput-object v6, v4, v3

    move-object v5, v4

    move v6, v2

    move-object v4, v0

    move v0, v2

    .line 138
    :goto_2
    if-eqz v6, :cond_f

    .line 141
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 142
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v6

    invoke-static {p0, v6}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 146
    new-instance v6, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v6}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 156
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v6

    const-string v7, "other"

    const-string v8, "enableCrittercism50"

    invoke-virtual {v6, v7, v8, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 157
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 161
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 165
    sput v2, Lcom/roidapp/photogrid/common/az;->q:I

    .line 168
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v6

    invoke-virtual {v6, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v6

    sput-boolean v6, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 170
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 171
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 172
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 173
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 174
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 175
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 176
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    const-string v4, "ShareEntryFree"

    invoke-virtual {v2, v4}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 177
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 179
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 180
    sget-object v2, Lcom/roidapp/photogrid/b/g;->k:Lcom/roidapp/photogrid/b/g;

    invoke-static {v2}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 181
    const-string v2, "EditPage_View"

    const-string v4, "SystemGallery_Edit"

    invoke-static {v2, v4}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    const-string v2, "OpenPG"

    invoke-static {p0, v2}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 184
    const-string v2, "Share/Free"

    invoke-static {v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 185
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "FromShare/Free/"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 188
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->C:Z

    .line 189
    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 190
    const/high16 v2, 0x4000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 191
    const-string v2, "moreThan9"

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/ShareEntryFree;->b:Z

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 192
    const-string v2, "shareToSelf"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 193
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    .line 194
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_9
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 103
    goto/16 :goto_2

    :cond_a
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 109
    goto/16 :goto_2

    :cond_b
    invoke-virtual {v5}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v6, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 111
    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 112
    if-eqz v0, :cond_e

    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 113
    const-string v5, "android.intent.extra.STREAM"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 115
    if-eqz v5, :cond_d

    .line 117
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 119
    invoke-virtual {p0, v5, v0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->a(Ljava/util/ArrayList;I)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v5

    .line 121
    iget-boolean v6, p0, Lcom/roidapp/photogrid/release/ShareEntryFree;->a:Z

    if-nez v6, :cond_1

    .line 124
    if-eqz v5, :cond_c

    .line 125
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

    .line 127
    goto/16 :goto_2

    :cond_d
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 133
    goto/16 :goto_2

    :cond_e
    move v0, v3

    move-object v5, v4

    move v6, v3

    .line 134
    goto/16 :goto_2

    .line 196
    :cond_f
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryFree;->c:Z

    if-eqz v0, :cond_1

    .line 197
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    goto/16 :goto_0

    .line 201
    :cond_10
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryFree;->finish()V

    goto/16 :goto_0

    :cond_11
    move v0, v3

    move-object v5, v4

    move v6, v3

    goto/16 :goto_2
.end method
