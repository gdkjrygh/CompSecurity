.class final Lkik/android/util/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/util/v$a;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;II)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 120
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    move v0, v1

    .line 134
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 126
    :goto_1
    if-ge p2, p3, :cond_2

    .line 127
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 128
    add-int/lit8 v0, v0, 0x1

    .line 129
    const/4 v2, 0x5

    if-lt v0, v2, :cond_1

    .line 130
    const/4 v0, 0x1

    goto :goto_0

    .line 126
    :cond_1
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 134
    goto :goto_0
.end method
