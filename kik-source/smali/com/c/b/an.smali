.class public abstract Lcom/c/b/an;
.super Lcom/c/b/ao;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/an$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/c/b/ao;-><init>()V

    .line 68
    return-void
.end method


# virtual methods
.method public abstract a()Lcom/c/b/ak$f;
.end method

.method protected b()I
    .locals 1

    .prologue
    .line 62
    sget v0, Lcom/c/b/an$a;->a:I

    return v0
.end method
