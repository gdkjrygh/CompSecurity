.class public final enum Lkik/a/d/a/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lkik/a/d/a/d$a;

.field public static final enum b:Lkik/a/d/a/d$a;

.field public static final enum c:Lkik/a/d/a/d$a;

.field public static final enum d:Lkik/a/d/a/d$a;

.field private static final synthetic e:[Lkik/a/d/a/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 12
    new-instance v0, Lkik/a/d/a/d$a;

    const-string v1, "ADDRESS_BOOK_MATCHING"

    invoke-direct {v0, v1, v2}, Lkik/a/d/a/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/d$a;->a:Lkik/a/d/a/d$a;

    new-instance v0, Lkik/a/d/a/d$a;

    const-string v1, "EXPLICIT_USERNAME_SEARCH"

    invoke-direct {v0, v1, v3}, Lkik/a/d/a/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/d$a;->b:Lkik/a/d/a/d$a;

    new-instance v0, Lkik/a/d/a/d$a;

    const-string v1, "INLINE_USERNAME_SEARCH"

    invoke-direct {v0, v1, v4}, Lkik/a/d/a/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/d$a;->c:Lkik/a/d/a/d$a;

    new-instance v0, Lkik/a/d/a/d$a;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v5}, Lkik/a/d/a/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkik/a/d/a/d$a;->d:Lkik/a/d/a/d$a;

    .line 11
    const/4 v0, 0x4

    new-array v0, v0, [Lkik/a/d/a/d$a;

    sget-object v1, Lkik/a/d/a/d$a;->a:Lkik/a/d/a/d$a;

    aput-object v1, v0, v2

    sget-object v1, Lkik/a/d/a/d$a;->b:Lkik/a/d/a/d$a;

    aput-object v1, v0, v3

    sget-object v1, Lkik/a/d/a/d$a;->c:Lkik/a/d/a/d$a;

    aput-object v1, v0, v4

    sget-object v1, Lkik/a/d/a/d$a;->d:Lkik/a/d/a/d$a;

    aput-object v1, v0, v5

    sput-object v0, Lkik/a/d/a/d$a;->e:[Lkik/a/d/a/d$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/a/d/a/d$a;
    .locals 1

    .prologue
    .line 11
    const-class v0, Lkik/a/d/a/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/d$a;

    return-object v0
.end method

.method public static values()[Lkik/a/d/a/d$a;
    .locals 1

    .prologue
    .line 11
    sget-object v0, Lkik/a/d/a/d$a;->e:[Lkik/a/d/a/d$a;

    invoke-virtual {v0}, [Lkik/a/d/a/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/a/d/a/d$a;

    return-object v0
.end method
