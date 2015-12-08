.class final Lcom/a/a/c/at$a;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Lcom/a/a/c/at$f;Lcom/a/a/c/at$i;)V
    .locals 3

    .prologue
    .line 243
    const/4 v0, 0x3

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/a/a/c/at$h;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 244
    return-void
.end method
