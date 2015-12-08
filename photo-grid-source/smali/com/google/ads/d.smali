.class public Lcom/google/ads/d;
.super Lcom/google/ads/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeAppInstallAd;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/graphics/drawable/Drawable;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/Double;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private final i:Landroid/graphics/drawable/Drawable;

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/google/ads/c;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/google/ads/d;->a:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lcom/google/ads/d;->b:Landroid/graphics/drawable/Drawable;

    .line 37
    iput-object p3, p0, Lcom/google/ads/d;->c:Ljava/lang/String;

    .line 38
    iput-object p4, p0, Lcom/google/ads/d;->d:Landroid/graphics/drawable/Drawable;

    .line 39
    iput-object p5, p0, Lcom/google/ads/d;->e:Ljava/lang/String;

    .line 40
    iput-object p6, p0, Lcom/google/ads/d;->f:Ljava/lang/Double;

    .line 41
    iput-object p7, p0, Lcom/google/ads/d;->g:Ljava/lang/String;

    .line 42
    iput-object p8, p0, Lcom/google/ads/d;->h:Ljava/lang/String;

    .line 43
    iput-object p9, p0, Lcom/google/ads/d;->i:Landroid/graphics/drawable/Drawable;

    .line 44
    iput-object p10, p0, Lcom/google/ads/d;->j:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    const-string v0, "2"

    return-object v0
.end method

.method public getAttributionIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/google/ads/d;->i:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getAttributionText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/google/ads/d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/google/ads/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getCallToAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/google/ads/d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getHeadline()Ljava/lang/String;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/google/ads/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/google/ads/d;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getImage()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/google/ads/d;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getPrice()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/google/ads/d;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getStarRating()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/google/ads/d;->f:Ljava/lang/Double;

    return-object v0
.end method

.method public getStore()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/google/ads/d;->g:Ljava/lang/String;

    return-object v0
.end method

.method public hasAttribution()Z
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/google/ads/d;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/d;->i:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
