.class public Lcom/scannerfire/fragment/FragmentProva;
.super Lcom/actionbarsherlock/app/SherlockFragment;
.source "FragmentProva.java"


# static fields
.field public static adapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private SELECT_PICTURE:I

.field lv:Landroid/widget/ListView;

.field vib:Landroid/os/Vibrator;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragment;-><init>()V

    .line 48
    const/4 v0, 0x0

    iput v0, p0, Lcom/scannerfire/fragment/FragmentProva;->SELECT_PICTURE:I

    .line 43
    return-void
.end method

.method static synthetic access$0(Lcom/scannerfire/fragment/FragmentProva;)V
    .locals 0

    .prologue
    .line 141
    invoke-direct {p0}, Lcom/scannerfire/fragment/FragmentProva;->callGallery()V

    return-void
.end method

.method private callGallery()V
    .locals 4

    .prologue
    .line 142
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 143
    .local v1, "intent":Landroid/content/Intent;
    const-string v2, "image/*"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 144
    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 146
    :try_start_0
    const-string v2, "Select Picture"

    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v2

    iget v3, p0, Lcom/scannerfire/fragment/FragmentProva;->SELECT_PICTURE:I

    invoke-virtual {p0, v2, v3}, Lcom/scannerfire/fragment/FragmentProva;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    return-void

    .line 147
    :catch_0
    move-exception v0

    .line 148
    .local v0, "e":Landroid/content/ActivityNotFoundException;
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    const v3, 0x7f080157

    invoke-virtual {p0, v3}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private inizialite(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 111
    .local p1, "fillMaps":Ljava/util/List;, "Ljava/util/List<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 113
    .local v0, "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v1, "title"

    const v2, 0x7f0800d9

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    const-string v1, "description"

    const v2, 0x7f0800da

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    const-string v1, "image"

    const v2, 0x7f020109

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    new-instance v0, Ljava/util/HashMap;

    .end local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 120
    .restart local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v1, "title"

    const v2, 0x7f0800db

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    const-string v1, "description"

    const v2, 0x7f0800dc

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    const-string v1, "image"

    const v2, 0x7f0200ed

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    new-instance v0, Ljava/util/HashMap;

    .end local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 127
    .restart local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v1, "title"

    const v2, 0x7f0800dd

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const-string v1, "description"

    const v2, 0x7f0800de

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    const-string v1, "image"

    const v2, 0x7f0200c2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    new-instance v0, Ljava/util/HashMap;

    .end local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 134
    .restart local v0    # "map":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
    const-string v1, "title"

    const v2, 0x7f0800df

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    const-string v1, "description"

    const v2, 0x7f0800e0

    invoke-virtual {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    const-string v1, "image"

    const v2, 0x7f0200bd

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 13
    .param p1, "requestCode"    # I
    .param p2, "resultCode"    # I
    .param p3, "data"    # Landroid/content/Intent;

    .prologue
    .line 154
    iget v10, p0, Lcom/scannerfire/fragment/FragmentProva;->SELECT_PICTURE:I

    if-ne p1, v10, :cond_1

    const/4 v10, -0x1

    if-ne p2, v10, :cond_1

    .line 156
    :try_start_0
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v10

    .line 157
    invoke-virtual/range {p3 .. p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v11

    .line 156
    invoke-virtual {v10, v11}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v9

    .line 158
    .local v9, "stream":Ljava/io/InputStream;
    const-string v10, ""

    const-string v11, "check1"

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    invoke-static {v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 160
    .local v2, "bitmap":Landroid/graphics/Bitmap;
    invoke-virtual {v9}, Ljava/io/InputStream;->close()V

    .line 161
    if-nez v2, :cond_0

    .line 162
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    const-string v11, "Error: bitmap null"

    invoke-static {v10, v11}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 223
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v9    # "stream":Ljava/io/InputStream;
    :goto_0
    return-void

    .line 166
    .restart local v2    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v9    # "stream":Ljava/io/InputStream;
    :cond_0
    invoke-static {v2}, Lcom/scannerfire/utils/Utils;->decodeBitmap(Landroid/graphics/Bitmap;)Lcom/google/zxing/Result;

    move-result-object v7

    .line 167
    .local v7, "result":Lcom/google/zxing/Result;
    if-nez v7, :cond_2

    .line 169
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    const-string v11, "No barcode found"

    invoke-static {v10, v11}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    .line 214
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v7    # "result":Lcom/google/zxing/Result;
    .end local v9    # "stream":Ljava/io/InputStream;
    :catch_0
    move-exception v4

    .line 215
    .local v4, "e":Ljava/io/FileNotFoundException;
    invoke-virtual {v4}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 222
    .end local v4    # "e":Ljava/io/FileNotFoundException;
    :cond_1
    :goto_1
    invoke-super/range {p0 .. p3}, Lcom/actionbarsherlock/app/SherlockFragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 174
    .restart local v2    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v7    # "result":Lcom/google/zxing/Result;
    .restart local v9    # "stream":Ljava/io/InputStream;
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-virtual {v10}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/scannerfire/utils/Utils;->getAutomaticRedPref(Landroid/content/Context;)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 176
    invoke-static {v7}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v6

    .line 177
    .local v6, "pr":Lcom/google/zxing/client/result/ParsedResult;
    invoke-virtual {v7}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "QR_CODE"

    if-ne v10, v11, :cond_5

    invoke-virtual {v6}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "URI"

    if-ne v10, v11, :cond_5

    .line 179
    invoke-virtual {v7}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v8

    .line 180
    .local v8, "s":Ljava/lang/String;
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 181
    const-string v10, "market://details?id="

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "http://"

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "http://"

    invoke-virtual {v8, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 183
    :cond_3
    :goto_2
    const-string v10, ""

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "THE URL IS: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-static {v10, v7}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V

    .line 185
    new-instance v10, Landroid/content/Intent;

    const-string v11, "android.intent.action.VIEW"

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v10}, Lcom/scannerfire/fragment/FragmentProva;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_0

    .line 216
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v6    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v7    # "result":Lcom/google/zxing/Result;
    .end local v8    # "s":Ljava/lang/String;
    .end local v9    # "stream":Ljava/io/InputStream;
    :catch_1
    move-exception v4

    .line 217
    .local v4, "e":Ljava/io/IOException;
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 182
    .end local v4    # "e":Ljava/io/IOException;
    .restart local v2    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v6    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .restart local v7    # "result":Lcom/google/zxing/Result;
    .restart local v8    # "s":Ljava/lang/String;
    .restart local v9    # "stream":Ljava/io/InputStream;
    :cond_4
    :try_start_2
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "http://"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    .line 189
    .end local v8    # "s":Ljava/lang/String;
    :cond_5
    invoke-virtual {v6}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "PRODUCT"

    if-ne v10, v11, :cond_6

    .line 190
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "http://www.google.com/m/products?q="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 191
    .restart local v8    # "s":Ljava/lang/String;
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-static {v10, v7}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V

    .line 192
    new-instance v10, Landroid/content/Intent;

    const-string v11, "android.intent.action.VIEW"

    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    invoke-direct {v10, v11, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v10}, Lcom/scannerfire/fragment/FragmentProva;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 219
    .end local v2    # "bitmap":Landroid/graphics/Bitmap;
    .end local v6    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v7    # "result":Lcom/google/zxing/Result;
    .end local v8    # "s":Ljava/lang/String;
    .end local v9    # "stream":Ljava/io/InputStream;
    :catch_2
    move-exception v4

    .line 220
    .local v4, "e":Ljava/lang/OutOfMemoryError;
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    const-string v11, "Image is too big to decode"

    invoke-static {v10, v11}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 201
    .end local v4    # "e":Ljava/lang/OutOfMemoryError;
    .restart local v2    # "bitmap":Landroid/graphics/Bitmap;
    .restart local v7    # "result":Lcom/google/zxing/Result;
    .restart local v9    # "stream":Ljava/io/InputStream;
    :cond_6
    :try_start_3
    new-instance v5, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    const-class v11, Lcom/QRBS/activity/MyResultActivity;

    invoke-direct {v5, v10, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 202
    .local v5, "i":Landroid/content/Intent;
    invoke-static {v7}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v0

    .line 203
    .local v0, "b":Landroid/os/Bundle;
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 204
    .local v1, "baos":Ljava/io/ByteArrayOutputStream;
    sget-object v10, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v11, 0x64

    invoke-virtual {v2, v10, v11, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 205
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    .line 206
    .local v3, "bytetopass":[B
    const-string v10, "picture"

    invoke-virtual {v5, v10, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 207
    invoke-virtual {v5, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 208
    const-string v10, ""

    const-string v11, "INIZIO SALVATAGGIO"

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v10

    invoke-static {v10, v7}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V

    .line 211
    const-string v10, ""

    const-string v11, "FINE SALVATAGGIO"

    invoke-static {v10, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    invoke-virtual {p0, v5}, Lcom/scannerfire/fragment/FragmentProva;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_2

    goto/16 :goto_1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 52
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreate(Landroid/os/Bundle;)V

    .line 53
    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "vibrator"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/scannerfire/fragment/FragmentProva;->vib:Landroid/os/Vibrator;

    .line 54
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/scannerfire/fragment/FragmentProva;->setHasOptionsMenu(Z)V

    .line 57
    return-void
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
    .locals 0
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
    .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;

    .prologue
    .line 227
    invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V

    .line 229
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v7, 0x3

    const/4 v3, 0x0

    .line 63
    const v1, 0x7f030031

    invoke-virtual {p1, v1, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v6

    .line 64
    .local v6, "rootView":Landroid/view/View;
    const v1, 0x7f0d00a3

    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    iput-object v1, p0, Lcom/scannerfire/fragment/FragmentProva;->lv:Landroid/widget/ListView;

    .line 66
    new-array v4, v7, [Ljava/lang/String;

    const-string v1, "title"

    aput-object v1, v4, v3

    const/4 v1, 0x1

    const-string v3, "description"

    aput-object v3, v4, v1

    const/4 v1, 0x2

    const-string v3, "image"

    aput-object v3, v4, v1

    .line 67
    .local v4, "from":[Ljava/lang/String;
    new-array v5, v7, [I

    fill-array-data v5, :array_0

    .line 70
    .local v5, "to":[I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .local v2, "fillMaps":Ljava/util/List;, "Ljava/util/List<Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    invoke-direct {p0, v2}, Lcom/scannerfire/fragment/FragmentProva;->inizialite(Ljava/util/List;)V

    .line 73
    new-instance v0, Landroid/widget/SimpleAdapter;

    invoke-virtual {p0}, Lcom/scannerfire/fragment/FragmentProva;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v3, 0x7f030032

    invoke-direct/range {v0 .. v5}, Landroid/widget/SimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V

    .line 74
    .local v0, "adapter":Landroid/widget/SimpleAdapter;
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentProva;->lv:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 75
    iget-object v1, p0, Lcom/scannerfire/fragment/FragmentProva;->lv:Landroid/widget/ListView;

    new-instance v3, Lcom/scannerfire/fragment/FragmentProva$1;

    invoke-direct {v3, p0}, Lcom/scannerfire/fragment/FragmentProva$1;-><init>(Lcom/scannerfire/fragment/FragmentProva;)V

    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 107
    return-object v6

    .line 67
    nop

    :array_0
    .array-data 4
        0x7f0d00a5
        0x7f0d00a6
        0x7f0d00a4
    .end array-data
.end method
