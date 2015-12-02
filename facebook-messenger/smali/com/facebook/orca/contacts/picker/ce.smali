.class Lcom/facebook/orca/contacts/picker/ce;
.super Landroid/text/style/ReplacementSpan;
.source "PickedUserSpan.java"


# instance fields
.field private final a:Lcom/facebook/user/UserWithIdentifier;

.field private final b:I

.field private final c:I

.field private final d:Landroid/graphics/drawable/Drawable;

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/facebook/user/UserWithIdentifier;ILandroid/text/TextPaint;Landroid/content/res/Resources;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 34
    iput p2, p0, Lcom/facebook/orca/contacts/picker/ce;->e:I

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ce;->a:Lcom/facebook/user/UserWithIdentifier;

    .line 36
    sget v0, Lcom/facebook/g;->picked_user_span_margin_x:I

    invoke-virtual {p4, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/contacts/picker/ce;->b:I

    .line 37
    sget v0, Lcom/facebook/g;->picked_user_span_margin_y:I

    invoke-virtual {p4, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/contacts/picker/ce;->c:I

    .line 38
    invoke-direct {p0, p3, p4}, Lcom/facebook/orca/contacts/picker/ce;->a(Landroid/text/TextPaint;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ce;->d:Landroid/graphics/drawable/Drawable;

    .line 39
    return-void
.end method

.method private a(Landroid/text/TextPaint;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 71
    sget v0, Lcom/facebook/h;->token_field:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 73
    iget v1, p0, Lcom/facebook/orca/contacts/picker/ce;->e:I

    iget v2, p0, Lcom/facebook/orca/contacts/picker/ce;->b:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    const-string v2, " "

    invoke-virtual {p1, v2}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v2

    sub-float/2addr v1, v2

    .line 74
    const/4 v2, 0x0

    cmpg-float v2, v1, v2

    if-gez v2, :cond_0

    .line 75
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Space available to draw display name can not be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ce;->a:Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v2}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v2, p1, v1, v3}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-virtual {p1, v1}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v2

    iget v3, p0, Lcom/facebook/orca/contacts/picker/ce;->b:I

    mul-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    add-float/2addr v2, v3

    float-to-int v2, v2

    .line 88
    int-to-float v3, v2

    const-string v4, " "

    invoke-virtual {p1, v4}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v4

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 91
    invoke-virtual {p1}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v4

    .line 92
    iget v5, v4, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v6, v4, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v5, v6

    iget v6, p0, Lcom/facebook/orca/contacts/picker/ce;->c:I

    mul-int/lit8 v6, v6, 0x2

    add-int/2addr v5, v6

    .line 95
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 96
    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 97
    invoke-virtual {v7, v8}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 101
    invoke-virtual {v0, v8, v8, v2, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 102
    invoke-virtual {v0, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 105
    iget v0, p0, Lcom/facebook/orca/contacts/picker/ce;->c:I

    sub-int v0, v5, v0

    iget v2, v4, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    .line 106
    iget v2, p0, Lcom/facebook/orca/contacts/picker/ce;->b:I

    int-to-float v2, v2

    invoke-virtual {v7, v1, v2, v0, p1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 109
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p2, v6}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 110
    invoke-virtual {v0, v8, v8, v3, v5}, Landroid/graphics/drawable/BitmapDrawable;->setBounds(IIII)V

    .line 111
    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/user/UserWithIdentifier;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ce;->a:Lcom/facebook/user/UserWithIdentifier;

    return-object v0
.end method

.method public draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 1

    .prologue
    .line 62
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ce;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, p8, v0

    .line 65
    int-to-float v0, v0

    invoke-virtual {p1, p5, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ce;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 67
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 68
    return-void
.end method

.method public getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 2

    .prologue
    .line 47
    check-cast p1, Landroid/text/TextPaint;

    .line 48
    if-eqz p5, :cond_0

    .line 49
    invoke-virtual {p1, p5}, Landroid/text/TextPaint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 50
    iget v0, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iget v1, p0, Lcom/facebook/orca/contacts/picker/ce;->c:I

    sub-int/2addr v0, v1

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 51
    iget v0, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget v1, p0, Lcom/facebook/orca/contacts/picker/ce;->c:I

    add-int/2addr v0, v1

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 52
    iget v0, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 53
    iget v0, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v0, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ce;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method
