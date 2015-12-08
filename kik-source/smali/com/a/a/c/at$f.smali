.class final Lcom/a/a/c/at$f;
.super Lcom/a/a/c/at$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/at;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "f"
.end annotation


# direct methods
.method public constructor <init>(Lcom/a/a/c/at$j;Lcom/a/a/c/at$i;Lcom/a/a/c/at$i;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 256
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/a/a/c/at$h;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    aput-object p1, v0, v2

    const/4 v1, 0x2

    aput-object p3, v0, v1

    invoke-direct {p0, v2, v0}, Lcom/a/a/c/at$h;-><init>(I[Lcom/a/a/c/at$h;)V

    .line 257
    return-void
.end method
