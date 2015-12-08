.class public final Lkik/android/widget/u;
.super Lcom/kik/android/c/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V
    .locals 0

    .prologue
    .line 37
    invoke-direct/range {p0 .. p6}, Lcom/kik/android/c/b;-><init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lkik/android/e/f;IZ)V

    .line 38
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 2

    .prologue
    .line 48
    instance-of v0, p2, Landroid/text/GetChars;

    if-eqz v0, :cond_0

    move-object v0, p2

    .line 49
    check-cast v0, Landroid/text/GetChars;

    invoke-interface {v0, p3}, Landroid/text/GetChars;->charAt(I)C

    move-result v0

    .line 52
    const v1, 0xfeff

    if-eq v0, v1, :cond_0

    const/16 v1, 0x2026

    if-eq v0, v1, :cond_0

    const/16 v1, 0x2025

    if-eq v0, v1, :cond_0

    .line 53
    invoke-super/range {p0 .. p9}, Lcom/kik/android/c/b;->draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V

    .line 56
    :cond_0
    return-void
.end method
