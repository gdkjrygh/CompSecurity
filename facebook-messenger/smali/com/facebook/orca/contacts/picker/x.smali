.class public final enum Lcom/facebook/orca/contacts/picker/x;
.super Ljava/lang/Enum;
.source "ContactPickerFragment.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/contacts/picker/x;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/contacts/picker/x;

.field public static final enum ADDRESS_BOOK:Lcom/facebook/orca/contacts/picker/x;

.field public static final enum FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

.field public static final enum MERGED:Lcom/facebook/orca/contacts/picker/x;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 89
    new-instance v0, Lcom/facebook/orca/contacts/picker/x;

    const-string v1, "FACEBOOK_LIST"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/contacts/picker/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/x;->FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

    .line 90
    new-instance v0, Lcom/facebook/orca/contacts/picker/x;

    const-string v1, "ADDRESS_BOOK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/contacts/picker/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/x;->ADDRESS_BOOK:Lcom/facebook/orca/contacts/picker/x;

    .line 91
    new-instance v0, Lcom/facebook/orca/contacts/picker/x;

    const-string v1, "MERGED"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/contacts/picker/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/contacts/picker/x;->MERGED:Lcom/facebook/orca/contacts/picker/x;

    .line 88
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/contacts/picker/x;

    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->FACEBOOK_LIST:Lcom/facebook/orca/contacts/picker/x;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->ADDRESS_BOOK:Lcom/facebook/orca/contacts/picker/x;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/contacts/picker/x;->MERGED:Lcom/facebook/orca/contacts/picker/x;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/contacts/picker/x;->$VALUES:[Lcom/facebook/orca/contacts/picker/x;

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
    .line 88
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/contacts/picker/x;
    .locals 1

    .prologue
    .line 88
    const-class v0, Lcom/facebook/orca/contacts/picker/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/x;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/contacts/picker/x;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/facebook/orca/contacts/picker/x;->$VALUES:[Lcom/facebook/orca/contacts/picker/x;

    invoke-virtual {v0}, [Lcom/facebook/orca/contacts/picker/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/contacts/picker/x;

    return-object v0
.end method
