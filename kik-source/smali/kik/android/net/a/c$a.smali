.class final Lkik/android/net/a/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/net/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
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

    .line 94
    sput v3, Lkik/android/net/a/c$a;->a:I

    sput v4, Lkik/android/net/a/c$a;->b:I

    sput v0, Lkik/android/net/a/c$a;->c:I

    .line 93
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lkik/android/net/a/c$a;->a:I

    aput v2, v0, v1

    sget v1, Lkik/android/net/a/c$a;->b:I

    aput v1, v0, v3

    sget v1, Lkik/android/net/a/c$a;->c:I

    aput v1, v0, v4

    sput-object v0, Lkik/android/net/a/c$a;->d:[I

    return-void
.end method
