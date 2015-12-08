.class final La/a/a/a/a/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "La/a/a/a/a/d/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/a/a/a/a/d/d;


# direct methods
.method constructor <init>(La/a/a/a/a/d/d;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, La/a/a/a/a/d/e;->a:La/a/a/a/a/d/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 208
    check-cast p1, La/a/a/a/a/d/f;

    check-cast p2, La/a/a/a/a/d/f;

    .line 1211
    iget-wide v0, p1, La/a/a/a/a/d/f;->b:J

    iget-wide v2, p2, La/a/a/a/a/d/f;->b:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    .line 208
    return v0
.end method
