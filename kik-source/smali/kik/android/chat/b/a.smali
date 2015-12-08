.class public final Lkik/android/chat/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/chat/b/a$a;
    }
.end annotation


# direct methods
.method public static a()I
    .locals 2

    .prologue
    .line 44
    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget v0, v0, Lkik/android/chat/b/a$a;->q:I

    return v0
.end method

.method public static a(Lcom/kik/scan/KikCode;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 16
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/kik/scan/KikCode;->getColour()I

    move-result v0

    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 17
    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/scan/KikCode;->getColour()I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Lkik/android/chat/b/a$a;->r:Ljava/lang/String;

    .line 19
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Lcom/kik/scan/KikCode;)I
    .locals 2

    .prologue
    .line 24
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/kik/scan/KikCode;->getColour()I

    move-result v0

    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 25
    invoke-static {}, Lkik/android/chat/b/a$a;->values()[Lkik/android/chat/b/a$a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/kik/scan/KikCode;->getColour()I

    move-result v1

    aget-object v0, v0, v1

    iget v0, v0, Lkik/android/chat/b/a$a;->q:I

    .line 28
    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lkik/android/chat/b/a;->a()I

    move-result v0

    goto :goto_0
.end method
