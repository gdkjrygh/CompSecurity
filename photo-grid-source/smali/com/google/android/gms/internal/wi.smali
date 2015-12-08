.class public final Lcom/google/android/gms/internal/wi;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/res/Resources;)Z
    .locals 5

    .prologue
    const/4 v4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 0
    if-nez p0, :cond_1

    :cond_0
    :goto_0
    return v2

    :cond_1
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    if-le v0, v4, :cond_4

    move v0, v1

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/wn;->a()Z

    move-result v3

    if-eqz v3, :cond_2

    if-nez v0, :cond_3

    .line 1000
    :cond_2
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/wn;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    iget v3, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v3, 0xf

    if-gt v3, v4, :cond_5

    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    const/16 v3, 0x258

    if-lt v0, v3, :cond_5

    move v0, v1

    .line 0
    :goto_2
    if-eqz v0, :cond_0

    :cond_3
    move v2, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_1

    :cond_5
    move v0, v2

    .line 1000
    goto :goto_2

    :cond_6
    move v0, v2

    goto :goto_2
.end method
