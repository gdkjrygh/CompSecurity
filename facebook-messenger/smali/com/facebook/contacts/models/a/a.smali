.class public final enum Lcom/facebook/contacts/models/a/a;
.super Ljava/lang/Enum;
.source "ContactProfileType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/contacts/models/a/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/contacts/models/a/a;

.field public static ALL_TYPES:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public static CONNECTIONS_TYPES:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public static FACEBOOK_FRIENDS_TYPES:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public static MESSAGABLE_TYPES:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum PAGE:Lcom/facebook/contacts/models/a/a;

.field public static PAGES_TYPES:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum UNMATCHED:Lcom/facebook/contacts/models/a/a;

.field public static final enum USER:Lcom/facebook/contacts/models/a/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcom/facebook/contacts/models/a/a;

    const-string v1, "USER"

    invoke-direct {v0, v1, v2}, Lcom/facebook/contacts/models/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    .line 9
    new-instance v0, Lcom/facebook/contacts/models/a/a;

    const-string v1, "UNMATCHED"

    invoke-direct {v0, v1, v3}, Lcom/facebook/contacts/models/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    .line 10
    new-instance v0, Lcom/facebook/contacts/models/a/a;

    const-string v1, "PAGE"

    invoke-direct {v0, v1, v4}, Lcom/facebook/contacts/models/a/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    .line 7
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/contacts/models/a/a;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/contacts/models/a/a;->$VALUES:[Lcom/facebook/contacts/models/a/a;

    .line 11
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    sget-object v2, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0, v1, v2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/a/a;->ALL_TYPES:Lcom/google/common/a/es;

    .line 13
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/a/a;->CONNECTIONS_TYPES:Lcom/google/common/a/es;

    .line 15
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0, v1}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/a/a;->MESSAGABLE_TYPES:Lcom/google/common/a/es;

    .line 17
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/a/a;->FACEBOOK_FRIENDS_TYPES:Lcom/google/common/a/es;

    .line 19
    sget-object v0, Lcom/facebook/contacts/models/a/a;->PAGE:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    sput-object v0, Lcom/facebook/contacts/models/a/a;->PAGES_TYPES:Lcom/google/common/a/es;

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
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/contacts/models/a/a;
    .locals 1

    .prologue
    .line 7
    const-class v0, Lcom/facebook/contacts/models/a/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/models/a/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/contacts/models/a/a;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lcom/facebook/contacts/models/a/a;->$VALUES:[Lcom/facebook/contacts/models/a/a;

    invoke-virtual {v0}, [Lcom/facebook/contacts/models/a/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/contacts/models/a/a;

    return-object v0
.end method
