.class public final Landroid/support/v4/app/z;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/v4/app/af;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/app/ak;

    invoke-direct {v0}, Landroid/support/v4/app/ak;-><init>()V

    sput-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    :goto_0
    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    new-instance v0, Landroid/support/v4/app/aj;

    invoke-direct {v0}, Landroid/support/v4/app/aj;-><init>()V

    sput-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    goto :goto_0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_2

    new-instance v0, Landroid/support/v4/app/ai;

    invoke-direct {v0}, Landroid/support/v4/app/ai;-><init>()V

    sput-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    goto :goto_0

    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_3

    new-instance v0, Landroid/support/v4/app/ah;

    invoke-direct {v0}, Landroid/support/v4/app/ah;-><init>()V

    sput-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    goto :goto_0

    :cond_3
    new-instance v0, Landroid/support/v4/app/ag;

    invoke-direct {v0}, Landroid/support/v4/app/ag;-><init>()V

    sput-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    goto :goto_0
.end method

.method static synthetic a()Landroid/support/v4/app/af;
    .locals 1

    sget-object v0, Landroid/support/v4/app/z;->a:Landroid/support/v4/app/af;

    return-object v0
.end method
