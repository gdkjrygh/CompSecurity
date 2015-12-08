.class final Lcom/bumptech/glide/load/resource/bitmap/n;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# static fields
.field private static final d:Landroid/graphics/Paint;


# instance fields
.field final a:Landroid/graphics/Bitmap;

.field b:I

.field c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 141
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->d:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 149
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 147
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->d:Landroid/graphics/Paint;

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/n;->c:Landroid/graphics/Paint;

    .line 150
    iput-object p1, p0, Lcom/bumptech/glide/load/resource/bitmap/n;->a:Landroid/graphics/Bitmap;

    .line 151
    return-void
.end method

.method constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/n;)V
    .locals 1

    .prologue
    .line 155
    iget-object v0, p1, Lcom/bumptech/glide/load/resource/bitmap/n;->a:Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/resource/bitmap/n;-><init>(Landroid/graphics/Bitmap;)V

    .line 156
    iget v0, p1, Lcom/bumptech/glide/load/resource/bitmap/n;->b:I

    iput v0, p0, Lcom/bumptech/glide/load/resource/bitmap/n;->b:I

    .line 157
    return-void
.end method


# virtual methods
.method final a()V
    .locals 2

    .prologue
    .line 172
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->d:Landroid/graphics/Paint;

    iget-object v1, p0, Lcom/bumptech/glide/load/resource/bitmap/n;->c:Landroid/graphics/Paint;

    if-ne v0, v1, :cond_0

    .line 173
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/bumptech/glide/load/resource/bitmap/n;->c:Landroid/graphics/Paint;

    .line 175
    :cond_0
    return-void
.end method

.method public final getChangingConfigurations()I
    .locals 1

    .prologue
    .line 189
    const/4 v0, 0x0

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 179
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/m;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/resource/bitmap/m;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/resource/bitmap/n;)V

    return-object v0
.end method

.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 184
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/m;

    invoke-direct {v0, p1, p0}, Lcom/bumptech/glide/load/resource/bitmap/m;-><init>(Landroid/content/res/Resources;Lcom/bumptech/glide/load/resource/bitmap/n;)V

    return-object v0
.end method
