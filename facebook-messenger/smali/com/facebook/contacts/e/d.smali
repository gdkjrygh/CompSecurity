.class public final enum Lcom/facebook/contacts/e/d;
.super Ljava/lang/Enum;
.source "DbContactIteratorFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/e/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/e/d;

.field public static final enum NAME:Lcom/facebook/contacts/e/d;

.field public static final enum UNORDERED:Lcom/facebook/contacts/e/d;


# instance fields
.field private providerOrderBy:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 41
    new-instance v0, Lcom/facebook/contacts/e/d;

    const-string v1, "UNORDERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/contacts/e/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/e/d;->UNORDERED:Lcom/facebook/contacts/e/d;

    .line 42
    new-instance v0, Lcom/facebook/contacts/e/d;

    const-string v1, "NAME"

    const-string v2, "sort_name_key"

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/contacts/e/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/facebook/contacts/e/d;->NAME:Lcom/facebook/contacts/e/d;

    .line 40
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/e/d;

    sget-object v1, Lcom/facebook/contacts/e/d;->UNORDERED:Lcom/facebook/contacts/e/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/e/d;->NAME:Lcom/facebook/contacts/e/d;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/contacts/e/d;->$VALUES:[Lcom/facebook/contacts/e/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 45
    iput-object p3, p0, Lcom/facebook/contacts/e/d;->providerOrderBy:Ljava/lang/String;

    .line 46
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/contacts/e/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/contacts/e/d;->providerOrderBy:Ljava/lang/String;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/e/d;
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/contacts/e/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/e/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/e/d;
    .locals 1

    .prologue
    .line 40
    sget-object v0, Lcom/facebook/contacts/e/d;->$VALUES:[Lcom/facebook/contacts/e/d;

    invoke-virtual {v0}, [Lcom/facebook/contacts/e/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/e/d;

    return-object v0
.end method
