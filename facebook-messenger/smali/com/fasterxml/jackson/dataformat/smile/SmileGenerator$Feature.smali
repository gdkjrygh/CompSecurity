.class public final enum Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;
.super Ljava/lang/Enum;
.source "SmileGenerator.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

.field public static final enum CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

.field public static final enum CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

.field public static final enum ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

.field public static final enum WRITE_END_MARKER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

.field public static final enum WRITE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;


# instance fields
.field protected final _defaultState:Z

.field protected final _mask:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 37
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    const-string v1, "WRITE_HEADER"

    invoke-direct {v0, v1, v3, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    .line 48
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    const-string v1, "WRITE_END_MARKER"

    invoke-direct {v0, v1, v2, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_END_MARKER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    .line 60
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    const-string v1, "ENCODE_BINARY_AS_7BIT"

    invoke-direct {v0, v1, v4, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    .line 70
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    const-string v1, "CHECK_SHARED_NAMES"

    invoke-direct {v0, v1, v5, v2}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    .line 83
    new-instance v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    const-string v1, "CHECK_SHARED_STRING_VALUES"

    invoke-direct {v0, v1, v6, v3}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    .line 27
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_HEADER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    aput-object v1, v0, v3

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->WRITE_END_MARKER:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    aput-object v1, v0, v2

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ENCODE_BINARY_AS_7BIT:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    aput-object v1, v0, v4

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_NAMES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    aput-object v1, v0, v5

    sget-object v1, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->CHECK_SHARED_STRING_VALUES:Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    aput-object v1, v0, v6

    sput-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->$VALUES:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .prologue
    .line 104
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 105
    iput-boolean p3, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->_defaultState:Z

    .line 106
    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->ordinal()I

    move-result v1

    shl-int/2addr v0, v1

    iput v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->_mask:I

    .line 107
    return-void
.end method

.method public static collectDefaults()I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 96
    invoke-static {}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->values()[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    move-result-object v2

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v4, v2, v1

    .line 97
    invoke-virtual {v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->enabledByDefault()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 98
    invoke-virtual {v4}, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->getMask()I

    move-result v4

    or-int/2addr v0, v4

    .line 96
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 101
    :cond_1
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;
    .locals 1

    .prologue
    .line 27
    const-class v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    return-object v0
.end method

.method public static values()[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;
    .locals 1

    .prologue
    .line 27
    sget-object v0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->$VALUES:[Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    invoke-virtual {v0}, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;

    return-object v0
.end method


# virtual methods
.method public enabledByDefault()Z
    .locals 1

    .prologue
    .line 109
    iget-boolean v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->_defaultState:Z

    return v0
.end method

.method public getMask()I
    .locals 1

    .prologue
    .line 110
    iget v0, p0, Lcom/fasterxml/jackson/dataformat/smile/SmileGenerator$Feature;->_mask:I

    return v0
.end method
