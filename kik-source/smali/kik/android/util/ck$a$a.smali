.class public final Lkik/android/util/ck$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/ck$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


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

    .line 91
    sput v3, Lkik/android/util/ck$a$a;->a:I

    sput v4, Lkik/android/util/ck$a$a;->b:I

    sput v0, Lkik/android/util/ck$a$a;->c:I

    .line 90
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lkik/android/util/ck$a$a;->a:I

    aput v2, v0, v1

    sget v1, Lkik/android/util/ck$a$a;->b:I

    aput v1, v0, v3

    sget v1, Lkik/android/util/ck$a$a;->c:I

    aput v1, v0, v4

    sput-object v0, Lkik/android/util/ck$a$a;->d:[I

    return-void
.end method
