.class public final Lcom/kik/sdkutils/y;
.super Landroid/os/Build$VERSION_CODES;
.source "SourceFile"


# static fields
.field private static a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    sput v0, Lcom/kik/sdkutils/y;->a:I

    .line 19
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lcom/kik/sdkutils/y;->a:I

    .line 20
    return-void
.end method

.method public static a(I)Z
    .locals 1

    .prologue
    .line 24
    sget v0, Lcom/kik/sdkutils/y;->a:I

    if-lt v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(I)Z
    .locals 1

    .prologue
    .line 29
    sget v0, Lcom/kik/sdkutils/y;->a:I

    if-ge v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c(I)Z
    .locals 1

    .prologue
    .line 39
    sget v0, Lcom/kik/sdkutils/y;->a:I

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
