.class abstract Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;
.super Ljava/lang/Object;
.source "UrlImageViewHelper.java"

# interfaces
.implements Lcom/koushikdutta/urlimageviewhelper/UrlDownloader$UrlDownloaderCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "Loader"
.end annotation


# instance fields
.field result:Landroid/graphics/Bitmap;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 677
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$1;

    .prologue
    .line 677
    invoke-direct {p0}, Lcom/koushikdutta/urlimageviewhelper/UrlImageViewHelper$Loader;-><init>()V

    return-void
.end method
