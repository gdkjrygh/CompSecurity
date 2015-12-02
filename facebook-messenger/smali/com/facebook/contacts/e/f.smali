.class final enum Lcom/facebook/contacts/e/f;
.super Ljava/lang/Enum;
.source "PhoneUserIterator.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/e/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/e/f;

.field public static final enum EXCLUDE:Lcom/facebook/contacts/e/f;

.field public static final enum INCLUDE:Lcom/facebook/contacts/e/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 72
    new-instance v0, Lcom/facebook/contacts/e/f;

    const-string v1, "INCLUDE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/e/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/e/f;->INCLUDE:Lcom/facebook/contacts/e/f;

    .line 73
    new-instance v0, Lcom/facebook/contacts/e/f;

    const-string v1, "EXCLUDE"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/e/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/e/f;->EXCLUDE:Lcom/facebook/contacts/e/f;

    .line 71
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/e/f;

    sget-object v1, Lcom/facebook/contacts/e/f;->INCLUDE:Lcom/facebook/contacts/e/f;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/e/f;->EXCLUDE:Lcom/facebook/contacts/e/f;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/e/f;->$VALUES:[Lcom/facebook/contacts/e/f;

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
    .line 71
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/e/f;
    .locals 1

    .prologue
    .line 71
    const-class v0, Lcom/facebook/contacts/e/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/e/f;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/e/f;
    .locals 1

    .prologue
    .line 71
    sget-object v0, Lcom/facebook/contacts/e/f;->$VALUES:[Lcom/facebook/contacts/e/f;

    invoke-virtual {v0}, [Lcom/facebook/contacts/e/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/e/f;

    return-object v0
.end method
