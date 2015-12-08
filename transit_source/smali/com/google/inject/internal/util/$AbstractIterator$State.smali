.class final enum Lcom/google/inject/internal/util/$AbstractIterator$State;
.super Ljava/lang/Enum;
.source "AbstractIterator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$AbstractIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/internal/util/$AbstractIterator$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/internal/util/$AbstractIterator$State;

.field public static final enum DONE:Lcom/google/inject/internal/util/$AbstractIterator$State;

.field public static final enum FAILED:Lcom/google/inject/internal/util/$AbstractIterator$State;

.field public static final enum NOT_READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

.field public static final enum READY:Lcom/google/inject/internal/util/$AbstractIterator$State;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 64
    new-instance v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    const-string v1, "READY"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$AbstractIterator$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

    .line 67
    new-instance v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    const-string v1, "NOT_READY"

    invoke-direct {v0, v1, v3}, Lcom/google/inject/internal/util/$AbstractIterator$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->NOT_READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

    .line 70
    new-instance v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    const-string v1, "DONE"

    invoke-direct {v0, v1, v4}, Lcom/google/inject/internal/util/$AbstractIterator$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->DONE:Lcom/google/inject/internal/util/$AbstractIterator$State;

    .line 73
    new-instance v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v5}, Lcom/google/inject/internal/util/$AbstractIterator$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->FAILED:Lcom/google/inject/internal/util/$AbstractIterator$State;

    .line 62
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/google/inject/internal/util/$AbstractIterator$State;

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->NOT_READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->DONE:Lcom/google/inject/internal/util/$AbstractIterator$State;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->FAILED:Lcom/google/inject/internal/util/$AbstractIterator$State;

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->$VALUES:[Lcom/google/inject/internal/util/$AbstractIterator$State;

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
    .line 62
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/internal/util/$AbstractIterator$State;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 62
    const-class v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/util/$AbstractIterator$State;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/internal/util/$AbstractIterator$State;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/google/inject/internal/util/$AbstractIterator$State;->$VALUES:[Lcom/google/inject/internal/util/$AbstractIterator$State;

    invoke-virtual {v0}, [Lcom/google/inject/internal/util/$AbstractIterator$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/internal/util/$AbstractIterator$State;

    return-object v0
.end method
