.class public Lcom/roidapp/photogrid/release/ShareEntryBase;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"


# instance fields
.field protected a:Z

.field protected b:Z

.field protected c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 20
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 21
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->a:Z

    .line 22
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->b:Z

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->c:Z

    return-void
.end method


# virtual methods
.method protected final a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v6, 0x0

    .line 131
    const-string v7, ""

    .line 132
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file:///"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 183
    :cond_0
    :goto_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 184
    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ".jpg"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ".gif"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ".bmp"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ".jpeg"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ".mpo"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 193
    :cond_1
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 200
    :goto_1
    return-object v0

    .line 135
    :cond_2
    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "_data"

    aput-object v1, v2, v0

    .line 138
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 148
    if-eqz v1, :cond_8

    .line 149
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-nez v0, :cond_4

    .line 150
    if-eqz v1, :cond_3

    .line 151
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    move-object v0, v6

    .line 153
    goto :goto_1

    .line 140
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v6

    .line 144
    goto :goto_1

    .line 158
    :cond_4
    :try_start_1
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 166
    const/4 v2, -0x1

    if-ne v0, v2, :cond_7

    .line 167
    if-eqz v1, :cond_5

    .line 168
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_5
    move-object v0, v6

    .line 170
    goto :goto_1

    .line 160
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 161
    if-eqz v1, :cond_6

    .line 162
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_6
    move-object v0, v6

    .line 164
    goto :goto_1

    .line 172
    :cond_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 173
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 174
    if-nez v0, :cond_9

    move-object v0, v6

    .line 175
    goto :goto_1

    :cond_8
    move-object v0, v7

    .line 179
    :cond_9
    if-eqz v1, :cond_0

    .line 180
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    :cond_a
    move-object v0, v6

    .line 196
    goto :goto_1

    :cond_b
    move-object v0, v6

    .line 200
    goto :goto_1
.end method

.method protected final a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 207
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 208
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0702e7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 209
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070181

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 210
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 211
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07024f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/qv;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/qv;-><init>(Lcom/roidapp/photogrid/release/ShareEntryBase;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 219
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 220
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 221
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 222
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 223
    return-void
.end method

.method protected final a(Ljava/util/ArrayList;I)[Lcom/roidapp/photogrid/release/ig;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;I)[",
            "Lcom/roidapp/photogrid/release/ig;"
        }
    .end annotation

    .prologue
    const/4 v12, 0x1

    const/4 v10, 0x0

    const/4 v8, 0x0

    .line 32
    .line 33
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move v9, v10

    move-object v7, v8

    .line 34
    :goto_0
    if-ge v9, p2, :cond_a

    .line 35
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 36
    if-eqz v0, :cond_7

    .line 37
    const-string v6, ""

    .line 38
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "file:///"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 39
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v7

    .line 87
    :goto_1
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 88
    const-string v3, ".png"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".gif"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".bmp"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".jpeg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, ".mpo"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 96
    :cond_0
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 97
    new-instance v2, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 98
    invoke-interface {v11, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0xf

    if-ne v0, v2, :cond_5

    .line 100
    add-int/lit8 v0, v9, 0x1

    if-ge v0, p2, :cond_1

    .line 101
    iput-boolean v12, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->b:Z

    .line 112
    :cond_1
    :goto_2
    if-eqz v1, :cond_2

    .line 113
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 116
    :cond_2
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 117
    new-array v0, v10, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v11, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    :goto_3
    move-object v8, v0

    .line 119
    :goto_4
    return-object v8

    .line 41
    :cond_3
    const-string v1, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 42
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->c:Z

    .line 43
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->a()V

    goto :goto_4

    .line 45
    :cond_4
    const-string v1, "com.google.android.apps.photos.contentprovider"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 47
    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 48
    const-string v1, "content://media/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 49
    if-gez v1, :cond_6

    move-object v1, v7

    .line 34
    :cond_5
    :goto_5
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    move-object v7, v1

    goto/16 :goto_0

    .line 52
    :cond_6
    const-string v2, "/ACTUAL"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 58
    :goto_6
    new-array v2, v12, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v2, v10

    .line 60
    :try_start_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ShareEntryBase;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 66
    if-eqz v1, :cond_b

    .line 67
    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-eqz v0, :cond_5

    .line 72
    :try_start_2
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    .line 77
    const/4 v2, -0x1

    if-eq v0, v2, :cond_b

    .line 78
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 79
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 80
    if-eqz v0, :cond_5

    goto/16 :goto_1

    .line 54
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v7

    .line 55
    goto :goto_5

    .line 62
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v1, v7

    .line 63
    goto :goto_5

    .line 74
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_5

    .line 108
    :cond_7
    iput-boolean v12, p0, Lcom/roidapp/photogrid/release/ShareEntryBase;->a:Z

    move-object v1, v7

    goto :goto_5

    :cond_8
    move-object v0, v8

    goto/16 :goto_3

    :cond_9
    move-object v1, v0

    goto :goto_6

    :cond_a
    move-object v1, v7

    goto/16 :goto_2

    :cond_b
    move-object v0, v6

    goto/16 :goto_1
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 227
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStart()V

    .line 228
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->b(Landroid/content/Context;)V

    .line 229
    return-void
.end method

.method protected onStop()V
    .locals 0

    .prologue
    .line 233
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onStop()V

    .line 234
    invoke-static {p0}, Lcom/roidapp/baselib/c/b;->c(Landroid/content/Context;)V

    .line 235
    return-void
.end method
