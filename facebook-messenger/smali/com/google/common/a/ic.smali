.class abstract enum Lcom/google/common/a/ic;
.super Ljava/lang/Enum;
.source "MapMaker.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/ic;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/ic;

.field public static final enum COLLECTED:Lcom/google/common/a/ic;

.field public static final enum EXPIRED:Lcom/google/common/a/ic;

.field public static final enum EXPLICIT:Lcom/google/common/a/ic;

.field public static final enum REPLACED:Lcom/google/common/a/ic;

.field public static final enum SIZE:Lcom/google/common/a/ic;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 847
    new-instance v0, Lcom/google/common/a/id;

    const-string v1, "EXPLICIT"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/id;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ic;->EXPLICIT:Lcom/google/common/a/ic;

    .line 860
    new-instance v0, Lcom/google/common/a/ie;

    const-string v1, "REPLACED"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/ie;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ic;->REPLACED:Lcom/google/common/a/ic;

    .line 872
    new-instance v0, Lcom/google/common/a/if;

    const-string v1, "COLLECTED"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/if;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ic;->COLLECTED:Lcom/google/common/a/ic;

    .line 883
    new-instance v0, Lcom/google/common/a/ig;

    const-string v1, "EXPIRED"

    invoke-direct {v0, v1, v5}, Lcom/google/common/a/ig;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ic;->EXPIRED:Lcom/google/common/a/ic;

    .line 894
    new-instance v0, Lcom/google/common/a/ih;

    const-string v1, "SIZE"

    invoke-direct {v0, v1, v6}, Lcom/google/common/a/ih;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ic;->SIZE:Lcom/google/common/a/ic;

    .line 842
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/common/a/ic;

    sget-object v1, Lcom/google/common/a/ic;->EXPLICIT:Lcom/google/common/a/ic;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/a/ic;->REPLACED:Lcom/google/common/a/ic;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/ic;->COLLECTED:Lcom/google/common/a/ic;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/common/a/ic;->EXPIRED:Lcom/google/common/a/ic;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/common/a/ic;->SIZE:Lcom/google/common/a/ic;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/common/a/ic;->$VALUES:[Lcom/google/common/a/ic;

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
    .line 842
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/a/hz;)V
    .locals 0

    .prologue
    .line 842
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/ic;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/ic;
    .locals 1

    .prologue
    .line 842
    const-class v0, Lcom/google/common/a/ic;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ic;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/ic;
    .locals 1

    .prologue
    .line 842
    sget-object v0, Lcom/google/common/a/ic;->$VALUES:[Lcom/google/common/a/ic;

    invoke-virtual {v0}, [Lcom/google/common/a/ic;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/ic;

    return-object v0
.end method


# virtual methods
.method abstract wasEvicted()Z
.end method
