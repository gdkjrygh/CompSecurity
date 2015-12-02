.class final enum Lcom/facebook/widget/text/e;
.super Ljava/lang/Enum;
.source "CustomFontHelper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/text/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/widget/text/e;

.field public static final enum HELVETICA_NEUE_BOLD:Lcom/facebook/widget/text/e;

.field public static final enum HELVETICA_NEUE_LIGHT:Lcom/facebook/widget/text/e;

.field public static final enum HELVETICA_NEUE_REGULAR:Lcom/facebook/widget/text/e;


# instance fields
.field public mFontAssetFilePath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 30
    new-instance v0, Lcom/facebook/widget/text/e;

    const-string v1, "HELVETICA_NEUE_LIGHT"

    const-string v2, "fonts/HelveticaNeue-Light.ttf"

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/widget/text/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_LIGHT:Lcom/facebook/widget/text/e;

    .line 31
    new-instance v0, Lcom/facebook/widget/text/e;

    const-string v1, "HELVETICA_NEUE_REGULAR"

    const-string v2, "fonts/HelveticaNeue-Roman.ttf"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/widget/text/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_REGULAR:Lcom/facebook/widget/text/e;

    .line 32
    new-instance v0, Lcom/facebook/widget/text/e;

    const-string v1, "HELVETICA_NEUE_BOLD"

    const-string v2, "fonts/HelveticaNeue-Bold.ttf"

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/widget/text/e;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_BOLD:Lcom/facebook/widget/text/e;

    .line 29
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/widget/text/e;

    sget-object v1, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_LIGHT:Lcom/facebook/widget/text/e;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_REGULAR:Lcom/facebook/widget/text/e;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/widget/text/e;->HELVETICA_NEUE_BOLD:Lcom/facebook/widget/text/e;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/widget/text/e;->$VALUES:[Lcom/facebook/widget/text/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 37
    iput-object p3, p0, Lcom/facebook/widget/text/e;->mFontAssetFilePath:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/text/e;
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/widget/text/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/text/e;
    .locals 1

    .prologue
    .line 29
    sget-object v0, Lcom/facebook/widget/text/e;->$VALUES:[Lcom/facebook/widget/text/e;

    invoke-virtual {v0}, [Lcom/facebook/widget/text/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/widget/text/e;

    return-object v0
.end method
