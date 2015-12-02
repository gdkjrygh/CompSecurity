.class public final enum Lcom/facebook/contacts/picker/m;
.super Ljava/lang/Enum;
.source "ContactPickerFilterResult.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/picker/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/picker/m;

.field public static final enum EMPTY_CONSTRAINT:Lcom/facebook/contacts/picker/m;

.field public static final enum EXCEPTION:Lcom/facebook/contacts/picker/m;

.field public static final enum OK:Lcom/facebook/contacts/picker/m;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 20
    new-instance v0, Lcom/facebook/contacts/picker/m;

    const-string v1, "OK"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/picker/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/m;->OK:Lcom/facebook/contacts/picker/m;

    .line 23
    new-instance v0, Lcom/facebook/contacts/picker/m;

    const-string v1, "EMPTY_CONSTRAINT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/picker/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/m;->EMPTY_CONSTRAINT:Lcom/facebook/contacts/picker/m;

    .line 26
    new-instance v0, Lcom/facebook/contacts/picker/m;

    const-string v1, "EXCEPTION"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/picker/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/picker/m;->EXCEPTION:Lcom/facebook/contacts/picker/m;

    .line 18
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/contacts/picker/m;

    sget-object v1, Lcom/facebook/contacts/picker/m;->OK:Lcom/facebook/contacts/picker/m;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/picker/m;->EMPTY_CONSTRAINT:Lcom/facebook/contacts/picker/m;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/picker/m;->EXCEPTION:Lcom/facebook/contacts/picker/m;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/contacts/picker/m;->$VALUES:[Lcom/facebook/contacts/picker/m;

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
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/picker/m;
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/contacts/picker/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/m;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/picker/m;
    .locals 1

    .prologue
    .line 18
    sget-object v0, Lcom/facebook/contacts/picker/m;->$VALUES:[Lcom/facebook/contacts/picker/m;

    invoke-virtual {v0}, [Lcom/facebook/contacts/picker/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/picker/m;

    return-object v0
.end method
