.class final enum Lcom/qihoo/security/json/b;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/json/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/qihoo/security/json/b;

.field public static final enum b:Lcom/qihoo/security/json/b;

.field public static final enum c:Lcom/qihoo/security/json/b;

.field public static final enum d:Lcom/qihoo/security/json/b;

.field public static final enum e:Lcom/qihoo/security/json/b;

.field public static final enum f:Lcom/qihoo/security/json/b;

.field public static final enum g:Lcom/qihoo/security/json/b;

.field public static final enum h:Lcom/qihoo/security/json/b;

.field private static final synthetic i:[Lcom/qihoo/security/json/b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 28
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "EMPTY_ARRAY"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->a:Lcom/qihoo/security/json/b;

    .line 34
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "NONEMPTY_ARRAY"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->b:Lcom/qihoo/security/json/b;

    .line 40
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "EMPTY_OBJECT"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->c:Lcom/qihoo/security/json/b;

    .line 46
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "DANGLING_NAME"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->d:Lcom/qihoo/security/json/b;

    .line 52
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "NONEMPTY_OBJECT"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->e:Lcom/qihoo/security/json/b;

    .line 57
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "EMPTY_DOCUMENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->f:Lcom/qihoo/security/json/b;

    .line 62
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "NONEMPTY_DOCUMENT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->g:Lcom/qihoo/security/json/b;

    .line 67
    new-instance v0, Lcom/qihoo/security/json/b;

    const-string/jumbo v1, "CLOSED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/json/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/json/b;->h:Lcom/qihoo/security/json/b;

    .line 22
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/qihoo/security/json/b;

    sget-object v1, Lcom/qihoo/security/json/b;->a:Lcom/qihoo/security/json/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/json/b;->b:Lcom/qihoo/security/json/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/json/b;->c:Lcom/qihoo/security/json/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/json/b;->d:Lcom/qihoo/security/json/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/json/b;->e:Lcom/qihoo/security/json/b;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/json/b;->f:Lcom/qihoo/security/json/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/qihoo/security/json/b;->g:Lcom/qihoo/security/json/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/qihoo/security/json/b;->h:Lcom/qihoo/security/json/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/json/b;->i:[Lcom/qihoo/security/json/b;

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
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/json/b;
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/qihoo/security/json/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/json/b;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/json/b;
    .locals 1

    .prologue
    .line 22
    sget-object v0, Lcom/qihoo/security/json/b;->i:[Lcom/qihoo/security/json/b;

    invoke-virtual {v0}, [Lcom/qihoo/security/json/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/json/b;

    return-object v0
.end method
