.class Lcom/facebook/orca/threadview/cf;
.super Ljava/lang/Object;
.source "ThreadViewImageAttachmentView.java"

# interfaces
.implements Lcom/facebook/ui/images/base/a;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)V
    .locals 0

    .prologue
    .line 654
    iput-object p1, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;Lcom/facebook/orca/threadview/cc;)V
    .locals 0

    .prologue
    .line 654
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/cf;-><init>(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)V

    return-void
.end method

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 682
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 684
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 686
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 687
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-direct {v3, v7, v7, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 688
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 691
    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 692
    invoke-virtual {v1, v7, v7, v7, v7}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 693
    const/4 v5, -0x1

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 694
    iget-object v5, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v5}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I

    move-result v5

    int-to-float v5, v5

    iget-object v6, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v6}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v1, v4, v5, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 697
    new-instance v5, Landroid/graphics/PorterDuffXfermode;

    sget-object v6, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v5, v6}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 698
    invoke-virtual {v1, p1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 701
    const/16 v3, 0x80

    invoke-static {v3, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 702
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 703
    iget-object v3, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 704
    iget-object v3, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v3}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I

    move-result v3

    int-to-float v3, v3

    iget-object v5, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-static {v5}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v1, v4, v3, v5, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 706
    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)Landroid/graphics/drawable/Drawable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Landroid/graphics/drawable/Drawable;"
        }
    .end annotation

    .prologue
    .line 658
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/cf;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 660
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v0, p0, Lcom/facebook/orca/threadview/cf;->a:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadview/cf;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 662
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 663
    invoke-static {}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a()[I

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 664
    invoke-static {}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->b()[I

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 665
    return-object v0
.end method
