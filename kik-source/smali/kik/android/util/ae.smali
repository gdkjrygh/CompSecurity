.class public final Lkik/android/util/ae;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 3

    .prologue
    const v2, 0x7f09010d

    .line 28
    if-nez p0, :cond_0

    .line 29
    const/4 v0, 0x0

    .line 44
    :goto_0
    return-object v0

    .line 31
    :cond_0
    const-string v0, "com.kik.ext.camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 32
    const v0, 0x7f09005f

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 34
    :cond_1
    const-string v0, "com.kik.ext.gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 35
    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 37
    :cond_2
    const-string v0, "com.kik.ext.video-camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 38
    const v0, 0x7f090359

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 40
    :cond_3
    const-string v0, "com.kik.ext.video-gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 41
    invoke-static {v2}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 44
    :cond_4
    const-string v0, "app-name"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public static b(Lkik/a/d/a/a;)Z
    .locals 2

    .prologue
    .line 55
    if-nez p0, :cond_0

    .line 56
    const/4 v0, 0x0

    .line 63
    :goto_0
    return v0

    .line 58
    :cond_0
    invoke-virtual {p0}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v0

    .line 59
    sget-object v1, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    if-ne v0, v1, :cond_1

    .line 61
    invoke-static {p0}, Lcom/kik/view/adapters/h;->c(Lkik/a/d/a/a;)Z

    move-result v0

    goto :goto_0

    .line 63
    :cond_1
    const-string v0, "overlay"

    const-string v1, "attribution"

    invoke-virtual {p0, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public static c(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 73
    if-nez p0, :cond_1

    .line 74
    const/4 v0, 0x0

    .line 109
    :cond_0
    :goto_0
    return-object v0

    .line 76
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v0

    .line 79
    const-string v1, "com.kik.ext.camera"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 80
    const-string v0, "Camera"

    goto :goto_0

    .line 82
    :cond_2
    const-string v1, "com.kik.ext.gallery"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 83
    const-string v0, "Gallery"

    goto :goto_0

    .line 85
    :cond_3
    const-string v1, "com.kik.ext.video-camera"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 86
    const-string v0, "Video Camera"

    goto :goto_0

    .line 88
    :cond_4
    const-string v1, "com.kik.ext.video-gallery"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 89
    const-string v0, "Video Gallery"

    goto :goto_0

    .line 91
    :cond_5
    const-string v1, "com.kik.ext.gif"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 92
    const-string v0, "GIF"

    goto :goto_0

    .line 94
    :cond_6
    const-string v1, "com.kik.cards"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 95
    const-string v1, "Card"

    .line 96
    invoke-virtual {p0}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 99
    const-string v0, "Web"

    goto :goto_0

    .line 102
    :cond_7
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 104
    const-string v2, "https://stickers.kik.com/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 105
    const-string v0, "Sticker"

    goto :goto_0

    :cond_8
    move-object v0, v1

    goto :goto_0
.end method

.method public static d(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 114
    if-nez p0, :cond_1

    .line 126
    :cond_0
    :goto_0
    return-object v0

    .line 117
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    .line 119
    const-string v2, "com.kik.cards"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 120
    invoke-virtual {p0}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method
