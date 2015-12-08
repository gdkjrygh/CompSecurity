.class public final Lcom/roidapp/photogrid/release/bj;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public a:Landroid/widget/ListView;

.field private b:Landroid/content/Context;

.field private c:[Ljava/lang/String;

.field private d:[Ljava/lang/String;

.field private e:[Ljava/lang/Integer;

.field private f:Z

.field private g:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;"
        }
    .end annotation
.end field

.field private h:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Landroid/widget/ListView;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Integer;",
            "[",
            "Ljava/lang/String;",
            "Landroid/widget/ListView;",
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;>;)V"
        }
    .end annotation

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 130
    new-instance v0, Lcom/roidapp/photogrid/release/bk;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/bk;-><init>(Lcom/roidapp/photogrid/release/bj;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/bj;->h:Landroid/os/Handler;

    .line 49
    iput-object p1, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    .line 51
    iput-object p4, p0, Lcom/roidapp/photogrid/release/bj;->d:[Ljava/lang/String;

    .line 52
    iput-object p3, p0, Lcom/roidapp/photogrid/release/bj;->e:[Ljava/lang/Integer;

    .line 53
    iput-object p5, p0, Lcom/roidapp/photogrid/release/bj;->a:Landroid/widget/ListView;

    .line 54
    iput-object p6, p0, Lcom/roidapp/photogrid/release/bj;->g:Ljava/util/HashMap;

    .line 55
    return-void
.end method

.method public static a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 201
    .line 203
    :try_start_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 204
    const/16 v2, 0x64

    iput v2, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 205
    const/4 v2, 0x1

    iput-boolean v2, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 207
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v2

    .line 208
    const/4 v3, 0x0

    :try_start_1
    iput-boolean v3, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 209
    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 210
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 212
    if-le v3, v5, :cond_1

    .line 213
    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    div-int/lit8 v3, v3, 0x14

    .line 218
    :goto_0
    rem-int/lit8 v5, v3, 0xa

    if-eqz v5, :cond_0

    .line 219
    add-int/lit8 v3, v3, 0xa

    .line 220
    :cond_0
    div-int/lit8 v3, v3, 0xa

    .line 221
    if-gtz v3, :cond_4

    .line 223
    :goto_1
    iput v1, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 224
    invoke-static {p0, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 225
    invoke-static {v2, p0}, Lcom/roidapp/photogrid/common/bb;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 239
    :goto_2
    return-object v0

    .line 215
    :cond_1
    iget v3, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/lit8 v3, v3, 0x14
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_0

    .line 226
    :catch_0
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    .line 227
    :goto_3
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_3

    .line 228
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 231
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 232
    :catch_1
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    .line 233
    :goto_5
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_2

    .line 234
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 237
    :goto_6
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_2

    .line 232
    :catch_2
    move-exception v1

    move-object v6, v1

    move-object v1, v2

    move-object v2, v6

    goto :goto_5

    .line 226
    :catch_3
    move-exception v1

    move-object v6, v1

    move-object v1, v2

    move-object v2, v6

    goto :goto_3

    :cond_2
    move-object v0, v1

    goto :goto_6

    :cond_3
    move-object v0, v1

    goto :goto_4

    :cond_4
    move v1, v3

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/bj;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/bj;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/bj;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/bj;->f:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/bj;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->g:Ljava/util/HashMap;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 173
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    const v1, 0x7f07028d

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 198
    :goto_0
    return-void

    .line 177
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/release/bl;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/release/bl;-><init>(Lcom/roidapp/photogrid/release/bj;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/bl;->start()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/bj;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->h:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/bj;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 75
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    .line 80
    if-nez p2, :cond_0

    .line 81
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300d6

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 85
    :cond_0
    const v0, 0x7f0d0384

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 86
    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, p1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 88
    const v1, 0x7f0d0386

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 89
    const v2, 0x7f0d0387

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 90
    const v3, 0x7f0d0029

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 91
    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    iget-object v3, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v4, v4

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, p1

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    .line 1158
    iget-object v3, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    aget-object v0, v3, v0

    .line 1159
    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1160
    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 1161
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 93
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 94
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    .line 1165
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1166
    const-string v3, "("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1167
    iget-object v3, p0, Lcom/roidapp/photogrid/release/bj;->e:[Ljava/lang/Integer;

    aget-object v0, v3, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1168
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1169
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    const v0, 0x7f0d0385

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 97
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 98
    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->d:[Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/bj;->c:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    sub-int/2addr v2, p1

    aget-object v1, v1, v2

    .line 99
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 101
    const v2, 0x7f020225

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/bj;->f:Z

    if-nez v0, :cond_1

    .line 106
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/bj;->b(Ljava/lang/String;)V

    .line 108
    :cond_1
    return-object p2

    .line 103
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 244
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d0029

    if-ne v0, v1, :cond_0

    .line 245
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    const v2, 0x7f070169

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    const v2, 0x7f07016b

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/bn;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/release/bn;-><init>(Lcom/roidapp/photogrid/release/bj;Landroid/view/View;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    const v2, 0x7f07016a

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/bm;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/bm;-><init>(Lcom/roidapp/photogrid/release/bj;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 283
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 287
    :goto_0
    return-void

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/bj;->b:Landroid/content/Context;

    check-cast v0, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
