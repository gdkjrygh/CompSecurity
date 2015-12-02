.class public Landroid/support/v4/view/n;
.super Ljava/lang/Object;
.source "KeyEventCompat.java"


# static fields
.field static final a:Landroid/support/v4/view/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 118
    new-instance v0, Landroid/support/v4/view/p;

    invoke-direct {v0}, Landroid/support/v4/view/p;-><init>()V

    sput-object v0, Landroid/support/v4/view/n;->a:Landroid/support/v4/view/q;

    .line 122
    :goto_0
    return-void

    .line 120
    :cond_0
    new-instance v0, Landroid/support/v4/view/o;

    invoke-direct {v0}, Landroid/support/v4/view/o;-><init>()V

    sput-object v0, Landroid/support/v4/view/n;->a:Landroid/support/v4/view/q;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    return-void
.end method

.method public static a(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 143
    sget-object v0, Landroid/support/v4/view/n;->a:Landroid/support/v4/view/q;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/support/v4/view/q;->b(I)Z

    move-result v0

    return v0
.end method

.method public static a(Landroid/view/KeyEvent;I)Z
    .locals 2

    .prologue
    .line 139
    sget-object v0, Landroid/support/v4/view/n;->a:Landroid/support/v4/view/q;

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v1

    invoke-interface {v0, v1, p1}, Landroid/support/v4/view/q;->a(II)Z

    move-result v0

    return v0
.end method
