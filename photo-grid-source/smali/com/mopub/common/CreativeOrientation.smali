.class public final enum Lcom/mopub/common/CreativeOrientation;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/CreativeOrientation;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum LANDSCAPE:Lcom/mopub/common/CreativeOrientation;

.field public static final enum PORTRAIT:Lcom/mopub/common/CreativeOrientation;

.field public static final enum UNDEFINED:Lcom/mopub/common/CreativeOrientation;

.field private static final synthetic a:[Lcom/mopub/common/CreativeOrientation;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 10
    new-instance v0, Lcom/mopub/common/CreativeOrientation;

    const-string v1, "PORTRAIT"

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/CreativeOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/CreativeOrientation;->PORTRAIT:Lcom/mopub/common/CreativeOrientation;

    new-instance v0, Lcom/mopub/common/CreativeOrientation;

    const-string v1, "LANDSCAPE"

    invoke-direct {v0, v1, v3}, Lcom/mopub/common/CreativeOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/CreativeOrientation;->LANDSCAPE:Lcom/mopub/common/CreativeOrientation;

    new-instance v0, Lcom/mopub/common/CreativeOrientation;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1, v4}, Lcom/mopub/common/CreativeOrientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/CreativeOrientation;->UNDEFINED:Lcom/mopub/common/CreativeOrientation;

    .line 9
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mopub/common/CreativeOrientation;

    sget-object v1, Lcom/mopub/common/CreativeOrientation;->PORTRAIT:Lcom/mopub/common/CreativeOrientation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/CreativeOrientation;->LANDSCAPE:Lcom/mopub/common/CreativeOrientation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/CreativeOrientation;->UNDEFINED:Lcom/mopub/common/CreativeOrientation;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/common/CreativeOrientation;->a:[Lcom/mopub/common/CreativeOrientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 9
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static fromHeader(Ljava/lang/String;)Lcom/mopub/common/CreativeOrientation;
    .locals 1

    .prologue
    .line 14
    const-string v0, "l"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    sget-object v0, Lcom/mopub/common/CreativeOrientation;->LANDSCAPE:Lcom/mopub/common/CreativeOrientation;

    .line 22
    :goto_0
    return-object v0

    .line 18
    :cond_0
    const-string v0, "p"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    sget-object v0, Lcom/mopub/common/CreativeOrientation;->PORTRAIT:Lcom/mopub/common/CreativeOrientation;

    goto :goto_0

    .line 22
    :cond_1
    sget-object v0, Lcom/mopub/common/CreativeOrientation;->UNDEFINED:Lcom/mopub/common/CreativeOrientation;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/CreativeOrientation;
    .locals 1

    .prologue
    .line 9
    const-class v0, Lcom/mopub/common/CreativeOrientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/CreativeOrientation;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/CreativeOrientation;
    .locals 1

    .prologue
    .line 9
    sget-object v0, Lcom/mopub/common/CreativeOrientation;->a:[Lcom/mopub/common/CreativeOrientation;

    invoke-virtual {v0}, [Lcom/mopub/common/CreativeOrientation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/CreativeOrientation;

    return-object v0
.end method
