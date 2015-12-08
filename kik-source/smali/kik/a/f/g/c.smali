.class public final enum Lkik/a/f/g/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lkik/a/f/g/c;

.field public static final enum b:Lkik/a/f/g/c;

.field public static final enum c:Lkik/a/f/g/c;

.field public static final enum d:Lkik/a/f/g/c;

.field private static final synthetic e:[Lkik/a/f/g/c;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lkik/a/f/g/c;

    const-string v1, "PLAINTEXT"

    invoke-direct {v0, v1, v2}, Lkik/a/f/g/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/f/g/c;->a:Lkik/a/f/g/c;

    .line 17
    new-instance v0, Lkik/a/f/g/c;

    const-string v1, "TLS"

    invoke-direct {v0, v1, v3}, Lkik/a/f/g/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    .line 22
    new-instance v0, Lkik/a/f/g/c;

    const-string v1, "KIK56"

    invoke-direct {v0, v1, v4}, Lkik/a/f/g/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/f/g/c;->c:Lkik/a/f/g/c;

    .line 27
    new-instance v0, Lkik/a/f/g/c;

    const-string v1, "TLS_INSECURE"

    invoke-direct {v0, v1, v5}, Lkik/a/f/g/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/f/g/c;->d:Lkik/a/f/g/c;

    .line 7
    const/4 v0, 0x4

    new-array v0, v0, [Lkik/a/f/g/c;

    sget-object v1, Lkik/a/f/g/c;->a:Lkik/a/f/g/c;

    aput-object v1, v0, v2

    sget-object v1, Lkik/a/f/g/c;->b:Lkik/a/f/g/c;

    aput-object v1, v0, v3

    sget-object v1, Lkik/a/f/g/c;->c:Lkik/a/f/g/c;

    aput-object v1, v0, v4

    sget-object v1, Lkik/a/f/g/c;->d:Lkik/a/f/g/c;

    aput-object v1, v0, v5

    sput-object v0, Lkik/a/f/g/c;->e:[Lkik/a/f/g/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/a/f/g/c;
    .locals 1

    .prologue
    .line 7
    const-class v0, Lkik/a/f/g/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/a/f/g/c;

    return-object v0
.end method

.method public static values()[Lkik/a/f/g/c;
    .locals 1

    .prologue
    .line 7
    sget-object v0, Lkik/a/f/g/c;->e:[Lkik/a/f/g/c;

    invoke-virtual {v0}, [Lkik/a/f/g/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/a/f/g/c;

    return-object v0
.end method
