.class public abstract enum Lcom/google/common/a/ld;
.super Ljava/lang/Enum;
.source "SortedLists.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/ld;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/ld;

.field public static final enum ANY_PRESENT:Lcom/google/common/a/ld;

.field public static final enum FIRST_AFTER:Lcom/google/common/a/ld;

.field public static final enum FIRST_PRESENT:Lcom/google/common/a/ld;

.field public static final enum LAST_BEFORE:Lcom/google/common/a/ld;

.field public static final enum LAST_PRESENT:Lcom/google/common/a/ld;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 53
    new-instance v0, Lcom/google/common/a/le;

    const-string v1, "ANY_PRESENT"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/le;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    .line 63
    new-instance v0, Lcom/google/common/a/lf;

    const-string v1, "LAST_PRESENT"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/lf;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ld;->LAST_PRESENT:Lcom/google/common/a/ld;

    .line 87
    new-instance v0, Lcom/google/common/a/lg;

    const-string v1, "FIRST_PRESENT"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/lg;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ld;->FIRST_PRESENT:Lcom/google/common/a/ld;

    .line 113
    new-instance v0, Lcom/google/common/a/lh;

    const-string v1, "FIRST_AFTER"

    invoke-direct {v0, v1, v5}, Lcom/google/common/a/lh;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ld;->FIRST_AFTER:Lcom/google/common/a/ld;

    .line 124
    new-instance v0, Lcom/google/common/a/li;

    const-string v1, "LAST_BEFORE"

    invoke-direct {v0, v1, v6}, Lcom/google/common/a/li;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ld;->LAST_BEFORE:Lcom/google/common/a/ld;

    .line 48
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/google/common/a/ld;

    sget-object v1, Lcom/google/common/a/ld;->ANY_PRESENT:Lcom/google/common/a/ld;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/a/ld;->LAST_PRESENT:Lcom/google/common/a/ld;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/ld;->FIRST_PRESENT:Lcom/google/common/a/ld;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/common/a/ld;->FIRST_AFTER:Lcom/google/common/a/ld;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/common/a/ld;->LAST_BEFORE:Lcom/google/common/a/ld;

    aput-object v1, v0, v6

    sput-object v0, Lcom/google/common/a/ld;->$VALUES:[Lcom/google/common/a/ld;

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
    .line 48
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/a/ky;)V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/ld;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/ld;
    .locals 1

    .prologue
    .line 48
    const-class v0, Lcom/google/common/a/ld;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ld;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/ld;
    .locals 1

    .prologue
    .line 48
    sget-object v0, Lcom/google/common/a/ld;->$VALUES:[Lcom/google/common/a/ld;

    invoke-virtual {v0}, [Lcom/google/common/a/ld;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/ld;

    return-object v0
.end method


# virtual methods
.method abstract resultIndex(Ljava/util/Comparator;Ljava/lang/Object;Ljava/util/List;I)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator",
            "<-TE;>;TE;",
            "Ljava/util/List",
            "<+TE;>;I)I"
        }
    .end annotation
.end method
