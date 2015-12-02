.class Lcom/facebook/maps/i;
.super Lcom/google/android/maps/OverlayItem;
.source "GoogleMapFragment.java"


# instance fields
.field private a:Z

.field private b:Lcom/facebook/maps/l;


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 686
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/maps/i;->a:Z

    .line 687
    iget-object v0, p0, Lcom/facebook/maps/i;->b:Lcom/facebook/maps/l;

    invoke-interface {v0}, Lcom/facebook/maps/l;->a()V

    .line 688
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 691
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/maps/i;->a:Z

    .line 692
    iget-object v0, p0, Lcom/facebook/maps/i;->b:Lcom/facebook/maps/l;

    invoke-interface {v0}, Lcom/facebook/maps/l;->b()V

    .line 693
    return-void
.end method

.method public getMarker(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 697
    and-int/lit8 v0, p1, 0x4

    if-nez v0, :cond_0

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 699
    :goto_0
    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/maps/i;->a:Z

    if-nez v0, :cond_2

    .line 705
    invoke-super {p0, v1}, Lcom/google/android/maps/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 707
    :goto_1
    return-object v0

    :cond_1
    move v0, v1

    .line 697
    goto :goto_0

    .line 707
    :cond_2
    invoke-super {p0, p1}, Lcom/google/android/maps/OverlayItem;->getMarker(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_1
.end method
