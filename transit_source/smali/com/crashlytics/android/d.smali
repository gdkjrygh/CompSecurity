.class abstract enum Lcom/crashlytics/android/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/crashlytics/android/aj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/crashlytics/android/d;",
        ">;",
        "Lcom/crashlytics/android/aj;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/crashlytics/android/d;

.field public static final enum b:Lcom/crashlytics/android/d;

.field public static final enum c:Lcom/crashlytics/android/d;

.field private static final synthetic d:[Lcom/crashlytics/android/d;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 56
    new-instance v0, Lcom/crashlytics/android/e;

    const-string v1, "GET"

    invoke-direct {v0, v1, v2}, Lcom/crashlytics/android/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/d;->a:Lcom/crashlytics/android/d;

    .line 62
    new-instance v0, Lcom/crashlytics/android/f;

    const-string v1, "POST"

    invoke-direct {v0, v1, v3}, Lcom/crashlytics/android/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/d;->b:Lcom/crashlytics/android/d;

    .line 68
    new-instance v0, Lcom/crashlytics/android/g;

    const-string v1, "PUT"

    invoke-direct {v0, v1, v4}, Lcom/crashlytics/android/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/crashlytics/android/d;->c:Lcom/crashlytics/android/d;

    .line 55
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/crashlytics/android/d;

    sget-object v1, Lcom/crashlytics/android/d;->a:Lcom/crashlytics/android/d;

    aput-object v1, v0, v2

    sget-object v1, Lcom/crashlytics/android/d;->b:Lcom/crashlytics/android/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/crashlytics/android/d;->c:Lcom/crashlytics/android/d;

    aput-object v1, v0, v4

    sput-object v0, Lcom/crashlytics/android/d;->d:[Lcom/crashlytics/android/d;

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
    .line 55
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IB)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Lcom/crashlytics/android/d;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/crashlytics/android/d;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 55
    const-class v0, Lcom/crashlytics/android/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/crashlytics/android/d;

    return-object v0
.end method

.method public static values()[Lcom/crashlytics/android/d;
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/crashlytics/android/d;->d:[Lcom/crashlytics/android/d;

    invoke-virtual {v0}, [Lcom/crashlytics/android/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/crashlytics/android/d;

    return-object v0
.end method
