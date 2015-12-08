.class final enum Lcom/splunk/mint/EnumExceptionType;
.super Ljava/lang/Enum;
.source "EnumExceptionType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/splunk/mint/EnumExceptionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/splunk/mint/EnumExceptionType;

.field public static final enum HANDLED:Lcom/splunk/mint/EnumExceptionType;

.field public static final enum UNHANDLED:Lcom/splunk/mint/EnumExceptionType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/splunk/mint/EnumExceptionType;

    const-string v1, "HANDLED"

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumExceptionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumExceptionType;->HANDLED:Lcom/splunk/mint/EnumExceptionType;

    new-instance v0, Lcom/splunk/mint/EnumExceptionType;

    const-string v1, "UNHANDLED"

    invoke-direct {v0, v1, v3}, Lcom/splunk/mint/EnumExceptionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumExceptionType;->UNHANDLED:Lcom/splunk/mint/EnumExceptionType;

    .line 7
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/splunk/mint/EnumExceptionType;

    sget-object v1, Lcom/splunk/mint/EnumExceptionType;->HANDLED:Lcom/splunk/mint/EnumExceptionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/splunk/mint/EnumExceptionType;->UNHANDLED:Lcom/splunk/mint/EnumExceptionType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/splunk/mint/EnumExceptionType;->$VALUES:[Lcom/splunk/mint/EnumExceptionType;

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
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/splunk/mint/EnumExceptionType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 7
    const-class v0, Lcom/splunk/mint/EnumExceptionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/splunk/mint/EnumExceptionType;

    return-object v0
.end method

.method public static values()[Lcom/splunk/mint/EnumExceptionType;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/splunk/mint/EnumExceptionType;->$VALUES:[Lcom/splunk/mint/EnumExceptionType;

    invoke-virtual {v0}, [Lcom/splunk/mint/EnumExceptionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/splunk/mint/EnumExceptionType;

    return-object v0
.end method
