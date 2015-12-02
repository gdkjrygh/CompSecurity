.class public abstract enum Lcom/google/common/a/kz;
.super Ljava/lang/Enum;
.source "SortedLists.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/kz;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/kz;

.field public static final enum INVERTED_INSERTION_INDEX:Lcom/google/common/a/kz;

.field public static final enum NEXT_HIGHER:Lcom/google/common/a/kz;

.field public static final enum NEXT_LOWER:Lcom/google/common/a/kz;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 144
    new-instance v0, Lcom/google/common/a/la;

    const-string v1, "NEXT_LOWER"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/la;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/kz;->NEXT_LOWER:Lcom/google/common/a/kz;

    .line 154
    new-instance v0, Lcom/google/common/a/lb;

    const-string v1, "NEXT_HIGHER"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/lb;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/kz;->NEXT_HIGHER:Lcom/google/common/a/kz;

    .line 172
    new-instance v0, Lcom/google/common/a/lc;

    const-string v1, "INVERTED_INSERTION_INDEX"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/lc;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/kz;->INVERTED_INSERTION_INDEX:Lcom/google/common/a/kz;

    .line 139
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/common/a/kz;

    sget-object v1, Lcom/google/common/a/kz;->NEXT_LOWER:Lcom/google/common/a/kz;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/a/kz;->NEXT_HIGHER:Lcom/google/common/a/kz;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/kz;->INVERTED_INSERTION_INDEX:Lcom/google/common/a/kz;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/common/a/kz;->$VALUES:[Lcom/google/common/a/kz;

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
    .line 139
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/a/ky;)V
    .locals 0

    .prologue
    .line 139
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/kz;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/kz;
    .locals 1

    .prologue
    .line 139
    const-class v0, Lcom/google/common/a/kz;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/kz;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/kz;
    .locals 1

    .prologue
    .line 139
    sget-object v0, Lcom/google/common/a/kz;->$VALUES:[Lcom/google/common/a/kz;

    invoke-virtual {v0}, [Lcom/google/common/a/kz;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/kz;

    return-object v0
.end method


# virtual methods
.method abstract resultIndex(I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I)I"
        }
    .end annotation
.end method
