.class Landroid/support/v4/view/ah;
.super Landroid/support/v4/view/ag;
.source "ViewCompat.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0}, Landroid/support/v4/view/ag;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroid/support/v4/view/a;)V
    .locals 1

    .prologue
    .line 182
    invoke-virtual {p2}, Landroid/support/v4/view/a;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/support/v4/view/am;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 183
    return-void
.end method

.method public a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 162
    invoke-static {p1, p2}, Landroid/support/v4/view/am;->a(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method
