.class final enum Lorg/chromium/base/PerfTraceEvent$EventType;
.super Ljava/lang/Enum;
.source "PerfTraceEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/PerfTraceEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "EventType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/chromium/base/PerfTraceEvent$EventType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/chromium/base/PerfTraceEvent$EventType;

.field public static final enum FINISH:Lorg/chromium/base/PerfTraceEvent$EventType;

.field public static final enum INSTANT:Lorg/chromium/base/PerfTraceEvent$EventType;

.field public static final enum START:Lorg/chromium/base/PerfTraceEvent$EventType;


# instance fields
.field private final mTypeStr:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 46
    new-instance v0, Lorg/chromium/base/PerfTraceEvent$EventType;

    const-string v1, "START"

    const-string v2, "S"

    invoke-direct {v0, v1, v3, v2}, Lorg/chromium/base/PerfTraceEvent$EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/chromium/base/PerfTraceEvent$EventType;->START:Lorg/chromium/base/PerfTraceEvent$EventType;

    .line 47
    new-instance v0, Lorg/chromium/base/PerfTraceEvent$EventType;

    const-string v1, "FINISH"

    const-string v2, "F"

    invoke-direct {v0, v1, v4, v2}, Lorg/chromium/base/PerfTraceEvent$EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/chromium/base/PerfTraceEvent$EventType;->FINISH:Lorg/chromium/base/PerfTraceEvent$EventType;

    .line 48
    new-instance v0, Lorg/chromium/base/PerfTraceEvent$EventType;

    const-string v1, "INSTANT"

    const-string v2, "I"

    invoke-direct {v0, v1, v5, v2}, Lorg/chromium/base/PerfTraceEvent$EventType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lorg/chromium/base/PerfTraceEvent$EventType;->INSTANT:Lorg/chromium/base/PerfTraceEvent$EventType;

    .line 45
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/chromium/base/PerfTraceEvent$EventType;

    sget-object v1, Lorg/chromium/base/PerfTraceEvent$EventType;->START:Lorg/chromium/base/PerfTraceEvent$EventType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/chromium/base/PerfTraceEvent$EventType;->FINISH:Lorg/chromium/base/PerfTraceEvent$EventType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/chromium/base/PerfTraceEvent$EventType;->INSTANT:Lorg/chromium/base/PerfTraceEvent$EventType;

    aput-object v1, v0, v5

    sput-object v0, Lorg/chromium/base/PerfTraceEvent$EventType;->$VALUES:[Lorg/chromium/base/PerfTraceEvent$EventType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3, "typeStr"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 54
    iput-object p3, p0, Lorg/chromium/base/PerfTraceEvent$EventType;->mTypeStr:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/chromium/base/PerfTraceEvent$EventType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 45
    const-class v0, Lorg/chromium/base/PerfTraceEvent$EventType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/chromium/base/PerfTraceEvent$EventType;

    return-object v0
.end method

.method public static values()[Lorg/chromium/base/PerfTraceEvent$EventType;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lorg/chromium/base/PerfTraceEvent$EventType;->$VALUES:[Lorg/chromium/base/PerfTraceEvent$EventType;

    invoke-virtual {v0}, [Lorg/chromium/base/PerfTraceEvent$EventType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/chromium/base/PerfTraceEvent$EventType;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lorg/chromium/base/PerfTraceEvent$EventType;->mTypeStr:Ljava/lang/String;

    return-object v0
.end method
