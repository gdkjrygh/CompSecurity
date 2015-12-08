.class public final enum Lcom/splunk/mint/MintLogLevel;
.super Ljava/lang/Enum;
.source "MintLogLevel.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/splunk/mint/MintLogLevel;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/splunk/mint/MintLogLevel;

.field public static final enum Debug:Lcom/splunk/mint/MintLogLevel;

.field public static final enum Error:Lcom/splunk/mint/MintLogLevel;

.field public static final enum Info:Lcom/splunk/mint/MintLogLevel;

.field public static final enum Verbose:Lcom/splunk/mint/MintLogLevel;

.field public static final enum Warning:Lcom/splunk/mint/MintLogLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/splunk/mint/MintLogLevel;

    const-string v1, "Verbose"

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/MintLogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->Verbose:Lcom/splunk/mint/MintLogLevel;

    new-instance v0, Lcom/splunk/mint/MintLogLevel;

    const-string v1, "Debug"

    invoke-direct {v0, v1, v3}, Lcom/splunk/mint/MintLogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->Debug:Lcom/splunk/mint/MintLogLevel;

    new-instance v0, Lcom/splunk/mint/MintLogLevel;

    const-string v1, "Info"

    invoke-direct {v0, v1, v4}, Lcom/splunk/mint/MintLogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->Info:Lcom/splunk/mint/MintLogLevel;

    new-instance v0, Lcom/splunk/mint/MintLogLevel;

    const-string v1, "Warning"

    invoke-direct {v0, v1, v5}, Lcom/splunk/mint/MintLogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->Warning:Lcom/splunk/mint/MintLogLevel;

    new-instance v0, Lcom/splunk/mint/MintLogLevel;

    const-string v1, "Error"

    invoke-direct {v0, v1, v6}, Lcom/splunk/mint/MintLogLevel;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->Error:Lcom/splunk/mint/MintLogLevel;

    .line 6
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/splunk/mint/MintLogLevel;

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Verbose:Lcom/splunk/mint/MintLogLevel;

    aput-object v1, v0, v2

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Debug:Lcom/splunk/mint/MintLogLevel;

    aput-object v1, v0, v3

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Info:Lcom/splunk/mint/MintLogLevel;

    aput-object v1, v0, v4

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Warning:Lcom/splunk/mint/MintLogLevel;

    aput-object v1, v0, v5

    sget-object v1, Lcom/splunk/mint/MintLogLevel;->Error:Lcom/splunk/mint/MintLogLevel;

    aput-object v1, v0, v6

    sput-object v0, Lcom/splunk/mint/MintLogLevel;->$VALUES:[Lcom/splunk/mint/MintLogLevel;

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
    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/splunk/mint/MintLogLevel;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 6
    const-class v0, Lcom/splunk/mint/MintLogLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/splunk/mint/MintLogLevel;

    return-object v0
.end method

.method public static values()[Lcom/splunk/mint/MintLogLevel;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lcom/splunk/mint/MintLogLevel;->$VALUES:[Lcom/splunk/mint/MintLogLevel;

    invoke-virtual {v0}, [Lcom/splunk/mint/MintLogLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/splunk/mint/MintLogLevel;

    return-object v0
.end method
