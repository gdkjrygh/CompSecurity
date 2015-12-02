.class Landroid/support/v4/view/s$d;
.super Landroid/support/v4/view/s$c;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 669
    invoke-direct {p0}, Landroid/support/v4/view/s$c;-><init>()V

    return-void
.end method


# virtual methods
.method a()J
    .locals 2

    .prologue
    .line 672
    invoke-static {}, Landroid/support/v4/view/v;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 680
    invoke-static {p1, p2, p3}, Landroid/support/v4/view/v;->a(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 681
    return-void
.end method

.method public a(Landroid/view/View;Landroid/graphics/Paint;)V
    .locals 1

    .prologue
    .line 690
    invoke-virtual {p0, p1}, Landroid/support/v4/view/s$d;->d(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0, p1, v0, p2}, Landroid/support/v4/view/s$d;->a(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 692
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 693
    return-void
.end method

.method public d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 684
    invoke-static {p1}, Landroid/support/v4/view/v;->a(Landroid/view/View;)I

    move-result v0

    return v0
.end method
