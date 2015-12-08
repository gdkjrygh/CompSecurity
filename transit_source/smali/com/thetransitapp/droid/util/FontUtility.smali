.class public final Lcom/thetransitapp/droid/util/FontUtility;
.super Ljava/lang/Object;
.source "FontUtility.java"


# static fields
.field private static INTERSTATE_BOLD:Landroid/graphics/Typeface;


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method

.method public static getInterstateBold(Landroid/content/Context;)Landroid/graphics/Typeface;
    .locals 2
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    .line 13
    sget-object v0, Lcom/thetransitapp/droid/util/FontUtility;->INTERSTATE_BOLD:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "fbxBO6Oqt4.ttf"

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/thetransitapp/droid/util/FontUtility;->INTERSTATE_BOLD:Landroid/graphics/Typeface;

    .line 17
    :cond_0
    sget-object v0, Lcom/thetransitapp/droid/util/FontUtility;->INTERSTATE_BOLD:Landroid/graphics/Typeface;

    return-object v0
.end method
