.class final Lcrittercism/android/cs$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcrittercism/android/cs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Z

.field b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcrittercism/android/cs$a;-><init>(B)V

    .line 38
    return-void
.end method

.method private constructor <init>(B)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-boolean v0, p0, Lcrittercism/android/cs$a;->a:Z

    .line 34
    iput v0, p0, Lcrittercism/android/cs$a;->b:I

    .line 42
    iput-boolean v0, p0, Lcrittercism/android/cs$a;->a:Z

    .line 43
    iput v0, p0, Lcrittercism/android/cs$a;->b:I

    .line 44
    return-void
.end method
