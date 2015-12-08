.class final enum Lcom/mopub/nativeads/an;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/nativeads/an;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CALL_TO_ACTION:Lcom/mopub/nativeads/an;

.field public static final enum CLICK_DESTINATION:Lcom/mopub/nativeads/an;

.field public static final enum CLICK_TRACKER:Lcom/mopub/nativeads/an;

.field public static final enum FALLBACK:Lcom/mopub/nativeads/an;

.field public static final enum ICON_IMAGE:Lcom/mopub/nativeads/an;

.field public static final enum IMPRESSION_TRACKER:Lcom/mopub/nativeads/an;

.field public static final enum MAIN_IMAGE:Lcom/mopub/nativeads/an;

.field public static final enum STAR_RATING:Lcom/mopub/nativeads/an;

.field public static final enum TEXT:Lcom/mopub/nativeads/an;

.field public static final enum TITLE:Lcom/mopub/nativeads/an;

.field static final c:Ljava/util/Set;
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic d:[Lcom/mopub/nativeads/an;


# instance fields
.field final a:Ljava/lang/String;

.field final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v0, 0x0

    .line 41
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "IMPRESSION_TRACKER"

    const-string v3, "imptracker"

    invoke-direct {v1, v2, v0, v3, v5}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->IMPRESSION_TRACKER:Lcom/mopub/nativeads/an;

    .line 42
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "CLICK_TRACKER"

    const-string v3, "clktracker"

    invoke-direct {v1, v2, v5, v3, v5}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->CLICK_TRACKER:Lcom/mopub/nativeads/an;

    .line 44
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "TITLE"

    const-string v3, "title"

    invoke-direct {v1, v2, v6, v3, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->TITLE:Lcom/mopub/nativeads/an;

    .line 45
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "TEXT"

    const-string v3, "text"

    invoke-direct {v1, v2, v7, v3, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->TEXT:Lcom/mopub/nativeads/an;

    .line 46
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "MAIN_IMAGE"

    const-string v3, "mainimage"

    invoke-direct {v1, v2, v8, v3, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->MAIN_IMAGE:Lcom/mopub/nativeads/an;

    .line 47
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "ICON_IMAGE"

    const/4 v3, 0x5

    const-string v4, "iconimage"

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->ICON_IMAGE:Lcom/mopub/nativeads/an;

    .line 49
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "CLICK_DESTINATION"

    const/4 v3, 0x6

    const-string v4, "clk"

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->CLICK_DESTINATION:Lcom/mopub/nativeads/an;

    .line 50
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "FALLBACK"

    const/4 v3, 0x7

    const-string v4, "fallback"

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->FALLBACK:Lcom/mopub/nativeads/an;

    .line 51
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "CALL_TO_ACTION"

    const/16 v3, 0x8

    const-string v4, "ctatext"

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->CALL_TO_ACTION:Lcom/mopub/nativeads/an;

    .line 52
    new-instance v1, Lcom/mopub/nativeads/an;

    const-string v2, "STAR_RATING"

    const/16 v3, 0x9

    const-string v4, "starrating"

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/mopub/nativeads/an;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v1, Lcom/mopub/nativeads/an;->STAR_RATING:Lcom/mopub/nativeads/an;

    .line 40
    const/16 v1, 0xa

    new-array v1, v1, [Lcom/mopub/nativeads/an;

    sget-object v2, Lcom/mopub/nativeads/an;->IMPRESSION_TRACKER:Lcom/mopub/nativeads/an;

    aput-object v2, v1, v0

    sget-object v2, Lcom/mopub/nativeads/an;->CLICK_TRACKER:Lcom/mopub/nativeads/an;

    aput-object v2, v1, v5

    sget-object v2, Lcom/mopub/nativeads/an;->TITLE:Lcom/mopub/nativeads/an;

    aput-object v2, v1, v6

    sget-object v2, Lcom/mopub/nativeads/an;->TEXT:Lcom/mopub/nativeads/an;

    aput-object v2, v1, v7

    sget-object v2, Lcom/mopub/nativeads/an;->MAIN_IMAGE:Lcom/mopub/nativeads/an;

    aput-object v2, v1, v8

    const/4 v2, 0x5

    sget-object v3, Lcom/mopub/nativeads/an;->ICON_IMAGE:Lcom/mopub/nativeads/an;

    aput-object v3, v1, v2

    const/4 v2, 0x6

    sget-object v3, Lcom/mopub/nativeads/an;->CLICK_DESTINATION:Lcom/mopub/nativeads/an;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    sget-object v3, Lcom/mopub/nativeads/an;->FALLBACK:Lcom/mopub/nativeads/an;

    aput-object v3, v1, v2

    const/16 v2, 0x8

    sget-object v3, Lcom/mopub/nativeads/an;->CALL_TO_ACTION:Lcom/mopub/nativeads/an;

    aput-object v3, v1, v2

    const/16 v2, 0x9

    sget-object v3, Lcom/mopub/nativeads/an;->STAR_RATING:Lcom/mopub/nativeads/an;

    aput-object v3, v1, v2

    sput-object v1, Lcom/mopub/nativeads/an;->d:[Lcom/mopub/nativeads/an;

    .line 75
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    sput-object v1, Lcom/mopub/nativeads/an;->c:Ljava/util/Set;

    .line 77
    invoke-static {}, Lcom/mopub/nativeads/an;->values()[Lcom/mopub/nativeads/an;

    move-result-object v1

    array-length v2, v1

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 78
    iget-boolean v4, v3, Lcom/mopub/nativeads/an;->b:Z

    if-eqz v4, :cond_0

    .line 79
    sget-object v4, Lcom/mopub/nativeads/an;->c:Ljava/util/Set;

    iget-object v3, v3, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 82
    :cond_1
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .prologue
    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 58
    iput-object p3, p0, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    .line 59
    iput-boolean p4, p0, Lcom/mopub/nativeads/an;->b:Z

    .line 60
    return-void
.end method

.method static a(Ljava/lang/String;)Lcom/mopub/nativeads/an;
    .locals 5

    .prologue
    .line 64
    invoke-static {}, Lcom/mopub/nativeads/an;->values()[Lcom/mopub/nativeads/an;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 65
    iget-object v4, v0, Lcom/mopub/nativeads/an;->a:Ljava/lang/String;

    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 70
    :goto_1
    return-object v0

    .line 64
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 70
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/nativeads/an;
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/mopub/nativeads/an;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/nativeads/an;

    return-object v0
.end method

.method public static values()[Lcom/mopub/nativeads/an;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/mopub/nativeads/an;->d:[Lcom/mopub/nativeads/an;

    invoke-virtual {v0}, [Lcom/mopub/nativeads/an;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/nativeads/an;

    return-object v0
.end method
