.class public final Lkik/android/util/ac;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/ac$a;
    }
.end annotation


# static fields
.field public static final a:Lkik/android/util/cv$d;

.field public static final b:Lkik/android/util/cv$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lkik/android/util/cv$d;

    const v1, 0x7f0c0021

    invoke-static {v1}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v1

    invoke-direct {v0, v1}, Lkik/android/util/cv$d;-><init>(I)V

    sput-object v0, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    .line 41
    new-instance v0, Lkik/android/util/cv$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkik/android/util/cv$d;-><init>(I)V

    sput-object v0, Lkik/android/util/ac;->b:Lkik/android/util/cv$d;

    return-void
.end method

.method private static a(Ljava/lang/String;Landroid/view/View;Z)Landroid/widget/TextView;
    .locals 3

    .prologue
    .line 364
    const v0, 0x7f0e00e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 365
    const/4 v1, 0x1

    new-array v1, v1, [Landroid/view/View;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 366
    invoke-static {v0}, Lkik/android/util/cv;->a(Landroid/widget/TextView;)V

    .line 367
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 368
    if-eqz p2, :cond_0

    .line 370
    sget-object v1, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v0, v1}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 372
    :cond_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;
    .locals 10

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 151
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030032

    invoke-virtual {v0, v2, p1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 153
    const v0, 0x7f0e00dd

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 154
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 155
    :goto_0
    if-eqz v2, :cond_0

    .line 156
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v4

    invoke-virtual {v4, v2}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v2

    .line 157
    if-eqz v2, :cond_2

    .line 158
    array-length v4, v2

    invoke-static {v2, v3, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 164
    :cond_0
    new-instance v4, Lkik/android/util/ac$a;

    const v0, 0x7f0e00d7

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    move-object v8, v1

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    move-object v0, v4

    :goto_1
    return-object v0

    .line 154
    :cond_1
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    goto :goto_0

    .line 161
    :cond_2
    new-instance v0, Lkik/android/util/ac$a;

    const v2, 0x7f090175

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;
    .locals 12

    .prologue
    const/4 v11, -0x1

    const/high16 v10, -0x80000000

    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 85
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030035

    invoke-virtual {v0, v2, p1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 86
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, ""

    move-object v2, v0

    .line 88
    :goto_0
    const v0, 0x7f0e00d7

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lkik/android/widget/MaskedFramelayout;

    .line 89
    const v0, 0x7f020030

    invoke-virtual {v6, v0}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 90
    const v0, 0x7f0e00e3

    invoke-virtual {v6, v0}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 92
    const v0, 0x7f0e00de

    invoke-virtual {v6, v0}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v8, "title"

    invoke-virtual {p2, v8}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v9, 0x2

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    :goto_1
    invoke-static {v2, v6, v3}, Lkik/android/util/ac;->a(Ljava/lang/String;Landroid/view/View;Z)Landroid/widget/TextView;

    move-result-object v2

    .line 94
    invoke-static {p2}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 95
    invoke-virtual {v0, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 96
    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 104
    :goto_2
    const v0, 0x7f0e00dd

    invoke-virtual {v6, v0}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ClampedContentPreviewView;

    .line 106
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    if-nez v2, :cond_5

    const-string v2, "preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 107
    :goto_3
    if-eqz v2, :cond_7

    .line 108
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v8

    invoke-virtual {v8, v2}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    array-length v8, v2

    invoke-static {v2, v3, v8}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 112
    new-instance v8, Lkik/android/widget/c;

    sget v9, Lkik/android/widget/c$a;->c:I

    invoke-direct {v8, v2, v9}, Lkik/android/widget/c;-><init>(Landroid/graphics/Bitmap;I)V

    .line 113
    invoke-virtual {v8}, Lkik/android/widget/c;->b()V

    .line 114
    invoke-static {p2}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-static {v2}, Lkik/android/util/aa;->a(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 115
    const v2, 0x7f0c0020

    invoke-static {v2}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v2

    invoke-virtual {v8, v2}, Lkik/android/widget/c;->b(I)V

    .line 116
    const v2, 0x7f02009d

    invoke-virtual {v4, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 119
    :cond_0
    invoke-virtual {v0, v8}, Lkik/android/widget/ClampedContentPreviewView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 129
    invoke-static {p2}, Lkik/android/util/ae;->b(Lkik/a/d/a/a;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 131
    invoke-static {v4, v0}, Lkik/android/util/cv;->a(Landroid/view/View;Landroid/view/View;)V

    .line 132
    const/4 v2, -0x2

    invoke-static {v4, v2}, Lkik/android/util/cv;->b(Landroid/view/View;I)V

    .line 133
    invoke-virtual {p3}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v2

    invoke-static {v4, v2}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;)V

    .line 136
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v2, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    invoke-virtual {v4, v2, v8}, Landroid/view/View;->measure(II)V

    .line 138
    const v2, 0x7f0d0008

    invoke-static {v2}, Lkik/android/chat/KikApplication;->d(I)I

    move-result v2

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    sub-int/2addr v2, v4

    .line 139
    invoke-virtual {v0, v2}, Lkik/android/widget/ClampedContentPreviewView;->setMaxHeight(I)V

    .line 140
    invoke-virtual {v0, v2}, Lkik/android/widget/ClampedContentPreviewView;->setMinimumHeight(I)V

    .line 142
    :cond_1
    invoke-static {p2}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v0

    invoke-static {v6, v0}, Lkik/android/util/ac;->a(Landroid/view/View;Z)V

    .line 144
    invoke-static {p2, v6}, Lkik/android/util/ac;->a(Lkik/a/d/a/a;Landroid/view/View;)V

    .line 145
    new-instance v4, Lkik/android/util/ac$a;

    move-object v8, v1

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    move-object v0, v4

    :goto_4
    return-object v0

    .line 86
    :cond_2
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto/16 :goto_0

    .line 92
    :cond_3
    const/16 v8, 0x8

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 99
    :cond_4
    invoke-virtual {p3}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v8

    invoke-static {v0, v8}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 100
    invoke-virtual {p3}, Lkik/android/chat/b/d;->d()Lkik/android/chat/b/b;

    move-result-object v8

    invoke-static {v2, v8}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 101
    new-array v2, v7, [Landroid/view/View;

    aput-object v0, v2, v3

    invoke-static {v2}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto/16 :goto_2

    .line 106
    :cond_5
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    goto/16 :goto_3

    .line 122
    :cond_6
    new-instance v0, Lkik/android/util/ac$a;

    const v2, 0x7f090175

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    goto :goto_4

    .line 124
    :cond_7
    new-instance v0, Lkik/android/util/ac$a;

    const v2, 0x7f090175

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    goto :goto_4
.end method

.method private static a(Landroid/view/View;Z)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 235
    if-nez p0, :cond_1

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 239
    :cond_1
    const v0, 0x7f0e008c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 240
    if-eqz v0, :cond_0

    .line 243
    if-eqz p1, :cond_2

    .line 244
    new-array v1, v1, [Landroid/view/View;

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    goto :goto_0

    .line 247
    :cond_2
    new-array v1, v1, [Landroid/view/View;

    aput-object v0, v1, v2

    invoke-static {v1}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method private static a(Lkik/a/d/a/a;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 306
    const-string v0, "icon"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 307
    const v1, 0x7f0e00e4

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 308
    if-eqz v0, :cond_1

    .line 309
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v0

    .line 310
    if-eqz v0, :cond_0

    .line 311
    const/4 v2, 0x0

    array-length v3, v0

    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 317
    :cond_0
    :goto_0
    return-void

    .line 315
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;
    .locals 10

    .prologue
    const v8, 0x7f090175

    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 169
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    .line 170
    :goto_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v4, 0x7f030033

    invoke-virtual {v2, v4, p1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 172
    const v2, 0x7f0e00d7

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lkik/android/widget/MaskedFramelayout;

    .line 173
    const v2, 0x7f020030

    invoke-virtual {v6, v2}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 175
    invoke-static {v0, v6, v7}, Lkik/android/util/ac;->a(Ljava/lang/String;Landroid/view/View;Z)Landroid/widget/TextView;

    .line 177
    const v0, 0x7f0e00dd

    invoke-virtual {v6, v0}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ClampedContentPreviewView;

    .line 178
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v2, "preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    .line 179
    :goto_1
    if-eqz v2, :cond_4

    .line 180
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v4

    invoke-virtual {v4, v2}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v2

    .line 181
    if-eqz v2, :cond_3

    .line 184
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 185
    iput-boolean v7, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 186
    array-length v8, v2

    invoke-static {v2, v3, v8, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 187
    new-instance v4, Lkik/android/widget/c;

    sget v8, Lkik/android/widget/c$a;->c:I

    invoke-direct {v4, v2, v8}, Lkik/android/widget/c;-><init>(Landroid/graphics/Bitmap;I)V

    .line 189
    invoke-static {v2}, Lkik/android/util/aa;->a(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 190
    const v2, 0x7f0c0020

    invoke-static {v2}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v2

    invoke-virtual {v4, v2}, Lkik/android/widget/c;->b(I)V

    .line 191
    const v2, 0x7f0e00e0

    invoke-virtual {v6, v2}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v8, 0x7f02009d

    invoke-virtual {v2, v8}, Landroid/view/View;->setBackgroundResource(I)V

    .line 193
    :cond_0
    invoke-virtual {v0, v4}, Lkik/android/widget/ClampedContentPreviewView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 195
    invoke-static {p2}, Lkik/android/f/a/f;->d(Lkik/a/d/a/a;)Z

    move-result v0

    invoke-static {v6, v0}, Lkik/android/util/ac;->a(Landroid/view/View;Z)V

    .line 206
    invoke-static {p2, v6}, Lkik/android/util/ac;->a(Lkik/a/d/a/a;Landroid/view/View;)V

    .line 207
    new-instance v4, Lkik/android/util/ac$a;

    move-object v8, v1

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    move-object v0, v4

    :goto_2
    return-object v0

    .line 169
    :cond_1
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 178
    :cond_2
    const-string v2, "png-preview"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v2

    goto :goto_1

    .line 198
    :cond_3
    new-instance v0, Lkik/android/util/ac$a;

    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    goto :goto_2

    .line 200
    :cond_4
    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lkik/android/widget/ClampedContentPreviewView;->setVisibility(I)V

    .line 203
    new-instance v0, Lkik/android/util/ac$a;

    invoke-virtual {p0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    goto :goto_2
.end method

.method public static b(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;
    .locals 11

    .prologue
    const/16 v10, 0xa5

    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 321
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    move-object v7, v0

    .line 322
    :goto_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030030

    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 324
    const v0, 0x7f0e00d7

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 326
    const-string v0, "title"

    invoke-virtual {p2, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 327
    const-string v0, "text"

    invoke-virtual {p2, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 328
    const v0, 0x7f0e00db

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 329
    const v4, 0x7f0e00da

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 330
    invoke-static {v6}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    .line 331
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 337
    :goto_1
    invoke-static {v8}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 338
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 344
    :goto_2
    const v6, 0x7f0e00d9

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lkik/android/widget/MaskedFramelayout;

    .line 345
    const v8, 0x7f020030

    invoke-virtual {v6, v8}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 346
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v8

    invoke-static {v6, v8}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;)V

    .line 348
    invoke-static {v7, v2, v5}, Lkik/android/util/ac;->a(Ljava/lang/String;Landroid/view/View;Z)Landroid/widget/TextView;

    move-result-object v6

    .line 349
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v7

    invoke-virtual {v7}, Lkik/android/chat/b/b;->b()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 350
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v7

    invoke-virtual {v7}, Lkik/android/chat/b/b;->b()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 351
    invoke-static {v0, v10}, Lkik/android/util/cv;->a(Landroid/widget/TextView;I)V

    .line 352
    invoke-static {v0, v10}, Lkik/android/util/cv;->b(Landroid/widget/TextView;I)V

    .line 354
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    invoke-static {v6, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 355
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    invoke-static {v4, v0}, Lkik/android/chat/b/c;->a(Landroid/widget/TextView;Lkik/android/chat/b/b;)V

    .line 357
    invoke-static {p2, v2}, Lkik/android/util/ac;->a(Lkik/a/d/a/a;Landroid/view/View;)V

    .line 359
    new-instance v0, Lkik/android/util/ac$a;

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    return-object v0

    .line 321
    :cond_0
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto/16 :goto_0

    .line 334
    :cond_1
    new-array v6, v3, [Landroid/view/View;

    aput-object v4, v6, v5

    invoke-static {v6}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_1

    .line 341
    :cond_2
    new-array v6, v3, [Landroid/view/View;

    aput-object v0, v6, v5

    invoke-static {v6}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_2
.end method

.method public static c(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;)Lkik/android/util/ac$a;
    .locals 9

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 257
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030034

    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 259
    const v0, 0x7f0e00d7

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/MaskedFramelayout;

    .line 260
    const v0, 0x7f020030

    invoke-virtual {v2, v0}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 262
    const v0, 0x7f0e00e2

    invoke-virtual {v2, v0}, Lkik/android/widget/MaskedFramelayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/gifs/view/GifView;

    .line 264
    const-string v6, "preview"

    invoke-virtual {p2, v6}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v7

    invoke-virtual {v7, v6}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v6

    if-eqz v6, :cond_1

    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v3, v7, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    array-length v8, v6

    invoke-static {v6, v5, v8, v7}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v6

    move-object v7, v6

    :goto_0
    if-nez v7, :cond_2

    move-object v6, v4

    .line 266
    :goto_1
    if-eqz v6, :cond_0

    .line 267
    invoke-virtual {v0, v6}, Lkik/android/gifs/view/GifView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 270
    :cond_0
    sget-object v6, Lkik/a/d/a/a$c;->a:Lkik/a/d/a/a$c;

    invoke-virtual {p2, v6}, Lkik/a/d/a/a;->a(Lkik/a/d/a/a$c;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lkik/android/gifs/a;->c:Lkik/android/gifs/a/f$a;

    invoke-virtual {v0, v6, v7}, Lkik/android/gifs/view/GifView;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;

    .line 271
    new-instance v0, Lkik/android/util/ac$a;

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    return-object v0

    :cond_1
    move-object v7, v4

    .line 264
    goto :goto_0

    :cond_2
    new-instance v6, Lkik/android/widget/c;

    sget v8, Lkik/android/widget/c$a;->c:I

    invoke-direct {v6, v7, v8}, Lkik/android/widget/c;-><init>(Landroid/graphics/Bitmap;I)V

    goto :goto_1
.end method

.method public static c(Landroid/content/Context;Landroid/view/ViewGroup;Lkik/a/d/a/a;Lkik/android/chat/b/d;)Lkik/android/util/ac$a;
    .locals 11

    .prologue
    const/4 v7, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 377
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, ""

    move-object v8, v0

    .line 378
    :goto_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f030031

    invoke-virtual {v0, v2, p1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 380
    const v0, 0x7f0e00d7

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 382
    const v0, 0x7f0e00dd

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ClampedContentPreviewView;

    .line 384
    const-string v2, "title"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 385
    const-string v2, "text"

    invoke-virtual {p2, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 386
    const v2, 0x7f0e00df

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 387
    invoke-static {v9}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 388
    const v4, 0x7f0e00de

    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 389
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 391
    sget-object v9, Lkik/android/util/ac;->a:Lkik/android/util/cv$d;

    invoke-static {v4, v9}, Lkik/android/util/cv;->a(Landroid/widget/TextView;Lkik/android/util/cv$d;)V

    .line 392
    const v4, 0x7f0c0005

    invoke-static {v4}, Lkik/android/chat/KikApplication;->e(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lkik/android/widget/ClampedContentPreviewView;->b(I)V

    .line 394
    :cond_0
    if-eqz v10, :cond_1

    .line 395
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    :cond_1
    const-string v4, "png-preview"

    invoke-virtual {p2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v4

    if-nez v4, :cond_4

    const-string v4, "preview"

    invoke-virtual {p2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v4

    .line 400
    :goto_1
    if-eqz v4, :cond_5

    .line 402
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v9

    invoke-virtual {v9, v4}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v4

    .line 403
    if-eqz v4, :cond_2

    .line 404
    array-length v9, v4

    invoke-static {v4, v3, v9}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 405
    invoke-virtual {v0, v4}, Lkik/android/widget/ClampedContentPreviewView;->d(Landroid/graphics/Bitmap;)V

    .line 407
    :cond_2
    invoke-virtual {v0, v3}, Lkik/android/widget/ClampedContentPreviewView;->setVisibility(I)V

    .line 412
    const v0, 0x7f0e00dc

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/MaskedFramelayout;

    .line 413
    const v4, 0x7f020030

    invoke-virtual {v0, v4}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 414
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v4

    invoke-static {v0, v4}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;)V

    .line 416
    invoke-static {v8, v6, v3}, Lkik/android/util/ac;->a(Ljava/lang/String;Landroid/view/View;Z)Landroid/widget/TextView;

    move-result-object v0

    .line 417
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v4

    invoke-virtual {v4}, Lkik/android/chat/b/b;->b()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 418
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 419
    invoke-virtual {p3}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/b/b;->b()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setLinkTextColor(I)V

    .line 421
    invoke-static {p2, v6}, Lkik/android/util/ac;->a(Lkik/a/d/a/a;Landroid/view/View;)V

    .line 423
    new-instance v4, Lkik/android/util/ac$a;

    move-object v8, v1

    move v9, v3

    invoke-direct/range {v4 .. v9}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    :goto_2
    return-object v4

    .line 377
    :cond_3
    invoke-static {p2}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto/16 :goto_0

    .line 398
    :cond_4
    const-string v4, "png-preview"

    invoke-virtual {p2, v4}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v4

    goto :goto_1

    .line 410
    :cond_5
    new-instance v0, Lkik/android/util/ac$a;

    const v2, 0x7f090175

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object v2, v1

    move v5, v3

    invoke-direct/range {v0 .. v5}, Lkik/android/util/ac$a;-><init>(Landroid/view/View;Landroid/view/View;ZLjava/lang/String;B)V

    move-object v4, v0

    goto :goto_2
.end method
