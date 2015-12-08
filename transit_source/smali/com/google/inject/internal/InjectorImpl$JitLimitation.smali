.class final enum Lcom/google/inject/internal/InjectorImpl$JitLimitation;
.super Ljava/lang/Enum;
.source "InjectorImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "JitLimitation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/internal/InjectorImpl$JitLimitation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/internal/InjectorImpl$JitLimitation;

.field public static final enum EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

.field public static final enum NEW_OR_EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

.field public static final enum NO_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 94
    new-instance v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    const-string v1, "NO_JIT"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/InjectorImpl$JitLimitation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NO_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    .line 96
    new-instance v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    const-string v1, "EXISTING_JIT"

    invoke-direct {v0, v1, v3}, Lcom/google/inject/internal/InjectorImpl$JitLimitation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    .line 98
    new-instance v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    const-string v1, "NEW_OR_EXISTING_JIT"

    invoke-direct {v0, v1, v4}, Lcom/google/inject/internal/InjectorImpl$JitLimitation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NEW_OR_EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    .line 92
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    sget-object v1, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NO_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->NEW_OR_EXISTING_JIT:Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->$VALUES:[Lcom/google/inject/internal/InjectorImpl$JitLimitation;

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
    .line 92
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/internal/InjectorImpl$JitLimitation;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 92
    const-class v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/internal/InjectorImpl$JitLimitation;
    .locals 1

    .prologue
    .line 92
    sget-object v0, Lcom/google/inject/internal/InjectorImpl$JitLimitation;->$VALUES:[Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    invoke-virtual {v0}, [Lcom/google/inject/internal/InjectorImpl$JitLimitation;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/internal/InjectorImpl$JitLimitation;

    return-object v0
.end method
