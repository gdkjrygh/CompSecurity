.class final Lcom/google/common/base/Optional$Absent;
.super Lcom/google/common/base/Optional;
.source "Optional.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/base/Optional",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/google/common/base/Optional$Absent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 212
    new-instance v0, Lcom/google/common/base/Optional$Absent;

    invoke-direct {v0}, Lcom/google/common/base/Optional$Absent;-><init>()V

    sput-object v0, Lcom/google/common/base/Optional$Absent;->INSTANCE:Lcom/google/common/base/Optional$Absent;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/common/base/Optional;-><init>(Lcom/google/common/base/Optional$1;)V

    return-void
.end method

.method static synthetic access$000()Lcom/google/common/base/Optional$Absent;
    .locals 1

    .prologue
    .line 211
    sget-object v0, Lcom/google/common/base/Optional$Absent;->INSTANCE:Lcom/google/common/base/Optional$Absent;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 240
    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 219
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "value is absent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 244
    const v0, 0x598df91c

    return v0
.end method

.method public isPresent()Z
    .locals 1

    .prologue
    .line 215
    const/4 v0, 0x0

    return v0
.end method

.method public or(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 223
    const-string v0, "use orNull() instead of or(null)"

    invoke-static {p1, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public orNull()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 236
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 248
    const-string v0, "Optional.absent()"

    return-object v0
.end method
