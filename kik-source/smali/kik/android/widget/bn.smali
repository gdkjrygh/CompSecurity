.class public final enum Lkik/android/widget/bn;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lkik/android/widget/bn;

.field public static final enum b:Lkik/android/widget/bn;

.field public static final enum c:Lkik/android/widget/bn;

.field private static final synthetic e:[Lkik/android/widget/bn;


# instance fields
.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 8
    new-instance v0, Lkik/android/widget/bn;

    const-string v1, "TRENDING"

    invoke-direct {v0, v1, v2, v2}, Lkik/android/widget/bn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkik/android/widget/bn;->a:Lkik/android/widget/bn;

    new-instance v0, Lkik/android/widget/bn;

    const-string v1, "FEATURED"

    invoke-direct {v0, v1, v3, v3}, Lkik/android/widget/bn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkik/android/widget/bn;->b:Lkik/android/widget/bn;

    new-instance v0, Lkik/android/widget/bn;

    const-string v1, "SEARCH"

    invoke-direct {v0, v1, v4, v4}, Lkik/android/widget/bn;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lkik/android/widget/bn;->c:Lkik/android/widget/bn;

    .line 6
    const/4 v0, 0x3

    new-array v0, v0, [Lkik/android/widget/bn;

    sget-object v1, Lkik/android/widget/bn;->a:Lkik/android/widget/bn;

    aput-object v1, v0, v2

    sget-object v1, Lkik/android/widget/bn;->b:Lkik/android/widget/bn;

    aput-object v1, v0, v3

    sget-object v1, Lkik/android/widget/bn;->c:Lkik/android/widget/bn;

    aput-object v1, v0, v4

    sput-object v0, Lkik/android/widget/bn;->e:[Lkik/android/widget/bn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 14
    iput p3, p0, Lkik/android/widget/bn;->d:I

    .line 15
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lkik/android/widget/bn;
    .locals 1

    .prologue
    .line 6
    const-class v0, Lkik/android/widget/bn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lkik/android/widget/bn;

    return-object v0
.end method

.method public static values()[Lkik/android/widget/bn;
    .locals 1

    .prologue
    .line 6
    sget-object v0, Lkik/android/widget/bn;->e:[Lkik/android/widget/bn;

    invoke-virtual {v0}, [Lkik/android/widget/bn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkik/android/widget/bn;

    return-object v0
.end method
