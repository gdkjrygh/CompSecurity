.class public Lcom/facebook/widget/text/c;
.super Ljava/lang/Object;
.source "CustomFontHelper.java"


# static fields
.field private static final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Lcom/facebook/widget/text/e;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lcom/facebook/widget/text/c;->a:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 1

    .prologue
    .line 67
    sget-object v0, Lcom/facebook/widget/text/d;->BUILTIN:Lcom/facebook/widget/text/d;

    if-ne p1, v0, :cond_0

    .line 75
    :goto_0
    return-object p2

    .line 72
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Typeface;->isBold()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    sget-object v0, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_BOLD:Lcom/facebook/widget/text/e;

    invoke-static {p0, v0}, Lcom/facebook/widget/text/c;->a(Landroid/content/Context;Lcom/facebook/widget/text/e;)Landroid/graphics/Typeface;

    move-result-object p2

    goto :goto_0

    .line 75
    :cond_1
    sget-object v0, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_REGULAR:Lcom/facebook/widget/text/e;

    invoke-static {p0, v0}, Lcom/facebook/widget/text/c;->a(Landroid/content/Context;Lcom/facebook/widget/text/e;)Landroid/graphics/Typeface;

    move-result-object p2

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Lcom/facebook/widget/text/e;)Landroid/graphics/Typeface;
    .locals 2

    .prologue
    .line 83
    sget-object v0, Lcom/facebook/widget/text/c;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    .line 84
    if-nez v0, :cond_0

    .line 85
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    iget-object v1, p1, Lcom/facebook/widget/text/e;->mFontAssetFilePath:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 86
    sget-object v1, Lcom/facebook/widget/text/c;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    :cond_0
    return-object v0
.end method

.method public static a(Landroid/widget/TextView;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)V
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/facebook/widget/text/c;->a(Landroid/content/Context;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object v0

    .line 52
    if-ne v0, p2, :cond_0

    .line 57
    :goto_0
    return-void

    .line 56
    :cond_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    goto :goto_0
.end method
