.class public final enum Lcom/facebook/orca/contacts/picker/y;
.super Ljava/lang/Enum;
.source "ContactPickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/contacts/picker/y;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/contacts/picker/y;

.field public static final enum ADD_MEMBERS:Lcom/facebook/orca/contacts/picker/y;

.field public static final enum CREATE_THREAD:Lcom/facebook/orca/contacts/picker/y;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 84
    new-instance v0, Lcom/facebook/orca/contacts/picker/y;

    const-string v1, "CREATE_THREAD"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/picker/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/y;->CREATE_THREAD:Lcom/facebook/orca/contacts/picker/y;

    .line 85
    new-instance v0, Lcom/facebook/orca/contacts/picker/y;

    const-string v1, "ADD_MEMBERS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/contacts/picker/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/y;->ADD_MEMBERS:Lcom/facebook/orca/contacts/picker/y;

    .line 83
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/contacts/picker/y;

    sget-object v1, Lcom/facebook/orca/contacts/picker/y;->CREATE_THREAD:Lcom/facebook/orca/contacts/picker/y;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/contacts/picker/y;->ADD_MEMBERS:Lcom/facebook/orca/contacts/picker/y;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/contacts/picker/y;->$VALUES:[Lcom/facebook/orca/contacts/picker/y;

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
    .line 83
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/contacts/picker/y;
    .locals 1

    .prologue
    .line 83
    const-class v0, Lcom/facebook/orca/contacts/picker/y;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/y;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/contacts/picker/y;
    .locals 1

    .prologue
    .line 83
    sget-object v0, Lcom/facebook/orca/contacts/picker/y;->$VALUES:[Lcom/facebook/orca/contacts/picker/y;

    invoke-virtual {v0}, [Lcom/facebook/orca/contacts/picker/y;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/picker/y;

    return-object v0
.end method
