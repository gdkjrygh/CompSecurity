.class public final Lcom/github/ksoichiro/android/observablescrollview/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field private static final synthetic d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v0, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 27
    sput v3, Lcom/github/ksoichiro/android/observablescrollview/n;->a:I

    .line 32
    sput v4, Lcom/github/ksoichiro/android/observablescrollview/n;->b:I

    .line 37
    sput v0, Lcom/github/ksoichiro/android/observablescrollview/n;->c:I

    .line 22
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/github/ksoichiro/android/observablescrollview/n;->a:I

    aput v2, v0, v1

    sget v1, Lcom/github/ksoichiro/android/observablescrollview/n;->b:I

    aput v1, v0, v3

    sget v1, Lcom/github/ksoichiro/android/observablescrollview/n;->c:I

    aput v1, v0, v4

    sput-object v0, Lcom/github/ksoichiro/android/observablescrollview/n;->d:[I

    return-void
.end method
