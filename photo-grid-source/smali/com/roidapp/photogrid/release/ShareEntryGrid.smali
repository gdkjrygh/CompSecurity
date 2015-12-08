.class public Lcom/roidapp/photogrid/release/ShareEntryGrid;
.super Lcom/roidapp/photogrid/release/ShareEntryBase;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 29
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ShareEntryBase;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 33
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 38
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.intent.action.SEND"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 40
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 41
    if-eqz v0, :cond_7

    const-string v4, "android.intent.extra.STREAM"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 42
    const-string v4, "android.intent.extra.STREAM"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 43
    if-nez v0, :cond_1

    .line 44
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V

    .line 183
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    const-string v4, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 48
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->a()V

    goto :goto_0

    .line 50
    :cond_2
    const-string v4, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 52
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    const-string v4, "content://media/"

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 54
    if-gez v4, :cond_3

    .line 55
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 61
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V

    goto :goto_0

    .line 58
    :cond_3
    :try_start_1
    const-string v5, "/ACTUAL"

    invoke-virtual {v0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 66
    :cond_4
    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    .line 68
    if-eqz v4, :cond_6

    .line 69
    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 71
    new-array v3, v1, [Lcom/roidapp/photogrid/release/ig;

    .line 72
    new-instance v5, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v5, v4}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    aput-object v5, v3, v2

    move-object v4, v3

    move v5, v1

    move-object v3, v0

    move v0, v1

    .line 111
    :goto_1
    if-eqz v5, :cond_d

    .line 115
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/cloudlib/a/a;->a()Z

    .line 116
    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v5

    invoke-static {p0, v5}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/cloud/w;->b()Z

    .line 120
    new-instance v5, Lcom/roidapp/photogrid/cloud/aj;

    invoke-direct {v5}, Lcom/roidapp/photogrid/cloud/aj;-><init>()V

    invoke-virtual {v5, p0}, Lcom/roidapp/photogrid/cloud/aj;->a(Landroid/content/Context;)Z

    .line 130
    invoke-static {p0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v5

    const-string v6, "other"

    const-string v7, "enableCrittercism50"

    invoke-virtual {v5, v6, v7, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 131
    invoke-static {}, Lcom/roidapp/photogrid/common/ak;->a()V

    .line 135
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 140
    array-length v5, v4

    if-ne v5, v1, :cond_c

    .line 141
    const/4 v5, 0x5

    sput v5, Lcom/roidapp/photogrid/common/az;->q:I

    .line 148
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/roidapp/photogrid/common/a;->c(Landroid/content/Context;)Z

    move-result v5

    sput-boolean v5, Lcom/roidapp/photogrid/common/az;->B:Z

    .line 150
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5}, Lcom/roidapp/photogrid/release/ih;->D()V

    .line 151
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v5

    invoke-virtual {v5, v1}, Lcom/roidapp/photogrid/release/ih;->h(Z)V

    .line 152
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 153
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 154
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 155
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->F()V

    .line 156
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const-string v3, "ShareEntryGrid"

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 157
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 158
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/16 v3, 0xf

    invoke-virtual {v1, v3}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 160
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 161
    sget-object v1, Lcom/roidapp/photogrid/b/g;->l:Lcom/roidapp/photogrid/b/g;

    invoke-static {v1}, Lcom/roidapp/photogrid/b/f;->a(Lcom/roidapp/photogrid/b/g;)V

    .line 162
    const-string v1, "EditPage_View"

    const-string v2, "SystemGallery_Edit"

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v1, "OpenPG"

    invoke-static {p0, v1}, Lcom/roidapp/photogrid/common/af;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 165
    const-string v1, "Share/Grid"

    invoke-static {v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;)V

    .line 166
    invoke-static {}, Lcom/roidapp/photogrid/common/ag;->a()Lcom/roidapp/photogrid/common/ag;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/roidapp/photogrid/common/ag;->a(Landroid/content/Context;)V

    .line 167
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FromShare/Grid/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 170
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 171
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 172
    const-string v1, "moreThan9"

    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ShareEntryGrid;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 173
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V

    .line 174
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    :cond_6
    move v0, v2

    move-object v4, v3

    move v5, v2

    .line 76
    goto/16 :goto_1

    :cond_7
    move v0, v2

    move-object v4, v3

    move v5, v2

    .line 82
    goto/16 :goto_1

    :cond_8
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    const-string v5, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    .line 84
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 85
    if-eqz v0, :cond_b

    const-string v4, "android.intent.extra.STREAM"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 86
    const-string v4, "android.intent.extra.STREAM"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 88
    if-eqz v4, :cond_a

    .line 90
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 92
    invoke-virtual {p0, v4, v0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->a(Ljava/util/ArrayList;I)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 94
    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/ShareEntryGrid;->a:Z

    if-nez v5, :cond_0

    .line 97
    if-eqz v4, :cond_9

    .line 98
    aget-object v3, v4, v2

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    aget-object v5, v4, v2

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    move v5, v1

    goto/16 :goto_1

    :cond_9
    move v5, v2

    .line 100
    goto/16 :goto_1

    :cond_a
    move v0, v2

    move-object v4, v3

    move v5, v2

    .line 106
    goto/16 :goto_1

    :cond_b
    move v0, v2

    move-object v4, v3

    move v5, v2

    .line 107
    goto/16 :goto_1

    .line 143
    :cond_c
    sput v2, Lcom/roidapp/photogrid/common/az;->q:I

    goto/16 :goto_2

    .line 176
    :cond_d
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryGrid;->c:Z

    if-eqz v0, :cond_0

    .line 177
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V

    goto/16 :goto_0

    .line 181
    :cond_e
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryGrid;->finish()V

    goto/16 :goto_0

    :cond_f
    move v0, v2

    move-object v4, v3

    move v5, v2

    goto/16 :goto_1
.end method
