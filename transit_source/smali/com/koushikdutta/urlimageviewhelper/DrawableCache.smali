.class public final Lcom/koushikdutta/urlimageviewhelper/DrawableCache;
.super Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;
.source "DrawableCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable",
        "<",
        "Ljava/lang/String;",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# static fields
.field private static mInstance:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 6
    new-instance v0, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    invoke-direct {v0}, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;-><init>()V

    sput-object v0, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->mInstance:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Lcom/koushikdutta/urlimageviewhelper/SoftReferenceHashTable;-><init>()V

    .line 13
    return-void
.end method

.method public static getInstance()Lcom/koushikdutta/urlimageviewhelper/DrawableCache;
    .locals 1

    .prologue
    .line 9
    sget-object v0, Lcom/koushikdutta/urlimageviewhelper/DrawableCache;->mInstance:Lcom/koushikdutta/urlimageviewhelper/DrawableCache;

    return-object v0
.end method
