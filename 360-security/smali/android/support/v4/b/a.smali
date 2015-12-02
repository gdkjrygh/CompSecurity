.class public Landroid/support/v4/b/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/b/a$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/support/v4/b/b;)Landroid/os/Parcelable$Creator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/support/v4/b/b",
            "<TT;>;)",
            "Landroid/os/Parcelable$Creator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 36
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-lt v0, v1, :cond_0

    .line 37
    invoke-static {p0}, Landroid/support/v4/b/d;->a(Landroid/support/v4/b/b;)Landroid/os/Parcelable$Creator;

    .line 39
    :cond_0
    new-instance v0, Landroid/support/v4/b/a$a;

    invoke-direct {v0, p0}, Landroid/support/v4/b/a$a;-><init>(Landroid/support/v4/b/b;)V

    return-object v0
.end method
