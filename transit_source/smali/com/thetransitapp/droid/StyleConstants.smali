.class public final Lcom/thetransitapp/droid/StyleConstants;
.super Ljava/lang/Object;
.source "StyleConstants.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    return-void
.end method

.method public static darkGray()I
    .locals 1

    .prologue
    .line 10
    const-string v0, "#333333"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    return v0
.end method
