.class public Lcom/google/ads/e;
.super Lcom/google/ads/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/ads/formats/NativeContentAd;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/graphics/drawable/Drawable;

.field private final c:Ljava/lang/String;

.field private final d:Landroid/graphics/drawable/Drawable;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Landroid/graphics/drawable/Drawable;

.field private final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/google/ads/c;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/google/ads/e;->a:Ljava/lang/String;

    .line 32
    iput-object p2, p0, Lcom/google/ads/e;->b:Landroid/graphics/drawable/Drawable;

    .line 33
    iput-object p3, p0, Lcom/google/ads/e;->c:Ljava/lang/String;

    .line 34
    iput-object p4, p0, Lcom/google/ads/e;->d:Landroid/graphics/drawable/Drawable;

    .line 35
    iput-object p5, p0, Lcom/google/ads/e;->e:Ljava/lang/String;

    .line 36
    iput-object p6, p0, Lcom/google/ads/e;->f:Ljava/lang/String;

    .line 37
    iput-object p7, p0, Lcom/google/ads/e;->g:Landroid/graphics/drawable/Drawable;

    .line 38
    iput-object p8, p0, Lcom/google/ads/e;->h:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method protected a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    const-string v0, "1"

    return-object v0
.end method

.method public getAdvertiser()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/google/ads/e;->f:Ljava/lang/String;

    return-object v0
.end method

.method public getAttributionIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lcom/google/ads/e;->g:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getAttributionText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/google/ads/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/google/ads/e;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getCallToAction()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/google/ads/e;->e:Ljava/lang/String;

    return-object v0
.end method

.method public getHeadline()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/google/ads/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getImage()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/google/ads/e;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getLogo()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/google/ads/e;->d:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public hasAttribution()Z
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/google/ads/e;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/ads/e;->g:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
