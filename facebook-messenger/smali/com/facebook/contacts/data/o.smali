.class public final enum Lcom/facebook/contacts/data/o;
.super Ljava/lang/Enum;
.source "DbInsertContactHandler.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/data/o;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/data/o;

.field public static final enum INSERT:Lcom/facebook/contacts/data/o;

.field public static final enum REPLACE_ALL:Lcom/facebook/contacts/data/o;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 69
    new-instance v0, Lcom/facebook/contacts/data/o;

    const-string v1, "REPLACE_ALL"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/data/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/o;->REPLACE_ALL:Lcom/facebook/contacts/data/o;

    .line 70
    new-instance v0, Lcom/facebook/contacts/data/o;

    const-string v1, "INSERT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/data/o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/data/o;->INSERT:Lcom/facebook/contacts/data/o;

    .line 68
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/contacts/data/o;

    sget-object v1, Lcom/facebook/contacts/data/o;->REPLACE_ALL:Lcom/facebook/contacts/data/o;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/data/o;->INSERT:Lcom/facebook/contacts/data/o;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/contacts/data/o;->$VALUES:[Lcom/facebook/contacts/data/o;

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
    .line 68
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/data/o;
    .locals 1

    .prologue
    .line 68
    const-class v0, Lcom/facebook/contacts/data/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/data/o;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/data/o;
    .locals 1

    .prologue
    .line 68
    sget-object v0, Lcom/facebook/contacts/data/o;->$VALUES:[Lcom/facebook/contacts/data/o;

    invoke-virtual {v0}, [Lcom/facebook/contacts/data/o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/data/o;

    return-object v0
.end method
