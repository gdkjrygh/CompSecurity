.class public final Lcom/roidapp/photogrid/filter/selfiecam/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/filter/aq;


# instance fields
.field private final a:[Ljava/lang/Integer;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/app/Activity;

.field private final d:Z

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Ljava/lang/Integer;Ljava/lang/String;ZZ)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->b:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->a:[Ljava/lang/Integer;

    .line 25
    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    .line 26
    iput-boolean p4, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->d:Z

    .line 27
    iput-boolean p5, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->e:Z

    .line 28
    return-void
.end method


# virtual methods
.method public final a(I)Landroid/graphics/Bitmap;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 38
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->b:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-static {v0, p1, v1}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    const/4 v0, 0x0

    .line 66
    :cond_0
    :goto_0
    return-object v0

    .line 42
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 43
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 44
    int-to-float v3, v0

    int-to-float v4, p1

    int-to-float v5, v2

    div-float/2addr v4, v5

    mul-float/2addr v3, v4

    .line 45
    const/high16 v4, 0x45800000    # 4096.0f

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_4

    .line 48
    :goto_1
    if-eq v0, p1, :cond_3

    .line 50
    int-to-float v2, p1

    int-to-float v0, v0

    div-float v0, v2, v0

    .line 51
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    .line 3590
    invoke-static {v1, v0, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;FF)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_3

    if-eq v0, v1, :cond_3

    .line 53
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_2

    .line 54
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 58
    :cond_2
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v6}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 59
    iget-boolean v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->e:Z

    if-nez v2, :cond_0

    const-string v2, "WATER_MARK"

    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 60
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    invoke-static {v1, v0}, Lcom/roidapp/imagelib/b/c;->a(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 61
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 62
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    move-object v0, v1

    .line 63
    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_1
.end method

.method public final a()[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->a:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 71
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->d:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 110
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 115
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/b;->c:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 116
    const-string v2, "WATER_MARK"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 117
    const/4 v0, 0x1

    .line 119
    :cond_0
    return v0
.end method
