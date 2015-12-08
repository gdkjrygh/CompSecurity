.class public final enum Lcom/mopub/common/util/VersionCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/util/VersionCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BASE:Lcom/mopub/common/util/VersionCode;

.field public static final enum BASE_1_1:Lcom/mopub/common/util/VersionCode;

.field public static final enum CUPCAKE:Lcom/mopub/common/util/VersionCode;

.field public static final enum CUR_DEVELOPMENT:Lcom/mopub/common/util/VersionCode;

.field public static final enum DONUT:Lcom/mopub/common/util/VersionCode;

.field public static final enum ECLAIR:Lcom/mopub/common/util/VersionCode;

.field public static final enum ECLAIR_0_1:Lcom/mopub/common/util/VersionCode;

.field public static final enum ECLAIR_MR1:Lcom/mopub/common/util/VersionCode;

.field public static final enum FROYO:Lcom/mopub/common/util/VersionCode;

.field public static final enum GINGERBREAD:Lcom/mopub/common/util/VersionCode;

.field public static final enum GINGERBREAD_MR1:Lcom/mopub/common/util/VersionCode;

.field public static final enum HONEYCOMB:Lcom/mopub/common/util/VersionCode;

.field public static final enum HONEYCOMB_MR1:Lcom/mopub/common/util/VersionCode;

.field public static final enum HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

.field public static final enum ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

.field public static final enum ICE_CREAM_SANDWICH_MR1:Lcom/mopub/common/util/VersionCode;

.field public static final enum JELLY_BEAN:Lcom/mopub/common/util/VersionCode;

.field public static final enum JELLY_BEAN_MR1:Lcom/mopub/common/util/VersionCode;

.field public static final enum JELLY_BEAN_MR2:Lcom/mopub/common/util/VersionCode;

.field public static final enum KITKAT:Lcom/mopub/common/util/VersionCode;

.field private static final synthetic b:[Lcom/mopub/common/util/VersionCode;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x5

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    .line 6
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "BASE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v4}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->BASE:Lcom/mopub/common/util/VersionCode;

    .line 7
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "BASE_1_1"

    invoke-direct {v0, v1, v4, v5}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->BASE_1_1:Lcom/mopub/common/util/VersionCode;

    .line 8
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "CUPCAKE"

    invoke-direct {v0, v1, v5, v6}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->CUPCAKE:Lcom/mopub/common/util/VersionCode;

    .line 9
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "DONUT"

    invoke-direct {v0, v1, v6, v7}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->DONUT:Lcom/mopub/common/util/VersionCode;

    .line 10
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "ECLAIR"

    invoke-direct {v0, v1, v7, v8}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->ECLAIR:Lcom/mopub/common/util/VersionCode;

    .line 11
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "ECLAIR_0_1"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v8, v2}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->ECLAIR_0_1:Lcom/mopub/common/util/VersionCode;

    .line 12
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "ECLAIR_MR1"

    const/4 v2, 0x6

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->ECLAIR_MR1:Lcom/mopub/common/util/VersionCode;

    .line 13
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "FROYO"

    const/4 v2, 0x7

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->FROYO:Lcom/mopub/common/util/VersionCode;

    .line 14
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "GINGERBREAD"

    const/16 v2, 0x8

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->GINGERBREAD:Lcom/mopub/common/util/VersionCode;

    .line 15
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "GINGERBREAD_MR1"

    const/16 v2, 0x9

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->GINGERBREAD_MR1:Lcom/mopub/common/util/VersionCode;

    .line 16
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "HONEYCOMB"

    const/16 v2, 0xa

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->HONEYCOMB:Lcom/mopub/common/util/VersionCode;

    .line 17
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "HONEYCOMB_MR1"

    const/16 v2, 0xb

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR1:Lcom/mopub/common/util/VersionCode;

    .line 18
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "HONEYCOMB_MR2"

    const/16 v2, 0xc

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    .line 19
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "ICE_CREAM_SANDWICH"

    const/16 v2, 0xd

    const/16 v3, 0xe

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

    .line 20
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "ICE_CREAM_SANDWICH_MR1"

    const/16 v2, 0xe

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH_MR1:Lcom/mopub/common/util/VersionCode;

    .line 21
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "JELLY_BEAN"

    const/16 v2, 0xf

    const/16 v3, 0x10

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN:Lcom/mopub/common/util/VersionCode;

    .line 22
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "JELLY_BEAN_MR1"

    const/16 v2, 0x10

    const/16 v3, 0x11

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN_MR1:Lcom/mopub/common/util/VersionCode;

    .line 23
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "JELLY_BEAN_MR2"

    const/16 v2, 0x11

    const/16 v3, 0x12

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN_MR2:Lcom/mopub/common/util/VersionCode;

    .line 24
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "KITKAT"

    const/16 v2, 0x12

    const/16 v3, 0x13

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->KITKAT:Lcom/mopub/common/util/VersionCode;

    .line 25
    new-instance v0, Lcom/mopub/common/util/VersionCode;

    const-string v1, "CUR_DEVELOPMENT"

    const/16 v2, 0x13

    const/16 v3, 0x2710

    invoke-direct {v0, v1, v2, v3}, Lcom/mopub/common/util/VersionCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/mopub/common/util/VersionCode;->CUR_DEVELOPMENT:Lcom/mopub/common/util/VersionCode;

    .line 5
    const/16 v0, 0x14

    new-array v0, v0, [Lcom/mopub/common/util/VersionCode;

    const/4 v1, 0x0

    sget-object v2, Lcom/mopub/common/util/VersionCode;->BASE:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    sget-object v1, Lcom/mopub/common/util/VersionCode;->BASE_1_1:Lcom/mopub/common/util/VersionCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/mopub/common/util/VersionCode;->CUPCAKE:Lcom/mopub/common/util/VersionCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/util/VersionCode;->DONUT:Lcom/mopub/common/util/VersionCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/mopub/common/util/VersionCode;->ECLAIR:Lcom/mopub/common/util/VersionCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/mopub/common/util/VersionCode;->ECLAIR_0_1:Lcom/mopub/common/util/VersionCode;

    aput-object v1, v0, v8

    const/4 v1, 0x6

    sget-object v2, Lcom/mopub/common/util/VersionCode;->ECLAIR_MR1:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/mopub/common/util/VersionCode;->FROYO:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/mopub/common/util/VersionCode;->GINGERBREAD:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/mopub/common/util/VersionCode;->GINGERBREAD_MR1:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/mopub/common/util/VersionCode;->HONEYCOMB:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR1:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/mopub/common/util/VersionCode;->ICE_CREAM_SANDWICH_MR1:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN_MR1:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/mopub/common/util/VersionCode;->JELLY_BEAN_MR2:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/mopub/common/util/VersionCode;->KITKAT:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/mopub/common/util/VersionCode;->CUR_DEVELOPMENT:Lcom/mopub/common/util/VersionCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/common/util/VersionCode;->b:[Lcom/mopub/common/util/VersionCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 42
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    iput p3, p0, Lcom/mopub/common/util/VersionCode;->a:I

    .line 44
    return-void
.end method

.method public static currentApiLevel()Lcom/mopub/common/util/VersionCode;
    .locals 6

    .prologue
    .line 30
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1034
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->values()[Lcom/mopub/common/util/VersionCode;

    move-result-object v3

    array-length v4, v3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_1

    aget-object v0, v3, v1

    .line 1035
    invoke-virtual {v0}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v5

    if-ne v5, v2, :cond_0

    .line 1036
    :goto_1
    return-object v0

    .line 1034
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 1039
    :cond_1
    sget-object v0, Lcom/mopub/common/util/VersionCode;->CUR_DEVELOPMENT:Lcom/mopub/common/util/VersionCode;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/util/VersionCode;
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/mopub/common/util/VersionCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/util/VersionCode;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/util/VersionCode;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/mopub/common/util/VersionCode;->b:[Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v0}, [Lcom/mopub/common/util/VersionCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/util/VersionCode;

    return-object v0
.end method


# virtual methods
.method public final getApiLevel()I
    .locals 1

    .prologue
    .line 47
    iget v0, p0, Lcom/mopub/common/util/VersionCode;->a:I

    return v0
.end method

.method public final isAtLeast(Lcom/mopub/common/util/VersionCode;)Z
    .locals 2

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v0

    invoke-virtual {p1}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isAtMost(Lcom/mopub/common/util/VersionCode;)Z
    .locals 2

    .prologue
    .line 51
    invoke-virtual {p0}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v0

    invoke-virtual {p1}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final isBelow(Lcom/mopub/common/util/VersionCode;)Z
    .locals 2

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v0

    invoke-virtual {p1}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
