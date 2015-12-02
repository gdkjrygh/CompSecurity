.class final enum Lcom/facebook/contacts/upload/h;
.super Ljava/lang/Enum;
.source "ContactsUploadServiceHandler.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/upload/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/upload/h;

.field public static final enum LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

.field public static final enum REMOTE_CONTACT_IDS:Lcom/facebook/contacts/upload/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 93
    new-instance v0, Lcom/facebook/contacts/upload/h;

    const-string v1, "LOCAL_CONTACT_IDS"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/upload/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/upload/h;->LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    .line 94
    new-instance v0, Lcom/facebook/contacts/upload/h;

    const-string v1, "REMOTE_CONTACT_IDS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/upload/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/upload/h;->REMOTE_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    .line 92
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/upload/h;

    sget-object v1, Lcom/facebook/contacts/upload/h;->LOCAL_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/upload/h;->REMOTE_CONTACT_IDS:Lcom/facebook/contacts/upload/h;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/upload/h;->$VALUES:[Lcom/facebook/contacts/upload/h;

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
    .line 92
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/upload/h;
    .locals 1

    .prologue
    .line 92
    const-class v0, Lcom/facebook/contacts/upload/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/upload/h;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/upload/h;
    .locals 1

    .prologue
    .line 92
    sget-object v0, Lcom/facebook/contacts/upload/h;->$VALUES:[Lcom/facebook/contacts/upload/h;

    invoke-virtual {v0}, [Lcom/facebook/contacts/upload/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/upload/h;

    return-object v0
.end method
