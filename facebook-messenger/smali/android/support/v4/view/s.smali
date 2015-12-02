.class public Landroid/support/v4/view/s;
.super Ljava/lang/Object;
.source "MotionEventCompat.java"


# static fields
.field static final a:Landroid/support/v4/view/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 99
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    .line 100
    new-instance v0, Landroid/support/v4/view/u;

    invoke-direct {v0}, Landroid/support/v4/view/u;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    .line 104
    :goto_0
    return-void

    .line 102
    :cond_0
    new-instance v0, Landroid/support/v4/view/t;

    invoke-direct {v0}, Landroid/support/v4/view/t;-><init>()V

    sput-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    return-void
.end method

.method public static a(Landroid/view/MotionEvent;)I
    .locals 2

    .prologue
    .line 182
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public static a(Landroid/view/MotionEvent;I)I
    .locals 1

    .prologue
    .line 192
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->a(Landroid/view/MotionEvent;I)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/view/MotionEvent;I)I
    .locals 1

    .prologue
    .line 201
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->b(Landroid/view/MotionEvent;I)I

    move-result v0

    return v0
.end method

.method public static c(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 210
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->c(Landroid/view/MotionEvent;I)F

    move-result v0

    return v0
.end method

.method public static d(Landroid/view/MotionEvent;I)F
    .locals 1

    .prologue
    .line 219
    sget-object v0, Landroid/support/v4/view/s;->a:Landroid/support/v4/view/v;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/v;->d(Landroid/view/MotionEvent;I)F

    move-result v0

    return v0
.end method
