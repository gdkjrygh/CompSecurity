.class public final enum Lcom/mopub/common/event/BaseEvent$SamplingRate;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/mopub/common/event/BaseEvent$SamplingRate;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

.field private static final synthetic b:[Lcom/mopub/common/event/BaseEvent$SamplingRate;


# instance fields
.field private final a:D


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 94
    new-instance v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const-string v1, "AD_REQUEST"

    invoke-direct {v0, v1}, Lcom/mopub/common/event/BaseEvent$SamplingRate;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    .line 93
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const/4 v1, 0x0

    sget-object v2, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    aput-object v2, v0, v1

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->b:[Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)V"
        }
    .end annotation

    .prologue
    .line 97
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 98
    const-wide v0, 0x3fb999999999999aL    # 0.1

    iput-wide v0, p0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->a:D

    .line 99
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$SamplingRate;
    .locals 1

    .prologue
    .line 93
    const-class v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-object v0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$SamplingRate;
    .locals 1

    .prologue
    .line 93
    sget-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->b:[Lcom/mopub/common/event/BaseEvent$SamplingRate;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$SamplingRate;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-object v0
.end method


# virtual methods
.method public final getSamplingRate()D
    .locals 2

    .prologue
    .line 102
    iget-wide v0, p0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->a:D

    return-wide v0
.end method
