.class final Lkik/a/f/f/ah$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/f/f/ah;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/f/f/ah;


# direct methods
.method private constructor <init>(Lkik/a/f/f/ah;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lkik/a/f/f/ah$a;->a:Lkik/a/f/f/ah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/a/f/f/ah;B)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lkik/a/f/f/ah$a;-><init>(Lkik/a/f/f/ah;)V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .prologue
    .line 63
    check-cast p1, Lkik/a/f/c/c;

    check-cast p2, Lkik/a/f/c/c;

    invoke-virtual {p1}, Lkik/a/f/c/c;->k()J

    move-result-wide v0

    invoke-virtual {p2}, Lkik/a/f/c/c;->k()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method
