.class final enum Lcom/splunk/mint/EnumActionType;
.super Ljava/lang/Enum;
.source "EnumActionType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/splunk/mint/EnumActionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/splunk/mint/EnumActionType;

.field public static final enum error:Lcom/splunk/mint/EnumActionType;

.field public static final enum event:Lcom/splunk/mint/EnumActionType;

.field public static final enum gnip:Lcom/splunk/mint/EnumActionType;

.field public static final enum log:Lcom/splunk/mint/EnumActionType;

.field public static final enum network:Lcom/splunk/mint/EnumActionType;

.field public static final enum performance:Lcom/splunk/mint/EnumActionType;

.field public static final enum ping:Lcom/splunk/mint/EnumActionType;

.field public static final enum trstart:Lcom/splunk/mint/EnumActionType;

.field public static final enum trstop:Lcom/splunk/mint/EnumActionType;

.field public static final enum view:Lcom/splunk/mint/EnumActionType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 8
    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "error"

    invoke-direct {v0, v1, v3}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->error:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "event"

    invoke-direct {v0, v1, v4}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->event:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "ping"

    invoke-direct {v0, v1, v5}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "gnip"

    invoke-direct {v0, v1, v6}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->gnip:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "trstart"

    invoke-direct {v0, v1, v7}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->trstart:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "trstop"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->trstop:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "network"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->network:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "performance"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->performance:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "view"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->view:Lcom/splunk/mint/EnumActionType;

    new-instance v0, Lcom/splunk/mint/EnumActionType;

    const-string v1, "log"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/splunk/mint/EnumActionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/splunk/mint/EnumActionType;->log:Lcom/splunk/mint/EnumActionType;

    .line 7
    const/16 v0, 0xa

    new-array v0, v0, [Lcom/splunk/mint/EnumActionType;

    sget-object v1, Lcom/splunk/mint/EnumActionType;->error:Lcom/splunk/mint/EnumActionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/splunk/mint/EnumActionType;->event:Lcom/splunk/mint/EnumActionType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/splunk/mint/EnumActionType;->ping:Lcom/splunk/mint/EnumActionType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/splunk/mint/EnumActionType;->gnip:Lcom/splunk/mint/EnumActionType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/splunk/mint/EnumActionType;->trstart:Lcom/splunk/mint/EnumActionType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/splunk/mint/EnumActionType;->trstop:Lcom/splunk/mint/EnumActionType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/splunk/mint/EnumActionType;->network:Lcom/splunk/mint/EnumActionType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/splunk/mint/EnumActionType;->performance:Lcom/splunk/mint/EnumActionType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/splunk/mint/EnumActionType;->view:Lcom/splunk/mint/EnumActionType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/splunk/mint/EnumActionType;->log:Lcom/splunk/mint/EnumActionType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/splunk/mint/EnumActionType;->$VALUES:[Lcom/splunk/mint/EnumActionType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/splunk/mint/EnumActionType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 7
    const-class v0, Lcom/splunk/mint/EnumActionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/splunk/mint/EnumActionType;

    return-object v0
.end method

.method public static values()[Lcom/splunk/mint/EnumActionType;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/splunk/mint/EnumActionType;->$VALUES:[Lcom/splunk/mint/EnumActionType;

    invoke-virtual {v0}, [Lcom/splunk/mint/EnumActionType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/splunk/mint/EnumActionType;

    return-object v0
.end method
