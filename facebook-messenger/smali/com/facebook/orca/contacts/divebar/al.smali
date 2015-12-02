.class public final enum Lcom/facebook/orca/contacts/divebar/al;
.super Ljava/lang/Enum;
.source "DivebarLoader.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/contacts/divebar/al;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum MOBILE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

.field public static final enum TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 208
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "FAVORITE_FRIENDS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    .line 209
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "TOP_FRIENDS"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    .line 210
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "ONLINE_FRIENDS"

    invoke-direct {v0, v1, v5}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    .line 211
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "MOBILE_FRIENDS"

    invoke-direct {v0, v1, v6}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->MOBILE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    .line 212
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "OTHER_CONTACTS"

    invoke-direct {v0, v1, v7}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    .line 213
    new-instance v0, Lcom/facebook/orca/contacts/divebar/al;

    const-string v1, "TOP_GROUPS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/al;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    .line 207
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/orca/contacts/divebar/al;

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->FAVORITE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->TOP_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->ONLINE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->MOBILE_FRIENDS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/orca/contacts/divebar/al;->OTHER_CONTACTS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/orca/contacts/divebar/al;->TOP_GROUPS:Lcom/facebook/orca/contacts/divebar/al;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/contacts/divebar/al;->$VALUES:[Lcom/facebook/orca/contacts/divebar/al;

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
    .line 207
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/contacts/divebar/al;
    .locals 1

    .prologue
    .line 207
    const-class v0, Lcom/facebook/orca/contacts/divebar/al;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/al;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/contacts/divebar/al;
    .locals 1

    .prologue
    .line 207
    sget-object v0, Lcom/facebook/orca/contacts/divebar/al;->$VALUES:[Lcom/facebook/orca/contacts/divebar/al;

    invoke-virtual {v0}, [Lcom/facebook/orca/contacts/divebar/al;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/divebar/al;

    return-object v0
.end method
