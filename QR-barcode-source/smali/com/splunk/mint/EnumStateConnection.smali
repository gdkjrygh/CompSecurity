.class final enum Lcom/splunk/mint/EnumStateConnection;
.super Ljava/lang/Enum;
.source "EnumStateConnection.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/splunk/mint/EnumStateConnection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/splunk/mint/EnumStateConnection;

.field public static final enum NA:Lcom/splunk/mint/EnumStateConnection;

.field public static final enum NONE:Lcom/splunk/mint/EnumStateConnection;

.field public static final enum WiFi:Lcom/splunk/mint/EnumStateConnection;

.field public static final enum net_2G:Lcom/splunk/mint/EnumStateConnection;

.field public static final enum net_3G:Lcom/splunk/mint/EnumStateConnection;


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
    new-instance v0, Lcom/splunk/mint/EnumStateConnection;

    const-string v1, "WiFi"

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumStateConnection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->WiFi:Lcom/splunk/mint/EnumStateConnection;

    .line 9
    new-instance v0, Lcom/splunk/mint/EnumStateConnection;

    const-string v1, "net_3G"

    invoke-direct {v0, v1, v3}, Lcom/splunk/mint/EnumStateConnection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->net_3G:Lcom/splunk/mint/EnumStateConnection;

    .line 10
    new-instance v0, Lcom/splunk/mint/EnumStateConnection;

    const-string v1, "net_2G"

    invoke-direct {v0, v1, v4}, Lcom/splunk/mint/EnumStateConnection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->net_2G:Lcom/splunk/mint/EnumStateConnection;

    .line 11
    new-instance v0, Lcom/splunk/mint/EnumStateConnection;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v5}, Lcom/splunk/mint/EnumStateConnection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->NONE:Lcom/splunk/mint/EnumStateConnection;

    .line 12
    new-instance v0, Lcom/splunk/mint/EnumStateConnection;

    const-string v1, "NA"

    invoke-direct {v0, v1, v6}, Lcom/splunk/mint/EnumStateConnection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->NA:Lcom/splunk/mint/EnumStateConnection;

    .line 7
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/splunk/mint/EnumStateConnection;

    sget-object v1, Lcom/splunk/mint/EnumStateConnection;->WiFi:Lcom/splunk/mint/EnumStateConnection;

    aput-object v1, v0, v2

    sget-object v1, Lcom/splunk/mint/EnumStateConnection;->net_3G:Lcom/splunk/mint/EnumStateConnection;

    aput-object v1, v0, v3

    sget-object v1, Lcom/splunk/mint/EnumStateConnection;->net_2G:Lcom/splunk/mint/EnumStateConnection;

    aput-object v1, v0, v4

    sget-object v1, Lcom/splunk/mint/EnumStateConnection;->NONE:Lcom/splunk/mint/EnumStateConnection;

    aput-object v1, v0, v5

    sget-object v1, Lcom/splunk/mint/EnumStateConnection;->NA:Lcom/splunk/mint/EnumStateConnection;

    aput-object v1, v0, v6

    sput-object v0, Lcom/splunk/mint/EnumStateConnection;->$VALUES:[Lcom/splunk/mint/EnumStateConnection;

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

.method public static valueOf(Ljava/lang/String;)Lcom/splunk/mint/EnumStateConnection;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 7
    const-class v0, Lcom/splunk/mint/EnumStateConnection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/splunk/mint/EnumStateConnection;

    return-object v0
.end method

.method public static values()[Lcom/splunk/mint/EnumStateConnection;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/splunk/mint/EnumStateConnection;->$VALUES:[Lcom/splunk/mint/EnumStateConnection;

    invoke-virtual {v0}, [Lcom/splunk/mint/EnumStateConnection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/splunk/mint/EnumStateConnection;

    return-object v0
.end method
