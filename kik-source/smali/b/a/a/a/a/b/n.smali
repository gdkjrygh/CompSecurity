.class public final enum Lb/a/a/a/a/b/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lb/a/a/a/a/b/n;

.field public static final enum b:Lb/a/a/a/a/b/n;

.field public static final enum c:Lb/a/a/a/a/b/n;

.field public static final enum d:Lb/a/a/a/a/b/n;

.field private static final synthetic f:[Lb/a/a/a/a/b/n;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x0

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 27
    new-instance v0, Lb/a/a/a/a/b/n;

    const-string v1, "DEVELOPER"

    invoke-direct {v0, v1, v5, v2}, Lb/a/a/a/a/b/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/a/a/a/b/n;->a:Lb/a/a/a/a/b/n;

    new-instance v0, Lb/a/a/a/a/b/n;

    const-string v1, "USER_SIDELOAD"

    invoke-direct {v0, v1, v2, v3}, Lb/a/a/a/a/b/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/a/a/a/b/n;->b:Lb/a/a/a/a/b/n;

    new-instance v0, Lb/a/a/a/a/b/n;

    const-string v1, "TEST_DISTRIBUTION"

    invoke-direct {v0, v1, v3, v4}, Lb/a/a/a/a/b/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/a/a/a/b/n;->c:Lb/a/a/a/a/b/n;

    new-instance v0, Lb/a/a/a/a/b/n;

    const-string v1, "APP_STORE"

    invoke-direct {v0, v1, v4, v6}, Lb/a/a/a/a/b/n;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb/a/a/a/a/b/n;->d:Lb/a/a/a/a/b/n;

    .line 25
    new-array v0, v6, [Lb/a/a/a/a/b/n;

    sget-object v1, Lb/a/a/a/a/b/n;->a:Lb/a/a/a/a/b/n;

    aput-object v1, v0, v5

    sget-object v1, Lb/a/a/a/a/b/n;->b:Lb/a/a/a/a/b/n;

    aput-object v1, v0, v2

    sget-object v1, Lb/a/a/a/a/b/n;->c:Lb/a/a/a/a/b/n;

    aput-object v1, v0, v3

    sget-object v1, Lb/a/a/a/a/b/n;->d:Lb/a/a/a/a/b/n;

    aput-object v1, v0, v4

    sput-object v0, Lb/a/a/a/a/b/n;->f:[Lb/a/a/a/a/b/n;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput p3, p0, Lb/a/a/a/a/b/n;->e:I

    .line 35
    return-void
.end method

.method public static a(Ljava/lang/String;)Lb/a/a/a/a/b/n;
    .locals 1

    .prologue
    .line 51
    const-string v0, "io.crash.air"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 52
    sget-object v0, Lb/a/a/a/a/b/n;->c:Lb/a/a/a/a/b/n;

    .line 56
    :goto_0
    return-object v0

    .line 53
    :cond_0
    if-eqz p0, :cond_1

    .line 54
    sget-object v0, Lb/a/a/a/a/b/n;->d:Lb/a/a/a/a/b/n;

    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, Lb/a/a/a/a/b/n;->a:Lb/a/a/a/a/b/n;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lb/a/a/a/a/b/n;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lb/a/a/a/a/b/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/b/n;

    return-object v0
.end method

.method public static values()[Lb/a/a/a/a/b/n;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lb/a/a/a/a/b/n;->f:[Lb/a/a/a/a/b/n;

    invoke-virtual {v0}, [Lb/a/a/a/a/b/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb/a/a/a/a/b/n;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 38
    iget v0, p0, Lb/a/a/a/a/b/n;->e:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget v0, p0, Lb/a/a/a/a/b/n;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
