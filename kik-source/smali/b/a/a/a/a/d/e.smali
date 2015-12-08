.class final Lb/a/a/a/a/d/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lb/a/a/a/a/d/d;


# direct methods
.method constructor <init>(Lb/a/a/a/a/d/d;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lb/a/a/a/a/d/e;->a:Lb/a/a/a/a/d/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .prologue
    .line 202
    check-cast p1, Lb/a/a/a/a/d/d$a;

    check-cast p2, Lb/a/a/a/a/d/d$a;

    iget-wide v0, p1, Lb/a/a/a/a/d/d$a;->b:J

    iget-wide v2, p2, Lb/a/a/a/a/d/d$a;->b:J

    sub-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
