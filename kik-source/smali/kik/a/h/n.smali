.class public final Lkik/a/h/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 19
    :try_start_0
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 22
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
