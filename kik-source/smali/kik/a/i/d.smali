.class final Lkik/a/i/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lkik/a/i/b;


# direct methods
.method constructor <init>(Lkik/a/i/b;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lkik/a/i/d;->a:Lkik/a/i/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 121
    check-cast p1, Lkik/a/i/h$a;

    check-cast p2, Lkik/a/i/h$a;

    invoke-virtual {p2}, Lkik/a/i/h$a;->e()J

    move-result-wide v0

    invoke-virtual {p1}, Lkik/a/i/h$a;->e()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method
