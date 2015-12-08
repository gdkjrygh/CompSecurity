.class public final Landroid/support/v4/view/bb;
.super Ljava/lang/Object;


# static fields
.field static final a:Landroid/support/v4/view/be;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/view/bf;

    invoke-direct {v0}, Landroid/support/v4/view/bf;-><init>()V

    sput-object v0, Landroid/support/v4/view/bb;->a:Landroid/support/v4/view/be;

    :goto_0
    return-void

    :cond_0
    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/view/bd;

    invoke-direct {v0}, Landroid/support/v4/view/bd;-><init>()V

    sput-object v0, Landroid/support/v4/view/bb;->a:Landroid/support/v4/view/be;

    goto :goto_0

    :cond_1
    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/view/bc;

    invoke-direct {v0}, Landroid/support/v4/view/bc;-><init>()V

    sput-object v0, Landroid/support/v4/view/bb;->a:Landroid/support/v4/view/be;

    goto :goto_0

    :cond_2
    new-instance v0, Landroid/support/v4/view/bg;

    invoke-direct {v0}, Landroid/support/v4/view/bg;-><init>()V

    sput-object v0, Landroid/support/v4/view/bb;->a:Landroid/support/v4/view/be;

    goto :goto_0
.end method

.method public static a(Landroid/view/ViewGroup;)V
    .locals 1

    sget-object v0, Landroid/support/v4/view/bb;->a:Landroid/support/v4/view/be;

    invoke-interface {v0, p0}, Landroid/support/v4/view/be;->a(Landroid/view/ViewGroup;)V

    return-void
.end method
