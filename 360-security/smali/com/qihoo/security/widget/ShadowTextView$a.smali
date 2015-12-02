.class Lcom/qihoo/security/widget/ShadowTextView$a;
.super Landroid/text/style/CharacterStyle;
.source "360Security"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/ShadowTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 114
    iput-object p1, p0, Lcom/qihoo/security/widget/ShadowTextView$a;->a:[I

    .line 115
    return-void
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 119
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 120
    new-instance v0, Landroid/graphics/LinearGradient;

    invoke-virtual {p1}, Landroid/text/TextPaint;->getTextSize()F

    move-result v2

    iget-object v3, p0, Lcom/qihoo/security/widget/ShadowTextView$a;->a:[I

    array-length v3, v3

    int-to-float v3, v3

    mul-float v4, v2, v3

    iget-object v5, p0, Lcom/qihoo/security/widget/ShadowTextView$a;->a:[I

    const/4 v6, 0x0

    sget-object v7, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    move v2, v1

    move v3, v1

    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 122
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 123
    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 124
    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 125
    return-void
.end method
