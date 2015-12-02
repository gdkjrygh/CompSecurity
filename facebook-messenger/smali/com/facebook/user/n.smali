.class public final enum Lcom/facebook/user/n;
.super Ljava/lang/Enum;
.source "User.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/user/n;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/user/n;

.field public static final enum ADDRESS_BOOK:Lcom/facebook/user/n;

.field public static final enum EMAIL:Lcom/facebook/user/n;

.field public static final enum FACEBOOK:Lcom/facebook/user/n;

.field public static final enum FACEBOOK_CONTACT:Lcom/facebook/user/n;

.field public static final enum FACEBOOK_OBJECT:Lcom/facebook/user/n;

.field public static final enum PHONE_NUMBER:Lcom/facebook/user/n;


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
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "FACEBOOK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    .line 26
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "ADDRESS_BOOK"

    invoke-direct {v0, v1, v4}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    .line 27
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "PHONE_NUMBER"

    invoke-direct {v0, v1, v5}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    .line 28
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "FACEBOOK_OBJECT"

    invoke-direct {v0, v1, v6}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->FACEBOOK_OBJECT:Lcom/facebook/user/n;

    .line 29
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "EMAIL"

    invoke-direct {v0, v1, v7}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    .line 30
    new-instance v0, Lcom/facebook/user/n;

    const-string v1, "FACEBOOK_CONTACT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/user/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    .line 24
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/facebook/user/n;

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK_OBJECT:Lcom/facebook/user/n;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/user/n;->EMAIL:Lcom/facebook/user/n;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK_CONTACT:Lcom/facebook/user/n;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/user/n;->$VALUES:[Lcom/facebook/user/n;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/user/n;
    .locals 1

    .prologue
    .line 24
    const-class v0, Lcom/facebook/user/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/n;

    return-object v0
.end method

.method public static values()[Lcom/facebook/user/n;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lcom/facebook/user/n;->$VALUES:[Lcom/facebook/user/n;

    invoke-virtual {v0}, [Lcom/facebook/user/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/user/n;

    return-object v0
.end method
