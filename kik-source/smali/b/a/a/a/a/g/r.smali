.class public final enum Lb/a/a/a/a/g/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lb/a/a/a/a/g/r;

.field public static final enum b:Lb/a/a/a/a/g/r;

.field public static final enum c:Lb/a/a/a/a/g/r;

.field private static final synthetic d:[Lb/a/a/a/a/g/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 30
    new-instance v0, Lb/a/a/a/a/g/r;

    const-string v1, "USE_CACHE"

    invoke-direct {v0, v1, v2}, Lb/a/a/a/a/g/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/a/a/g/r;->a:Lb/a/a/a/a/g/r;

    .line 35
    new-instance v0, Lb/a/a/a/a/g/r;

    const-string v1, "SKIP_CACHE_LOOKUP"

    invoke-direct {v0, v1, v3}, Lb/a/a/a/a/g/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/a/a/g/r;->b:Lb/a/a/a/a/g/r;

    .line 40
    new-instance v0, Lb/a/a/a/a/g/r;

    const-string v1, "IGNORE_CACHE_EXPIRATION"

    invoke-direct {v0, v1, v4}, Lb/a/a/a/a/g/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb/a/a/a/a/g/r;->c:Lb/a/a/a/a/g/r;

    .line 25
    const/4 v0, 0x3

    new-array v0, v0, [Lb/a/a/a/a/g/r;

    sget-object v1, Lb/a/a/a/a/g/r;->a:Lb/a/a/a/a/g/r;

    aput-object v1, v0, v2

    sget-object v1, Lb/a/a/a/a/g/r;->b:Lb/a/a/a/a/g/r;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/a/a/a/g/r;->c:Lb/a/a/a/a/g/r;

    aput-object v1, v0, v4

    sput-object v0, Lb/a/a/a/a/g/r;->d:[Lb/a/a/a/a/g/r;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/a/a/a/g/r;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lb/a/a/a/a/g/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/g/r;

    return-object v0
.end method

.method public static values()[Lb/a/a/a/a/g/r;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lb/a/a/a/a/g/r;->d:[Lb/a/a/a/a/g/r;

    invoke-virtual {v0}, [Lb/a/a/a/a/g/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/a/a/a/g/r;

    return-object v0
.end method
