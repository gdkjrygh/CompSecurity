.class public Lorg/chromium/content_public/browser/NavigationEntry;
.super Ljava/lang/Object;
.source "NavigationEntry.java"


# instance fields
.field private mFavicon:Landroid/graphics/Bitmap;

.field private final mIndex:I

.field private final mOriginalUrl:Ljava/lang/String;

.field private final mTitle:Ljava/lang/String;

.field private final mUrl:Ljava/lang/String;

.field private final mVirtualUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "index"    # I
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "virtualUrl"    # Ljava/lang/String;
    .param p4, "originalUrl"    # Ljava/lang/String;
    .param p5, "title"    # Ljava/lang/String;
    .param p6, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput p1, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mIndex:I

    .line 27
    iput-object p2, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mUrl:Ljava/lang/String;

    .line 28
    iput-object p3, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mVirtualUrl:Ljava/lang/String;

    .line 29
    iput-object p4, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mOriginalUrl:Ljava/lang/String;

    .line 30
    iput-object p5, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mTitle:Ljava/lang/String;

    .line 31
    iput-object p6, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mFavicon:Landroid/graphics/Bitmap;

    .line 32
    return-void
.end method


# virtual methods
.method public getFavicon()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mFavicon:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mIndex:I

    return v0
.end method

.method public getOriginalUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mOriginalUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getVirtualUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mVirtualUrl:Ljava/lang/String;

    return-object v0
.end method

.method public updateFavicon(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "favicon"    # Landroid/graphics/Bitmap;

    .prologue
    .line 93
    iput-object p1, p0, Lorg/chromium/content_public/browser/NavigationEntry;->mFavicon:Landroid/graphics/Bitmap;

    .line 94
    return-void
.end method
