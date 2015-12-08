.class synthetic Lcom/google/inject/internal/util/$AbstractIterator$1;
.super Ljava/lang/Object;
.source "AbstractIterator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$AbstractIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$google$inject$internal$util$AbstractIterator$State:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 118
    invoke-static {}, Lcom/google/inject/internal/util/$AbstractIterator$State;->values()[Lcom/google/inject/internal/util/$AbstractIterator$State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/inject/internal/util/$AbstractIterator$1;->$SwitchMap$com$google$inject$internal$util$AbstractIterator$State:[I

    :try_start_0
    sget-object v0, Lcom/google/inject/internal/util/$AbstractIterator$1;->$SwitchMap$com$google$inject$internal$util$AbstractIterator$State:[I

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->DONE:Lcom/google/inject/internal/util/$AbstractIterator$State;

    invoke-virtual {v1}, Lcom/google/inject/internal/util/$AbstractIterator$State;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    :try_start_1
    sget-object v0, Lcom/google/inject/internal/util/$AbstractIterator$1;->$SwitchMap$com$google$inject$internal$util$AbstractIterator$State:[I

    sget-object v1, Lcom/google/inject/internal/util/$AbstractIterator$State;->READY:Lcom/google/inject/internal/util/$AbstractIterator$State;

    invoke-virtual {v1}, Lcom/google/inject/internal/util/$AbstractIterator$State;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
