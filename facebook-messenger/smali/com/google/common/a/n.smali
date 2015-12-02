.class final enum Lcom/google/common/a/n;
.super Ljava/lang/Enum;
.source "AbstractIterator.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/n;

.field public static final enum DONE:Lcom/google/common/a/n;

.field public static final enum FAILED:Lcom/google/common/a/n;

.field public static final enum NOT_READY:Lcom/google/common/a/n;

.field public static final enum READY:Lcom/google/common/a/n;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 70
    new-instance v0, Lcom/google/common/a/n;

    const-string v1, "READY"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/n;->READY:Lcom/google/common/a/n;

    .line 73
    new-instance v0, Lcom/google/common/a/n;

    const-string v1, "NOT_READY"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/n;->NOT_READY:Lcom/google/common/a/n;

    .line 76
    new-instance v0, Lcom/google/common/a/n;

    const-string v1, "DONE"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/n;->DONE:Lcom/google/common/a/n;

    .line 79
    new-instance v0, Lcom/google/common/a/n;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v5}, Lcom/google/common/a/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/n;->FAILED:Lcom/google/common/a/n;

    .line 68
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/google/common/a/n;

    sget-object v1, Lcom/google/common/a/n;->READY:Lcom/google/common/a/n;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/a/n;->NOT_READY:Lcom/google/common/a/n;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/n;->DONE:Lcom/google/common/a/n;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/common/a/n;->FAILED:Lcom/google/common/a/n;

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/common/a/n;->$VALUES:[Lcom/google/common/a/n;

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
    .line 68
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/n;
    .locals 1

    .prologue
    .line 68
    const-class v0, Lcom/google/common/a/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/n;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/n;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/google/common/a/n;->$VALUES:[Lcom/google/common/a/n;

    invoke-virtual {v0}, [Lcom/google/common/a/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/n;

    return-object v0
.end method
