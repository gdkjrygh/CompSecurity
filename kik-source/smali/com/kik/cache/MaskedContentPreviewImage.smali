.class public Lcom/kik/cache/MaskedContentPreviewImage;
.super Lkik/android/widget/ClampedContentPreviewView;
.source "SourceFile"


# instance fields
.field private h:Landroid/graphics/drawable/Drawable;

.field private i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lkik/android/widget/ClampedContentPreviewView;-><init>(Landroid/content/Context;)V

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0, p1, p2}, Lkik/android/widget/ClampedContentPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    .line 27
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    .line 32
    invoke-virtual {p0}, Lcom/kik/cache/MaskedContentPreviewImage;->invalidate()V

    .line 33
    return-void
.end method

.method public final c(I)V
    .locals 0

    .prologue
    .line 37
    iput p1, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    .line 38
    invoke-virtual {p0}, Lcom/kik/cache/MaskedContentPreviewImage;->invalidate()V

    .line 39
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 54
    invoke-super {p0, p1}, Lkik/android/widget/ClampedContentPreviewView;->onDraw(Landroid/graphics/Canvas;)V

    .line 55
    iget v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    if-eqz v0, :cond_0

    .line 56
    iget v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->i:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 58
    :cond_0
    iget-object v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->h:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/kik/cache/MaskedContentPreviewImage;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/kik/cache/MaskedContentPreviewImage;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 60
    iget-object v0, p0, Lcom/kik/cache/MaskedContentPreviewImage;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 62
    :cond_1
    return-void
.end method
