.class public final enum Lcom/facebook/contacts/server/c;
.super Ljava/lang/Enum;
.source "ContactInteractionEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/server/c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/server/c;

.field public static final enum CALL_RECEIVED:Lcom/facebook/contacts/server/c;

.field public static final enum CALL_SENT:Lcom/facebook/contacts/server/c;

.field public static final enum MMS_RECEIVED:Lcom/facebook/contacts/server/c;

.field public static final enum MMS_SENT:Lcom/facebook/contacts/server/c;

.field public static final enum SMS_RECEIVED:Lcom/facebook/contacts/server/c;

.field public static final enum SMS_SENT:Lcom/facebook/contacts/server/c;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 25
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "SMS_SENT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->SMS_SENT:Lcom/facebook/contacts/server/c;

    .line 26
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "SMS_RECEIVED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->SMS_RECEIVED:Lcom/facebook/contacts/server/c;

    .line 27
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "MMS_SENT"

    invoke-direct {v0, v1, v5}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->MMS_SENT:Lcom/facebook/contacts/server/c;

    .line 28
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "MMS_RECEIVED"

    invoke-direct {v0, v1, v6}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->MMS_RECEIVED:Lcom/facebook/contacts/server/c;

    .line 29
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "CALL_SENT"

    invoke-direct {v0, v1, v7}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->CALL_SENT:Lcom/facebook/contacts/server/c;

    .line 30
    new-instance v0, Lcom/facebook/contacts/server/c;

    const-string v1, "CALL_RECEIVED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/server/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/server/c;->CALL_RECEIVED:Lcom/facebook/contacts/server/c;

    .line 24
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/contacts/server/c;

    sget-object v1, Lcom/facebook/contacts/server/c;->SMS_SENT:Lcom/facebook/contacts/server/c;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/server/c;->SMS_RECEIVED:Lcom/facebook/contacts/server/c;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/contacts/server/c;->MMS_SENT:Lcom/facebook/contacts/server/c;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/contacts/server/c;->MMS_RECEIVED:Lcom/facebook/contacts/server/c;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/contacts/server/c;->CALL_SENT:Lcom/facebook/contacts/server/c;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/contacts/server/c;->CALL_RECEIVED:Lcom/facebook/contacts/server/c;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/contacts/server/c;->$VALUES:[Lcom/facebook/contacts/server/c;

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
    .line 24
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/server/c;
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/contacts/server/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/server/c;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/server/c;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/contacts/server/c;->$VALUES:[Lcom/facebook/contacts/server/c;

    invoke-virtual {v0}, [Lcom/facebook/contacts/server/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/server/c;

    return-object v0
.end method
