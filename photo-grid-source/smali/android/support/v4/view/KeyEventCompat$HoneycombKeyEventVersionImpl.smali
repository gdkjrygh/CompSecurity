.class Landroid/support/v4/view/KeyEventCompat$HoneycombKeyEventVersionImpl;
.super Landroid/support/v4/view/KeyEventCompat$EclairKeyEventVersionImpl;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 144
    invoke-direct {p0}, Landroid/support/v4/view/KeyEventCompat$EclairKeyEventVersionImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public metaStateHasModifiers(II)Z
    .locals 1

    .prologue
    .line 152
    invoke-static {p1, p2}, Landroid/support/v4/view/KeyEventCompatHoneycomb;->metaStateHasModifiers(II)Z

    move-result v0

    return v0
.end method

.method public metaStateHasNoModifiers(I)Z
    .locals 1

    .prologue
    .line 157
    invoke-static {p1}, Landroid/support/v4/view/KeyEventCompatHoneycomb;->metaStateHasNoModifiers(I)Z

    move-result v0

    return v0
.end method

.method public normalizeMetaState(I)I
    .locals 1

    .prologue
    .line 147
    invoke-static {p1}, Landroid/support/v4/view/KeyEventCompatHoneycomb;->normalizeMetaState(I)I

    move-result v0

    return v0
.end method
