.class public final enum Lcom/facebook/contacts/c/e;
.super Ljava/lang/Enum;
.source "GraphQLContactsQueryBuilder.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/c/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/c/e;

.field public static final enum DELTA:Lcom/facebook/contacts/c/e;

.field public static final enum FULL:Lcom/facebook/contacts/c/e;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 33
    new-instance v0, Lcom/facebook/contacts/c/e;

    const-string v1, "FULL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/c/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/c/e;->FULL:Lcom/facebook/contacts/c/e;

    .line 34
    new-instance v0, Lcom/facebook/contacts/c/e;

    const-string v1, "DELTA"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/c/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/c/e;->DELTA:Lcom/facebook/contacts/c/e;

    .line 32
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/c/e;

    sget-object v1, Lcom/facebook/contacts/c/e;->FULL:Lcom/facebook/contacts/c/e;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/c/e;->DELTA:Lcom/facebook/contacts/c/e;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/c/e;->$VALUES:[Lcom/facebook/contacts/c/e;

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
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/c/e;
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/contacts/c/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/c/e;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/c/e;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/facebook/contacts/c/e;->$VALUES:[Lcom/facebook/contacts/c/e;

    invoke-virtual {v0}, [Lcom/facebook/contacts/c/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/c/e;

    return-object v0
.end method
