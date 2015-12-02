.class public Landroid/support/v4/view/y;
.super Ljava/lang/Object;
.source "VelocityTrackerCompat.java"


# static fields
.field static final a:Landroid/support/v4/view/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 67
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 68
    new-instance v0, Landroid/support/v4/view/aa;

    invoke-direct {v0}, Landroid/support/v4/view/aa;-><init>()V

    sput-object v0, Landroid/support/v4/view/y;->a:Landroid/support/v4/view/ab;

    .line 72
    :goto_0
    return-void

    .line 70
    :cond_0
    new-instance v0, Landroid/support/v4/view/z;

    invoke-direct {v0}, Landroid/support/v4/view/z;-><init>()V

    sput-object v0, Landroid/support/v4/view/y;->a:Landroid/support/v4/view/ab;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    return-void
.end method

.method public static a(Landroid/view/VelocityTracker;I)F
    .locals 1

    .prologue
    .line 82
    sget-object v0, Landroid/support/v4/view/y;->a:Landroid/support/v4/view/ab;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ab;->a(Landroid/view/VelocityTracker;I)F

    move-result v0

    return v0
.end method
