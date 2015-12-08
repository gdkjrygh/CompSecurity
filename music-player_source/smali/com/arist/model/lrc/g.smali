.class final Lcom/arist/model/lrc/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/f;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/f;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/g;->a:Lcom/arist/model/lrc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lcom/arist/model/lrc/h;

    check-cast p2, Lcom/arist/model/lrc/h;

    invoke-virtual {p1}, Lcom/arist/model/lrc/h;->a()D

    move-result-wide v0

    invoke-virtual {p2}, Lcom/arist/model/lrc/h;->a()D

    move-result-wide v2

    sub-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method
