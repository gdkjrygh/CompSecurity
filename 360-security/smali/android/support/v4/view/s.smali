.class public Landroid/support/v4/view/s;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/s$h;,
        Landroid/support/v4/view/s$g;,
        Landroid/support/v4/view/s$f;,
        Landroid/support/v4/view/s$e;,
        Landroid/support/v4/view/s$d;,
        Landroid/support/v4/view/s$c;,
        Landroid/support/v4/view/s$b;,
        Landroid/support/v4/view/s$a;,
        Landroid/support/v4/view/s$i;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/view/s$i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 981
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 982
    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 983
    new-instance v0, Landroid/support/v4/view/s$h;

    invoke-direct {v0}, Landroid/support/v4/view/s$h;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    .line 997
    :goto_0
    return-void

    .line 984
    :cond_0
    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 985
    new-instance v0, Landroid/support/v4/view/s$g;

    invoke-direct {v0}, Landroid/support/v4/view/s$g;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0

    .line 986
    :cond_1
    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 987
    new-instance v0, Landroid/support/v4/view/s$f;

    invoke-direct {v0}, Landroid/support/v4/view/s$f;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0

    .line 988
    :cond_2
    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 989
    new-instance v0, Landroid/support/v4/view/s$e;

    invoke-direct {v0}, Landroid/support/v4/view/s$e;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0

    .line 990
    :cond_3
    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 991
    new-instance v0, Landroid/support/v4/view/s$d;

    invoke-direct {v0}, Landroid/support/v4/view/s$d;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0

    .line 992
    :cond_4
    const/16 v1, 0x9

    if-lt v0, v1, :cond_5

    .line 993
    new-instance v0, Landroid/support/v4/view/s$c;

    invoke-direct {v0}, Landroid/support/v4/view/s$c;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0

    .line 995
    :cond_5
    new-instance v0, Landroid/support/v4/view/s$a;

    invoke-direct {v0}, Landroid/support/v4/view/s$a;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    goto :goto_0
.end method

.method public static a(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1032
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    .prologue
    .line 1223
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;IIII)V

    .line 1224
    return-void
.end method

.method public static a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 1

    .prologue
    .line 1395
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 1396
    return-void
.end method

.method public static a(Landroid/view/View;Landroid/graphics/Paint;)V
    .locals 1

    .prologue
    .line 1472
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;Landroid/graphics/Paint;)V

    .line 1473
    return-void
.end method

.method public static a(Landroid/view/View;Landroid/support/v4/view/a;)V
    .locals 1

    .prologue
    .line 1169
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;Landroid/support/v4/view/a;)V

    .line 1170
    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 1237
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1238
    return-void
.end method

.method public static a(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 1007
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->a(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1205
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->b(Landroid/view/View;)V

    .line 1206
    return-void
.end method

.method public static b(Landroid/view/View;I)Z
    .locals 1

    .prologue
    .line 1018
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->b(Landroid/view/View;I)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1272
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->c(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1296
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/s$i;->c(Landroid/view/View;I)V

    .line 1297
    return-void
.end method

.method public static d(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1416
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->d(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1487
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->e(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public static f(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 1519
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->f(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object v0

    return-object v0
.end method

.method public static g(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1532
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/s$i;

    invoke-interface {v0, p0}, Landroid/support/v4/view/s$i;->g(Landroid/view/View;)Z

    move-result v0

    return v0
.end method
