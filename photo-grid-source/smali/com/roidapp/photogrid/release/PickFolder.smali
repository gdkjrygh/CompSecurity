.class public Lcom/roidapp/photogrid/release/PickFolder;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# instance fields
.field a:Ljava/util/Comparator;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/RelativeLayout;

.field private f:Landroid/widget/RelativeLayout;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:Lcom/roidapp/photogrid/common/al;

.field private j:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/release/pt;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/pt;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->j:Landroid/os/Handler;

    .line 248
    new-instance v0, Lcom/roidapp/photogrid/release/py;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/py;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->a:Ljava/util/Comparator;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PickFolder;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->i:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 196
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 197
    const/4 v0, 0x0

    .line 199
    add-int/lit8 v1, v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 203
    :goto_0
    return-object v0

    .line 201
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private a()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 175
    :try_start_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 191
    :goto_0
    return v0

    .line 178
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/PickFolder;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    .line 179
    iget-object v2, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/PickFolder;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    .line 180
    goto :goto_0

    .line 182
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    .line 183
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mounted"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 184
    const v2, 0x7f07028d

    invoke-static {p0, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_1
    :goto_1
    move v0, v1

    .line 191
    goto :goto_0

    .line 186
    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 187
    if-eqz v0, :cond_1

    .line 188
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/PickFolder;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/PickFolder;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 207
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 208
    const/4 v0, 0x0

    .line 210
    if-nez v1, :cond_0

    .line 211
    :try_start_0
    const-string v0, "/"

    .line 218
    :goto_0
    return-object v0

    .line 213
    :cond_0
    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 216
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/PickFolder;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/PickFolder;->d(Ljava/lang/String;)V

    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 222
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 223
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 224
    const v1, 0x7f07028d

    const/4 v2, 0x1

    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 244
    :goto_0
    return-object v0

    .line 227
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 228
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 229
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 230
    if-eqz v2, :cond_2

    .line 231
    array-length v3, v2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v4, v2, v1

    .line 232
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 233
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/photogrid/release/PickFolder;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 234
    if-eqz v4, :cond_1

    .line 235
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 242
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/PickFolder;->a:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/PickFolder;)Z
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PickFolder;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/PickFolder;)Landroid/widget/ArrayAdapter;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->c:Landroid/widget/ArrayAdapter;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->d:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 273
    iput-object p1, p0, Lcom/roidapp/photogrid/release/PickFolder;->g:Ljava/lang/String;

    .line 274
    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x7f0300a2

    const v2, 0x7f0d027b

    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/PickFolder;->c(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;IILjava/util/List;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->c:Landroid/widget/ArrayAdapter;

    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PickFolder;->c:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->b:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/pz;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/pz;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 289
    return-void
.end method

.method private e(Ljava/lang/String;)Z
    .locals 11

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 293
    .line 3324
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3325
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v3, "mounted"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3326
    const v0, 0x7f07028d

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 293
    :cond_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 296
    :try_start_0
    invoke-static {p0}, Lcom/roidapp/photogrid/common/m;->a(Landroid/content/Context;)Lorg/json/JSONArray;

    move-result-object v3

    .line 297
    const-string v0, "data"

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 298
    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_7

    .line 299
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "folder"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 301
    const v0, 0x7f070168

    const/4 v3, 0x0

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 318
    :goto_1
    return v2

    .line 3330
    :cond_1
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v0, v1

    .line 3333
    :goto_2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 3334
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3335
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 3336
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    .line 3337
    if-eqz v6, :cond_5

    .line 3338
    array-length v7, v6

    move v3, v2

    :goto_3
    if-ge v3, v7, :cond_5

    aget-object v8, v6, v3

    .line 3339
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    .line 3340
    const-string v10, ".png"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".jpg"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".gif"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".bmp"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".jpeg"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, ".mpo"

    invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-static {v9}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 3347
    :cond_2
    if-eqz v0, :cond_4

    .line 3349
    invoke-static {v8}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/io/File;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 3350
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3338
    :cond_3
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 3353
    :cond_4
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 3359
    :cond_5
    new-instance v0, Lcom/roidapp/photogrid/release/qa;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/qa;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-static {v5, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 3374
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 3375
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 298
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    .line 306
    :cond_7
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 307
    const-string v2, "folder"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 308
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "#"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 310
    invoke-static {p0, v0}, Lcom/roidapp/photogrid/common/m;->a(Landroid/content/Context;Ljava/lang/String;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_6
    move v2, v1

    .line 315
    goto/16 :goto_1

    .line 313
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_6

    .line 317
    :cond_8
    const v0, 0x7f07016c

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_1

    :cond_9
    move v0, v2

    goto/16 :goto_2
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 55
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 58
    const v0, 0x7f0300f9

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->v:Z

    if-nez v0, :cond_1

    .line 65
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->h:I

    .line 1098
    const v0, 0x7f0d002a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 1099
    new-instance v1, Lcom/roidapp/photogrid/release/pu;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/pu;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1114
    const v0, 0x7f0d03f0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 1115
    new-instance v1, Lcom/roidapp/photogrid/release/pv;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/pv;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1129
    const v0, 0x7f0d03f1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->e:Landroid/widget/RelativeLayout;

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->e:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/pw;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/pw;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1147
    const v0, 0x7f0d03f3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->f:Landroid/widget/RelativeLayout;

    .line 1148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->f:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/px;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/px;-><init>(Lcom/roidapp/photogrid/release/PickFolder;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1155
    const v0, 0x7f0d03f2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->d:Landroid/widget/TextView;

    .line 1156
    const v0, 0x7f0d028f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->b:Landroid/widget/ListView;

    .line 1157
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1158
    const v0, 0x7f07028d

    invoke-static {p0, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 3072
    :cond_0
    :goto_1
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/PickFolder;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3073
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2078
    if-eqz v0, :cond_1

    .line 2079
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/PickFolder;->j:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->i:Lcom/roidapp/photogrid/common/al;

    .line 2080
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->i:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 2081
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    .line 69
    :cond_1
    return-void

    .line 60
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 61
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/PickFolder;->v:Z

    .line 62
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 1160
    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 1161
    if-eqz v0, :cond_0

    .line 1162
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/PickFolder;->d(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->i:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->i:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->c()V

    .line 264
    :cond_0
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 265
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 268
    :cond_1
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 269
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    .line 382
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 383
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/PickFolder;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 385
    iget-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 390
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 391
    const-string v1, "added"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 392
    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/PickFolder;->setResult(ILandroid/content/Intent;)V

    .line 393
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/PickFolder;->finish()V

    .line 395
    :cond_1
    const/4 v0, 0x1

    .line 397
    :goto_0
    return v0

    :cond_2
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 257
    const-string v0, "Pickfolder"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 258
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 259
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 169
    const-string v0, "pick_folder"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/PickFolder;->t:Ljava/lang/String;

    .line 170
    return-void
.end method
