.class public final enum Lcom/facebook/contacts/picker/ah;
.super Ljava/lang/Enum;
.source "ContactPickerUserRow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/picker/ah;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/picker/ah;

.field public static final enum ACTIVE_FRIENDS:Lcom/facebook/contacts/picker/ah;

.field public static final enum AUTO_COMPLETE:Lcom/facebook/contacts/picker/ah;

.field public static final enum FAVORITES:Lcom/facebook/contacts/picker/ah;

.field public static final enum NEARBY:Lcom/facebook/contacts/picker/ah;

.field public static final enum SEARCH_RESULT:Lcom/facebook/contacts/picker/ah;

.field public static final enum SUGGESTIONS:Lcom/facebook/contacts/picker/ah;

.field public static final enum TOP_FRIENDS:Lcom/facebook/contacts/picker/ah;

.field public static final enum UNKNOWN:Lcom/facebook/contacts/picker/ah;


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
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->UNKNOWN:Lcom/facebook/contacts/picker/ah;

    .line 26
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "FAVORITES"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->FAVORITES:Lcom/facebook/contacts/picker/ah;

    .line 27
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "TOP_FRIENDS"

    invoke-direct {v0, v1, v5}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->TOP_FRIENDS:Lcom/facebook/contacts/picker/ah;

    .line 28
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "ACTIVE_FRIENDS"

    invoke-direct {v0, v1, v6}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->ACTIVE_FRIENDS:Lcom/facebook/contacts/picker/ah;

    .line 29
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "SEARCH_RESULT"

    invoke-direct {v0, v1, v7}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->SEARCH_RESULT:Lcom/facebook/contacts/picker/ah;

    .line 30
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "AUTO_COMPLETE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->AUTO_COMPLETE:Lcom/facebook/contacts/picker/ah;

    .line 31
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "SUGGESTIONS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->SUGGESTIONS:Lcom/facebook/contacts/picker/ah;

    .line 32
    new-instance v0, Lcom/facebook/contacts/picker/ah;

    const-string v1, "NEARBY"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/picker/ah;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/ah;->NEARBY:Lcom/facebook/contacts/picker/ah;

    .line 24
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/facebook/contacts/picker/ah;

    sget-object v1, Lcom/facebook/contacts/picker/ah;->UNKNOWN:Lcom/facebook/contacts/picker/ah;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/picker/ah;->FAVORITES:Lcom/facebook/contacts/picker/ah;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/contacts/picker/ah;->TOP_FRIENDS:Lcom/facebook/contacts/picker/ah;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/contacts/picker/ah;->ACTIVE_FRIENDS:Lcom/facebook/contacts/picker/ah;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/contacts/picker/ah;->SEARCH_RESULT:Lcom/facebook/contacts/picker/ah;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/contacts/picker/ah;->AUTO_COMPLETE:Lcom/facebook/contacts/picker/ah;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/contacts/picker/ah;->SUGGESTIONS:Lcom/facebook/contacts/picker/ah;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/contacts/picker/ah;->NEARBY:Lcom/facebook/contacts/picker/ah;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/contacts/picker/ah;->$VALUES:[Lcom/facebook/contacts/picker/ah;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/picker/ah;
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/contacts/picker/ah;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/ah;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/picker/ah;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/contacts/picker/ah;->$VALUES:[Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0}, [Lcom/facebook/contacts/picker/ah;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/picker/ah;

    return-object v0
.end method
