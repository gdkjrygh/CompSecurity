.class final enum Lcom/google/a/d/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/a/d/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/google/a/d/d;

.field public static final enum b:Lcom/google/a/d/d;

.field public static final enum c:Lcom/google/a/d/d;

.field public static final enum d:Lcom/google/a/d/d;

.field public static final enum e:Lcom/google/a/d/d;

.field public static final enum f:Lcom/google/a/d/d;

.field public static final enum g:Lcom/google/a/d/d;

.field public static final enum h:Lcom/google/a/d/d;

.field private static final synthetic i:[Lcom/google/a/d/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 31
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "EMPTY_ARRAY"

    invoke-direct {v0, v1, v3}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->a:Lcom/google/a/d/d;

    .line 37
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "NONEMPTY_ARRAY"

    invoke-direct {v0, v1, v4}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->b:Lcom/google/a/d/d;

    .line 43
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "EMPTY_OBJECT"

    invoke-direct {v0, v1, v5}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    .line 49
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "DANGLING_NAME"

    invoke-direct {v0, v1, v6}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->d:Lcom/google/a/d/d;

    .line 55
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "NONEMPTY_OBJECT"

    invoke-direct {v0, v1, v7}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    .line 60
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "EMPTY_DOCUMENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->f:Lcom/google/a/d/d;

    .line 65
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "NONEMPTY_DOCUMENT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->g:Lcom/google/a/d/d;

    .line 70
    new-instance v0, Lcom/google/a/d/d;

    const-string v1, "CLOSED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/google/a/d/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/a/d/d;->h:Lcom/google/a/d/d;

    .line 25
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/google/a/d/d;

    sget-object v1, Lcom/google/a/d/d;->a:Lcom/google/a/d/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/a/d/d;->b:Lcom/google/a/d/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/a/d/d;->c:Lcom/google/a/d/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/a/d/d;->d:Lcom/google/a/d/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/a/d/d;->e:Lcom/google/a/d/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/google/a/d/d;->f:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/a/d/d;->g:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/google/a/d/d;->h:Lcom/google/a/d/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/a/d/d;->i:[Lcom/google/a/d/d;

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
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/a/d/d;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/google/a/d/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/a/d/d;

    return-object v0
.end method

.method public static values()[Lcom/google/a/d/d;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/google/a/d/d;->i:[Lcom/google/a/d/d;

    invoke-virtual {v0}, [Lcom/google/a/d/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/a/d/d;

    return-object v0
.end method
