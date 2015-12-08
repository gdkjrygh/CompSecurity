.class public final Lb/a/fk;
.super Ljava/lang/Object;


# direct methods
.method public static final a(BI)Z
    .locals 2

    const/4 v0, 0x1

    shl-int v1, v0, p1

    and-int/2addr v1, p0

    if-eqz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
