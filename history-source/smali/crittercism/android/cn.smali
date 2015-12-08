.class public final enum Lcrittercism/android/cn;
.super Ljava/lang/Enum;


# static fields
.field public static final enum a:Lcrittercism/android/cn;

.field public static final enum b:Lcrittercism/android/cn;

.field public static final enum c:Lcrittercism/android/cn;

.field public static final enum d:Lcrittercism/android/cn;

.field public static final enum e:Lcrittercism/android/cn;

.field private static final synthetic f:[Lcrittercism/android/cn;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lcrittercism/android/cn;

    const-string v1, "Generic"

    invoke-direct {v0, v1, v2}, Lcrittercism/android/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcrittercism/android/cn;->a:Lcrittercism/android/cn;

    .line 9
    new-instance v0, Lcrittercism/android/cn;

    const-string v1, "NSURLConnection"

    invoke-direct {v0, v1, v3}, Lcrittercism/android/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcrittercism/android/cn;->b:Lcrittercism/android/cn;

    .line 10
    new-instance v0, Lcrittercism/android/cn;

    const-string v1, "ASI"

    invoke-direct {v0, v1, v4}, Lcrittercism/android/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcrittercism/android/cn;->c:Lcrittercism/android/cn;

    .line 11
    new-instance v0, Lcrittercism/android/cn;

    const-string v1, "Android"

    invoke-direct {v0, v1, v5}, Lcrittercism/android/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    .line 12
    new-instance v0, Lcrittercism/android/cn;

    const-string v1, "XMLHttpRequest"

    invoke-direct {v0, v1, v6}, Lcrittercism/android/cn;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcrittercism/android/cn;->e:Lcrittercism/android/cn;

    .line 3
    const/4 v0, 0x5

    new-array v0, v0, [Lcrittercism/android/cn;

    sget-object v1, Lcrittercism/android/cn;->a:Lcrittercism/android/cn;

    aput-object v1, v0, v2

    sget-object v1, Lcrittercism/android/cn;->b:Lcrittercism/android/cn;

    aput-object v1, v0, v3

    sget-object v1, Lcrittercism/android/cn;->c:Lcrittercism/android/cn;

    aput-object v1, v0, v4

    sget-object v1, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    aput-object v1, v0, v5

    sget-object v1, Lcrittercism/android/cn;->e:Lcrittercism/android/cn;

    aput-object v1, v0, v6

    sput-object v0, Lcrittercism/android/cn;->f:[Lcrittercism/android/cn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)I
    .locals 2

    .prologue
    .line 14
    sget-object v0, Lcrittercism/android/cn;->d:Lcrittercism/android/cn;

    invoke-virtual {v0}, Lcrittercism/android/cn;->ordinal()I

    move-result v0

    .line 15
    instance-of v1, p0, Lcom/crittercism/error/CRXMLHttpRequestException;

    if-eqz v1, :cond_0

    .line 19
    sget-object v0, Lcrittercism/android/cn;->e:Lcrittercism/android/cn;

    invoke-virtual {v0}, Lcrittercism/android/cn;->ordinal()I

    move-result v0

    .line 21
    :cond_0
    return v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcrittercism/android/cn;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 3
    const-class v0, Lcrittercism/android/cn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcrittercism/android/cn;

    return-object v0
.end method

.method public static values()[Lcrittercism/android/cn;
    .locals 1

    .prologue
    .line 3
    sget-object v0, Lcrittercism/android/cn;->f:[Lcrittercism/android/cn;

    invoke-virtual {v0}, [Lcrittercism/android/cn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcrittercism/android/cn;

    return-object v0
.end method
