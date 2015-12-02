.class public final enum Lcom/facebook/orca/contacts/divebar/aw;
.super Ljava/lang/Enum;
.source "DivebarNearbyFriendsParams.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/contacts/divebar/aw;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/contacts/divebar/aw;

.field public static final enum LIST:Lcom/facebook/orca/contacts/divebar/aw;

.field public static final enum UPSELL:Lcom/facebook/orca/contacts/divebar/aw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 18
    new-instance v0, Lcom/facebook/orca/contacts/divebar/aw;

    const-string v1, "UPSELL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/aw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/aw;->UPSELL:Lcom/facebook/orca/contacts/divebar/aw;

    .line 19
    new-instance v0, Lcom/facebook/orca/contacts/divebar/aw;

    const-string v1, "LIST"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/contacts/divebar/aw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/aw;->LIST:Lcom/facebook/orca/contacts/divebar/aw;

    .line 17
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/contacts/divebar/aw;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/aw;->UPSELL:Lcom/facebook/orca/contacts/divebar/aw;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/contacts/divebar/aw;->LIST:Lcom/facebook/orca/contacts/divebar/aw;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/contacts/divebar/aw;->$VALUES:[Lcom/facebook/orca/contacts/divebar/aw;

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
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/contacts/divebar/aw;
    .locals 1

    .prologue
    .line 17
    const-class v0, Lcom/facebook/orca/contacts/divebar/aw;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/aw;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/contacts/divebar/aw;
    .locals 1

    .prologue
    .line 17
    sget-object v0, Lcom/facebook/orca/contacts/divebar/aw;->$VALUES:[Lcom/facebook/orca/contacts/divebar/aw;

    invoke-virtual {v0}, [Lcom/facebook/orca/contacts/divebar/aw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/divebar/aw;

    return-object v0
.end method
