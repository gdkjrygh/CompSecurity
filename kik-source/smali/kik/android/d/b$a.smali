.class public final Lkik/android/d/b$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/d/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field private static final synthetic e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v0, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 20
    sput v3, Lkik/android/d/b$a;->a:I

    .line 21
    sput v4, Lkik/android/d/b$a;->b:I

    .line 22
    sput v5, Lkik/android/d/b$a;->c:I

    .line 23
    sput v0, Lkik/android/d/b$a;->d:I

    .line 18
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lkik/android/d/b$a;->a:I

    aput v2, v0, v1

    sget v1, Lkik/android/d/b$a;->b:I

    aput v1, v0, v3

    sget v1, Lkik/android/d/b$a;->c:I

    aput v1, v0, v4

    sget v1, Lkik/android/d/b$a;->d:I

    aput v1, v0, v5

    sput-object v0, Lkik/android/d/b$a;->e:[I

    return-void
.end method
