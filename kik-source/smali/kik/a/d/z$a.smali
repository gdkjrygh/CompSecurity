.class public final enum Lkik/a/d/z$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum a:Lkik/a/d/z$a;

.field public static final enum b:Lkik/a/d/z$a;

.field private static final synthetic e:[Lkik/a/d/z$a;


# instance fields
.field c:Ljava/lang/String;

.field d:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 9
    new-instance v0, Lkik/a/d/z$a;

    const-string v1, "TEXT"

    const-string v2, "text"

    invoke-direct {v0, v1, v4, v2, v4}, Lkik/a/d/z$a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lkik/a/d/z$a;->a:Lkik/a/d/z$a;

    new-instance v0, Lkik/a/d/z$a;

    const-string v1, "UNSUPPORTED"

    const-string v2, "unsupported"

    const/4 v3, -0x1

    invoke-direct {v0, v1, v5, v2, v3}, Lkik/a/d/z$a;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lkik/a/d/z$a;->b:Lkik/a/d/z$a;

    .line 8
    const/4 v0, 0x2

    new-array v0, v0, [Lkik/a/d/z$a;

    sget-object v1, Lkik/a/d/z$a;->a:Lkik/a/d/z$a;

    aput-object v1, v0, v4

    sget-object v1, Lkik/a/d/z$a;->b:Lkik/a/d/z$a;

    aput-object v1, v0, v5

    sput-object v0, Lkik/a/d/z$a;->e:[Lkik/a/d/z$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    iput-object p3, p0, Lkik/a/d/z$a;->c:Ljava/lang/String;

    .line 17
    iput p4, p0, Lkik/a/d/z$a;->d:I

    .line 18
    return-void
.end method

.method public static a(I)Lkik/a/d/z$a;
    .locals 5

    .prologue
    .line 32
    invoke-static {}, Lkik/a/d/z$a;->values()[Lkik/a/d/z$a;

    move-result-object v2

    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_1

    aget-object v0, v2, v1

    .line 33
    iget v4, v0, Lkik/a/d/z$a;->d:I

    if-ne v4, p0, :cond_0

    .line 37
    :goto_1
    return-object v0

    .line 32
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 37
    :cond_1
    sget-object v0, Lkik/a/d/z$a;->b:Lkik/a/d/z$a;

    goto :goto_1
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/a/d/z$a;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lkik/a/d/z$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/a/d/z$a;

    return-object v0
.end method

.method public static values()[Lkik/a/d/z$a;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lkik/a/d/z$a;->e:[Lkik/a/d/z$a;

    invoke-virtual {v0}, [Lkik/a/d/z$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/a/d/z$a;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lkik/a/d/z$a;->d:I

    return v0
.end method
